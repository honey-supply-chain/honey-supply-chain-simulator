package h.burgenland.simulator.common;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Converts an IPFS CIDv0 (base58-encoded multihash: 0x12 sha2-256, 0x20 length, 32-byte digest)
 * into the bare 32-byte digest stored on-chain as bytes32 — see
 * honey-supply-chain/docs/GasOptimierungIteration2.md Punkt 1.
 */
public final class CidEncoding {

    private static final String BASE58_ALPHABET = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
    private static final byte[] CIDV0_PREFIX = { 0x12, 0x20 };

    private CidEncoding() {
    }

    public static byte[] toBytes32(String cidV0) {
        if (cidV0 == null || cidV0.isEmpty()) {
            return new byte[32];
        }
        byte[] decoded = base58Decode(cidV0);
        if (decoded.length != 34 || decoded[0] != CIDV0_PREFIX[0] || decoded[1] != CIDV0_PREFIX[1]) {
            throw new IllegalArgumentException("Not a CIDv0 (sha2-256) CID: " + cidV0);
        }
        return Arrays.copyOfRange(decoded, 2, 34);
    }

    private static byte[] base58Decode(String input) {
        int leadingZeros = 0;
        while (leadingZeros < input.length() && input.charAt(leadingZeros) == '1') {
            leadingZeros++;
        }

        BigInteger value = BigInteger.ZERO;
        BigInteger base = BigInteger.valueOf(58);
        for (int i = 0; i < input.length(); i++) {
            int digit = BASE58_ALPHABET.indexOf(input.charAt(i));
            if (digit < 0) {
                throw new IllegalArgumentException("Invalid base58 character: " + input.charAt(i));
            }
            value = value.multiply(base).add(BigInteger.valueOf(digit));
        }

        byte[] body;
        if (value.equals(BigInteger.ZERO)) {
            body = new byte[0];
        } else {
            byte[] bigEndianBytes = value.toByteArray();
            int start = (bigEndianBytes.length > 1 && bigEndianBytes[0] == 0) ? 1 : 0;
            body = Arrays.copyOfRange(bigEndianBytes, start, bigEndianBytes.length);
        }

        byte[] result = new byte[leadingZeros + body.length];
        System.arraycopy(body, 0, result, leadingZeros, body.length);
        return result;
    }
}

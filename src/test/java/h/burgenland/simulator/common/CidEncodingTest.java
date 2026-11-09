package h.burgenland.simulator.common;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CidEncodingTest {

    @Test
    void decodesAKnownCidV0ToItsSha256Digest() {
        byte[] bytes32 = CidEncoding.toBytes32("QmXoypizjW3WknFiJnKLwHCnL72vedxjQkDDP1mXWo6uco");
        assertEquals(32, bytes32.length);
        assertEquals(
                "8cb97a00a6c90a14ecf182d8363583d402f69919e38f0498edd9d92a5c02a7b4",
                new BigInteger(1, bytes32).toString(16));
    }

    @Test
    void returnsThirtyTwoZeroBytesForAnEmptyCid() {
        assertArrayEquals(new byte[32], CidEncoding.toBytes32(""));
        assertArrayEquals(new byte[32], CidEncoding.toBytes32(null));
    }

    @Test
    void rejectsAStringThatIsNotACidV0() {
        assertThrows(IllegalArgumentException.class, () -> CidEncoding.toBytes32("not-a-cid"));
    }
}

package h.burgenland.simulator.web3.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/LFDT-web3j/web3j/tree/main/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 5.0.2.
 */
@SuppressWarnings("rawtypes")
@Generated("org.web3j.codegen.SolidityFunctionWrapperGenerator")
public class PricingModel extends Contract {
    public static final String BINARY = "0x6080604052348015600e575f5ffd5b506040516109dc3803806109dc833981016040819052602b91607b565b5f80546001600160a01b039485166001600160a01b031991821617909155600180549390941692169190911790915560025560af565b80516001600160a01b03811681146076575f5ffd5b919050565b5f5f5f60608486031215608c575f5ffd5b6093846061565b9250609f602085016061565b9150604084015190509250925092565b610920806100bc5f395ff3fe608060405234801561000f575f5ffd5b506004361061009b575f3560e01c8063c413944111610063578063c41394411461011f578063d561183b14610132578063db1d0fd51461015d578063eae7b93514610166578063eb86fbdf14610178575f5ffd5b80630c17d42c1461009f57806321b52519146100b457806334b17909146100da578063a893e326146100ed578063c218613d1461010c575b5f5ffd5b6100b26100ad36600461074a565b61018b565b005b6100c76100c2366004610779565b6102c5565b6040519081526020015b60405180910390f35b6100c76100e8366004610779565b6102d9565b6100c76100fb3660046107a3565b60036020525f908152604090205481565b6100c761011a3660046107bc565b6103a2565b6100c761012d366004610779565b61042d565b600154610145906001600160a01b031681565b6040516001600160a01b0390911681526020016100d1565b6100c760025481565b5f54610145906001600160a01b031681565b6100b26101863660046107ee565b61056e565b5f5f9054906101000a90046001600160a01b03166001600160a01b031663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa1580156101da573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906101fe9190610816565b5f54604051632474521560e21b8152600481018390523360248201526001600160a01b03909116906391d1485490604401602060405180830381865afa15801561024a573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061026e919061083c565b6102bf5760405162461bcd60e51b815260206004820152601a60248201527f50726963696e674d6f64656c3a206d697373696e6720726f6c6500000000000060448201526064015b60405180910390fd5b50600255565b5f6102d0838361042d565b90505b92915050565b63ffffffff81165f90815260036020526040812054806103565760405162461bcd60e51b815260206004820152603260248201527f50726963696e674d6f64656c3a206e6f20666c6f6f722070726963652073657460448201527120666f722074686973206a61722073697a6560701b60648201526084016102b6565b61036261271080610869565b846002546103709190610869565b61037c61271080610869565b6103869190610880565b6103909083610869565b61039a9190610893565b949350505050565b60015460405163a8f9714760e01b815260048101859052602481018490525f9182916001600160a01b039091169063a8f9714790604401602060405180830381865afa1580156103f4573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906104189190610816565b905061042481846102d9565b95945050505050565b600154604051631742108b60e01b8152600481018490525f9182916001600160a01b0390911690631742108b906024016040805180830381865afa158015610477573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061049b91906108b2565b509050806104f75760405162461bcd60e51b815260206004820152602360248201527f50726963696e674d6f64656c3a206261746368206973206e6f742073656c6c61604482015262626c6560e81b60648201526084016102b6565b6001546040516336279fb760e11b8152600481018690525f916001600160a01b031690636c4f3f6e90602401602060405180830381865afa15801561053e573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906105629190610816565b905061042481856102d9565b5f5f9054906101000a90046001600160a01b03166001600160a01b031663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa1580156105bd573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906105e19190610816565b5f54604051632474521560e21b8152600481018390523360248201526001600160a01b03909116906391d1485490604401602060405180830381865afa15801561062d573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610651919061083c565b61069d5760405162461bcd60e51b815260206004820152601a60248201527f50726963696e674d6f64656c3a206d697373696e6720726f6c6500000000000060448201526064016102b6565b6106a683610716565b6106fd5760405162461bcd60e51b815260206004820152602260248201527f50726963696e674d6f64656c3a20756e737570706f72746564206a61722073696044820152617a6560f01b60648201526084016102b6565b5063ffffffff9091165f90815260036020526040902055565b5f63ffffffff82166103e81480610734575063ffffffff82166101f4145b806102d3575063ffffffff821660fa1492915050565b5f6020828403121561075a575f5ffd5b5035919050565b803563ffffffff81168114610774575f5ffd5b919050565b5f5f6040838503121561078a575f5ffd5b8235915061079a60208401610761565b90509250929050565b5f602082840312156107b3575f5ffd5b6102d082610761565b5f5f5f606084860312156107ce575f5ffd5b83359250602084013591506107e560408501610761565b90509250925092565b5f5f604083850312156107ff575f5ffd5b61080883610761565b946020939093013593505050565b5f60208284031215610826575f5ffd5b5051919050565b80518015158114610774575f5ffd5b5f6020828403121561084c575f5ffd5b6102d08261082d565b634e487b7160e01b5f52601160045260245ffd5b80820281158282048414176102d3576102d3610855565b808201808211156102d3576102d3610855565b5f826108ad57634e487b7160e01b5f52601260045260245ffd5b500490565b5f5f604083850312156108c3575f5ffd5b6108cc8361082d565b91506020830151600381106108df575f5ffd5b80915050925092905056fea26469706673582212207922dab73f8018c5a079b012fe71c8b61d9c08ec3721cbb42f106b03f35de55064736f6c63430008220033";

    private static String librariesLinkedBinary;

    public static final String FUNC_ACTORREGISTRY = "actorRegistry";

    public static final String FUNC_ALPHA = "alpha";

    public static final String FUNC_CALCULATEPRICE = "calculatePrice";

    public static final String FUNC_CALCULATEPRICEFORPHQI = "calculatePriceForPHQI";

    public static final String FUNC_CALCULATEPRICEFORQI = "calculatePriceForQI";

    public static final String FUNC_FLOORPRICES = "floorPrices";

    public static final String FUNC_GETPRICE = "getPrice";

    public static final String FUNC_QUALITYINDEX = "qualityIndex";

    public static final String FUNC_SETALPHA = "setAlpha";

    public static final String FUNC_SETFLOORPRICE = "setFloorPrice";

    @Deprecated
    protected PricingModel(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected PricingModel(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected PricingModel(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected PricingModel(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> actorRegistry() {
        final Function function = new Function(FUNC_ACTORREGISTRY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> alpha() {
        final Function function = new Function(FUNC_ALPHA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> calculatePrice(BigInteger batchId,
            BigInteger jarSizeGrams) {
        final Function function = new Function(FUNC_CALCULATEPRICE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint32(jarSizeGrams)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> calculatePriceForPHQI(BigInteger batchId, BigInteger phqi,
            BigInteger jarSizeGrams) {
        final Function function = new Function(FUNC_CALCULATEPRICEFORPHQI, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint256(phqi), 
                new org.web3j.abi.datatypes.generated.Uint32(jarSizeGrams)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> calculatePriceForQI(BigInteger qi,
            BigInteger jarSizeGrams) {
        final Function function = new Function(FUNC_CALCULATEPRICEFORQI, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(qi), 
                new org.web3j.abi.datatypes.generated.Uint32(jarSizeGrams)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> floorPrices(BigInteger param0) {
        final Function function = new Function(FUNC_FLOORPRICES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint32(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> getPrice(BigInteger batchId, BigInteger jarSizeGrams) {
        final Function function = new Function(FUNC_GETPRICE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint32(jarSizeGrams)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> qualityIndex() {
        final Function function = new Function(FUNC_QUALITYINDEX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setAlpha(BigInteger newAlpha) {
        final Function function = new Function(
                FUNC_SETALPHA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(newAlpha)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setFloorPrice(BigInteger jarSizeGrams,
            BigInteger priceCents) {
        final Function function = new Function(
                FUNC_SETFLOORPRICE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint32(jarSizeGrams), 
                new org.web3j.abi.datatypes.generated.Uint256(priceCents)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static PricingModel load(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return new PricingModel(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static PricingModel load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new PricingModel(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static PricingModel load(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return new PricingModel(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static PricingModel load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new PricingModel(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<PricingModel> deploy(Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider, String actorRegistryAddress,
            String qualityIndexAddress, BigInteger initialAlpha) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress), 
                new org.web3j.abi.datatypes.generated.Uint256(initialAlpha)));
        return deployRemoteCall(PricingModel.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    public static RemoteCall<PricingModel> deploy(Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider,
            String actorRegistryAddress, String qualityIndexAddress, BigInteger initialAlpha) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress), 
                new org.web3j.abi.datatypes.generated.Uint256(initialAlpha)));
        return deployRemoteCall(PricingModel.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<PricingModel> deploy(Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit, String actorRegistryAddress,
            String qualityIndexAddress, BigInteger initialAlpha) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress), 
                new org.web3j.abi.datatypes.generated.Uint256(initialAlpha)));
        return deployRemoteCall(PricingModel.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<PricingModel> deploy(Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit,
            String actorRegistryAddress, String qualityIndexAddress, BigInteger initialAlpha) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress), 
                new org.web3j.abi.datatypes.generated.Uint256(initialAlpha)));
        return deployRemoteCall(PricingModel.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
    }

    public static void linkLibraries(List<Contract.LinkReference> references) {
        librariesLinkedBinary = linkBinaryWithReferences(BINARY, references);
    }

    private static String getDeploymentBinary() {
        if (librariesLinkedBinary != null) {
            return librariesLinkedBinary;
        } else {
            return BINARY;
        }
    }
}

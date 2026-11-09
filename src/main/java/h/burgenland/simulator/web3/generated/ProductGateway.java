package h.burgenland.simulator.web3.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.StaticStruct;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint16;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint32;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tuples.generated.Tuple5;
import org.web3j.tuples.generated.Tuple6;
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
public class ProductGateway extends Contract {
    public static final String BINARY = "0x608060405234801561000f575f5ffd5b50604051610d37380380610d3783398101604081905261002e916100aa565b5f80546001600160a01b03199081166001600160a01b0397881617909155600180548216958716959095179094556002805485169386169390931790925560038054841691851691909117905560048054909216921691909117905561010b565b80516001600160a01b03811681146100a5575f5ffd5b919050565b5f5f5f5f5f60a086880312156100be575f5ffd5b6100c78661008f565b94506100d56020870161008f565b93506100e36040870161008f565b92506100f16060870161008f565b91506100ff6080870161008f565b90509295509295909350565b610c1f806101185f395ff3fe608060405234801561000f575f5ffd5b50600436106100cb575f3560e01c806388d84b6611610088578063b09afec111610063578063b09afec1146101f3578063ca6aa0761461023b578063d561183b1461024e578063eae7b93514610261575f5ffd5b806388d84b66146101a8578063970ad861146101bb578063ad6d3137146101e0575f5ffd5b8063026520d4146100cf57806321b52519146100ff57806327124cb71461012057806329831f5d1461016d5780632f4a3c8d146101805780634879ef1414610195575b5f5ffd5b6004546100e2906001600160a01b031681565b6040516001600160a01b0390911681526020015b60405180910390f35b61011261010d366004610938565b610273565b6040519081526020016100f6565b61013361012e366004610966565b6102f3565b604080518351815260208085015161ffff1690820152928101516001600160a01b03908116918401919091521660608201526080016100f6565b6002546100e2906001600160a01b031681565b61019361018e366004610991565b610383565b005b6101936101a3366004610991565b6104ae565b6001546100e2906001600160a01b031681565b6101ce6101c9366004610966565b6105d0565b6040516100f6969594939291906109c8565b6101936101ee366004610991565b61065b565b610206610201366004610966565b61077d565b60408051958652931515602086015263ffffffff9092169284019290925260608301919091521515608082015260a0016100f6565b610193610249366004610991565b610802565b6003546100e2906001600160a01b031681565b5f546100e2906001600160a01b031681565b600480546040516321b5251960e01b815291820184905263ffffffff831660248301525f916001600160a01b03909116906321b5251990604401602060405180830381865afa1580156102c8573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906102ec9190610a0d565b9392505050565b604080516060810182525f8082526020820181905291810191909152600154604051632d62214160e11b8152600481018490525f916001600160a01b031690635ac4428290602401608060405180830381865afa158015610356573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061037a9190610a34565b91509150915091565b5f5f9054906101000a90046001600160a01b03166001600160a01b031663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa1580156103d2573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906103f69190610a0d565b5f54604051632474521560e21b8152600481018390523360248201526001600160a01b03909116906391d1485490604401602060405180830381865afa158015610442573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906104669190610ada565b61048b5760405162461bcd60e51b815260040161048290610af3565b60405180910390fd5b50600380546001600160a01b0319166001600160a01b0392909216919091179055565b5f5f9054906101000a90046001600160a01b03166001600160a01b031663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa1580156104fd573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906105219190610a0d565b5f54604051632474521560e21b8152600481018390523360248201526001600160a01b03909116906391d1485490604401602060405180830381865afa15801561056d573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906105919190610ada565b6105ad5760405162461bcd60e51b815260040161048290610af3565b50600280546001600160a01b0319166001600160a01b0392909216919091179055565b60035460405163970ad86160e01b8152600481018390525f91829182918291829182916001600160a01b039091169063970ad8619060240160c060405180830381865afa158015610623573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906106479190610b36565b949c939b5091995097509550909350915050565b5f5f9054906101000a90046001600160a01b03166001600160a01b031663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa1580156106aa573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906106ce9190610a0d565b5f54604051632474521560e21b8152600481018390523360248201526001600160a01b03909116906391d1485490604401602060405180830381865afa15801561071a573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061073e9190610ada565b61075a5760405162461bcd60e51b815260040161048290610af3565b50600180546001600160a01b0319166001600160a01b0392909216919091179055565b60025460405163b09afec160e01b8152600481018390525f9182918291829182916001600160a01b03169063b09afec19060240160a060405180830381865afa1580156107cc573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906107f09190610b93565b939a9299509097509550909350915050565b5f5f9054906101000a90046001600160a01b03166001600160a01b031663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa158015610851573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906108759190610a0d565b5f54604051632474521560e21b8152600481018390523360248201526001600160a01b03909116906391d1485490604401602060405180830381865afa1580156108c1573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906108e59190610ada565b6109015760405162461bcd60e51b815260040161048290610af3565b50600480546001600160a01b0319166001600160a01b0392909216919091179055565b63ffffffff81168114610935575f5ffd5b50565b5f5f60408385031215610949575f5ffd5b82359150602083013561095b81610924565b809150509250929050565b5f60208284031215610976575f5ffd5b5035919050565b6001600160a01b0381168114610935575f5ffd5b5f602082840312156109a1575f5ffd5b81356102ec8161097d565b6003811061093557634e487b7160e01b5f52602160045260245ffd5b5f60c0820190508782528660208301528560408301528460608301526109ed846109ac565b8360808301526109fc836109ac565b8260a0830152979650505050505050565b5f60208284031215610a1d575f5ffd5b5051919050565b8051610a2f8161097d565b919050565b5f5f8284036080811215610a46575f5ffd5b6060811215610a53575f5ffd5b506040516060810181811067ffffffffffffffff82111715610a8357634e487b7160e01b5f52604160045260245ffd5b60405283518152602084015161ffff81168114610a9e575f5ffd5b6020820152610aaf60408501610a24565b60408201529150610ac260608401610a24565b90509250929050565b80518015158114610a2f575f5ffd5b5f60208284031215610aea575f5ffd5b6102ec82610acb565b6020808252601c908201527f50726f64756374476174657761793a206d697373696e6720726f6c6500000000604082015260600190565b60038110610935575f5ffd5b5f5f5f5f5f5f60c08789031215610b4b575f5ffd5b86516020880151604089015160608a015160808b015193995091975095509350610b7481610b2a565b60a0880151909250610b8581610b2a565b809150509295509295509295565b5f5f5f5f5f60a08688031215610ba7575f5ffd5b85519450610bb760208701610acb565b93506040860151610bc781610924565b60608701519093509150610bdd60808701610acb565b9050929550929590935056fea264697066735822122073feacb4d4ef8003fe2b58073daf0e83ac8d387e231821c89fcf7897d0e5c80364736f6c63430008220033";

    private static String librariesLinkedBinary;

    public static final String FUNC_ACTORREGISTRY = "actorRegistry";

    public static final String FUNC_GETBATCHDATA = "getBatchData";

    public static final String FUNC_GETPRICE = "getPrice";

    public static final String FUNC_GETQUALITYDATA = "getQualityData";

    public static final String FUNC_GETTOKENDATA = "getTokenData";

    public static final String FUNC_HONEYTOKEN = "honeyToken";

    public static final String FUNC_PRICINGMODEL = "pricingModel";

    public static final String FUNC_QUALITYINDEX = "qualityIndex";

    public static final String FUNC_SETHONEYTOKEN = "setHoneyToken";

    public static final String FUNC_SETPRICINGMODEL = "setPricingModel";

    public static final String FUNC_SETQUALITYINDEX = "setQualityIndex";

    public static final String FUNC_SETSUPPLYCHAIN = "setSupplyChain";

    public static final String FUNC_SUPPLYCHAIN = "supplyChain";

    @Deprecated
    protected ProductGateway(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected ProductGateway(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected ProductGateway(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected ProductGateway(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> actorRegistry() {
        final Function function = new Function(FUNC_ACTORREGISTRY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Tuple2<Batch, String>> getBatchData(BigInteger batchId) {
        final Function function = new Function(FUNC_GETBATCHDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Batch>() {}, new TypeReference<Address>() {}));
        return new RemoteFunctionCall<Tuple2<Batch, String>>(function,
                new Callable<Tuple2<Batch, String>>() {
                    @Override
                    public Tuple2<Batch, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<Batch, String>(
                                (Batch) results.get(0), 
                                (String) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> getPrice(BigInteger batchId, BigInteger jarSizeGrams) {
        final Function function = new Function(FUNC_GETPRICE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint32(jarSizeGrams)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Tuple6<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>> getQualityData(
            BigInteger batchId) {
        final Function function = new Function(FUNC_GETQUALITYDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint8>() {}, new TypeReference<Uint8>() {}));
        return new RemoteFunctionCall<Tuple6<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>>(function,
                new Callable<Tuple6<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple6<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> call(
                            ) throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple6<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (BigInteger) results.get(4).getValue(), 
                                (BigInteger) results.get(5).getValue());
                    }
                });
    }

    public RemoteFunctionCall<Tuple5<BigInteger, Boolean, BigInteger, BigInteger, Boolean>> getTokenData(
            BigInteger tokenId) {
        final Function function = new Function(FUNC_GETTOKENDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(tokenId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}, new TypeReference<Uint32>() {}, new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
        return new RemoteFunctionCall<Tuple5<BigInteger, Boolean, BigInteger, BigInteger, Boolean>>(function,
                new Callable<Tuple5<BigInteger, Boolean, BigInteger, BigInteger, Boolean>>() {
                    @Override
                    public Tuple5<BigInteger, Boolean, BigInteger, BigInteger, Boolean> call()
                            throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple5<BigInteger, Boolean, BigInteger, BigInteger, Boolean>(
                                (BigInteger) results.get(0).getValue(), 
                                (Boolean) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (Boolean) results.get(4).getValue());
                    }
                });
    }

    public RemoteFunctionCall<String> honeyToken() {
        final Function function = new Function(FUNC_HONEYTOKEN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> pricingModel() {
        final Function function = new Function(FUNC_PRICINGMODEL, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> qualityIndex() {
        final Function function = new Function(FUNC_QUALITYINDEX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setHoneyToken(String honeyTokenAddress) {
        final Function function = new Function(
                FUNC_SETHONEYTOKEN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, honeyTokenAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setPricingModel(String pricingModelAddress) {
        final Function function = new Function(
                FUNC_SETPRICINGMODEL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, pricingModelAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setQualityIndex(String qualityIndexAddress) {
        final Function function = new Function(
                FUNC_SETQUALITYINDEX, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, qualityIndexAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setSupplyChain(String supplyChainAddress) {
        final Function function = new Function(
                FUNC_SETSUPPLYCHAIN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, supplyChainAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> supplyChain() {
        final Function function = new Function(FUNC_SUPPLYCHAIN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    @Deprecated
    public static ProductGateway load(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return new ProductGateway(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static ProductGateway load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ProductGateway(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static ProductGateway load(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return new ProductGateway(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ProductGateway load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new ProductGateway(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ProductGateway> deploy(Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider, String actorRegistryAddress,
            String supplyChainAddress, String honeyTokenAddress, String qualityIndexAddress,
            String pricingModelAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, supplyChainAddress), 
                new org.web3j.abi.datatypes.Address(160, honeyTokenAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress), 
                new org.web3j.abi.datatypes.Address(160, pricingModelAddress)));
        return deployRemoteCall(ProductGateway.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    public static RemoteCall<ProductGateway> deploy(Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider,
            String actorRegistryAddress, String supplyChainAddress, String honeyTokenAddress,
            String qualityIndexAddress, String pricingModelAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, supplyChainAddress), 
                new org.web3j.abi.datatypes.Address(160, honeyTokenAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress), 
                new org.web3j.abi.datatypes.Address(160, pricingModelAddress)));
        return deployRemoteCall(ProductGateway.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<ProductGateway> deploy(Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit, String actorRegistryAddress,
            String supplyChainAddress, String honeyTokenAddress, String qualityIndexAddress,
            String pricingModelAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, supplyChainAddress), 
                new org.web3j.abi.datatypes.Address(160, honeyTokenAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress), 
                new org.web3j.abi.datatypes.Address(160, pricingModelAddress)));
        return deployRemoteCall(ProductGateway.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<ProductGateway> deploy(Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit,
            String actorRegistryAddress, String supplyChainAddress, String honeyTokenAddress,
            String qualityIndexAddress, String pricingModelAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, supplyChainAddress), 
                new org.web3j.abi.datatypes.Address(160, honeyTokenAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress), 
                new org.web3j.abi.datatypes.Address(160, pricingModelAddress)));
        return deployRemoteCall(ProductGateway.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
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

    public static class Batch extends StaticStruct {
        public BigInteger quantity;

        public BigInteger harvestYear;

        public String beekeeper;

        public Batch(BigInteger quantity, BigInteger harvestYear, String beekeeper) {
            super(new org.web3j.abi.datatypes.generated.Uint256(quantity), 
                    new org.web3j.abi.datatypes.generated.Uint16(harvestYear), 
                    new org.web3j.abi.datatypes.Address(160, beekeeper));
            this.quantity = quantity;
            this.harvestYear = harvestYear;
            this.beekeeper = beekeeper;
        }

        public Batch(Uint256 quantity, Uint16 harvestYear, Address beekeeper) {
            super(quantity, harvestYear, beekeeper);
            this.quantity = quantity.getValue();
            this.harvestYear = harvestYear.getValue();
            this.beekeeper = beekeeper.getValue();
        }
    }
}

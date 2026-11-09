package h.burgenland.simulator.web3.generated;

import io.reactivex.Flowable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.StaticStruct;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint16;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tuples.generated.Tuple4;
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
public class QualityIndex extends Contract {
    public static final String BINARY = "0x6080604052348015600e575f5ffd5b506040516114da3803806114da833981016040819052602b91604e565b5f80546001600160a01b0319166001600160a01b03929092169190911790556079565b5f60208284031215605d575f5ffd5b81516001600160a01b03811681146072575f5ffd5b9392505050565b611454806100865f395ff3fe608060405234801561000f575f5ffd5b506004361061013d575f3560e01c8063808a12c5116100b4578063ad6d313711610079578063ad6d313714610376578063b20a5dbe14610389578063b9ca8d6c146103b8578063c9163e29146103da578063d93e1287146103ed578063eae7b9351461040c575f5ffd5b8063808a12c5146102e157806386e5e4c21461030057806388d84b6614610313578063970ad8611461033e578063a8f9714714610363575f5ffd5b80634f09fed0116101055780634f09fed0146102205780636217eefb146102415780636c4f3f6e1461025457806372538b27146102675780637b6592a0146102af5780637cf02687146102ce575f5ffd5b8063088dbdf4146101415780631322cbb1146101b65780631742108b146101d757806338140c71146101f85780634a22a0c11461020d575b5f5ffd5b61018361014f3660046110e6565b60036020525f908152604090205461ffff808216916201000081048216916401000000008204811691600160301b90041684565b6040805161ffff958616815293851660208501529184169183019190915290911660608201526080015b60405180910390f35b6101c96101c43660046110e6565b61041e565b6040519081526020016101ad565b6101ea6101e53660046110e6565b6104f1565b6040516101ad92919061112d565b61020b6102063660046110e6565b61052f565b005b61020b61021b36600461115b565b6105fb565b61023361022e3660046111a6565b6107b4565b6040516101ad9291906111c0565b61020b61024f36600461115b565b610899565b6101c96102623660046110e6565b6109d4565b6102946102753660046110e6565b60026020525f908152604090205461ffff808216916201000090041682565b6040805161ffff9384168152929091166020830152016101ad565b6101c96102bd3660046110e6565b60086020525f908152604090205481565b61020b6102dc3660046111d0565b6109fd565b6101c96102ef3660046110e6565b60066020525f908152604090205481565b6101c961030e366004611225565b610c6b565b600154610326906001600160a01b031681565b6040516001600160a01b0390911681526020016101ad565b61035161034c3660046110e6565b610dc3565b6040516101ad96959493929190611240565b6101c9610371366004611285565b610e2a565b61020b6103843660046112a5565b610e96565b6103ab6103973660046110e6565b60046020525f908152604090205460ff1681565b6040516101ad91906112cb565b6103ab6103c63660046110e6565b60056020525f908152604090205460ff1681565b61020b6103e83660046112de565b610fb8565b6101c96103fb3660046110e6565b60076020525f908152604090205481565b5f54610326906001600160a01b031681565b5f8181526003602090815260408083208151608081018352905461ffff80821683526201000082048116948301949094526401000000008104841692820192909252600160301b9091049091166060820181905261271090610483906106fe9061131e565b610652836040015161ffff16610499919061131e565b61123c846020015161ffff166104af919061131e565b84516104c2906107849061ffff1661131e565b6104cc9190611335565b6104d69190611335565b6104e09190611335565b6104ea9190611348565b9392505050565b5f8181526005602052604081205460ff1660025f8481526004602052604090205460ff166002811115610526576105266110fd565b14159150915091565b6001546001600160a01b0316331461059e5760405162461bcd60e51b815260206004820152602760248201527f5175616c697479496e6465783a2063616c6c6572206973206e6f742053757070604482015266363ca1b430b4b760c91b60648201526084015b60405180910390fd5b60025f8281526004602052604090205460ff1660028111156105c2576105c26110fd565b146105f8575f818152600560209081526040808320805460ff199081166002179091556004909252909120805490911660011790555b50565b5f5f9054906101000a90046001600160a01b03166001600160a01b0316638c64f57c6040518163ffffffff1660e01b8152600401602060405180830381865afa15801561064a573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061066e9190611367565b5f54604051632474521560e21b8152600481018390523360248201526001600160a01b03909116906391d1485490604401602060405180830381865afa1580156106ba573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906106de919061137e565b6106fa5760405162461bcd60e51b81526004016105959061139d565b5f805460405163236e092960e01b81523360048201526001600160a01b039091169063236e0929906024016040805180830381865afa15801561073f573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061076391906113d4565b5f968752600360209081526040808920805465ffffffff000019166201000061ffff9a8b160265ffff0000000019161764010000000094909916939093029790971790915560089052505050912055565b5f806108fc6107c96080850160608601611403565b61ffff1611156107de57505f92600192509050565b6107eb6020840184611403565b61ffff16158061080c57506108066040840160208501611403565b61ffff16155b8061082857506108226060840160408501611403565b61ffff16155b1561083757505f928392509050565b60036108496060850160408601611403565b61ffff1661085d6040860160208701611403565b61ffff1661086e6020870187611403565b61ffff1661087c9190611335565b6108869190611335565b6108909190611348565b935f9350915050565b5f5f9054906101000a90046001600160a01b03166001600160a01b031663651e65b56040518163ffffffff1660e01b8152600401602060405180830381865afa1580156108e8573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061090c9190611367565b5f54604051632474521560e21b8152600481018390523360248201526001600160a01b03909116906391d1485490604401602060405180830381865afa158015610958573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061097c919061137e565b6109985760405162461bcd60e51b81526004016105959061139d565b505f928352600360209081526040808520805461ffff909516600160301b0267ffff000000000000199095169490941790935560079052912055565b5f818152600260205260408120546109f790839062010000900461ffff16610e2a565b92915050565b5f5f9054906101000a90046001600160a01b03166001600160a01b031663bd3070c66040518163ffffffff1660e01b8152600401602060405180830381865afa158015610a4c573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610a709190611367565b5f54604051632474521560e21b8152600481018390523360248201526001600160a01b03909116906391d1485490604401602060405180830381865afa158015610abc573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610ae0919061137e565b610afc5760405162461bcd60e51b81526004016105959061139d565b5f8581526002602052604081205462010000900461ffff169080610b1f876107b4565b5f8a8152600260209081526040808320805463ffff000019166201000061ffff888116919091029190911790915560038352818420805461ffff1916918d169190911790556006825291829020899055905188815292945090925089917f3f19a4c8c20e8eca23203c9848d723ca5d1f49c48d63a0327fab894de4a465f4910160405180910390a28215610be857877f1fd6d6e1a8bb0ab9e43deb3cdf9f39f187ca6062d781cc58c9ac7fc24b95c91884604051610bdf91815260200190565b60405180910390a25b6001816002811115610bfc57610bfc6110fd565b03610c36575f888152600560209081526040808320805460ff19908116600117909155600490925290912080549091166002179055610c61565b5f888152600560209081526040808320805460ff199081169091556004909252909120805490911690555b5050505050505050565b5f612710610100610c8184820160e08601611403565b61ffff16610c8f919061131e565b61016c610ca260e0860160c08701611403565b61ffff16610cb0919061131e565b61020e610cc360c0870160a08801611403565b61ffff16610cd1919061131e565b610315610ce460a0880160808901611403565b61ffff16610cf2919061131e565b610460610d056080890160608a01611403565b61ffff16610d13919061131e565b6105d0610d2660608a0160408b01611403565b61ffff16610d34919061131e565b6106b3610d4760408b0160208c01611403565b61ffff16610d55919061131e565b610e9d610d6560208c018c611403565b61ffff16610d73919061131e565b610d7d9190611335565b610d879190611335565b610d919190611335565b610d9b9190611335565b610da59190611335565b610daf9190611335565b610db99190611335565b6109f79190611348565b5f8181526002602052604081205461ffff80821692620100009092041690808080610ded8761041e565b9350610df8876109d4565b5f978852600460209081526040808a2054600590925290982054969895979496909560ff958616959091169350915050565b5f8281526002602052604081205461ffff1681610e468561041e565b9050612710610e576106668461131e565b610e63610b9c8461131e565b610e6f61150e8861131e565b610e799190611335565b610e839190611335565b610e8d9190611348565b95945050505050565b5f5f9054906101000a90046001600160a01b03166001600160a01b031663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa158015610ee5573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610f099190611367565b5f54604051632474521560e21b8152600481018390523360248201526001600160a01b03909116906391d1485490604401602060405180830381865afa158015610f55573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610f79919061137e565b610f955760405162461bcd60e51b81526004016105959061139d565b50600180546001600160a01b0319166001600160a01b0392909216919091179055565b5f5f9054906101000a90046001600160a01b03166001600160a01b0316638c64f57c6040518163ffffffff1660e01b8152600401602060405180830381865afa158015611007573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061102b9190611367565b5f54604051632474521560e21b8152600481018390523360248201526001600160a01b03909116906391d1485490604401602060405180830381865afa158015611077573d5f5f3e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061109b919061137e565b6110b75760405162461bcd60e51b81526004016105959061139d565b6110c082610c6b565b5f93845260026020526040909320805461ffff191661ffff909416939093179092555050565b5f602082840312156110f6575f5ffd5b5035919050565b634e487b7160e01b5f52602160045260245ffd5b600381106105f857634e487b7160e01b5f52602160045260245ffd5b82151581526040810161113f83611111565b8260208301529392505050565b61ffff811681146105f8575f5ffd5b5f5f5f6060848603121561116d575f5ffd5b83359250602084013561117f8161114c565b929592945050506040919091013590565b5f608082840312156111a0575f5ffd5b50919050565b5f608082840312156111b6575f5ffd5b6104ea8383611190565b8281526040810161113f83611111565b5f5f5f5f60e085870312156111e3575f5ffd5b843593506111f48660208701611190565b925060a08501356112048161114c565b9396929550929360c00135925050565b5f61010082840312156111a0575f5ffd5b5f6101008284031215611236575f5ffd5b6104ea8383611214565b5f60c08201905087825286602083015285604083015284606083015261126584611111565b83608083015261127483611111565b8260a0830152979650505050505050565b5f5f60408385031215611296575f5ffd5b50508035926020909101359150565b5f602082840312156112b5575f5ffd5b81356001600160a01b03811681146104ea575f5ffd5b602081016112d883611111565b91905290565b5f5f61012083850312156112f0575f5ffd5b823591506113018460208501611214565b90509250929050565b634e487b7160e01b5f52601160045260245ffd5b80820281158282048414176109f7576109f761130a565b808201808211156109f7576109f761130a565b5f8261136257634e487b7160e01b5f52601260045260245ffd5b500490565b5f60208284031215611377575f5ffd5b5051919050565b5f6020828403121561138e575f5ffd5b815180151581146104ea575f5ffd5b6020808252601a908201527f5175616c697479496e6465783a206d697373696e6720726f6c65000000000000604082015260600190565b5f5f604083850312156113e5575f5ffd5b825160208401519092506113f88161114c565b809150509250929050565b5f60208284031215611413575f5ffd5b81356104ea8161114c56fea264697066735822122080e04dbf63b819f27eb03f924e1e4945a47e9c5337eee18f82f2b41f3baee79f64736f6c63430008220033";

    private static String librariesLinkedBinary;

    public static final String FUNC_ACTORREGISTRY = "actorRegistry";

    public static final String FUNC_AWARDCERTIFICATECID = "awardCertificateCid";

    public static final String FUNC_BATCHSTATES = "batchStates";

    public static final String FUNC_CALCULATEMCI = "calculateMCI";

    public static final String FUNC_CALCULATEPHQI = "calculatePHQI";

    public static final String FUNC_CALCULATEQI = "calculateQI";

    public static final String FUNC_CALCULATEQIFORPHQI = "calculateQIForPHQI";

    public static final String FUNC_CALCULATESI = "calculateSI";

    public static final String FUNC_CHECKGATEKEEPER = "checkGatekeeper";

    public static final String FUNC_GATEKEEPERFLAGS = "gatekeeperFlags";

    public static final String FUNC_GETQUALITYDATA = "getQualityData";

    public static final String FUNC_MCIDATA = "mciData";

    public static final String FUNC_ORIGINCID = "originCid";

    public static final String FUNC_PHQIREPORTCID = "phqiReportCid";

    public static final String FUNC_QUALITYDATA = "qualityData";

    public static final String FUNC_SETSUPPLYCHAIN = "setSupplyChain";

    public static final String FUNC_SUBMITAWARD = "submitAward";

    public static final String FUNC_SUBMITORIGIN = "submitOrigin";

    public static final String FUNC_SUBMITPHQIDATA = "submitPHQIData";

    public static final String FUNC_SUBMITSIDATA = "submitSIData";

    public static final String FUNC_SUPPLYCHAIN = "supplyChain";

    public static final String FUNC_TRIGGERTEMPERATUREVIOLATION = "triggerTemperatureViolation";

    public static final Event PHQIDATASUBMITTED_EVENT = new Event("PHQIDataSubmitted", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>(true) {}, new TypeReference<Bytes32>() {}));
    ;

    public static final Event PHQIREVISED_EVENT = new Event("PHQIRevised", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>(true) {}, new TypeReference<Uint256>() {}));
    ;

    @Deprecated
    protected QualityIndex(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected QualityIndex(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected QualityIndex(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected QualityIndex(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static List<PHQIDataSubmittedEventResponse> getPHQIDataSubmittedEvents(
            TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(PHQIDATASUBMITTED_EVENT, transactionReceipt);
        ArrayList<PHQIDataSubmittedEventResponse> responses = new ArrayList<PHQIDataSubmittedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PHQIDataSubmittedEventResponse typedResponse = new PHQIDataSubmittedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.batchId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.ipfsCid = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static PHQIDataSubmittedEventResponse getPHQIDataSubmittedEventFromLog(Log log) {
        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(PHQIDATASUBMITTED_EVENT, log);
        PHQIDataSubmittedEventResponse typedResponse = new PHQIDataSubmittedEventResponse();
        typedResponse.log = log;
        typedResponse.batchId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.ipfsCid = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
        return typedResponse;
    }

    public Flowable<PHQIDataSubmittedEventResponse> pHQIDataSubmittedEventFlowable(
            EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getPHQIDataSubmittedEventFromLog(log));
    }

    public Flowable<PHQIDataSubmittedEventResponse> pHQIDataSubmittedEventFlowable(
            DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PHQIDATASUBMITTED_EVENT));
        return pHQIDataSubmittedEventFlowable(filter);
    }

    public static List<PHQIRevisedEventResponse> getPHQIRevisedEvents(
            TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(PHQIREVISED_EVENT, transactionReceipt);
        ArrayList<PHQIRevisedEventResponse> responses = new ArrayList<PHQIRevisedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PHQIRevisedEventResponse typedResponse = new PHQIRevisedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.batchId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.oldPhqi = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static PHQIRevisedEventResponse getPHQIRevisedEventFromLog(Log log) {
        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(PHQIREVISED_EVENT, log);
        PHQIRevisedEventResponse typedResponse = new PHQIRevisedEventResponse();
        typedResponse.log = log;
        typedResponse.batchId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.oldPhqi = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
        return typedResponse;
    }

    public Flowable<PHQIRevisedEventResponse> pHQIRevisedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getPHQIRevisedEventFromLog(log));
    }

    public Flowable<PHQIRevisedEventResponse> pHQIRevisedEventFlowable(
            DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PHQIREVISED_EVENT));
        return pHQIRevisedEventFlowable(filter);
    }

    public RemoteFunctionCall<String> actorRegistry() {
        final Function function = new Function(FUNC_ACTORREGISTRY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<byte[]> awardCertificateCid(BigInteger param0) {
        final Function function = new Function(FUNC_AWARDCERTIFICATECID, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<BigInteger> batchStates(BigInteger param0) {
        final Function function = new Function(FUNC_BATCHSTATES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> calculateMCI(BigInteger batchId) {
        final Function function = new Function(FUNC_CALCULATEMCI, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Tuple2<BigInteger, BigInteger>> calculatePHQI(PHQIInput input) {
        final Function function = new Function(FUNC_CALCULATEPHQI, 
                Arrays.<Type>asList(input), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint8>() {}));
        return new RemoteFunctionCall<Tuple2<BigInteger, BigInteger>>(function,
                new Callable<Tuple2<BigInteger, BigInteger>>() {
                    @Override
                    public Tuple2<BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> calculateQI(BigInteger batchId) {
        final Function function = new Function(FUNC_CALCULATEQI, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> calculateQIForPHQI(BigInteger batchId, BigInteger phqi) {
        final Function function = new Function(FUNC_CALCULATEQIFORPHQI, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint256(phqi)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> calculateSI(SIInput input) {
        final Function function = new Function(FUNC_CALCULATESI, 
                Arrays.<Type>asList(input), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Tuple2<Boolean, BigInteger>> checkGatekeeper(BigInteger batchId) {
        final Function function = new Function(FUNC_CHECKGATEKEEPER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}, new TypeReference<Uint8>() {}));
        return new RemoteFunctionCall<Tuple2<Boolean, BigInteger>>(function,
                new Callable<Tuple2<Boolean, BigInteger>>() {
                    @Override
                    public Tuple2<Boolean, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<Boolean, BigInteger>(
                                (Boolean) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> gatekeeperFlags(BigInteger param0) {
        final Function function = new Function(FUNC_GATEKEEPERFLAGS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
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

    public RemoteFunctionCall<Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>> mciData(
            BigInteger param0) {
        final Function function = new Function(FUNC_MCIDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint16>() {}, new TypeReference<Uint16>() {}, new TypeReference<Uint16>() {}, new TypeReference<Uint16>() {}));
        return new RemoteFunctionCall<Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>>(function,
                new Callable<Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple4<BigInteger, BigInteger, BigInteger, BigInteger> call() throws
                            Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue());
                    }
                });
    }

    public RemoteFunctionCall<byte[]> originCid(BigInteger param0) {
        final Function function = new Function(FUNC_ORIGINCID, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> phqiReportCid(BigInteger param0) {
        final Function function = new Function(FUNC_PHQIREPORTCID, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<Tuple2<BigInteger, BigInteger>> qualityData(BigInteger param0) {
        final Function function = new Function(FUNC_QUALITYDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint16>() {}, new TypeReference<Uint16>() {}));
        return new RemoteFunctionCall<Tuple2<BigInteger, BigInteger>>(function,
                new Callable<Tuple2<BigInteger, BigInteger>>() {
                    @Override
                    public Tuple2<BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> setSupplyChain(String supplyChainAddress) {
        final Function function = new Function(
                FUNC_SETSUPPLYCHAIN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, supplyChainAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> submitAward(BigInteger batchId, BigInteger level,
            byte[] ipfsCid) {
        final Function function = new Function(
                FUNC_SUBMITAWARD, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint16(level), 
                new org.web3j.abi.datatypes.generated.Bytes32(ipfsCid)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> submitOrigin(BigInteger batchId,
            BigInteger region, byte[] ipfsCid) {
        final Function function = new Function(
                FUNC_SUBMITORIGIN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint16(region), 
                new org.web3j.abi.datatypes.generated.Bytes32(ipfsCid)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> submitPHQIData(BigInteger batchId,
            PHQIInput input, BigInteger variety, byte[] ipfsCid) {
        final Function function = new Function(
                FUNC_SUBMITPHQIDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                input, 
                new org.web3j.abi.datatypes.generated.Uint16(variety), 
                new org.web3j.abi.datatypes.generated.Bytes32(ipfsCid)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> submitSIData(BigInteger batchId, SIInput input) {
        final Function function = new Function(
                FUNC_SUBMITSIDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                input), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> supplyChain() {
        final Function function = new Function(FUNC_SUPPLYCHAIN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> triggerTemperatureViolation(BigInteger batchId) {
        final Function function = new Function(
                FUNC_TRIGGERTEMPERATUREVIOLATION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static QualityIndex load(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return new QualityIndex(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static QualityIndex load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new QualityIndex(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static QualityIndex load(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return new QualityIndex(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static QualityIndex load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new QualityIndex(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<QualityIndex> deploy(Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider, String actorRegistryAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress)));
        return deployRemoteCall(QualityIndex.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    public static RemoteCall<QualityIndex> deploy(Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider,
            String actorRegistryAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress)));
        return deployRemoteCall(QualityIndex.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<QualityIndex> deploy(Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit, String actorRegistryAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress)));
        return deployRemoteCall(QualityIndex.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<QualityIndex> deploy(Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit,
            String actorRegistryAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress)));
        return deployRemoteCall(QualityIndex.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
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

    public static class PHQIInput extends StaticStruct {
        public BigInteger normalizedWaterContent;

        public BigInteger hmf;

        public BigInteger invertaseActivity;

        public BigInteger waterContentPercent;

        public PHQIInput(BigInteger normalizedWaterContent, BigInteger hmf,
                BigInteger invertaseActivity, BigInteger waterContentPercent) {
            super(new org.web3j.abi.datatypes.generated.Uint16(normalizedWaterContent), 
                    new org.web3j.abi.datatypes.generated.Uint16(hmf), 
                    new org.web3j.abi.datatypes.generated.Uint16(invertaseActivity), 
                    new org.web3j.abi.datatypes.generated.Uint16(waterContentPercent));
            this.normalizedWaterContent = normalizedWaterContent;
            this.hmf = hmf;
            this.invertaseActivity = invertaseActivity;
            this.waterContentPercent = waterContentPercent;
        }

        public PHQIInput(Uint16 normalizedWaterContent, Uint16 hmf, Uint16 invertaseActivity,
                Uint16 waterContentPercent) {
            super(normalizedWaterContent, hmf, invertaseActivity, waterContentPercent);
            this.normalizedWaterContent = normalizedWaterContent.getValue();
            this.hmf = hmf.getValue();
            this.invertaseActivity = invertaseActivity.getValue();
            this.waterContentPercent = waterContentPercent.getValue();
        }
    }

    public static class SIInput extends StaticStruct {
        public BigInteger forage;

        public BigInteger lightIntensity;

        public BigInteger waterSource;

        public BigInteger summerTemperature;

        public BigInteger winterTemperature;

        public BigInteger windSpeed;

        public BigInteger humidity;

        public BigInteger precipitation;

        public SIInput(BigInteger forage, BigInteger lightIntensity, BigInteger waterSource,
                BigInteger summerTemperature, BigInteger winterTemperature, BigInteger windSpeed,
                BigInteger humidity, BigInteger precipitation) {
            super(new org.web3j.abi.datatypes.generated.Uint16(forage), 
                    new org.web3j.abi.datatypes.generated.Uint16(lightIntensity), 
                    new org.web3j.abi.datatypes.generated.Uint16(waterSource), 
                    new org.web3j.abi.datatypes.generated.Uint16(summerTemperature), 
                    new org.web3j.abi.datatypes.generated.Uint16(winterTemperature), 
                    new org.web3j.abi.datatypes.generated.Uint16(windSpeed), 
                    new org.web3j.abi.datatypes.generated.Uint16(humidity), 
                    new org.web3j.abi.datatypes.generated.Uint16(precipitation));
            this.forage = forage;
            this.lightIntensity = lightIntensity;
            this.waterSource = waterSource;
            this.summerTemperature = summerTemperature;
            this.winterTemperature = winterTemperature;
            this.windSpeed = windSpeed;
            this.humidity = humidity;
            this.precipitation = precipitation;
        }

        public SIInput(Uint16 forage, Uint16 lightIntensity, Uint16 waterSource,
                Uint16 summerTemperature, Uint16 winterTemperature, Uint16 windSpeed,
                Uint16 humidity, Uint16 precipitation) {
            super(forage, lightIntensity, waterSource, summerTemperature, winterTemperature, windSpeed, humidity, precipitation);
            this.forage = forage.getValue();
            this.lightIntensity = lightIntensity.getValue();
            this.waterSource = waterSource.getValue();
            this.summerTemperature = summerTemperature.getValue();
            this.winterTemperature = winterTemperature.getValue();
            this.windSpeed = windSpeed.getValue();
            this.humidity = humidity.getValue();
            this.precipitation = precipitation.getValue();
        }
    }

    public static class PHQIDataSubmittedEventResponse extends BaseEventResponse {
        public BigInteger batchId;

        public byte[] ipfsCid;
    }

    public static class PHQIRevisedEventResponse extends BaseEventResponse {
        public BigInteger batchId;

        public BigInteger oldPhqi;
    }
}

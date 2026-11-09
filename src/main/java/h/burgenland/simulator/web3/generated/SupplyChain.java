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
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.StaticStruct;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint128;
import org.web3j.abi.datatypes.generated.Uint16;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint64;
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
import org.web3j.tuples.generated.Tuple3;
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
public class SupplyChain extends Contract {
    public static final String BINARY = "0x608060405260016003556028600455603c600555348015601d575f5ffd5b50604051611acd380380611acd833981016040819052603a916094565b5f80546001600160a01b039485166001600160a01b03199182161790915560018054938516938216939093179092556002805491909316911617905560cd565b80516001600160a01b0381168114608f575f5ffd5b919050565b5f5f5f6060848603121560a5575f5ffd5b60ac84607a565b925060b860208501607a565b915060c460408501607a565b90509250925092565b6119f3806100da5f395ff3fe608060405234801561000f575f5ffd5b5060043610610111575f3560e01c8063b4bbb2781161009e578063cedcd73f1161006e578063cedcd73f146102cd578063d561183b1461034d578063d5cb160314610360578063e24abbec1461039a578063eae7b935146103ad575f5ffd5b8063b4bbb278146102c4578063b947b055146102cd578063c70d588d146102e0578063ce22d7da14610308575f5ffd5b80635fa49076116100e45780635fa490761461021c578063815fc9bb146102335780638462a7f814610246578063a6f00f2a1461024f578063b32c4d8d14610262575f5ffd5b8063244d75c41461011557806329831f5d1461012a57806357c9dc751461015a5780635ac442821461016d575b5f5ffd5b6101286101233660046114d7565b6103bf565b005b60015461013d906001600160a01b031681565b6040516001600160a01b0390911681526020015b60405180910390f35b610128610168366004611535565b6104cd565b6101e261017b3660046114d7565b60408051606080820183525f80835260208084018290529284018190528481526006835283812084519283018552805483526001015461ffff8116838501526201000090046001600160a01b03908116838601529481526009909252919020549092911690565b604080518351815260208085015161ffff1690820152928101516001600160a01b0390811691840191909152166060820152608001610151565b61022560055481565b604051908152602001610151565b6101286102413660046115ac565b6107cd565b61022560035481565b61022561025d3660046115e5565b610e5e565b61029d6102703660046114d7565b60066020525f90815260409020805460019091015461ffff8116906201000090046001600160a01b031683565b6040805193845261ffff90921660208401526001600160a01b031690820152606001610151565b61022560045481565b6101286102db366004611624565b61128a565b61013d6102ee3660046114d7565b60096020525f90815260409020546001600160a01b031681565b61031b61031636600461164d565b611339565b604080516001600160a01b0394851681526001600160401b039093166020840152921691810191909152606001610151565b60025461013d906001600160a01b031681565b61037361036e36600461164d565b61138d565b604080516001600160401b0390931683526001600160801b03909116602083015201610151565b6101286103a83660046114d7565b6113d2565b5f5461013d906001600160a01b031681565b5f5f9054906101000a90046001600160a01b03166001600160a01b031663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa15801561040e573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610432919061166d565b5f54604051632474521560e21b8152600481018390523360248201526001600160a01b03909116906391d1485490604401602060405180830381865afa15801561047e573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906104a29190611684565b6104c75760405162461bcd60e51b81526004016104be906116aa565b60405180910390fd5b50600555565b5f5f9054906101000a90046001600160a01b03166001600160a01b0316634af913c96040518163ffffffff1660e01b8152600401602060405180830381865afa15801561051c573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610540919061166d565b5f54604051632474521560e21b8152600481018390523360248201526001600160a01b03909116906391d1485490604401602060405180830381865afa15801561058c573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906105b09190611684565b6105cc5760405162461bcd60e51b81526004016104be906116aa565b5f8681526009602052604090205486906001600160a01b031633146106035760405162461bcd60e51b81526004016104be906116e1565b6002546040516359052edf60e11b81526004810189905288915f916001600160a01b039091169063b20a5dbe90602401602060405180830381865afa15801561064e573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610672919061172a565b9050600181600281111561068857610688611748565b036106a55760405162461bcd60e51b81526004016104be9061175c565b60028160028111156106b9576106b9611748565b036106d65760405162461bcd60e51b81526004016104be906117b9565b600154604051635281c45160e11b81526001600160a01b039091169063a50388a290610712908c9033908d908d908d908d90859060040161182b565b5f604051808303815f87803b158015610729575f5ffd5b505af115801561073b573d5f5f3e3d5ffd5b5050600154604051639d4cf7bb60e01b8152600481018d90526001600160a01b039091169250639d4cf7bb91506024015f604051808303815f87803b158015610782575f5ffd5b505af1158015610794573d5f5f3e3d5ffd5b50506040518b92507ff789c5830ff9271bc4cd85ef7320aa33d1a7ac6864776ff2affca531a42f6c3991505f90a2505050505050505050565b5f8281526009602052604090205482906001600160a01b031633146108045760405162461bcd60e51b81526004016104be906116e1565b6002546040516359052edf60e11b81526004810185905284915f916001600160a01b039091169063b20a5dbe90602401602060405180830381865afa15801561084f573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610873919061172a565b9050600181600281111561088957610889611748565b036108a65760405162461bcd60e51b81526004016104be9061175c565b60028160028111156108ba576108ba611748565b036108d75760405162461bcd60e51b81526004016104be906117b9565b5f85815260096020908152604080832080546001600160a01b038981166001600160a01b03199283168117909355600885528386208451606081018652338082526001600160401b03428116838a01908152838901978852845460018181018755958c528a8c209451600290910290940180549151909216600160a01b026001600160e01b0319909116938616939093179290921782559451910180549190921692169190911790558151600480825260a08201909352909392909190820160808036833701905050905086815f815181106109b5576109b56118d1565b60209081029190910101526001546040516210b0a760e81b8152600481018990526103e860248201526001600160a01b03909116906310b0a70090604401602060405180830381865afa158015610a0e573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610a32919061166d565b81600181518110610a4557610a456118d1565b60209081029190910101526001546040516210b0a760e81b8152600481018990526101f460248201526001600160a01b03909116906310b0a70090604401602060405180830381865afa158015610a9e573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610ac2919061166d565b81600281518110610ad557610ad56118d1565b60209081029190910101526001546040516210b0a760e81b81526004810189905260fa60248201526001600160a01b03909116906310b0a70090604401602060405180830381865afa158015610b2d573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610b51919061166d565b81600381518110610b6457610b646118d1565b602090810291909101015260408051600480825260a082019092525f91816020016020820280368337505060408051600480825260a082019092529293505f929150602082016080803683370190505090505f805b6004811015610cd95760015485515f916001600160a01b03169062fdd58e908990899086908110610bec57610bec6118d1565b60200260200101516040518363ffffffff1660e01b8152600401610c259291906001600160a01b03929092168252602082015260400190565b602060405180830381865afa158015610c40573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610c64919061166d565b90508015610cd057858281518110610c7e57610c7e6118d1565b6020026020010151858481518110610c9857610c986118d1565b60200260200101818152505080848481518110610cb757610cb76118d1565b602090810291909101015282610ccc816118f9565b9350505b50600101610bb9565b508015610e52575f816001600160401b03811115610cf957610cf96118bd565b604051908082528060200260200182016040528015610d22578160200160208202803683370190505b5090505f826001600160401b03811115610d3e57610d3e6118bd565b604051908082528060200260200182016040528015610d67578160200160208202803683370190505b5090505f5b83811015610deb57858181518110610d8657610d866118d1565b6020026020010151838281518110610da057610da06118d1565b602002602001018181525050848181518110610dbe57610dbe6118d1565b6020026020010151828281518110610dd857610dd86118d1565b6020908102919091010152600101610d6c565b50600154604051631759616b60e11b81526001600160a01b0390911690632eb2c2d690610e22908a908f908790879060040161194b565b5f604051808303815f87803b158015610e39575f5ffd5b505af1158015610e4b573d5f5f3e3d5ffd5b5050505050505b50505050505050505050565b5f5f5f9054906101000a90046001600160a01b03166001600160a01b0316638c64f57c6040518163ffffffff1660e01b8152600401602060405180830381865afa158015610eae573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610ed2919061166d565b5f54604051632474521560e21b8152600481018390523360248201526001600160a01b03909116906391d1485490604401602060405180830381865afa158015610f1e573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190610f429190611684565b610f5e5760405162461bcd60e51b81526004016104be906116aa565b848314610fad5760405162461bcd60e51b815260206004820152601c60248201527f537570706c79436861696e3a206c656e677468206d69736d617463680000000060448201526064016104be565b5f805b84811015610fe657858582818110610fca57610fca6118d1565b9050602002013582610fdc91906119a4565b9150600101610fb0565b5060038054905f610ff6836118f9565b909155506040805160608101825283815261ffff808c166020808401918252338486018181525f888152600684528781209651875593516001909601805491516001600160a01b031662010000026001600160b01b0319909216969095169590951794909417909255600990915291822080546001600160a01b03191690911790559093505b86811015611218576001600160401b0388888381811061109e5761109e6118d1565b9050602002013511156110f35760405162461bcd60e51b815260206004820152601e60248201527f537570706c79436861696e3a207374616e64496420746f6f206c61726765000060448201526064016104be565b6001600160801b0386868381811061110d5761110d6118d1565b9050602002013511156111625760405162461bcd60e51b815260206004820152601f60248201527f537570706c79436861696e3a207175616e7469747920746f6f206c617267650060448201526064016104be565b60075f8581526020019081526020015f2060405180604001604052808a8a85818110611190576111906118d1565b905060200201356001600160401b031681526020018888858181106111b7576111b76118d1565b6001600160801b03602091820293909301358316909352508354600181810186555f958652948390208451910180549490930151909116600160401b026001600160c01b03199093166001600160401b03909116179190911790550161107c565b50600154604051631ecdf6ad60e31b815260048101859052602481018390523360448201526001600160a01b039091169063f66fb568906064015f604051808303815f87803b158015611269575f5ffd5b505af115801561127b573d5f5f3e3d5ffd5b50505050505095945050505050565b5f8381526009602052604090205483906001600160a01b031633146112c15760405162461bcd60e51b81526004016104be906116e1565b600454831380156112d457506005548210155b15611333576002546040516338140c7160e01b8152600481018690526001600160a01b03909116906338140c71906024015f604051808303815f87803b15801561131c575f5ffd5b505af115801561132e573d5f5f3e3d5ffd5b505050505b50505050565b6008602052815f5260405f208181548110611352575f80fd5b5f918252602090912060029091020180546001909101546001600160a01b038083169450600160a01b9092046001600160401b031692501683565b6007602052815f5260405f2081815481106113a6575f80fd5b5f918252602090912001546001600160401b0381169250600160401b90046001600160801b0316905082565b5f5f9054906101000a90046001600160a01b03166001600160a01b031663a217fddf6040518163ffffffff1660e01b8152600401602060405180830381865afa158015611421573d5f5f3e3d5ffd5b505050506040513d601f19601f82011682018060405250810190611445919061166d565b5f54604051632474521560e21b8152600481018390523360248201526001600160a01b03909116906391d1485490604401602060405180830381865afa158015611491573d5f5f3e3d5ffd5b505050506040513d601f19601f820116820180604052508101906114b59190611684565b6114d15760405162461bcd60e51b81526004016104be906116aa565b50600455565b5f602082840312156114e7575f5ffd5b5035919050565b5f5f83601f8401126114fe575f5ffd5b5081356001600160401b03811115611514575f5ffd5b6020830191508360208260051b850101111561152e575f5ffd5b9250929050565b5f5f5f5f5f60608688031215611549575f5ffd5b8535945060208601356001600160401b03811115611565575f5ffd5b611571888289016114ee565b90955093505060408601356001600160401b0381111561158f575f5ffd5b61159b888289016114ee565b969995985093965092949392505050565b5f5f604083850312156115bd575f5ffd5b8235915060208301356001600160a01b03811681146115da575f5ffd5b809150509250929050565b5f5f5f5f5f606086880312156115f9575f5ffd5b853561ffff8116811461160a575f5ffd5b945060208601356001600160401b03811115611565575f5ffd5b5f5f5f60608486031215611636575f5ffd5b505081359360208301359350604090920135919050565b5f5f6040838503121561165e575f5ffd5b50508035926020909101359150565b5f6020828403121561167d575f5ffd5b5051919050565b5f60208284031215611694575f5ffd5b815180151581146116a3575f5ffd5b9392505050565b60208082526019908201527f537570706c79436861696e3a206d697373696e6720726f6c6500000000000000604082015260600190565b60208082526029908201527f537570706c79436861696e3a2063616c6c657220646f6573206e6f7420686f6c6040820152686420637573746f647960b81b606082015260800190565b5f6020828403121561173a575f5ffd5b8151600381106116a3575f5ffd5b634e487b7160e01b5f52602160045260245ffd5b6020808252603e908201527f537570706c79436861696e3a2062617463682072657175697265732061206c6160408201527f6220726574657374206265666f72652069742063616e2070726f636565640000606082015260800190565b60208082526022908201527f537570706c79436861696e3a206261746368206973206e6f742073656c6c61626040820152616c6560f01b606082015260800190565b8183525f6001600160fb1b03831115611812575f5ffd5b8260051b80836020870137939093016020019392505050565b8781526001600160a01b038716602082015260a06040820181905281018590525f8660c08301825b8881101561188457823563ffffffff811680821461186f575f5ffd5b83525060209283019290910190600101611853565b5083810360608501526118988187896117fb565b925050506118b160808301846001600160a01b03169052565b98975050505050505050565b634e487b7160e01b5f52604160045260245ffd5b634e487b7160e01b5f52603260045260245ffd5b634e487b7160e01b5f52601160045260245ffd5b5f6001820161190a5761190a6118e5565b5060010190565b5f8151808452602084019350602083015f5b82811015611941578151865260209586019590910190600101611923565b5093949350505050565b6001600160a01b0385811682528416602082015260a0604082018190525f9061197690830185611911565b82810360608401526119888185611911565b83810360809094019390935250505f8152602001949350505050565b808201808211156119b7576119b76118e5565b9291505056fea264697066735822122061e5cc0251ea61e093a3efcfcdbbb9b806bbf05a0e6d0bfcc40f284141beabb264736f6c63430008220033";

    private static String librariesLinkedBinary;

    public static final String FUNC_ACTORREGISTRY = "actorRegistry";

    public static final String FUNC_BATCHLOCATIONS = "batchLocations";

    public static final String FUNC_BATCHES = "batches";

    public static final String FUNC_CURRENTHOLDER = "currentHolder";

    public static final String FUNC_CUSTODYHISTORY = "custodyHistory";

    public static final String FUNC_GETBATCH = "getBatch";

    public static final String FUNC_HONEYTOKEN = "honeyToken";

    public static final String FUNC_MAXSAFEDURATIONMINUTES = "maxSafeDurationMinutes";

    public static final String FUNC_MAXSAFETEMPERATURECELSIUS = "maxSafeTemperatureCelsius";

    public static final String FUNC_NEXTBATCHID = "nextBatchId";

    public static final String FUNC_PROCESSANDBOTTLE = "processAndBottle";

    public static final String FUNC_QUALITYINDEX = "qualityIndex";

    public static final String FUNC_RECORDTRANSPORTDATA = "recordTransportData";

    public static final String FUNC_RECORDWAREHOUSEDATA = "recordWarehouseData";

    public static final String FUNC_REGISTERHARVESTBATCH = "registerHarvestBatch";

    public static final String FUNC_SETMAXSAFEDURATION = "setMaxSafeDuration";

    public static final String FUNC_SETMAXSAFETEMPERATURE = "setMaxSafeTemperature";

    public static final String FUNC_TRANSFERCUSTODY = "transferCustody";

    public static final Event BATCHBOTTLED_EVENT = new Event("BatchBottled", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>(true) {}));
    ;

    @Deprecated
    protected SupplyChain(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected SupplyChain(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected SupplyChain(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected SupplyChain(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static List<BatchBottledEventResponse> getBatchBottledEvents(
            TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(BATCHBOTTLED_EVENT, transactionReceipt);
        ArrayList<BatchBottledEventResponse> responses = new ArrayList<BatchBottledEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            BatchBottledEventResponse typedResponse = new BatchBottledEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.batchId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static BatchBottledEventResponse getBatchBottledEventFromLog(Log log) {
        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(BATCHBOTTLED_EVENT, log);
        BatchBottledEventResponse typedResponse = new BatchBottledEventResponse();
        typedResponse.log = log;
        typedResponse.batchId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
        return typedResponse;
    }

    public Flowable<BatchBottledEventResponse> batchBottledEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getBatchBottledEventFromLog(log));
    }

    public Flowable<BatchBottledEventResponse> batchBottledEventFlowable(
            DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(BATCHBOTTLED_EVENT));
        return batchBottledEventFlowable(filter);
    }

    public RemoteFunctionCall<String> actorRegistry() {
        final Function function = new Function(FUNC_ACTORREGISTRY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Tuple2<BigInteger, BigInteger>> batchLocations(BigInteger param0,
            BigInteger param1) {
        final Function function = new Function(FUNC_BATCHLOCATIONS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0), 
                new org.web3j.abi.datatypes.generated.Uint256(param1)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint64>() {}, new TypeReference<Uint128>() {}));
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

    public RemoteFunctionCall<Tuple3<BigInteger, BigInteger, String>> batches(BigInteger param0) {
        final Function function = new Function(FUNC_BATCHES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint16>() {}, new TypeReference<Address>() {}));
        return new RemoteFunctionCall<Tuple3<BigInteger, BigInteger, String>>(function,
                new Callable<Tuple3<BigInteger, BigInteger, String>>() {
                    @Override
                    public Tuple3<BigInteger, BigInteger, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<BigInteger, BigInteger, String>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (String) results.get(2).getValue());
                    }
                });
    }

    public RemoteFunctionCall<String> currentHolder(BigInteger param0) {
        final Function function = new Function(FUNC_CURRENTHOLDER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Tuple3<String, BigInteger, String>> custodyHistory(BigInteger param0,
            BigInteger param1) {
        final Function function = new Function(FUNC_CUSTODYHISTORY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0), 
                new org.web3j.abi.datatypes.generated.Uint256(param1)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint64>() {}, new TypeReference<Address>() {}));
        return new RemoteFunctionCall<Tuple3<String, BigInteger, String>>(function,
                new Callable<Tuple3<String, BigInteger, String>>() {
                    @Override
                    public Tuple3<String, BigInteger, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<String, BigInteger, String>(
                                (String) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (String) results.get(2).getValue());
                    }
                });
    }

    public RemoteFunctionCall<Tuple2<Batch, String>> getBatch(BigInteger batchId) {
        final Function function = new Function(FUNC_GETBATCH, 
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

    public RemoteFunctionCall<String> honeyToken() {
        final Function function = new Function(FUNC_HONEYTOKEN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> maxSafeDurationMinutes() {
        final Function function = new Function(FUNC_MAXSAFEDURATIONMINUTES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> maxSafeTemperatureCelsius() {
        final Function function = new Function(FUNC_MAXSAFETEMPERATURECELSIUS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> nextBatchId() {
        final Function function = new Function(FUNC_NEXTBATCHID, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> processAndBottle(BigInteger batchId,
            List<BigInteger> jarSizesGrams, List<BigInteger> jarCounts) {
        final Function function = new Function(
                FUNC_PROCESSANDBOTTLE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint32>(
                        org.web3j.abi.datatypes.generated.Uint32.class,
                        org.web3j.abi.Utils.typeMap(jarSizesGrams, org.web3j.abi.datatypes.generated.Uint32.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.datatypes.generated.Uint256.class,
                        org.web3j.abi.Utils.typeMap(jarCounts, org.web3j.abi.datatypes.generated.Uint256.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> qualityIndex() {
        final Function function = new Function(FUNC_QUALITYINDEX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> recordTransportData(BigInteger batchId,
            BigInteger temperatureCelsius, BigInteger durationMinutes) {
        final Function function = new Function(
                FUNC_RECORDTRANSPORTDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Int256(temperatureCelsius), 
                new org.web3j.abi.datatypes.generated.Uint256(durationMinutes)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> recordWarehouseData(BigInteger batchId,
            BigInteger temperatureCelsius, BigInteger durationMinutes) {
        final Function function = new Function(
                FUNC_RECORDWAREHOUSEDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Int256(temperatureCelsius), 
                new org.web3j.abi.datatypes.generated.Uint256(durationMinutes)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> registerHarvestBatch(BigInteger harvestYear,
            List<BigInteger> standIds, List<BigInteger> locationQuantities) {
        final Function function = new Function(
                FUNC_REGISTERHARVESTBATCH, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint16(harvestYear), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.datatypes.generated.Uint256.class,
                        org.web3j.abi.Utils.typeMap(standIds, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.datatypes.generated.Uint256.class,
                        org.web3j.abi.Utils.typeMap(locationQuantities, org.web3j.abi.datatypes.generated.Uint256.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setMaxSafeDuration(BigInteger minutesValue) {
        final Function function = new Function(
                FUNC_SETMAXSAFEDURATION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(minutesValue)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setMaxSafeTemperature(BigInteger celsius) {
        final Function function = new Function(
                FUNC_SETMAXSAFETEMPERATURE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int256(celsius)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> transferCustody(BigInteger batchId, String to) {
        final Function function = new Function(
                FUNC_TRANSFERCUSTODY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.Address(160, to)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static SupplyChain load(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return new SupplyChain(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static SupplyChain load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new SupplyChain(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static SupplyChain load(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return new SupplyChain(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static SupplyChain load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new SupplyChain(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<SupplyChain> deploy(Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider, String actorRegistryAddress,
            String honeyTokenAddress, String qualityIndexAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, honeyTokenAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress)));
        return deployRemoteCall(SupplyChain.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    public static RemoteCall<SupplyChain> deploy(Web3j web3j, TransactionManager transactionManager,
            ContractGasProvider contractGasProvider, String actorRegistryAddress,
            String honeyTokenAddress, String qualityIndexAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, honeyTokenAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress)));
        return deployRemoteCall(SupplyChain.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<SupplyChain> deploy(Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit, String actorRegistryAddress,
            String honeyTokenAddress, String qualityIndexAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, honeyTokenAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress)));
        return deployRemoteCall(SupplyChain.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<SupplyChain> deploy(Web3j web3j, TransactionManager transactionManager,
            BigInteger gasPrice, BigInteger gasLimit, String actorRegistryAddress,
            String honeyTokenAddress, String qualityIndexAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorRegistryAddress), 
                new org.web3j.abi.datatypes.Address(160, honeyTokenAddress), 
                new org.web3j.abi.datatypes.Address(160, qualityIndexAddress)));
        return deployRemoteCall(SupplyChain.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
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

    public static class BatchBottledEventResponse extends BaseEventResponse {
        public BigInteger batchId;
    }
}

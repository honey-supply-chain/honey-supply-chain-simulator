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
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.CustomError;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint16;
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
public class ActorRegistry extends Contract {
    public static final String BINARY = "0x6080604052348015600e575f5ffd5b5060175f33601c565b5060c2565b5f828152602081815260408083206001600160a01b038516845290915281205460ff1660b9575f838152602081815260408083206001600160a01b03861684529091529020805460ff1916600117905560723390565b6001600160a01b0316826001600160a01b0316847f2f8788117e7eff1d82e926ec794901d17c78024a50270940304540a733656f0d60405160405180910390a450600160bc565b505f5b92915050565b610eef806100cf5f395ff3fe608060405234801561000f575f5ffd5b5060043610610127575f3560e01c806357b4a876116100a9578063a22d92551161006e578063a22d9255146102ff578063bd3070c614610326578063c602d3fb1461034d578063d547741f14610374578063eaa66a3c14610387575f5ffd5b806357b4a87614610284578063651e65b5146102975780638c64f57c146102be57806391d14854146102e5578063a217fddf146102f8575f5ffd5b8063288e3ad2116100ef578063288e3ad2146102025780632f2ff15d1461021757806336568abe1461022a5780634138d1671461023d5780634af913c91461025d575f5ffd5b806301ffc9a71461012b5780631d010ed5146101535780632115e7bf14610169578063236e09291461019e578063248a9ca3146101e0575b5f5ffd5b61013e610139366004610aaa565b6103a8565b60405190151581526020015b60405180910390f35b61015b6103de565b60405161014a929190610b30565b6101907f2a5f906c256a5d799494fcd066e1f6c077689de1cdb65052a1624de4bace99bf81565b60405190815260200161014a565b6101c86101ac366004610bf4565b60026020525f90815260409020805460019091015461ffff1682565b6040805192835261ffff90911660208301520161014a565b6101906101ee366004610c0d565b5f9081526020819052604090206001015490565b610215610210366004610c24565b6105bd565b005b610215610225366004610c67565b610634565b610215610238366004610c67565b61065e565b61025061024b366004610bf4565b610696565b60405161014a9190610c91565b6101907fb68a8381357ac987e0437efa112045a4b11b000847036dedb78e94b380456f3681565b610215610292366004610ca3565b610771565b6101907fd504ad34af20c88cc25749db9f004eb142411611de57205807393caa07db90d181565b6101907fd46c4e9aa6e966e36e1e5909588dbab2f671210ca4613e63fffcfcdfe2811d7181565b61013e6102f3366004610c67565b610874565b6101905f81565b6101907f2de3edc056fca4682a7d2a0a2d4d1642bb8c612d1ec41c57b521fabe9a9e136c81565b6101907f373fdac787be5578b9a3d4a9ca3e3ae1e632ab5ee4750e92f65223238a15b2ef81565b6101907fded9b5e0e0e3a2b3f09a0bc36ec64b9bf7a7c2319f3c4d9cff5ce48714257b2181565b610215610382366004610c67565b61089c565b61039a610395366004610bf4565b6108c0565b60405161014a929190610d21565b5f6001600160e01b03198216637965db0b60e01b14806103d857506301ffc9a760e01b6001600160e01b03198316145b92915050565b606080600380548060200260200160405190810160405280929190818152602001828054801561043557602002820191905f5260205f20905b81546001600160a01b03168152600190910190602001808311610417575b5050600354939550505067ffffffffffffffff821115905061045957610459610d44565b60405190808252806020026020018201604052801561049e57816020015b60408051808201909152606081525f60208201528152602001906001900390816104775790505b5090505f5b6003548110156105b85760015f600383815481106104c3576104c3610d58565b5f9182526020808320909101546001600160a01b031683528201929092526040908101909120815180830190925280548290829061050090610d6c565b80601f016020809104026020016040519081016040528092919081815260200182805461052c90610d6c565b80156105775780601f1061054e57610100808354040283529160200191610577565b820191905f5260205f20905b81548152906001019060200180831161055a57829003601f168201915b50505091835250506001919091015460ff16151560209091015282518390839081106105a5576105a5610d58565b60209081029190910101526001016104a3565b509091565b7f2de3edc056fca4682a7d2a0a2d4d1642bb8c612d1ec41c57b521fabe9a9e136c6105e781610964565b5060408051808201825292835261ffff91821660208085019182526001600160a01b03959095165f908152600290955293209151825591516001909101805461ffff191691909216179055565b5f8281526020819052604090206001015461064e81610964565b6106588383610971565b50505050565b6001600160a01b03811633146106875760405163334bd91960e11b815260040160405180910390fd5b6106918282610a00565b505050565b60408051808201909152606081525f60208201526001600160a01b0382165f908152600160205260409081902081518083019092528054829082906106da90610d6c565b80601f016020809104026020016040519081016040528092919081815260200182805461070690610d6c565b80156107515780601f1061072857610100808354040283529160200191610751565b820191905f5260205f20905b81548152906001019060200180831161073457829003601f168201915b50505091835250506001919091015460ff16151560209091015292915050565b5f61077b81610964565b6001600160a01b0384165f908152600160208190526040909120015460ff166107e957600380546001810182555f919091527fc2575a0e9e593c00f959f8c92f12db2869c3395a3b0502d05e2516446f71f85b0180546001600160a01b0319166001600160a01b0386161790555b6040805160606020601f860181900402820181018352918101848152909182919086908690819085018382808284375f9201829052509385525050600160209384018190526001600160a01b038916835290925260409020825190915081906108529082610dfa565b50602091909101516001909101805460ff191691151591909117905550505050565b5f918252602082815260408084206001600160a01b0393909316845291905290205460ff1690565b5f828152602081905260409020600101546108b681610964565b6106588383610a00565b60016020525f90815260409020805481906108da90610d6c565b80601f016020809104026020016040519081016040528092919081815260200182805461090690610d6c565b80156109515780601f1061092857610100808354040283529160200191610951565b820191905f5260205f20905b81548152906001019060200180831161093457829003601f168201915b5050506001909301549192505060ff1682565b61096e8133610a69565b50565b5f61097c8383610874565b6109f9575f838152602081815260408083206001600160a01b03861684529091529020805460ff191660011790556109b13390565b6001600160a01b0316826001600160a01b0316847f2f8788117e7eff1d82e926ec794901d17c78024a50270940304540a733656f0d60405160405180910390a45060016103d8565b505f6103d8565b5f610a0b8383610874565b156109f9575f838152602081815260408083206001600160a01b0386168085529252808320805460ff1916905551339286917ff6391f5c32d9c69d2a47ea670b442974b53935d1edc7fd64eb21e047a839171b9190a45060016103d8565b610a738282610874565b610aa65760405163e2517d3f60e01b81526001600160a01b03821660048201526024810183905260440160405180910390fd5b5050565b5f60208284031215610aba575f5ffd5b81356001600160e01b031981168114610ad1575f5ffd5b9392505050565b5f81518084528060208401602086015e5f602082860101526020601f19601f83011685010191505092915050565b5f815160408452610b1a6040850182610ad8565b6020938401511515949093019390935250919050565b604080825283519082018190525f9060208501906060840190835b81811015610b725783516001600160a01b0316835260209384019390920191600101610b4b565b50508381036020850152809150845180825260208201925060208160051b830101602087015f5b83811015610bcb57601f19858403018652610bb5838351610b06565b6020968701969093509190910190600101610b99565b509098975050505050505050565b80356001600160a01b0381168114610bef575f5ffd5b919050565b5f60208284031215610c04575f5ffd5b610ad182610bd9565b5f60208284031215610c1d575f5ffd5b5035919050565b5f5f5f60608486031215610c36575f5ffd5b610c3f84610bd9565b925060208401359150604084013561ffff81168114610c5c575f5ffd5b809150509250925092565b5f5f60408385031215610c78575f5ffd5b82359150610c8860208401610bd9565b90509250929050565b602081525f610ad16020830184610b06565b5f5f5f60408486031215610cb5575f5ffd5b610cbe84610bd9565b9250602084013567ffffffffffffffff811115610cd9575f5ffd5b8401601f81018613610ce9575f5ffd5b803567ffffffffffffffff811115610cff575f5ffd5b866020828401011115610d10575f5ffd5b939660209190910195509293505050565b604081525f610d336040830185610ad8565b905082151560208301529392505050565b634e487b7160e01b5f52604160045260245ffd5b634e487b7160e01b5f52603260045260245ffd5b600181811c90821680610d8057607f821691505b602082108103610d9e57634e487b7160e01b5f52602260045260245ffd5b50919050565b601f821115610691578282111561069157805f5260205f20601f840160051c6020851015610dcf57505f5b90810190601f840160051c035f5b81811015610df2575f83820155600101610ddd565b505050505050565b815167ffffffffffffffff811115610e1457610e14610d44565b610e2881610e228454610d6c565b84610da4565b6020601f821160018114610e5a575f8315610e435750848201515b5f19600385901b1c1916600184901b178455610eb2565b5f84815260208120601f198516915b82811015610e895787850151825560209485019460019092019101610e69565b5084821015610ea657868401515f19600387901b60f8161c191681555b505060018360011b0184555b505050505056fea26469706673582212208e5ab0e7d3ec9cf937b79c1ce10265fc73a19ba4fffb696f2f03a28b1a088b3964736f6c63430008220033";

    private static String librariesLinkedBinary;

    public static final String FUNC_AWARD_BODY_ROLE = "AWARD_BODY_ROLE";

    public static final String FUNC_BEEKEEPER_ROLE = "BEEKEEPER_ROLE";

    public static final String FUNC_BOTTLER_ROLE = "BOTTLER_ROLE";

    public static final String FUNC_CERTIFICATION_BODY_ROLE = "CERTIFICATION_BODY_ROLE";

    public static final String FUNC_DEFAULT_ADMIN_ROLE = "DEFAULT_ADMIN_ROLE";

    public static final String FUNC_LAB_ROLE = "LAB_ROLE";

    public static final String FUNC_LOGISTICS_ROLE = "LOGISTICS_ROLE";

    public static final String FUNC_RETAILER_ROLE = "RETAILER_ROLE";

    public static final String FUNC_ACTORS = "actors";

    public static final String FUNC_CERTIFICATIONS = "certifications";

    public static final String FUNC_GETACTOR = "getActor";

    public static final String FUNC_GETALLACTORS = "getAllActors";

    public static final String FUNC_GETROLEADMIN = "getRoleAdmin";

    public static final String FUNC_GRANTROLE = "grantRole";

    public static final String FUNC_HASROLE = "hasRole";

    public static final String FUNC_REGISTERACTOR = "registerActor";

    public static final String FUNC_RENOUNCEROLE = "renounceRole";

    public static final String FUNC_REVOKEROLE = "revokeRole";

    public static final String FUNC_SETCERTIFICATION = "setCertification";

    public static final String FUNC_SUPPORTSINTERFACE = "supportsInterface";

    public static final CustomError ACCESSCONTROLBADCONFIRMATION_ERROR = new CustomError("AccessControlBadConfirmation", 
            Arrays.<TypeReference<?>>asList());
    ;

    public static final CustomError ACCESSCONTROLUNAUTHORIZEDACCOUNT_ERROR = new CustomError("AccessControlUnauthorizedAccount", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Bytes32>() {}));
    ;

    public static final Event ROLEADMINCHANGED_EVENT = new Event("RoleAdminChanged", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<Bytes32>(true) {}, new TypeReference<Bytes32>(true) {}));
    ;

    public static final Event ROLEGRANTED_EVENT = new Event("RoleGranted", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}));
    ;

    public static final Event ROLEREVOKED_EVENT = new Event("RoleRevoked", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}));
    ;

    @Deprecated
    protected ActorRegistry(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected ActorRegistry(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected ActorRegistry(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected ActorRegistry(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static List<RoleAdminChangedEventResponse> getRoleAdminChangedEvents(
            TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(ROLEADMINCHANGED_EVENT, transactionReceipt);
        ArrayList<RoleAdminChangedEventResponse> responses = new ArrayList<RoleAdminChangedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            RoleAdminChangedEventResponse typedResponse = new RoleAdminChangedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.role = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.previousAdminRole = (byte[]) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.newAdminRole = (byte[]) eventValues.getIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static RoleAdminChangedEventResponse getRoleAdminChangedEventFromLog(Log log) {
        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(ROLEADMINCHANGED_EVENT, log);
        RoleAdminChangedEventResponse typedResponse = new RoleAdminChangedEventResponse();
        typedResponse.log = log;
        typedResponse.role = (byte[]) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.previousAdminRole = (byte[]) eventValues.getIndexedValues().get(1).getValue();
        typedResponse.newAdminRole = (byte[]) eventValues.getIndexedValues().get(2).getValue();
        return typedResponse;
    }

    public Flowable<RoleAdminChangedEventResponse> roleAdminChangedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getRoleAdminChangedEventFromLog(log));
    }

    public Flowable<RoleAdminChangedEventResponse> roleAdminChangedEventFlowable(
            DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ROLEADMINCHANGED_EVENT));
        return roleAdminChangedEventFlowable(filter);
    }

    public static List<RoleGrantedEventResponse> getRoleGrantedEvents(
            TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(ROLEGRANTED_EVENT, transactionReceipt);
        ArrayList<RoleGrantedEventResponse> responses = new ArrayList<RoleGrantedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            RoleGrantedEventResponse typedResponse = new RoleGrantedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.role = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.account = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.sender = (String) eventValues.getIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static RoleGrantedEventResponse getRoleGrantedEventFromLog(Log log) {
        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(ROLEGRANTED_EVENT, log);
        RoleGrantedEventResponse typedResponse = new RoleGrantedEventResponse();
        typedResponse.log = log;
        typedResponse.role = (byte[]) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.account = (String) eventValues.getIndexedValues().get(1).getValue();
        typedResponse.sender = (String) eventValues.getIndexedValues().get(2).getValue();
        return typedResponse;
    }

    public Flowable<RoleGrantedEventResponse> roleGrantedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getRoleGrantedEventFromLog(log));
    }

    public Flowable<RoleGrantedEventResponse> roleGrantedEventFlowable(
            DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ROLEGRANTED_EVENT));
        return roleGrantedEventFlowable(filter);
    }

    public static List<RoleRevokedEventResponse> getRoleRevokedEvents(
            TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(ROLEREVOKED_EVENT, transactionReceipt);
        ArrayList<RoleRevokedEventResponse> responses = new ArrayList<RoleRevokedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            RoleRevokedEventResponse typedResponse = new RoleRevokedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.role = (byte[]) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.account = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.sender = (String) eventValues.getIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static RoleRevokedEventResponse getRoleRevokedEventFromLog(Log log) {
        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(ROLEREVOKED_EVENT, log);
        RoleRevokedEventResponse typedResponse = new RoleRevokedEventResponse();
        typedResponse.log = log;
        typedResponse.role = (byte[]) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.account = (String) eventValues.getIndexedValues().get(1).getValue();
        typedResponse.sender = (String) eventValues.getIndexedValues().get(2).getValue();
        return typedResponse;
    }

    public Flowable<RoleRevokedEventResponse> roleRevokedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getRoleRevokedEventFromLog(log));
    }

    public Flowable<RoleRevokedEventResponse> roleRevokedEventFlowable(
            DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ROLEREVOKED_EVENT));
        return roleRevokedEventFlowable(filter);
    }

    public RemoteFunctionCall<byte[]> AWARD_BODY_ROLE() {
        final Function function = new Function(FUNC_AWARD_BODY_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> BEEKEEPER_ROLE() {
        final Function function = new Function(FUNC_BEEKEEPER_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> BOTTLER_ROLE() {
        final Function function = new Function(FUNC_BOTTLER_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> CERTIFICATION_BODY_ROLE() {
        final Function function = new Function(FUNC_CERTIFICATION_BODY_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> DEFAULT_ADMIN_ROLE() {
        final Function function = new Function(FUNC_DEFAULT_ADMIN_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> LAB_ROLE() {
        final Function function = new Function(FUNC_LAB_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> LOGISTICS_ROLE() {
        final Function function = new Function(FUNC_LOGISTICS_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<byte[]> RETAILER_ROLE() {
        final Function function = new Function(FUNC_RETAILER_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<Tuple2<String, Boolean>> actors(String param0) {
        final Function function = new Function(FUNC_ACTORS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Bool>() {}));
        return new RemoteFunctionCall<Tuple2<String, Boolean>>(function,
                new Callable<Tuple2<String, Boolean>>() {
                    @Override
                    public Tuple2<String, Boolean> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<String, Boolean>(
                                (String) results.get(0).getValue(), 
                                (Boolean) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<Tuple2<byte[], BigInteger>> certifications(String param0) {
        final Function function = new Function(FUNC_CERTIFICATIONS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}, new TypeReference<Uint16>() {}));
        return new RemoteFunctionCall<Tuple2<byte[], BigInteger>>(function,
                new Callable<Tuple2<byte[], BigInteger>>() {
                    @Override
                    public Tuple2<byte[], BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<byte[], BigInteger>(
                                (byte[]) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<Actor> getActor(String actorAddress) {
        final Function function = new Function(FUNC_GETACTOR, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorAddress)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Actor>() {}));
        return executeRemoteCallSingleValueReturn(function, Actor.class);
    }

    public RemoteFunctionCall<Tuple2<List<String>, List<Actor>>> getAllActors() {
        final Function function = new Function(FUNC_GETALLACTORS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}, new TypeReference<DynamicArray<Actor>>() {}));
        return new RemoteFunctionCall<Tuple2<List<String>, List<Actor>>>(function,
                new Callable<Tuple2<List<String>, List<Actor>>>() {
                    @Override
                    public Tuple2<List<String>, List<Actor>> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<List<String>, List<Actor>>(
                                convertToNative((List<Address>) results.get(0).getValue()), 
                                convertToNative((List<Actor>) results.get(1).getValue()));
                    }
                });
    }

    public RemoteFunctionCall<byte[]> getRoleAdmin(byte[] role) {
        final Function function = new Function(FUNC_GETROLEADMIN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(role)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteFunctionCall<TransactionReceipt> grantRole(byte[] role, String account) {
        final Function function = new Function(
                FUNC_GRANTROLE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(role), 
                new org.web3j.abi.datatypes.Address(160, account)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> hasRole(byte[] role, String account) {
        final Function function = new Function(FUNC_HASROLE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(role), 
                new org.web3j.abi.datatypes.Address(160, account)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> registerActor(String actorAddress, String name) {
        final Function function = new Function(
                FUNC_REGISTERACTOR, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorAddress), 
                new org.web3j.abi.datatypes.Utf8String(name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> renounceRole(byte[] role,
            String callerConfirmation) {
        final Function function = new Function(
                FUNC_RENOUNCEROLE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(role), 
                new org.web3j.abi.datatypes.Address(160, callerConfirmation)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> revokeRole(byte[] role, String account) {
        final Function function = new Function(
                FUNC_REVOKEROLE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(role), 
                new org.web3j.abi.datatypes.Address(160, account)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setCertification(String actorAddress,
            byte[] ipfsCid, BigInteger organicScore) {
        final Function function = new Function(
                FUNC_SETCERTIFICATION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, actorAddress), 
                new org.web3j.abi.datatypes.generated.Bytes32(ipfsCid), 
                new org.web3j.abi.datatypes.generated.Uint16(organicScore)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> supportsInterface(byte[] interfaceId) {
        final Function function = new Function(FUNC_SUPPORTSINTERFACE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes4(interfaceId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    @Deprecated
    public static ActorRegistry load(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return new ActorRegistry(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static ActorRegistry load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ActorRegistry(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static ActorRegistry load(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return new ActorRegistry(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ActorRegistry load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new ActorRegistry(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ActorRegistry> deploy(Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ActorRegistry.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), "");
    }

    public static RemoteCall<ActorRegistry> deploy(Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ActorRegistry.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), "");
    }

    @Deprecated
    public static RemoteCall<ActorRegistry> deploy(Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ActorRegistry.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), "");
    }

    @Deprecated
    public static RemoteCall<ActorRegistry> deploy(Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ActorRegistry.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), "");
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

    public static class Actor extends DynamicStruct {
        public String name;

        public Boolean registered;

        public Actor(String name, Boolean registered) {
            super(new org.web3j.abi.datatypes.Utf8String(name), 
                    new org.web3j.abi.datatypes.Bool(registered));
            this.name = name;
            this.registered = registered;
        }

        public Actor(Utf8String name, Bool registered) {
            super(name, registered);
            this.name = name.getValue();
            this.registered = registered.getValue();
        }
    }

    public static class RoleAdminChangedEventResponse extends BaseEventResponse {
        public byte[] role;

        public byte[] previousAdminRole;

        public byte[] newAdminRole;
    }

    public static class RoleGrantedEventResponse extends BaseEventResponse {
        public byte[] role;

        public String account;

        public String sender;
    }

    public static class RoleRevokedEventResponse extends BaseEventResponse {
        public byte[] role;

        public String account;

        public String sender;
    }
}

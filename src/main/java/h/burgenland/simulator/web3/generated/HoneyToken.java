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
import org.web3j.abi.datatypes.Array;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.CustomError;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint32;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple5;
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
public class HoneyToken extends Contract {
    public static final String BINARY = "0x608060405234801561000f575f5ffd5b50604051611de8380380611de883398101604081905261002e916100ec565b338161003981610077565b506001600160a01b03811661006757604051631e4fbdf760e01b81525f600482015260240160405180910390fd5b61007081610087565b50506102e9565b6002610083828261022b565b5050565b600380546001600160a01b038381166001600160a01b0319831681179093556040519116919082907f8be0079c531659141344cd1fd0a4f28419497f9722a3daafe3b4186f6b6457e0905f90a35050565b634e487b7160e01b5f52604160045260245ffd5b5f602082840312156100fc575f5ffd5b81516001600160401b03811115610111575f5ffd5b8201601f81018413610121575f5ffd5b80516001600160401b0381111561013a5761013a6100d8565b604051601f8201601f19908116603f011681016001600160401b0381118282101715610168576101686100d8565b60405281815282820160200186101561017f575f5ffd5b8160208401602083015e5f91810160200191909152949350505050565b600181811c908216806101b057607f821691505b6020821081036101ce57634e487b7160e01b5f52602260045260245ffd5b50919050565b601f821115610226578282111561022657805f5260205f20601f840160051c60208510156101ff57505f5b90810190601f840160051c035f5b81811015610222575f8382015560010161020d565b5050505b505050565b81516001600160401b03811115610244576102446100d8565b61025881610252845461019c565b846101d4565b6020601f82116001811461028a575f83156102735750848201515b5f19600385901b1c1916600184901b1784556102e2565b5f84815260208120601f198516915b828110156102b95787850151825560209485019460019092019101610299565b50848210156102d657868401515f19600387901b60f8161c191681555b505060018360011b0184555b5050505050565b611af2806102f65f395ff3fe608060405234801561000f575f5ffd5b5060043610610126575f3560e01c806391e5a2c1116100a9578063b09afec11161006e578063b09afec1146102c3578063e985e9c51461030b578063f242432a14610346578063f2fde38b14610359578063f66fb5681461036c575f5ffd5b806391e5a2c1146102585780639d4cf7bb14610277578063a22cb4651461028a578063a50388a21461029d578063ad6d3137146102b0575f5ffd5b80634e1273f4116100ef5780634e1273f4146101d2578063715018a6146101f25780637ee35ef3146101fa57806388d84b661461021c5780638da5cb5b14610247575f5ffd5b8062fdd58e1461012a57806301ffc9a7146101505780630e89341c1461017357806310b0a700146101935780632eb2c2d6146101bd575b5f5ffd5b61013d610138366004611314565b61037f565b6040519081526020015b60405180910390f35b61016361015e366004611351565b6103a6565b6040519015158152602001610147565b610186610181366004611373565b6103f5565b60405161014791906113b8565b61013d6101a13660046113dd565b63ffffffff60df1b60df82901b168217600160ff1b1792915050565b6101d06101cb366004611542565b610487565b005b6101e56101e03660046115ee565b6104a6565b60405161014791906116e9565b6101d0610575565b610163610208366004611373565b60066020525f908152604090205460ff1681565b60045461022f906001600160a01b031681565b6040516001600160a01b039091168152602001610147565b6003546001600160a01b031661022f565b61013d610266366004611373565b60056020525f908152604090205481565b6101d0610285366004611373565b610588565b6101d06102983660046116fb565b6105cc565b6101d06102ab36600461177b565b6105db565b6101d06102be366004611812565b61090e565b6102d66102d1366004611373565b610938565b60408051958652931515602086015263ffffffff9092169284019290925260608301919091521515608082015260a001610147565b61016361031936600461182b565b6001600160a01b039182165f90815260016020908152604080832093909416825291909152205460ff1690565b6101d0610354366004611853565b61098f565b6101d0610367366004611812565b6109a5565b6101d061037a3660046118a6565b6109e2565b5f818152602081815260408083206001600160a01b03861684529091529020545b92915050565b5f6001600160e01b03198216636cdb3d1360e11b14806103d657506001600160e01b031982166303a24d0760e21b145b806103a057506301ffc9a760e01b6001600160e01b03198316146103a0565b606060028054610404906118d8565b80601f0160208091040260200160405190810160405280929190818152602001828054610430906118d8565b801561047b5780601f106104525761010080835404028352916020019161047b565b820191905f5260205f20905b81548152906001019060200180831161045e57829003601f168201915b50505050509050919050565b610492335b86610af6565b61049f8585858585610b6e565b5050505050565b606081518351146104dc5781518351604051635b05999160e01b8152600481019290925260248201526044015b60405180910390fd5b5f83516001600160401b038111156104f6576104f6611407565b60405190808252806020026020018201604052801561051f578160200160208202803683370190505b5090505f5b845181101561056d576020808202860101516105489060208084028701015161037f565b82828151811061055a5761055a611910565b6020908102919091010152600101610524565b509392505050565b61057d610bce565b6105865f610bfb565b565b6004546001600160a01b031633146105b25760405162461bcd60e51b81526004016104d390611924565b5f908152600660205260409020805460ff19166001179055565b6105d7338383610c4c565b5050565b6004546001600160a01b031633146106055760405162461bcd60e51b81526004016104d390611924565b5f8781526005602052604090205461065f5760405162461bcd60e51b815260206004820152601960248201527f486f6e6579546f6b656e3a20756e6b6e6f776e2062617463680000000000000060448201526064016104d3565b5f8781526006602052604090205460ff16156106c95760405162461bcd60e51b815260206004820152602360248201527f486f6e6579546f6b656e3a20626174636820616c72656164792070726f6365736044820152621cd95960ea1b60648201526084016104d3565b8382146107185760405162461bcd60e51b815260206004820152601b60248201527f486f6e6579546f6b656e3a206c656e677468206d69736d61746368000000000060448201526064016104d3565b5f805b858110156108025761075287878381811061073857610738611910565b905060200201602081019061074d9190611969565b610d09565b61079e5760405162461bcd60e51b815260206004820181905260248201527f486f6e6579546f6b656e3a20756e737570706f72746564206a61722073697a6560448201526064016104d3565b8484828181106107b0576107b0611910565b905060200201358787838181106107c9576107c9611910565b90506020020160208101906107de9190611969565b63ffffffff166107ee9190611996565b6107f890836119ad565b915060010161071b565b505f888152600560205260409020548111156108755760405162461bcd60e51b815260206004820152602c60248201527f486f6e6579546f6b656e3a206a617220746f74616c206578636565647320626160448201526b746368207175616e7469747960a01b60648201526084016104d3565b5f888152600560205260409020546108909088908a90610d3d565b5f5b85811015610903575f6108c68a8989858181106108b1576108b1611910565b90506020020160208101906101a19190611969565b90506108fa84828888868181106108df576108df611910565b9050602002013560405180602001604052805f815250610da4565b50600101610892565b505050505050505050565b610916610bce565b600480546001600160a01b0319166001600160a01b0392909216919091179055565b5f600160ff1b8216151560df83901c63ffffffff16828061095e6001600160df1b6119c0565b9095165f818152600560209081526040808320546006909252909120549197949650929450919260ff909216919050565b6109983361048c565b61049f8585858585610e08565b6109ad610bce565b6001600160a01b0381166109d657604051631e4fbdf760e01b81525f60048201526024016104d3565b6109df81610bfb565b50565b6004546001600160a01b03163314610a0c5760405162461bcd60e51b81526004016104d390611924565b610a1b6001600160df1b6119c0565b831115610a6a5760405162461bcd60e51b815260206004820152601d60248201527f486f6e6579546f6b656e3a206261746368496420746f6f206c6172676500000060448201526064016104d3565b5f8381526005602052604090205415610ac55760405162461bcd60e51b815260206004820181905260248201527f486f6e6579546f6b656e3a20626174636820616c7265616479206d696e74656460448201526064016104d3565b5f83815260056020908152604080832085905580519182019052908152610af190829085908590610da4565b505050565b816001600160a01b0316816001600160a01b031614158015610b3d57506001600160a01b038082165f9081526001602090815260408083209386168352929052205460ff16155b156105d75760405163711bec9160e11b81526001600160a01b038084166004830152821660248201526044016104d3565b6001600160a01b038416610b9757604051632bfa23e760e11b81525f60048201526024016104d3565b6001600160a01b038516610bbf57604051626a0d4560e21b81525f60048201526024016104d3565b61049f85858585856001610e95565b6003546001600160a01b031633146105865760405163118cdaa760e01b81523360048201526024016104d3565b600380546001600160a01b038381166001600160a01b0319831681179093556040519116919082907f8be0079c531659141344cd1fd0a4f28419497f9722a3daafe3b4186f6b6457e0905f90a35050565b6001600160a01b038316610c7557604051631f18c42760e11b81525f60048201526024016104d3565b6001600160a01b038216610c9d5760405162ced3e160e81b81525f60048201526024016104d3565b6001600160a01b038381165f81815260016020908152604080832094871680845294825291829020805460ff191686151590811790915591519182527f17307eab39ab6107e8899845ad3d59bd9653f200f220920489ca2b5937696c31910160405180910390a3505050565b5f63ffffffff82166103e81480610d27575063ffffffff82166101f4145b806103a0575063ffffffff821660fa1492915050565b6001600160a01b038316610d6557604051626a0d4560e21b81525f60048201526024016104d3565b604080516001808252602082018590528183019081526060820184905260a082019092525f6080820181815291929161049f9187918590859083610e95565b6001600160a01b038416610dcd57604051632bfa23e760e11b81525f60048201526024016104d3565b60408051600180825260208201869052818301908152606082018590526080820190925290610e005f8784848784610e95565b505050505050565b6001600160a01b038416610e3157604051632bfa23e760e11b81525f60048201526024016104d3565b6001600160a01b038516610e5957604051626a0d4560e21b81525f60048201526024016104d3565b60408051600180825260208201869052818301908152606082018590526080820190925290610e8c87878484875f610e95565b50505050505050565b610ea186868686610ee2565b6001600160a01b03851615610e0057338115610eca57610ec58188888888886110f1565b610e8c565b60208581015190850151610903838a8a85858a611212565b8051825114610f115781518151604051635b05999160e01b8152600481019290925260248201526044016104d3565b335f5b8351811015611013576020818102858101820151908501909101516001600160a01b03881615610fc5575f828152602081815260408083206001600160a01b038c16845290915290205481811015610f9f576040516303dee4c560e01b81526001600160a01b038a1660048201526024810182905260448101839052606481018490526084016104d3565b5f838152602081815260408083206001600160a01b038d16845290915290209082900390555b6001600160a01b03871615611009575f828152602081815260408083206001600160a01b038b168452909152812080548392906110039084906119ad565b90915550505b5050600101610f14565b5082516001036110935760208301515f906020840151909150856001600160a01b0316876001600160a01b0316846001600160a01b03167fc3d58168c5ae7397731d063d5bbf3d657854427343f4c083240f7aacaa2d0f628585604051611084929190918252602082015260400190565b60405180910390a4505061049f565b836001600160a01b0316856001600160a01b0316826001600160a01b03167f4a39dc06d4c0dbc64b70af90fd698a233a518aa5d07e595d983b8c0526c8f7fb86866040516110e29291906119d3565b60405180910390a45050505050565b6001600160a01b0384163b15610e005760405163bc197c8160e01b81526001600160a01b0385169063bc197c81906111359089908990889088908890600401611a00565b6020604051808303815f875af192505050801561116f575060408051601f3d908101601f1916820190925261116c91810190611a5d565b60015b6111d6573d80801561119c576040519150601f19603f3d011682016040523d82523d5f602084013e6111a1565b606091505b5080515f036111ce57604051632bfa23e760e11b81526001600160a01b03861660048201526024016104d3565b805160208201fd5b6001600160e01b0319811663bc197c8160e01b14610e8c57604051632bfa23e760e11b81526001600160a01b03861660048201526024016104d3565b6001600160a01b0384163b15610e005760405163f23a6e6160e01b81526001600160a01b0385169063f23a6e61906112569089908990889088908890600401611a78565b6020604051808303815f875af1925050508015611290575060408051601f3d908101601f1916820190925261128d91810190611a5d565b60015b6112bd573d80801561119c576040519150601f19603f3d011682016040523d82523d5f602084013e6111a1565b6001600160e01b0319811663f23a6e6160e01b14610e8c57604051632bfa23e760e11b81526001600160a01b03861660048201526024016104d3565b80356001600160a01b038116811461130f575f5ffd5b919050565b5f5f60408385031215611325575f5ffd5b61132e836112f9565b946020939093013593505050565b6001600160e01b0319811681146109df575f5ffd5b5f60208284031215611361575f5ffd5b813561136c8161133c565b9392505050565b5f60208284031215611383575f5ffd5b5035919050565b5f81518084528060208401602086015e5f602082860101526020601f19601f83011685010191505092915050565b602081525f61136c602083018461138a565b803563ffffffff8116811461130f575f5ffd5b5f5f604083850312156113ee575f5ffd5b823591506113fe602084016113ca565b90509250929050565b634e487b7160e01b5f52604160045260245ffd5b604051601f8201601f191681016001600160401b038111828210171561144357611443611407565b604052919050565b5f6001600160401b0382111561146357611463611407565b5060051b60200190565b5f82601f83011261147c575f5ffd5b813561148f61148a8261144b565b61141b565b8082825260208201915060208360051b8601019250858311156114b0575f5ffd5b602085015b838110156114cd5780358352602092830192016114b5565b5095945050505050565b5f82601f8301126114e6575f5ffd5b81356001600160401b038111156114ff576114ff611407565b611512601f8201601f191660200161141b565b818152846020838601011115611526575f5ffd5b816020850160208301375f918101602001919091529392505050565b5f5f5f5f5f60a08688031215611556575f5ffd5b61155f866112f9565b945061156d602087016112f9565b935060408601356001600160401b03811115611587575f5ffd5b6115938882890161146d565b93505060608601356001600160401b038111156115ae575f5ffd5b6115ba8882890161146d565b92505060808601356001600160401b038111156115d5575f5ffd5b6115e1888289016114d7565b9150509295509295909350565b5f5f604083850312156115ff575f5ffd5b82356001600160401b03811115611614575f5ffd5b8301601f81018513611624575f5ffd5b803561163261148a8261144b565b8082825260208201915060208360051b850101925087831115611653575f5ffd5b6020840193505b8284101561167c5761166b846112f9565b82526020938401939091019061165a565b945050505060208301356001600160401b03811115611699575f5ffd5b6116a58582860161146d565b9150509250929050565b5f8151808452602084019350602083015f5b828110156116df5781518652602095860195909101906001016116c1565b5093949350505050565b602081525f61136c60208301846116af565b5f5f6040838503121561170c575f5ffd5b611715836112f9565b915060208301358015158114611729575f5ffd5b809150509250929050565b5f5f83601f840112611744575f5ffd5b5081356001600160401b0381111561175a575f5ffd5b6020830191508360208260051b8501011115611774575f5ffd5b9250929050565b5f5f5f5f5f5f5f60a0888a031215611791575f5ffd5b873596506117a1602089016112f9565b955060408801356001600160401b038111156117bb575f5ffd5b6117c78a828b01611734565b90965094505060608801356001600160401b038111156117e5575f5ffd5b6117f18a828b01611734565b90945092506118049050608089016112f9565b905092959891949750929550565b5f60208284031215611822575f5ffd5b61136c826112f9565b5f5f6040838503121561183c575f5ffd5b611845836112f9565b91506113fe602084016112f9565b5f5f5f5f5f60a08688031215611867575f5ffd5b611870866112f9565b945061187e602087016112f9565b9350604086013592506060860135915060808601356001600160401b038111156115d5575f5ffd5b5f5f5f606084860312156118b8575f5ffd5b83359250602084013591506118cf604085016112f9565b90509250925092565b600181811c908216806118ec57607f821691505b60208210810361190a57634e487b7160e01b5f52602260045260245ffd5b50919050565b634e487b7160e01b5f52603260045260245ffd5b60208082526025908201527f486f6e6579546f6b656e3a2063616c6c6572206973206e6f7420537570706c7960408201526421b430b4b760d91b606082015260800190565b5f60208284031215611979575f5ffd5b61136c826113ca565b634e487b7160e01b5f52601160045260245ffd5b80820281158282048414176103a0576103a0611982565b808201808211156103a0576103a0611982565b818103818111156103a0576103a0611982565b604081525f6119e560408301856116af565b82810360208401526119f781856116af565b95945050505050565b6001600160a01b0386811682528516602082015260a0604082018190525f90611a2b908301866116af565b8281036060840152611a3d81866116af565b90508281036080840152611a51818561138a565b98975050505050505050565b5f60208284031215611a6d575f5ffd5b815161136c8161133c565b6001600160a01b03868116825285166020820152604081018490526060810183905260a0608082018190525f90611ab19083018461138a565b97965050505050505056fea2646970667358221220d1f8f044ca6681f10f1a717efd5651c2c4bcee3c7917b75c09c21015615326a664736f6c63430008220033";

    private static String librariesLinkedBinary;

    public static final String FUNC_BALANCEOF = "balanceOf";

    public static final String FUNC_BALANCEOFBATCH = "balanceOfBatch";

    public static final String FUNC_BATCHQUANTITIES = "batchQuantities";

    public static final String FUNC_GETTOKENDATA = "getTokenData";

    public static final String FUNC_ISAPPROVEDFORALL = "isApprovedForAll";

    public static final String FUNC_JARTOKENID = "jarTokenId";

    public static final String FUNC_MARKBATCHPROCESSED = "markBatchProcessed";

    public static final String FUNC_MINTBULKBATCH = "mintBulkBatch";

    public static final String FUNC_MINTJARS = "mintJars";

    public static final String FUNC_OWNER = "owner";

    public static final String FUNC_PROCESSEDBATCHES = "processedBatches";

    public static final String FUNC_RENOUNCEOWNERSHIP = "renounceOwnership";

    public static final String FUNC_SAFEBATCHTRANSFERFROM = "safeBatchTransferFrom";

    public static final String FUNC_SAFETRANSFERFROM = "safeTransferFrom";

    public static final String FUNC_SETAPPROVALFORALL = "setApprovalForAll";

    public static final String FUNC_SETSUPPLYCHAIN = "setSupplyChain";

    public static final String FUNC_SUPPLYCHAIN = "supplyChain";

    public static final String FUNC_SUPPORTSINTERFACE = "supportsInterface";

    public static final String FUNC_TRANSFEROWNERSHIP = "transferOwnership";

    public static final String FUNC_URI = "uri";

    public static final CustomError ERC1155INSUFFICIENTBALANCE_ERROR = new CustomError("ERC1155InsufficientBalance", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
    ;

    public static final CustomError ERC1155INVALIDAPPROVER_ERROR = new CustomError("ERC1155InvalidApprover", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    ;

    public static final CustomError ERC1155INVALIDARRAYLENGTH_ERROR = new CustomError("ERC1155InvalidArrayLength", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
    ;

    public static final CustomError ERC1155INVALIDOPERATOR_ERROR = new CustomError("ERC1155InvalidOperator", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    ;

    public static final CustomError ERC1155INVALIDRECEIVER_ERROR = new CustomError("ERC1155InvalidReceiver", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    ;

    public static final CustomError ERC1155INVALIDSENDER_ERROR = new CustomError("ERC1155InvalidSender", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    ;

    public static final CustomError ERC1155MISSINGAPPROVALFORALL_ERROR = new CustomError("ERC1155MissingApprovalForAll", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}));
    ;

    public static final CustomError OWNABLEINVALIDOWNER_ERROR = new CustomError("OwnableInvalidOwner", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    ;

    public static final CustomError OWNABLEUNAUTHORIZEDACCOUNT_ERROR = new CustomError("OwnableUnauthorizedAccount", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    ;

    public static final Event APPROVALFORALL_EVENT = new Event("ApprovalForAll", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Bool>() {}));
    ;

    public static final Event OWNERSHIPTRANSFERRED_EVENT = new Event("OwnershipTransferred", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}));
    ;

    public static final Event TRANSFERBATCH_EVENT = new Event("TransferBatch", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<DynamicArray<Uint256>>() {}, new TypeReference<DynamicArray<Uint256>>() {}));
    ;

    public static final Event TRANSFERSINGLE_EVENT = new Event("TransferSingle", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event URI_EVENT = new Event("URI", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Uint256>(true) {}));
    ;

    @Deprecated
    protected HoneyToken(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected HoneyToken(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected HoneyToken(String contractAddress, Web3j web3j, TransactionManager transactionManager,
            BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected HoneyToken(String contractAddress, Web3j web3j, TransactionManager transactionManager,
            ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static List<ApprovalForAllEventResponse> getApprovalForAllEvents(
            TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(APPROVALFORALL_EVENT, transactionReceipt);
        ArrayList<ApprovalForAllEventResponse> responses = new ArrayList<ApprovalForAllEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ApprovalForAllEventResponse typedResponse = new ApprovalForAllEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.account = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.operator = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.approved = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static ApprovalForAllEventResponse getApprovalForAllEventFromLog(Log log) {
        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(APPROVALFORALL_EVENT, log);
        ApprovalForAllEventResponse typedResponse = new ApprovalForAllEventResponse();
        typedResponse.log = log;
        typedResponse.account = (String) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.operator = (String) eventValues.getIndexedValues().get(1).getValue();
        typedResponse.approved = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
        return typedResponse;
    }

    public Flowable<ApprovalForAllEventResponse> approvalForAllEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getApprovalForAllEventFromLog(log));
    }

    public Flowable<ApprovalForAllEventResponse> approvalForAllEventFlowable(
            DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(APPROVALFORALL_EVENT));
        return approvalForAllEventFlowable(filter);
    }

    public static List<OwnershipTransferredEventResponse> getOwnershipTransferredEvents(
            TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(OWNERSHIPTRANSFERRED_EVENT, transactionReceipt);
        ArrayList<OwnershipTransferredEventResponse> responses = new ArrayList<OwnershipTransferredEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.previousOwner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.newOwner = (String) eventValues.getIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static OwnershipTransferredEventResponse getOwnershipTransferredEventFromLog(Log log) {
        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(OWNERSHIPTRANSFERRED_EVENT, log);
        OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
        typedResponse.log = log;
        typedResponse.previousOwner = (String) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.newOwner = (String) eventValues.getIndexedValues().get(1).getValue();
        return typedResponse;
    }

    public Flowable<OwnershipTransferredEventResponse> ownershipTransferredEventFlowable(
            EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getOwnershipTransferredEventFromLog(log));
    }

    public Flowable<OwnershipTransferredEventResponse> ownershipTransferredEventFlowable(
            DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(OWNERSHIPTRANSFERRED_EVENT));
        return ownershipTransferredEventFlowable(filter);
    }

    public static List<TransferBatchEventResponse> getTransferBatchEvents(
            TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(TRANSFERBATCH_EVENT, transactionReceipt);
        ArrayList<TransferBatchEventResponse> responses = new ArrayList<TransferBatchEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            TransferBatchEventResponse typedResponse = new TransferBatchEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.operator = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.from = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.to = (String) eventValues.getIndexedValues().get(2).getValue();
            typedResponse.ids = (List<BigInteger>) ((Array) eventValues.getNonIndexedValues().get(0)).getNativeValueCopy();
            typedResponse.values = (List<BigInteger>) ((Array) eventValues.getNonIndexedValues().get(1)).getNativeValueCopy();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static TransferBatchEventResponse getTransferBatchEventFromLog(Log log) {
        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(TRANSFERBATCH_EVENT, log);
        TransferBatchEventResponse typedResponse = new TransferBatchEventResponse();
        typedResponse.log = log;
        typedResponse.operator = (String) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.from = (String) eventValues.getIndexedValues().get(1).getValue();
        typedResponse.to = (String) eventValues.getIndexedValues().get(2).getValue();
        typedResponse.ids = (List<BigInteger>) ((Array) eventValues.getNonIndexedValues().get(0)).getNativeValueCopy();
        typedResponse.values = (List<BigInteger>) ((Array) eventValues.getNonIndexedValues().get(1)).getNativeValueCopy();
        return typedResponse;
    }

    public Flowable<TransferBatchEventResponse> transferBatchEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getTransferBatchEventFromLog(log));
    }

    public Flowable<TransferBatchEventResponse> transferBatchEventFlowable(
            DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(TRANSFERBATCH_EVENT));
        return transferBatchEventFlowable(filter);
    }

    public static List<TransferSingleEventResponse> getTransferSingleEvents(
            TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(TRANSFERSINGLE_EVENT, transactionReceipt);
        ArrayList<TransferSingleEventResponse> responses = new ArrayList<TransferSingleEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            TransferSingleEventResponse typedResponse = new TransferSingleEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.operator = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.from = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.to = (String) eventValues.getIndexedValues().get(2).getValue();
            typedResponse.id = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static TransferSingleEventResponse getTransferSingleEventFromLog(Log log) {
        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(TRANSFERSINGLE_EVENT, log);
        TransferSingleEventResponse typedResponse = new TransferSingleEventResponse();
        typedResponse.log = log;
        typedResponse.operator = (String) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.from = (String) eventValues.getIndexedValues().get(1).getValue();
        typedResponse.to = (String) eventValues.getIndexedValues().get(2).getValue();
        typedResponse.id = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
        typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
        return typedResponse;
    }

    public Flowable<TransferSingleEventResponse> transferSingleEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getTransferSingleEventFromLog(log));
    }

    public Flowable<TransferSingleEventResponse> transferSingleEventFlowable(
            DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(TRANSFERSINGLE_EVENT));
        return transferSingleEventFlowable(filter);
    }

    public static List<URIEventResponse> getURIEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(URI_EVENT, transactionReceipt);
        ArrayList<URIEventResponse> responses = new ArrayList<URIEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            URIEventResponse typedResponse = new URIEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.id = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.value = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static URIEventResponse getURIEventFromLog(Log log) {
        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(URI_EVENT, log);
        URIEventResponse typedResponse = new URIEventResponse();
        typedResponse.log = log;
        typedResponse.id = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
        typedResponse.value = (String) eventValues.getNonIndexedValues().get(0).getValue();
        return typedResponse;
    }

    public Flowable<URIEventResponse> uRIEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getURIEventFromLog(log));
    }

    public Flowable<URIEventResponse> uRIEventFlowable(DefaultBlockParameter startBlock,
            DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(URI_EVENT));
        return uRIEventFlowable(filter);
    }

    public RemoteFunctionCall<BigInteger> balanceOf(String account, BigInteger id) {
        final Function function = new Function(FUNC_BALANCEOF, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, account), 
                new org.web3j.abi.datatypes.generated.Uint256(id)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<List> balanceOfBatch(List<String> accounts, List<BigInteger> ids) {
        final Function function = new Function(FUNC_BALANCEOFBATCH, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(accounts, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.datatypes.generated.Uint256.class,
                        org.web3j.abi.Utils.typeMap(ids, org.web3j.abi.datatypes.generated.Uint256.class))), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> batchQuantities(BigInteger param0) {
        final Function function = new Function(FUNC_BATCHQUANTITIES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
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

    public RemoteFunctionCall<Boolean> isApprovedForAll(String account, String operator) {
        final Function function = new Function(FUNC_ISAPPROVEDFORALL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, account), 
                new org.web3j.abi.datatypes.Address(160, operator)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<BigInteger> jarTokenId(BigInteger batchId, BigInteger grams) {
        final Function function = new Function(FUNC_JARTOKENID, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint32(grams)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> markBatchProcessed(BigInteger batchId) {
        final Function function = new Function(
                FUNC_MARKBATCHPROCESSED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> mintBulkBatch(BigInteger batchId,
            BigInteger quantity, String to) {
        final Function function = new Function(
                FUNC_MINTBULKBATCH, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.generated.Uint256(quantity), 
                new org.web3j.abi.datatypes.Address(160, to)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> mintJars(BigInteger batchId, String bulkHolder,
            List<BigInteger> jarSizesGrams, List<BigInteger> jarCounts, String jarRecipient) {
        final Function function = new Function(
                FUNC_MINTJARS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(batchId), 
                new org.web3j.abi.datatypes.Address(160, bulkHolder), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint32>(
                        org.web3j.abi.datatypes.generated.Uint32.class,
                        org.web3j.abi.Utils.typeMap(jarSizesGrams, org.web3j.abi.datatypes.generated.Uint32.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.datatypes.generated.Uint256.class,
                        org.web3j.abi.Utils.typeMap(jarCounts, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.Address(160, jarRecipient)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> owner() {
        final Function function = new Function(FUNC_OWNER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Boolean> processedBatches(BigInteger param0) {
        final Function function = new Function(FUNC_PROCESSEDBATCHES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> renounceOwnership() {
        final Function function = new Function(
                FUNC_RENOUNCEOWNERSHIP, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> safeBatchTransferFrom(String from, String to,
            List<BigInteger> ids, List<BigInteger> values, byte[] data) {
        final Function function = new Function(
                FUNC_SAFEBATCHTRANSFERFROM, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, from), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.datatypes.generated.Uint256.class,
                        org.web3j.abi.Utils.typeMap(ids, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.datatypes.generated.Uint256.class,
                        org.web3j.abi.Utils.typeMap(values, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.DynamicBytes(data)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> safeTransferFrom(String from, String to,
            BigInteger id, BigInteger value, byte[] data) {
        final Function function = new Function(
                FUNC_SAFETRANSFERFROM, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, from), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(id), 
                new org.web3j.abi.datatypes.generated.Uint256(value), 
                new org.web3j.abi.datatypes.DynamicBytes(data)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setApprovalForAll(String operator,
            Boolean approved) {
        final Function function = new Function(
                FUNC_SETAPPROVALFORALL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, operator), 
                new org.web3j.abi.datatypes.Bool(approved)), 
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

    public RemoteFunctionCall<Boolean> supportsInterface(byte[] interfaceId) {
        final Function function = new Function(FUNC_SUPPORTSINTERFACE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes4(interfaceId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> transferOwnership(String newOwner) {
        final Function function = new Function(
                FUNC_TRANSFEROWNERSHIP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, newOwner)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> uri(BigInteger param0) {
        final Function function = new Function(FUNC_URI, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    @Deprecated
    public static HoneyToken load(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return new HoneyToken(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static HoneyToken load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new HoneyToken(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static HoneyToken load(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return new HoneyToken(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static HoneyToken load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new HoneyToken(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<HoneyToken> deploy(Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider, String uri_) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(uri_)));
        return deployRemoteCall(HoneyToken.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    public static RemoteCall<HoneyToken> deploy(Web3j web3j, TransactionManager transactionManager,
            ContractGasProvider contractGasProvider, String uri_) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(uri_)));
        return deployRemoteCall(HoneyToken.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<HoneyToken> deploy(Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit, String uri_) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(uri_)));
        return deployRemoteCall(HoneyToken.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<HoneyToken> deploy(Web3j web3j, TransactionManager transactionManager,
            BigInteger gasPrice, BigInteger gasLimit, String uri_) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(uri_)));
        return deployRemoteCall(HoneyToken.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), encodedConstructor);
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

    public static class ApprovalForAllEventResponse extends BaseEventResponse {
        public String account;

        public String operator;

        public Boolean approved;
    }

    public static class OwnershipTransferredEventResponse extends BaseEventResponse {
        public String previousOwner;

        public String newOwner;
    }

    public static class TransferBatchEventResponse extends BaseEventResponse {
        public String operator;

        public String from;

        public String to;

        public List<BigInteger> ids;

        public List<BigInteger> values;
    }

    public static class TransferSingleEventResponse extends BaseEventResponse {
        public String operator;

        public String from;

        public String to;

        public BigInteger id;

        public BigInteger value;
    }

    public static class URIEventResponse extends BaseEventResponse {
        public BigInteger id;

        public String value;
    }
}

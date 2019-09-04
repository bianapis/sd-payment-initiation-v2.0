/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PaymentInitiationApiServiceImpl implements PaymentInitiationApiService {

	public SDPaymentInitiationActivateOutputModel activate(SDPaymentInitiationActivateInputModel request){
		return JsonReader.read("activate-SDPaymentInitiationActivateOutputModel.json",new TypeReference<SDPaymentInitiationActivateOutputModel>(){});
	}
	
	public SDPaymentInitiationConfigureOutputModel configure(String sdReferenceId, SDPaymentInitiationConfigureInputModel request){
		return JsonReader.read("configure-SDPaymentInitiationConfigureOutputModel.json",new TypeReference<SDPaymentInitiationConfigureOutputModel>(){});
	}
	
	public BQOrderInitiationExchangeOutputModel exchangeOrderinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOrderInitiationExchangeInputModel request){
		return JsonReader.read("exchange-BQOrderInitiationExchangeOutputModel.json",new TypeReference<BQOrderInitiationExchangeOutputModel>(){});
	}
	
	public SDPaymentInitiationFeedbackOutputModel feedback(String sdReferenceId, SDPaymentInitiationFeedbackInputModel request){
		return JsonReader.read("feedback-SDPaymentInitiationFeedbackOutputModel.json",new TypeReference<SDPaymentInitiationFeedbackOutputModel>(){});
	}
	
	public CRPaymentInitiationTransactionInitiateOutputModel initiate(String sdReferenceId, CRPaymentInitiationTransactionInitiateInputModel request){
		return JsonReader.read("initiate-CRPaymentInitiationTransactionInitiateOutputModel.json",new TypeReference<CRPaymentInitiationTransactionInitiateOutputModel>(){});
	}
	
	public CRPaymentInitiationTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRPaymentInitiationTransactionRetrieveOutputModel.json",new TypeReference<CRPaymentInitiationTransactionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQComplianceRetrieveOutputModel retrieveCompliance(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQComplianceRetrieveOutputModel.json",new TypeReference<BQComplianceRetrieveOutputModel>(){});
	}
	
	public BQFundingCheckRetrieveOutputModel retrieveFundingcheck(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFundingCheckRetrieveOutputModel.json",new TypeReference<BQFundingCheckRetrieveOutputModel>(){});
	}
	
	public BQOrderInitiationRetrieveOutputModel retrieveOrderinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOrderInitiationRetrieveOutputModel.json",new TypeReference<BQOrderInitiationRetrieveOutputModel>(){});
	}
	
	public SDPaymentInitiationRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDPaymentInitiationRetrieveOutputModel.json",new TypeReference<SDPaymentInitiationRetrieveOutputModel>(){});
	}
	
	public CRPaymentInitiationTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPaymentInitiationTransactionUpdateInputModel request){
		return JsonReader.read("update-CRPaymentInitiationTransactionUpdateOutputModel.json",new TypeReference<CRPaymentInitiationTransactionUpdateOutputModel>(){});
	}
	
}

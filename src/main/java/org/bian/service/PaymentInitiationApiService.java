/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PaymentInitiationApiService {

	SDPaymentInitiationActivateOutputModel activate(SDPaymentInitiationActivateInputModel request);
	
	SDPaymentInitiationConfigureOutputModel configure(String sdReferenceId, SDPaymentInitiationConfigureInputModel request);
	
	BQOrderInitiationExchangeOutputModel exchangeOrderinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOrderInitiationExchangeInputModel request);
	
	SDPaymentInitiationFeedbackOutputModel feedback(String sdReferenceId, SDPaymentInitiationFeedbackInputModel request);
	
	CRPaymentInitiationTransactionInitiateOutputModel initiate(String sdReferenceId, CRPaymentInitiationTransactionInitiateInputModel request);
	
	CRPaymentInitiationTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQComplianceRetrieveOutputModel retrieveCompliance(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFundingCheckRetrieveOutputModel retrieveFundingcheck(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOrderInitiationRetrieveOutputModel retrieveOrderinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDPaymentInitiationRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRPaymentInitiationTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPaymentInitiationTransactionUpdateInputModel request);
	
}

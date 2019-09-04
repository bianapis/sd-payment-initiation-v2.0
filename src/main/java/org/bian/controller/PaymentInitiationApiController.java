/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Transact;

@BianRestController
public class PaymentInitiationApiController {

	@Autowired
	PaymentInitiationApiService service;
	
	@Transact.Activate
	public BianResponse<SDPaymentInitiationActivateOutputModel> activate(@RequestBody BianRequest<SDPaymentInitiationActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Transact.Configure
	public BianResponse<SDPaymentInitiationConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDPaymentInitiationConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("orderinitiation")
	@Transact.Exchange
	public BianResponse<BQOrderInitiationExchangeOutputModel> exchangeOrderinitiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOrderInitiationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeOrderinitiation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Transact.Feedback
	public BianResponse<SDPaymentInitiationFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDPaymentInitiationFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Transact.Initiate
	public BianResponse<CRPaymentInitiationTransactionInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRPaymentInitiationTransactionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@Transact.Retrieve
	public BianResponse<CRPaymentInitiationTransactionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Transact.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Transact.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Transact.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("compliance")
	@Transact.Retrieve
	public BianResponse<BQComplianceRetrieveOutputModel> retrieveCompliance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCompliance(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("fundingcheck")
	@Transact.Retrieve
	public BianResponse<BQFundingCheckRetrieveOutputModel> retrieveFundingcheck(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFundingcheck(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("orderinitiation")
	@Transact.Retrieve
	public BianResponse<BQOrderInitiationRetrieveOutputModel> retrieveOrderinitiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOrderinitiation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Transact.RetrieveSD
	public BianResponse<SDPaymentInitiationRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Transact.Update
	public BianResponse<CRPaymentInitiationTransactionUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPaymentInitiationTransactionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
}

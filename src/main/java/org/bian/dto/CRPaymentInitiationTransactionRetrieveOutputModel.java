package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentInitiationTransactionRetrieveOutputModelPaymentInitiationTransactionInstanceAnalysis;
import org.bian.dto.CRPaymentInitiationTransactionRetrieveOutputModelPaymentInitiationTransactionInstanceRecord;
import org.bian.dto.CRPaymentInitiationTransactionRetrieveOutputModelPaymentInitiationTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentInitiationTransactionRetrieveOutputModel
 */
public class CRPaymentInitiationTransactionRetrieveOutputModel   {
  private CRPaymentInitiationTransactionRetrieveOutputModelPaymentInitiationTransactionInstanceRecord paymentInitiationTransactionInstanceRecord = null;

  private String paymentInitiationTransactionRetrieveActionTaskReference = null;

  private Object paymentInitiationTransactionRetrieveActionTaskRecord = null;

  private String paymentInitiationTransactionRetrieveActionResponse = null;

  private CRPaymentInitiationTransactionRetrieveOutputModelPaymentInitiationTransactionInstanceReportRecord paymentInitiationTransactionInstanceReportRecord = null;

  private CRPaymentInitiationTransactionRetrieveOutputModelPaymentInitiationTransactionInstanceAnalysis paymentInitiationTransactionInstanceAnalysis = null;


  /**
   * Get paymentInitiationTransactionInstanceRecord
   * @return paymentInitiationTransactionInstanceRecord
  **/

  public CRPaymentInitiationTransactionRetrieveOutputModelPaymentInitiationTransactionInstanceRecord getPaymentInitiationTransactionInstanceRecord() {
    return paymentInitiationTransactionInstanceRecord;
  }

  public void setPaymentInitiationTransactionInstanceRecord(CRPaymentInitiationTransactionRetrieveOutputModelPaymentInitiationTransactionInstanceRecord paymentInitiationTransactionInstanceRecord) {
    this.paymentInitiationTransactionInstanceRecord = paymentInitiationTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payment Initiation Transaction instance retrieve service call 
   * @return paymentInitiationTransactionRetrieveActionTaskReference
  **/

  public String getPaymentInitiationTransactionRetrieveActionTaskReference() {
    return paymentInitiationTransactionRetrieveActionTaskReference;
  }

  public void setPaymentInitiationTransactionRetrieveActionTaskReference(String paymentInitiationTransactionRetrieveActionTaskReference) {
    this.paymentInitiationTransactionRetrieveActionTaskReference = paymentInitiationTransactionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return paymentInitiationTransactionRetrieveActionTaskRecord
  **/

  public Object getPaymentInitiationTransactionRetrieveActionTaskRecord() {
    return paymentInitiationTransactionRetrieveActionTaskRecord;
  }

  public void setPaymentInitiationTransactionRetrieveActionTaskRecord(Object paymentInitiationTransactionRetrieveActionTaskRecord) {
    this.paymentInitiationTransactionRetrieveActionTaskRecord = paymentInitiationTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return paymentInitiationTransactionRetrieveActionResponse
  **/

  public String getPaymentInitiationTransactionRetrieveActionResponse() {
    return paymentInitiationTransactionRetrieveActionResponse;
  }

  public void setPaymentInitiationTransactionRetrieveActionResponse(String paymentInitiationTransactionRetrieveActionResponse) {
    this.paymentInitiationTransactionRetrieveActionResponse = paymentInitiationTransactionRetrieveActionResponse;
  }


  /**
   * Get paymentInitiationTransactionInstanceReportRecord
   * @return paymentInitiationTransactionInstanceReportRecord
  **/

  public CRPaymentInitiationTransactionRetrieveOutputModelPaymentInitiationTransactionInstanceReportRecord getPaymentInitiationTransactionInstanceReportRecord() {
    return paymentInitiationTransactionInstanceReportRecord;
  }

  public void setPaymentInitiationTransactionInstanceReportRecord(CRPaymentInitiationTransactionRetrieveOutputModelPaymentInitiationTransactionInstanceReportRecord paymentInitiationTransactionInstanceReportRecord) {
    this.paymentInitiationTransactionInstanceReportRecord = paymentInitiationTransactionInstanceReportRecord;
  }


  /**
   * Get paymentInitiationTransactionInstanceAnalysis
   * @return paymentInitiationTransactionInstanceAnalysis
  **/

  public CRPaymentInitiationTransactionRetrieveOutputModelPaymentInitiationTransactionInstanceAnalysis getPaymentInitiationTransactionInstanceAnalysis() {
    return paymentInitiationTransactionInstanceAnalysis;
  }

  public void setPaymentInitiationTransactionInstanceAnalysis(CRPaymentInitiationTransactionRetrieveOutputModelPaymentInitiationTransactionInstanceAnalysis paymentInitiationTransactionInstanceAnalysis) {
    this.paymentInitiationTransactionInstanceAnalysis = paymentInitiationTransactionInstanceAnalysis;
  }


}


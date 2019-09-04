package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentInitiationTransactionRetrieveInputModelPaymentInitiationTransactionInstanceAnalysis;
import org.bian.dto.CRPaymentInitiationTransactionRetrieveInputModelPaymentInitiationTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentInitiationTransactionRetrieveInputModel
 */
public class CRPaymentInitiationTransactionRetrieveInputModel   {
  private Object paymentInitiationTransactionRetrieveActionTaskRecord = null;

  private String paymentInitiationTransactionRetrieveActionRequest = null;

  private CRPaymentInitiationTransactionRetrieveInputModelPaymentInitiationTransactionInstanceReportRecord paymentInitiationTransactionInstanceReportRecord = null;

  private CRPaymentInitiationTransactionRetrieveInputModelPaymentInitiationTransactionInstanceAnalysis paymentInitiationTransactionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return paymentInitiationTransactionRetrieveActionRequest
  **/

  public String getPaymentInitiationTransactionRetrieveActionRequest() {
    return paymentInitiationTransactionRetrieveActionRequest;
  }

  public void setPaymentInitiationTransactionRetrieveActionRequest(String paymentInitiationTransactionRetrieveActionRequest) {
    this.paymentInitiationTransactionRetrieveActionRequest = paymentInitiationTransactionRetrieveActionRequest;
  }


  /**
   * Get paymentInitiationTransactionInstanceReportRecord
   * @return paymentInitiationTransactionInstanceReportRecord
  **/

  public CRPaymentInitiationTransactionRetrieveInputModelPaymentInitiationTransactionInstanceReportRecord getPaymentInitiationTransactionInstanceReportRecord() {
    return paymentInitiationTransactionInstanceReportRecord;
  }

  public void setPaymentInitiationTransactionInstanceReportRecord(CRPaymentInitiationTransactionRetrieveInputModelPaymentInitiationTransactionInstanceReportRecord paymentInitiationTransactionInstanceReportRecord) {
    this.paymentInitiationTransactionInstanceReportRecord = paymentInitiationTransactionInstanceReportRecord;
  }


  /**
   * Get paymentInitiationTransactionInstanceAnalysis
   * @return paymentInitiationTransactionInstanceAnalysis
  **/

  public CRPaymentInitiationTransactionRetrieveInputModelPaymentInitiationTransactionInstanceAnalysis getPaymentInitiationTransactionInstanceAnalysis() {
    return paymentInitiationTransactionInstanceAnalysis;
  }

  public void setPaymentInitiationTransactionInstanceAnalysis(CRPaymentInitiationTransactionRetrieveInputModelPaymentInitiationTransactionInstanceAnalysis paymentInitiationTransactionInstanceAnalysis) {
    this.paymentInitiationTransactionInstanceAnalysis = paymentInitiationTransactionInstanceAnalysis;
  }


}


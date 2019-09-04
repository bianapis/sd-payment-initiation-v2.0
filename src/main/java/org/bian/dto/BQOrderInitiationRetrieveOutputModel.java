package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceAnalysis;
import org.bian.dto.BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceRecord;
import org.bian.dto.BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceReport;
import org.bian.dto.BQOrderInitiationRetrieveOutputModelPaymentInitiationTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOrderInitiationRetrieveOutputModel
 */
public class BQOrderInitiationRetrieveOutputModel   {
  private BQOrderInitiationRetrieveOutputModelPaymentInitiationTransactionInstanceRecord paymentInitiationTransactionInstanceRecord = null;

  private BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceRecord orderInitiationInstanceRecord = null;

  private String orderInitiationRetrieveActionTaskReference = null;

  private Object orderInitiationRetrieveActionTaskRecord = null;

  private String orderInitiationRetrieveActionResponse = null;

  private BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceReport orderInitiationInstanceReport = null;

  private BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceAnalysis orderInitiationInstanceAnalysis = null;


  /**
   * Get paymentInitiationTransactionInstanceRecord
   * @return paymentInitiationTransactionInstanceRecord
  **/

  public BQOrderInitiationRetrieveOutputModelPaymentInitiationTransactionInstanceRecord getPaymentInitiationTransactionInstanceRecord() {
    return paymentInitiationTransactionInstanceRecord;
  }

  public void setPaymentInitiationTransactionInstanceRecord(BQOrderInitiationRetrieveOutputModelPaymentInitiationTransactionInstanceRecord paymentInitiationTransactionInstanceRecord) {
    this.paymentInitiationTransactionInstanceRecord = paymentInitiationTransactionInstanceRecord;
  }


  /**
   * Get orderInitiationInstanceRecord
   * @return orderInitiationInstanceRecord
  **/

  public BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceRecord getOrderInitiationInstanceRecord() {
    return orderInitiationInstanceRecord;
  }

  public void setOrderInitiationInstanceRecord(BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceRecord orderInitiationInstanceRecord) {
    this.orderInitiationInstanceRecord = orderInitiationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Order Initiation instance retrieve service call 
   * @return orderInitiationRetrieveActionTaskReference
  **/

  public String getOrderInitiationRetrieveActionTaskReference() {
    return orderInitiationRetrieveActionTaskReference;
  }

  public void setOrderInitiationRetrieveActionTaskReference(String orderInitiationRetrieveActionTaskReference) {
    this.orderInitiationRetrieveActionTaskReference = orderInitiationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return orderInitiationRetrieveActionTaskRecord
  **/

  public Object getOrderInitiationRetrieveActionTaskRecord() {
    return orderInitiationRetrieveActionTaskRecord;
  }

  public void setOrderInitiationRetrieveActionTaskRecord(Object orderInitiationRetrieveActionTaskRecord) {
    this.orderInitiationRetrieveActionTaskRecord = orderInitiationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return orderInitiationRetrieveActionResponse
  **/

  public String getOrderInitiationRetrieveActionResponse() {
    return orderInitiationRetrieveActionResponse;
  }

  public void setOrderInitiationRetrieveActionResponse(String orderInitiationRetrieveActionResponse) {
    this.orderInitiationRetrieveActionResponse = orderInitiationRetrieveActionResponse;
  }


  /**
   * Get orderInitiationInstanceReport
   * @return orderInitiationInstanceReport
  **/

  public BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceReport getOrderInitiationInstanceReport() {
    return orderInitiationInstanceReport;
  }

  public void setOrderInitiationInstanceReport(BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceReport orderInitiationInstanceReport) {
    this.orderInitiationInstanceReport = orderInitiationInstanceReport;
  }


  /**
   * Get orderInitiationInstanceAnalysis
   * @return orderInitiationInstanceAnalysis
  **/

  public BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceAnalysis getOrderInitiationInstanceAnalysis() {
    return orderInitiationInstanceAnalysis;
  }

  public void setOrderInitiationInstanceAnalysis(BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceAnalysis orderInitiationInstanceAnalysis) {
    this.orderInitiationInstanceAnalysis = orderInitiationInstanceAnalysis;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentInitiationTransactionUpdateInputModelPaymentInitiationTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentInitiationTransactionUpdateInputModel
 */
public class CRPaymentInitiationTransactionUpdateInputModel   {
  private String paymentInitiationServicingSessionReference = null;

  private String paymentInitiationTransactionInstanceReference = null;

  private CRPaymentInitiationTransactionUpdateInputModelPaymentInitiationTransactionInstanceRecord paymentInitiationTransactionInstanceRecord = null;

  private Object paymentInitiationTransactionUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return paymentInitiationServicingSessionReference
  **/

  public String getPaymentInitiationServicingSessionReference() {
    return paymentInitiationServicingSessionReference;
  }

  public void setPaymentInitiationServicingSessionReference(String paymentInitiationServicingSessionReference) {
    this.paymentInitiationServicingSessionReference = paymentInitiationServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payment Initiation Transaction instance 
   * @return paymentInitiationTransactionInstanceReference
  **/

  public String getPaymentInitiationTransactionInstanceReference() {
    return paymentInitiationTransactionInstanceReference;
  }

  public void setPaymentInitiationTransactionInstanceReference(String paymentInitiationTransactionInstanceReference) {
    this.paymentInitiationTransactionInstanceReference = paymentInitiationTransactionInstanceReference;
  }


  /**
   * Get paymentInitiationTransactionInstanceRecord
   * @return paymentInitiationTransactionInstanceRecord
  **/

  public CRPaymentInitiationTransactionUpdateInputModelPaymentInitiationTransactionInstanceRecord getPaymentInitiationTransactionInstanceRecord() {
    return paymentInitiationTransactionInstanceRecord;
  }

  public void setPaymentInitiationTransactionInstanceRecord(CRPaymentInitiationTransactionUpdateInputModelPaymentInitiationTransactionInstanceRecord paymentInitiationTransactionInstanceRecord) {
    this.paymentInitiationTransactionInstanceRecord = paymentInitiationTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return paymentInitiationTransactionUpdateActionTaskRecord
  **/

  public Object getPaymentInitiationTransactionUpdateActionTaskRecord() {
    return paymentInitiationTransactionUpdateActionTaskRecord;
  }

  public void setPaymentInitiationTransactionUpdateActionTaskRecord(Object paymentInitiationTransactionUpdateActionTaskRecord) {
    this.paymentInitiationTransactionUpdateActionTaskRecord = paymentInitiationTransactionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}


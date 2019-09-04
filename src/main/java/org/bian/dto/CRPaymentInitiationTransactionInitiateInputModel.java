package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentInitiationTransactionInitiateInputModel
 */
public class CRPaymentInitiationTransactionInitiateInputModel   {
  private String paymentInitiationServicingSessionReference = null;

  private Object paymentInitiationTransactionInitiateActionRecord = null;

  private String paymentInitiationTransactionInstanceStatus = null;

  private CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecord paymentInitiationTransactionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return paymentInitiationTransactionInitiateActionRecord
  **/

  public Object getPaymentInitiationTransactionInitiateActionRecord() {
    return paymentInitiationTransactionInitiateActionRecord;
  }

  public void setPaymentInitiationTransactionInitiateActionRecord(Object paymentInitiationTransactionInitiateActionRecord) {
    this.paymentInitiationTransactionInitiateActionRecord = paymentInitiationTransactionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payment Initiation Transaction instance (e.g. initialised, pending, active) 
   * @return paymentInitiationTransactionInstanceStatus
  **/

  public String getPaymentInitiationTransactionInstanceStatus() {
    return paymentInitiationTransactionInstanceStatus;
  }

  public void setPaymentInitiationTransactionInstanceStatus(String paymentInitiationTransactionInstanceStatus) {
    this.paymentInitiationTransactionInstanceStatus = paymentInitiationTransactionInstanceStatus;
  }


  /**
   * Get paymentInitiationTransactionInstanceRecord
   * @return paymentInitiationTransactionInstanceRecord
  **/

  public CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecord getPaymentInitiationTransactionInstanceRecord() {
    return paymentInitiationTransactionInstanceRecord;
  }

  public void setPaymentInitiationTransactionInstanceRecord(CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecord paymentInitiationTransactionInstanceRecord) {
    this.paymentInitiationTransactionInstanceRecord = paymentInitiationTransactionInstanceRecord;
  }


}


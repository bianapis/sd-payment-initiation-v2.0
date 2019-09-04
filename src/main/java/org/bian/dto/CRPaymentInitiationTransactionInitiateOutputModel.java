package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentInitiationTransactionInitiateOutputModelPaymentInitiationTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentInitiationTransactionInitiateOutputModel
 */
public class CRPaymentInitiationTransactionInitiateOutputModel   {
  private String paymentInitiationTransactionInstanceReference = null;

  private String paymentInitiationTransactionInitiateActionReference = null;

  private Object paymentInitiationTransactionInitiateActionRecord = null;

  private String paymentInitiationTransactionInstanceStatus = null;

  private CRPaymentInitiationTransactionInitiateOutputModelPaymentInitiationTransactionInstanceRecord paymentInitiationTransactionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return paymentInitiationTransactionInitiateActionReference
  **/

  public String getPaymentInitiationTransactionInitiateActionReference() {
    return paymentInitiationTransactionInitiateActionReference;
  }

  public void setPaymentInitiationTransactionInitiateActionReference(String paymentInitiationTransactionInitiateActionReference) {
    this.paymentInitiationTransactionInitiateActionReference = paymentInitiationTransactionInitiateActionReference;
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

  public CRPaymentInitiationTransactionInitiateOutputModelPaymentInitiationTransactionInstanceRecord getPaymentInitiationTransactionInstanceRecord() {
    return paymentInitiationTransactionInstanceRecord;
  }

  public void setPaymentInitiationTransactionInstanceRecord(CRPaymentInitiationTransactionInitiateOutputModelPaymentInitiationTransactionInstanceRecord paymentInitiationTransactionInstanceRecord) {
    this.paymentInitiationTransactionInstanceRecord = paymentInitiationTransactionInstanceRecord;
  }


}


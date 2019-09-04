package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentInitiationTransactionUpdateInputModelPaymentInitiationTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentInitiationTransactionUpdateOutputModel
 */
public class CRPaymentInitiationTransactionUpdateOutputModel   {
  private CRPaymentInitiationTransactionUpdateInputModelPaymentInitiationTransactionInstanceRecord paymentInitiationTransactionInstanceRecord = null;

  private String paymentInitiationTransactionUpdateActionTaskReference = null;

  private Object paymentInitiationTransactionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return paymentInitiationTransactionUpdateActionTaskReference
  **/

  public String getPaymentInitiationTransactionUpdateActionTaskReference() {
    return paymentInitiationTransactionUpdateActionTaskReference;
  }

  public void setPaymentInitiationTransactionUpdateActionTaskReference(String paymentInitiationTransactionUpdateActionTaskReference) {
    this.paymentInitiationTransactionUpdateActionTaskReference = paymentInitiationTransactionUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransactionDateType;
import org.bian.dto.CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransactionDocumentReference;

import javax.validation.Valid;
  
/**
 * CRPaymentInitiationTransactionInitiateOutputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction
 */
public class CRPaymentInitiationTransactionInitiateOutputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction   {
  private CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransactionDateType dateType = null;

  private String paymentFeesCharges = null;

  private CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransactionDocumentReference documentReference = null;


  /**
   * Get dateType
   * @return dateType
  **/

  public CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransactionDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransactionDateType dateType) {
    this.dateType = dateType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Processing and exchange fees as appropriate 
   * @return paymentFeesCharges
  **/

  public String getPaymentFeesCharges() {
    return paymentFeesCharges;
  }

  public void setPaymentFeesCharges(String paymentFeesCharges) {
    this.paymentFeesCharges = paymentFeesCharges;
  }


  /**
   * Get documentReference
   * @return documentReference
  **/

  public CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransactionDocumentReference getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransactionDocumentReference documentReference) {
    this.documentReference = documentReference;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentInitiationTransactionUpdateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction;
import org.bian.dto.CRPaymentInitiationTransactionUpdateInputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentInitiationTransactionUpdateInputModelPaymentInitiationTransactionInstanceRecord
 */
public class CRPaymentInitiationTransactionUpdateInputModelPaymentInitiationTransactionInstanceRecord   {
  private String paymentTransactionType = null;

  private CRPaymentInitiationTransactionUpdateInputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecord recurringPaymentRecord = null;

  private String customerReference = null;

  private CRPaymentInitiationTransactionUpdateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction paymentTransaction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of payment transaction (e.g. over the counter-OTC, intra-account, overseas) 
   * @return paymentTransactionType
  **/

  public String getPaymentTransactionType() {
    return paymentTransactionType;
  }

  public void setPaymentTransactionType(String paymentTransactionType) {
    this.paymentTransactionType = paymentTransactionType;
  }


  /**
   * Get recurringPaymentRecord
   * @return recurringPaymentRecord
  **/

  public CRPaymentInitiationTransactionUpdateInputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecord getRecurringPaymentRecord() {
    return recurringPaymentRecord;
  }

  public void setRecurringPaymentRecord(CRPaymentInitiationTransactionUpdateInputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecord recurringPaymentRecord) {
    this.recurringPaymentRecord = recurringPaymentRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer initiating the payment transaction 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * Get paymentTransaction
   * @return paymentTransaction
  **/

  public CRPaymentInitiationTransactionUpdateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(CRPaymentInitiationTransactionUpdateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


}


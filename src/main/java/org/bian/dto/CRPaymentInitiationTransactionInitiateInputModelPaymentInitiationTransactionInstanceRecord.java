package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction;
import org.bian.dto.CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecord
 */
public class CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecord   {
  private String paymentTransactionType = null;

  private CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecord recurringPaymentRecord = null;

  private String customerReference = null;

  private CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction paymentTransaction = null;


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

  public CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecord getRecurringPaymentRecord() {
    return recurringPaymentRecord;
  }

  public void setRecurringPaymentRecord(CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecord recurringPaymentRecord) {
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

  public CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


}


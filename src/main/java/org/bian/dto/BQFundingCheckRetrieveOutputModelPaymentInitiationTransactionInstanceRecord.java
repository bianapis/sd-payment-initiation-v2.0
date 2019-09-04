package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFundingCheckRetrieveOutputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction;

import javax.validation.Valid;
  
/**
 * BQFundingCheckRetrieveOutputModelPaymentInitiationTransactionInstanceRecord
 */
public class BQFundingCheckRetrieveOutputModelPaymentInitiationTransactionInstanceRecord   {
  private String paymentTransactionType = null;

  private String customerReference = null;

  private BQFundingCheckRetrieveOutputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction paymentTransaction = null;


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

  public BQFundingCheckRetrieveOutputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(BQFundingCheckRetrieveOutputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


}


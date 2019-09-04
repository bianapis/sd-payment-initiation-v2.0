package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransactionDateType;

import javax.validation.Valid;
  
/**
 * BQFundingCheckRetrieveOutputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction
 */
public class BQFundingCheckRetrieveOutputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction   {
  private String payerReference = null;

  private String payerBankReference = null;

  private String payerProductInstanceReference = null;

  private String amount = null;

  private String currency = null;

  private CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransactionDateType dateType = null;

  private String paymentFeesCharges = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the payer  
   * @return payerReference
  **/

  public String getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(String payerReference) {
    this.payerReference = payerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the payer's bank 
   * @return payerBankReference
  **/

  public String getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(String payerBankReference) {
    this.payerBankReference = payerBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the payer's account (the source of funds) 
   * @return payerProductInstanceReference
  **/

  public String getPayerProductInstanceReference() {
    return payerProductInstanceReference;
  }

  public void setPayerProductInstanceReference(String payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Key amounts included in the transaction 
   * @return amount
  **/

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: Currency for the amounts 
   * @return currency
  **/

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


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


}


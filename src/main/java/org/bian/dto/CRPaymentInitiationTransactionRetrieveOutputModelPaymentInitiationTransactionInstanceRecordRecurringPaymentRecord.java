package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecordRecurringPaymentReference;

import javax.validation.Valid;
  
/**
 * CRPaymentInitiationTransactionRetrieveOutputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecord
 */
public class CRPaymentInitiationTransactionRetrieveOutputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecord   {
  private String recurringPaymentCustomerReference = null;

  private CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecordRecurringPaymentReference recurringPaymentReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference for a customer that uses recurring payments facility 
   * @return recurringPaymentCustomerReference
  **/

  public String getRecurringPaymentCustomerReference() {
    return recurringPaymentCustomerReference;
  }

  public void setRecurringPaymentCustomerReference(String recurringPaymentCustomerReference) {
    this.recurringPaymentCustomerReference = recurringPaymentCustomerReference;
  }


  /**
   * Get recurringPaymentReference
   * @return recurringPaymentReference
  **/

  public CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecordRecurringPaymentReference getRecurringPaymentReference() {
    return recurringPaymentReference;
  }

  public void setRecurringPaymentReference(CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecordRecurringPaymentReference recurringPaymentReference) {
    this.recurringPaymentReference = recurringPaymentReference;
  }


}


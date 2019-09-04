package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecordRecurringPaymentReference
 */
public class CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecordRecurringPaymentReference   {
  private Object recurringPaymentRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the recurring payment. Can be used to pre-populate the payment request 
   * @return recurringPaymentRecord
  **/

  public Object getRecurringPaymentRecord() {
    return recurringPaymentRecord;
  }

  public void setRecurringPaymentRecord(Object recurringPaymentRecord) {
    this.recurringPaymentRecord = recurringPaymentRecord;
  }


}


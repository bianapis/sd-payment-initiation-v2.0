package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecord;
import org.bian.dto.CRPaymentInitiationTransactionInitiateOutputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction;

import javax.validation.Valid;
  
/**
 * CRPaymentInitiationTransactionInitiateOutputModelPaymentInitiationTransactionInstanceRecord
 */
public class CRPaymentInitiationTransactionInitiateOutputModelPaymentInitiationTransactionInstanceRecord   {
  private CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordRecurringPaymentRecord recurringPaymentRecord = null;

  private CRPaymentInitiationTransactionInitiateOutputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction paymentTransaction = null;


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
   * Get paymentTransaction
   * @return paymentTransaction
  **/

  public CRPaymentInitiationTransactionInitiateOutputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(CRPaymentInitiationTransactionInitiateOutputModelPaymentInitiationTransactionInstanceRecordPaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQComplianceRetrieveOutputModelComplianceInstanceRecord
 */
public class BQComplianceRetrieveOutputModelComplianceInstanceRecord   {
  private String paymentTransactionComplianceCheckType = null;

  private String paymentTransactionComplianceCheckResult = null;

  private String paymentTransactionComplianceTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of compliance check performed (e.g. AML, Watchlists) 
   * @return paymentTransactionComplianceCheckType
  **/

  public String getPaymentTransactionComplianceCheckType() {
    return paymentTransactionComplianceCheckType;
  }

  public void setPaymentTransactionComplianceCheckType(String paymentTransactionComplianceCheckType) {
    this.paymentTransactionComplianceCheckType = paymentTransactionComplianceCheckType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the compliance check 
   * @return paymentTransactionComplianceCheckResult
  **/

  public String getPaymentTransactionComplianceCheckResult() {
    return paymentTransactionComplianceCheckResult;
  }

  public void setPaymentTransactionComplianceCheckResult(String paymentTransactionComplianceCheckResult) {
    this.paymentTransactionComplianceCheckResult = paymentTransactionComplianceCheckResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the overall compliance checking process 
   * @return paymentTransactionComplianceTaskResult
  **/

  public String getPaymentTransactionComplianceTaskResult() {
    return paymentTransactionComplianceTaskResult;
  }

  public void setPaymentTransactionComplianceTaskResult(String paymentTransactionComplianceTaskResult) {
    this.paymentTransactionComplianceTaskResult = paymentTransactionComplianceTaskResult;
  }


}


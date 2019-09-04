package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceRecord
 */
public class BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceRecord   {
  private String paymentOrderProcedureInstanceReference = null;

  private String paymentOrderProcedureInstanceStatus = null;

  private String orderInitiationTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The reference to the payment order processing task 
   * @return paymentOrderProcedureInstanceReference
  **/

  public String getPaymentOrderProcedureInstanceReference() {
    return paymentOrderProcedureInstanceReference;
  }

  public void setPaymentOrderProcedureInstanceReference(String paymentOrderProcedureInstanceReference) {
    this.paymentOrderProcedureInstanceReference = paymentOrderProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The returned status of the payment order processing 
   * @return paymentOrderProcedureInstanceStatus
  **/

  public String getPaymentOrderProcedureInstanceStatus() {
    return paymentOrderProcedureInstanceStatus;
  }

  public void setPaymentOrderProcedureInstanceStatus(String paymentOrderProcedureInstanceStatus) {
    this.paymentOrderProcedureInstanceStatus = paymentOrderProcedureInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the payment order initiation task 
   * @return orderInitiationTaskResult
  **/

  public String getOrderInitiationTaskResult() {
    return orderInitiationTaskResult;
  }

  public void setOrderInitiationTaskResult(String orderInitiationTaskResult) {
    this.orderInitiationTaskResult = orderInitiationTaskResult;
  }


}


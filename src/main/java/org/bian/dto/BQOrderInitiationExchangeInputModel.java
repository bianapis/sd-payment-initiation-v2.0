package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOrderInitiationExchangeInputModelOrderInitiationExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQOrderInitiationExchangeInputModel
 */
public class BQOrderInitiationExchangeInputModel   {
  private String paymentInitiationTransactionInstanceReference = null;

  private String orderInitiationInstanceReference = null;

  private Object orderInitiationExchangeActionTaskRecord = null;

  private BQOrderInitiationExchangeInputModelOrderInitiationExchangeActionRequest orderInitiationExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Payment Initiation Transaction instance 
   * @return paymentInitiationTransactionInstanceReference
  **/

  public String getPaymentInitiationTransactionInstanceReference() {
    return paymentInitiationTransactionInstanceReference;
  }

  public void setPaymentInitiationTransactionInstanceReference(String paymentInitiationTransactionInstanceReference) {
    this.paymentInitiationTransactionInstanceReference = paymentInitiationTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Order Initiation instance 
   * @return orderInitiationInstanceReference
  **/

  public String getOrderInitiationInstanceReference() {
    return orderInitiationInstanceReference;
  }

  public void setOrderInitiationInstanceReference(String orderInitiationInstanceReference) {
    this.orderInitiationInstanceReference = orderInitiationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return orderInitiationExchangeActionTaskRecord
  **/

  public Object getOrderInitiationExchangeActionTaskRecord() {
    return orderInitiationExchangeActionTaskRecord;
  }

  public void setOrderInitiationExchangeActionTaskRecord(Object orderInitiationExchangeActionTaskRecord) {
    this.orderInitiationExchangeActionTaskRecord = orderInitiationExchangeActionTaskRecord;
  }


  /**
   * Get orderInitiationExchangeActionRequest
   * @return orderInitiationExchangeActionRequest
  **/

  public BQOrderInitiationExchangeInputModelOrderInitiationExchangeActionRequest getOrderInitiationExchangeActionRequest() {
    return orderInitiationExchangeActionRequest;
  }

  public void setOrderInitiationExchangeActionRequest(BQOrderInitiationExchangeInputModelOrderInitiationExchangeActionRequest orderInitiationExchangeActionRequest) {
    this.orderInitiationExchangeActionRequest = orderInitiationExchangeActionRequest;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrderInitiationExchangeOutputModel
 */
public class BQOrderInitiationExchangeOutputModel   {
  private String orderInitiationExchangeActionTaskReference = null;

  private Object orderInitiationExchangeActionTaskRecord = null;

  private String orderInitiationExchangeActionResponse = null;

  private String orderInitiationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Order Initiation instance exchange service call 
   * @return orderInitiationExchangeActionTaskReference
  **/

  public String getOrderInitiationExchangeActionTaskReference() {
    return orderInitiationExchangeActionTaskReference;
  }

  public void setOrderInitiationExchangeActionTaskReference(String orderInitiationExchangeActionTaskReference) {
    this.orderInitiationExchangeActionTaskReference = orderInitiationExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return orderInitiationExchangeActionResponse
  **/

  public String getOrderInitiationExchangeActionResponse() {
    return orderInitiationExchangeActionResponse;
  }

  public void setOrderInitiationExchangeActionResponse(String orderInitiationExchangeActionResponse) {
    this.orderInitiationExchangeActionResponse = orderInitiationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Order Initiation instance (e.g. accepted, rejected, verified) 
   * @return orderInitiationInstanceStatus
  **/

  public String getOrderInitiationInstanceStatus() {
    return orderInitiationInstanceStatus;
  }

  public void setOrderInitiationInstanceStatus(String orderInitiationInstanceStatus) {
    this.orderInitiationInstanceStatus = orderInitiationInstanceStatus;
  }


}


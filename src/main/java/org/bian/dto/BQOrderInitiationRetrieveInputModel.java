package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOrderInitiationRetrieveInputModelOrderInitiationInstanceAnalysis;
import org.bian.dto.BQOrderInitiationRetrieveInputModelOrderInitiationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOrderInitiationRetrieveInputModel
 */
public class BQOrderInitiationRetrieveInputModel   {
  private Object orderInitiationRetrieveActionTaskRecord = null;

  private String orderInitiationRetrieveActionRequest = null;

  private BQOrderInitiationRetrieveInputModelOrderInitiationInstanceReport orderInitiationInstanceReport = null;

  private BQOrderInitiationRetrieveInputModelOrderInitiationInstanceAnalysis orderInitiationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return orderInitiationRetrieveActionTaskRecord
  **/

  public Object getOrderInitiationRetrieveActionTaskRecord() {
    return orderInitiationRetrieveActionTaskRecord;
  }

  public void setOrderInitiationRetrieveActionTaskRecord(Object orderInitiationRetrieveActionTaskRecord) {
    this.orderInitiationRetrieveActionTaskRecord = orderInitiationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return orderInitiationRetrieveActionRequest
  **/

  public String getOrderInitiationRetrieveActionRequest() {
    return orderInitiationRetrieveActionRequest;
  }

  public void setOrderInitiationRetrieveActionRequest(String orderInitiationRetrieveActionRequest) {
    this.orderInitiationRetrieveActionRequest = orderInitiationRetrieveActionRequest;
  }


  /**
   * Get orderInitiationInstanceReport
   * @return orderInitiationInstanceReport
  **/

  public BQOrderInitiationRetrieveInputModelOrderInitiationInstanceReport getOrderInitiationInstanceReport() {
    return orderInitiationInstanceReport;
  }

  public void setOrderInitiationInstanceReport(BQOrderInitiationRetrieveInputModelOrderInitiationInstanceReport orderInitiationInstanceReport) {
    this.orderInitiationInstanceReport = orderInitiationInstanceReport;
  }


  /**
   * Get orderInitiationInstanceAnalysis
   * @return orderInitiationInstanceAnalysis
  **/

  public BQOrderInitiationRetrieveInputModelOrderInitiationInstanceAnalysis getOrderInitiationInstanceAnalysis() {
    return orderInitiationInstanceAnalysis;
  }

  public void setOrderInitiationInstanceAnalysis(BQOrderInitiationRetrieveInputModelOrderInitiationInstanceAnalysis orderInitiationInstanceAnalysis) {
    this.orderInitiationInstanceAnalysis = orderInitiationInstanceAnalysis;
  }


}


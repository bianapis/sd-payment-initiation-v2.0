package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceReport
 */
public class BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceReport   {
  private Object orderInitiationInstanceReportRecord = null;

  private String orderInitiationInstanceReportType = null;

  private String orderInitiationInstanceReportParameters = null;

  private Object orderInitiationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return orderInitiationInstanceReportRecord
  **/

  public Object getOrderInitiationInstanceReportRecord() {
    return orderInitiationInstanceReportRecord;
  }

  public void setOrderInitiationInstanceReportRecord(Object orderInitiationInstanceReportRecord) {
    this.orderInitiationInstanceReportRecord = orderInitiationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return orderInitiationInstanceReportType
  **/

  public String getOrderInitiationInstanceReportType() {
    return orderInitiationInstanceReportType;
  }

  public void setOrderInitiationInstanceReportType(String orderInitiationInstanceReportType) {
    this.orderInitiationInstanceReportType = orderInitiationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return orderInitiationInstanceReportParameters
  **/

  public String getOrderInitiationInstanceReportParameters() {
    return orderInitiationInstanceReportParameters;
  }

  public void setOrderInitiationInstanceReportParameters(String orderInitiationInstanceReportParameters) {
    this.orderInitiationInstanceReportParameters = orderInitiationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return orderInitiationInstanceReport
  **/

  public Object getOrderInitiationInstanceReport() {
    return orderInitiationInstanceReport;
  }

  public void setOrderInitiationInstanceReport(Object orderInitiationInstanceReport) {
    this.orderInitiationInstanceReport = orderInitiationInstanceReport;
  }


}


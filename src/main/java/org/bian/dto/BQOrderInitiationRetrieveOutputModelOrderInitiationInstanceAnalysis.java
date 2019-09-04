package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceAnalysis
 */
public class BQOrderInitiationRetrieveOutputModelOrderInitiationInstanceAnalysis   {
  private Object orderInitiationInstanceAnalysisRecord = null;

  private String orderInitiationInstanceAnalysisReportType = null;

  private String orderInitiationInstanceAnalysisParameters = null;

  private Object orderInitiationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return orderInitiationInstanceAnalysisRecord
  **/

  public Object getOrderInitiationInstanceAnalysisRecord() {
    return orderInitiationInstanceAnalysisRecord;
  }

  public void setOrderInitiationInstanceAnalysisRecord(Object orderInitiationInstanceAnalysisRecord) {
    this.orderInitiationInstanceAnalysisRecord = orderInitiationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return orderInitiationInstanceAnalysisReportType
  **/

  public String getOrderInitiationInstanceAnalysisReportType() {
    return orderInitiationInstanceAnalysisReportType;
  }

  public void setOrderInitiationInstanceAnalysisReportType(String orderInitiationInstanceAnalysisReportType) {
    this.orderInitiationInstanceAnalysisReportType = orderInitiationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return orderInitiationInstanceAnalysisParameters
  **/

  public String getOrderInitiationInstanceAnalysisParameters() {
    return orderInitiationInstanceAnalysisParameters;
  }

  public void setOrderInitiationInstanceAnalysisParameters(String orderInitiationInstanceAnalysisParameters) {
    this.orderInitiationInstanceAnalysisParameters = orderInitiationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return orderInitiationInstanceAnalysisReport
  **/

  public Object getOrderInitiationInstanceAnalysisReport() {
    return orderInitiationInstanceAnalysisReport;
  }

  public void setOrderInitiationInstanceAnalysisReport(Object orderInitiationInstanceAnalysisReport) {
    this.orderInitiationInstanceAnalysisReport = orderInitiationInstanceAnalysisReport;
  }


}


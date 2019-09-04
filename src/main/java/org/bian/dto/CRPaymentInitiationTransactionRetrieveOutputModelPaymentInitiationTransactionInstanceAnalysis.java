package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPaymentInitiationTransactionRetrieveOutputModelPaymentInitiationTransactionInstanceAnalysis
 */
public class CRPaymentInitiationTransactionRetrieveOutputModelPaymentInitiationTransactionInstanceAnalysis   {
  private String paymentInitiationTransactionInstanceAnalysisData = null;

  private String paymentInitiationTransactionInstanceAnalysisReportType = null;

  private Object paymentInitiationTransactionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return paymentInitiationTransactionInstanceAnalysisData
  **/

  public String getPaymentInitiationTransactionInstanceAnalysisData() {
    return paymentInitiationTransactionInstanceAnalysisData;
  }

  public void setPaymentInitiationTransactionInstanceAnalysisData(String paymentInitiationTransactionInstanceAnalysisData) {
    this.paymentInitiationTransactionInstanceAnalysisData = paymentInitiationTransactionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return paymentInitiationTransactionInstanceAnalysisReportType
  **/

  public String getPaymentInitiationTransactionInstanceAnalysisReportType() {
    return paymentInitiationTransactionInstanceAnalysisReportType;
  }

  public void setPaymentInitiationTransactionInstanceAnalysisReportType(String paymentInitiationTransactionInstanceAnalysisReportType) {
    this.paymentInitiationTransactionInstanceAnalysisReportType = paymentInitiationTransactionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return paymentInitiationTransactionInstanceAnalysisReport
  **/

  public Object getPaymentInitiationTransactionInstanceAnalysisReport() {
    return paymentInitiationTransactionInstanceAnalysisReport;
  }

  public void setPaymentInitiationTransactionInstanceAnalysisReport(Object paymentInitiationTransactionInstanceAnalysisReport) {
    this.paymentInitiationTransactionInstanceAnalysisReport = paymentInitiationTransactionInstanceAnalysisReport;
  }


}


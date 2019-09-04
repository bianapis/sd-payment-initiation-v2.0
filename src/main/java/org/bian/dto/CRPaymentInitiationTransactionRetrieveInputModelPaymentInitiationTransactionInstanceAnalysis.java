package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPaymentInitiationTransactionRetrieveInputModelPaymentInitiationTransactionInstanceAnalysis
 */
public class CRPaymentInitiationTransactionRetrieveInputModelPaymentInitiationTransactionInstanceAnalysis   {
  private String paymentInitiationTransactionInstanceAnalysisReference = null;

  private String paymentInitiationTransactionInstanceAnalysisReportType = null;

  private String paymentInitiationTransactionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return paymentInitiationTransactionInstanceAnalysisReference
  **/

  public String getPaymentInitiationTransactionInstanceAnalysisReference() {
    return paymentInitiationTransactionInstanceAnalysisReference;
  }

  public void setPaymentInitiationTransactionInstanceAnalysisReference(String paymentInitiationTransactionInstanceAnalysisReference) {
    this.paymentInitiationTransactionInstanceAnalysisReference = paymentInitiationTransactionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return paymentInitiationTransactionInstanceAnalysisParameters
  **/

  public String getPaymentInitiationTransactionInstanceAnalysisParameters() {
    return paymentInitiationTransactionInstanceAnalysisParameters;
  }

  public void setPaymentInitiationTransactionInstanceAnalysisParameters(String paymentInitiationTransactionInstanceAnalysisParameters) {
    this.paymentInitiationTransactionInstanceAnalysisParameters = paymentInitiationTransactionInstanceAnalysisParameters;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPaymentInitiationTransactionRetrieveInputModelPaymentInitiationTransactionInstanceReportRecord
 */
public class CRPaymentInitiationTransactionRetrieveInputModelPaymentInitiationTransactionInstanceReportRecord   {
  private String paymentInitiationTransactionInstanceReportReference = null;

  private String paymentInitiationTransactionInstanceReportType = null;

  private String paymentInitiationTransactionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return paymentInitiationTransactionInstanceReportReference
  **/

  public String getPaymentInitiationTransactionInstanceReportReference() {
    return paymentInitiationTransactionInstanceReportReference;
  }

  public void setPaymentInitiationTransactionInstanceReportReference(String paymentInitiationTransactionInstanceReportReference) {
    this.paymentInitiationTransactionInstanceReportReference = paymentInitiationTransactionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return paymentInitiationTransactionInstanceReportType
  **/

  public String getPaymentInitiationTransactionInstanceReportType() {
    return paymentInitiationTransactionInstanceReportType;
  }

  public void setPaymentInitiationTransactionInstanceReportType(String paymentInitiationTransactionInstanceReportType) {
    this.paymentInitiationTransactionInstanceReportType = paymentInitiationTransactionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return paymentInitiationTransactionInstanceReportParameters
  **/

  public String getPaymentInitiationTransactionInstanceReportParameters() {
    return paymentInitiationTransactionInstanceReportParameters;
  }

  public void setPaymentInitiationTransactionInstanceReportParameters(String paymentInitiationTransactionInstanceReportParameters) {
    this.paymentInitiationTransactionInstanceReportParameters = paymentInitiationTransactionInstanceReportParameters;
  }


}


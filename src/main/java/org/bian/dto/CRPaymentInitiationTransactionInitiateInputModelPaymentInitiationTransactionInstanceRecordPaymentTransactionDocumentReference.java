package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransactionDocumentReference
 */
public class CRPaymentInitiationTransactionInitiateInputModelPaymentInitiationTransactionInstanceRecordPaymentTransactionDocumentReference   {
  private Object documentRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The copy of the identification document used 
   * @return documentRecord
  **/

  public Object getDocumentRecord() {
    return documentRecord;
  }

  public void setDocumentRecord(Object documentRecord) {
    this.documentRecord = documentRecord;
  }


}


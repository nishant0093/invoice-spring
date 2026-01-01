package com.invoicegenerator.project.model;

public class InvoiceForm {

	
	//prefilled or company setting
	private String companyName;
	private String companyAddress;
	private String companyGstId;
	private String companyBankName;
	private String companyBankAc;
	private String companyBankIfsc;
	private String footerNote;
	private String companyLogo;
	
	
	private String customerName;
	//following details will be fetched after selecting company name
	private String customerAddress;
	private String customerGstId;
	private String paymentTerm;
	private String deliveryTerm;
	private String cgst;
	private String sgst;
	private String igst;
	
	private String invoiceNumber;
	private String invoiceDate;
	private String purchaseOrderNumber;
	private String purchaseOrderDate;

	private String itemDescription;
	private String qty;
	private String rate;
	private String discount;
	private String netAmt;
	private String grossAmt;

	
}

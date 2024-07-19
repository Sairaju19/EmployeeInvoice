package com.sai.service;

import java.util.List;

import com.sai.model.EInvoice;

public interface EInvoiceService {

	public EInvoice saveInvoice(EInvoice einvoice);
	public EInvoice updateInvoice(EInvoice einvoice,int eno);
	public EInvoice getOneInvoice(int eno);
	public void deleteInvoice(int eno);
	public List<EInvoice> getAllInvoices();
}

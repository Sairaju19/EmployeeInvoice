package com.sai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sai.model.EInvoice;
import com.sai.service.EInvoiceServiceImp;

@RestController
@CrossOrigin(origins = {"*"})
public class EInvoiceController {

	@Autowired
	public EInvoiceServiceImp service;
	@PostMapping("/save")
	public String saveInvoice(@RequestBody EInvoice einvoice) {
		EInvoice saveInvoice=service.saveInvoice(einvoice);
		String message=null;
		if(saveInvoice!=null)
		{
			message="Data Saved Successfully";
		}
		else
		{
			message="Data is Failed";
		}
		return message;
	}
	@PutMapping("/update/{eno}")
	public EInvoice updateInvo(@RequestBody EInvoice einvoice,@PathVariable int eno) {
		EInvoice update=service.updateInvoice(einvoice, eno);
		return update;
	}
	@GetMapping("/getOne/{eno}")
	public EInvoice getOneInvo(@PathVariable int eno) {
		EInvoice getOne=service.getOneInvoice(eno);
		return getOne;
	}
	@DeleteMapping("/delete/{eno}")
	public void deleteInvo(@PathVariable int eno) {
		service.deleteInvoice(eno);
	}
	@GetMapping("/getAll")
	public List<EInvoice> getAllInvo(){
		List<EInvoice> getAll=service.getAllInvoices();
		return getAll;
	}
}

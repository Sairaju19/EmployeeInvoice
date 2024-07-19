package com.sai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.model.EInvoice;
import com.sai.repo.EInvoiceRepo;
@Service
public class EInvoiceServiceImp implements EInvoiceService {

	@Autowired
	private EInvoiceRepo repo;
	@Override
	public EInvoice saveInvoice(EInvoice einvoice) {
		int ta=0,da=0,hra=0,pf=0,gross_sal=0,net_sal=0;
		if(einvoice.getSalary()<3000)
		{
			ta=(einvoice.getSalary()*7)/100;
			da=(einvoice.getSalary()*9)/100;
			hra=(einvoice.getSalary()*11)/100;
			pf=(einvoice.getSalary()*15)/100;
		}
		else if(einvoice.getSalary()>=3000 && einvoice.getSalary()<50000)
		{
			ta=(einvoice.getSalary()*12)/100;
			da=(einvoice.getSalary()*13)/100;
			hra=(einvoice.getSalary()*17)/100;
			pf=(einvoice.getSalary()*22)/100;
		}
		else if(einvoice.getSalary()>=50000)
		{
			ta=(einvoice.getSalary()*17)/100;
			da=(einvoice.getSalary()*19)/100;
			hra=(einvoice.getSalary()*21)/100;
			pf=(einvoice.getSalary()*25)/100;
		}
		gross_sal=einvoice.getSalary()+ta+da+hra+pf;
		net_sal=gross_sal-pf;
		einvoice.setTa(ta);
		einvoice.setDa(da);
		einvoice.setHra(hra);
		einvoice.setPf(pf);
		einvoice.setGross_sal(gross_sal);
		einvoice.setNet_sal(net_sal);
		EInvoice save=repo.save(einvoice);
		return save;
	}

	@Override
	public EInvoice updateInvoice(EInvoice einvoice, int eno) {
		EInvoice oldInvo=repo.findById(eno).get();
		int ta=0,da=0,hra=0,pf=0,gross_sal=0,net_sal=0;
		int sal=einvoice.getSalary();
		if(sal<3000)
		{
			ta=(sal*8)/100;
			da=(sal*10)/100;
			hra=(sal*12)/100;
			pf=(sal*14)/100;
		}
		else if(sal>=3000 && sal<50000)
		{
			ta=(sal*14)/100;
			da=(sal*17)/100;
			hra=(sal*19)/100;
			pf=(sal*23)/100;
		}
		else if(sal>=50000)
		{
			ta=(sal*19)/100;
			da=(sal*23)/100;
			hra=(sal*26)/100;
			pf=(sal*28)/100;
		}
		gross_sal=sal+ta+da+hra+pf;
		net_sal=gross_sal-pf;
		oldInvo.setEno(eno);
		oldInvo.setEname(einvoice.getEname());
		oldInvo.setSalary(einvoice.getSalary());
		oldInvo.setTa(ta);
		oldInvo.setDa(da);
		oldInvo.setHra(hra);
		oldInvo.setPf(pf);
		oldInvo.setGross_sal(gross_sal);
		oldInvo.setNet_sal(net_sal);
		return repo.save(oldInvo);
	}

	@Override
	public EInvoice getOneInvoice(int eno) {
		EInvoice get=repo.findById(eno).get();
		return get;
	}

	@Override
	public void deleteInvoice(int eno) {
		repo.deleteById(eno);

	}

	@Override
	public List<EInvoice> getAllInvoices() {
		List<EInvoice> getAllInvo=repo.findAll();
		return getAllInvo;
	}

}

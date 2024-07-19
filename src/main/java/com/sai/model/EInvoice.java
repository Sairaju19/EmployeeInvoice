package com.sai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EInvoice {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eno;
	private String ename;
	private int salary;
	private int ta;
	private int da;
	private int hra;
	private int pf;
	private int gross_sal;
	private int net_sal;
	public EInvoice() {
		super();
	}
	public EInvoice(int eno, String ename, int salary, int ta, int da, int hra, int pf, int gross_sal, int net_sal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.ta = ta;
		this.da = da;
		this.hra = hra;
		this.pf = pf;
		this.gross_sal = gross_sal;
		this.net_sal = net_sal;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getTa() {
		return ta;
	}
	public void setTa(int ta) {
		this.ta = ta;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	public int getGross_sal() {
		return gross_sal;
	}
	public void setGross_sal(int gross_sal) {
		this.gross_sal = gross_sal;
	}
	public int getNet_sal() {
		return net_sal;
	}
	public void setNet_sal(int net_sal) {
		this.net_sal = net_sal;
	}
	@Override
	public String toString() {
		return "EInvoice [eno=" + eno + ", ename=" + ename + ", salary=" + salary + ", ta=" + ta + ", da=" + da
				+ ", hra=" + hra + ", pf=" + pf + ", gross_sal=" + gross_sal + ", net_sal=" + net_sal + "]";
	}
	
	
}

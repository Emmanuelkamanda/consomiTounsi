package tn.consomitounsi.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Admin extends User implements Serializable {
	
	private static final long serialVersionUID= 1L;
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private int id;
	private int workload;
	private int cin;	
	
	//@OneToMany(cascade = CascadeType.ALL)
	//private List<AccountingGain> accountingGains;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int workload, int cin){//, List<AccountingGain> accountingGains) {
		super();
		this.workload = workload;
		this.cin = cin;
		//this.accountingGains = accountingGains;
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

//	public List<AccountingGain> getAccountingGains() {
//		return accountingGains;
//	}
//
//	public void setAccountingGains(List<AccountingGain> accountingGains) {
//		this.accountingGains = accountingGains;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Admin [workload=" + workload + ", cin=" + cin + ", accountingGains=" + /*accountingGains +*/ "]";
	}
	
	
}

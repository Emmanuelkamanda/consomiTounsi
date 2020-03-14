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
public class StoreManager extends User implements Serializable {
	
	private static final long serialVersionUID= 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int workload;
	private int cin;	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product> products;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Publicity> publicities;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Department> departments;

	public StoreManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StoreManager(int workload, int cin, List<Product> products, //List<Publicity> publicities,
			List<Department> departments) {
		super();
		this.workload = workload;
		this.cin = cin;
		this.products = products;
		//this.publicities = publicities;
		this.departments = departments;
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

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

//	public List<Publicity> getPublicities() {
//		return publicities;
//	}
//
//	public void setPublicities(List<Publicity> publicities) {
//		this.publicities = publicities;
//	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "StoreManager [workload=" + workload + ", cin=" + cin + ", products=" + products + ", publicities="
				//+ publicities
				+ ", departments=" + departments + "]";
	}
	
	

}

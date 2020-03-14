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
public class Stock implements Serializable {
	
	private static final long serialVersionUID= 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int missisngProduct;
	private int orderedProduct;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product> products;

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stock(Long id, int missisngProduct, int orderedProduct, List<Product> products) {
		super();
		this.id = id;
		this.missisngProduct = missisngProduct;
		this.orderedProduct = orderedProduct;
		this.products = products;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getMissisngProduct() {
		return missisngProduct;
	}

	public void setMissisngProduct(int missisngProduct) {
		this.missisngProduct = missisngProduct;
	}

	public int getOrderedProduct() {
		return orderedProduct;
	}

	public void setOrderedProduct(int orderedProduct) {
		this.orderedProduct = orderedProduct;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", missisngProduct=" + missisngProduct + ", orderedProduct=" + orderedProduct
				+ ", products=" + products + "]";
	}
	
	
	
	

}

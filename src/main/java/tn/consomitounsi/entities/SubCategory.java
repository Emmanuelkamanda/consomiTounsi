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
public class SubCategory implements Serializable {
	
	private static final long serialVersionUID= 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subCategoryId;
	private Long productId;
	private String productName;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product> products;

	public SubCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubCategory(Long subCategoryId, Long productId, String productName, List<Product> products) {
		super();
		this.subCategoryId = subCategoryId;
		this.productId = productId;
		this.productName = productName;
		this.products = products;
	}

	public Long getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(Long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "SubCategory [subCategoryId=" + subCategoryId + ", productId=" + productId + ", productName="
				+ productName + ", products=" + products + "]";
	}
	
	
			
	

}

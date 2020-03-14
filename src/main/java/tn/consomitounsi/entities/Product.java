package tn.consomitounsi.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Product implements Serializable {
	
	private static final long serialVersionUID= 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String category;
	private String marque;
	private int selling_price;
	private int buying_price;
	private String type;
	private int weight;
	private int code_barre;
	private int id_sub_category;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, String category, String marque, int selling_price, int buying_price,
			String type, int weight, int code_barre, int id_sub_category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.marque = marque;
		this.selling_price = selling_price;
		this.buying_price = buying_price;
		this.type = type;
		this.weight = weight;
		this.code_barre = code_barre;
		this.id_sub_category = id_sub_category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getSelling_price() {
		return selling_price;
	}
	public void setSelling_price(int selling_price) {
		this.selling_price = selling_price;
	}
	public int getBuying_price() {
		return buying_price;
	}
	public void setBuying_price(int buying_price) {
		this.buying_price = buying_price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getCode_barre() {
		return code_barre;
	}
	public void setCode_barre(int code_barre) {
		this.code_barre = code_barre;
	}
	public int getId_sub_category() {
		return id_sub_category;
	}
	public void setId_sub_category(int id_sub_category) {
		this.id_sub_category = id_sub_category;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", marque=" + marque
				+ ", selling_price=" + selling_price + ", buying_price=" + buying_price + ", type=" + type + ", weight="
				+ weight + ", code_barre=" + code_barre + ", id_sub_category=" + id_sub_category + "]";
	}
	
	
	

}

package br.com.willianmendesf.controle.model;

public class SalesModel {
	
	private Integer id;
	private String name;
	private Integer value;
	private String description;
	private Integer inventory;
	private String image;
	private String sku;
	private String color;
	
	public SalesModel(
		Integer inventory,
		Integer value, 
		String description,
		String image, 
		String name, 
		String color,
		String sku,
		Integer id
	) {
		super();
		this.description 	= description;
		this.inventory 		= inventory;
		this.value 			= value;
		this.color 			= color;
		this.image 			= image;
		this.name 			= name;
		this.sku 			= sku;
		this.id 			= id;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getValue() {
		return value;
	}
	
	public void setValue(Integer value) {
		this.value = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getInventory() {
		return inventory;
	}
	
	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getSku() {
		return sku;
	}
	
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}

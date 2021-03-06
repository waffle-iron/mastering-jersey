package com.mastering.jersey.preference.api;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;

public class Item {

	@XmlElement(name = "id")
	private Long id;

	@XmlElement(name = "title")
	private String title;
	
	@XmlElement(name = "description")
	private String description;
	
	@XmlElement(name = "picture_url")
	private String pictureUrl;
	
	@XmlElement(name = "category_id")
	private String category;
	
	@XmlElement(name = "quantity")
	private int quantity;
	
	@XmlElement(name = "currency_id")
	private String currency;
	
	@XmlElement(name = "unit_price")
	private BigDecimal price;
	
	public Item(Long id, String title) {
		this.id = id;
		this.title = title;
	}
	
	public Item() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", description=" + description + ", pictureUrl=" + pictureUrl
				+ ", category=" + category + ", quantity=" + quantity + ", currency=" + currency + ", price=" + price
				+ "]";
	}

}

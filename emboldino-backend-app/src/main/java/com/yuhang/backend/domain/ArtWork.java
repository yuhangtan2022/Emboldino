package com.yuhang.backend.domain;

public class ArtWork {
	private long id;
	private String subject;
	private String description;
	private String url;
	private String style;
	private String type;
	private double price;
	
	public ArtWork() {}

	public ArtWork(long id, String subject, String description, String url, String style, String type, double price) {
		super();
		this.id = id;
		this.subject = subject;
		this.description = description;
		this.url = url;
		this.style = style;
		this.type = type;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "ArtWork [id=" + id + ", subject=" + subject + ", description=" + description + ", url=" + url
				+ ", style=" + style + ", type=" + type + ", price=" + price + "]";
	}

	

}

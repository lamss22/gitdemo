package demo.entity;

import java.util.Date;

public class Product {
	private String proId;
	private String proName;
	private String producer;
	private Integer yearMaking;
	private Date expireDate;
	private Long quantity;
	private Double price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String proId, String proName, String producer, Integer yearMaking, Date expireDate, Long quantity,
			Double price) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.producer = producer;
		this.yearMaking = yearMaking;
		this.expireDate = expireDate;
		this.quantity = quantity;
		this.price = price;
	}

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public Integer getYearMaking() {
		return yearMaking;
	}

	public void setYearMaking(Integer yearMaking) {
		this.yearMaking = yearMaking;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}

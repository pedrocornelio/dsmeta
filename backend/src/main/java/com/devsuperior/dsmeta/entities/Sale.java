package com.devsuperior.dsmeta.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String sellerName;
	private Integer visited;
	private Integer deals;
	private double amount;
	private LocalDate date;
	
	public Sale() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getSellerName() {
		return sellerName;
	}
	
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	
	public Integer getVisited() {
		return visited;
	}
	
	public void setVisited(Integer visited) {
		this.visited = visited;
	}
	
	public Integer getDeals() {
		return deals;
	}
	
	public void setDeals(Integer deals) {
		this.deals = deals;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((deals == null) ? 0 : deals.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((sellerName == null) ? 0 : sellerName.hashCode());
		result = prime * result + ((visited == null) ? 0 : visited.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sale other = (Sale) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (deals == null) {
			if (other.deals != null)
				return false;
		} else if (!deals.equals(other.deals))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (sellerName == null) {
			if (other.sellerName != null)
				return false;
		} else if (!sellerName.equals(other.sellerName))
			return false;
		if (visited == null) {
			if (other.visited != null)
				return false;
		} else if (!visited.equals(other.visited))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sale [id=" + id + ", sellerName=" + sellerName + ", visited=" + visited + ", deals=" + deals
				+ ", amount=" + amount + ", date=" + date + "]";
	}

}

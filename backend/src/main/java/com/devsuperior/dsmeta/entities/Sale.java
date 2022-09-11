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
	private String SellerName; 
	private Integer visited; //Número de visitas
	private Integer deals; //Número de Vendas
	private Double amount; //Quantia da venda
	private LocalDate date; /*LocalDate usado para situações 
								em que o dado só é uma data*/

	
	public Sale() {
		//Cria o objeto do tipo Sale
	}
	
	public Sale(Long id, String sellerName, Integer visited, Integer deals, Double amount, LocalDate date) {
		this.id = id;
		SellerName = sellerName;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getSellerName() {
		return SellerName;
	}
	
	public void setSellerName(String sellerName) {
		SellerName = sellerName;
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
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}

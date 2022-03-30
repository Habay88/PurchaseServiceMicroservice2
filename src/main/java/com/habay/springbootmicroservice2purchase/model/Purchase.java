package com.habay.springbootmicroservice2purchase.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;



@Entity
@Table(name = "purchase")
public class Purchase
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "course_id", nullable = false)
    private Long courseId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "purchase_time", nullable = false)
    private LocalDateTime purchaseTime;

	public Purchase() {
	}

	public Purchase(Long id, Long userId, Long courseId, String title, Double price, LocalDateTime purchaseTime) {
		this.id = id;
		this.userId = userId;
		this.courseId = courseId;
		this.title = title;
		this.price = price;
		this.purchaseTime = purchaseTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDateTime getPurchaseTime() {
		return purchaseTime;
	}

	public void setPurchaseTime(LocalDateTime purchaseTime) {
		this.purchaseTime = purchaseTime;
	}
	
    
    
}

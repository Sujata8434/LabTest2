package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRecords {
	@Id
	private int book_id;
	private String book_title;
	private String book_author;
	private int book_pages;
	private int book_price;

}

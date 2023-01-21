package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	private int s_id;
	private String s_name;
	private String s_dept;
	
	@ManyToMany
	private List<Book> book;
	
	

}

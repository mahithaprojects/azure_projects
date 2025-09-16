package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

 
    private String name;
    
 
    private String Department;

   
	public UserEntity(Long id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
	}
	public UserEntity() {
		super();
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", Department=" + Department + "]";
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

package com.collection;

public class EmployeeDto {

	private Integer id;

	private String name;

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

	public static EmployeeDto from(Employee employee) {

		EmployeeDto dto = new EmployeeDto();
		dto.setId(employee.getId());
		dto.setName(employee.getName());
		return dto;
	}

	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", name=" + name + "]";
	}

}

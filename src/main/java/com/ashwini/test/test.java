package com.ashwini.test;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class test implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("id")
	private int id;

	private java.lang.String name;

	private long salary;

	private double exp;

	private java.lang.Long sal;

	public test() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public long getSalary() {
		return this.salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public double getExp() {
		return this.exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public java.lang.Long getSal() {
		return this.sal;
	}

	public void setSal(java.lang.Long sal) {
		this.sal = sal;
	}

	public test(int id, java.lang.String name, long salary, double exp,
			java.lang.Long sal) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.exp = exp;
		this.sal = sal;
	}

}
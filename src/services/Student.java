package services;

import java.util.Date;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.NotEmpty;



public class Student {

	@isValidHobby(hobbysAllowed="Footbal")
	@Size(min=10,max=30)
	//@Size(min=10,max=30,message="studentis saxeli unda iyos {min}-{max} simbolo")//shemtxveva rodesac mesigi xelit gvinda gavuwerot
	private String name;
	
	@NotNull//null ar unda iyos mnishvneloba
	@NotEmpty//empty an null ar unda iyos mnishvneloba
	private String surename;
	
	@Max(100)//mnishvneloba 100ze meti ar unda iyos
	@Min(5)//mnishvneloba 5ze naklebi ar unda iyos
	private String age;
	
	@Future//unda mititebuli iyos momavlis dro
	@Past//unda mititebuli iyos mimdinare dro an warsuli
	private Date date;
	
	private Address address;
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurename() {
		return surename;
	}
	public void setSurename(String surename) {
		this.surename = surename;
	}
	
}

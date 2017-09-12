package services;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//is velebi romlebsac eqneba null mnishvneloba (0 ar chaitvleba null-ad) ar iqneba gamotanili jsonshi
@JsonInclude(JsonInclude.Include.NON_NULL)
//mititebul velebs saertod ar gamoitans jsonshi 
@JsonIgnoreProperties({ "country", "phone" })
//alagebs jsonis velebis tanmimdevrobas im tanmimdevrobit rasac gavwert.tu marto nawili mivutitet im nawils daalagebs chveni wesit danarchens avtomaturad
@JsonPropertyOrder({ "city", "zipcode" })
public class Address {

	//jsonshi velis saxeli sxva saxelit sheicvalos da sxva anotaciebshi  
	@JsonProperty("su_telavia")
	private String city;

	private String country;
	private String street;
	private int zipcode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	private int phone;

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
}

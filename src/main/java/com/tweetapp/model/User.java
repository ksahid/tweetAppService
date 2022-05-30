package com.tweetapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity
@Table(name="USER")
public class User {
	

	@Id
	@Min(1)
	public int userId;

	@NotBlank(message = "firstName cannot be null")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid firstName")
	public String firstName;

	@NotBlank(message = "lastName cannot be null")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid LastName")
	public String lastName;

	@Pattern(regexp = "male|female", message = "Invalid Gender")
	@NotBlank(message = "gender cannot be null")
	public String gender;

	@Pattern(regexp = "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$", message = "Date OF birth Should be in YYYY-MM-DD format")
	public String dob;

	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid EmailId")
	@NotBlank(message = "Enter Valid Email Id")
	public String emailId;

	@NotBlank(message = "password cannot be null")
//	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&(){}[]:;<>,.?/~_+-=|\\]).{8,32}$", message = "Password Should Atleast contain one lowerCase,one UpperCase, one Special Char, one digit and length should be greater than 8.")
	public String password;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(@Min(1) int userId,
			@NotBlank(message = "firstName cannot be null") @Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid firstName") String firstName,
			@NotBlank(message = "lastName cannot be null") @Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid LastName") String lastName,
			@Pattern(regexp = "male|female", message = "Invalid Gender") @NotBlank(message = "gender cannot be null") String gender,
			@Pattern(regexp = "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$", message = "Date OF birth Should be in YYYY-MM-DD format") String dob,
			@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid EmailId") @NotBlank(message = "Enter Valid Email Id") String emailId,
			@NotBlank(message = "password cannot be null") String password) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.emailId = emailId;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}

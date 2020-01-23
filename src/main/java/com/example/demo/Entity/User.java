package com.example.demo.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private Integer Id;
private String name;
private String email;
private Boolean status;
private String phone;
private boolean team;



public boolean getTeam() {
	return team;
}
public void setTeam(boolean team) {
	this.team = team;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Boolean getStatus() {
	return status;
}
public void setStatus(Boolean status) {
	this.status = status;
}
public Integer getId() {
return Id;
}
public void setId(Integer id) {
this.Id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}


}

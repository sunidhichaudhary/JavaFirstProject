package Week7.Assignment;

public class EmployeePojo {
 private int id;
 private String name;
 private String city;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "EmployeePojo [id=" + id + ", name=" + name + ", city=" + city + "]";
}
}

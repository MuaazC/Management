package management;

public class management {
private int staff_id;
private String last_name;
private String first_name;
private String position;
private String dob;
private int pay;
public management() {
	super();
}
public management (int staff_id, String last_name, String first_name, String position, String dob, int pay) {
    super();
	this.staff_id = staff_id;
	this.last_name = last_name;
	this.first_name = first_name;
	this.position = position;
	this.dob = dob;
	this.pay = pay;
}
public management(String last_name, String first_name, String position, String dob, int pay) {
	super();
	this.last_name = last_name;
	this.first_name = first_name;
	this.position = position;
	this.dob = dob;
	this.pay = pay;
}
public int getId() {
	return staff_id;
}

public void setId(int staff_id) {
	this.staff_id = staff_id;
}
public String getlastName() {
	return last_name;
}

public void setlastName(String last_name) {
	this.last_name = last_name;
}
public String getfirstName() {
	return first_name;
}

public void setfirstName(String first_name) {
	this.first_name = first_name;

}
public String getposition() {
	return position;
}

public void position(String position) {
	this.position = position;
}
public String getdob() {
	return dob;
}

public void dob(String dob) {
	this.dob = dob;
}
public int getpay() {
	return pay;
}

public void pay(int pay) {
	this.pay = pay;
}

}


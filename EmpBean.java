package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EmpBean implements Serializable
{
private String id,name,address;
private float sal;
public String getId()
{
	return id;
}
public void setId(String id) 
{
	this.id = id;
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name = name;
}
public String getAddress() 
{
	return address;
}
public void setAddress(String address) 
{
	this.address = address;
}
public float getSalary()
{
	return sal;
}
public void setSal(float salary)
{
	this.sal = salary;
}

}

package vo;

public class Employee {
	
    private String name;
    private String mobile;
    private String city;
    
    public Employee() {}
    
    public Employee(String name, String mobile, String city) { 
    	this.name = name;
    	this.mobile = mobile;
    	this.city = city;
    }
    
    public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}

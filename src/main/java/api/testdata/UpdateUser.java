package api.testdata;

public class UpdateUser {
	
	private String accountno;
	private String departmentno;
	private String salary;
	private String pincode;
	private String id;
	private String userid;
	
	public UpdateUser(String accountno, String departmentno, String salary, String pincode, String id, String userid) {

		this.accountno = accountno;
		this.departmentno = departmentno;
		this.salary = salary;
		this.pincode = pincode;
		this.id = id;
		this.userid = userid;
	}
	
	public String getAccountNo() {
		return accountno;
	}
	
	public String getSalary() {
		return salary;
	}
	
	public String getPinCode() {
		return pincode;
	}
	
	public String getDepartmentNo() {
		return departmentno;
	}
	
	public String getId() {
		return id;
	}
	
	public String getuserId() {
		return userid;
	}
	
	

}
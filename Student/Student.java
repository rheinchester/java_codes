class Student {
	private String name;
	private String email;

	public Student (){
		name = "unassigned";
		email="unassigned";
	} 

	public String getName(){
		return name;
	}

	public String getEmail(){
		return email;
	}

	public void setName(String studentName){
		name = studentName;
	}
	public void setEmail(String studentEmail){
		email = studentEmail;
	}
}
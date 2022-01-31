class EmployeedetailsTester{
	public static void main (String [] args){
		Employeedetails dots [] = new Employeedetails[5];
		
		Employeedetails dto=new Employeedetails(01, "Ashta","17ashta@gmail.com", 8431935331l,"17-04-1999");
		Employeedetails dto1=new Employeedetails(02,"Arpitha","arpith@gmail.com", 9880784540l,"13-09-1996");
		Employeedetails dto2 = new Employeedetails(03,"ashu","ashu@gmail.com",1234567890l,"17-04-1994");
		Employeedetails dto3 = new Employeedetails(04,"lakshmi","lakshmi@gmail.com",   987654321l,"08-04-1990");
		Employeedetails dto4=new Employeedetails(05,"ajit","ajit@gmail.com",      9742883081l,"09-07-1991");

		dots[0] = dto;
		dots[1] = dto1;
		dots[2] = dto2;
		dots[3] = dto3;
		dots[4] = dto4;
		Employeedetailsmethod.add(9,"oie","oie@gmail.com",7896543210l,"12-04-1995");
		Employeedetailsmethod.printall();
		Employeedetailsmethod.updatebyName("ashu","lovely");
		Employeedetailsmethod.printall();
		Employeedetailsmethod.deleteByName("lakshmi");
		Employeedetailsmethod.printall();
		
		for (int index=0;index<dots.length;index++){
			System.out.println(dots[index].id +" \t "+ dots[index].name +" \t "+ dots[index].Email +" \t "+ dots[index].DOB +" \t "+dots[index].phnum);
		}
	
	}
}
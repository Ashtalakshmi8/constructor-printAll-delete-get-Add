class Employeedetailsmethod{
	static void add(int id, String name,String Email,long phnum,	String DOB ){
	System.out.println(id +"\t"+ name +"\t"+ Email +"\t"+ phnum +"\t"+ DOB );
	}
static String []name = {"Ashta","Arpitha","ashu","lakshmi","ajit"};
	
	static void updatebyName (String oldname, String DOB){
		for (int index =0;index<name.length;index++){ //
			if(oldname.equals(name[index]))
				name [index]= DOB;
	
	    }
    }
	 static void printall(){
		for (int index =0;index<name.length;index++ ){
			System.out.println(name[index]);
		}
		System.out.println();
	}
	
	static void deleteByName(String names){
		for(int index=0;index<name.length;index++){
			if (name [index].equals(names))
				name[index]=null;
		}
	}
		
}	
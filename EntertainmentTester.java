class EntertainmentTester{
	
	public static void main (String [] args){
		Entertainmentoperation operations=new Entertainmentoperation();
		Entertainment dto1=new Entertainment("video",1.30f ,false,2);
		Entertainment dto2=new Entertainment("movie",2.33f ,true,6);
		
		
		boolean response = operations.add (0,dto1);
		System.out.println(response);
		System.out.println();
		boolean response2 = operations.add(1,dto2);
		System.out.println(response2);
		System.out.println();
		
		operations.printall();
		
		System.out.println("updatetypebyliked");
		
		operations.updatetypebyliked(true,"video");
		
		operations.updatetypebyliked(false,"movie");
		
		operations.printall();
		}
}
		
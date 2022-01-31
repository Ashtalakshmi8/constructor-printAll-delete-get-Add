class Entertainmentoperation{
	Entertainment dtos [] = new Entertainment[5];
	
	boolean add (int index,Entertainment dto){
		System.out.println("add() Started");
		boolean hu= true;
		if (index<dtos.length){
			dtos[index]=dto;
			System.out.println(dtos[index].type+"\t"+dtos[index].duration+"\t"+dtos[index].liked+"\t"+dtos[index].rating);
			
			hu= false;
		}else
		{
			System.out.println("index value is invalid");
			hu=true;
		}
		
		System.out.println("add() ended");
		return hu;
		
		}
		
		void printall(){
			
			System.out.println("printall() method");
			
			for (int index=0;index<dtos.length;index++){
				if(dtos[index]!=null){
					
					System.out.println(dtos[index].type+"\t"+dtos[index].duration+"\t"+dtos[index].liked+"\t"+dtos[index].rating);
					
				}
			}
		}
		
		void updatetypebyliked(boolean like,String typeeer){
			for (int index=0;index<dtos.length;index++){
				if(dtos[index]!=null){
					
					if (typeeer.equals(dtos[index].type)){
						dtos[index].liked=like;
					}
				}
			}	
		}
	}

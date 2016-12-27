package list;

public class ReverseList {
	
	
	public static void main(String[] args) {
		MyList list= new MyList(1);
		list.next=new MyList(2);
		list.next.next= new MyList(3);
		//list.next.next.next= new MyList(4);
		System.out.println(list.toString());
		
		MyList reversedList= reverse(list);
		System.out.println(reversedList);
	}

	
	private static MyList reverse(MyList list) {
		 if(list==null || list.next==null) return list;
		 
		 MyList remainingReverse= reverse(list.next);
		 
		 MyList current= remainingReverse;
		 
		 
		 while(current.next!=null)
			 current=current.next;
		 
		 current.next=list;
		 
		 list.next=null;
		 
		 return remainingReverse;
		 
	}


	public static class MyList {
		int value;
		MyList next;

		public MyList(int k) {
			value = k;
			next = null;
		}
		
		@Override
		public String toString() {
		
			MyList current= this;
			
			String output="";
			
			while(current!=null){
				output += current.value;
				current= current.next;
			}
			
			return output;
			
		}

	}

}

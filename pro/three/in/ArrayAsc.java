package pro.three.in;

public class ArrayAsc {

	public static void main(String[] args) {
      int [] a= {10,20,15,30};
      int temp=0;
      for (int i = 0; i < a.length; i++) {
    	  for (int j = i+1; j < a.length; j++) {
    		  if (a[i]>a[j]) {
    			  temp=a[j];
    			  a[j]=a[i];
    			  a[i]=temp;
    			  
				
			}
    		  
			
		}
    	  System.out.println(a[a.length-1]);
		
	}
	}

}

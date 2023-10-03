package pro.three.in;

public class Counts {

	public static void main(String[] args) {
      String s="SuryA0572";
      int digit=0;
      int upper=0;
      int Lower=0;
      //char[] a = s.toCharArray();
      for (int i = 0; i < s.length(); i++) {
    	  char a = s.charAt(i);
    	  if (Character.isDigit(a)) {
    		  digit++;
			
		}
    	  else if (Character.isUpperCase(a)) {
    		  upper++;
    	}
    	  else if (Character.isLowerCase(a)) {
    		  Lower++;
    	}
 
    	  
	}
      System.out.println("digit:"+digit);
      System.out.println("Upper:"+upper);
      System.out.println("Lower:"+Lower);
	}

}

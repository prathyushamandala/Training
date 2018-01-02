
 public class StringConcat {
	 public static void main(String args[]){
	        String s1 = "Prathyusha";
	   
	        String s2 = "Mandala";
	        String s3 = s1+s2;			/* using + operator*/
	        System.out.println(s3);   
	        
	        s3 = s1.concat(s2);			/*using concat() method*/
	        System.out.println(s3);  
	        
	        StringBuffer sBuffer = new StringBuffer();
	        sBuffer.append(s1).append(s2);  /*using String Buffer*/
	        System.out.println(sBuffer);
	        
	        StringBuilder sb = new StringBuilder();
	        sb.append(s1).append(s2);        /*using String Builder*/
	        System.out.println(sb);
	 }
}

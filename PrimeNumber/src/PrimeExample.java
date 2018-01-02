public class PrimeExample {  
		    public static void main (String args[]){
		    	 int n=38;
		    	 int flag=0;
		    	 if(n==0||n==1){  
		    		 System.out.println(" Is not prime number :"+n); 
		    	 }
		    	 else {
		    		   
		    	for(int i=2; i<=n-1; i++){
		    		if(n%i==0) {
		    			 System.out.println("Is not prime number :"+n); 
		    			 flag=1;
		    			 break;
		    		}
		    	}
		    	if(flag==0)
		    	{ 
		    		System.out.println("Is prime number :" +n); 
		    		} 
		    		
		    	}
		    }
		    }
		   
		    
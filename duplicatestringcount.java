public class Main
{
	public static void main(String[] args) {
	    String str="aaabbababaacccbab";
	    boolean flag = false;
	    for(int i=0;i<=str.length()-1;i++){
	       flag =false;
	        for(int j=0;j<=i-1;j++){
	            if(str.charAt(i)==str.charAt(j)){
	                flag=true;
	                break;
	                
	            }
	        }
	        if(!flag)
	       {
	           int count = 0;
	           for(int j=i;j<=str.length()-1;j++){
	               if(str.charAt(i)==str.charAt(j)){
	                   count++;
	               }
	           }
	           System.out.println(str.charAt(i)+ "-->" + count);
	                
	       }
	    }
	}
}

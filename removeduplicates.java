
public class Main
{
	public static void main(String[] args) {
	    String str="aaabbababaacccbab";
	    String res="";
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
	                res=res+str.charAt(i) ;
	                
	            }
	        }
	    System.out.println(res);
	}
}

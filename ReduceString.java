import java.util.*;
public class ReduceString{
	public static void main(String args[]){
		String s="aaabccddd";
		StringBuilder sb=new StringBuilder(s);
                boolean b=true;
                while(b)
                {
                   b=false;
                  for(int i=0;i<sb.length()-1;i++)
                  {
                        if(sb.charAt(i)==sb.charAt(i+1))
                       {
                            sb.delete(i,i+2);
                             b=true;
                         }
                        System.out.println("b: "+b+" "+sb); 
                  }
                 }
                 if(sb.length()==0)
                  {
                       System.out.println("Empty String");
                  }
                  else
                   {
                       System.out.println(sb.toString());
                 }
	}
}
public class Main

{

	public static void main(String[] args) {

	   String a="aaabbbbbccccdddaa";

	   String res="";

	   int c=1;

	   for(int i=0;i<a.length();i++){

	       if((i+1)<a.length()&& a.charAt(i)==a.charAt(i+1)){

	           c++;

	       }

	       else{

	           res=res+a.charAt(i);

	           res=res+c;

	           c=1;

	       }

	   }

	   System.out.print(res);

	}

}


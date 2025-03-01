import java.util.*;

public class Main

{

	public static void main(String[] args) {

		Scanner a=new Scanner(System.in);

		System.out.print("Enter the size of the Array:");

		int n=a.nextInt();

		int[] arr=new int[n];

		System.out.print("Enter the elements of the Array:");

		for(int i=0;i<n;i++){

		    arr[i]=a.nextInt();

		}

		int A=0;

		int B=0;

		for(int i=0;i<n;i++){

		    if(arr[i]%2==0){

		        A=A+arr[i];

		    }

		}

		for(int i=0;i<n;i++){

		    if(arr[i]%2!=0){

		        B=B+arr[i];

		    }

		}

		System.out.println("Sum Of Even No.s:"+A);

		System.out.println("Sum Of Odd No.s:"+B);

		System.out.println("Differnce:"+Math.abs(A-B));

	}

}


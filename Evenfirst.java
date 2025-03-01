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

		for(int i=0;i<n;i++){

		    if(arr[i]%2==0){

		        System.out.print(arr[i]+" ");

		    }

		}

		for(int i=0;i<n;i++){

		    if(arr[i]%2!=0){

		        System.out.print(arr[i]+" ");

		    }

		}

	}

}

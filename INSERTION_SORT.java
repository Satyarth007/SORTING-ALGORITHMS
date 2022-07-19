import java.util.Scanner;

public class INSERTION_SORT {

	public static void main(String[] args) {
		// Taking user input
				Scanner sc=new Scanner(System.in);
				System.out.print("ENTER THE SIZE OF ARRAY ");
				int n=sc.nextInt();
				System.out.println("ENTER THE ARRAY ELEMENTS ");
				int []arr=new int[n];
				for(int i=0;i<n;i++) {
					arr[i]=sc.nextInt();
				}
				System.out.println("-----------------------------------------------------------");
				System.out.println("ARRAY BEFOR SORTING");
				for(int i=0;i<n;i++) {
					System.out.print(arr[i]+" ");
				}
				
		// NOW APPLYING INSERTION SORT ALGORITHM-----------------
				for(int i=1;i<n;i++) {
					for(int j=i-1;j>=0;j--) {
						if(arr[j]>arr[j+1]) {
							int temp=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp;
						}
						else {
							break;
						}
					}
				}
				System.out.println("-----------------------------------------------------------");
				System.out.println("ARRAY AFTER SORTING");
				for(int i=0;i<n;i++) {
					System.out.print(arr[i]+" ");
				}

	}

}

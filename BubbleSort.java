import java.util.Scanner; // importing scanner class to make user input 
public class BUBBLE_SORT {

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
		//NOW APPLYING BUBBLE SORT LOGIC
		
/* NOTE:- In every pass the desired element will placed at its best fit, 
  ->Here in every pass we compare the i^th value of array to all the elements till it find its
    best fit position.
    ex:- A=[50,40,30,20,10]
       - So here in first pass, 50 will be compared to every element and will be swapped if its greater
    	 than them.
       - similarly in every pass the elements will get compared and swapped if required. 
*/
		
		for(int pass=1;pass<n;pass++) {    
			for(int i=0;i<n-pass;i++) {
				if(arr[i]>arr[i+1]) {
					// swap the elements
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
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
		/* NOTE:- TIME COMPLEXITY= O(n^2) {bcz using two nested for loops} ||  SPACE COMPLEXITY= O(1)  {only temp variable is xtra created}*/

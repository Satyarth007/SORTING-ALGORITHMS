import java.util.Scanner;
public class MERGE_SORT {
	public static void mergesort(int[] A) {
		int n=A.length;
		int[] temp=new int[n];
		sort(A,temp,0,n-1);
		
	}
	public static void sort(int[] arr, int[] temp, int li, int ui) {
		if(li>=ui) {
			return;
		}
		int mid=li+(ui-li)/2;
		sort(arr,temp,li,mid);
		sort(arr,temp,mid+1,ui);
		

		//MERGING THE ARRAYS--------------------------------------
		int ls=li;
		int le=mid;
		int us=mid+1;
		int ue=ui;
		int count=li;
		while(ls<=le && us<=ue) {
			if(arr[ls]<arr[us]) {
				temp[count++]=arr[ls++];
			}else {
				temp[count++]=arr[us++];
			}
		}
		
		while(ls<=le) {
			temp[count++]=arr[ls++];
		}
		while(us<=ue) {
			temp[count++]=arr[le++];
		}
		for(int i=li;i<=ui;i++) {
			arr[i]=temp[i];
		}
	}

	public static void main(String[] args) {
		// MERGE SORT------------------------------------------------
		Scanner sc=new Scanner(System.in);
		int A[]= {90,80,70,60,50,40,30,20,10};
		MERGE_SORT.mergesort(A);
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		
		

	}

}

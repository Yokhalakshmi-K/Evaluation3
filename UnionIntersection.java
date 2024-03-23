import java.util.*;
public class UnionIntersection{
	public static void main(String[] args){
		int arr1[]={1,3,4,5,7};
		int arr2[]={2,3,5,6};
		union(arr1,arr2);
		intersection(arr1,arr2);
	}
	public static void intersection(int arr1[],int arr2[]){
		
		System.out.print("Intersection:");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j])
					System.out.print(arr1[i]+" ");
			}
		}
		System.out.println();
	}
	public static void union(int arr1[],int arr2[]){
		int index=0;
		int union[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++){
			union[index++]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			union[index++]=arr2[i];
		}
		Arrays.sort(union);
		int j=0;
		for(int i=1;i<union.length;i++){
			if(union[i]!=union[j]){
				j++;
				union[j]=union[i];	
			}		
		}
		union=Arrays.copyOf(union,j+1);
		System.out.println("Union:"+Arrays.toString(union));
	}
}

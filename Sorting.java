import java.util.*;
public class Sorting{
	public static void main(String[] args){
		int arr[]={0,1,1,0,1,2,1,2,0,0,0,1,3,3,3};
		int count[]=new int[4];
		for(int num:arr){
			count[num]++;
		}
		int index=0;
		for(int i=0;i<4;i++){
			for(int j=0;j<count[i];j++){
				arr[index++]=i;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

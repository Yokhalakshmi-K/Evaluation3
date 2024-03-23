public class SecondLargestElement{
	public static void main(String[] args){
		int arr[]={1,3,4,5,7,88},
			max1=Integer.MIN_VALUE,
			max2=Integer.MIN_VALUE;
		for(int i=0; i < arr.length; i++){
			if(arr[i]>max1){
				max2=max1;
				max1=arr[i];
			}else if(arr[i]!=max1 && arr[i]>max2){
				max2=arr[i];
			}
		}
		System.out.println(max2);
	}
}

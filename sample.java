public class sample{
	public static void main(String[] args){
		int row=3,col=3;
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<row-1;i++){
			for(int j=0;j<col;j++){
				if(i<row-1)
					System.out.print(a[i][j]+" ");
				else
					System.out.print(a[row][j]+" ");
			}
		}
		System.out.println();
		
		
	}
}

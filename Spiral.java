public class Spiral{
	public static void main(String[] args){
		int matrix[][]={{-1,2,3},
						{4, -5, 6},
						{7, 8, 9}};
		int top=0,bottom=matrix.length;
		int left=0,right=matrix[0].length;
		while(left<right && top<bottom){
			for(int i=top;i<bottom;i++){
				System.out.print(matrix[i][left]+" ");
			}
			left++;
			for(int i=left;i<right;i++){
				System.out.print(matrix[bottom-1][i]+" ");
			}
			bottom--;
			for(int i=bottom-1;i>=top;i--){
				System.out.print(matrix[i][right-1]+" ");
			}
			right--;
			for(int i=right-1;i>top;i--){
				System.out.print(matrix[top][i]+" ");
			}
			top++;
		}
		
	}
}

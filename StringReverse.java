public class StringReverse{
	public static void main(String[] args){
		String str="I love programming very much";
		String word[]=str.split(" ");
		for(int i=word.length-1;i>=0;i--){
			System.out.print(word[i]+" ");
		}
		
	}
}

public class RemoveWhiteSpace{
	public static void main(String[] args){
		String str="i lo ve                progr ammi ng ve ry mu    ch 1 2 3                     4                                             +                 5";
		String result="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
				result=result+str.charAt(i);
			}
		}
		System.out.println(result);
	}
}

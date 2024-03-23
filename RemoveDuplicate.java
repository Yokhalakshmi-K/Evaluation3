public class RemoveDuplicate{
	public static void main(String[] args){
		String str="Hello World";
		String res="";
		int index=0;
		for(int i=0;i<str.length();i++){
			int j;
			for(j=0;j<i;j++){
				if(str.charAt(i)==str.charAt(j)){
					break;
				}
				}
				if(i==j){
					res=res+str.charAt(i);
				}
			}	
	System.out.println(res);
	}
}

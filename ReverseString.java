import java.util.*;
public class ReverseString{
	public static void main(String[] args){
		String str="i love programming very much";
		char ch[]=str.toCharArray();
		reverseWord(ch);
		System.out.println("Reverse String:"+new String(ch));
	}
	public static void reverseCharacter(char ch[],int left,int right){
		while(left<right){
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
	}
	public static  void reverseWord(char ch[]){
		reverseCharacter(ch,0,ch.length-1);
		int start=0;
		for(int end=0;end<ch.length;end++){
			if(ch[end]==' '){
				reverseCharacter(ch,start,end-1);
				start=end+1;
				
			}	else if(end==ch.length-1){
				reverseCharacter(ch,start,end);
			}	
		}
	}
}

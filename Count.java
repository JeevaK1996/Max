# Max
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
		//String a="happyA";
		String a=scanner.next();
		int len=0,count=0;
		do{
			char []s=a.toCharArray();
			len=s.length;
			count=0;
			for(int i=0;i<len;i++){
				if((s[0]==s[i])){
					count++;
				}
			}
			if(count!=0){
			System.out.println(s[0]+" "+count+" times");
		a=a.replace(""+s[0],"");
		}
		}while(len!=1);
		
	}

}

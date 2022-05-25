package chaper001;
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[]args)throws IOException{
		Scanner cin= new Scanner (System.in);
		int a=cin.nextInt();
		System.out.println (a);
		int n,result;
		for(n=1,result=1;n<=a;n++)
		{
			result=result*n;
		}
		System.out.println(result);
	}

}

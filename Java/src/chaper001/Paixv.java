package chaper001;

import java.util.Scanner;

public class Paixv {
	public static void main(String[]args){
		Scanner in=new Scanner (System.in);
			int n,x,y,c,max;
			
			int[] a;
		n=in.nextInt();
		a=new int[n];
		for(x=0;x<=n-1;x++)
			a[x]=in.nextInt();
		for(x=0;x<=n-1;x++)
		{
			max=x;
			for(y=x;y<=n-1;y++)
			{   
				if(a[y]>a[max])  max=y;
			}
			if(a[max]>a[x]) {c=a[x];a[x]=a[max];a[max]=c;}
		}
		for(x=0;x<=n-1;x++)
			System.out.println(a[x]);	
		
		
		
	}

}

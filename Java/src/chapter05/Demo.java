package chapter05;

import java.util.Random;
public class Demo{
   public static void main(String[] args) {
	Random random=new Random();
	float x=random.nextFloat();//����0-1֮������ʵ��
	int i,y,j;
	y=Math.round(98*x+2);
	j=(int)Math.sqrt((double)y);
	for(i=2;i<=j;i++)
		if(y%i==0)
			break;
	if(i==j+1)
	System.out.print("�����������Ϊ:"+y+",��һ������");
	else
	System.out.print("�����������Ϊ:"+y+",����������");
	}
 

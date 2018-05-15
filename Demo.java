import java.util.Scanner;
class Demo
{
public static int pwr(int num,int p)
{
int res=1;
for(int i=1;i<=p;i++)
{
res=num*res;
}
return res;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the num");
int num=sc.nextInt();
System.out.println("enter pwr");
int p=sc.nextInt();
int res=pwr(num,p);
System.out.println(res);
}
} 

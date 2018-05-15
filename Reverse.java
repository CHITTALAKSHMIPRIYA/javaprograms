import java.util.Scanner;
class Reverse
{
public static String rev(String s)
{
char ch[]=s.toCharArray();
String res="";
for(int i=ch.length-1;i>=0;i--)
{
res=res+ch[i];
}
return res;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s=sc.next();
String res=rev(s);
System.out.println(res);
}
} 

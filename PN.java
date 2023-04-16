package Java6;
public class PN
{
public void prime(int n)
{
int count=0;
for(int i=2;i<n/2;i++)
{
if(n%2==0)
{
count++;
break;
}
}
if(count==0)
System.out.println("prime number");
else
System.out.println(" not prime number");
System.out.println(count);
}
}


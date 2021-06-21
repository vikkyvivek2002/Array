import java.util.*;
class Array
{
public static void main(String[] args)
{
int n, eve_sum = 0, odd_sum = 0;
Scanner s = new Scanner(System.in);
System.out.println("Enter no of  array elements :");
n = s.nextInt();
int a[] = new int [n];
for(int i = 0; i<n; i++)
{
a[i] = s.nextInt();
}
for (int i =0; i<n; i++)
{
 if(a[i]%2== 0 && i%2 == 0)
  eve_sum = eve_sum + a[i];
else if (a[i]%2 == 1 && i%2 == 1)
 odd_sum =  odd_sum+a[i];
}
System.out.println(eve_sum+ " " +odd_sum);
}
}



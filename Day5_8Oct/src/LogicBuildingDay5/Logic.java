package LogicBuildingDay5;
import java.util.*;
public class Logic {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		String s2 = sc.nextLine();
		int res = weightCalculate(s1,s2);
		System.out.println(res);
		}
		public static int weightCalculate(String s1, String s2)
		{
		   int n = s1.length();
		   int sum1=0, sum2=0;
		   for(int i=0;i<n;i++)
		   {
		      if(s1.charAt(i)==s2.charAt(n-i-1))
		      {
		           sum1=sum1+i+1;
		      }
		   }
		   while(sum1 > 0 || sum2 > 9)
		        {
		            if(sum1 == 0)
		            {
		                sum1 = sum2;
		                sum2 = 0;
		            }
		            sum2 += sum1 % 10;
		            sum1 /= 10;
		        }
		   return sum2;
		}
		
	}



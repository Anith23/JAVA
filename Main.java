import java.util.Scanner;

//Find Largest Number in an Array:
class largeNumber
{
	public void LNumber()
	{
		int [] numbers = {1,3,5,6,7,2};
		int max = numbers[0];
		
		for(int i = 0; i<numbers.length; i++)
		{
			
			if(max < numbers[i])
			{
				max = numbers[i];
			}
		}
		System.out.println("Large number : " + max);
	}
}

//Calculate Average of Numbers:
class AverageNumbers
{
	public void average()
	{
		int [] numbers = {3, 5, 6, 8, 9};
		int sum = 0;
		
		for(int i = 0; i<numbers.length; i++)
		{
			sum += numbers[i];
		}
		double Average = sum/numbers.length;
		
		System.out.println("Average of numbers : " + Average);
	}
}

//Fibonacci Series:
class fibonacci
{
	public void fibonicSeries()
	{
		int first = 0;
		int secound = 1;
		int third;
		int [] numbers = new int[11];
		numbers[0] = first;
		numbers[1] = secound;
		
		for(int i = 2; i<numbers.length; i++){
			third = first + secound;
			first = secound;
			secound = third;
			numbers[i] = third;
		}
		
		for(int a = 0; a<numbers.length; a++){
			System.out.println(numbers[a]);
		}
	}
}

// Check Prime Number:
class premeNumber
{
	public void preme()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int num = scanner.nextInt();
		boolean pra = true;
		
		for(int p = 2; p<3; p++){
			if(num%p == 0){
				pra = false;
			}
		}
		
		if(pra){
			System.out.println(num + " is a prime number.");
		}
		else{
			 System.out.println(num + " is not a prime number.");
		}
	}
}

class Main
{
	public static void main(String [] args)
	{
		largeNumber obj1 = new largeNumber();
		//obj1.LNumber();
		
		AverageNumbers obj2 = new AverageNumbers();
		//obj2.average();
		
		fibonacci obj3 = new fibonacci();
		//obj3.fibonicSeries();
		
		premeNumber obj4 = new premeNumber();
		obj4.preme();
	}
}
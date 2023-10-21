import java.util.Scanner;

//Factorial of a Number:
class factorial
{
	public void factor()
	{
		int num =5;
		int fac = 1;
		
		for(int i = 1; i < num; i++){
			fac *= i;
		}
		
		System.out.println(fac);
	}
}

//Check Even or Odd:
class checkNumber
{
	public void number(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int num = scanner.nextInt();
		
		if(num%2 == 0){
			System.out.println("Even");
		}
		else{
			System.out.println("odd");
		}
	}
}

//Sum of Two Numbers
class Sum
{
	public void summ()
	{
		int num1 = 5;
		int num2 = 4;
		int sum = num1 + num2;
		
		System.out.println(sum);
	}
}

class HelloWorld
{
	public static void main(String[]args)
	{ 
		//Hello World Program
		System.out.println("Hello World Program");
		
		factorial obj1 = new factorial();
		obj1.factor();
		
		checkNumber obj2 = new checkNumber();
		obj2.number();
		
		Sum obj3 = new Sum();
		obj3.summ();
	}
}
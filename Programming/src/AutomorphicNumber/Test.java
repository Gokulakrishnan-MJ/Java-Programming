package AutomorphicNumber;

public interface Test {

	static void Automorphic(int num) {
		int temp=num;
		int square=num*num;
		//System.out.println(square);
		int div=1;
		while(temp>0)
		{
			div*=10;
			temp/=10;
			
		}
		//System.out.println(div);
		if(num==(square%div))
			System.out.println(num+" is a automorphic number");
		else
			System.out.println(num+" is not a Automorphic Number");
		
		
	}

}

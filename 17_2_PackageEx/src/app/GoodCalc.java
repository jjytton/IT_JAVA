package app;

import lib.Calculator;

public class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double avg(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i : a)
			sum+=i;
		
		return (double)sum/a.length;
	}
	public static void main(String args[]){
		Calculator c=new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.sub(10, 5));
		System.out.println(c.avg(new int []{1,2,3,4}));
	}
}

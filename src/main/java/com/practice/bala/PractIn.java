package com.practice.bala;



class Base {
	
	int x;
	void show()
	{
		System.out.println("This is Show");
	}
}

class Drived extends Base
{
	
}

public class PractIn {

	public static void main(String[] args) {
	Drived Dref = new Drived();
	Dref.show();
	

	}

}

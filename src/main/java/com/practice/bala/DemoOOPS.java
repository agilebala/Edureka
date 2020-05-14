package com.practice.bala;
class Counter
{
	int count;
	static int scount;

	Counter()
	{
		count=1;
		scount=1;
	}
void increment()
{
	count++;
	scount++;
}
static void fun()
{
	scount++;
}
void showcount()
{
	System.out.println("count: "+count);
	System.out.println("scount: "+scount);
}
}

public class DemoOOPS {

	public static void main(String[] args) {
	Counter c1 = new Counter();
	Counter c2 = new Counter();
	c1.increment();
	c2.increment();
	c1.increment();
	c1.increment();
	c1.increment();
	c2.increment();
	c2.scount=300;
    Counter.scount=500;
	c1.showcount();
	c2.showcount();

	}

}

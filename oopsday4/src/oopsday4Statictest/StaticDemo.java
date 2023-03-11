package oopsday4Statictest;
//non sataic means insatnce specific .Every object will have separate copy of others and specific to an instance..Static means shared things 
// Change is made by one object will be reflected to other object.Each object will have same vale if we initialize static.
// We can also access the class if we didnot create an object.

public class StaticDemo {
	public static void main(String[] args) { //static in here shows that the programs begins from here
		System.out.println(TestStaticDemo.a);
		TestStaticDemo d = new TestStaticDemo();
		TestStaticDemo d1 = new TestStaticDemo();
		System.out.println(d1.a);
		System.out.println(d.a);
		TestStaticDemo d2 = new TestStaticDemo();
		System.out.println(d2.a);
	}
}

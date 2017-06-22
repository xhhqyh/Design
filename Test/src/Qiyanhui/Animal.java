package Qiyanhui;

public class Animal {
	public int age = 10;
	public String name;
	
	//构造函数
	public Animal(){
		System.out.println("Animal类执行了");
		age = 20;
	}
	
	public void eat(){
		System.out.println("动物具有吃东西的能力");
	}
}

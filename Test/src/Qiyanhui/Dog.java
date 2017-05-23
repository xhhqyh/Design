package Qiyanhui;

public class Dog extends Animal {
	public int age = 20;
	//构造函数
	public Dog(){
		System.out.println("Dog类执行了");
	}
	
	public void eat(){
		System.out.println("Dog具有吃东西的能力");
	}

	@Override
	public String toString() {
		return "Dog []";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
	
}

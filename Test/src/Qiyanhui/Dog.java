package Qiyanhui;

public class Dog extends Animal {
	public int age = 20;
	//���캯��
	public Dog(){
		System.out.println("Dog��ִ����");
	}
	
	public void eat(){
		System.out.println("Dog���гԶ���������");
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

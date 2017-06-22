package Qiyanhui;

public class InitAnimal {
	public static void main(String[] args) {
		Dog dog = new Dog();
//		dog.age = 10;
		Dog dog2 = new Dog();
//		dog2.age = 15;
		if(dog.equals(dog2)){
			System.out.println("相同");
		}else{
			System.out.println("不同");
		}
	}
}

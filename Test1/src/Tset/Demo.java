package Tset;

//在JDK类库中定义的String类使用了享元模式，测试程序
/*
 * 运行结果：
 * 		true
 * 		true
 * 		false
 * 		abcd
 * */

public class Demo {
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "abcd";
		String str3 = "ab" + "cd";
		String str4 = "ab";
		str4 += "cd";
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str4);
	}
}

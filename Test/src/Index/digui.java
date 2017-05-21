package Index;

/*用递归方式求阶乘*/
public class digui {
	//定义递归函数
	private static long digui(int n){
		if(n == 1){
			return 1;
		}else{
			return n*digui(n-1);
		}
	}
	public static void main(String[] args) {
		int n=5;
		long sum = digui(n);
		System.out.println(sum);
	}
}

PHP 魔术方法的使用
	//将对象的属性进行接轨
	1.__get / __set 
	//__call控制php方法调用,__callStatic控制类的静态方法
	2.__call / __callStatic
	//将php对象转换为一个字符串
	3.__toString
	//将一个php对象当作一个函数执行时，会回调这个魔术方法
	4.__invoke

<?php
abstract class Father
{
  	function test1() 
  	{
    	echo "test1...<br>";
  	}
  	abstract function meth2();
  	public $var1="var1";
 	public static $var2="var2";
 	const Var3="Var3";
}

class Son extends Father
{
  	function meth2()
  	{
    	echo "meth2 of Son...<br>";
  	}
}

$s=new Son();
echo $s->var1."<br>";
echo Father::$var2."<br>";
echo Father::Var3."<br>";
?>
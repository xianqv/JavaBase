/**
 * @program: Operater
 * @Date: 2018/8/22 0:01
 * @Author: Mr.Deng
 * @Description:
 */

import sun.swing.plaf.synth.DefaultSynthStyle;

/**
 * Java中运算符一共有五类 算术运算符、关系运算符、逻辑运算符、位运算符和其他运算符
 * 实际操作中 不用刻意记忆运算符优先级 有需要的话直接使用括号改变运算顺序即可
 *
 *
 * 注意 += 和 +  除了实现了+的操作 还实现了类型强转
 */
public class OperaterBase {
/* static  int x ;
 static int y ;*/
 public  static  void main(String[]args) {
  int x =0;
  int y =0;
  int a = 10;
  a += 1;
  short s=3;
  s += 1;
  //s=s+1; 编译不通过 因为int 类型不能自动转为short
  System.out.println(a);
  System.out.println(s);
  System.out.println(method3()&&method2()&&method1());//&&被叫做短路与 从左到右执行 只要有一个结果为false 则停止
  System.out.println(method1()&method2()&method3());//& 被叫做逻辑与 每个都会执行 然后得出计算结果
  System.out.println(method3()||method2()||method1());
  System.out.println(method3()|method2()|method1());
  System.out.println("x++:"+x++);
  System.out.println("++y:"+ ++y);

  int age=20;
  String msg=age>18?"成年":"未成年";
  boolean flag=age>30?true:false;
  System.out.println(msg);
  System.out.println(flag);

//字符串的“+” 连接操作 实际上是借助了 stringBuilder类的append 操作
  String s1="aaaa";
  String s2="bbbbb";
  String s3=s1+s2;
  String s4=s3+1;
  System.out.println("S1:"+s1);
  System.out.println("S2:"+s2);
  System.out.println("S3:"+s3);
  System.out.println("S4:"+s4);


  int m=10;
  int n=10;
  System.out.println(m==n);//true 简单变量比较的是值是否相等
  String j=new String("tom");
  String k=new String("tom");
  System.out.println(j==k);//false  比较的是j和k的引用地址是否相等
  System.out.println(j.equals(k));//true比较的是j和k 的内容是否相等

  String s5=new String("aaaa");//如果直接赋值 是和S1相同的 因为公用一个地址
  String s6="aaaa";
  s6="aaaaaa";
  String s7="aaaaaa";
  System.out.println(s1);
  System.out.println(s6.equals(s7));
  System.out.println(s7==s6);
 }




 public static boolean method1(){
  System.out.println("method1 run !");
  return  false;
 }

 public  static  boolean method2(){
  System.out.println("method2 run !");
  return true;
 }
 public  static  boolean method3(){
  System.out.println("method3 run!");
  return false;
 }
}

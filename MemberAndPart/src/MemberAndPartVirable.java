/**
 * @program: MemberAndPart
 * @Date: 2018/8/21 0:26
 * @Author: Mr.Deng
 * @Description:
 */

import javax.swing.*;

/**
 * Java中变量分为成员变量和局部变量两种
 * 局部变量一般指在方法体内部定义的变量 在方法内部有效
 * 局部变量使用时必须初始化才能使用
 * 成员变量可以默认初始化 局部变量必须显式初始化
 */
public class MemberAndPartVirable {
 Character i;
 public  void function1(){

  System.out.println(i);
 }

 public static void  main(String [] args){

  int j=8;
  int k=j;
  k=k+1;
  System.out.println(j);
  System.out.println(k);
  Integer m=new Integer(8);
  System.out.println("m:"+m);
  Integer n=m;
  System.out.println("n:"+n);
  n=10;
  System.out.println("m:"+m);
  System.out.println("n:"+n);


  MemberAndPartVirable memberAndPartVirable=new MemberAndPartVirable();
  memberAndPartVirable.function1();
 }
}
/**
 * 简单类型变量和引用类型变量
 * 1 存储机制：简单类型变量直接在栈内存中开辟存储空间存储变量值
 * 引用类型变量有引用空间和存储空间两部分构成，引用空间在栈内存中储存首地址 存储空间在堆内存中存储变量值
 */
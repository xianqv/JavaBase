import java.security.PublicKey;

/**
 * @program: day02_keywords
 * @Date: 2018/8/15 23:14
 * @Author: Mr.Deng
 * @Description:
 */
public class KeyWords extends  Person{
 /***
  * super 关键字的作用
  * 1 调用父类中的构造方法 必须在第一行
  * 2 调用父类中的方法和属性
  *
  *
  * static关键字的作用
  * 1 static 修饰主方法入口 main函数 static 不能修饰构造函数
  * 2 static 方法中 不能调用没有static 修饰的方法和属性 也不能使用this 和super 关键字
  * 3 static 修饰属性时 静态属性被当前类共享 一个对象修改属性后 会影响其他对象
  * 4 static 修饰自由代码块 静态自由代码块 类一加载就执行  而且只执行一次
  */


 static{
  //静态自由代码块

  int freeInt=0;
  String words="静态自由代码块初始化";
 System.out.println(freeInt+words);
 }
 public  int count=0;//静态修饰符修饰的变量 被共享
 private String stno;
 private int grade;
 public KeyWords(){
  super();//1
  {
   System.out.println("构造代码块");
  }
 }
 public KeyWords(String name,String stno,int grage){

  super(name);//1

  {System.out.println("构造代码块");}
  this.stno=stno;
  this.grade=grage;
  count++;
 };

 public  void showInfo(){
  super.showInfo();//2
  System.out.println(this.stno+this.grade);
 }

 public static void  main(String[]args){
  KeyWords keyWords=new KeyWords("mike","121212",5);
  System.out.println(keyWords.count);

  KeyWords keyWords1=new KeyWords();
  System.out.println(keyWords1.count);
  keyWords.showInfo();

 }
}






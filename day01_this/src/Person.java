/**
 * @program: day01_this
 * @Date: 2018/8/14 0:16
 * @Author: Mr.Deng
 * @Description:
 */
public class Person {
 private String name;
 private int age;
 public String sex;
 public Person(){
  sex="male";
 }
 public Person(String _name){
  this();//通过this调用方法中的其他构造方法 this（）无参构造函数必须放在第一位
  name=_name;
 }
 public Person(String  _name,int _age){
  this(_name);
  age=_age;
 }
 public Person(String name,int age,String sex){
  this.name=name;//方法参数名和成成员变量名相同时使用this来区分
  this.age=age;
  this.sex=sex;
 }


 public static void main(String []args){
  Person person=new Person();
  Person person1=new Person("bob",16);
  System.out.println(person1.name);
 }

}


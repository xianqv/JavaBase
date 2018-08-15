/**
 * @program: day02_keywords
 * @Date: 2018/8/15 23:20
 * @Author: Mr.Deng
 * @Description:
 */
public class Person {
 private String name;
 private int age;
 public Person(){

 };
 public Person(String name){
  this.name=name;
 };
 public void setName(String name){
  this.name=name;
 }
 public void setAge(int age){
  this.age=age;
 }

 public void showInfo(){
  System.out.println(this.age+this.name);
 }
}

/**
 * @program: day02_keywords
 * @Date: 2018/8/16 23:53
 * @Author: Mr.Deng
 * @Description:
 */
public class KeyWords3{
 public static  void main(String []args){
  Dog dog=new Dog();
  show(dog);
  Cat cat = new Cat();
  show(cat);

 }
 public static void show(Animal a){
  /**
   * 根据传入的对象判断其类型 并且做强制类型转换
   */
 if(a instanceof Dog){
  Dog dog=(Dog)a;
  dog.dog();
 }
 else if(a instanceof Cat){
  Cat cat=(Cat)a;
  cat.cat();
 }
 }


}
/**
 * instanceof 关键字属于java中的一个二元操作符 用来判断某对象是否为某个类或接口类型
 * 由于Java多态使得可以用一个子类的实例赋值给一个父类的变量，但是一些情况下 需要判断变量的原有类型 可以用instanceof实现
 */
class Animal{

}
class Dog extends Animal{
 public void dog(){
  System.out.println("woof,woof");
 }
}
class Cat extends  Animal{
 public void cat(){
  System.out.println("miao,miao");
 }
}


/**
 * @program: day02_keywords
 * @Date: 2018/8/16 23:44
 * @Author: Mr.Deng
 * @Description:
 */
public final class KeyWords2 {
 /**
  * final 关键字 可以在了类，成员变量，和方法前面修饰
  *
  * 1 被final 修饰的类不能被其他类继承 例如String 和math
  *   如果不想自己的类被当作父类被继承 则用final 修饰
  *
  * 2 final 修饰成员变量时，表示这个变量是一个常量
  *
  * 3 final 修饰的方法不可以在子类中被重写
  */
 final  int MALE=1;
 final  int FAMLE=0;

 public final int getMALE(){
  return 1;
 }
}

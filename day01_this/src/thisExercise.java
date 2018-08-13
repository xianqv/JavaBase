/**
 * @program: day01_this
 * @Date: 2018/8/14 0:00
 * @Author: Mr.Deng
 * @Description:
 */

/**
 * java中为了解决变量的命名冲突和不确定性问题，引入了关键子this.this指代当前的一个类的实例，经常出现再方法和构造方法中
 * 具体有以下三种情况：
 * 1、返回调用当前方法的对象的引用
 * 2、再构造方法中调用当前类中的其他构造方法
 * 3、当方法参数名和成员变量名相同时，用于区分参数名和成员变量名
 */
public class thisExercise {
  private int i = 0;
  public thisExercise inceretment(){
   i++;
   return this;   //1、返回调用当前方法的对象的引用
  }
  public void print(){
   System.out.println("i="+i);
  }


  public static void main(String []args){
   thisExercise thisExercise=new thisExercise();
   thisExercise.inceretment().inceretment().inceretment().print();
   thisExercise thisExercise1=new thisExercise();
   thisExercise1.inceretment().print();
  }
}


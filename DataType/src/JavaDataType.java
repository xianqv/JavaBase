/**
 * @program: DataType
 * @Date: 2018/8/20 23:35
 * @Author: Mr.Deng
 * @Description:
 */

import java.math.BigDecimal;
import java.text.Bidi;

/**
 * java属于强类型语言，在定义变量时必须严格指定变量类型
 * java类型主要分为简单类型和引用类型
 * 简单类型：直接存贮变量值
 *        数值型：整数类型（byte【1】，short【2】，int【4】，long【8】）和浮点类型（float【4】和double【8】）
 *        字符型：char【2】
 *        布尔型：boolean 1 bit
 * 引用类型：存储的是地址  引用数字类型大小统一为4字节
 *        类：class
 *        接口：interface
 *        数组
 */
 public class JavaDataType {
  public  static void main(String []args){
   //double和float的精度问题
   System.out.println(0.05+0.01);
   System.out.println(1.0-0.42);
   System.out.println(4.015*100);
   System.out.println(123.3/100);
   //double和float一般用来做科学计算或者是工程计算，但在商业计算中我们使用java.math.BigDecimal类
   System.out.println(ArithUtils.add(0.05,0.01));
   System.out.println(ArithUtils.sub(1.0,0.42));
   System.out.println(ArithUtils.mul(4.015,100));
   System.out.println(ArithUtils.div(123.3,100));
   System.out.println(ArithUtils.div(123.3,100,4));
  }
}
 class ArithUtils{
 private  static  final  int DEF_DIV_SCALE=10;
 //构造方法私有使得这个类不能被实例化
 private ArithUtils(){
 }

  /**
   * 提供精确的加法
   * @param V1
   * @param V2
   * @return 两个参数的和
   */
 public  static double add(double V1,double V2){
  float f=3.14f;//浮点型默认double
 short s=3;
  BigDecimal b1=new BigDecimal(Double.toString(V1));
  BigDecimal b2=new BigDecimal(Double.toString(V2));
  return b1.add(b2).doubleValue();
 }

  /**
   * 提供精确的减法
   * @param V1
   * @param V2
   * @return 两个参数的差
   */
 public  static double sub(double V1,double V2){
  BigDecimal b1=new BigDecimal(Double.toString(V1));
  BigDecimal b2=new BigDecimal(Double.toString(V2));
  return b1.subtract(b2).doubleValue();
 }

  /**
   * 提供精确的乘法
   * @param V1
   * @param V2
   * @return 两个参数的乘积
   */
 public static double mul(double V1,double V2){
  BigDecimal b1=new BigDecimal(Double.toString(V1));
  BigDecimal b2=new BigDecimal(Double.toString(V2));
  return b1.multiply(b2).doubleValue();
 }

  /**
   * 提供相对精确的除法运算 当发生出不尽的情况是，精确到小数以后10位
   * @param V1
   * @param V2
   * @return
   */
 public static double div(double V1,double V2){
  return div(V1,V2,DEF_DIV_SCALE);
 }

  /**
   * 提供相对精确的除法运算 当发生出不尽的情况是，有scale参数指定精度，以后的数字四舍五入
   * @param V1
   * @param V2
   * @param scale
   * @return
   */
 public  static  double div(double V1,double V2,int scale){
  if (scale<0){
   throw new IllegalArgumentException("the scale must be a positive interger or zero");
  }
  BigDecimal b1=new BigDecimal(Double.toString(V1));
  BigDecimal b2=new BigDecimal(Double.toString(V2));
  return b1.divide(b2,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
 }
 }


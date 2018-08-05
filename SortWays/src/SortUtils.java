import sun.security.util.Length;

import java.util.Arrays;

/**
 * @program: JavaBase
 * @Date: 2018/8/4 22:27
 * @Author: Mr.Deng
 * @Description:
 */
public class SortUtils {

 /*
  *排序分两大类：
  * 非线性时间比较类排序：通过比较来决定元素的相对次序，其时间复杂度不能超过O(nlogn),因此称为非线性时间比较类排序
  * 线性时间非比较类排序：不通过比较来决定元素的相对次序，他可以突破基于比较的时间下界，以线性时间运行，因此被称为线性时间非比较类排序
  *
  *
  * 非线性时间比较类排序：
  * 交换排序:   a 冒泡排序
  *            b 快速排序
  *
  * 插入排序:   c 简单插入排序
  *            d 希尔排序
  *
  * 选择排序:   e 简单选择排序
  *            f 堆排序
  *
  * 归并排序:   g 二路归并排序
  *            h 多路归并排序
  *
  * 线性时间非比较类排序：
  *            基数排序
  *            桶排序
  *            计数排序
  * */


  //冒泡排序
  public int[] bubleSort(int[] attr ){
   int length=attr.length;
   int k=1;
   for (int i=0;i<length-1;i++){
    for (int j=0;j<length-1-i;j++){
     if (attr[j]>attr[j+1]){
      int temp =attr[j+1];
      attr[j+1]=attr[j];
      attr[j]=temp;
     }
    }
    System.out.println("第"+ k++ +"趟："+Arrays.toString(attr));
   }
   return attr;
  }

  //选择排序
 public int[] selectSort(int[] attr){
   int length=attr.length;
   int k=1;
   for(int i=0;i<length-1;i++){
     int minIndex=i;
    for(int j=i+1;j<length;j++){
     if (attr[j]<attr[minIndex]){
      minIndex=j;
     }
    }
    int temp=attr[i];
    attr[i]=attr[minIndex];
    attr[minIndex]=temp;
    System.out.println("第"+ k++ +"趟："+Arrays.toString(attr));
   }
   return attr;
 }


 //插入排序
 public  int[] insertSort(int[] attr){
   int lenth=attr.length;
   int k=1;
   for (int i=1;i<lenth;i++){
    //要插入元素的下标
    int operateIndex=i-1;
    int current=attr[i];
    for (;operateIndex>=0&&attr[operateIndex]>current;operateIndex--){
       attr[operateIndex+1]=attr[operateIndex];
    }
    attr[operateIndex+1]=current;
    System.out.println("第"+ k++ +"趟："+Arrays.toString(attr));
   }
   return attr;
 }

 //希尔排序
 public int[] shellSort(int[] attr){
  int d= attr.length/2;
  int k=1;
  while(d>=1) {
   for(int i=d;i<attr.length;i++) {
    int current=attr[i];
    int operatedIndex=i-d;
    //直接插入排序，会向前找所适合的位置
    for (;operatedIndex>=0&&attr[operatedIndex]>current;){
     attr[operatedIndex+d]=attr[operatedIndex];
     operatedIndex=operatedIndex-d;
    }
    attr[operatedIndex+d]=current;
   }
   d=d/2;
   System.out.println("第"+ k++ +"趟："+Arrays.toString(attr));
 }
  return attr;
 }


 //归并排序


 }

 class SortTest{
  public static void main(String[] args){
   int arr[]={1,58,8,3,79,10,15,45,74,21,55,43,75,23,67,21,66,90};
   SortUtils sortUtils=new SortUtils();
   /*int result[]=sortUtils.bubleSort(arr); length-1躺
   int result[]=sortUtils.selectSort(arr);  length-1 躺
   int result[]=sortUtils.insertSort(arr);  length-1 躺
   int result[]=sortUtils.shellSort(arr);   Length/(2^n) >= 1 取整躺*/
  /* for (int i:result){
    if (result.length>0){
     System.out.println(i);
    }
   }*/
  }
 }




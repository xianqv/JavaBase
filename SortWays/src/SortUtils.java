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
   for (int i=0;i<length;i++){
    for (int j=0;j<length-1-i;j++){
     if (attr[j]>attr[j+1]){
      int temp =attr[j+1];
      attr[j+1]=attr[j];
      attr[j]=temp;
     }
    }
   }
   return attr;
  }


 }

 class SortTest{
  public static void main(String[] args){
   int arr[]={9,10,15,45,74,21,58,1,8,3,7};
   SortUtils sortUtils=new SortUtils();
   int result[]=sortUtils.bubleSort(arr);
   for (int i:result){
    if (result.length>0){
     System.out.println(i);
    }
   }
  }
 }




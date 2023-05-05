package default1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysMethod {
        public static void main(String[] args) {


            Integer arr[] = {1, -1, 7, 0, 89};
            //遍历数组
            for(int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            //直接使用Arrays.toString方法，显示数组
            System.out.println(java.util.Arrays.toString(arr));//


            //演示 sort方法的使用
            //Arrays.sort(arr); // 默认排序方法

        /*在自定义的比较器中，我们将 o1 和 o2 强制转换为 Integer 类型，然后使用 o2 - o1 的结果作为比较器的比较结果，
        以实现从大到小的排序。因此，在比较器中，o1 和 o2 表示数组中的任意两个元素，具体的值会随着排序算法的执行而不断变化。*/
        /*假设在比较器的某一次比较中，o1 的值是7，o2 的值是1，那么根据比较器的逻辑，应该返回 o2 - o1，即 1 - 7 = -6。这个结果表示 o2 比 o1 小，
        因此在排序后 o2 应该排在 o1 的后面。具体的执行结果会被存储到数组 arr 中*/
            //定制排序
            java.util.Arrays.sort(arr, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;
                    return i2 - i1;
                }
            });
            System.out.println("===排序后===");
            System.out.println(java.util.Arrays.toString(arr));//



            //二分
            Integer[] arr1 = {1, 2, 90, 123, 567};//必须是有序的，否则结果不确定，返回值是索引，如果没有找到，返回负数
            int index = Arrays.binarySearch(arr1, 567);
            System.out.println("index=" + index);


            //copyof
            //1. 从 arr 数组中，拷贝 arr.length个元素到 newArr数组中
            //2. 如果拷贝的长度 > arr.length 就在新数组的后面 增加 null
            //3. 如果拷贝长度 < 0 就抛出异常NegativeArraySizeException
            Integer[] newArr = Arrays.copyOf(arr1, arr1.length+5);
            System.out.println("==拷贝执行完毕后==");
            System.out.println(Arrays.toString(newArr));

            //fill,将指定的值，填充到数组中
            Arrays.fill(arr1, 99);
            System.out.println("==num数组填充后==");
            System.out.println(Arrays.toString(arr1));

            //equals，比较两个数组的内容是否相等
            boolean equals = Arrays.equals(arr, arr1);
            System.out.println("equals=" + equals);


            //asList 将一组值，转换成list集合
            //1. asList方法，会将 (2,3,4,5,6,1)数据转成一个List集合
            //2. 返回的 asList 编译类型 List(接口)
            //3. asList 运行类型 java.util.Arrays#ArrayList, 是Arrays类的

            List asList = Arrays.asList(2,3,4,5,6,1);
            System.out.println("asList=" + asList);
            System.out.println("asList的运行类型" + asList.getClass());
        }

}

package default1;

import java.math.BigDecimal;
public class BigDecimal_ {
    public static void main(String[] args) {
        //当我们需要保存一个精度很高的数时，double 不够用
        //可以是 BigDecimal
        double d = 1999.11111111111999999999999977788d;
        System.out.println(d);
        BigDecimal bigDecimal = new BigDecimal("1999.11");
        BigDecimal bigDecimal2 = new BigDecimal("3");
        System.out.println(bigDecimal);


        //1. 如果对 BigDecimal进行运算，比如加减乘除，需要使用对应的方法
        //2. 创建一个需要操作的 BigDecimal 然后调用相应的方法即可
        System.out.println(bigDecimal.add(bigDecimal2));
        System.out.println(bigDecimal.subtract(bigDecimal2));
        System.out.println(bigDecimal.multiply(bigDecimal2));

        //在调用divide 方法时，指定精度即可. BigDecimal.ROUND_CEILING
        //如果有无限循环小数，就会保留 分子 的精度,如果没有无限循环小数，就会保留 分母 的精度, 但是可能会抛出异常, ArithmeticException

        System.out.println(bigDecimal.divide(bigDecimal2, BigDecimal.ROUND_CEILING));
        //该模式将结果向正无穷方向舍入，也就是说，如果结果的小数部分大于0，则结果将向最接近的较大的整数舍入,如果为负数，就是向下取整.

    }
}

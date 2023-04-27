package default1;

public class Throws {
    //为了告知方法的调用者可能会发生某种异常，使用throws关键字。
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2, 3};
        int index = 5;

        try {
            //尝试访问数组中的一个越界的索引
            arr[index] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            //如果发生异常，将其重新抛出
            throw e;
        }
    }



}

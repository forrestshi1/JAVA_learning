package default1;

public class StringClass {
    public static void main(String[] args) {
        //1.String 对象用于保存字符串，也就是一组字符序列
        //2. "xxx" 字符串常量, 双引号括起的字符序列
        //3. 字符串的字符使用Unicode字符编码，一个字符(不区分字母还是汉字)占两个字节
        //4. String 类有很多构造器，构造器的重载
        //   常用的有 String  s1 = new String(); //
        //String  s2 = new String(String original);
        //String  s3 = new String(char[] a);
        //String  s4 =  new String(char[] a,int startIndex,int count)
        //String s5 = new String(byte[] b)
        //5. String 类实现了接口 Serializable【String 可以串行化:可以在网络传输】
        //                 接口 Comparable [String 对象可以比较大小]
        //6. String 是final 类，不能被其他的类继承
        //7. String 有属性 private final char value[]; 用于存放字符串内容
        //8. 一定要注意：value 是一个final类型， 不可以修改(需要功力)：即value不能指向
        //   新的地址，但是单个字符内容是可以变化

        String name = "jack";
        name = "tom";//将新的字符串地址赋给name，原来的"jack"就没有引用指向了，会被垃圾回收器回收
        System.out.println(name);

        String a = "abc";
        String b ="abc";
        //a和b指向同一个对象,所以a==b,equals也为true,因为String重写了equals方法,比较的是内容,而不是地址,所以为true,但是==比较的是地址,所以也为true,因为a和b指向同一个对象,地址相同,所以为true
        System.out.println(a.equals(b));//T
        System.out.println(a==b); //T


    }
}

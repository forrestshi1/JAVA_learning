package default1;
//构造器都可行
public class StringBufferAndString {
    public static void main(String[] args) {

        //看 String——>StringBuffer
        String str = "hello tom";
        //方式1 使用构造器
        //注意： 返回的才是StringBuffer对象，对str 本身没有影响
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str);
        //方式2 使用的是append方法
        java.lang.StringBuffer stringBuffer1 = new java.lang.StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);
        System.out.println(stringBuffer1);
        System.out.println(stringBuffer);
        System.out.println(str);



        //看看 StringBuffer ->String
        java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer("forrest");
        //方式1 使用StringBuffer提供的 toString方法
        String s = stringBuffer3.toString();
        //方式2: 使用构造器来搞定
        String s1 = new String(stringBuffer3);
        System.out.println(s);
        System.out.println(s1);

    }
}

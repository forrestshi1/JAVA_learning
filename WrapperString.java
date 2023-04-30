package default1;
//wrapper class 和 String之间的转换
public class WrapperString
 {
    public static void main(String[] args) {
        //包装类(Integer)->String
        Integer i = 100;//自动装箱
        //方式1
        String str1 = i + "";
        //方式2
        String str2 = i.toString();
        //方式3
        String str3 = String.valueOf(i);
        System.out.println("str1=" + str1 + " str2=" + str2 + " str3=" + str3);



        //String -> 包装类(Integer)
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4);//使用到自动装箱
        Integer i3 = new Integer(str4);//构造器
        System.out.println("str4=" + str4 + " i2=" + i2 + " i3=" + i3);
        System.out.println("ok~~");

    }
}


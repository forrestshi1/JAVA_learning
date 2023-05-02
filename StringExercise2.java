package default1;
//在方法中修改string和char数组
public class StringExercise2 {
    String str = new String("forrest");
    final char[] ch = {'j', 'a', 'v', 'a'};

    public void change(String str1, char ch[]) {
        str1 = "java";
        ch[0] = 'h';
    }

    public static void main(String[] args) {
        StringExercise2 ex = new StringExercise2();//创建对象
        ex.change(ex.str, ex.ch);//调用方法,str1是局部变量,在池中建立新的“java"，因为string是final，所以让形参str指向新的java。而ch是全局变量,所以会改变,因为是final修饰的,所以不能改变地址,但是可以改变内容,所以会改变
                                //所以输出的是forrest and hava,而不是java and hava,
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);
    }
}

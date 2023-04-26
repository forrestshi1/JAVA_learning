package default1;
import java.lang.annotation.*;
public class annotation {

    @Retention(RetentionPolicy.RUNTIME) // @Retention 注解指定注解在运行时可用
    @Target(ElementType.TYPE) // @Target 注解指定注解可用于类和接口
    @Documented // @Documented 注解指定注解包含在 JavaDoc 文档中
    @Inherited // @Inherited 注解指定注解会被子类继承


    /*@interface” 则是一种用于定义注解类型的关键字，通过定义注解类型，可以在程序中使用自定义的注解。注解类型的定义类似于接口类型的定义
    *但在定义中使用的关键字和语法略有不同。定义注解类型时，需要指定注解的名称、参数列表及其类型。
    * */
    public @interface MyAnnotation {
        String value();
    }

    @MyAnnotation("This is a test annotation")
     class MyBaseClass {
        // Base class implementation
    }

     class MySubClass extends MyBaseClass {
        // Subclass implementation
    }

        //通过反射获取 “MyBaseClass” 和 “MySubClass” 类上的 “@MyAnnotation” 注解，并输出了注解的值。
        public static void main(String[] args) {
            // Get the annotation on MyBaseClass
            MyAnnotation baseAnnotation = MyBaseClass.class.getAnnotation(MyAnnotation.class);
            System.out.println("MyBaseClass annotation value: " + baseAnnotation.value()); // Output: "MyBaseClass annotation value: This is a test annotation"

            // Get the annotation on MySubClass
            MyAnnotation subAnnotation = MySubClass.class.getAnnotation(MyAnnotation.class);
            System.out.println("MySubClass annotation value: " + subAnnotation.value()); // Output: "MySubClass annotation value: This is a test annotation"
        }

}

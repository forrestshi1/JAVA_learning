package TankGame;
import javax.swing.*;//导入swing包,因为JFrame在这个包里面
import java.awt.*;//导入awt包,因为Graphics在这个包里面

public class paintmethod extends JFrame {

    mypanel mp = null;//定义一个面板

    public static void main(String[] args) {
        new paintmethod();//创建一个窗口
        System.out.println("退出程序~");
    }

    public paintmethod(){//构造器
        mp = new mypanel();//初始化面板
        this.add(mp);//把面板放入到窗口(画框)
        this.setSize(400,300);//设置窗口的大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//当点击窗口的小×，程序完全退出.
        this.setVisible(true);//可以显示
    }
}




//1.先定义一个MyPanel, 继承JPanel类， 画图形，就在面板上画
class mypanel extends JPanel{
    @Override
    public void paint(Graphics g){
        super.paint(g);//调用父类的方法完成初始化.
        g.setColor(Color.red);
        g.drawOval(10,10,100,100);//画圆形,圆心坐标(10,10),宽高(100,100)


        //演示绘制不同的图形..
        //画直线 drawLine(int x1,int y1,int x2,int y2)
        g.drawLine(10, 10, 100, 100);
        //画矩形边框 drawRect(int x, int y, int width, int height)
        g.drawRect(10, 10, 100, 100);
        //画椭圆边框 drawOval(int x, int y, int width, int height)
        //填充矩形 fillRect(int x, int y, int width, int height)
        //设置画笔的颜色
        g.setColor(Color.blue);
        g.fillRect(10, 10, 100, 100);

        //填充椭圆 fillOval(int x, int y, int width, int height)
//        g.setColor(Color.red);
//        g.fillOval(10, 10, 100, 100);

        //画图片 drawImage(Image img, int x, int y, ..)
        //1. 获取图片资源, /bg.png 表示在该项目的根目录去获取 bg.png 图片资源
        Image image = Toolkit.getDefaultToolkit().getImage(mypanel.class.getResource("/b2.png"));//这里要用mypanel
        g.drawImage(image, 100, 100, 1080, 2244, this);
        //画字符串 drawString(String str, int x, int y)//写字
        //给画笔设置颜色和字体

        g.setColor(Color.red);
        g.setFont(new Font("隶书", Font.BOLD, 50));
        //这里设置的 100， 100， 是 "北京你好"左下角
        g.drawString("北京你好", 100, 100);
        //设置画笔的字体
        // setFont(Font font)
        //设置画笔的颜色 setColor(Color c)
    }
}
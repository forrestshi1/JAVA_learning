package default2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame{
    mypanel1 mp1 = null;//在此处声明 mp1 可以使其在方法内部和其他方法中都能够使用，同时也可以减少变量的作用域和内存消耗

    public static void main(String[] args) {
        BallMove code1 = new BallMove();
    }

    public BallMove() {
        mp1 = new mypanel1();
        this.add(mp1);
        this.setSize(1000,1000);
        this.addKeyListener(mp1);//在构造器里插入实现了监听器接口的画板
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//当点击窗口的小×，程序完全退出.
        this.setVisible(true);//可以显示
    }
}

class mypanel1 extends JPanel implements KeyListener {
    //在画板中建立x,y变量
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    //键盘监听器，实现按下方向键移动
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_DOWN:
                y+=20;
                break;
            case KeyEvent.VK_UP:
                y-=20;
                break;
            case KeyEvent.VK_LEFT:
                x-=20;
                break;
            case KeyEvent.VK_RIGHT:
                x+=20;
                break;
        }
        this.repaint();//重绘，否则无法刷新




    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

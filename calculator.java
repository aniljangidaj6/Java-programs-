import javax.swing.*;
import java.util.Scanner;

class calc
{
    public void calcmethod()
    {
        JFrame f = new JFrame();

        JTextField space = new JTextField();
        space.setBounds(80,60,240,40);
        f.add(space);

        JButton seven = new JButton("7");
        seven.setBounds(80,100,60,40);
        f.add(seven);

        JButton eight = new JButton("8");
        eight.setBounds(140,100,60,40);
        f.add(eight);

        JButton nine = new JButton("9");
        nine.setBounds(200,100,60,40);
        f.add(nine);

        JButton del = new JButton("C");
        del.setBounds(260,100,60,40);
        f.add(del);

        JButton four = new JButton("4");
        four.setBounds(80,140,60,40);
        f.add(four);

        JButton five = new JButton("5");
        five.setBounds(140,140,60,40);
        f.add(five);

        JButton six = new JButton("6");
        six.setBounds(200,140,60,40);
        f.add(six);

        JButton one = new JButton("1");
        one.setBounds(80,180,60,40);
        f.add(one);

        JButton divide = new JButton("%");
        divide.setBounds(260,140,60,40);
        f.add(divide);

        JButton two = new JButton("2");
        two.setBounds(140,180,60,40);
        f.add(two);

        JButton three = new JButton("3");
        three.setBounds(200,180,60,40);
        f.add(three);

        JButton dot = new JButton(".");
        dot.setBounds(80,220,60,40);
        f.add(dot);

        JButton multi = new JButton("X");
        multi.setBounds(260,180,60,40);
        f.add(multi);

        JButton zero = new JButton("0");
        zero.setBounds(140,220,60,40);
        f.add(zero);

        JButton plus = new JButton("+");
        plus.setBounds(200,220,60,40);
        f.add(plus);

        JButton minus = new JButton("-");
        minus.setBounds(260,220,60,40);
        f.add(minus);


        JButton equal = new JButton("=");
        equal.setBounds(80,260,240,40);
        f.add(equal);



        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

}

class calculator
{

  Scanner sc = new Scanner(System.in);

    public static void main(String args[])
    {
        calc c = new calc();
        c.calcmethod();

    }



}

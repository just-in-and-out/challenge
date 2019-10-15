package challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class op2 extends Applet {
    //Staafdiagram

    int val = 40;
    int jer = 80;
    int hans = 60;
    String converter1;
    TextField ValT;
    TextField JerT;
    TextField HansT;
    int input1;
    String converter2;
    int input2;
    String converter3;
    int input3;


    public void init() {

        setSize(1980,1080);

        Button Enter = new Button("Enter");
        Enter.addActionListener(new Enterlistener());
        add(Enter);

        ValT = new TextField("40",20);
        add(ValT);
        JerT = new TextField("80",20);
        add(JerT);
        HansT = new TextField("60",20);
        add(HansT);

    }

    public void paint(Graphics g) {

        g.drawLine(40,40,40,220);
        g.drawLine(40,220,200,220);
        int x = 40;
        int y = 40;
        int y2 = 220;

        for (int teller = 0; teller < 10; teller++){

            g.drawLine(x,y,x+5,y);
            g.drawString(" "+teller*20,10,y2);
            y+=20;
            y2-=20;
        }


        g.drawString("valerie",50,240);
        g.drawString("jeroen",100,240);
        g.drawString("hans",150,240);
        g.drawString("valerie",800,40);
        g.drawString("jeroen",950,40);
        g.drawString("hans",1100,40);

        g.setColor(Color.red);
        g.fillRect(50,220-val,30,val);
        g.fillRect(100,220-jer,30,jer);
        g.fillRect(150,220-hans,30,hans);

    }

    class Enterlistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            converter1 = ValT.getText();
            input1 = Integer.parseInt(converter1);
            val = input1;

            converter2 = JerT.getText();
            input2 = Integer.parseInt(converter2);
            jer = input2;

            converter3 = HansT.getText();
            input3 = Integer.parseInt(converter3);
            hans = input3;
            repaint();

        }
    }
}

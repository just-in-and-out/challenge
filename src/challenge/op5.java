package challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class op5 extends Applet {
    //wereldtijden

    TextField tijdT;
    Button enter;
    int tijd = 0;
    int tijdl;
    int tijdt;
    int tijdny;
    int tijds;
    String converter;


    public void init() {

        tijdT = new TextField(10);
        add(tijdT);
        enter = new Button("Enter");
        enter.addActionListener(new Enter());
        add(enter);

    }

    public void paint(Graphics g) {

        if (tijd <=24 && tijd >= 0){
            g.drawString("tijd in London: "+tijdl+":00",20,60);
            g.drawString("tijd in Tokyo: "+tijdt+":00",20,80);
            g.drawString("tijd in New York: "+tijdny+":00",20,100);
            g.drawString("tijd in Sydney: "+tijds+":00",20,120);
        }
        else{

            g.drawString("ongeldige tijd",20,60);
        }

    }
    class Enter implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            converter = tijdT.getText();
            tijd = Integer.parseInt(converter);
            tijdl = tijd - 1;
            tijdt = tijd + 7;
            tijdny = tijd - 6;
            tijds = tijd + 9;
            if (tijdl <= 0){
                tijdl +=24;
            }
            if (tijdt >= 24){
                tijdt -= 24;
            }
            if (tijdny <= 0){
                tijdny +=24;
            }
            if (tijds >=24){
                tijds -=24;
            }

            repaint();

        }
    }
}

package challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class op4 extends Applet {
    //fooi calculator

    TextField bedrag;
    double fooi_bedrag;
    int fooi = 15;
    double fooi2;
    double bedrag2;
    double bedragD;
    Button add_l;
    Button add_B;
    Button loss_l;
    Button loss_B;
    Button enter;
    String converter;

    public void init() {

        bedrag = new TextField(20);
        add(bedrag);
        enter = new Button("enter");
        enter.addActionListener(new enterl());
        add(enter);

        add_l = new Button("+");
        add_l.addActionListener(new add_lC());
        add(add_l);
        add_B = new Button("++");
        add_B.addActionListener(new add_BC());
        add(add_B);
        loss_l = new Button("-");
        loss_l.addActionListener(new loss_lC());
        add(loss_l);
        loss_B = new Button("--");
        loss_B.addActionListener(new loss_BC());
        add(loss_B);



    }

    public void paint(Graphics g) {

        enter.setLocation(50,20);
        bedrag.setLocation(100,20);
        add_l.setLocation(175,40);
        add_B.setLocation(200,40);
        loss_l.setLocation(150,40);
        loss_B.setLocation(125,40);

        g.drawString("fooi "+fooi+"%",150,80);
        g.drawString("fooi: €"+fooi_bedrag,20,100);
        g.drawString("totaal incl fooi ("+fooi+"%): "+bedragD,20,120);
        g.drawString(" "+bedrag2,20,200);

    }
    class add_lC implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            fooi += 1;
            repaint();
        }
    }
    class add_BC implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            fooi += 5;
            repaint();
        }
    }
    class loss_lC implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            if (fooi > 0){
                fooi -= 1;
                repaint();
            }
        }
    }
    class loss_BC implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            if (fooi >= 5){
                fooi -= 5;
                repaint();
            }
            else{
                fooi = 0;
                repaint();
            }
        }
    }
    class enterl implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            converter = bedrag.getText();
            bedrag2 = Double.parseDouble(converter);
            fooi2 = fooi;

            fooi_bedrag = bedrag2 * fooi2 / 100;
            bedragD = bedrag2 + fooi_bedrag;

            repaint();
        }
    }
}

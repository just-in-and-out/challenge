package challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class op3 extends Applet {
    //horeca app

    Button Fris;
    Button Bier;
    Button Wijn;
    Button Koffie;
    Button Binnen_ged;
    Button Buiten_ged;
    Button Reset;
    double Besteling;
    double totaal;

    public void init() {

        Fris = new Button("Fris");
        Fris.addActionListener(new fris());
        add(Fris);
        Bier = new Button("Bier");
        Bier.addActionListener(new bier());
        add(Bier);
        Wijn = new Button("Wijn");
        Wijn.addActionListener(new wijn());
        add(Wijn);
        Koffie = new Button("Koffie");
        Koffie.addActionListener(new koffie());
        add(Koffie);
        Binnen_ged = new Button("Binn gedist.");
        Binnen_ged.addActionListener(new binnen_ged());
        add(Binnen_ged);
        Buiten_ged = new Button("buit. gedist.");
        Buiten_ged.addActionListener(new buiten_ged());
        add(Buiten_ged);
        Reset = new Button("nieuwe bestelling / Reset");
        Reset.addActionListener(new reset());
        add(Reset);

    }

    public void paint(Graphics g) {

        g.drawString("Bestelling totaal "+Besteling,40,100);
        g.drawString("Totaal dagomzet "+totaal,40,125);

    }

    class fris implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            Besteling += 2.25;
            totaal += 2.25;
            repaint();

        }
    }
    class bier implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            Besteling += 2.50;
            totaal += 2.50;
            repaint();

        }
    }
    class wijn implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            Besteling += 2.75;
            totaal += 2.75;
            repaint();

        }
    }
    class koffie implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            Besteling += 2;
            totaal += 2;
            repaint();

        }
    }
    class binnen_ged implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            Besteling += 3;
            totaal += 3;
            repaint();

        }
    }
    class buiten_ged implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            Besteling += 3.75;
            totaal += 3.75;
            repaint();

        }
    }
    class reset implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            Besteling = 0;
            repaint();

        }
    }
}

package hoofdstuk9en10;



/**
 * Created by Romy Mae on 30-9-2016.
 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TienPuntVijf extends Applet
{

    double gem1, gem2, newc, cijfer;
    Button knop1;
    Button knop2;
    TextField vak1;

    public void init()
    {

        setSize(300,400);
        vak1 = new TextField("",10);
        knop2 = new Button("reset");
        gem1 = 0;
        newc = 0;
        cijfer = 0;
        Listen1 nc = new Listen1(); //Add a new number
        Listen2 re = new Listen2(); //Reset
        knop1 = new Button("Voeg een cijfer toe.");
        knop1.addActionListener(nc);
        knop2.addActionListener(re);
        add(vak1);
        add(knop1);
        add(knop2);

    }

    public void paint(Graphics g)
    {

        if(gem2>5.4 && gem2<10.1)
        {

            g.drawString("U bent geslaagd.",200,300);

        }

        if(gem2>10.1)
        {

            g.drawString("ERROR.. voer correcte cijfers in.",200,300);

        }

        else if(gem2<5.5)
        {

            g.drawString("U bent gezakt.",200,300);

        }

        g.drawString("uw gemiddelde is: "+(String.format("%.2f", Double.valueOf(gem2))), 200, 250);

    }
    class Listen1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {

            newc = Double.parseDouble(vak1.getText());
            gem1++;
            cijfer = cijfer + newc;
            gem2 = cijfer/gem1;
            repaint();

        }
    }
    class Listen2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {

            newc = 0;
            gem1 = 0;
            gem2 = 0;
            cijfer = 0;
            repaint();

        }
    }
}



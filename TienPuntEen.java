package hoofdstuk9en10;

/**
 * Created by Romy Mae on 27-9-2016.
 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TienPuntEen extends Applet {
        TextField tekstvak;
        Label label;
        String s, cijfer;
        double cijfer1,cijfer2;


    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new VakListener());
label= new Label("type hier uw getal en druk op enter");
        add(tekstvak);
        add (label);
        cijfer = "";
    }

    public void paint(Graphics g) {
        g.drawString(cijfer1+"",20,40);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer2= Double.parseDouble(tekstvak.getText());
            if ((cijfer2>cijfer1))
            {
                cijfer1=cijfer2;
                tekstvak.setText(null);
                repaint();
            }
            }
        }
    }



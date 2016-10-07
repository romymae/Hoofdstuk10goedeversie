package hoofdstuk9en10;

import java.applet.Applet;

/**
 * Created by Romy Mae on 29-9-2016.
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class TienPuntDrie extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int maand;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer in en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 70 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            switch(maand) {
                case 1:
                    tekst = "januari 31";
                    break;
                case 2:
                    tekst = "februari 28 (29 met schrikkeljaar)";
                    break;
                case 3:
                    tekst = "maart 31";
                    break;
                case 4:
                    tekst = "april 30";
                    break;
                case 5:
                    tekst = "mei 31";
                    break;
                case 6:
                    tekst = "juni 30";
                    break;
                case 7:
                    tekst = "juli 31";
                    break;
                case 8:
                    tekst = "augustus 31";
                    break;
                case 9:
                    tekst = "september 30";
                    break;
                case 10:
                    tekst = "oktober 31";
                    break;
                case 11:
                    tekst = "november 30";
                    break;
                case 12:
                    tekst = "december 31";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}

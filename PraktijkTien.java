package hoofdstuk9en10;

/**
 * Created by Romy Mae on 4-10-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class PraktijkTien extends Applet {
    TextField tekstvak;
    Label label;
    String s,tekst;
   int cijfer;

    public void init(){
   tekstvak = new TextField("",5);
   label = new Label("type hier uw cifer en druk op enter");
        tekstvak.addActionListener(new Listen());
        tekst ="";
        add(label);
        add (tekstvak);
    }
    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }
    class Listen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        s= tekstvak.getText();
            cijfer = Integer.parseInt(s);
            switch(cijfer) {
                case 1:
                    tekst = "slecht";
                    break;
                case 2:
                    tekst = "slecht";
                    break;
                case 3:
                    tekst = "slecht";
                    break;
                case 4:
                    tekst = "onvoldoende";
                    break;
                case 5:
                    tekst = "matig";
                    break;
                case 6:
                    tekst = "voldoende";
                    break;
                case 7:
                    tekst = "voldoende";
                    break;
                case 8:
                    tekst = "goed";
                    break;
                case 9:
                    tekst = "goed";
                    break;
                case 10:
                    tekst = "goed";
                    break;

                default:
                    tekst = "u heeft een verkeerd nummer ingetikt";
                    break;
            }
            repaint();


            }

        }
        }



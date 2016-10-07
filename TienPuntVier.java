package hoofdstuk9en10;

import java.applet.Applet;

/**
 * Created by Romy Mae on 29-9-2016.
 */
import java.awt.*;
import java.awt.event.*;
public class TienPuntVier extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Label label1;
    Label label2;



    String tekst, s, dagen, jaar;
    int maand, jaars, schrikkeljaar, schrikkeljaarfalse;

   public void init()
   {
       Listen v1 = new Listen();
       label1 = new Label("type hier uw maand");
       label2 = new Label("type hier uw jaar");
       tekstvak1 = new TextField("",20);
       tekstvak2 = new TextField("",20);
       tekstvak1.addActionListener(v1);
       tekstvak2.addActionListener(v1);
       add(label1);
       add(label2);
       add(tekstvak1);
       add(tekstvak2);

   }

class Listen implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        s = tekstvak1.getText();
        jaar = tekstvak2.getText();
        maand = Integer.parseInt(s);
        jaars = Integer.parseInt(jaar);
        schrikkeljaar = jaars%4;
        schrikkeljaarfalse = jaars%400;
        switch (maand)
        {
            case 1:
                tekst = "januari ";
                dagen ="31";
                break;
            case 2:
                tekst = "februari ";
                if (schrikkeljaar ==0 &&!(schrikkeljaarfalse ==0)) {
                    dagen = "29";
                }
            else {
                    dagen = "28";
                }
                break;
            case 3:
                tekst = "maart ";
                dagen ="31";
                break;
            case 4:
                tekst = "april";
                dagen =" 30";
                break;
            case 5:
                tekst = "mei ";
                dagen ="31";
                break;
            case 6:
                tekst = "juni ";
                dagen = "30";
                break;
            case 7:
                tekst = "juli ";
                dagen="31";
                break;
            case 8:
                tekst = "augustus ";
                dagen="31";
                break;
            case 9:
                tekst = "september ";
                dagen="30";
                break;
            case 10:
                tekst = "oktober ";
                dagen="31";
                break;
            case 11:
                tekst = "november ";
                dagen ="30";
                break;
            case 12:
                tekst = "december ";
                dagen="31";
                break;
            default:
                tekst = "U hebt een verkeerd nummer ingetikt ..!";
                break;
        }
        repaint();
    }
}
    public void paint (Graphics g)
    {
        g.drawString("de maand heet: "+tekst,50,120);
        g.drawString("de maand heeft "+dagen+" dagen",50,140);
    }
    }







import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui1 {
    public static void main(String[] args){
        JFrame prozor = new  JFrame ("Prozor 1");
        //deklaracija panela i dodavanje mrežnog layout-a
        JPanel panel = new JPanel(new GridLayout(3,3));
        JButton b;
        for(int i=0;i<9;i++){
            //deklaracija buttona i postavljanje naziva
            b = new JButton(String.valueOf(i));
            //dodavanje slušača i akcije na button
            b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    //dohvaćanje izvora akcije
                    Object source = e.getSource();
                    //cast-anje u button
                    JButton tmp = (JButton) source;
                    //ispis vrijednosti
                    System.out.println(tmp.getText());
                }
            });
            //dodavanje buttona
            panel.add(tmp);
        }
        prozor.add(panel);
        //postavljamo veličinu prozora
        prozor.setSize(400,300);
        //onemogućavamo promjenu veličine prozora
        prozor.setResizable(false);
        //postavljamo prozor vidljivim
        prozor.setVisible(true);
    }
}


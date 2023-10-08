import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.RGBImageFilter;

public class finishscreen  implements  ActionListener
{
    Font myfont = new Font("ink free" , Font.BOLD , 25);
JFrame fram ;

JLabel info ;
JPanel panal;
JButton reset , done;
JTextField textfield;
finishscreen()
{
    fram = new JFrame("Guss the Number!");
    fram.setLayout(null);

    fram.setSize(350,200);



JButton ok = new JButton("Done");


    fram.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    textfield = new JTextField();
    textfield.setFont(myfont);
    textfield.setBounds(20,20 , 290,30);
    fram.add(textfield);

panal = new JPanel();
info = new JLabel("                                 enter number!");
info.setBounds(15 , 140  , 300 , 20);




ok.setFocusable(false);


panal.setLayout(new GridLayout(1,5));
ok.setBounds(2,3,40,20);
ok.setBackground(new Color(50,229,224,62));


 fram.add(panal);
 fram.add(info);
 panal.add(ok);
panal.setBounds(40,75,250 ,40);

    fram.setVisible(true);



}


    public static void main(String[] args) {
        finishscreen game = new finishscreen();


    }




public void actionPerformed(ActionEvent e )
{

}
}

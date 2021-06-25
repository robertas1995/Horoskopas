import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Date;


public class App {


    public static void main(String[] args) {
        DefaultListModel horoskopas = new DefaultListModel();
        JList atsakymas = new JList(horoskopas);




        JFrame frame = new JFrame("Horoskopas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        ImageIcon logo = new ImageIcon("C:\\WorkSpace\\Testas\\src\\main\\java\\File\\zodiak-logo.png");
        frame.setIconImage(logo.getImage());
        JLabel background = new JLabel(new ImageIcon("C:\\WorkSpace\\Testas\\src\\main\\java\\File\\zodiak-wallpaper.png"));
        background.setSize(600, 600);
        frame.add(background);
        JTextField metai = new JTextField(6);
        JTextField menesis = new JTextField(6);
        JTextField diena = new JTextField(6);
        JButton Find = new JButton("Find");
//        LocalDate amzius = LocalDate(userInputYear);
//        LocalDate dabar = LocalDate.now();
//        Period VartotojoAmzius = Period.between(dabar,amzius) ;

        JPanel UPpanel = new JPanel();
        UPpanel.setBackground(Color.BLUE);
        frame.getContentPane().add(BorderLayout.NORTH, UPpanel);
        JPanel Downpanel = new JPanel();
        Downpanel.setBackground(Color.RED);
        frame.getContentPane().add(BorderLayout.SOUTH, Downpanel);
        JPanel CentrPanel2 = new JPanel();
        CentrPanel2.setBackground(Color.MAGENTA);
        CentrPanel2.setSize(100,100);
        JPanel CentrPanel = new JPanel();
        CentrPanel.add(CentrPanel2);
        CentrPanel.setBackground(Color.GREEN);
        frame.getContentPane().add(BorderLayout.CENTER, CentrPanel);
        CentrPanel.setLayout(new GridLayout(1,1));


//        JLabel lable = new JLabel("test label 1");
//        CentrPanel.add(lable);

        Find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInputYear = new String();
               userInputYear = metai.getText();
               String userInputMonth = new String();
               userInputMonth = menesis.getText();
               String userInputDay = new String();
               userInputDay = diena.getText();
                HoroskopoInfo atsakymas = new HoroskopoInfo();
               String Horoskopas =  atsakymas.getResult(userInputYear,userInputMonth,userInputDay);
                JLabel lable = new JLabel(Horoskopas);
                frame.getContentPane().add(BorderLayout.CENTER, CentrPanel);
                CentrPanel2.add(lable);
                frame.setVisible(false);
                frame.setVisible(true);




            }
        });

        UPpanel.add(metai);
        UPpanel.add(menesis);
        UPpanel.add(diena);
        Downpanel.add(Find);


    frame.setVisible(true);


    }

}

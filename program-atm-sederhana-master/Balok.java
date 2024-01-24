import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Balok {
    private JButton hitungButton;
    private JButton batalButton;
    private JButton exitButton;
    private JTextField tfPanjang;
    private JTextField tfLebar;
    private JTextField tfTinggi;
    private JTextField tfLuas;
    private JTextField tfKeliling;
    private JTextField tfVolume;
    private JPanel Balok;

    public Balok() {
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //variabel
                double panjang, lebar, tinggi, luas, keliling, volume;
                //mengambil inputan dari text
                panjang = Double.parseDouble(tfPanjang.getText());
                lebar   = Double.parseDouble(tfLebar.getText());
                tinggi  = Double.parseDouble(tfTinggi.getText());
                //hitung
                luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
                volume = panjang * lebar * tinggi;
                keliling = 4 * (panjang + lebar + tinggi);
                //menaruh hasil
                tfLuas.setText(String.valueOf(luas));
                tfKeliling.setText(String.valueOf(keliling));
                tfVolume.setText(String.valueOf(volume));
            }
        });
        batalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfPanjang.setText("");
                tfLebar.setText("");
                tfTinggi.setText("");
                tfLuas.setText("");
                tfKeliling.setText("");
                tfVolume.setText("");
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Balok");
        frame.setContentPane(new Balok().Balok);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

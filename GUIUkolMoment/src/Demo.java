import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Demo extends JFrame{
    private JFormattedTextField textGenerate;
    private JButton btnGenerate;
    private JTextArea textArea;
    private JButton btnCopy;
    private JPanel panelMain;

    public Demo(){

        btnGenerate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random generator = new Random();
                int random = generator.nextInt(100);
                textGenerate.setText(String.valueOf(random));
            }
        });
        btnCopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textGenerate.getText();
                textArea.append(text+"\n");
            }
        });
    }

    public static void main(String[] args) {
    Demo d = new Demo();
        d.setContentPane(d.panelMain);
        d.setTitle("Test - work with buttons");
        d.setSize(500,300);
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

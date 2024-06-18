import javax.swing.*;
import java.awt.event.*;
public class SetWindow {
    public static void main(String[]Args) {
        JFrame window = new JFrame();
        window.setVisible(true);
        window.setSize(800,600);
        window.setName("Walk");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setLayout(null);
        JButton button = new JButton();
        button.setText("Click Here!");
        button.setBounds(100,200, 200, 70);
        window.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "It's Alright!", "Message", JOptionPane.CLOSED_OPTION);
            }
        });
        JButton button2 = new JButton();
        button2.setText("Yay!");
        button2.setBounds(100, 400, 200, 70);
        window.add(button2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "It's OK", "Message", JOptionPane.CLOSED_OPTION);
            }
        });
    }
}
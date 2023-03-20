import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BerhasilLogin extends JFrame implements ActionListener {
    JLabel s = new JLabel("Selamat kamu berhasil login!");
    JButton btnLogout = new JButton("Logout");

    public BerhasilLogin() {
        setTitle("Selamat!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);
        add(s);
        add(btnLogout);

        btnLogout.addActionListener(this);

        s.setBounds(50, 10, 200, 20);
        btnLogout.setBounds(50, 40, 100, 20);

        setSize(300,140);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnLogout) {
            dispose();
        }
    }
}

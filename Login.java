import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JTextField fusername = new JTextField(16);
    JPasswordField fpassword = new JPasswordField(16);

    JLabel lusername = new JLabel("Username :");
    JLabel lpassword = new JLabel("Password :");

    JButton btnLogin = new JButton("Login");
    JButton btnCancel = new JButton("Cancel");

    public Login() {
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350,150);

        setLayout(null);
        add(lusername);
        add(fusername);
        add(lpassword);
        add(fpassword);
        add(btnLogin);
        add(btnCancel);

        btnLogin.addActionListener(this);
        btnCancel.addActionListener(this);

        lusername.setBounds(10,10,120,20);
        fusername.setBounds(80,10,240,20);
        lpassword.setBounds(10,40,120,20);
        fpassword.setBounds(80,40,240,20);
        btnLogin.setBounds(10,75,150,20);
        btnCancel.setBounds(170,75,150,20);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnLogin) {
            String username = fusername.getText();
            String password = fpassword.getText();
            if (username.equals("123210107")&&password.equals("123210107")) {
                BerhasilLogin b = new BerhasilLogin();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password!");
            }
        } else {
            fusername.setText("");
            fpassword.setText("");
        }
    }

    public static void main(String[] args) {
        Login l = new Login();
    }
}

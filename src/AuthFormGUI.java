import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthFormGUI extends JFrame {
    public AuthFormGUI() {
        setBounds(500, 500, 350, 450);
        setTitle("Вход в систему");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // JButton[] jbs = new JButton[10];
        //  setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JButton button = new JButton("Войти");
        button.setPreferredSize(new Dimension(200, 100));
        button.setAlignmentX(CENTER_ALIGNMENT);

        JPanel forLogin = new JPanel();
        forLogin.setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        new JLabel("User name").add(forLogin);
        new JTextField(20).add(forLogin);
        JPanel forPassword = new JPanel();
        forPassword.setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        new JLabel("Password").add(forPassword);
        new JPasswordField(20).add(forPassword);

        setLayout(new GridLayout(3, 1));
        add(forLogin);
        add(forPassword);
        add(button/*, BorderLayout.CENTER*/);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Войти кнопка нажата");
            }
        });

        setVisible(true);
    }
}

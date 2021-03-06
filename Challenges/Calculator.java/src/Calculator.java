import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.EventQueue;
import java.util.ArrayList;

public class Calculator extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;
    private JButton button;
    private JPanel panel;
    private JLabel text;
    private JButton button2;
    public static void main(String[] args) throws Exception {
        
        EventQueue.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
    

    public Calculator() {
        setTitle("Example App");
        setSize(400, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        text = new JLabel("Calculator", SwingConstants.CENTER);
        text.setFont(new Font("Serif", Font.BOLD, 20));
        text.setBounds(0, 15, getBounds().width,100);
        panel.add(text);

        button = new JButton("Click Me");
        button.setBounds(150, 200, 50, 100);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("you clicked the button");
            }
        }); // is an interface -> actionPerformed()
        panel.add(button);

        button2 = new JButton("Add 1!");
        button2.setBounds(50, 200, 50, 100);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("you clicked the button");
            }
        }); // is an interface -> actionPerformed()
        panel.add(button2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}

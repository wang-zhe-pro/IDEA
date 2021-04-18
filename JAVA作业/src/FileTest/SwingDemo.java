package FileTest;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class SwingDemo extends JFrame
{
    public SwingDemo()
    {
        super("SwingDemo");
        JPanel root = new JPanel();
        root.add(new JButton("我是JButton"));
        root.add(new JToggleButton("我是JToggleButton"));
        root.add(new JLabel("我是JLabel"));
        root.add(new JCheckBox("我是JCheckBox"));
        root.add(new JRadioButton("我是JRadioButton"));
        root.add(new JTextField("我是JTextField"));
        root.add(new JPasswordField("我是JPasswordField"));
        root.add(new JTextArea("我是JTextArea"));
        add(root);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new SwingDemo();
    }
}

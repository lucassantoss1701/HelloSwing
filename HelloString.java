package hellostring;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloString extends JFrame {
    public HelloString(){
        super("Minha Janela");
        
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel jLabel= new JLabel("Hello Visual World");
        JButton buttonNorth = new JButton("Norte");
        JButton buttonSul = new JButton("Sul");
        JButton buttonLeste = new JButton("Leste");
        JButton buttonOeste = new JButton("Oeste");
        JButton buttonCentro = new JButton("Centro");
        
        //add(jLabel, BorderLayout.CENTER);
        add(buttonNorth, BorderLayout.NORTH);
        add(buttonSul, BorderLayout.SOUTH);
        add(buttonLeste, BorderLayout.EAST);
        add(buttonOeste, BorderLayout.WEST);
        add(buttonCentro, BorderLayout.CENTER);
        
        buttonCentro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Click Botão Centro");
            }
        });
;           
                
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new HelloString();
    }
}

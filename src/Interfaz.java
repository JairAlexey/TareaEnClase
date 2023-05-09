import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame{

    private JPanel panel1;
    private JButton iniciarProgramaButton;
    private JTextArea MostrarDatos;

    Proceso p = new Proceso();

    public Interfaz(){
        setContentPane(panel1);
        iniciarProgramaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void Interfaz(){


    }
}

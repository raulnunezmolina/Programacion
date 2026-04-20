import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio1 extends JFrame {

    private JTextField txtNombre, txtEdad, txtCurso;
    private JButton btnGuardar;

    public ejercicio1() {
        setTitle("Registro de Estudiante");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("  Nombre:"));
        txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("  Edad:"));
        txtEdad = new JTextField();
        add(txtEdad);

        add(new JLabel("  Curso:"));
        txtCurso = new JTextField();
        add(txtCurso);

        btnGuardar = new JButton("Guardar Datos");
        add(new JLabel(""));
        add(btnGuardar);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = "Estudiante Registrado:\n" +
                        "Nombre: " + txtNombre.getText() + "\n" +
                        "Edad: " + txtEdad.getText() + "\n" +
                        "Curso: " + txtCurso.getText();

                JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {
            new ejercicio1().setVisible(true);
        });
    }
}

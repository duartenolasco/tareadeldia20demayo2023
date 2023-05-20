/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreriaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;
/**
 *
 * @author leste
 */
public class Libreriaswing {

 public static void main(String[] args) {
        // Crear un JFrame como ventana principal
        JFrame frame = new JFrame("Ejemplo de la libreria Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // JLabel
        JLabel label = new JLabel("etiqueta:");
        frame.add(label);

        // JTextField
        JTextField textField = new JTextField(20);
        frame.add(textField);

        // JButton
        JButton button = new JButton("aceptar");
        frame.add(button);

        // JCheckBox
        JCheckBox checkBox = new JCheckBox("Cuadro de verificación");
        frame.add(checkBox);

        // JRadioButton
        JRadioButton radioButton1 = new JRadioButton("Opción 1");
        JRadioButton radioButton2 = new JRadioButton("Opción 2");
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);
        frame.add(radioButton1);
        frame.add(radioButton2);

        // JComboBox
        String[] options = {"Opción 1", "Opción 2", "Opción 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        frame.add(comboBox);

        // JList
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JList<String> list = new JList<>(items);
        frame.add(list);

        // Agregar un ActionListener al botón
        button.addActionListener((ActionEvent e) -> {
            String inputText = textField.getText();
            StringBuilder mensaje = new StringBuilder();
            mensaje.append("Texto colocado: ").append(inputText).append("\n");
            mensaje.append("cuadro de verificación: ").append(checkBox.isSelected() ? "Seleccionada" : "No seleccionada").append("\n");
            mensaje.append("Opción de RadioButton seleccionada: ").append(radioButton1.isSelected() ? "Virtual" : "Presencial").append("\n");
            mensaje.append("Opción seleccionada en JComboBox: ").append(comboBox.getSelectedItem()).append("\n");
            mensaje.append("Opciones seleccionadas en JList: ").append(Arrays.toString(list.getSelectedValuesList().toArray()));
            
            JOptionPane.showMessageDialog(frame, mensaje.toString());
        });
        
        // Mostrar la ventana
        frame.pack();
        frame.setVisible(true);
    }
    
}

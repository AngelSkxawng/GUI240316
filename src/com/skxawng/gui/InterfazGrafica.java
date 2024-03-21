package com.skxawng.gui;
import javax.swing.*;
public class InterfazGrafica {
    public static void main(String[] args) {

        Persona persona = new Persona();

        JFrame jFrame = new JFrame("Persona");
        jFrame.setSize(600, 400);
        jFrame.setLayout(null);

        //Etiqueta para nombre
        JLabel jLabelNombre = new JLabel();
        jLabelNombre.setText("Ingrese su nombre: ");
        jLabelNombre.setBounds(10, 10, 200, 15);
        jFrame.add(jLabelNombre);
        //TextField para ingresar nombre
        JTextField jtfNombre = new JTextField();
        jtfNombre.setBounds(10, 32, 200, 20);
        jFrame.add(jtfNombre);

        //Etiqueta para apellidos
        JLabel jLabelApellidos = new JLabel();
        jLabelApellidos.setText("Ingrese sus apellidos: ");
        jLabelApellidos.setBounds(250, 10, 200, 15);
        jFrame.add(jLabelApellidos);
        //TextField para ingresar apellidos
        JTextField jtfApellidos = new JTextField();
        jtfApellidos.setBounds(250, 32, 200, 20);
        jFrame.add(jtfApellidos);

        //Etiqueta para telefono
        JLabel jLabelTelefono = new JLabel();
        jLabelTelefono.setText("Ingrese su telefono: ");
        jLabelTelefono.setBounds(10, 60, 200, 15);
        jFrame.add(jLabelTelefono);
        //TextField para ingresar telefono
        JTextField jtfTelefono = new JTextField();
        jtfTelefono.setBounds(10, 80, 200, 20);
        jFrame.add(jtfTelefono);

        //Etiqueta para email
        JLabel jLabelEmail = new JLabel();
        jLabelEmail.setText("Ingrese su email: ");
        jLabelEmail.setBounds(250, 60, 200, 15);
        jFrame.add(jLabelEmail);
        //TextField para ingresar email
        JTextField jtfEmail = new JTextField();
        jtfEmail.setBounds(250, 80, 200, 20);
        jFrame.add(jtfEmail);

        //Etiqueta para direccion
        JLabel jLabelDireccion = new JLabel();
        jLabelDireccion.setText("Ingrese su direccion: ");
        jLabelDireccion.setBounds(10, 110, 200, 15);
        jFrame.add(jLabelDireccion);
        //TextField para ingresar direccion
        JTextField jtfDireccion = new JTextField();
        jtfDireccion.setBounds(10, 134, 200, 20);
        jFrame.add(jtfDireccion);


        JButton jbtnAceptar = new JButton();
        jbtnAceptar.setText("Aceptar");
        jbtnAceptar.setBounds(400, 260, 80, 30);

        jbtnAceptar.addActionListener(e ->{
            String nombrePersona = jtfNombre.getText();
            persona.setNombre(nombrePersona);
            JOptionPane.showMessageDialog(null, persona.getNombre());

            String apPersona = jtfApellidos.getText();
            persona.setApellidos(apPersona);
            JOptionPane.showMessageDialog(null, persona.getApellidos());

            String telefonoPersona = jtfTelefono.getText();
            persona.setTelefono(telefonoPersona);
            JOptionPane.showMessageDialog(null, persona.getTelefono());

            String emailPersona = jtfEmail.getText();
            persona.setEmail(emailPersona);
            JOptionPane.showMessageDialog(null, persona.getEmail());

            String direccionPersona = jtfDireccion.getText();
            persona.setDreccion(direccionPersona);
            JOptionPane.showMessageDialog(null, persona.getDreccion());

            System.out.println(persona.getNombre());
            System.out.println(persona.getApellidos());
            System.out.println(persona.getTelefono());
            System.out.println(persona.getEmail());
            System.out.println(persona.getDreccion());
        });
        jFrame.add(jbtnAceptar);
        jFrame.setVisible(true);
    }
}

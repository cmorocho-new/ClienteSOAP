package ec.edu.ups.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.namespace.QName;


import ec.edu.ups.common.Exception_Exception;
import ec.edu.ups.servicios.TransaccionesSOAP;
import ec.edu.ups.servicios.TransaccionesSOAPService;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;

public class VentanaRetiros extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroCta;
	private JTextField txtCantidad;
	private static final QName SERVICE_NAME = new QName("http://servicios.ups.edu.ec/", "TransaccionesSOAPService");
	private final TransaccionesSOAP port;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRetiros frame = new VentanaRetiros();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public VentanaRetiros() {
        initComnetes();
        URL wsdlURL = TransaccionesSOAPService.WSDL_LOCATION;
        port = new TransaccionesSOAPService(wsdlURL, SERVICE_NAME)
                .getTransaccionesSOAPPort();  
    }
	
	public void limpiarCampos() {
		
		txtCantidad.setText("");
		txtNumeroCta.setText("");
	}
	public void initComnetes(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero Cta:");
		lblNewLabel.setBounds(52, 63, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad:");
		lblNewLabel_1.setBounds(52, 117, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNumeroCta = new JTextField();
		txtNumeroCta.setBounds(148, 60, 109, 20);
		contentPane.add(txtNumeroCta);
		txtNumeroCta.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(148, 114, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JButton btnRetirar = new JButton("Aceptar");
		btnRetirar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (txtNumeroCta.getText().isEmpty() || txtCantidad.getText().isEmpty()) {
	                JOptionPane.showMessageDialog(null, "Llene todos los campos", "AVISO", JOptionPane.INFORMATION_MESSAGE);
	            } else {
	            	 double valor = Double.parseDouble(txtCantidad.getText());
	                 try {
	                    String resultado = port.transaccionRetiro(txtNumeroCta.getText(), valor);
	                    JOptionPane.showMessageDialog(null, resultado, "INFO", JOptionPane.INFORMATION_MESSAGE);
	                } catch (Exception_Exception e1) { 
	                    JOptionPane.showMessageDialog(null, e1.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
	                }
	            }
				
				limpiarCampos();
			}
		});
		btnRetirar.setBounds(52, 173, 89, 23);
		contentPane.add(btnRetirar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
			}
		});
		
		
		btnCancelar.setBounds(148, 173, 86, 23);
		contentPane.add(btnCancelar);
	}
}

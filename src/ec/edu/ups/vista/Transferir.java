package ec.edu.ups.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.namespace.QName;

import ec.edu.ups.common.Exception_Exception;
import ec.edu.ups.servicios.TransaccionesSOAP;
import ec.edu.ups.servicios.TransaccionesSOAPService;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Transferir extends JFrame {

	private JPanel contentPane;
	private JTextField txtCuentaOrigen;
	private JTextField txtCuentaDestino;
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
					Transferir frame = new Transferir();
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
	public Transferir() {
		
		URL wsdlURL = TransaccionesSOAPService.WSDL_LOCATION;
        port = new TransaccionesSOAPService(wsdlURL, SERVICE_NAME)
                .getTransaccionesSOAPPort(); 
        
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Cuenta Origen");
		
		JLabel lblNewLabel_1 = new JLabel("Cuenta Destino");
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad");
		
		JButton btnNewButton = new JButton("Transferir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtCuentaOrigen.getText().isEmpty() || txtCuentaOrigen.getText().isEmpty() 
			            || txtCantidad.getText().isEmpty()) {
			            JOptionPane.showMessageDialog(null, "Llene todos los campos", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			        } else {
			            double valor = Double.parseDouble(txtCantidad.getText());
			             try {
			                String resultado = port.transaccionTransferencia(txtCuentaOrigen.getText(), txtCuentaDestino.getText(), valor);
			                JOptionPane.showMessageDialog(null, resultado, "INFO", JOptionPane.INFORMATION_MESSAGE);
			            } catch (Exception_Exception e) { 
			                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
			            }
			        }
			}
		});
		
		txtCuentaOrigen = new JTextField();
		txtCuentaOrigen.setColumns(10);
		
		txtCuentaDestino = new JTextField();
		txtCuentaDestino.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(18)
							.addComponent(txtCuentaOrigen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCuentaDestino, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(168, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(168, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(157))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtCuentaOrigen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtCuentaDestino, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addComponent(btnNewButton)
					.addContainerGap(54, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}

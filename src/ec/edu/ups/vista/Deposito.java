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
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Deposito extends JFrame {

	private JPanel contentPane;
	private JTextField txtCuenta;
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
					Deposito frame = new Deposito();
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
	public Deposito() {
        URL wsdlURL = TransaccionesSOAPService.WSDL_LOCATION;
        port = new TransaccionesSOAPService(wsdlURL, SERVICE_NAME)
                .getTransaccionesSOAPPort();  
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCuenta = new JLabel("Cuenta");
		
		JLabel lblCantidad = new JLabel("Cantidad");
		
		JButton btnDeposito = new JButton("Deposito");
		btnDeposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtCuenta.getText().isEmpty() || txtCantidad.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Llene todos los campos", "AVISO", JOptionPane.INFORMATION_MESSAGE);
				}else {
					double cantidad = Double.parseDouble(txtCantidad.getText());
					try {
						String resultado = port.transaccionDepostio(txtCuenta.getText(), cantidad);
						JOptionPane.showMessageDialog(null, resultado, "INFO", JOptionPane.INFORMATION_MESSAGE);
					} catch (Exception_Exception e) {
						// TODO Auto-generated catch block
					    JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
			            
					}
				}
			}
		});
		
		txtCuenta = new JTextField();
		txtCuenta.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblCantidad)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblCuenta)
									.addGap(41)
									.addComponent(txtCuenta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(87))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(154)
							.addComponent(btnDeposito)))
					.addContainerGap(74, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCuenta)
						.addComponent(txtCuenta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCantidad)
						.addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addComponent(btnDeposito)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

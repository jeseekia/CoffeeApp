import java.awt.Color;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class CoffeeAppWindow {

	private JFrame frame;
	private JTextField txtPleaseSelectYour;
	private JTextField txtPleaseSelectYour_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		ArrayList<Drink> drinkOrder = new ArrayList<Drink>();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoffeeAppWindow window = new CoffeeAppWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CoffeeAppWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel orderPanel = new JPanel();
		orderPanel.setBounds(6, 6, 438, 266);
		frame.getContentPane().add(orderPanel);
		orderPanel.setLayout(null);
		
		JToggleButton btnSmall = new JToggleButton("SMALL");
		btnSmall.setForeground(Color.DARK_GRAY);
		btnSmall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSmall.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnSmall.setBounds(27, 53, 100, 33);
		orderPanel.add(btnSmall);
		
		JToggleButton btnIcedCoffee = new JToggleButton("ICED COFFEE");
		btnIcedCoffee.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnIcedCoffee.setBounds(151, 182, 133, 35);
		orderPanel.add(btnIcedCoffee);
		btnIcedCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JToggleButton btnCapuccino = new JToggleButton("CAPPUCCINO");
		btnCapuccino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCapuccino.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnCapuccino.setBounds(296, 145, 133, 35);
		orderPanel.add(btnCapuccino);
		
		JToggleButton btnCoffee = new JToggleButton("COFFEE");
		btnCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCoffee.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnCoffee.setBounds(6, 145, 133, 35);
		orderPanel.add(btnCoffee);
		
		JToggleButton btnMedium = new JToggleButton("MEDIUM");
		btnMedium.setForeground(Color.DARK_GRAY);
		btnMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMedium.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnMedium.setBounds(166, 53, 100, 35);
		orderPanel.add(btnMedium);
		
		JButton btnCart = new JButton("CART");
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCart.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnCart.setBounds(351, 225, 78, 35);
		orderPanel.add(btnCart);
		
		JToggleButton btnExpresso = new JToggleButton("ESPRESSO");
		btnExpresso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExpresso.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnExpresso.setBounds(151, 145, 133, 35);
		orderPanel.add(btnExpresso);
		
		JToggleButton btnFrappuccino = new JToggleButton("FRAPPUCCINO");
		btnFrappuccino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFrappuccino.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnFrappuccino.setBounds(6, 182, 133, 35);
		orderPanel.add(btnFrappuccino);
		
		JToggleButton btnLarge = new JToggleButton("LARGE");
		btnLarge.setForeground(Color.DARK_GRAY);
		btnLarge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLarge.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnLarge.setBounds(313, 53, 100, 35);
		orderPanel.add(btnLarge);
		
		JButton btnAdd = new JButton("ADD ");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnAdd.setBounds(27, 225, 77, 35);
		orderPanel.add(btnAdd);
		
		JToggleButton btnLatte = new JToggleButton("LATTE");
		btnLatte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLatte.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnLatte.setBounds(296, 182, 133, 35);
		orderPanel.add(btnLatte);
		
		txtPleaseSelectYour = new JTextField();
		txtPleaseSelectYour.setForeground(Color.DARK_GRAY);
		txtPleaseSelectYour.setHorizontalAlignment(SwingConstants.CENTER);
		txtPleaseSelectYour.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 15));
		txtPleaseSelectYour.setText("PLEASE SELECT YOUR SIZE");
		txtPleaseSelectYour.setBounds(96, 6, 259, 40);
		orderPanel.add(txtPleaseSelectYour);
		txtPleaseSelectYour.setColumns(10);
		
		txtPleaseSelectYour_1 = new JTextField();
		txtPleaseSelectYour_1.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 15));
		txtPleaseSelectYour_1.setForeground(Color.DARK_GRAY);
		txtPleaseSelectYour_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPleaseSelectYour_1.setText("PLEASE SELECT YOUR DRINK");
		txtPleaseSelectYour_1.setBounds(89, 93, 275, 40);
		orderPanel.add(txtPleaseSelectYour_1);
		txtPleaseSelectYour_1.setColumns(10);
	}
}
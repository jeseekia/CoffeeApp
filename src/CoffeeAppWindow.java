import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Font;

public class CoffeeAppWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		
		JButton btnSmall = new JButton("SMALL");
		btnSmall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSmall.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnSmall.setBounds(27, 53, 100, 33);
		orderPanel.add(btnSmall);
		
		JButton btnNewButton = new JButton("ICED COFFEE");
		btnNewButton.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnNewButton.setBounds(151, 168, 133, 35);
		orderPanel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnCapuccino = new JButton("CAPPUCCINO");
		btnCapuccino.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnCapuccino.setBounds(296, 131, 133, 35);
		orderPanel.add(btnCapuccino);
		
		JButton btnCoffee = new JButton("COFFEE");
		btnCoffee.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnCoffee.setBounds(6, 131, 133, 35);
		orderPanel.add(btnCoffee);
		
		JButton btnMedium = new JButton("MEDIUM");
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
		
		JButton btnExpresso = new JButton("ESPRESSO");
		btnExpresso.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnExpresso.setBounds(151, 131, 133, 35);
		orderPanel.add(btnExpresso);
		
		JButton btnFrappuccino = new JButton("FRAPPUCCINO");
		btnFrappuccino.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnFrappuccino.setBounds(6, 168, 133, 35);
		orderPanel.add(btnFrappuccino);
		
		JButton btnLarge = new JButton("LARGE");
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
		
		JButton btnLatte = new JButton("LATTE");
		btnLatte.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnLatte.setBounds(296, 168, 133, 35);
		orderPanel.add(btnLatte);
	}
}

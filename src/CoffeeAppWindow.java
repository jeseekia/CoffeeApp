import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

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

		
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		ButtonGroup sizeGroup = new ButtonGroup();
		ButtonGroup typeGroup = new ButtonGroup();

		
		
		JPanel orderPanel = new JPanel();
		orderPanel.setForeground(Color.WHITE);
		orderPanel.setBackground(Color.LIGHT_GRAY);
		orderPanel.setBounds(6, 6, 438, 266);
		frame.getContentPane().add(orderPanel);
		orderPanel.setLayout(null);

		JPanel cartPanel_1 = new JPanel();
		cartPanel_1.setVisible(false);
		cartPanel_1.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(cartPanel_1);
		cartPanel_1.setLayout(null);

		JList<String> orderList = new JList<String>(listModel);
		orderList.setFont(new Font("Courier New", Font.PLAIN, 11));
		orderList.setBounds(44, 38, 362, 159);
		cartPanel_1.add(orderList);
		
		JToggleButton btnSmall = new JToggleButton("SMALL");
		btnSmall.setForeground(Color.DARK_GRAY);
		btnSmall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnSmall.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnSmall.setBounds(27, 43, 100, 33);
		orderPanel.add(btnSmall);

		JToggleButton btnMedium = new JToggleButton("MEDIUM");
		btnMedium.setForeground(Color.DARK_GRAY);
		btnMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMedium.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnMedium.setBounds(161, 42, 100, 35);
		orderPanel.add(btnMedium);

		JToggleButton btnLarge = new JToggleButton("LARGE");
		btnLarge.setForeground(Color.DARK_GRAY);
		btnLarge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLarge.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnLarge.setBounds(309, 42, 100, 35);
		orderPanel.add(btnLarge);

		
		
		JToggleButton btnCoffee = new JToggleButton("COFFEE");
		btnCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCoffee.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnCoffee.setBounds(6, 145, 133, 35);
		orderPanel.add(btnCoffee);

		JToggleButton btnEspresso = new JToggleButton("ESPRESSO");
		btnEspresso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEspresso.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnEspresso.setBounds(151, 145, 133, 35);
		orderPanel.add(btnEspresso);
		
		JToggleButton btnCappuccino = new JToggleButton("CAPPUCCINO");
		btnCappuccino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCappuccino.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnCappuccino.setBounds(296, 145, 133, 35);
		orderPanel.add(btnCappuccino);

		JToggleButton btnFrappuccino = new JToggleButton("FRAPPUCCINO");
		btnFrappuccino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFrappuccino.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnFrappuccino.setBounds(6, 182, 133, 35);
		orderPanel.add(btnFrappuccino);

		JToggleButton btnIcedCoffee = new JToggleButton("ICED COFFEE");
		btnIcedCoffee.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnIcedCoffee.setBounds(151, 182, 133, 35);
		orderPanel.add(btnIcedCoffee);
		btnIcedCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JToggleButton btnLatte = new JToggleButton("LATTE");
		btnLatte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLatte.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnLatte.setBounds(296, 182, 133, 35);
		orderPanel.add(btnLatte);
				
		
		JLabel lblPleaseSelectYour = new JLabel("PLEASE SELECT YOUR SIZE");
		lblPleaseSelectYour.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 15));
		lblPleaseSelectYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSelectYour.setBounds(77, 6, 286, 25);
		orderPanel.add(lblPleaseSelectYour);

		JLabel lblPleaseSelectYour_1 = new JLabel("PLEASE SELECT YOUR DRINK");
		lblPleaseSelectYour_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSelectYour_1.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 15));
		lblPleaseSelectYour_1.setBounds(66, 108, 321, 25);
		orderPanel.add(lblPleaseSelectYour_1);


		sizeGroup.add(btnSmall);
		sizeGroup.add(btnMedium);
		sizeGroup.add(btnLarge);
		typeGroup.add(btnLatte);
		typeGroup.add(btnCappuccino);
		typeGroup.add(btnEspresso);
		typeGroup.add(btnFrappuccino);
		typeGroup.add(btnIcedCoffee);
		typeGroup.add(btnCoffee);

		
		
		JButton btnAdd = new JButton("ADD ");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String sizeText = null;
				String typeText = null;

				if (btnSmall.isSelected()) {
					sizeText = btnSmall.getText();
				} else if (btnMedium.isSelected()) {
					sizeText = btnMedium.getText();
				} else if (btnLarge.isSelected()) {
					sizeText = btnLarge.getText();
				}

				if (btnCappuccino.isSelected()) {
					typeText = btnCappuccino.getText();
				} else if (btnCoffee.isSelected()) {
					typeText = btnCoffee.getText();
				} else if (btnEspresso.isSelected()) {
					typeText = btnEspresso.getText();
				} else if (btnFrappuccino.isSelected()) {
					typeText = btnFrappuccino.getText();
				} else if (btnIcedCoffee.isSelected()) {
					typeText = btnIcedCoffee.getText();
				} else if (btnLatte.isSelected()) {
					typeText = btnLatte.getText();
				}

				if (sizeText == null || typeText == null) {
					JOptionPane.showMessageDialog(null, "You must select both a size and drink item.");
				} else {
					Order.setDrinkOrder(Order.createDrink(sizeText, typeText));
				}

				sizeGroup.clearSelection();
				typeGroup.clearSelection();
			}
		});
		btnAdd.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnAdd.setBounds(27, 225, 77, 35);
		orderPanel.add(btnAdd);

		
		JButton btnCart = new JButton("CART");
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderPanel.setVisible(false);
				cartPanel_1.setVisible(true);
				ArrayList<Drink> order = Order.getDrinkOrder();

				for (int i = 0; i < order.size(); i++) {
					Drink currentDrink = order.get(i);
					String size = currentDrink.getSize();
					String type = currentDrink.getType();
					double price = currentDrink.getPrice();
					listModel.addElement(Order.formatOrderLines(size, type, Calculations.formatNumber(price)));
				}
			}
		});
		btnCart.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnCart.setBounds(351, 225, 78, 35);
		orderPanel.add(btnCart);

		
		
		JButton btnBack = new JButton("BACK");
		btnBack.setRequestFocusEnabled(false);
		btnBack.setRolloverEnabled(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderPanel.setVisible(true);
				cartPanel_1.setVisible(false);
				listModel.clear();
			}
		});
		btnBack.setBounds(44, 242, 117, 29);
		cartPanel_1.add(btnBack);
		

	

		JTextArea textArea = new JTextArea();
		textArea.setBounds(239, 201, 167, 29);
		cartPanel_1.add(textArea);

		JButton btnPay = new JButton("PAY");
		btnPay.setRolloverEnabled(false);
		btnPay.setRequestFocusEnabled(false);
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fName = "receipt.txt";

				Path p = Paths.get(fName);

				//For some reason this feature gets rid of the Jlist when the program goes back to main screen
				//JOptionPane.showMessageDialog(null, orderList, "Receipt", 1);
				JOptionPane.showMessageDialog(null, "Thank you!");
				
				Path absPath = p.toAbsolutePath();

				if (!Files.exists(absPath)) {
					try {
						Files.createFile(absPath);

					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "File Creation Error!");
					}
				}

				Writer writer = null;

				try {
					File receiptTextFile = absPath.toFile();

					writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("receipt.txt"), "utf-8"));
					
					for (int i = 0; i < listModel.size(); i++) {
						writer.write(listModel.elementAt(i).toString()+"\n");
						Order.getDrinkOrder().remove(0);
					}
					
					listModel.clear();
					writer.close();
					
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "File Creation Error!");
				}
				
				orderPanel.setVisible(true);
				cartPanel_1.setVisible(false);
				
			}
		});
		btnPay.setBounds(289, 242, 117, 29);
		cartPanel_1.add(btnPay);

		
		JLabel lblPleaseReviewYour = new JLabel("PLEASE REVIEW YOUR ORDER");
		lblPleaseReviewYour.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblPleaseReviewYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseReviewYour.setBounds(98, 17, 236, 16);
		cartPanel_1.add(lblPleaseReviewYour);

		JButton btnSubtotal = new JButton("SUBTOTAL");
		btnSubtotal.setRolloverEnabled(false);
		btnSubtotal.setRequestFocusEnabled(false);
		btnSubtotal.setBounds(121, 201, 117, 29);
		cartPanel_1.add(btnSubtotal);
	}
}

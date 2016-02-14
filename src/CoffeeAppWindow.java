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
import java.awt.Insets;
import java.awt.Component;
import java.awt.Rectangle;

public class CoffeeAppWindow {

	private JFrame frame;
	private JTextField subtotalField;
	private JTextField taxField;
	private JTextField totalField;

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
		frame.setBounds(100, 100, 450, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		DefaultListModel<String> listModel = new DefaultListModel<String>();
		ButtonGroup sizeGroup = new ButtonGroup();
		ButtonGroup typeGroup = new ButtonGroup();

		JPanel orderPanel = new JPanel();
		orderPanel.setForeground(Color.WHITE);
		orderPanel.setBackground(Color.LIGHT_GRAY);
		orderPanel.setBounds(6, 6, 438, 359);
		frame.getContentPane().add(orderPanel);
		orderPanel.setLayout(null);

		JToggleButton btnSmall = new JToggleButton("SMALL");
		btnSmall.setBounds(new Rectangle(0, 0, 110, 35));
		btnSmall.setMargin(new Insets(10, 2, 2, 2));
		btnSmall.setForeground(Color.DARK_GRAY);
		// btnSmall.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		//
		// }
		// });
		btnSmall.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnSmall.setBounds(27, 61, 100, 33);
		orderPanel.add(btnSmall);

		JToggleButton btnMedium = new JToggleButton("MEDIUM");
		btnMedium.setBounds(new Rectangle(0, 0, 110, 35));
		btnMedium.setMargin(new Insets(10, 2, 2, 2));
		btnMedium.setForeground(Color.DARK_GRAY);
		// btnMedium.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// }
		// });
		btnMedium.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnMedium.setBounds(161, 60, 110, 35);
		orderPanel.add(btnMedium);

		JToggleButton btnLarge = new JToggleButton("LARGE");
		btnLarge.setBounds(new Rectangle(0, 0, 110, 35));
		btnLarge.setMargin(new Insets(10, 2, 2, 2));
		btnLarge.setForeground(Color.DARK_GRAY);
		// btnLarge.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// }
		// });
		btnLarge.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnLarge.setBounds(309, 60, 100, 35);
		orderPanel.add(btnLarge);

		JToggleButton btnCoffee = new JToggleButton("COFFEE");
		btnCoffee.setMargin(new Insets(10, 2, 2, 2));
		// btnCoffee.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// }
		// });
		btnCoffee.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnCoffee.setBounds(6, 165, 133, 35);
		orderPanel.add(btnCoffee);

		JToggleButton btnEspresso = new JToggleButton("ESPRESSO");
		btnEspresso.setMargin(new Insets(10, 2, 2, 2));
		// btnEspresso.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// }
		// });
		btnEspresso.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnEspresso.setBounds(299, 165, 133, 35);
		orderPanel.add(btnEspresso);

		JToggleButton btnCappuccino = new JToggleButton("CAPPUCCINO");
		btnCappuccino.setMargin(new Insets(10, 2, 2, 2));
		// btnCappuccino.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// }
		// });
		btnCappuccino.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnCappuccino.setBounds(148, 165, 145, 35);
		orderPanel.add(btnCappuccino);

		JToggleButton btnFrappuccino = new JToggleButton("FRAPPUCCINO");
		btnFrappuccino.setBounds(new Rectangle(150, 0, 0, 0));
		btnFrappuccino.setMargin(new Insets(10, 2, 2, 2));
		// btnFrappuccino.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// }
		// });
		btnFrappuccino.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnFrappuccino.setBounds(148, 202, 145, 35);
		orderPanel.add(btnFrappuccino);

		JToggleButton btnIcedCoffee = new JToggleButton("ICED COFFEE");
		btnIcedCoffee.setMargin(new Insets(10, 2, 2, 2));
		btnIcedCoffee.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnIcedCoffee.setBounds(6, 202, 133, 35);
		orderPanel.add(btnIcedCoffee);
		// btnIcedCoffee.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// }
		// });

		JToggleButton btnLatte = new JToggleButton("LATTE");
		btnLatte.setMargin(new Insets(10, 2, 2, 2));
		// btnLatte.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// }
		// });
		btnLatte.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnLatte.setBounds(299, 202, 133, 35);
		orderPanel.add(btnLatte);

		JLabel lblPleaseSelectYour = new JLabel("PLEASE SELECT YOUR SIZE");
		lblPleaseSelectYour.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 15));
		lblPleaseSelectYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSelectYour.setBounds(77, 24, 286, 25);
		orderPanel.add(lblPleaseSelectYour);

		JLabel lblPleaseSelectYour_1 = new JLabel("PLEASE SELECT YOUR DRINK");
		lblPleaseSelectYour_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSelectYour_1.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 15));
		lblPleaseSelectYour_1.setBounds(66, 128, 321, 25);
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
		btnAdd.setMargin(new Insets(7, 0, 0, 0));
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
		btnAdd.setBounds(155, 259, 133, 40);
		orderPanel.add(btnAdd);

		JPanel cartPanel_1 = new JPanel();
		cartPanel_1.setBackground(Color.LIGHT_GRAY);
		cartPanel_1.setVisible(false);
		cartPanel_1.setBounds(0, 0, 450, 365);
		frame.getContentPane().add(cartPanel_1);
		cartPanel_1.setLayout(null);
		
		JButton btnCart = new JButton("CART");
		btnCart.setMargin(new Insets(7, 0, 0, 0));
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Drink> order = Order.getDrinkOrder();

				for (int i = 0; i < order.size(); i++) {
					Drink currentDrink = order.get(i);
					String size = currentDrink.getSize();
					String type = currentDrink.getType();
					double price = currentDrink.getPrice();
					listModel.addElement(Order.formatOrderLines(size, type, Calculations.formatNumber(price)));
				}

				subtotalField.setText(Calculations.getFormattedSubTotal());
				taxField.setText(Calculations.getFormattedTax());
				totalField.setText(Calculations.getFormattedTotal());

				orderPanel.setVisible(false);
				cartPanel_1.setVisible(true);
			}
		});
		btnCart.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnCart.setBounds(155, 311, 133, 40);
		orderPanel.add(btnCart);

		

		JList<String> orderList = new JList<String>(listModel);
		orderList.setFont(new Font("Courier New", Font.PLAIN, 11));
		orderList.setBounds(78, 38, 276, 167);
		cartPanel_1.add(orderList);

		JButton btnBack = new JButton("BACK");
		btnBack.setRolloverEnabled(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderPanel.setVisible(true);
				cartPanel_1.setVisible(false);
				listModel.clear();
			}
		});
		btnBack.setBounds(44, 330, 117, 29);
		cartPanel_1.add(btnBack);

		JButton btnDeleteItem = new JButton("DELETE ITEM");
		btnDeleteItem.setRolloverEnabled(false);
		btnDeleteItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = orderList.getSelectedIndex();
				if (index < 0) {
					JOptionPane.showMessageDialog(null, "You must select an item to be deleted.");
				} else {
					listModel.removeElementAt(index);
					Order.getDrinkOrder().remove(index);

					subtotalField.setText(Calculations.getFormattedSubTotal());
					taxField.setText(Calculations.getFormattedTax());
					totalField.setText(Calculations.getFormattedTotal());
				}
			}
		});
		btnDeleteItem.setBounds(121, 217, 192, 29);
		cartPanel_1.add(btnDeleteItem);

		JButton btnPay = new JButton("PAY");
		btnPay.setRolloverEnabled(false);
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fName = "receipt.txt";

				Path p = Paths.get(fName);

				// For some reason this feature gets rid of the Jlist when the
				// program goes back to main screen
				// JOptionPane.showMessageDialog(null, orderList, "Receipt", 1);

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

					if (listModel.size() == 0 || Order.getDrinkOrder().isEmpty()) {
						JOptionPane.showMessageDialog(null, "There aren't any items in the order.");
					} else {
						JOptionPane.showMessageDialog(null, "Thank you!");
						for (int i = 0; i < listModel.size(); i++) {
							writer.write(listModel.elementAt(i).toString() + "\n");
						}
						writer.write("\n\n\n\n\n\n\n\n");
						writer.write("Subtotal:  " + Calculations.getFormattedSubTotal() + "\n");
						writer.write("Tax:       " + Calculations.getFormattedTax() + "\n");
						writer.write("Total:     " + Calculations.getFormattedTotal() + "\n");

						orderPanel.setVisible(true);
						cartPanel_1.setVisible(false);
						Order.getDrinkOrder().clear();
						listModel.clear();
						writer.close();

					}

				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "File Creation Error!");
				}

			}
		});
		btnPay.setBounds(289, 330, 117, 29);
		cartPanel_1.add(btnPay);

		JLabel lblPleaseReviewYour = new JLabel("PLEASE REVIEW YOUR ORDER");
		lblPleaseReviewYour.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblPleaseReviewYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseReviewYour.setBounds(98, 17, 236, 16);
		cartPanel_1.add(lblPleaseReviewYour);

		subtotalField = new JTextField();
		subtotalField.setBackground(Color.LIGHT_GRAY);
		subtotalField.setHorizontalAlignment(SwingConstants.LEFT);
		subtotalField.setEditable(false);
		subtotalField.setBounds(224, 246, 66, 26);
		cartPanel_1.add(subtotalField);
		subtotalField.setColumns(10);

		taxField = new JTextField();
		taxField.setBackground(Color.LIGHT_GRAY);
		taxField.setHorizontalAlignment(SwingConstants.LEFT);
		taxField.setEditable(false);
		taxField.setColumns(10);
		taxField.setBounds(224, 272, 66, 26);
		cartPanel_1.add(taxField);

		totalField = new JTextField();
		totalField.setBackground(Color.LIGHT_GRAY);
		totalField.setHorizontalAlignment(SwingConstants.LEFT);
		totalField.setEditable(false);
		totalField.setColumns(10);
		totalField.setBounds(224, 302, 66, 26);
		cartPanel_1.add(totalField);

		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSubtotal.setBounds(150, 251, 61, 16);
		cartPanel_1.add(lblSubtotal);

		JLabel lblTax = new JLabel("Tax:");
		lblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTax.setBounds(150, 277, 61, 16);
		cartPanel_1.add(lblTax);

		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setBounds(150, 307, 61, 16);
		cartPanel_1.add(lblTotal);

		JLabel lblNewLabel = new JLabel("--------------------");
		lblNewLabel.setBounds(144, 292, 160, 16);
		cartPanel_1.add(lblNewLabel);

	}
}

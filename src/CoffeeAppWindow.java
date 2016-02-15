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
	 * This application is a simulation of a POS System for a Coffee Business.
	 * It allows the client of the Coffee Barista to select a type of beverage, customize size and
	 * add drinks to their Order list. 
	 * Once they have finished, they have the option to go to their "cart" to review their order, 
	 * they can delete items, go back to the "order Panel" and add more.
	 * In the "cart Panel" they will be able to preview their subtotal, tax and total before paying.
	 * Authors: Jeseekia Vaughn, Diana Miller, Luke Jarmolowicz, Austin Jordan.
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
		
		//Create a listModel to be applied to the jList on cart screen
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		
		//These button groups only allow for one size option and one drink type option to be toggled at any point in time
		ButtonGroup sizeGroup = new ButtonGroup();
		ButtonGroup typeGroup = new ButtonGroup();

		//This is where the order panel is created. The order panel shows the users the different options for both the type of drink that they can order,
		//and the size of that drink.
		JPanel orderPanel = new JPanel();
		orderPanel.setForeground(Color.WHITE);
		orderPanel.setBackground(Color.LIGHT_GRAY);
		orderPanel.setBounds(6, 6, 438, 359);
		frame.getContentPane().add(orderPanel);
		orderPanel.setLayout(null);

		//When this button is pressed the getSize method returns Small.
		JToggleButton btnSmall = new JToggleButton("SMALL");
		btnSmall.setBounds(new Rectangle(0, 0, 110, 35));
		btnSmall.setMargin(new Insets(10, 2, 2, 2));
		btnSmall.setForeground(Color.DARK_GRAY);
		btnSmall.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnSmall.setBounds(27, 61, 100, 33);
		orderPanel.add(btnSmall);

		//When this button is pressed the getSize method returns Medium.
		JToggleButton btnMedium = new JToggleButton("MEDIUM");
		btnMedium.setBounds(new Rectangle(0, 0, 110, 35));
		btnMedium.setMargin(new Insets(10, 2, 2, 2));
		btnMedium.setForeground(Color.DARK_GRAY);
		btnMedium.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnMedium.setBounds(161, 60, 110, 35);
		orderPanel.add(btnMedium);

		//When this button is pressed the getSize method returns Large.
		JToggleButton btnLarge = new JToggleButton("LARGE");
		btnLarge.setBounds(new Rectangle(0, 0, 110, 35));
		btnLarge.setMargin(new Insets(10, 2, 2, 2));
		btnLarge.setForeground(Color.DARK_GRAY);
		btnLarge.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnLarge.setBounds(309, 60, 100, 35);
		orderPanel.add(btnLarge);

		//When this button is pressed the getType method returns Coffee.
		JToggleButton btnCoffee = new JToggleButton("COFFEE");
		btnCoffee.setMargin(new Insets(10, 2, 2, 2));
		btnCoffee.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnCoffee.setBounds(6, 165, 133, 35);
		orderPanel.add(btnCoffee);

		//When this button is pressed the getType method returns Espresso.
		JToggleButton btnEspresso = new JToggleButton("ESPRESSO");
		btnEspresso.setMargin(new Insets(10, 2, 2, 2));
		btnEspresso.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnEspresso.setBounds(299, 165, 133, 35);
		orderPanel.add(btnEspresso);

		//When this button is pressed the getType method returns Cappuccino.
		JToggleButton btnCappuccino = new JToggleButton("CAPPUCCINO");
		btnCappuccino.setMargin(new Insets(10, 2, 2, 2));
		btnCappuccino.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnCappuccino.setBounds(148, 165, 145, 35);
		orderPanel.add(btnCappuccino);

		//When this button is pressed the getType method returns Frappuccino.
		JToggleButton btnFrappuccino = new JToggleButton("FRAPPUCCINO");
		btnFrappuccino.setBounds(new Rectangle(150, 0, 0, 0));
		btnFrappuccino.setMargin(new Insets(10, 2, 2, 2));
		btnFrappuccino.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnFrappuccino.setBounds(148, 202, 145, 35);
		orderPanel.add(btnFrappuccino);

		//When this button is pressed the getType method returns Iced Coffee.
		JToggleButton btnIcedCoffee = new JToggleButton("ICED COFFEE");
		btnIcedCoffee.setMargin(new Insets(10, 2, 2, 2));
		btnIcedCoffee.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 13));
		btnIcedCoffee.setBounds(6, 202, 133, 35);
		orderPanel.add(btnIcedCoffee);

		//When this button is pressed the getType method returns Latte.
		JToggleButton btnLatte = new JToggleButton("LATTE");
		btnLatte.setMargin(new Insets(10, 2, 2, 2));
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
		
		// Add the toggle buttons into their appropriate groups
		sizeGroup.add(btnSmall);
		sizeGroup.add(btnMedium);
		sizeGroup.add(btnLarge);
		typeGroup.add(btnLatte);
		typeGroup.add(btnCappuccino);
		typeGroup.add(btnEspresso);
		typeGroup.add(btnFrappuccino);
		typeGroup.add(btnIcedCoffee);
		typeGroup.add(btnCoffee);

		//When the add button is pressed the user's selection for size and type are used to then calculate the price and create a Drink object.
		JButton btnAdd = new JButton("ADD ");
		btnAdd.setMargin(new Insets(7, 0, 0, 0));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Initialize these variables to null so validation can occur to make sure both size and drink are selected
				String sizeText = null;
				String typeText = null;
				
				// If/Else used to determine which size option is selected and get that button's text
				if (btnSmall.isSelected()) {
					sizeText = btnSmall.getText();
				} else if (btnMedium.isSelected()) {
					sizeText = btnMedium.getText();
				} else if (btnLarge.isSelected()) {
					sizeText = btnLarge.getText();
				}

				// If/Else used to determine which drink option is selected and get that button's text
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
				
				// Validate to make sure a button from each group is toggled
				if (sizeText == null || typeText == null) {
					JOptionPane.showMessageDialog(null, "You must select both a size and drink item.");
				} else {
					// Call the methods from Order class that will create a drink object and store it in an ArrayList 
					Order.setDrinkOrder(Order.createDrink(sizeText, typeText));		
				}
				
				// Clears the selected toggle buttons
				sizeGroup.clearSelection();
				typeGroup.clearSelection();
			}
		});
		btnAdd.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnAdd.setBounds(155, 259, 133, 40);
		orderPanel.add(btnAdd);
		
		// Initialization of cart panel which displays buttons to delete an item, go back to previous screen, and pay. 
		// Also includes a jList that displays the ordered items and fields for the subtotal, tax, and grand total
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
				
				// Retrieve the ArrayList of Drink objects
				ArrayList<Drink> order = Order.getDrinkOrder();
				
				//Pressing the Cart button adds all of the different individual Drink objects, as well as their size, type, and price to a list by
				//iterating through the ArrayList.
				//The list of all of the Drink objects ordered is shown to the user in a new panel called the cart panel.
				for (int i = 0; i < order.size(); i++) {
					Drink currentDrink = order.get(i);
					String size = currentDrink.getSize();
					String type = currentDrink.getType();
					double price = currentDrink.getPrice();
					
					// Pass the variables of each object to the formatter and add them to the jList
					listModel.addElement(Order.formatOrderLines(size, type, Calculations.formatNumber(price)));
				}
				//Pressing the Cart button also allows the user to see the subtotal sales tax and their total price for their order by displaying it
				//in their respective fields
				subtotalField.setText(Calculations.getFormattedSubTotal());
				taxField.setText(Calculations.getFormattedTax());
				totalField.setText(Calculations.getFormattedTotal());
				
				//Pressing on the Cart button makes the order panel no longer visible. The cart panel is shown to the user.
				orderPanel.setVisible(false);
				cartPanel_1.setVisible(true);
			}
		});
		btnCart.setFont(new Font("Hiragino Kaku Gothic StdN", Font.PLAIN, 13));
		btnCart.setBounds(155, 311, 133, 40);
		orderPanel.add(btnCart);

		
		//The JList called orderList is where all of the Drink objects and their type, size, and price are shown to the customer.
		//Uses the DefaultListModel that was initialized at beginning of program
		JList<String> orderList = new JList<String>(listModel);
		orderList.setFont(new Font("Courier New", Font.PLAIN, 11));
		orderList.setBounds(78, 38, 276, 167);
		cartPanel_1.add(orderList);

		//This Back button allows the user to return to the order panel and makes the cart panel invisible.
		JButton btnBack = new JButton("BACK");
		btnBack.setRolloverEnabled(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderPanel.setVisible(true);
				cartPanel_1.setVisible(false);
				
				// To ensure that the contents of the jList are updated if the user adds an item when they go back to order screen
				listModel.clear();
			}
		});
		btnBack.setBounds(44, 330, 117, 29);
		cartPanel_1.add(btnBack);

		//The delete button allows the user to clear a selected item from the Jlist which details their order.
		JButton btnDeleteItem = new JButton("DELETE ITEM");
		btnDeleteItem.setRolloverEnabled(false);
		btnDeleteItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Determine the index of the selected item
				int index = orderList.getSelectedIndex();
				
				//Make sure that an item is selected. If it is remove the item from the list and also remove the Drink object from the ArrayList
				if (index < 0) {
					JOptionPane.showMessageDialog(null, "You must select an item to be deleted.");
				} else {
					listModel.removeElementAt(index);
					Order.getDrinkOrder().remove(index);

					//Once the item is deleted from the list the subtotal, sales tax, and total is recalculated.
					subtotalField.setText(Calculations.getFormattedSubTotal());
					taxField.setText(Calculations.getFormattedTax());
					totalField.setText(Calculations.getFormattedTotal());
				}
			}
		});
		btnDeleteItem.setBounds(121, 217, 192, 29);
		cartPanel_1.add(btnDeleteItem);

		//When the user presses the Pay button a text file is created which details the order and acts as a receipt. 
		JButton btnPay = new JButton("PAY");
		btnPay.setRolloverEnabled(false);
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fName = "receipt.txt";

				Path p = Paths.get(fName);

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
					
					// Make sure that an object exists in the arraylist or an element is on the jList
					if (listModel.size() == 0 || Order.getDrinkOrder().isEmpty()) {
						JOptionPane.showMessageDialog(null, "There aren't any items in the order.");
					} else {
						JOptionPane.showMessageDialog(null, "Thank you!");
						
						// Write the lines of teh order to the receipt.txt file followed by some blank lines and then the totals information
						for (int i = 0; i < listModel.size(); i++) {
							writer.write(listModel.elementAt(i).toString() + "\n");
						}
						writer.write("\n\n\n\n\n\n\n\n");
						writer.write("Subtotal:  " + Calculations.getFormattedSubTotal() + "\n");
						writer.write("Tax:       " + Calculations.getFormattedTax() + "\n");
						writer.write("Total:     " + Calculations.getFormattedTotal() + "\n");
						
						//Clear the contents of the jList and the ArrayList so a new order can be processed
						Order.getDrinkOrder().clear();
						listModel.clear();
						writer.close();

					}
					
					//Hide the cart panel and make the order panel visible again
					orderPanel.setVisible(true);
					cartPanel_1.setVisible(false);
					
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

		//This creates a text field where the calculated subtotal (total without tax) is added.
		subtotalField = new JTextField();
		subtotalField.setBackground(Color.LIGHT_GRAY);
		subtotalField.setHorizontalAlignment(SwingConstants.LEFT);
		subtotalField.setEditable(false);
		subtotalField.setBounds(224, 246, 66, 26);
		cartPanel_1.add(subtotalField);
		subtotalField.setColumns(10);

		//This creates a text field where the calculated sales tax is added.
		taxField = new JTextField();
		taxField.setBackground(Color.LIGHT_GRAY);
		taxField.setHorizontalAlignment(SwingConstants.LEFT);
		taxField.setEditable(false);
		taxField.setColumns(10);
		taxField.setBounds(224, 272, 66, 26);
		cartPanel_1.add(taxField);

		//This creates a text field where the calculated total price is added.
		totalField = new JTextField();
		totalField.setBackground(Color.LIGHT_GRAY);
		totalField.setHorizontalAlignment(SwingConstants.LEFT);
		totalField.setEditable(false);
		totalField.setColumns(10);
		totalField.setBounds(224, 302, 66, 26);
		cartPanel_1.add(totalField);

		//This creates a label where the Subtotal is displayed to the user.
		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSubtotal.setBounds(150, 251, 61, 16);
		cartPanel_1.add(lblSubtotal);

		//This creates a label where the sales tax is displayed to the user.
		JLabel lblTax = new JLabel("Tax:");
		lblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTax.setBounds(150, 277, 61, 16);
		cartPanel_1.add(lblTax);

		//This creates a label where the total price is displayed to the user.
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setBounds(150, 307, 61, 16);
		cartPanel_1.add(lblTotal);

		JLabel lblNewLabel = new JLabel("--------------------");
		lblNewLabel.setBounds(144, 292, 160, 16);
		cartPanel_1.add(lblNewLabel);

	}
}

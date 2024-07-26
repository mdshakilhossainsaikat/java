package com.Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class RestaurantOrderManagementUI extends JFrame {
    private JTextField customerNameField;
    private JTextField tableNumberField;
    private JTextField menuItemField;
    private JTextArea orderDetailsArea;
    private JButton addOrderButton;
    private JButton displayOrderButton;
    private JButton clearFieldsButton;
    private Order currentOrder;
    private Menu menu;
    private List<Order> orders;

    public RestaurantOrderManagementUI() {
        setTitle("Restaurant Order Management");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Set up components
        customerNameField = new JTextField(20);
        tableNumberField = new JTextField(20);
        menuItemField = new JTextField(20);
        orderDetailsArea = new JTextArea(10, 40);
        orderDetailsArea.setEditable(false);
        addOrderButton = new JButton("Add Order");
        displayOrderButton = new JButton("Display Orders");
        clearFieldsButton = new JButton("Clear Fields");

        // Set up layout
        setLayout(new BorderLayout(10, 10));
        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        inputPanel.add(new JLabel("Customer Name:"));
        inputPanel.add(customerNameField);
        inputPanel.add(new JLabel("Table Number:"));
        inputPanel.add(tableNumberField);
        inputPanel.add(new JLabel("Menu Items (comma-separated):"));
        inputPanel.add(menuItemField);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addOrderButton);
        buttonPanel.add(displayOrderButton);
        buttonPanel.add(clearFieldsButton);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(orderDetailsArea), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Initialize data
        orders = new ArrayList<>();
        menu = new Menu();
        populateMenu();

        // Add listeners
        addOrderButton.addActionListener(new AddOrderListener());
        displayOrderButton.addActionListener(new DisplayOrderListener());
        clearFieldsButton.addActionListener(e -> clearInputFields());
    }

    private void populateMenu() {
        menu.addMenuItem("Pizza", 10.0);
        menu.addMenuItem("Pasta", 8.0);
        menu.addMenuItem("Salad", 5.0);
    }

    private void clearInputFields() {
        customerNameField.setText("");
        tableNumberField.setText("");
        menuItemField.setText("");
    }

    private class AddOrderListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String customerName = customerNameField.getText();
                int tableNumber = Integer.parseInt(tableNumberField.getText());
                List<String> menuItems = Arrays.asList(menuItemField.getText().split(","));
                double totalAmount = menuItems.stream().mapToDouble(menu::getPrice).sum();
                currentOrder = new Order(customerName, tableNumber, menuItems, totalAmount);
                orders.add(currentOrder);
                JOptionPane.showMessageDialog(null, "Order added successfully!");
                clearInputFields();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid data.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class DisplayOrderListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            orderDetailsArea.setText("");
            for (Order order : orders) {
                orderDetailsArea.append(order.toString() + "\n");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RestaurantOrderManagementUI().setVisible(true));
    }
}

package com.Project;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<String, Double> items;

    public Menu() {
        items = new HashMap<>();
    }

    public void addMenuItem(String name, double price) {
        items.put(name, price);
    }

    public void removeMenuItem(String name) {
        items.remove(name);
    }

    public double getPrice(String name) {
        return items.getOrDefault(name, 0.0);
    }

    public Map<String, Double> getItems() {
        return items;
    }
}


package com.Project;

import java.util.List;

public class Order {
    private String customerName;
    private int tableNumber;
    private List<String> menuItems;
    private double totalAmount;

    public Order(String customerName, int tableNumber, List<String> menuItems, double totalAmount) {
        this.customerName = customerName;
        this.tableNumber = tableNumber;
        this.menuItems = menuItems;
        this.totalAmount = totalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public List<String> getMenuItems() {
        return menuItems;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", tableNumber=" + tableNumber +
                ", menuItems=" + menuItems +
                ", totalAmount=" + totalAmount +
                '}';
    }
}

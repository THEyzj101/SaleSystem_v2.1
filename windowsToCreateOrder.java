package GUI;

//import Bean.DBBean;
//import op.op;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.awt.Dimension;

public class windowsToCreateOrder extends JFrame{
	private JTextField goodsPriceDisplay;
	private JTextField totalMoneyDisplay;
	private JTextField goodsNumberInput;
	private JTextField textField;
	private JTextField textField_1;
	private windowsToCreateOrder a = this;
	public windowsToCreateOrder() {

	//public windowsToCreateOrder(DBBean db, JTable table, Vector<Vector<Object>> data, Vector<Object> name, JTextField out) {
		setTitle("新增商品");
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel_addGoods = new JPanel();
		panel_addGoods.setBorder(new EmptyBorder(0, 30, 0, 30));
		getContentPane().add(panel_addGoods, BorderLayout.CENTER);
		GridBagLayout gbl_panel_addGoods = new GridBagLayout();
		gbl_panel_addGoods.columnWidths = new int[] {40, 100, 178, 0};
		gbl_panel_addGoods.rowHeights = new int[] {30, 30, 30, 30};
		gbl_panel_addGoods.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_addGoods.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		panel_addGoods.setLayout(gbl_panel_addGoods);
						
		JLabel goodsNameLabel = new JLabel("  商品名称  ");
		goodsNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_goodsNameLabel = new GridBagConstraints();
		gbc_goodsNameLabel.fill = GridBagConstraints.BOTH;
		gbc_goodsNameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_goodsNameLabel.gridx = 1;
		gbc_goodsNameLabel.gridy = 0;
		panel_addGoods.add(goodsNameLabel, gbc_goodsNameLabel);

		Box horizontalBox = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox = new GridBagConstraints();
		gbc_horizontalBox.fill = GridBagConstraints.BOTH;
		gbc_horizontalBox.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalBox.gridx = 2;
		gbc_horizontalBox.gridy = 0;
		panel_addGoods.add(horizontalBox, gbc_horizontalBox);

		// 商品名称的Textfield
		textField = new JTextField();
		textField.setColumns(10);
		horizontalBox.add(textField);

		JButton btnSearch = new JButton("搜索");
		// 搜索监听器：找到物品并将outprice输出给输出价格的文本框goodsPriceDisplay
		/**
		btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ResultSet res = db.executeFind(textField.getText(), "itemmanager", "name");
				try {
					if (res.next()){
						goodsPriceDisplay.setText(String.valueOf(res.getObject("outprice")));
					}
					else {
						JTextArea aboutarea = new JTextArea();
						aboutarea.setText("未查找到！\n");
						JOptionPane.showConfirmDialog(null,aboutarea,"Error!",JOptionPane.PLAIN_MESSAGE);
					}
				} catch (SQLException throwables) {
					throwables.printStackTrace();
				}
			}
		});
		 **/
		horizontalBox.add(btnSearch);

		JLabel goodsPriceLabel = new JLabel("   单  价  ");
		goodsPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_goodsPriceLabel = new GridBagConstraints();
		gbc_goodsPriceLabel.fill = GridBagConstraints.BOTH;
		gbc_goodsPriceLabel.insets = new Insets(0, 0, 5, 5);
		gbc_goodsPriceLabel.gridx = 1;
		gbc_goodsPriceLabel.gridy = 1;
		panel_addGoods.add(goodsPriceLabel, gbc_goodsPriceLabel);
		// 显示单
		goodsPriceDisplay = new JTextField();
		goodsPriceDisplay.setEnabled(false);
		goodsPriceDisplay.setEditable(false);
		goodsPriceDisplay.setColumns(10);
		GridBagConstraints gbc_goodsPriceDisplay = new GridBagConstraints();
		gbc_goodsPriceDisplay.fill = GridBagConstraints.BOTH;
		gbc_goodsPriceDisplay.insets = new Insets(0, 0, 5, 0);
		gbc_goodsPriceDisplay.gridx = 2;
		gbc_goodsPriceDisplay.gridy = 1;
		panel_addGoods.add(goodsPriceDisplay, gbc_goodsPriceDisplay);

		JLabel goodsNumberInputLabel = new JLabel("  商品数量  ");
		goodsNumberInputLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_goodsNumberInputLabel = new GridBagConstraints();
		gbc_goodsNumberInputLabel.fill = GridBagConstraints.BOTH;
		gbc_goodsNumberInputLabel.insets = new Insets(0, 0, 5, 5);
		gbc_goodsNumberInputLabel.gridx = 1;
		gbc_goodsNumberInputLabel.gridy = 2;
		panel_addGoods.add(goodsNumberInputLabel, gbc_goodsNumberInputLabel);

		Box horizontalBox_1 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_1 = new GridBagConstraints();
		gbc_horizontalBox_1.fill = GridBagConstraints.BOTH;
		gbc_horizontalBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_horizontalBox_1.gridx = 2;
		gbc_horizontalBox_1.gridy = 2;
		panel_addGoods.add(horizontalBox_1, gbc_horizontalBox_1);

		// 输入数量的Textfield
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		horizontalBox_1.add(textField_1);

		// 计算总价的按钮
		JButton btnConfirm = new JButton("确认");
		horizontalBox_1.add(btnConfirm);

		// 绑定计算总价的监听
		btnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if ((!textField_1.getText().equals("")) &&  (!goodsPriceDisplay.getText().equals(""))){
					totalMoneyDisplay.setText(String.valueOf(Float.parseFloat(textField_1.getText()) * Float.parseFloat(goodsPriceDisplay.getText())));
				}
			}
		});
		JLabel totalMoneyLabel = new JLabel("  合  计  ");
		totalMoneyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_totalMoneyLabel = new GridBagConstraints();
		gbc_totalMoneyLabel.fill = GridBagConstraints.BOTH;
		gbc_totalMoneyLabel.insets = new Insets(0, 0, 0, 5);
		gbc_totalMoneyLabel.gridx = 1;
		gbc_totalMoneyLabel.gridy = 3;
		panel_addGoods.add(totalMoneyLabel, gbc_totalMoneyLabel);

		// 显示总价的Textfield
		totalMoneyDisplay = new JTextField();
		totalMoneyDisplay.setEnabled(false);
		totalMoneyDisplay.setEditable(false);
		totalMoneyDisplay.setColumns(10);
		GridBagConstraints gbc_totalMoneyDisplay = new GridBagConstraints();
		gbc_totalMoneyDisplay.fill = GridBagConstraints.BOTH;
		gbc_totalMoneyDisplay.gridx = 2;
		gbc_totalMoneyDisplay.gridy = 3;
		panel_addGoods.add(totalMoneyDisplay, gbc_totalMoneyDisplay);

		Box horizontalBox_2 = Box.createHorizontalBox();
		getContentPane().add(horizontalBox_2, BorderLayout.SOUTH);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue);
		
		JButton button_addOrders_confirm = new JButton("确  定");
		button_addOrders_confirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//todo 确定按钮功能
				dispose();
			}
		});
		horizontalBox_2.add(button_addOrders_confirm);
		
		Component rigidArea = Box.createRigidArea(new Dimension(100, 60));
		horizontalBox_2.add(rigidArea);
		
		JButton button_addOrders_cancel = new JButton("取  消");
		button_addOrders_cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		horizontalBox_2.add(button_addOrders_cancel);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_1);
	}
}

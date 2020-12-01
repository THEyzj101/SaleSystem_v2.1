package GUI;

//import Bean.DBBean;
//import op.op;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

/**
 * 库存中，新增货物按钮按下后的弹窗
 */
public class windowsToCreateItemForManager extends JFrame {
    private JTextField textField_addItem_nameDisplay;
    private JTextField textField_addItem_numberDisplay;
    private JTextField textField_addItem_inpriceDisplay;
    private JTextField textField_addItem_outpriceDisplay;
    private windowsToCreateItemForManager a = this;

    public windowsToCreateItemForManager() {

    //public windowsToCreateItemForManager(JTable table, Vector<Vector<Object>> data, Vector<Object> name, JTextField out) {
        setTitle("新增入库商品");

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(30, 40, 0, 100));
        getContentPane().add(panel, BorderLayout.CENTER);
        GridBagLayout gbl_panel = new GridBagLayout();
        gbl_panel.columnWidths = new int[]{30, 100, 168, 0};
        gbl_panel.rowHeights = new int[]{40, 40, 40, 40, 40, 0};
        gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel.setLayout(gbl_panel);

        // 商品名称的label
        JLabel label_addItem_name = new JLabel("商品名称");
        label_addItem_name.setFont(new Font("微软雅黑", Font.BOLD, 15));
        label_addItem_name.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_addItem_name = new GridBagConstraints();
        gbc_label_addItem_name.fill = GridBagConstraints.BOTH;
        gbc_label_addItem_name.insets = new Insets(0, 0, 5, 5);
        gbc_label_addItem_name.gridx = 1;
        gbc_label_addItem_name.gridy = 0;
        panel.add(label_addItem_name, gbc_label_addItem_name);
        // 商品名称的TestField
        textField_addItem_nameDisplay = new JTextField();
        GridBagConstraints gbc_textField_addItem_nameDisplay = new GridBagConstraints();
        gbc_textField_addItem_nameDisplay.fill = GridBagConstraints.BOTH;
        gbc_textField_addItem_nameDisplay.insets = new Insets(0, 0, 5, 0);
        gbc_textField_addItem_nameDisplay.gridx = 2;
        gbc_textField_addItem_nameDisplay.gridy = 0;
        panel.add(textField_addItem_nameDisplay, gbc_textField_addItem_nameDisplay);
        textField_addItem_nameDisplay.setColumns(10);

        // 商品数量的label
        JLabel label_addItem_number = new JLabel("商品数量");
        label_addItem_number.setFont(new Font("微软雅黑", Font.BOLD, 15));
        label_addItem_number.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_addItem_number = new GridBagConstraints();
        gbc_label_addItem_number.fill = GridBagConstraints.BOTH;
        gbc_label_addItem_number.insets = new Insets(0, 0, 5, 5);
        gbc_label_addItem_number.gridx = 1;
        gbc_label_addItem_number.gridy = 1;
        panel.add(label_addItem_number, gbc_label_addItem_number);
        // 商品数量的Textfield
        textField_addItem_numberDisplay = new JTextField();
        GridBagConstraints gbc_textField_addItem_numberDisplay = new GridBagConstraints();
        gbc_textField_addItem_numberDisplay.fill = GridBagConstraints.BOTH;
        gbc_textField_addItem_numberDisplay.insets = new Insets(0, 0, 5, 0);
        gbc_textField_addItem_numberDisplay.gridx = 2;
        gbc_textField_addItem_numberDisplay.gridy = 1;
        panel.add(textField_addItem_numberDisplay, gbc_textField_addItem_numberDisplay);
        textField_addItem_numberDisplay.setColumns(10);

        // 商品单价的label
        JLabel label_addItem_inprice = new JLabel("商品单价");
        label_addItem_inprice.setFont(new Font("微软雅黑", Font.BOLD, 15));
        label_addItem_inprice.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_addItem_inprice = new GridBagConstraints();
        gbc_label_addItem_inprice.fill = GridBagConstraints.BOTH;
        gbc_label_addItem_inprice.insets = new Insets(0, 0, 5, 5);
        gbc_label_addItem_inprice.gridx = 1;
        gbc_label_addItem_inprice.gridy = 2;
        panel.add(label_addItem_inprice, gbc_label_addItem_inprice);
        // 商品单价的textfield
        textField_addItem_inpriceDisplay = new JTextField();
        GridBagConstraints gbc_textField_addItem_inpriceDisplay = new GridBagConstraints();
        gbc_textField_addItem_inpriceDisplay.fill = GridBagConstraints.BOTH;
        gbc_textField_addItem_inpriceDisplay.insets = new Insets(0, 0, 5, 0);
        gbc_textField_addItem_inpriceDisplay.gridx = 2;
        gbc_textField_addItem_inpriceDisplay.gridy = 2;
        panel.add(textField_addItem_inpriceDisplay, gbc_textField_addItem_inpriceDisplay);
        textField_addItem_inpriceDisplay.setColumns(10);

        // 商品售价的label
        JLabel label_addItem_outprice = new JLabel("商品售价");
        label_addItem_outprice.setFont(new Font("微软雅黑", Font.BOLD, 15));
        label_addItem_outprice.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_addItem_outprice = new GridBagConstraints();
        gbc_label_addItem_outprice.fill = GridBagConstraints.BOTH;
        gbc_label_addItem_outprice.insets = new Insets(0, 0, 5, 5);
        gbc_label_addItem_outprice.gridx = 1;
        gbc_label_addItem_outprice.gridy = 3;
        panel.add(label_addItem_outprice, gbc_label_addItem_outprice);
        // 商品售价的Textfield
        textField_addItem_outpriceDisplay = new JTextField();
        GridBagConstraints gbc_textField_addItem_outpriceDisplay = new GridBagConstraints();
        gbc_textField_addItem_outpriceDisplay.insets = new Insets(0, 0, 5, 0);
        gbc_textField_addItem_outpriceDisplay.fill = GridBagConstraints.BOTH;
        gbc_textField_addItem_outpriceDisplay.gridx = 2;
        gbc_textField_addItem_outpriceDisplay.gridy = 3;
        panel.add(textField_addItem_outpriceDisplay, gbc_textField_addItem_outpriceDisplay);
        textField_addItem_outpriceDisplay.setColumns(10);

        JLabel label_addItem_focusRepository = new JLabel("目的仓库");
        label_addItem_focusRepository.setFont(new Font("微软雅黑", Font.BOLD, 15));
        label_addItem_focusRepository.setHorizontalAlignment(SwingConstants.RIGHT);
        GridBagConstraints gbc_label_addItem_focusRepository = new GridBagConstraints();
        gbc_label_addItem_focusRepository.insets = new Insets(0, 0, 0, 5);
        gbc_label_addItem_focusRepository.gridx = 1;
        gbc_label_addItem_focusRepository.gridy = 4;
        panel.add(label_addItem_focusRepository, gbc_label_addItem_focusRepository);

        JComboBox comboBox__addItem_focusRepository = new JComboBox();
        GridBagConstraints gbc_comboBox__addItem_focusRepository = new GridBagConstraints();
        gbc_comboBox__addItem_focusRepository.fill = GridBagConstraints.HORIZONTAL;
        gbc_comboBox__addItem_focusRepository.gridx = 2;
        gbc_comboBox__addItem_focusRepository.gridy = 4;
        panel.add(comboBox__addItem_focusRepository, gbc_comboBox__addItem_focusRepository);

        Box horizontalBox = Box.createHorizontalBox();
        getContentPane().add(horizontalBox, BorderLayout.SOUTH);

        Component horizontalGlue_left = Box.createHorizontalGlue();
        horizontalBox.add(horizontalGlue_left);

        JButton button_addItem_confirm = new JButton("确 认");
        button_addItem_confirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//todo
				dispose();
			}
		});
        horizontalBox.add(button_addItem_confirm);

        Component rigidArea = Box.createRigidArea(new Dimension(100, 80));
        horizontalBox.add(rigidArea);

        JButton button_addItem_cancel = new JButton("取 消");
        button_addItem_cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
        horizontalBox.add(button_addItem_cancel);

        Component horizontalGlue_right = Box.createHorizontalGlue();
        horizontalBox.add(horizontalGlue_right);
    }

}

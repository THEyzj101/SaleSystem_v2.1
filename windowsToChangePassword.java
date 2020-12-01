package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import java.awt.Insets;
import javax.swing.Box;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 按钮“忘记密码？”触发的弹窗
 */
public class windowsToChangePassword extends JFrame{
	private JTextField textField_forgetPassword_IDDisplay;
	private JTextField textField_forgetPassword_phoneNumber;
	private JTextField textField_forgetPassword_newPasswordDisplay;
	public windowsToChangePassword() {
		setTitle("找回密码");
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(30, 30, 30, 30));
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {45, 100, 178, 0};
		gbl_panel.rowHeights = new int[]{30, 41, 41, 41, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel Label_forgetPassword_ID = new JLabel("用户名:  ");
		GridBagConstraints gbc_Label_forgetPassword_ID = new GridBagConstraints();
		gbc_Label_forgetPassword_ID.fill = GridBagConstraints.BOTH;
		gbc_Label_forgetPassword_ID.insets = new Insets(0, 0, 5, 5);
		gbc_Label_forgetPassword_ID.gridx = 1;
		gbc_Label_forgetPassword_ID.gridy = 1;
		panel.add(Label_forgetPassword_ID, gbc_Label_forgetPassword_ID);
		
		textField_forgetPassword_IDDisplay = new JTextField();
		GridBagConstraints gbc_textField_forgetPassword_IDDisplay = new GridBagConstraints();
		gbc_textField_forgetPassword_IDDisplay.fill = GridBagConstraints.BOTH;
		gbc_textField_forgetPassword_IDDisplay.insets = new Insets(0, 0, 5, 0);
		gbc_textField_forgetPassword_IDDisplay.gridx = 2;
		gbc_textField_forgetPassword_IDDisplay.gridy = 1;
		panel.add(textField_forgetPassword_IDDisplay, gbc_textField_forgetPassword_IDDisplay);
		textField_forgetPassword_IDDisplay.setColumns(10);
		
		JLabel Label_forgetPassword_phoneNumber = new JLabel("联系方式:  ");
		GridBagConstraints gbc_Label_forgetPassword_phoneNumber = new GridBagConstraints();
		gbc_Label_forgetPassword_phoneNumber.fill = GridBagConstraints.BOTH;
		gbc_Label_forgetPassword_phoneNumber.insets = new Insets(0, 0, 5, 5);
		gbc_Label_forgetPassword_phoneNumber.gridx = 1;
		gbc_Label_forgetPassword_phoneNumber.gridy = 2;
		panel.add(Label_forgetPassword_phoneNumber, gbc_Label_forgetPassword_phoneNumber);
		
		textField_forgetPassword_phoneNumber = new JTextField();
		GridBagConstraints gbc_textField_forgetPassword_phoneNumber = new GridBagConstraints();
		gbc_textField_forgetPassword_phoneNumber.fill = GridBagConstraints.BOTH;
		gbc_textField_forgetPassword_phoneNumber.insets = new Insets(0, 0, 5, 0);
		gbc_textField_forgetPassword_phoneNumber.gridx = 2;
		gbc_textField_forgetPassword_phoneNumber.gridy = 2;
		panel.add(textField_forgetPassword_phoneNumber, gbc_textField_forgetPassword_phoneNumber);
		textField_forgetPassword_phoneNumber.setColumns(10);
		
		JLabel Label_forgetPassword_newPassword = new JLabel("新密码:  ");
		GridBagConstraints gbc_Label_forgetPassword_newPassword = new GridBagConstraints();
		gbc_Label_forgetPassword_newPassword.fill = GridBagConstraints.BOTH;
		gbc_Label_forgetPassword_newPassword.insets = new Insets(0, 0, 0, 5);
		gbc_Label_forgetPassword_newPassword.gridx = 1;
		gbc_Label_forgetPassword_newPassword.gridy = 3;
		panel.add(Label_forgetPassword_newPassword, gbc_Label_forgetPassword_newPassword);
		
		textField_forgetPassword_newPasswordDisplay = new JTextField();
		GridBagConstraints gbc_textField_forgetPassword_newPasswordDisplay = new GridBagConstraints();
		gbc_textField_forgetPassword_newPasswordDisplay.fill = GridBagConstraints.BOTH;
		gbc_textField_forgetPassword_newPasswordDisplay.gridx = 2;
		gbc_textField_forgetPassword_newPasswordDisplay.gridy = 3;
		panel.add(textField_forgetPassword_newPasswordDisplay, gbc_textField_forgetPassword_newPasswordDisplay);
		textField_forgetPassword_newPasswordDisplay.setColumns(10);
		
		Box horizontalBox = Box.createHorizontalBox();
		getContentPane().add(horizontalBox, BorderLayout.SOUTH);
		
		Component horizontalStrut = Box.createHorizontalStrut(130);
		horizontalBox.add(horizontalStrut);
		
		JButton Button_forgetPassword_save = new JButton("确   定");
		Button_forgetPassword_save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//update database

				//close window
				dispose();
			}
		});
		horizontalBox.add(Button_forgetPassword_save);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(50);
		horizontalBox.add(horizontalStrut_1);
		
		JButton Button_forgetPassword_cancel = new JButton("取   消");
		Button_forgetPassword_cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { dispose(); }
		});
		horizontalBox.add(Button_forgetPassword_cancel);
		
		Component verticalStrut = Box.createVerticalStrut(60);
		horizontalBox.add(verticalStrut);
	}
	
}

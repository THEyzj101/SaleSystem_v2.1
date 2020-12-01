package GUI;

//import Bean.DBBean;
//import op.returnVector;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windowsToChangeCustomerInfo extends JFrame {
    private JTextField textField_createCustomer_nameDisplay;
    private JTextField textField_createCustomer_phoneNumberDisplay;
    public windowsToChangeCustomerInfo a = this;

    private JLabel label_createCustomer_kindOfCustomer;
    private JLabel label_createCustomer_name;
    private JLabel label_createCustomer_phoneNumber;
    private JButton button_createCustomer_save;
    private JButton button_createCustomer_cancel;
    private JRadioButton radioButton_createCustomer_retail;
    private JRadioButton radioButton_createCustomer_wholesale;

    public windowsToChangeCustomerInfo(){
    //public windowsToCreateCustomer(DBBean db, JTable table) {
        getContentPane().setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(20, 40, 0, 40));
        getContentPane().add(panel);
        GridBagLayout gbl_panel = new GridBagLayout();
        gbl_panel.columnWidths = new int[] {40, 100, 178, 0};
        gbl_panel.rowHeights = new int[] {30, 40, 40, 24, 0};
        gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
        gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel.setLayout(gbl_panel);


        /***客户姓名输入***/
        // 客户姓名标签
        label_createCustomer_name = new JLabel("客户姓名");
        label_createCustomer_name.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_createCustomer_Name = new GridBagConstraints();
        gbc_label_createCustomer_Name.fill = GridBagConstraints.BOTH;
        gbc_label_createCustomer_Name.insets = new Insets(0, 0, 5, 5);
        gbc_label_createCustomer_Name.gridx = 1;
        gbc_label_createCustomer_Name.gridy = 1;
        panel.add(label_createCustomer_name, gbc_label_createCustomer_Name);

        // 客户姓名输入框
        textField_createCustomer_nameDisplay = new JTextField();
        GridBagConstraints gbc_textField_createCustomer_NameDisplay = new GridBagConstraints();
        gbc_textField_createCustomer_NameDisplay.fill = GridBagConstraints.BOTH;
        gbc_textField_createCustomer_NameDisplay.insets = new Insets(0, 0, 5, 0);
        gbc_textField_createCustomer_NameDisplay.gridx = 2;
        gbc_textField_createCustomer_NameDisplay.gridy = 1;
        panel.add(textField_createCustomer_nameDisplay, gbc_textField_createCustomer_NameDisplay);
        textField_createCustomer_nameDisplay.setColumns(10);

        /***客户联系方式输入***/
        // 客户联系方式标签
        label_createCustomer_phoneNumber = new JLabel("联系方式");
        label_createCustomer_phoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_createCustomer_phoneNumber = new GridBagConstraints();
        gbc_label_createCustomer_phoneNumber.fill = GridBagConstraints.BOTH;
        gbc_label_createCustomer_phoneNumber.insets = new Insets(0, 0, 5, 5);
        gbc_label_createCustomer_phoneNumber.gridx = 1;
        gbc_label_createCustomer_phoneNumber.gridy = 2;
        panel.add(label_createCustomer_phoneNumber, gbc_label_createCustomer_phoneNumber);
        
        // 客户联系方式输入框
        textField_createCustomer_phoneNumberDisplay = new JTextField();
        GridBagConstraints gbc_textField_createCustomer_phoneNumberDisplay = new GridBagConstraints();
        gbc_textField_createCustomer_phoneNumberDisplay.fill = GridBagConstraints.BOTH;
        gbc_textField_createCustomer_phoneNumberDisplay.insets = new Insets(0, 0, 5, 0);
        gbc_textField_createCustomer_phoneNumberDisplay.gridx = 2;
        gbc_textField_createCustomer_phoneNumberDisplay.gridy = 2;
        panel.add(textField_createCustomer_phoneNumberDisplay, gbc_textField_createCustomer_phoneNumberDisplay);
        textField_createCustomer_phoneNumberDisplay.setColumns(10);

        /***客户类型单选组***/
        label_createCustomer_kindOfCustomer = new JLabel("客户类型");
        label_createCustomer_kindOfCustomer.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_createCustomer_kindOfCustomer = new GridBagConstraints();
        gbc_label_createCustomer_kindOfCustomer.fill = GridBagConstraints.BOTH;
        gbc_label_createCustomer_kindOfCustomer.insets = new Insets(0, 0, 0, 5);
        gbc_label_createCustomer_kindOfCustomer.gridx = 1;
        gbc_label_createCustomer_kindOfCustomer.gridy = 3;
        panel.add(label_createCustomer_kindOfCustomer, gbc_label_createCustomer_kindOfCustomer);
        
        Box horizontalRadioButtonBox = Box.createHorizontalBox();
        GridBagConstraints gbc_horizontalRadioButtonBox = new GridBagConstraints();
        gbc_horizontalRadioButtonBox.fill = GridBagConstraints.BOTH;
        gbc_horizontalRadioButtonBox.gridx = 2;
        gbc_horizontalRadioButtonBox.gridy = 3;
        panel.add(horizontalRadioButtonBox, gbc_horizontalRadioButtonBox);
        
        radioButton_createCustomer_retail = new JRadioButton("零  售");
        horizontalRadioButtonBox.add(radioButton_createCustomer_retail);
        radioButton_createCustomer_wholesale = new JRadioButton("批  发");
        horizontalRadioButtonBox.add(radioButton_createCustomer_wholesale);
        
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton_createCustomer_retail);
        group.add(radioButton_createCustomer_wholesale);
        
        Box horizontalBox = Box.createHorizontalBox();
        getContentPane().add(horizontalBox, BorderLayout.SOUTH);
        
        Component horizontalGlue_left = Box.createHorizontalGlue();
        horizontalBox.add(horizontalGlue_left);
        
        button_createCustomer_save = new JButton("保  存");
        button_createCustomer_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //todo
                //更新数据库
                //检索是否填写了客户类型，没填->弹窗提醒
                dispose();
            }
        });
        horizontalBox.add(button_createCustomer_save);
        
        Component rigidArea = Box.createRigidArea(new Dimension(30, 90));
        horizontalBox.add(rigidArea);
        
        button_createCustomer_cancel = new JButton("取  消");
        button_createCustomer_cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { dispose(); }
        });
        horizontalBox.add(button_createCustomer_cancel);
        
        Component horizontalGlue_right = Box.createHorizontalGlue();
        horizontalBox.add(horizontalGlue_right);
    }

}

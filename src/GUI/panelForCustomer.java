package GUI;

import javax.swing.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class panelForCustomer extends JPanel {
    private Box box_top;
    private JTextField textField;
    private MyJPanel myPanel;
    private JButton Button_customer_add;
    private JButton button_customer_search;
    private JButton button_customer_change;
    private JButton button_customer_delete;
    private windowsToCreateCustomer winToCreateCustomer;

    /**
     * 针对店员权限的销售面板
     * 功能:对于客户信息,仅能实现添加和查询功能
     * @param employee
     */
    public panelForCustomer(Employee employee){

    	Box horizontalBox = Box.createHorizontalBox();
    	Box horizontalBox_add = Box.createHorizontalBox();
    	Box verticalBox = Box.createVerticalBox();
    	add(verticalBox);

    	Button_customer_add = new JButton("+ 新增客户");
    	Button_customer_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //todo
                //弹窗——新建客户信息
                winToCreateCustomer = new windowsToCreateCustomer();
                winToCreateCustomer.setVisible(true);
                winToCreateCustomer.setBounds(470,170,400,300);
                winToCreateCustomer.setResizable(false);

            }
        });
    	horizontalBox_add.add(Button_customer_add);

    	JLabel Label_customer_customerSearchTitle = new JLabel("客户名称:   ");
    	horizontalBox.add(Label_customer_customerSearchTitle);
    	
    	textField = new JTextField();
    	horizontalBox.add(textField);
    	textField.setColumns(10);

        button_customer_search = new JButton("查  询");
    	horizontalBox.add(button_customer_search);
        //box_top = Box.createHorizontalBox();

        verticalBox.add(horizontalBox);
        verticalBox.add(horizontalBox_add);
        Vector<Object> name_customer = new Vector<>();
        /**
         *缺少关联数据库操作
         */
        /**
         * test code
         */
        name_customer.add("ID");
        name_customer.add("Name");
        name_customer.add("PhoneNumber");
        name_customer.add("address");
        myPanel = new MyJPanel(verticalBox,name_customer,99);
        this.add(myPanel);
    }

    /**
     * 针对店长和经理权限的顾客信息面板
     * 功能:实现了客户信息的增删改查
     */

    public panelForCustomer(){

        Box horizontalBox = Box.createHorizontalBox();
        Box horizontalBox_add = Box.createHorizontalBox();
        Box verticalBox = Box.createVerticalBox();
        add(verticalBox);

        Button_customer_add = new JButton("+ 新增客户");
        Button_customer_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Todu
            }
        });
        horizontalBox_add.add(Button_customer_add);

        JLabel Label_customer_customerSearchTitle = new JLabel("客户名称:   ");
        horizontalBox.add(Label_customer_customerSearchTitle);

        textField = new JTextField();
        horizontalBox.add(textField);
        textField.setColumns(10);

        button_customer_search = new JButton("查  询");
        button_customer_search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Todu
            }
        });

        button_customer_change = new JButton("修  改");
        button_customer_change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //弹窗
            }
        });

        button_customer_delete = new JButton("删  除");
        button_customer_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        horizontalBox.add(button_customer_search);
        horizontalBox.add(button_customer_change);
        horizontalBox.add(button_customer_delete);
        //box_top = Box.createHorizontalBox();

        verticalBox.add(horizontalBox);
        verticalBox.add(horizontalBox_add);
        Vector<Object> name_customer = new Vector<>();
        /**
         *缺少关联数据库操作
         */
        /**
         * test code
         */
        name_customer.add("ID");
        name_customer.add("Name");
        name_customer.add("PhoneNumber");
        name_customer.add("address");
        myPanel = new MyJPanel(verticalBox,name_customer,99);
        this.add(myPanel);
    }
}

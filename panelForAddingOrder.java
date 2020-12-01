package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.Dialog.ModalExclusionType;

/**
 * 本页面为”开销售单“页面
 */
public class panelForAddingOrder extends JPanel {
    private JButton button_addOrder_add;
    private JButton button_addOrder_search;
    private JButton button_addOrder_save;
    private JLabel label_addOrder_SearchTitle;
    private JLabel label_addOrder_totalPriceTitle;
    private JLabel label_addOrder_totalPriceSuffixes;
    private JLabel label_addOrder_foundCustomerTitle;
    private JLabel label_addOrder_kindOfCustomer;
    private JTextField textField_addOrder_searchDisplay;
    private JTextField textField_addOrder_totalPriceDisplay;
    private JTextField textField_addOrder_foundCustomerDisplay;
    private JTextField textField_addOrder_kindOfCustomer;
    private Component horizontalStrut;

    /**
     * 针对销售、店长权限开放的“开销售单”界面
     */
    public panelForAddingOrder(){

        this.setLayout(new BorderLayout());
        /**初始化各类组件**/
        /**顶部组件**/
        Box verticalBox_Top = Box.createVerticalBox();
        Box verticalBox_Bottom = Box.createVerticalBox();
        Box horizontalBox_Top_up = Box.createHorizontalBox();
        Box horizontalBox_Top_down = Box.createHorizontalBox();
        Box horizontalBox_Bottom_up = Box.createHorizontalBox();
        Box horizontalBox_Bottom_down = Box.createHorizontalBox();
        label_addOrder_SearchTitle = new JLabel("查找客户:   ");
        textField_addOrder_searchDisplay = new JTextField();
        button_addOrder_search = new JButton("搜 索");
        button_addOrder_search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        label_addOrder_foundCustomerTitle = new JLabel("查找到的客户:   ");
        textField_addOrder_foundCustomerDisplay = new JTextField();
        textField_addOrder_foundCustomerDisplay.setEditable(false);
        label_addOrder_kindOfCustomer = new JLabel("客户类型:   ");
        textField_addOrder_kindOfCustomer = new JTextField();
        textField_addOrder_kindOfCustomer.setEditable(false);

        /**底部组件**/
        button_addOrder_add = new JButton("+ 新增订单 ");
        button_addOrder_add.setHorizontalAlignment(SwingConstants.LEADING);

        button_addOrder_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**---todo----**/
                //弹窗
                windowsToCreateOrder winToCreateOrder = new windowsToCreateOrder();
                winToCreateOrder.setVisible(true);
                winToCreateOrder.setBounds(470,170,450,300);
                winToCreateOrder.setResizable(false);
          }
    });
        label_addOrder_totalPriceTitle = new JLabel("合计:  ");
        textField_addOrder_totalPriceDisplay = new JTextField();
        textField_addOrder_totalPriceDisplay.setEditable(false);
        label_addOrder_totalPriceSuffixes = new JLabel("元");
        button_addOrder_save = new JButton("保存");
        button_addOrder_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**---todo----**/
            }
        });


        /**向顶部水平Box添加组件**/
        horizontalBox_Top_up.add(label_addOrder_SearchTitle);
        horizontalBox_Top_up.add(textField_addOrder_searchDisplay);
        horizontalBox_Top_up.add(button_addOrder_search);

        horizontalBox_Top_down.add(label_addOrder_foundCustomerTitle);
        horizontalBox_Top_down.add(textField_addOrder_foundCustomerDisplay);
        horizontalBox_Top_down.add(label_addOrder_kindOfCustomer);
        horizontalBox_Top_down.add(textField_addOrder_kindOfCustomer);

        /**向顶部垂直Box中添加水平Box组件**/
        verticalBox_Top.add(horizontalBox_Top_up);
        verticalBox_Top.add(horizontalBox_Top_down);

        /**向低部水平Box中添加组件**/
        horizontalBox_Bottom_up.add(button_addOrder_add);
        horizontalBox_Bottom_down.add(label_addOrder_totalPriceTitle);
        horizontalBox_Bottom_down.add(textField_addOrder_totalPriceDisplay);
        horizontalBox_Bottom_down.add(label_addOrder_totalPriceSuffixes);
        
        horizontalStrut = Box.createHorizontalStrut(260);
        horizontalBox_Bottom_down.add(horizontalStrut);
        horizontalBox_Bottom_down.add(button_addOrder_save);

        /**向垂直Box中添加水平Box组件**/
        verticalBox_Bottom.add(horizontalBox_Bottom_up);
        verticalBox_Bottom.add(horizontalBox_Bottom_down);

        /**使用MyJPanel类构造页面**/
        Vector<Object> name_order = new Vector<>();
        /*
        缺少代码
         */
        /**
         * testcode
         */
        name_order.add("Id");
        name_order.add("Price");
        name_order.add("number");
        name_order.add("total");
        MyJPanel myJPanel_addingOrder = new MyJPanel(verticalBox_Top,name_order,99,verticalBox_Bottom);
        this.add(myJPanel_addingOrder);
    }



}

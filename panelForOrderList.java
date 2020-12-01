package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

/**
 * 本页面为“订单列表”页面
 */
public class panelForOrderList extends JPanel {
    private panelForOrderList show = this;
    private MyJPanel myJPanel_allOrderData;
    private JButton button_orderList_delete;
    private JButton button_orderList_Search;
    /**
     * 针对销售权限开放的“订单列表”页面
     * 功能：查看订单列表
     * @param employee
     */
    panelForOrderList(Employee employee){
        Vector<Object> data_allOrder = new Vector<>();
        //待补全//

        myJPanel_allOrderData = new MyJPanel(data_allOrder,99);
        this.add(myJPanel_allOrderData);
    }

    /**
     * 针对销售权限开放的“订单列表”页面
     * 功能：查看、删除、查询订单列表
     */
    panelForOrderList(){
        Vector<Object> data_allOrder = new Vector<>();
        //待补全//

        Box horizontalBox = Box.createHorizontalBox();
        JLabel label_orderList_orderSearchTitle = new JLabel("订单号:   ");
        JTextField textField_orderList_orderSearchDisplay = new JTextField();

        JButton button_orderList_Search = new JButton("查   询");
        button_orderList_Search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button_orderList_delete.setEnabled(true);
            }
        });

        button_orderList_delete = new JButton("删   除");
        button_orderList_delete.setEnabled(false);
        button_orderList_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button_orderList_delete.setEnabled(false);

            }
        });
        horizontalBox.add(label_orderList_orderSearchTitle);
        horizontalBox.add(textField_orderList_orderSearchDisplay);
        horizontalBox.add(button_orderList_Search);
        horizontalBox.add(button_orderList_delete);

        myJPanel_allOrderData = new MyJPanel(horizontalBox,data_allOrder,99);
        this.add(myJPanel_allOrderData);
    }
}

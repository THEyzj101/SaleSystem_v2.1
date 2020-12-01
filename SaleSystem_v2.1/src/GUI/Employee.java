package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * 销售员GUI
 */
public class Employee extends JFrame {
    private JTabbedPane tabbedPane_all;
    private JTabbedPane tabbedPane_sell;
    private MyJPanel myJPanel_product;
    //private MyJPanel myJPanel_allOrderData;
    private Employee show = this;
    //private JPanel contentPane  = new JPanel();
    private JPanel panel_sell;
    private panelForCustomer panel_customer;
    private panelForAddingOrder panel_addingOrder;
    private panelForCashiering panel_cashiering;
    private panelForOrderList panel_orderList;
    private panelForPersonalAccount panel_personalAccount;
    public Employee(){
        tabbedPane_all = new JTabbedPane();
        show.add(tabbedPane_all);

        /***货品Panel***/
        Vector<Object> name_product = new Vector<>();
        name_product.add("ID");
        name_product.add("Name");
        name_product.add("Outpirce");
        myJPanel_product = new MyJPanel(name_product,99);
        tabbedPane_all.add(myJPanel_product);
        tabbedPane_all.addTab("货品",myJPanel_product);

        /***客户Panel***/
        panel_customer = new panelForCustomer(this);
        tabbedPane_all.add(panel_customer);
        tabbedPane_all.add("客户",panel_customer);

        /***销售Panel***/
        panel_sell = new JPanel();
        panel_sell.setLayout(new BorderLayout());
        tabbedPane_all.add(panel_sell,SwingConstants.NORTH);
        tabbedPane_all.addTab("销售",panel_sell);
        tabbedPane_sell = new JTabbedPane();
        panel_sell.add(tabbedPane_sell);

        /***开销售单secondPanel***/
        panel_addingOrder = new panelForAddingOrder();
        tabbedPane_sell.add(panel_addingOrder);
        tabbedPane_sell.addTab("开销售单",panel_addingOrder);

        /***收银secondPanel***/
        panel_cashiering = new panelForCashiering();
        tabbedPane_sell.add(panel_cashiering);
        tabbedPane_sell.addTab("收银",panel_cashiering);

        /***查看订单列表secondPanel***/
        panel_orderList = new panelForOrderList(this);
        tabbedPane_sell.add(panel_orderList);
        tabbedPane_sell.addTab("订单列表",panel_orderList);

        /***个人账户***/
        panel_personalAccount = new panelForPersonalAccount();
        tabbedPane_all.add(panel_personalAccount);
        tabbedPane_all.addTab("个人账户",panel_personalAccount);
    }
}

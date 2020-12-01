package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * 经理GUI
 */
public class Manager extends JFrame {
    private Manager show = this;

    private JTabbedPane tabbedPane_all;
    private JTabbedPane tabbedPane_stock;

    private JPanel panel_stock;
    private JPanel panel_translation;
    private MyJPanel myJPanel_product;

    private panelForCustomer panel_customer;
    private panelForOrderList panel_orderList;
    private panelForRestoring panel_restoring;
    private panelForCheckingStock panel_checkStock;
    private panelForAccount panel_account;
    private panelForPersonalAccount panel_personalAccount;

    public Manager(){
        tabbedPane_all = new JTabbedPane();
        show.getContentPane().add(tabbedPane_all);

        /***货品Panel***/
        Vector<Object> name_product = new Vector<>();
        name_product.add("ID");
        name_product.add("Name");
        name_product.add("Outpirce");
        myJPanel_product = new MyJPanel(name_product,99);
        tabbedPane_all.add(myJPanel_product);
        tabbedPane_all.addTab("货品",myJPanel_product);

        /***客户Panel***/
        panel_customer = new panelForCustomer();
        tabbedPane_all.add(panel_customer);
        tabbedPane_all.add("客户",panel_customer);

        /***账单Panel***/
        panel_orderList = new panelForOrderList();
        tabbedPane_all.add(panel_orderList);
        tabbedPane_all.addTab("订单列表",panel_orderList);

        /***库存Panel***/
        panel_stock = new JPanel();
        panel_stock.setLayout(new BorderLayout());
        tabbedPane_all.add(panel_stock);
        tabbedPane_all.addTab("库存",panel_stock);
        tabbedPane_stock = new JTabbedPane();
        panel_stock.add(tabbedPane_stock);

        /***进货secondPanel***/
        panel_restoring = new panelForRestoring();
        tabbedPane_stock.add(panel_restoring);
        tabbedPane_stock.addTab("进货",panel_restoring);

        /***清点库存secondPanel***/
        panel_checkStock = new panelForCheckingStock(this);
        tabbedPane_stock.add(panel_checkStock);
        tabbedPane_stock.addTab("清点库存",panel_checkStock);

        /***货品调配secondPanel***/
        panel_translation = new JPanel();
        tabbedPane_stock.add(panel_translation);
        tabbedPane_stock.addTab("货品调配",panel_translation);

        /***账户Panel***/
        panel_account = new panelForAccount(this);
        tabbedPane_all.add(panel_account);
        tabbedPane_all.addTab("账户",panel_account);

        /***个人账户Panel***/
        panel_personalAccount = new panelForPersonalAccount();
        tabbedPane_all.add(panel_personalAccount);
        tabbedPane_all.addTab("个人账户",panel_personalAccount);
    }
}

package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * 店长类构造GUI
 */
public class Shopkeeper extends JFrame{
    private Shopkeeper show = this;

    private JTabbedPane tabbedPane_all;
    private JTabbedPane tabbedPane_sell;
    private JTabbedPane tabbedPane_stock;
    private MyJPanel myJPanel_product;
    //private MyJPanel myJPanel_allOrderData;
    private MyJPanel myJPanel_unchecked;
    private MyJPanel myJPanel_unpaid;
    private MyJPanel myJPanel_finished;
    private MyJPanel myJPanel_returning;
    private MyJPanel myJPanel_returned;


    //private JPanel contentPane  = new JPanel();
    private JPanel panel_sell;
    private JPanel panel_stock;
    private panelForCustomer panel_customer;
    private panelForAddingOrder panel_addingOrder;
    private panelForCashiering panel_cashiering;
    private panelForPersonalAccount panel_personalAccount;
    private panelForOrderList panel_orderList;
    private panelForRestoring panel_restoring;
    private panelForCheckingStock panel_checkStock;
    private panelForAccount panel_account;
    private JButton button_unchecked_confirm;
    private JButton button_unpaid_confirm;
    private JButton button_finished_confirm;
    private JButton button_returning_confirm;
    private JButton button_returned_confirm;

    /**
     * 店长类构造GUI
     */
    public Shopkeeper(){
        tabbedPane_all = new JTabbedPane();
        show.getContentPane().add(tabbedPane_all);

        /***货品Panel***/
        Vector<Object> name_product = new Vector<>();
        name_product.add("ID");
        name_product.add("Name");
        name_product.add("Outprice");
        myJPanel_product = new MyJPanel(name_product,99);
        tabbedPane_all.add(myJPanel_product);
        tabbedPane_all.addTab("货品",myJPanel_product);

        /***客户Panel***/
        panel_customer = new panelForCustomer();
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

        /***待审核列表secondPanel***/
        Vector<Object> name_unchecked = new Vector<>();
        /**
         * 代码空缺
         */
        /**
         * testcode
         */
        name_unchecked.add("ID");
        name_unchecked.add("name");
        name_unchecked.add("Price");
        Box horizontalBox_unchecked = Box.createHorizontalBox();
        button_unchecked_confirm = new JButton("确   认");
        horizontalBox_unchecked.add(button_unchecked_confirm);
        myJPanel_unchecked = new MyJPanel(name_unchecked,99,horizontalBox_unchecked);
        tabbedPane_sell.add(myJPanel_unchecked);
        tabbedPane_sell.addTab("待审核",myJPanel_unchecked);

        /***待付款列表secondPanel***/
        Vector<Object> name_unpaid = new Vector<>();
        Box horizontalBox_unpaid = Box.createHorizontalBox();
        button_unpaid_confirm = new JButton("确   认");
        horizontalBox_unpaid.add(button_unpaid_confirm);
        myJPanel_unpaid = new MyJPanel(name_unpaid,99,horizontalBox_unpaid);
        tabbedPane_sell.add(myJPanel_unpaid);
        tabbedPane_sell.addTab("待付款",myJPanel_unpaid);

        /***已完成列表secondPanel***/
        Vector<Object> name_finished = new Vector<>();
        Box horizontalBox_finished = Box.createHorizontalBox();
        button_finished_confirm = new JButton("确   认");
        horizontalBox_finished.add(button_finished_confirm);
        myJPanel_finished = new MyJPanel(name_finished,99,horizontalBox_finished);
        tabbedPane_sell.add(myJPanel_finished);
        tabbedPane_sell.addTab("已完成",myJPanel_finished);

        /***待退货列表secondPanel***/
        Vector<Object> name_returning = new Vector<>();
        Box horizontalBox_returning = Box.createHorizontalBox();
        button_returning_confirm = new JButton("确   认");
        horizontalBox_returning.add(button_returning_confirm);
        myJPanel_returning = new MyJPanel(name_returning,99,horizontalBox_returning);
        tabbedPane_sell.add(myJPanel_returning);
        tabbedPane_sell.addTab("待退货",myJPanel_returning);

        /***已退货列表secondPanel***/
        Vector<Object> name_returned = new Vector<>();
        Box horizontalBox_returned = Box.createHorizontalBox();
        button_returned_confirm = new JButton("确   认");
        horizontalBox_returned.add(button_returned_confirm);
        myJPanel_returned = new MyJPanel(name_returned,99,horizontalBox_returned);
        tabbedPane_sell.add(myJPanel_returned);
        tabbedPane_sell.addTab("已退货",myJPanel_returned);

        /***查看订单列表secondPanel***/
        panel_orderList = new panelForOrderList();
        tabbedPane_sell.add(panel_orderList);
        tabbedPane_sell.addTab("订单列表",panel_orderList);

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

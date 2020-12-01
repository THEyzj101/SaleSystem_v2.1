package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

/**
 * 本页面为”账户“页面
 */
public class panelForAccount extends JPanel {
    private JLabel label_account_searchTitle;
    private JTextField textField_account_searchDiaplay;
    private JButton button_account_search;
    private JButton button_account_add;
    private JButton button_account_change;
    private JButton button_account_delete;
    private MyJPanel myJPanel;

    /**
     * 针对店长权限开放的账户页面
     * 功能：查询员工账户
     * @param shopkeeper
     */
    public panelForAccount(Shopkeeper shopkeeper){
        /*********初始化所有组件************/
        Box horizontalBox = Box.createHorizontalBox();
        label_account_searchTitle = new JLabel("员工名字/ID");
        textField_account_searchDiaplay = new JTextField();
        button_account_search = new JButton("搜   索");
        button_account_search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        /*********组装组件************/
        horizontalBox.add(label_account_searchTitle);
        horizontalBox.add(textField_account_searchDiaplay);
        horizontalBox.add(Box.createHorizontalStrut(100));
        horizontalBox.add(button_account_search);

        /************组装页面**************/
        Vector<Object> name_employee = new Vector<>();
        myJPanel = new MyJPanel(horizontalBox,name_employee,99);
        this.add(myJPanel);

    }

    /**
     * 针对经理权限开放的账户页面
     * 功能：增加、删除、修改、查询员工账户
     * @param manager
     */
    public panelForAccount(Manager manager){
        /*********初始化所有组件************/
        Box verticalBox = Box.createVerticalBox();
        Box horizontalBox_up = Box.createHorizontalBox();
        Box horizontalBox_down = Box.createHorizontalBox();
        label_account_searchTitle = new JLabel("员工名字/ID");
        textField_account_searchDiaplay = new JTextField();
        button_account_search = new JButton("搜   索");
        button_account_search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button_account_change = new JButton(("修   改"));
        button_account_change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button_account_delete = new JButton("删   除");
        button_account_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button_account_add = new JButton("+ 新增员工账户");
        button_account_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        /*********组装组件************/
        verticalBox.add(horizontalBox_up);
        verticalBox.add(horizontalBox_down);
        horizontalBox_up.add(label_account_searchTitle);
        horizontalBox_up.add(textField_account_searchDiaplay);
        horizontalBox_up.add(button_account_search);
        horizontalBox_up.add(button_account_change);
        horizontalBox_up.add(button_account_delete);
        horizontalBox_down.add(button_account_add);

        /************组装页面**************/
        Vector<Object> name_employee = new Vector<>();
        myJPanel = new MyJPanel(verticalBox,name_employee,99);
        this.add(myJPanel);
    }
}

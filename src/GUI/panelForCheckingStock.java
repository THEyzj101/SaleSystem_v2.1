package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

/**
 * 本页面为“库存清点”页面
 */
public class panelForCheckingStock extends JPanel {
    private JLabel label_checkStock_searchTitle;
    private JTextField textField_checkStock_searchDisplay;
    private JButton button_checkStock_search;
    private JButton button_checkStock_change;
    private JButton button_checkStock_delete;
    private JComboBox comboBox_checkStock_chooseStock;
    private MyJPanel myJPanel;

    /**
     * 针对经理级别权限开放的库存清点
     * 功能：搜索、修改、删除货物数据
     * @param shopkeeper
     */
    public panelForCheckingStock(Shopkeeper shopkeeper){
        /*********初始化所有组件************/
        Box horizontalBox = Box.createHorizontalBox();
        label_checkStock_searchTitle = new JLabel("货品名称");
        textField_checkStock_searchDisplay = new JTextField();
        button_checkStock_search = new JButton("搜  索");
        button_checkStock_search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button_checkStock_change = new JButton("修  改");
        button_checkStock_change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button_checkStock_delete = new JButton("删  除");
        button_checkStock_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        /*********组装组件************/
        horizontalBox.add(label_checkStock_searchTitle);
        horizontalBox.add(textField_checkStock_searchDisplay);
        horizontalBox.add(button_checkStock_search);
        horizontalBox.add(button_checkStock_change);
        horizontalBox.add(button_checkStock_delete);

        /************组装页面**************/
        Vector<Object> name_checkStock = new Vector<>();
        myJPanel = new MyJPanel(horizontalBox,name_checkStock,99);
        this.add(myJPanel);
    }

    /**
     * 针对经理级别权限开放的库存清点
     * 功能：搜索、修改、删除货物数据
     * 功能：按仓库类别清点库存
     * @param manager
     */
    public panelForCheckingStock(Manager manager){
        /*********初始化所有组件************/
        Box verticalBox = Box.createVerticalBox();
        Box horizontalBox_up = Box.createHorizontalBox();
        Box horizontalBox_down = Box.createHorizontalBox();
        comboBox_checkStock_chooseStock = new JComboBox();
        /*增加菜单项，todo*/
        label_checkStock_searchTitle = new JLabel("货品名称");
        textField_checkStock_searchDisplay = new JTextField();
        button_checkStock_search = new JButton("搜  索");
        button_checkStock_search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button_checkStock_change = new JButton("修  改");
        button_checkStock_change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button_checkStock_delete = new JButton("删  除");
        button_checkStock_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        /*********组装组件************/
        verticalBox.add(horizontalBox_up);
        verticalBox.add(horizontalBox_down);
        horizontalBox_up.add(comboBox_checkStock_chooseStock);
        horizontalBox_down.add(label_checkStock_searchTitle);
        horizontalBox_down.add(textField_checkStock_searchDisplay);
        horizontalBox_down.add(button_checkStock_search);
        horizontalBox_down.add(button_checkStock_change);
        horizontalBox_down.add(button_checkStock_delete);

        /************组装页面**************/
        Vector<Object> name_checkStock = new Vector<>();
        myJPanel = new MyJPanel(verticalBox,name_checkStock,99);
        this.add(myJPanel);
    }
}

package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

/**
 * 本页面为“进货”页面
 */
public class panelForRestoring extends JPanel {
    private JLabel label_restore_totalBuyingPriceTitle;
    private JLabel label_restore_totalBuyingPriceSuffixes;
    private JTextField textField_restore_totalBuyingPriceDisplay;
    private JButton button_restore_add;
    private JButton button_restore_save;
    private MyJPanel myJPanel;

    /**
     * 针对经理、店长权限开放的”进货“页面
     */
    public panelForRestoring(){
        /*********初始化所有组件************/
        Box verticalBox = Box.createVerticalBox();
        Box horizontalBox_up = Box.createHorizontalBox();
        Box horizontalBox_down = Box.createHorizontalBox();
        label_restore_totalBuyingPriceTitle = new JLabel("合计:   ");
        label_restore_totalBuyingPriceSuffixes = new JLabel("元");
        textField_restore_totalBuyingPriceDisplay = new JTextField();
        button_restore_add = new JButton("+ 新增货物");
        button_restore_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                windowsToCreateItemForManager winToCreateItemForManager = new windowsToCreateItemForManager();
                winToCreateItemForManager.setVisible(true);
                winToCreateItemForManager.setBounds(470,170,400,350);
                winToCreateItemForManager.setResizable(false);

            }
        });

        button_restore_save = new JButton("保  存");
        button_restore_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        /*********组装组件************/
        horizontalBox_up.add(button_restore_add);
        horizontalBox_down.add(label_restore_totalBuyingPriceTitle);
        horizontalBox_down.add(textField_restore_totalBuyingPriceDisplay);
        horizontalBox_down.add(label_restore_totalBuyingPriceSuffixes);
        horizontalBox_down.add(Box.createHorizontalStrut(240));
        horizontalBox_down.add(button_restore_save);

        verticalBox.add(horizontalBox_up);
        verticalBox.add(horizontalBox_down);


        /************组装页面**************/
        Vector<Object> name_incoming = new Vector<>();
        myJPanel = new MyJPanel(name_incoming,99,verticalBox);
        this.add(myJPanel);
    }
}

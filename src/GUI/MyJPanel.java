package GUI;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class MyJPanel extends JPanel{

    private MyJPanel show = this;
    //private Box box_up;

    private JScrollPane ScrollPane;
    private JTable table;
    private DefaultTableModel model;
    private Vector<Object> name;
    private int changeline;

    //private Box box_down;


    /**
     * 新建一个MyPanel，形式为：头顶的box，中间的table，下面的box
     * 当box为空时，不添加
     * 设置表格的表头，并将有关组件关联
     * @param up 头顶的box
     * @param name 表头信息
     * @param changeLine 第几行可改
     * @param down 脚底的box
     */
    public MyJPanel(Box up, Vector<Object> name, int changeLine, Box down) {
        super();
        // 设置大小布局
        this.setSize(500, 500);
        this.setLayout(new BorderLayout(0, 0));
        // 添加上面的box
        this.add(up, BorderLayout.NORTH);


        // 添加中间的table
        // 添加ScrollPane
        this.ScrollPane = new JScrollPane();
        this.ScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        // 将滑动table放到panel中
        this.add(ScrollPane, BorderLayout.CENTER);
        // 新建tablemodel，并设置表名、内容，
        this.name = name;
        this.changeline = changeLine;
        this.model = new DefaultTableModel_noEditable(new Vector<>(), this.name, this.changeline);
        // 新建table并于tablemodel相关联
        this.table = new JTable();
        this.table.setModel(this.model);
        // 在ScollPane中显示Table
        this.ScrollPane.setViewportView(this.table);

        // 添加下面的box
        this.add(down,BorderLayout.SOUTH);
    }

    /**
     * 新建一个MyPanel，形式为：中间的table,下方的box,无上方的box
     * 当box为空时，不添加
     * 设置表格的表头，并将有关组件关联
     * @param name 表头信息
     * @param changeLine 第几行可改
     * @param down 脚底的box
     */
    public MyJPanel(Vector<Object> name, int changeLine, Box down) {
        super();
        // 设置大小布局
        //this.setSize(300, 150);
        this.setLayout(new BorderLayout(0, 0));

        // 添加中间的table
        // 添加ScrollPane
        this.ScrollPane = new JScrollPane();
        this.ScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        // 将滑动table放到panel中
        this.add(ScrollPane, BorderLayout.CENTER);
        // 新建tablemodel，并设置表名、内容，
        this.name = name;
        this.changeline = changeLine;
        this.model = new DefaultTableModel_noEditable(new Vector<>(), this.name, this.changeline);
        // 新建table并于tablemodel相关联
        this.table = new JTable();
        this.table.setModel(this.model);
        // 在ScollPane中显示Table
        this.ScrollPane.setViewportView(this.table);

        // 添加下面的box
        this.add(down,BorderLayout.SOUTH);
    }

    /**
     * 新建一个MyPanel，形式为：头顶的box，中间的table，无下面的box
     * 当box为空时，不添加
     * 设置表格的表头，并将有关组件关联
     * @param up 头顶的box
     * @param name 表头信息
     * @param changeLine 第几行可改
     */
    public MyJPanel(Box up, Vector<Object> name, int changeLine) {
        super();
        // 设置大小布局
        //this.setSize(300, 150);
        this.setLayout(new BorderLayout(0, 0));
        // 添加上面的box
        this.add(up, BorderLayout.NORTH);


        // 添加中间的table
        // 添加ScrollPane
        this.ScrollPane = new JScrollPane();
        this.ScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        // 将滑动table放到panel中
        this.add(ScrollPane, BorderLayout.CENTER);
        // 新建tablemodel，并设置表名、内容，
        this.name = name;
        this.changeline = changeLine;
        this.model = new DefaultTableModel_noEditable(new Vector<>(), this.name, this.changeline);
        // 新建table并于tablemodel相关联
        this.table = new JTable();
        this.table.setModel(this.model);
        // 在ScollPane中显示Table
        this.ScrollPane.setViewportView(this.table);
    }

    /**
     * 新建一个MyPanel，形式为：仅有中间的table
     * 当box为空时，不添加
     * 设置表格的表头，并将有关组件关联
     * @param name 表头信息
     * @param changeLine 第几行可改
     */
    public MyJPanel( Vector<Object> name, int changeLine) {
        super();
        // 设置大小布局
        //this.setSize(300, 150);
        this.setLayout(new BorderLayout(0, 0));


        // 添加中间的table
        // 添加ScrollPane
        this.ScrollPane = new JScrollPane();
        this.ScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        // 将滑动table放到panel中
        this.add(ScrollPane, BorderLayout.CENTER);
        // 新建tablemodel，并设置表名、内容，
        this.name = name;
        this.changeline = changeLine;
        this.model = new DefaultTableModel_noEditable(new Vector<>(), this.name, this.changeline);
        // 新建table并于tablemodel相关联
        this.table = new JTable();
        this.table.setModel(this.model);
        // 在ScollPane中显示Table
        this.ScrollPane.setViewportView(this.table);

    }
    /**
     * 设置table的数据，并重新展示关联
     * @param data 更新的数据
     */
    public void setData(Vector<Vector<Object>> data) {
        // 更新表格中的信息
        this.model = new DefaultTableModel_noEditable(data, this.name, this.changeline);
        this.table.setModel(model);
        // 重新展示
        this.ScrollPane.setViewportView(this.table);
    }

}
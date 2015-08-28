package in.jaxa.allelemofui;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Guu on 28/8/15.
 */
public class AllElemOfUI {
    public static void main(String[] args){
        NewFrame frame1=new NewFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
    }
}

class NewFrame extends JFrame{
    private JLabel label1;
    private JButton button1;
    private JTextField textfield1;
    private JComboBox box;
    private JMenuBar menubar;
    private JSlider slider;
    private JSpinner spinner;
    private JToolBar toolbar;

    public NewFrame(){
        super();
        this.setSize(300, 500);
        this.getContentPane().setLayout(null);
        this.add(this.getTextField(), null);
        this.add(this.getButton(), null);
        this.add(this.getLabel(), null);
        this.add(this.getBox(), null);
        this.add(this.getMenu());
        this.add(this.getSlider(), null);
        this.add(this.getSpinner(), null);
        this.add(this.getToolBar(), null);
        this.setTitle("Hello!");
    }

    private JToolBar getToolBar(){
        if(toolbar==null){
            toolbar=new JToolBar();
            toolbar.setBounds(103,260,71,20);
            toolbar.setFloatable(true);
        }
        return toolbar;
    }

    private JSpinner getSpinner() {
        if (spinner == null) {
            spinner = new JSpinner();
            spinner.setBounds(103, 220, 80, 20);
            spinner.setValue(100);
        }
        return spinner;
    }
    private JSlider getSlider(){
        if(slider==null){
            slider=new JSlider();
            slider.setBounds(103,200,100,20);
            slider.setMaximum(100);
            slider.setMinimum(0);
            slider.setOrientation(0);
            slider.setValue(0);
        }
        return slider;
    }

    private JMenuBar getMenu(){
        if(menubar==null){
            menubar=new JMenuBar();
            JMenu m1=new JMenu();
            m1.setText("打开");
            JMenu m2=new JMenu();
            m2.setText("编辑");
            JMenu m3=new JMenu();
            m3.setText("帮助");

            JMenuItem item11=new JMenuItem();
            item11.setText("打开");
            JMenuItem item12=new JMenuItem();
            item12.setText("保存");
            JMenuItem item13=new JMenuItem();
            item13.setText("关闭");

            m1.add(item11);
            m1.add(item12);
            m1.add(item13);

            menubar.add(m1);
            menubar.add(m2);
            menubar.add(m3);
        }
        return menubar;
    }

    private JComboBox getBox(){
        if(box==null){
            box=new JComboBox();
            box.setBounds(103,140,71,27);
            box.addItem("1");
            box.addItem("2");
            box.addActionListener(new comboxListenner());
        }
        return box;
    }

    private class comboxListenner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            Object o = e.getSource();
            System.out.println(o.toString());
            int i=box.getSelectedIndex();
            System.out.println(i);
        }
    }

    private JLabel getLabel() {
        if(label1==null){
            label1=new JLabel();
            label1.setBounds(34,49,53,18);
            label1.setText("Name");
            label1.setToolTipText("JLabel");
        }
        return label1;
    }

    private JButton getButton(){
        if(button1==null){
            button1=new JButton();
            button1.setBounds(103,110,71,27);
            button1.setText("OK");
            button1.setToolTipText("OK");
            button1.addActionListener(new ButtonListenner());
        }
        return button1;
    }
    private class ButtonListenner implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println("Hello World!");
        }
    }

    private  JTextField getTextField(){
        if(textfield1==null){
            textfield1=new JTextField();
            textfield1.setBounds(96,49,160,20);
        }
        return textfield1;
    }
}
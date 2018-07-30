import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

/**
 * @program: Notepad
 * @Date: 2018/7/22 21:53
 * @Author: Mr.Deng
 * @Description:
 */
public class NotePad extends WindowAdapter implements ActionListener {
 JFrame jf;
 JButton jb, jb1;
 JTextArea ta;
 String filename, copy, past, cut;
 JPanel jp;
 JMenu jmb, jmb2;
 JMenuItem _fm, _fm1, _fm2, _fm3, _fm4, _fe1, _fe2, _fe3, _fe4;
 JMenuBar JMENU;
 JScrollPane jsp;

 public static void main(String[] args) {
  new NotePad();
 }

 public NotePad() {
  jp = new JPanel();
  JMENU = new JMenuBar();
  ta = new JTextArea();
  jf = new JFrame();
  jsp = new JScrollPane(ta);
  jf.addWindowListener(this);
  jmb = new JMenu("文件");
  jmb2 = new JMenu("编辑");
  _fm1 = new JMenuItem("打开");
  _fm1.addActionListener(this);
  _fm2 = new JMenuItem("存储");
  _fm2.addActionListener(this);
  _fm3 = new JMenuItem("关闭");
  _fm3.addActionListener(this);
  _fm4 = new JMenuItem("另存为");
  _fm4.addActionListener(this);
  _fm = new JMenuItem("新建");
  _fm.addActionListener(this);

  _fe1 = new JMenuItem("复制");
  _fe1.addActionListener(this);
  _fe2 = new JMenuItem("粘贴");
  _fe2.addActionListener(this);
  _fe3 = new JMenuItem("剪切");
  _fe3.addActionListener(this);
  _fe4 = new JMenuItem("版本");
  _fe4.addActionListener(this);

  jf.setJMenuBar(JMENU);
  jf.setTitle("记事本");
  jmb.add(_fm1);
  jmb.addSeparator();
  jmb.add(_fm2);
  jmb.addSeparator();
  jmb.add(_fm4);
  jmb.addSeparator();
  jmb.add(_fm3);
  jmb.addSeparator();

  jmb2.add(_fe1);
  jmb2.addSeparator();
  jmb2.add(_fe2);
  jmb2.addSeparator();
  jmb2.add(_fe3);
  jmb2.addSeparator();
  jmb2.add(_fe4);

  JMENU.add(jmb);
  JMENU.add(jmb2);
  jb = new JButton("保存");
  jb.addActionListener(this);
  jb1 = new JButton("关闭");
  jb1.addActionListener(this);

  jp.add(jb);
  jp.add(jb1);
  jf.add(jp, "South");
  ta.setWrapStyleWord(true);
  jf.add(jsp);
  jf.setSize(600, 400);
  jf.setVisible(true);

  int W = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
  int H = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
  jf.setLocation((W - jf.getWidth()) / 2, (H - jf.getHeight()) / 2);
 }

 public void actionPerformed(ActionEvent e) {
  if (e.getSource() == jb || e.getSource() == _fm2) {
   try {
    if (filename == null) {
     filename = JOptionPane.showInputDialog("请输入文件名", "java");
     FileOutputStream fout = new FileOutputStream(filename + ".txt");
     byte bb[] = ta.getText().getBytes();
     fout.write(bb);
     fout.close();
     JOptionPane.showMessageDialog(null, "已保存");
    } else {
     FileOutputStream fout = new FileOutputStream(filename + ".txt");
     byte bb[] = ta.getText().getBytes();
     fout.write(bb);
     fout.close();
     JOptionPane.showMessageDialog(null, "已保存");
    }
   } catch (IOException ioe) {
    System.err.println(e);
   }
  }
  if (e.getSource() == _fm) {
   if (!(ta.getText().equals(""))) {
    Object[] options = {"确定", "取消"};
    int response = JOptionPane.showOptionDialog(null, "你是否保存", "提示",
     JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    if (response == 0) {
     try {
      FileDialog d = new FileDialog(jf, "保存文件", FileDialog.SAVE);
      d.setVisible(true);
      filename = d.getDirectory() + d.getFile();
      FileOutputStream fout = new FileOutputStream(filename + ".txt");
      byte bb[] = ta.getText().getBytes();
      fout.write(bb);
      fout.close();
      JOptionPane.showMessageDialog(null, "已保存");
      ta.setText("");
     } catch (IOException ioe) {
      System.err.println(e);
     }
    }
    if (response == 1) {
     JOptionPane.showMessageDialog(null, "你选择了取消");
     ta.setText("");
    }
   }
  }
  if (e.getSource() == _fm1) {
   FileDialog d = new FileDialog(jf, "打开文件", FileDialog.LOAD);
   d.setVisible(true);
   File f = null;
   f = new File(d.getDirectory() + d.getFile());
   for (int i = 0; i <= f.length(); i++) {
    char[] ch = new char[100];
    try {
     FileReader fr = new FileReader(f);
     fr.read(ch);
     String str = new String(ch);
     ta.setText(str);
    } catch (FileNotFoundException fe) {

    } catch (IOException ie) {

    }
   }
  }
  if (e.getSource() == _fm4) {
   FileDialog d = new FileDialog(jf, "另存为", FileDialog.SAVE);
   d.setVisible(true);
   try {
    filename = d.getDirectory() + d.getFile();
    FileOutputStream fout = new FileOutputStream(filename + ".txt");
    byte bb[] = ta.getText().getBytes();
    fout.write(bb);
    fout.close();
   } catch (IOException ioe) {
    System.err.println(e);
   }
  }
  if (e.getSource() == _fm3 || e.getSource() == jb1) {
   System.exit(0);
  }
  if (e.getSource() == _fe1) {
   copy = ta.getSelectedText();
  }
  if (e.getSource() == _fe2) {
   ta.setText(copy);
  }
  if (e.getSource() == _fe3) {
   copy = ta.getSelectedText();
   ta.setText("");
  }
  if (e.getSource() == _fe4) {
   JOptionPane.showMessageDialog(jf, "MY NotePad 1.0");
  }
 }

 public void windowClosing(WindowEvent e) {
  System.exit(0);
 }
}

package jpa_swing.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Window.Type;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import jpa_swing.ent.Person;
import jpa_swing.model.Manager;
import jpa_swing.swing.model.S;
import jpa_swing.swing.model.ceinture;
import jpa_swing.swing.model.combo;
import jpa_swing.swing.model.myTableModel;
import jpa_swing.swing.model.styleThead;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class formulaire {

	private JFrame frame;
	private JPanel pBody;
	private JPanel pCenter;
	private JPanel pFooter;
	private JPanel pHeader;
	private JPanel pForm;
	private JScrollPane pTable;
	private JPanel pLine;
	private combo choice;
	private JTextField cin;
	private JTextField name;
	private JTextField secondname;
	private JTextField tel;
	private JTextField email;
	private JTable liste_personnes;
	public static Font font=new Font("Trebuchet MS", Font.PLAIN, 14);
	private String [] head=new String [] {"CIN","NAME","S.NAME","TEL","EMAIL",};
	private Color back=new Color(173, 216, 230), cLabel=back/*new Color(163, 206, 220)*/,cButton=new Color(25, 25, 112),paintLabel=cButton,paintButton=new Color(245, 255, 250);
	private JPanel pVoid;
	private JButton save;	
	private JButton refresh;
	private JButton remove;
	private JButton clean;
	private int id_selected=-1;
	private JButton close;
	public formulaire() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated( true );
		frame.setType( Type.UTILITY );
		frame.setBounds(100, 100, 1200, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(new GridLayout(0, 1,0,0));
		
		pBody = new JPanel();
		pBody.setLayout(new BorderLayout(0, 0));
		frame.getContentPane().add(pBody);
		pBody.setBackground(back);
		pHeader = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pHeader.getLayout();
		flowLayout.setVgap(10);
		pHeader.setBackground(back);
		pBody.add(pHeader, BorderLayout.NORTH);
		
		pCenter = new JPanel();
		pCenter.setBackground(back);
		pBody.add(pCenter);
		pCenter.setLayout(new GridLayout(0, 1, 10, 10));
		
		pForm = new JPanel();
		pCenter.add(pForm);
		pForm.setLayout(new GridLayout(0, 2, 10, 10));
		pForm.setBackground(back);
		
		pVoid = new JPanel();
		
		pForm.add(pVoid);
		pLine = new JPanel();
		pForm.add(pLine);
		pLine.setLayout(new GridLayout(0, 1, 0, 0));
		pLine.setBackground(back);
		choice = new combo(Manager.showList());
		choice.setFont(font);
		choice.setBorder(new LineBorder(back));
		choice.setBackground(back);
		pLine.add(choice);
		choice.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				Person p=(Person) choice.getSelectedItem();
				hidrate(p);
				id_selected=p.getId();
				System.out.println("id="+p.getId());
			}});
		JPanel pLine_1 = new JPanel();
		pForm.add(pLine_1);
		pLine_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel for__1 = new JLabel("CIN: ");
		for__1.setOpaque(true);
		for__1.setHorizontalAlignment(SwingConstants.RIGHT);
		for__1.setForeground(paintLabel);
		for__1.setFont(font);
		for__1.setBackground(cLabel);
		pLine_1.add(for__1);
		
		cin = new JTextField();
		cin.setBorder(new LineBorder(back));
		cin.setColumns(10);
		cin.setFont(font);
		pLine_1.add(cin);
		
		JPanel pLine_2 = new JPanel();
		pForm.add(pLine_2);
		pLine_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel for__2 = new JLabel("NAME: ");
		for__2.setOpaque(true);
		for__2.setHorizontalAlignment(SwingConstants.RIGHT);
		for__2.setForeground(paintLabel);
		for__2.setFont(font);
		for__2.setBackground(cLabel);
		pLine_2.add(for__2);
		
		name = new JTextField();
		name.setColumns(10);
		name.setFont(font);
		name.setBorder(new LineBorder(back));
		pLine_2.add(name);
		
		JPanel pLine_3 = new JPanel();
		pForm.add(pLine_3);
		pLine_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel for__3 = new JLabel("SECOND NAME: ");
		for__3.setOpaque(true);
		for__3.setHorizontalAlignment(SwingConstants.RIGHT);
		for__3.setForeground(paintLabel);
		for__3.setFont(font);
		for__3.setBackground(cLabel);
		pLine_3.add(for__3);
		
		secondname = new JTextField();
		secondname.setColumns(10);
		secondname.setFont(font);
		secondname.setBorder(new LineBorder(back));
		pLine_3.add(secondname);
		
		JPanel pLine_4 = new JPanel();
		pForm.add(pLine_4);
		pLine_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel for__4 = new JLabel("TEL: ");
		for__4.setOpaque(true);
		for__4.setHorizontalAlignment(SwingConstants.RIGHT);
		for__4.setForeground(paintLabel);
		for__4.setFont(font);
		for__4.setBackground(cLabel);
		pLine_4.add(for__4);
		
		tel = new JTextField();
		tel.setColumns(10);
		tel.setFont(font);
		tel.setBorder(new LineBorder(back));
		pLine_4.add(tel);
		
		JPanel pLine_5 = new JPanel();
		pForm.add(pLine_5);
		pLine_5.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel for__5 = new JLabel("EMAIL: ");
		for__5.setOpaque(true);
		for__5.setHorizontalAlignment(SwingConstants.RIGHT);
		for__5.setForeground(paintLabel);
		for__5.setFont(font);
		for__5.setBackground(cLabel);
		pLine_5.add(for__5);
		
		email = new JTextField();
		email.setColumns(10);
		email.setFont(font);
		email.setBorder(new LineBorder(back));
		pLine_5.add(email);
		
		JPanel pLine_6 = new JPanel();
		pForm.add(pLine_6);
		pLine_6.setLayout(new GridLayout(0, 5, 10, 5));
		pLine_6.setBackground(back);
		clean = new JButton("CLEAN");
		clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hidrate(null);				
			}
		});
		clean.setForeground(paintButton);
		clean.setFont(font);
		clean.setBackground(cButton);
		pLine_6.add(clean);
		
		refresh = new JButton("REFRESH");
		refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refresh();
			}
		});
		refresh.setForeground(paintButton);
		refresh.setFont(font);
		refresh.setBackground(cButton);
		pLine_6.add(refresh);
		
		remove = new JButton("REMOVE");
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save(null,id_selected);
			}
		});
		remove.setForeground(paintButton);
		remove.setFont(font);
		remove.setBackground(cButton);
		pLine_6.add(remove);
		
		save = new JButton("SAVE");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(S.confirm("", id_selected>0?"update?":"save ??"))
					save(new Person(Integer.valueOf(cin.getText()),name.getText(),secondname.getText(),tel.getText(),email.getText()),id_selected);
				
			}
		});
		save.setForeground(paintButton);
		save.setFont(font);
		save.setBackground(cButton);
		pLine_6.add(save);
		
		close = new JButton("CLOSE");
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		close.setForeground(paintButton);
		close.setFont(font);
		close.setBackground(new Color(155, 0, 0));
		pLine_6.add(close);
		
		pTable = new JScrollPane();
		pTable.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		pTable.setBorder(new LineBorder(back));
		pCenter.add(pTable);
		pTable.getViewport().setBackground(back);
		liste_personnes = new JTable();
		refresh();
		pTable.setViewportView(liste_personnes);
		liste_personnes.setBackground(back);
		  /*************************************************************/
        Color backgroundCeinture =  new Color(123, 166,180), colorCeinture = Color.white, backgroundTable = back,
                colorTable = cButton,
                backgroundHead = new Color(143, 186, 200), colorHead = cButton;
        ceinture ct = new ceinture( backgroundCeinture, colorCeinture, backgroundTable, colorTable );
        styleThead th = new styleThead( backgroundHead, colorHead, backgroundTable );

        liste_personnes.setShowVerticalLines( false );
        liste_personnes.setShowHorizontalLines( false );
        liste_personnes.setAutoResizeMode( JTable.AUTO_RESIZE_ALL_COLUMNS );
        liste_personnes.getColumnModel().setColumnMargin( 0 );
        liste_personnes.getTableHeader().setPreferredSize( new Dimension( 2, 40 ) );
        liste_personnes.setRowHeight( 40 );
        liste_personnes.setRowMargin( 0 );
        liste_personnes.setDefaultRenderer( Object.class, ct );
        liste_personnes.getTableHeader().setDefaultRenderer( th );
        
        /*************************************************************/
		pFooter = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) pFooter.getLayout();
		flowLayout_1.setVgap(20);
		pFooter.setBackground(back);
		pBody.add(pFooter, BorderLayout.SOUTH);
	}
	private myTableModel getModel() {
		List<Person> us=Manager.showList();
		return new myTableModel(head,us);
	}
	private void hidrate(Person p) {
		boolean b=p!=null;
		cin.setText(b?p.getCin()+"":"");
		name.setText(b?p.getNom():"");
		secondname.setText(b?p.getPrenom():"");
		tel.setText(b?p.getTel():"");
		email.setText(b?p.getEmail():"");
		id_selected=b?p.getId():-1;
		if(!b)refresh();
	}
	private void save(Person p ,int id) {
		if(p!=null) {
		if(id>0)Manager.update(p, id);
		else Manager.insert(p);
		}
		else {
			if(id>0)Manager.delete(id);
		}
		refresh();
	}
	private void refresh() {
		choice.setModel(Manager.showList());
		liste_personnes.setModel(getModel());
	}
	}
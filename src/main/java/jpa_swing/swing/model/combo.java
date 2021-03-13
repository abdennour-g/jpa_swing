package jpa_swing.swing.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.event.ListDataListener;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class combo<Person> extends JComboBox<Person> {
	private JComboBox j__ = this;
    private JTextField t__ = (JTextField) getEditor().getEditorComponent();
    	class ListComboBoxModel<Person> extends AbstractListModel<Person> implements ComboBoxModel<Person> {
	  private Person selectedItem;

	  private List<Person> anArrayList;

	  public ListComboBoxModel(List<Person> arrayList) {
	    anArrayList = arrayList;
	  }
	  @Override
	  public Person getSelectedItem() {
	    return selectedItem;
	  }
	  @Override
	  public void setSelectedItem(Object newValue) {
	    selectedItem = (Person) newValue;
	  }
	  @Override
	  public int getSize() {
	    return anArrayList.size();
	  }
	  @Override
	  public Person getElementAt(int i) {
	    return anArrayList.get(i);
	  }
	}
    public combo( ComboBoxModel<Person> list ) {
        super( list );
        create();
       
    }

    public combo(List<Person> list ) {
        super();
        create();
        this.setModel(new ListComboBoxModel<Person>(list));
    }
    public combo( ) {
        super();
        create();
        
    }
    public void setModel(List<Person> list) {
    	this.setModel(new ListComboBoxModel<Person>(list));
    }
    private void create() {
        this.setEditable( true );

        j__.setUI( new BasicComboBoxUI() {
        	@Override
            protected JButton createArrowButton() {
                return new JButton() {
                    @Override
                    public int getWidth() {
                        return 50;
                    }
                    @Override
                    public Color getBackground() {
                        return new Color(25, 25, 112);
                    }
                    @Override
                    public Color getForeground() {
                        return new Color(225, 225, 112);
                    }
                    @Override
                    public String  getText() {
                        return "CHOICE";
                    }
                };
            }
        });}
public void setText(String val) {
	t__.setText(val);
}    
}


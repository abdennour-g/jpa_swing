package jpa_swing.swing.model;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableRowSorter;

public class filtrer implements KeyListener {
    private JTextField search;
    private JTable                       table;
    private TableRowSorter<myTableModel> sorter = null;

    public filtrer( JTextField search, JTable table ) {
        this.search = search;
        this.table = table;
        search.addKeyListener( this );
        myTableModel model = (myTableModel) table.getModel();
        sorter = new TableRowSorter<myTableModel>( model );
        table.setRowSorter( sorter );
        //    new RowFilterUtil( search, sorter );
    }
    @Override
    public void keyTyped( KeyEvent e ) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed( KeyEvent e ) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased( KeyEvent e ) {
        System.out.println( search.getText() );
        /*  RowFilter<TableModel, Integer> tm = RowFilter.regexFilter( "(?i)" + search.getText() );
        RowFilter<TableModel, Integer> rf2 = null;
        List<RowFilter<TableModel, Integer>> rfs = new ArrayList<RowFilter<TableModel, Integer>>();
        rfs.add( tm );
        // rfs.add( tm2 );
        // rfs.add( tm3 );
        rf2 = RowFilter.andFilter( rfs );
        sorter.setRowFilter( rf2 );*/
        //  setStyleRender( true );

    }

}

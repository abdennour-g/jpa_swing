package jpa_swing.swing.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class RowFilterUtil {
    private TableRowSorter<? extends TableModel> rowSorter = null;
    private JTextField                           tf;

    public RowFilterUtil( final JTextField tf, JTable table ) {
        this.tf = tf;
        myTableModel model = (myTableModel) table.getModel();
        rowSorter = new TableRowSorter<myTableModel>( model );
        table.setRowSorter( rowSorter );
        createRowFilter();
    }


    public synchronized void createRowFilter() {
        tf.getDocument().addDocumentListener( new DocumentListener() {
            @Override
            public synchronized void insertUpdate( DocumentEvent e ) {
                update( e );
            }

            @Override
            public synchronized void removeUpdate( DocumentEvent e ) {
                update( e );
            }

            @Override
            public synchronized void changedUpdate( DocumentEvent e ) {
                update( e );
            }

            private synchronized String optimize( String in ) {
                String out = "";
                return out;
            }

            private synchronized void update( DocumentEvent e ) {
                String text = tf.getText();
                if ( text.trim().length() == 0 ) {
                    rowSorter.setRowFilter( null );
                } else {
                    RowFilter<TableModel, Integer> tm = RowFilter.regexFilter( "(?i)" + text );
                    RowFilter<TableModel, Integer> rf2 = null;
                    List<RowFilter<TableModel, Integer>> rfs =
                            new ArrayList<RowFilter<TableModel, Integer>>();
                    rfs.add( tm );
                    rf2 = RowFilter.andFilter( rfs );
                    rowSorter.setRowFilter( rf2 );
                }

            }

        } );
    }
}



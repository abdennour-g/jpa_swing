package jpa_swing.swing.model;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.TableCellRenderer;

public class styleThead implements TableCellRenderer {
    private Color backgroundHead, colorHead, backgroundTable;

    public styleThead( Color backgroundHead, Color colorHead, Color backgroundTable ) {
        this.backgroundHead = backgroundHead;
        this.colorHead = colorHead;
        this.backgroundTable = backgroundTable;
    }
    @Override
    public Component getTableCellRendererComponent( JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column ) {
        JTextField editor = new JTextField();
        if ( value != null )
            editor.setText( "" + value.toString() );
        editor.setBackground( backgroundHead );
        editor.setForeground( colorHead );
        //  editor.setFont( PREFERENCE.FONT_ZONE );
        editor.setHorizontalAlignment( SwingConstants.CENTER );
        editor.setBorder( null );
        editor.setBorder( new MatteBorder( 4, 5, 4, 5, backgroundTable ) );
        return editor;
    }

}

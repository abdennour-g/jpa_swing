package jpa_swing.swing.model;



import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class ceinture extends DefaultTableCellRenderer
{
    private Color backgroundCeinture, colorCeinture, backgroundTable, colorTable;

    public ceinture( Color backgroundCeinture, Color colorCeinture, Color backgroundTable, Color colorTable ) {
        this.backgroundCeinture = backgroundCeinture;
        this.colorCeinture = colorCeinture;
        this.backgroundTable = backgroundTable;
        this.colorTable = colorTable;
    }
    @Override
    public Component getTableCellRendererComponent( JTable table, Object value,
            boolean isSelected,
            boolean hasFocus, int row, int column ) {
        final Component c = super.getTableCellRendererComponent( table, value, isSelected,
                hasFocus,
                row,
                column );
        JLabel jc = (JLabel) c;
        jc.setHorizontalAlignment( SwingConstants.LEFT );

        if ( row == table.getSelectedRow() ) {
            jc.setBackground( backgroundCeinture );
            jc.setBorder( new LineBorder( backgroundCeinture, 2 ) );
            jc.setForeground( colorCeinture );

        } else {
            jc.setBackground( backgroundTable );
            jc.setBorder( new LineBorder( backgroundTable, 2 ) );
            jc.setForeground( colorTable );
            /***************************************************************************/

        }

        return jc;
    }




}

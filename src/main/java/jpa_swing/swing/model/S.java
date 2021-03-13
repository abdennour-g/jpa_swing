package jpa_swing.swing.model;

import javax.swing.JOptionPane;

public class S {
	public synchronized static boolean confirm( String title, String question ) {
        boolean b = true;
        JOptionPane jop = new JOptionPane();
        int option = jop.showConfirmDialog( null,
                question,
                title,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE );
        if ( option == JOptionPane.OK_OPTION )
            b = true;
        else
            b = false;
        return b;
    }
	public synchronized static void alert(  String msg ) {
        JOptionPane jop1 = new JOptionPane();
        jop1.showMessageDialog( null, msg, "",
                JOptionPane.INFORMATION_MESSAGE );
    }

}

package jpa_swing.swing.model;

import java.util.List;

import jpa_swing.ent.Person;

public class myTableModel extends myFatherTableModel {
public myTableModel() {}

public myTableModel( String[] tHead, List<Person> pers) {
    super( tHead, convert( pers ) );
}



private static Object[][] convert( List<Person> pers ) {
    Object[][] o = new Object[pers.size()][5];
    int j = 0;
    for ( Person p : pers )
        o[j++] = new Object[] { p.getCin()+"", p.getNom(), p.getPrenom(), p.getTel(), p.getEmail() };
    return o;
}


public myTableModel( String[] tHead, Object[][] tBody ) {
    super( tHead, tBody );
}


}

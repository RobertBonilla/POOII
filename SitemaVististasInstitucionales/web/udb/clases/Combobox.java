/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udb.clases;

/**
 *
 * @author Robert Bonilla
 */
public class Combobox {
    Object value; //Valor a guardar en la BD
    Object display; //Valor a mostrar en el combobox
    
    public Combobox(Object value, Object display){
        this.value = value;
        this.display = display;
    }

    Combobox(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getDisplay() {
        return display;
    }

    public void setDisplay(Object display) {
        this.display = display;
    }
    
    
      @Override
     public String toString()
    {
    
    return display.toString();
    }
}

package Modelo;

import javax.swing.JTextField;
import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class Tamaño_TextField extends PlainDocument{
    private JTextField campo_editar;
    private int tamaño_texto;

    public Tamaño_TextField(JTextField campo_editar, int tamaño_texto) {
        this.campo_editar = campo_editar;
        this.tamaño_texto = tamaño_texto;
    }
    
    public void insertString(int arg0, String arg1, AttributeSet arg2) throws BadLocationException{
        if ((campo_editar.getText().length() + arg1.length()) > this.tamaño_texto) {
            return;
        }
        super.insertString(arg0, arg1, arg2);
    }
}

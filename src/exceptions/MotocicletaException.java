/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author higor
 */
public class MotocicletaException extends Exception {

    /**
     * Creates a new instance of <code>MotocicletaException</code> without
     * detail message.
     */
    public MotocicletaException() {
    }

    /**
     * Constructs an instance of <code>MotocicletaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MotocicletaException(String msg) {
        super(msg);
    }
}

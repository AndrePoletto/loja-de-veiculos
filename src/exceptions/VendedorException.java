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
public class VendedorException extends Exception {

    /**
     * Creates a new instance of <code>VendedorException</code> without detail
     * message.
     */
    public VendedorException() {
    }

    /**
     * Constructs an instance of <code>VendedorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public VendedorException(String msg) {
        super(msg);
    }
}

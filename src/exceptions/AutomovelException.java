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
public class AutomovelException extends Exception {

    /**
     * Creates a new instance of <code>AutomovelException</code> without detail
     * message.
     */
    public AutomovelException() {
    }

    /**
     * Constructs an instance of <code>AutomovelException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AutomovelException(String msg) {
        super(msg);
    }
}

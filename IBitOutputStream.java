/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author b8033335
 */
public interface IBitOutputStream {
    void writeBit(char bit);
    void writeBit(String bit);
    void close();
}

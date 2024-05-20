/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laba1;
import javax.swing.*;
/**
 *
 * @author 40ush
 */
public class MyException extends Exception{
    private final String message;
    public MyException(String msg){
        super(msg);
        this.message = msg;
    }

    public void GetFormMessage(){
        JOptionPane.showMessageDialog(null, message, "InfoBox", JOptionPane.INFORMATION_MESSAGE);
    }

}


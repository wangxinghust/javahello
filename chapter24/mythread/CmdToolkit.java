package mythread;

import java.io.IOException;

public class CmdToolkit {
    public static void main(String[] args){
        try{
            Process proc=Runtime.getRuntime().exec("notepad");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package jp.ac.uryukyu.ie.e205735;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        var master = new GameMaster(5);
        master.fieldStatus();
        master.receiveAnswer();
        master.compareBallPosition();
    }
}

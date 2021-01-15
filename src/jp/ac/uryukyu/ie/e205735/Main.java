package jp.ac.uryukyu.ie.e205735;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        var ban = new Banmen(5);
        ban.field();
        ban.receiveAnswer();
        ban.field();
    }

    /*
    public int henkan(char eizi){
        int suuzi = eizi - 'a';
        return suuzi;
    }
    */
}

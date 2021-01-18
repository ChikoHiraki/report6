package jp.ac.uryukyu.ie.e205735;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        var master = new GameMaster(5);
        master.fieldStatus();
        master.receiveAnswer();
        /*
        var FieldA = new FieldAnswer(5);
        FieldA.ballInstallation();
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(FieldA.ballAnswer[i][j]);
            }
            System.out.println();
        }
        */
    }
}

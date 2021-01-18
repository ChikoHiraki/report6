package jp.ac.uryukyu.ie.e205735;
import java.util.Scanner;

public class GameMaster {
    private int MASU;
    private String[][] boxStatus;
    private int BALL= 3;
    private int choiceNumber;
    private char choiceEiji;
    private int changeInt;
    private Field ban;

    GameMaster(int masu){
        this.MASU = masu;
        ban = new Field(this.MASU);
                            //↑5
    }

    public void fieldStatus(){
        char c = 'a';
        //1れつめ
        System.out.print("  |   ");
        for(int j = 0; j < this.MASU ; j++){
            System.out.print(c + " ");
            c++ ;
        }
        System.out.println();
        System.out.println("ーーーーーーーーーー");

        //２列目
        String[] topLasers = {"1","H","R","H","2"};
        System.out.print("  |   ");
        for (int j = 0; j < MASU ; j++){
            System.out.print(topLasers[j]+" ");
        }
        System.out.println();

        //3れつめ
        String[] leftLasers = {"3","1","H","R","H"};
        String[] rightLasers = {"3","2","H","4","H"};

        for (int j = 0; j < MASU ; j++){
            System.out.print(j+" | ");
            System.out.print(leftLasers[j]+" ");
            for (int i = 0; i< MASU ; i++){
                System.out.print(ban.getBoxStatus()[j][i]+" ");
            }
            System.out.print(rightLasers[j]+" ");
            System.out.println();
        }

        //さいごの列
        String[] underLasers = {"R","H","R","H","4"};
        System.out.print("  |   ");
        for (int j = 0; j < MASU ; j++){
            System.out.print(underLasers[j]+" ");
        }
        System.out.println();
        System.out.println();
    }

    public void receiveAnswer(){
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<BALL; i++){
            System.out.println((i+1) + "つ目のボールの位置を選択してください");
            System.out.print("数字（0~4）を入力：");
            choiceNumber = scanner.nextInt();
            System.out.print("アルファベット（a~e）を入力：");
            choiceEiji = scanner.next().charAt(0);
            changeInt = choiceEiji - 'a';
            ban.setBoxStatus(choiceNumber, changeInt);
            System.out.println();
            this.fieldStatus();
        }
    }



}

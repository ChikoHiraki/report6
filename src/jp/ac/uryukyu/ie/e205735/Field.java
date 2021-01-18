package jp.ac.uryukyu.ie.e205735;
import java.util.Scanner;

public class Field {
    private int MASU;
    private String[][] boxStatus;

    Field(int masu){
        MASU = masu;
        boxStatus = new String[MASU][MASU];

        for (int j = 0; j < MASU ; j++){
            for (int i = 0; i< MASU ; i++){
                boxStatus[i][j] = "□";
            }
        }
    }

    public void setBoxStatus(int tate,int yoko){
        this.boxStatus[tate][yoko] = "●";
    }

    public String[][] getBoxStatus(){
        return boxStatus;
    }













    /*
    public void field(){
        char c = 'a';
        //1れつめ
        System.out.print("  |   ");
        for(int j = 0; j < MASU ; j++){
            System.out.print(c + " ");
            c++ ;
        }
        System.out.println();

        System.out.println("ーーーーーーーーーー");

        //２列目
        System.out.println("  |   1 H R H 2");

        //3れつめ
        String[] yokoyouso1 = {"3","1","H","R","H"};
        String[] yokoyouso2 = {"3","2","H","4","H"};
        //char[] nihongo = {'ｱ','ｶ','ｻ','ﾀ','ﾅ'}; 

        for (int j = 0; j < MASU ; j++){
            System.out.print(j+" | ");
            System.out.print(yokoyouso1[j]+" ");
            for (int i = 0; i< MASU ; i++){
                System.out.print(getBoxStatus()[j][i]+" ");
                //System.out.print(nihongo[j]+" ");
                //nihongo[j]++;
            }
            System.out.print(yokoyouso2[j]+" ");
            System.out.println();
        }

        //さいごの列
        String[] youso = {"R","H","R","H","4"};

        System.out.print("  |   ");
        for (int j = 0; j < MASU ; j++){
            System.out.print(youso[j]+" ");
        }
        System.out.println();

        System.out.println();
    }
    */

    /*
    public void receiveAnswer(){
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<BALL; i++){
            System.out.println((i+1) + "つ目のボールの位置を選択してください");
            System.out.print("数字（0~4）を入力：");
            choiceNumber = scanner.nextInt();
            System.out.print("アルファベット（a~e）を入力：");
            choiceEiji = scanner.next().charAt(0);
            changeInt = choiceEiji - 'a';
            setBoxStatus(choiceNumber, changeInt);
        }
    }
    */
}

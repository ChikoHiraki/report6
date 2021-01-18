package jp.ac.uryukyu.ie.e205735;

import java.util.ArrayList;
import java.util.Collections;

public class FieldAnswer {
    //ボールの位置

    private int MASU;
    private int BALL= 3;
    private String[][] ballAnswer;

    FieldAnswer(int masu){
        this.MASU = masu;
        this.ballAnswer  = new String[MASU][MASU];
    }

    public void ballInstallation(){
        ArrayList<HavingTwoNumber> list1 = new ArrayList<HavingTwoNumber>();
        for(int i=0; i<MASU; i++){
            for(int j=0; j<MASU; j++){
                list1.add(twoNumberInOneBag(i,j));
                this.ballAnswer[i][j] = "□";
            }
        }
        Collections.shuffle(list1);
        for(int i=0; i<BALL; i++){
            this.ballAnswer[list1.get(i).tate][list1.get(i).yoko] = "●";
        }
    }

    public HavingTwoNumber twoNumberInOneBag(int _num1, int _num2){
        var bag = new HavingTwoNumber();
        bag.tate = _num1;
        bag.yoko = _num2;
        return bag;
    }

    public String[][] getBallAnswer(){
        return this.ballAnswer;
    }

    public String getBallAnswer(int tate,int yoko){
        return this.ballAnswer[tate][yoko];
    }

}

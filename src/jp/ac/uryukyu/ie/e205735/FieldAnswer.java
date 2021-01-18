package jp.ac.uryukyu.ie.e205735;

import java.util.ArrayList;
import java.util.Collections;

public class FieldAnswer {
    //ボールの位置

    private int MASU;
    private int BALL= 3;
    String[][] ballAnswer;

    FieldAnswer(int masu){
        this.MASU = masu;
        this.ballAnswer  = new String[MASU][MASU];
    }

    public void ballInstallation(){
        ArrayList<HavingTwoNumber> b = new ArrayList<HavingTwoNumber>();
        for(int i=0; i<MASU; i++){
            for(int j=0; j<MASU; j++){
                b.add(twoNumberInOneBag(i,j));
                this.ballAnswer[i][j] = "□";
            }
        }
        Collections.shuffle(b);
        for(int i=0; i<BALL; i++){
            this.ballAnswer[b.get(i).tate][b.get(i).yoko] = "●";
        }
    }

    public HavingTwoNumber twoNumberInOneBag(int _num1, int _num2){
        var bag = new HavingTwoNumber();
        bag.tate = _num1;
        bag.yoko = _num2;
        return bag;
    }

}

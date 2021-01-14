package jp.ac.uryukyu.ie.e205735;

public class Banmen {
    private int MASU;
    private String[][] masus;

    Banmen(int masu){
        MASU = masu;
        masus = new String[MASU][MASU];

        for (int j = 0; j < MASU ; j++){
            for (int i = 0; i< MASU ; i++){
                masus[i][j] = "□";
            }
        }
    }

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
                System.out.print(getMasus()[j][i]+" ");
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

    public void setMasus(int tate,int yoko){
        masus[tate][yoko] = "●";
        //return masus;
    }

    public String[][] getMasus(){
        return masus;
    }
}

package jp.ac.uryukyu.ie.e205735;

public class Banmen {
    private int MASU;

    Banmen(int masu){
        MASU = masu;
    }

    public void field(){
        char c = 'a';
        //1れつめ
        System.out.print("    ");
        for(int j = 0; j < MASU ; j++){
            System.out.print(c + " ");
            c++ ;
        }
        System.out.println();

        //２列目
        System.out.println("    1 H R H 2");

        //3れつめ
        String[] yokoyouso1 = {"3","1","H","R","H"};
        String[] yokoyouso2 = {"3","2","H","4","H"};
        for (int j = 0; j < MASU ; j++){
            System.out.print(j+" ");
            System.out.print(yokoyouso1[j]+" ");
            for (int i = 0; i< MASU ; i++){
                System.out.print("□ ");
            }
            System.out.print(yokoyouso2[j]+" ");
            System.out.println();
        }

        //さいごの列
        String[] youso = {"R","H","R","H","4"};

        System.out.print("    ");
        for (int j = 0; j < MASU ; j++){
            System.out.print(youso[j]+" ");
        }
        System.out.println();

    }
}

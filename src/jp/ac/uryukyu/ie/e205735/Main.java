package jp.ac.uryukyu.ie.e205735;

class Main{
    public static void main(String[] args) {
        var ban = new Banmen(5);
        ban.field();
        int suuzi = 'b' - 'a';
        ban.setMasus(2, suuzi);
        suuzi = 'd' - 'a';
        ban.setMasus(2, suuzi);
        ban.setMasus(4, 1);
        ban.field();
    }

    public int henkan(char eizi){
        int suuzi = eizi - 'a';
        return suuzi;
    }
}

public class Practice11 {
    enum sign {
        RED(30), GREEN(30), AMBER(10);
        int sec;
        sign(int sec) {this.sec = sec;}
        int getSec() {return sec;}
    }
    public static void main(String[] args){
        for(sign sign : sign.values()) {
            System.out.printf("%s: %s\n", sign, sign.getSec());
        }
    }
}

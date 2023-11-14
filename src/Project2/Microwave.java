package Project2;

import static java.lang.System.exit;

public class Microwave {
    private int watt;
    private int time;
    private Boolean power;
    enum Cook {
        EGG(200, 700),
        Ramen(300, 1000),
        Photato(600, 700);
        private int sec;
        private int watt;
        Cook(int sec, int watt) {
            this.sec = sec;
            this.watt = watt;
        }
        int getSec() { return sec; }
        int getWatt() { return watt; }
    }

    public Microwave() {
        this.watt = 700;
        this.time = 0;
        this.power = false;
        System.out.println("안녕하세요~ 저는 전자레인지입니다.");
        print();
    }
    public void setWatt(int watt) {
        this.watt = watt;
        print();
    }
    public void setTime(int time) {
        this.time = time;
        print();
    }
    public void setPower(Boolean p) {
        this.power = p;
    }
    public void setting(int n) {
        switch (n){
            case 1:
                this.time = Cook.EGG.getSec();
                this.watt = Cook.EGG.getWatt();
                break;
            case 2:
                this.time = Cook.Ramen.getSec();
                this.watt = Cook.Ramen.getWatt();
                break;
            case 3:
                this.time = Cook.Photato.getSec();
                this.watt = Cook.Photato.getWatt();
                break;
            default:
                break;
        }
        print();
    }
    private void print() {
        System.out.printf("소비전력: %dW, 요리 시간: %d초, 동작 중: %s\n", this.watt, this.time, power ? "예" : "아니오");
    }
    public void start() {
        if (this.time == 0)
            System.out.println("요리 시간이 설정되지 않았습니다.");
        else {

            setPower(true);
            System.out.println("동작을 시작합니다.");
            print();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("동작이 중지되었습니다.");
            this.watt = 700;
            this.time = 0;
            setPower(false);
            print();
        }
    }
    public void off() {
        System.out.println("안녕히 계세요~ 전자레인지였습니다.");
        exit(0);
    }
}

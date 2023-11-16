package Week11;

class HelloFrench extends Hello {
    public HelloFrench(String whom) {
        super(whom);
    }
    @Override
    public void sayHello() {
        System.out.println("Bonjour " + getToWhom());
    }
}

class HelloSpanish extends Hello {
    public HelloSpanish(String whom) {
        super(whom);
    }
    @Override
    public void sayHello() {
        System.out.println("Hola a todos  " + getToWhom());
    }
}

class HelloKorean extends Hello {
    public HelloKorean(String whom) {
        super(whom);
    }
    @Override
    public void sayHello() {
        System.out.println("안녕하세요 " + getToWhom());
    }
}
package Week11;

abstract class Hello {
    private String toWhom;
    public Hello(String whom) { toWhom = whom; }
    public String getToWhom() { return toWhom; }
    public abstract void sayHello();
}

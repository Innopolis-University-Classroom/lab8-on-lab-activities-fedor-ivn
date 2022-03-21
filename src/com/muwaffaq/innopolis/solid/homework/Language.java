public interface Language {
    void sayHello();
}

class Arabic implements Language {
    @Override
    public void sayHello() {
        return "مرحبا";
    } 
}

class English implements Language {
    @Override
    public void sayHello() {
        return "Hello";
    } 
}

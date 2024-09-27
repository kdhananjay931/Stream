class SimpleClass {
    public void method(String str){
        System.out.println("String method " + str);
    }
    public void method(Object obj) {
        System.out.println("Object method " + obj);
    }
    public static void main(String[] args) {
        SimpleClass instance = new SimpleClass();
        instance.method("Hello");
        instance.method(new String("World"));
        String str = new String("Mango");
        instance.method((Object)str);
        instance.method(null);
    }
}
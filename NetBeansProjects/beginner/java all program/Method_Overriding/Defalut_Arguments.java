package Method_Overriding;

class Defalut_Arguments {

    String name;
    int id;
    boolean ex;

    void Display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("He is " + ex + " man");
    }
}

class pass_Arguments {

    public static void main(String[] args) {
        Defalut_Arguments ob = new Defalut_Arguments();
        ob.Display();
    }

}

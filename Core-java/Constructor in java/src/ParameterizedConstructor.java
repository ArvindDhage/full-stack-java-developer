public class ParameterizedConstructor {
    int id;
    String name;
    ParameterizedConstructor(int i, String n){
        id = i;
        name = n;
    }
    void display() {
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        ParameterizedConstructor pc = new ParameterizedConstructor(1, "Arvind");
        pc.display();
    }
}

/*
* ✅ 5️⃣ Parameterized Constructor
📌 Definition:

A constructor that accepts parameters.
* */
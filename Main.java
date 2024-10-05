class ContohOverloading {
    // Method overloading dengan jumlah parameter yang sama namum tipenya berbeda.
    public String add(String a, String b) {
        String hasil = "Parameter 1 = " + a + "; Parameter 2 = " + b + "";
        return hasil;
    }
    
    public String add(String a, int b) {
        String hasil = "Parameter 1 = " + a + "; Parameter 2 = " + b + "";
        return hasil;
    }
}

public class Main {
    public static void main(String[] args) {
        ContohOverloading over = new ContohOverloading();
        System.out.println(over.add("Habib", "Azizul"));        // Output: Parameter 1 = Habib; Parameter 2 = Azizul
        System.out.println(over.add("Habib", 50));     // Output: Parameter 1 = Habib; Parameter 2 = 50
    }
}

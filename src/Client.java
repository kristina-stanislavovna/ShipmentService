public class Client {
    private double id;
    private String name;
    private int balance;

    public Client(double id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public double getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

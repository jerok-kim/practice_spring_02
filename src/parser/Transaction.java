package parser;

public class Transaction {
    
    private int id;
    private String div;
    private String sender;
    private String receiver;
    private int amount;

    public Transaction(int id, String div, String sender, String receiver, int amount) {
        this.id = id;
        this.div = div;
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

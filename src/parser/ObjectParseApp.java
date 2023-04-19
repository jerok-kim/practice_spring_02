package parser;

import com.google.gson.Gson;

public class ObjectParseApp {

    public static void main(String[] args) {
        String json = "{\"id\":6,\"div\":\"입금\",\"sender\":\"ATM\",\"receiver\":\"1111\",\"amount\":100}";
        // System.out.println(json.amount);
        Gson gson = new Gson();
        Transaction transaction = gson.fromJson(json, Transaction.class);
        System.out.println("id : " + transaction.getId());
        System.out.println("div : " + transaction.getDiv());
        System.out.println("sender : " + transaction.getSender());
        System.out.println("receiver : " + transaction.getReceiver());
        System.out.println("amount : " + transaction.getAmount());
    }

}

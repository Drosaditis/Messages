
public class Main {

    public static void main(String[] args) {
        Codes codes= new Codes();
        SentMessage a = new SentMessage(codes);
        String number1=codes.phoneNumber;
        a.callForFood(number1);
    }
}

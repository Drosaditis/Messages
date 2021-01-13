import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.apache.http.auth.AUTH;


public class SentMessage{

    public static String ACCOUNT_SID;
    public static String AUTH_TOKEN;
    public static String BOT_NUMBER;

    public SentMessage(Codes codes) {
        ACCOUNT_SID = codes.ACCOUNT_SID;
        AUTH_TOKEN = codes.AUTH_TOKEN;
        BOT_NUMBER = codes.BOT_NUMBER;

    }

    public void callForFood(String number) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    Message message = Message.creator(
            new com.twilio.type.PhoneNumber("whatsapp:+30"+number),
            new com.twilio.type.PhoneNumber(BOT_NUMBER),
            "Come to eat, the food is ready!")
            .create();

    System.out.println(message.getSid());
}
        }

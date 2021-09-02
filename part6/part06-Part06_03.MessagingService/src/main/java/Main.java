
public class Main {

    public static void main(String[] args) {

        // Try out your class here

        Message message1 = new Message("Amy", "Hello,everyone！");

        Message message2 = new Message("john", "Hello,world!Hello,world!");

        MessagingService service = new MessagingService();
        service.add(message1);
        service.add(message2);
        service.getMessages();
    }
}

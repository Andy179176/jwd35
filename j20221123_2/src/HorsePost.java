public class HorsePost implements MailDeliveryService {
    @Override
    public void sendMail() {
        System.out.println("Поскакали!!!!");
    }
}

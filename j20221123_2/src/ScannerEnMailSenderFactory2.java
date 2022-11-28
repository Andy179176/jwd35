import java.util.Scanner;

public class ScannerEnMailSenderFactory2 implements MailSenderFactory {

    public MailSender getSender(){
        Scanner scanner= new Scanner(System.in);
        SendType[] types = SendType.values();
        for (int i = 0; i < types.length ; i++) {
            System.out.printf("%d. %s%n",i+1, types[i].getTypeName());
        }
        int choice = scanner.nextInt();
        MailSender mailSender =null;
        if(choice>0 && choice<= types.length){
            mailSender =new MailSender(types[choice-1].getSender());
        }
        return mailSender;
    }

}

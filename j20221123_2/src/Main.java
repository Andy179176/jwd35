/*
• Создать интерфейс MailDeliveryService с одним методом void sendMail().
• Создайте класс DHL, который должен реализовать интерфейс MailDeliveryService. Его способ отправки почты — напечатать что-то вроде: «Положи письмо в конверт, поставь марку, отправь».
• Создайте класс Email, который должен реализовать интерфейс MailDeliveryService. Его способ отправки почты - напечатать что-то вроде: «Отправить по Интернету».
• Создайте класс Pigeon, который должен реализовать интерфейс MailDeliveryService. Его способ отправки почты — напечатать что-то вроде: «Голубь?! Серьезно!? в двадцать первом веке?!!! Ты сумасшедший! Я улетаю»
• Создайте класс Sender. Реализуйте в нем метод send(), который в качестве аргумента MailDeliveryService и отправляет почту с помощью данной службы.
• Реализуйте диалог с пользователем (использовать Scanner), как отправлять почту и отправлять ее с помощью Sender.

 */


public class Main {
    public static void main(String[] args) {

        MailSenderFactory senderFactory = new ScannerEnMailSenderFactory2();
        MailSender mailSender =senderFactory.getSender();



            //-----------------------------------------
        mailSender.send();


    }



}
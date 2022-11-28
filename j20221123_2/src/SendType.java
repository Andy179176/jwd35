public enum SendType  {
    DHL("DHL",new DHL()),
    EMAIL("Email", new Email()),
    PIGEON("Pigeon", new Pigeon()),
    HORSE("Horse post", new HorsePost());

    private String typeName;
    private MailDeliveryService sender;

    SendType(String typeName, MailDeliveryService sender) {
        this.typeName = typeName;
        this.sender = sender;
    }

    public String getTypeName() {
        return typeName;
    }

    public MailDeliveryService getSender() {
        return sender;
    }
}

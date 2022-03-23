package uaslp.objetos.parcial2.exam.messagebuilder;

public class MessageBuilderFactory extends MessageBuilder{
    private static String message;

    public static MessageBuilder getMessageBuilder(MessageType messageType) {
        switch (messageType) {
            case RESERVATION_CREATE -> message = "Create reservation";
            case RESERVATION_MODIFY -> message = "Modify reservation";
            case RESERVATION_CHECKIN -> message = "Check in reservation";
            case RESERVATION_CHECKOUT -> message = "Check out reservation";
        }
        return new MessageBuilderFactory();
    }

    @Override
    protected String getDescription() {
        return message;
    }

}

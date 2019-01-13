package rx;

public interface RxDTO {
    Action getAction();

    default Class<? extends RxNotifier> getNotifierClazz() {
        return RxNotifier.UnidentifiedNotifier.class;
    }

    default RxNotifier getNotifier() {
        return new RxNotifier.UnidentifiedNotifier();
    }

    Class<?> getTransferredClazz();

    Object getTransferredObject();
}
package rx;

public interface RxNotifier {
    /**
     * Default Notifier class for RxNotifier.
     * This class will be put into default RxDTO implementations.
     * Please create specific classes for more purposes.
     */
    class UnidentifiedNotifier implements RxNotifier {
    }
}

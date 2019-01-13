package rx;

import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class RxFactory {
    public static Subject<RxDTO> defaultSubject() {
        return PublishSubject.create();
    }
}
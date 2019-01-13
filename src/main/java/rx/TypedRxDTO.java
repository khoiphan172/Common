package rx;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import model.Model;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Model
public final class TypedRxDTO implements RxDTO {
    private Action action;

    private Class<?> transferredClazz;

    private Object transferredObject;

    public TypedRxDTO(Action action) {
        this.action = action;
    }
}
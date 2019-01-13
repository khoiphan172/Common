package rx;

public interface Action {
    default String getName() {
        return this.toString();
    }

    default String getDescription() {
        return this.toString();
    }
}
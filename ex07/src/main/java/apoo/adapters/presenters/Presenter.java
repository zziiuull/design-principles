package apoo.adapters.presenters;

public interface Presenter<T> {
    void showSuccess(T data);
    void showError(String message);
}

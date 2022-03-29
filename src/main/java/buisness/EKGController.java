package buisness;

public interface EKGController {
    void startRecording();
    void registerObserver(EKGObserver ekgObserver);
}

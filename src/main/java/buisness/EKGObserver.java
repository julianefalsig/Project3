package buisness;

import data.EKGData;

public interface EKGObserver {
    void handle(EKGData ekgData);
}


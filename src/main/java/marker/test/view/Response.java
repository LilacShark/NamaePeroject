package marker.test.view;

import java.io.Serializable;

public class Response implements Serializable {

    private boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}

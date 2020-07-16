package fr.gcrevisy.media.model.technique;

/**
 * ResultJson
 */
public class MediaHttpResponse {

    private String message;

    public MediaHttpResponse() {
        message = new String("");
    }

    public MediaHttpResponse(String msg) {
        message = msg;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
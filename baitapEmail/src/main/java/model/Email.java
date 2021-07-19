package model;

public class Email {
    private String language;
    private int pathSize;
    private boolean filter;
    private String  signature;

    public Email() {
    }

    public Email(String language, int pathSize, boolean filter, String signature) {
        this.language = language;
        this.pathSize = pathSize;
        this.filter = filter;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPathSize() {
        return pathSize;
    }

    public void setPathSize(int pathSize) {
        this.pathSize = pathSize;
    }

    public boolean isFilter() {
        return filter;
    }

    public void setFilter(boolean filter) {
        this.filter = filter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}

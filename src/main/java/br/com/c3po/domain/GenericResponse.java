package br.com.c3po.domain;

import java.util.ArrayList;
import java.util.List;

public class GenericResponse {
    private String code = null;
    private List<String> messages = new ArrayList<>();

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

    public List<String> getMessages() { return messages; }

    public void addMessage(String message) {
        this.messages.add(message);
    }
}

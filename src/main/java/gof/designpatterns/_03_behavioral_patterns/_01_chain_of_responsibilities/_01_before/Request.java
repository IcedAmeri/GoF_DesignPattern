package gof.designpatterns._03_behavioral_patterns._01_chain_of_responsibilities._01_before;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Request {
    private String body;

    public Request(String body) {
        this.body = body;
    }
}

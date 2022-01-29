package gof.designpatterns._02_structural_patterns._05_facade._02_after;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EmailMessage {

    private String from;
    private String to;
    private String subject;
    private String text;


}

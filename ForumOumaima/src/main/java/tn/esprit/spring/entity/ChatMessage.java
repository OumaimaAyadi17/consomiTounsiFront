package tn.esprit.spring.entity;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ChatMessage {
    private String text;
    private User user;
    private Long destination;
    private LocalDateTime date;

    public ChatMessage(String s) {
        this.text = s;
    }
}
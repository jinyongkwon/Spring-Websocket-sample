package site.meatcoding.websockettest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Greeting {
    // 내용을 받음.
    private String content;
}

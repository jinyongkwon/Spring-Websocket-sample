package site.meatcoding.websockettest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class HelloMessage {
    // 사용자 이름 받음.
    private String name;
}

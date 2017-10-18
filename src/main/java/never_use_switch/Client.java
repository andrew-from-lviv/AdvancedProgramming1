package never_use_switch;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {
    private String name;
    private int age;

    public String getEmail() {
        return Email;
    }

    private String Email;

}

package Quest;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
public class EasyQuest implements Quest {
    private String name;
    private float exp;

    @Override
    public String getInfo() {
        return "This is easy quest .";
    }

    @Override
    public float complete() {
        return exp;
    }
}

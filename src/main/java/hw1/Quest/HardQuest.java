package hw1.Quest;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class HardQuest implements Quest {
    private float coins;
    private float exp;
    private String name;


    @Override
    public String getInfo() {
        return "This is hard quest ! If you complete you will get " + coins + " coins and " + exp + " experience";
    }

    @Override
    public float complete() {
        return exp;
    }
}

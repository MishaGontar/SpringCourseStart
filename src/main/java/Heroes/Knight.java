package Heroes;

import Quest.Quest;
import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class Knight {
    @NonNull
    private String name;
    private float exp = 0;
    private int level = 1;
    private int coins ;
    private Quest quest;

    public void completeQuest() {
        System.out.println("\n **********WOW you have completed the quest!********** \n");
        exp += quest.complete();
        coins += quest.complete()/2;
        setQuest(null);
    }

    public void about() {
        String aboutQuest = quest != null ? quest.getInfo() : "no quest";
        System.out.println(
                "\n This is Heroes " + name + "\n" +
                        "Exp : " + exp + "\n" +
                        "Level : " + level + "\n" +
                        "Coins: " + coins + "\n"+
                        "Quest: " + aboutQuest + "\n"

        );
    }
}

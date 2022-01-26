package hw1;

import hw1.Heroes.Knight;
import hw1.Quest.Quest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configH1.xml");
        Knight k = context.getBean("knight", Knight.class);
        k.about();
        k.setQuest(context.getBean("easyQ", Quest.class));
        k.about();
        k.completeQuest();
        k.about();
        k.setQuest(context.getBean("hardQ", Quest.class));
        k.about();
    }
}

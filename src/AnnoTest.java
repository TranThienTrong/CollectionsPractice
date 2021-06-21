import org.jetbrains.annotations.Async;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Games.class)
@interface Game {
    String name();
    String day();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Games {
    Game[] value();
}
@Game(name = "Cricket",  day = "Sunday")
@Game(name = "Hockey",   day = "Friday")
@Game(name = "Football", day = "Saturday")

public class AnnoTest {

    public static void main(String[] args) {
        Game[] game = AnnoTest.class.getAnnotationsByType(Game.class);
        for (Game currGame : game) {
            System.out.println(currGame.name()+" on "+currGame.day());
        }

    }
}

package examples.ocp.chapter13;

import java.lang.annotation.Repeatable;

@Repeatable(Presents.class)
public @interface Gift {
    String value();
}

@interface Presents {
    Gift[] value();
}

@Gift("book")
@Gift("toy")
class Surprise {

}

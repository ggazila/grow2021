package examples.ocp.chapter3;

public interface SixthQuestion {
    //default method can't be final, static, or private
     default void some() {

    }
}

class A implements SixthQuestion {
    @Override
    public void some() {
        SixthQuestion.super.some();
    }
}

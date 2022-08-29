package lesson7;

public abstract class OperationSystem {

    public abstract void initSystem();

    public void close() {
        System.out.println("system is shouting down");
    }
}

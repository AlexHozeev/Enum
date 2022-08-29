package lesson7;

public class los extends OperationSystem {
    private boolean isInitialized;

    public void payForInitialization(int amount) {
        if (amount > 5) {
            isInitialized = true;
            return;
        }
        System.out.println("give me more money");
    }


    @Override
    public void initSystem() {
        String massage = isInitialized ? "hello from apple" : "sorry sys is blocked";
        System.out.println(massage);

    }
}

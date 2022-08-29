package lesson7;

public class Main {
    public static void main(String[] args) {
        OperationSystem operationSystem = new OperationSystem() {
            @Override
            public void initSystem() {
                System.out.println("windows is booting");
            }
        };
        operationSystem.initSystem();
    }

        public static void bootEnithing(OperationSystem operationSystem){
        operationSystem.initSystem();
        operationSystem.close();
    }
}

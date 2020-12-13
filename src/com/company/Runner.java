package com.company;

public class Runner extends Thread {
    private Runner doRunner;
    private Runner posleRunner;

    public Runner(String name) {
        super(name);
    }

    public void setRunners(Runner doRunner, Runner posleRunner) {
        this.doRunner = doRunner;
        this.posleRunner = posleRunner;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " Берет палочку");
            if (getName() == "Runner 5") {
                System.out.println(getName() + " Бежит к финишу");
                System.out.println(getName() + " Бежит к " + doRunner.getName());
                sleep(5000);
            } else {
                System.out.println(getName() + " Бежит к " + posleRunner.getName());
                sleep(5000);
                posleRunner.start();
                posleRunner.join();
            }

            if (getName() != "Runner 5") {
                System.out.println(getName() + " Берет палочку ");
                if(getName()!="Runner 1")
                System.out.println(getName() + " Бежит к " + doRunner.getName());
                sleep(5000);
            }
        } catch (Exception ignore) {

        }
    }
}

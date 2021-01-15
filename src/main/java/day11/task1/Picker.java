package day11.task1;

public class Picker extends abstractWorker implements Worker {

    private Warehouse work;

    public Picker(Warehouse work) {
        this.work = work;
    }

    @Override
    public void doWork() {
        this.salary += 80;
        work.incCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (this.isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        if (work.getCountPickedOrders() >= 10000) {
            this.salary += 70000;
            this.isPayed = true;

        } else {
            System.out.println("Бонус пока не доступен");
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + super.salary +
                ", isPayed=" + super.isPayed +
                '}';
    }

}

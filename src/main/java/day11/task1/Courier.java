package day11.task1;

public class Courier extends abstractWorker implements Worker{

    private Warehouse work;

    public Courier(Warehouse work) {
        this.work = work;
    }


    @Override
    public void doWork() {
        this.salary +=100;
        work.incCountDeliveredOrders();
    }

    @Override
    public void bonus() {

        if (this.isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        if (work.getCountDeliveredOrders() >= 10000) {
            this.salary += 50000;
            this.isPayed = true;
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + this.salary +
                ", isPayed=" + this.isPayed +
                '}';
    }
}

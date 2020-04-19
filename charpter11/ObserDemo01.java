import java.util.Observable;
import java.util.Observer;

/**
 * JDK9之后已弃用
 */
class House extends Observable {
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        // 每一次修改的时候应该引起观察者的注意
        super.setChanged();// 设置变化点
        super.notifyObservers(price);// 改变价格
        this.price = price;
    }

    private float price;

    public House(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "房子的价格为：" + this.price;
    }
}

class HousePriceObserver implements Observer {
    private String name;

    /**
     * 设置每一个购房者的名字
     *
     * @param name
     */
    public HousePriceObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Float) {
            System.out.print(this.name + "观察到价格更改为：");
            System.out.println((Float) ((Float) arg).floatValue());
        }
    }
}

public class ObserDemo01 {
    public static void main(String[] args) {
        House h = new House(1000000);
        HousePriceObserver hpo1 = new HousePriceObserver("购房者A");
        HousePriceObserver hpo2 = new HousePriceObserver("购房者B");
        HousePriceObserver hpo3 = new HousePriceObserver("购房者C");
        h.addObserver(hpo1);
        h.addObserver(hpo2);
        h.addObserver(hpo3);
        System.out.println(h);
        h.setPrice(6666666);
        System.out.println(h);
    }
}

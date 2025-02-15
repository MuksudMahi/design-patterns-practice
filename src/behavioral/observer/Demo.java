package behavioral.observer;

public class Demo {
    public static void show(){
        var dataSource = new DataSource();

        var sheet = new SpreadSheet();
        var chart = new Chart();
        dataSource.addObserver(sheet);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
    }
}

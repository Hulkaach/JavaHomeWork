package JavaHomeWork.S6;
/**
 *• Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 *         * • Создать множество ноутбуков.
 *         * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 *         * “Введите цифру, соответствующую необходимому критерию:
 *         * 1 - ОЗУ
 *         * 2 - Объем ЖД
 *         * 3 - Операционная система
 *         * 4 - Цвет …
 *         * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 *         * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

public class Notebook {
    Integer ozy;
    Integer volumeHD;
    String operationSystem;
    String color;

    public Notebook(Integer ozy, Integer volumeHD, String operationSystem, String color) {
        this.ozy = ozy;
        this.volumeHD = volumeHD;
        this.operationSystem = operationSystem;
        this.color = color;
    }

    public Integer getOzy() {
        return ozy;
    }

    public Integer getVolumeHD() {
        return volumeHD;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public String getColor() {
        return color;
    }

    public void setOzy(Integer ozy) {
        this.ozy = ozy;
    }

    public void setVolumeHD(Integer volumeHD) {
        this.volumeHD = volumeHD;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "ozy=" + ozy +
                ", volumeHD=" + volumeHD +
                ", operationSystem='" + operationSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    
}

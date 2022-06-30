//Создайте класс Самолет. В классе создайте вложенный
//        класс крыло.
//        Внутри класса Крыло реализуйте:
//        поле для хранения информации про вес крыла;
//        метод, что будет показывать вес крыла.
//
//        Выполните предыдущее задание. В главном классе создайте
//        объект и добавьте во вложенный класс данные про вес крыла,
//        а также выведите информацию на экран. Создайте два
//        объекта и добавьте разный вес для крыльев.

public class Plane {
    public String name;
    private Wing wing;

    //Создаем нестатический вложенный класс
    private class Wing {
        private int weight;

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void wingInfo() {
            System.out.println("   вес крыла: " + this.weight);
        }
    }

    public Plane(String name, int x) {
        this.name = name;
        Wing wing = new Wing();
        this.wing = wing;
        this.wing.setWeight(x);
    }

    public void showPlaneInfo() {
        System.out.print("Название самолета: " + this.name + " ");
        this.wing.wingInfo();
    }

}



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


public class Main {
    public static void main(String[] args) {

        Plane plane = new Plane("TU-134", 200);
        Plane plane2 = new Plane("AirBus", 500);

        plane.showPlaneInfo();
        plane2.showPlaneInfo();

    }
}

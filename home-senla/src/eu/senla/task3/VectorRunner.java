package eu.senla.task3;

import java.sql.SQLOutput;

/**
 На вход приходят 2 вектора, описанные координатами точек начала (x1,y1) и конца (x2,y2) вектора.
 Найти длины векторов, а так же вектор произведения первого вектора на второй и второго на первый (получим 2 новых вектора).
 Векторы выводить в формате “начало (x1,y1), конец (x2,y2).
 **/
public class VectorRunner {
    public static void main(String[] args) {

        double x1 = 10; //Начало первого вектора
        double x2 = 13; //Конец первого вектора
        double y1 = 7; //Начало второго вектора
        double y2 = 8.5; //Конец второго вектора

        Vector vector = new Vector(x1,x2,y1,y2);

        double firstVector = vector.sumVector(x1,x2); //длинна первого вектора
        double secondVector = vector.sumVector(y1,y2); //длинна второго вектора
        double multipliedFirst = vector.multipliedVectors(firstVector,secondVector); //произведение векторов
        double multipliedSecond = vector.multipliedVectors(secondVector, firstVector);

        System.out.println("Начало первого вектора " + vector.getX1() + ", конец первого вектора " + vector.getX2());
        System.out.println("Начало второго вектора " + vector.getY1() + ", конец второго вектора " + vector.getY2());
        System.out.println(firstVector + " - длинна первого вектора");
        System.out.println(secondVector + " - длинна второго вектора");
        System.out.println(multipliedFirst + " - произведение первого вектора на второй");
        System.out.println(multipliedSecond + " - произведение второго вектора на первый");

    }

}

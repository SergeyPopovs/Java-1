package com.company;
import java.util.Scanner;

class Stack_test {
    public static void main(String[] args)
            throws java.io.IOException {
        System.out.println("===========ДОБАВЛЕНИЕ ЭЛЕМЕНТА И РАСШИРЕНИЕ МАССИВА===========");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите глубину стека для сохранения чисел:");
        int size= scanner.nextInt();
        Stack bignum = new Stack(size);
        System.out.println("Введите количество элементов помещаемых в стек:");
        int quant= scanner.nextInt();
        int num=0;
        System.out.println("Наполнение стека bignum числами:");
        for (int i = 0; i < quant; i++) {
            num=i;
            bignum.add(num);
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Извлечение содержимого из стека bignum: ");
        for (int i = 0; i <quant ; i++) {
            System.out.print(bignum.pop() + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("===========ВОЗВРАЩЕНИЕ И УДАЛЕНИЕ ПОСЛЕДНЕГО ЭЛЕМЕНТА,ИЗМЕНЕНИЕ СЧЕТЧИКА===========");
        System.out.println("Повторное наполнение стека bignum числами:");
        for (int i = 0; i < quant; i++) {
            num=i;
            bignum.add(num);
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Первый элемент стека: "+ bignum.pop());
        System.out.println("Извлечение содержимого из стека bignum после удаления первого элемента: ");
        for (int i = 0; i < quant; i++) {
            try {
                System.out.print(bignum.pop() + " ");
            } catch (IndexOutOfBoundsException e) { }
        }
        System.out.println();
        System.out.println();
        System.out.println("===========ВОЗВРАЩЕНИЕ ЭЛЕМЕНТА С ЗАДАННЫМ ИНДЕКСОМ ОТ КОНЦА МАССИВА БЕЗ ЕГО УДАЛЕНИЯ===========");
        System.out.println("Повторное наполнение стека bignum числами:");
        for (int i = 0; i < quant; i++) {
            num=i;
            bignum.add(num);
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Введите номер индекса элемента в массиве с конца:");
        int index= scanner.nextInt();
        try {
            System.out.println("Элемент массива по индексу "+index+" с конца: "+ bignum.get(index));;
        } catch (IndexOutOfBoundsException e) {System.out.println("Индекс "+index+" за пределами массива,элемент не существует");}

    }
}
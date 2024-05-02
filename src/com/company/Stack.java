package com.company;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Stack implements List<Integer> {
    int st[];
    int st_new[];
    int putloc, getloc;

    Stack(int size) {
        st = new int[size];
        putloc = getloc = -1;
    }
    //помещение числа в стек и увеличение стека при его заполнение в два раза с копированием элементов
    void push(int num) {
        if (putloc == st.length-1) {
            st_new = new int[st.length*2+2];
            for (int k=0;k<= putloc;k++){
                st_new[k]=st[k];
            }
            //st_new[++putloc] = num;
            st=st_new;
            System.out.println("Стек заполнен, создан новый стек увеличенный в 2 раза");
        }
        st[++putloc] = num;
    }
    //извлечение числа из стека
    int pop() {
        if (putloc ==-1) {
            throw new IndexOutOfBoundsException("Стек пуст,выход за пределы массива index="+putloc);
        }
        return st[putloc--];
    }

    //извлечение элемента из массива с заданным индексом с конца
    int pop_index(int index){
        if (putloc ==-1) {
            throw new IndexOutOfBoundsException("Стек пуст,выход за пределы массива index="+putloc);
        }
        if (index<0||index>putloc){
            throw new IndexOutOfBoundsException("Выход за пределы массива index="+putloc);
        }
        int b=st[putloc-index];
        return b;
    }

    //метод для добавления элементов в стек и увеличения стека при переполнении в 2 раза
    @Override
    public boolean add(Integer num) {
        push(num);
        return true;
    }

    //метод извлечения элемента массива по индексу с конца без удаления
    @Override
    public Integer get(int index) {
        return pop_index(index);
    }

    //метод определения содержит ли стек некий элемент int
    @Override
    public boolean contains(Object o) {
        if (!(o instanceof Integer)) {
            return false;
        }
        int num = (Integer) o;
        for (int i = 0; i <= putloc; i++) {
            if (st[i] == num) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer set(int index, Integer element) {
        throw new UnsupportedOperationException("Метод set(int index, Integer element) не реализован");
    }
    //метод удаления элемента с вершины стека со смещением
    @Override
    public Integer remove(int index) {
           throw new UnsupportedOperationException("Метод remove(int index) не реализован");
    }
    //Метод используется для удаления всех элементов списка
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Метод clear() не реализован");
    }
    //метод используется для добавления элемента element на указанную позицию index
    @Override
    public void add(int index, Integer element) {
        throw new UnsupportedOperationException("Метод add(int num, Integer element) не реализован");
    }
    //метод определения размера заполненности стека
    @Override
    public int size() {
        throw new UnsupportedOperationException("Метод size() не реализован");
    }
    //метод определения пустого стека
    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Метод isEmpty() не реализован");
    }
    //метод возвращает итератор для обхода элементов в стеке
    @Override
    public Iterator<Integer> iterator() {
        throw new UnsupportedOperationException("Метод Iterator() не реализован");
    }
    //метод возвращает массив, содержащий все элементы в стеке в порядке от вершины стека к его основанию
    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Метод toArray() не реализован");
    }
    //метод преобразования коллекции в массив
    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Метод toArray(T[] a) не реализован");
    }
    //метод проверки возможности удаления из стека
    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Метод remove(Object o) не реализован");
    }
    //метод проверки наличия всех элементов стеке
    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Метод containsAll(Collection<?> c) не реализован");
    }
    //метод проверки возможности расширения стека элементами переданной коллекции
    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        throw new UnsupportedOperationException("Метод addAll(Collection<? extends Integer> c) не реализован");
    }
    //метод добавления элементов из указанной коллекции c в стек начиная с указанного индекса index
    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        throw new UnsupportedOperationException("Метод addAll(int index, Collection<? extends Integer> c) не реализован");
    }
    // метод проверки операции удаления всех элементов из стека, которые содержатся в переданной коллекции c
    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Метод removeAll(Collection<?> c) не реализован");
    }
    // метод проверки операции оставления только тех элементов в стеке, которые содержатся в переданной коллекции c
    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Метод retainAll(Collection<?> c) не реализован");
    }
    //метод для поиска индекса указанного элемента o
    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Метод indexOf(Object o) не реализован");
    }
    //метод для поиска индекса последнего вхождения указанного элемента o
    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Метод lastIndexOf(Object o) не реализован");
    }
    //метод возвращает итератор для перебора элементов в списке
    @Override
    public ListIterator<Integer> listIterator() {
        throw new UnsupportedOperationException("Метод listIterator() не реализован");
    }
    //метод для создания итератора, начинающего перебор элементов с указанного индекса в списке
    @Override
    public ListIterator<Integer> listIterator(int index) {
        throw new UnsupportedOperationException("Метод listIterator(int index) не реализован");
    }
    // метод создания подсписка из исходного списка, содержащего элементы с индекса fromIndex до toIndex-1
    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Метод subList(int fromIndex, int toIndex) не реализован");
    }
}

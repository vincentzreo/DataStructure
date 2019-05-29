package com.zzq.Array;

/**
 * 动态数组的实现
 * @param <E>
 */
public class Array<E> {

    private E[] data;
    private int size;

    /**
     * 构造函数
     * 传入数组的容量构造Array
     * @param capacity 数组容量
     */
    public Array(int capacity){
        data = (E[])new Object[capacity];
        size = 0;
    }

    /**
     * 无参构造函数，默认数组容量capacity为10
     */
    public Array(){
        this(10);
    }

    /**
     *
     * @return 放回数组中元素的个数
     */
    public int getSize() {
        return size;
    }

    /**
     *
     * @return 获取数组的容量
     */
    public int getCapacity(){
        return data.length;
    }

    /**
     *
     * @return 返回数组是否为空
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 向所有元素后添加一个新的元素
     * @param e
     */
    public void addLast(E e){
       /* if (size == data.length){
            throw new IllegalArgumentException("AddLast failed.Array is full");
        }
        data[size] = e;
        size ++;*/
       add(size,e);
    }

    /**
     * 在数组的开始位置插入
     * @param e
     */
    public void addFirst(E e){
        add(0,e);
    }

    /**
     * 在数组任意位置插入
     * @param index
     * @param e
     */
    public void add(int index,E e){

        if (index < 0 || index > size){
            throw new IllegalArgumentException("AddLast failed.Requie index >=0 and <=size");
        }
        if (size == data.length){
            resize(2*data.length);
        }
        for (int i = size - 1 ; i >= index ; i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size ++;
    }

    /**
     * 获取索引位置的元素
     * @param index
     * @return
     */
    public E get(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("get failed.index is illegal");
        }
        return data[index];
    }
    public E getLast(){
        return get(size-1);
    }
    public E getFirst(){
        return get(0);
    }


    /**
     * 修改index索引位置的元素为e
     * @param index
     * @param e
     */
    void set(int index,E e){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("get failed.index is illegal");
        }
        data[index] = e;
    }

    /**
     * 查找数组中是否存在e
     * @param e
     * @return
     */
    public boolean contains(E e){
        for (int i = 0 ; i < size ; i ++){
            if (data[i].equals(e))
                return true;
        }
        return false;
    }

    /**
     * 查找元素中e的索引，若不存在，则返回-1
     * @param e
     * @return
     */
    public int find(E e){
        for (int i = 0 ; i < size ; i ++){
            if (data[i].equals(e))
                return i;
        }
        return -1;
    }

    /**
     * 从数组中删除某个索引的元素，并返回它的值
     * @param index
     * @return
     */
    public E remove(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("get failed.index is illegal");
        }
        E ret = data[index];
        for (int i = index + 1 ; i <size ; i ++){
            data[i-1] = data[i];
        }
        size --;
        data[size] = null;//loitering objects != memory leak
        if (size == data.length / 4 && data.length / 2 != 0){
            resize(data.length / 2);
        }
        return ret;
    }
    public E removeFirst(){
        return remove(0);
    }
    public E removeLast(){
        return remove(size-1);
    }
    //从数组中删除元素e
    public void removeElement(E e){
        int index = find(e);
        if (index != -1)
            remove(index);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size= %d,capacity = %d\n",size,data.length));
        res.append('[');
        for (int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if (i != size - 1){
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }

    /**
     * 扩容
     * @param newCapacity
     */
    private void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity];
        for (int i = 0; i < size ; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}

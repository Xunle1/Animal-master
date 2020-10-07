package menu;

import animal.Animal;

import java.util.ArrayList;

/**
 * Filename: AnimalInterface.java
 * 添加动物信息
 * 修改动物信息
 * 删除动物信息
 * 查询动物信息
 * 按年龄排序
 * 遍历
 * @author: Xunle
 * @date: 2020/10/07
 */
public interface AnimalInterface {
    /**
     * 添加动物信息
     * @param list 传入动物集合
     */
    void add(ArrayList<Animal> list);
    /**
     * 修改动物信息
     * @param list 传入动物集合
     */
    void modify(ArrayList<Animal> list);
    /**
     * 删除动物信息
     * @param list 传入动物集合
     */
    void delete(ArrayList<Animal> list);

    /**
     * 查询动物信息
     * @param list 传入动物集合
     */
    void find(ArrayList<Animal> list);

    /**
     * 按年龄排序
     * @param list 传入动物集合
     */
    void sort(ArrayList<Animal> list);

    /**
     * 遍历动物集合
     * @param list 传入动物集合
     */
    void traverse(ArrayList<Animal> list);
}

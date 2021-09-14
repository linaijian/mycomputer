package org.wcy.gen.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2021-09-13
 */
public class Test {
    private Integer id;

    /**
     * 名字
     */
    private String name;

    /**
     * 年龄
     */
    private String age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }
}
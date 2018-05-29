package com.itcast.domain;


import java.util.Date;

/**
 * 用户类的实体类
 */
public class Customer {

    private String id; //用户的ID ， 自动生成

    private String name; //用户的账号名 ----> 手机号码

    private String password; //密码

    private String nickname; //昵称

    private String headPicture; //用户的头像的地址

    private String gender; //用户的性别

    private Integer height; //用户的身高

    private Double weight;  //用户的体重

    private Date birthday; //用户的出生日期

    private String city;//用户的所在城市

    private String sleepvoicePath; //用户睡眠呼吸的音频地址



    //重写toString()方法
    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", headPicture='" + headPicture + '\'' +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", birthday=" + birthday +
                ", city='" + city + '\'' +
                ", sleepvoicePath='" + sleepvoicePath + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getHeadPicture() {
        return headPicture;
    }

    public void setHeadPicture(String headPicture) {
        this.headPicture = headPicture == null ? null : headPicture.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getSleepvoicePath() {
        return sleepvoicePath;
    }

    public void setSleepvoicePath(String sleepvoicePath) {
        this.sleepvoicePath = sleepvoicePath == null ? null : sleepvoicePath.trim();
    }
}

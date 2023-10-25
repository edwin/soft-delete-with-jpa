package com.edw.model;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;

import java.io.Serializable;

/**
 * <pre>
 *     com.edw.model.User
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 25 Okt 2023 13:00
 */
@Entity
@Table(name = "t_user")
@SQLDelete(sql = "UPDATE t_user set status='0' where id=?")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "status")
    private Integer status;

    public User() {
    }

    public User(Integer id, String userName, Integer status) {
        this.id = id;
        this.userName = userName;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", status=" + status +
                '}';
    }
}

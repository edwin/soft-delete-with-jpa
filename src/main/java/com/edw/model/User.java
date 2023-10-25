package com.edw.model;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLInsert;
import org.hibernate.annotations.SQLUpdate;
import org.hibernate.annotations.Type;

import jakarta.persistence.*;
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
@SQLDelete(sql = "UPDATE User set status='0'")
@SQLInsert(sql = "INSERT INTO User (userId, userName, status) VALUES (?, ?, ?)")
@SQLUpdate(sql = "UPDATE User SET userId = ?, userName = ?, status = ? WHERE id = ? ")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "status")
    private Integer status;

    public User() {
    }

    public User(Integer id, Integer userId, String userName, Integer status) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", status=" + status +
                '}';
    }
}

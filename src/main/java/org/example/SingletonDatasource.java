package org.example;

import org.example.MVC.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.SQLException;

public class SingletonDatasource {

    public static void main(String[] args) {
        System.out.println(Size.SMALL);

        SingletonDatasource db = getInstance();
    }

    private Connection conn;
    private static SingletonDatasource datasource;

    //private constructor
    private SingletonDatasource() {
    }

    //lazy initialization
    public static SingletonDatasource getInstance() {
        if (datasource == null) {
            datasource = new SingletonDatasource();
        }
        return datasource;
    }

    public void getConnection() {
        System.out.println("Connection with db is present");
    }

    public void closeConnection() {
        if (conn == null) {
            return;
        }
        try {
            conn.close();
            conn = null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //enum as Singleton
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    //spring example
    @Autowired
    ActivityService activityService;

    //Thread safe
    public class ThreadSingleton {
        private static ThreadSingleton instance;
        private ThreadSingleton() {

        }
        synchronized public ThreadSingleton getInstance() {
            if (instance == null) {
                instance = new ThreadSingleton();
            }
            return instance;
        }
    }
}

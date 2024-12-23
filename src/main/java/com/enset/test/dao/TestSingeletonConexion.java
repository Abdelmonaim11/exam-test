package com.enset.test.dao;

public class TestSingeletonConexion {
    public static void main(String[] args) {
        if (SingletonConnection.getConnection() != null){
            System.out.println("Connection successed....");

        }
    }
}

package com.taufiqjack.jdbc;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgres://localhost/postgres";

    static final String USER ="postgres";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection con = null;
        Statement stmt =null;

        try {
            Class.forName("org.postgresql.Driver");

            System.out.println("Connecting to Database...");
            con = DriverManager.getConnection(DB_URL,USER,PASS);

            System.out.println("Creating database..");
            stmt = con.createStatement();

            String sql = "CREATE DATABASE MAHASISWA";
            stmt.executeUpdate(sql);
            System.out.println("Database create successfully...");

        } catch (SQLException se) {
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(con!=null)
                    con.close();
            }catch (SQLException se){
                se.printStackTrace();
            }
        }System.out.println("Goodbye!");

        }
    }


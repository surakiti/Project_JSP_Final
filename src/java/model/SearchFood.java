/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author surakitisopontanapat
 */
public class SearchFood {

    private long food_Id;
    private int cal;
    private String fullname;
    private String detail;
    private long foodType_Id;
    private int amount;

    public SearchFood(long food_Id, int cal, String fullname, String detail, long foodType_Id, int amount) {
        this.food_Id = food_Id;
        this.cal = cal;
        this.fullname = fullname;
        this.detail = detail;
        this.foodType_Id = foodType_Id;
        this.amount = amount;
    }

    public SearchFood() {
    }

    public long getFood_Id() {
        return food_Id;
    }

    public void setFood_Id(long food_Id) {
        this.food_Id = food_Id;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public long getFoodType_Id() {
        return foodType_Id;
    }

    public void setFoodType_Id(long foodType_Id) {
        this.foodType_Id = foodType_Id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private SearchFood(ResultSet rs) throws SQLException {
        food_Id = rs.getLong("FOOD_ID");
        fullname = rs.getString("FULLNAME");
        foodType_Id = rs.getLong("FOODTYPE_ID");
        detail = rs.getString("DETAIL");
        amount = rs.getInt("AMOUNT");
        cal = rs.getInt("CAL");
    }

    public static List<SearchFood> searchDessert(String param) {
        List<SearchFood> searchDessert = null;
        SearchFood sf = null;
        Connection conn = ConnectionBuilder.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("SELECT * FROM FOOD WHERE FOODTYPE_ID = 2001");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                sf = new SearchFood(rs);
                if (searchDessert == null) {
                    searchDessert = new ArrayList();
                }
                searchDessert.add(sf);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return searchDessert;
    }

    public static List<SearchFood> searchMainDish(String param) {
        List<SearchFood> searchMainDish = null;
        SearchFood sf = null;
        Connection conn = ConnectionBuilder.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("SELECT * FROM FOOD WHERE FOODTYPE = 2000");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                sf = new SearchFood(rs);
                if (searchMainDish == null) {
                    searchMainDish = new ArrayList();
                }
                searchMainDish.add(sf);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return searchMainDish;
    }
    
    public static List<SearchFood> searchDrink(String param) {
        List<SearchFood> searchDrink = null;
        SearchFood sf = null;
        Connection conn = ConnectionBuilder.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("SELECT * FROM FOOD WHERE FOODTYPE = 2002");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                sf = new SearchFood(rs);
                if (searchDrink == null) {
                    searchDrink = new ArrayList();
                }
                searchDrink.add(sf);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return searchDrink;
    }
}

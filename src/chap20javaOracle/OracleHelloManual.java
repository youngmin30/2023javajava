package chap20javaOracle;

import java.sql.*;

//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;.

public class OracleHelloManual {

    /*
     * 2023년 3월 2일
     * sqlDeveloper에 먼저 접속
     * java 프로젝트 생성(jdk1.8, ojdbc6_g.jar 추가한 프로젝트)
     * ojbdc6_g.jar 위치: C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
     * 이 프로젝트의 jdk가 맞지 않을 경우, 이클립스에서는 add jar가 아닌 add lib로 추가
     * 이 프로젝트를 사용하기 전에 oracle11g, sqldeveloper 필요
     */


// JDBC 작성 ==> Java Database Connetivity JDBC


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // localhost 지금 이 컴퓨터를 의미함. 127.0.0.1.
        String user = "madang";
        String password = "madang";


        // JDBC를 위한 3대 클래스가 있음
        // Connection 클래스, PreparedStatement 클래스, ResultSet 클래스
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;


        try {
            // 1단계 ~ 드라이버 점검하여 메모리에 로딩하기
            // Class.forName() 클래스를 이름으로 있는지 찾고, 없으면 에러, 있으면 로딩.
            Class.forName("oracle.jdbc.driver.OracleDriver"); // OracleDriver 클래스가 있음.

            // new Connection xxxxxxx
            // 200단계: DB 연결자 생성
            conn = DriverManager.getConnection(url, user, password);
            //String sql ="SELECT * FROM MEMBER";
            String sql = "SELECT ID, NAME, EMAIL, PHONE, INDATE FROM MEMBER";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            // 3단계: 활용 단계(활용은 crud를 의미한다.)
            // rs를 분석하면 질의 결과가 나온다.
            // rs 정보를 빠짐없이 출력하는 방법
            while (rs.next()) { // 자료가 있으면 계속 true, 없으면 false를 낸다.
                String id = rs.getString("ID");
                String name = rs.getString("NAME"); // 오라클은 대소문자 구분하지 않으므로 "name"도 가능하다. 자바는 대소문자 구분함.
                String email = rs.getString(3); // "컬럼이름" 대신 인덱스 사용. 그러나 오라클은 인덱스로 0을 사용하지 않는다.
                String phone = rs.getString("PHONE");
                Date indate = rs.getDate("INDATE"); // sql의 Date를 이용한다.
                System.out.println(id + "," + name + "," + email + "," + phone + "," + indate);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // 4단계: 자원을 반납하는 단계(자원: 가장 큰 자원은 커넥션 객체이다.
            // conn이 가장 큰 자원이다.
            // pstmt, rs까지 모두 메모리에서 제거한다.
            try {
                if (rs != null) rs.close(); // 가장 최근에 만든 것을, 가장 먼저 닫는다.
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close(); // if(rs!=null) 객체가 널이 아니라면이라는 표시를 붙이라.
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();

            }
        }
    }
}
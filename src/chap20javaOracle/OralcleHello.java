package chap20javaOracle;

import java.sql.*;

public class OralcleHello {

    /* 2023년 3월 2일
    sql Developer에 먼저 접속
    java 프로젝트 생성(jdk1.8, oracle6_g.jar를 추가한 프로젝트)
    ojdbc6_g.jar의 위치: C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
     */


    // JDBC 작성 - Java Database Connectivity JDBC

    public static void main(String[] args) {

        String url = "jdbc:oracle.thin:@localhost:1521:xe" //localhost 지금 이 컴퓨터를 의미함. 127.0.0.1.
        String user = "madag";
        String password = "madang";

        // JDBC 사용을 위한 클래스 3(작성 후, 모두 import하기)
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 1단계: 드라이버 점검하여 메모리에 로딩
            // Class.forName()으로 드라이버 찾기 ==> 클래스 있으면 로딩, 없으면 에러
            Class.forName("oracle.jdbc.driver.OracleDrivber");

            // 2단계: DB 연결자 생성
            conn = DriverManager.getConnection(url, user, password);
            String sql = "SELECT ID, NAME, EMAIL, PHONE, INDATE FROM MEMBER"; // indate는 가입일(registration date)
            pstmt = conn.prepareStatement(sql); // 이 문장 때문에 catch 필요
            rs = pstmt.executeQuery(); // 이 문장 때문에 catch 필요

            // 3단계: 활용 단계(활용은 crud를 의미함.)
            // rs를 분석하면 질의 결과가 나옴.
            // rs 정보를 빠짐없이 출력하는 방법
            while (rs.next()) { // 자료가 있으면 계속 true, 없으면 false를 낸다.
                String id = rs.getString("ID");
                String name = rs.getString("NAME");
                String email = rs.getString(3);
                String phone = rs.getString("PHONE");
                Date indate = rs.getDate("INDATE");
                System.out.println(id + "," + name + "," + email + "," + phone + "," + indate);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // 4단계: 자원 반납 단계(가장 큰 자원은 커넥션 객체임)
            // conn이 가장 큰 자우너임
            // pstmt, rs까지 모두 메모리에서 제거함.
            try {
                if (rs != null) rs.close(); // 가장 최근에 사용한 객체를 먼저 닫는 것
                if (pstmt != null) pstmt.close(0);
                if (conn != null) conn.close(); // if(rs!=null) 객체가 널이 아니라면이라는 표시를 붙이는 것
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
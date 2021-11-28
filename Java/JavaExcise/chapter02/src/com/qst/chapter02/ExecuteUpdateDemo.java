package com.qst.chapter02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdateDemo {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String user = "scott";
	private String pass = "zkl123";

	public void createTable(String sql) throws Exception {
		// ��������
		Class.forName(driver);
		try (
		// ��ȡ���ݿ�����
		Connection conn = DriverManager.getConnection(url, user, pass);
				// ʹ��Connection������һ��Statment����
				Statement stmt = conn.createStatement()) {
			// ִ��DDL,�������ݱ�
			stmt.executeUpdate(sql);
		}
	}

	public long insertData(String sql) throws Exception {
		// ��������
		Class.forName(driver);
		try (
		// ��ȡ���ݿ�����
		Connection conn = DriverManager.getConnection(url, user, pass);
				// ʹ��Connection������һ��Statment����
				Statement stmt = conn.createStatement()) {
			// ִ��DML,������Ӱ��ļ�¼����
			return stmt.executeUpdate(sql);
		}
	}

	public static void main(String[] args) throws Exception {
		ExecuteUpdateDemo elud = new ExecuteUpdateDemo();
		elud.createTable("create table my_test1"
				+ "(test_id int primary key, " + "test_name varchar(255))");
		System.out.println("-----�����ɹ�-----");
		
		long result = elud.insertData("insert into my_test1(test_id,test_name) "
				+ "select id,username from userdetails");
		System.out.println("--ϵͳ�й���" + result + "����¼��Ӱ��--");
	}
}
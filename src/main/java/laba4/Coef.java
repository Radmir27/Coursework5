package laba4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Coef implements parametrs {
	
	public int[][] btCoef;		// ������������� �� ���������
	public float[] cityCoef;	// ������������� �� ������
	public float[] cbmCoef;		// ������������� �� ���
	public float[][] csvsCoef;	// ������������� �� �������� � �����
	public float[] cmCoef;		// ������������� �� CM
	public float[] cprCoef;		// ������������� �� CPR
	public float promoConf;		// ������������� �� ���������
	public float stafConf;		// ������������� �� ������
	
	String line;
    String inf;
	
	public void setParam() throws IOException {
		btCoef = new int[12][2];
		cbmCoef = new float[15];
		csvsCoef = new float[7][8];
		cmCoef = new float[6];
		cprCoef = new float[12];
		
		File file1;
		FileReader fr1;
		
		try {
			String filepath = new File("").getCanonicalPath();
			String[] parsfilepath = filepath.split("/");
			
			int lengthpath = parsfilepath.length;
			String abspath=""; 
			for(int i=0;i<(lengthpath-1);i++) {
				abspath=abspath+parsfilepath[i]+"/";
			}
			filepath=abspath+"apache-tomcat-10.0.5/webapps/Calculate/conf/config.txt";
			file1 = new File(filepath);
			fr1 = new FileReader(file1);
    	} catch(Exception ex) {
    		file1 = new File("src/main/webapp/conf/config.txt");
    		fr1 = new FileReader(file1);
		}
        //������� ������ FileReader ��� ������� File
        //������� BufferedReader � ������������� FileReader ��� ����������� ����������
        BufferedReader reader = new BufferedReader(fr1);
        // ������� ������� ������ ������
		for (int i = 0; i < 12; i++) {
			line = reader.readLine();
			for (int j = 0; j < 2; j++) {
				int end = line.indexOf(' '); // ���� ������ ������� �������
				if (end == -1) {
					inf = line.substring(0);
				} else {
					inf = line.substring(0, end);
				}
				line = line.substring(end+1);
				btCoef[i][j] = Integer.parseInt(inf);
			}
		}
		
		line = reader.readLine();
		for (int i = 0; i < 15; i++) {
			int end = line.indexOf(' '); // ���� ������ ������� �������
			if (end == -1) {
				inf = line.substring(0);
			} else {
				inf = line.substring(0, end);
			}
			line = line.substring(end+1);
			cbmCoef[i] = Float.parseFloat(inf);
		}
		for (int i = 0; i < 7; i++) {
			line = reader.readLine();
			for (int j = 0; j < 8; j++) {
				int end = line.indexOf(' '); // ���� ������ ������� �������
				if (end == -1) {
					inf = line.substring(0);
				} else {
					inf = line.substring(0, end);
				}
				line = line.substring(end+1);
				csvsCoef[i][j] = Float.parseFloat(inf);
			}
		}
		line = reader.readLine();
		for (int i = 0; i < 6; i++) {
			int end = line.indexOf(' '); // ���� ������ ������� �������
			if (end == -1) {
				inf = line.substring(0);
			} else {
				inf = line.substring(0, end);
			}
			line = line.substring(end+1);
			cmCoef[i] = Float.parseFloat(inf);
		}
		line = reader.readLine();
		for (int i = 0; i < 12; i++) {
			int end = line.indexOf(' '); // ���� ������ ������� �������
			if (end == -1) {
				inf = line.substring(0);
			} else {
				inf = line.substring(0, end);
			}
			line = line.substring(end+1);
			cprCoef[i] = Float.parseFloat(inf);
		}
		line = reader.readLine();
		promoConf = Float.parseFloat(line);
		line = reader.readLine();
		stafConf = Float.parseFloat(line);
		fr1.close();
		reader.close();
		
		setCity();
	}
	
	public void setCity() throws IOException {
		cityCoef = new float[5];
		
		File file2;
		FileReader fr2;
		
		try {
			String filepath = new File("").getCanonicalPath();
			String[] parsfilepath = filepath.split("/");
			
			int lengthpath = parsfilepath.length;
			String abspath=""; 
			for(int i=0;i<(lengthpath-1);i++) {
				abspath=abspath+parsfilepath[i]+"/";
			}
			filepath=abspath+"apache-tomcat-10.0.5/webapps/Calculate/conf/city.txt";
			file2 = new File(filepath);
			fr2 = new FileReader(file2);
    	} catch(Exception ex) {
    		file2 = new File("src/main/webapp/conf/city.txt");
			fr2 = new FileReader(file2);
		}
		
        //������� BufferedReader � ������������� FileReader ��� ����������� ����������
        BufferedReader reader2 = new BufferedReader(fr2);
        // ������� ������� ������ ������
        
		line = reader2.readLine();
		for (int i = 0; i < 5; i++) {
			int end = line.indexOf(' '); // ���� ������ ������� �������
			if (end == -1) {
				inf = line.substring(0);
			} else {
				inf = line.substring(0, end);
			}
			line = line.substring(end+1);
			cityCoef[i] = Float.parseFloat(inf);
		}
		fr2.close();
		reader2.close();
	}
}

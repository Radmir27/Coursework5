package laba4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Coef {
	
	public int[][] btCoef;		// ������������� �� ���������
	public float[] cityCoef;	// ������������� �� ������
	public float[] cbmCoef;		// ������������� �� ���
	public float[][] csvsCoef;	// ������������� �� �������� � �����
	public float[] cmCoef;		// ������������� �� CM
	public float[] cprCoef;		// ������������� �� CPR
	public float promoConf;		// ������������� �� ���������
	public float stafConf;		// ������������� �� ������
	
	public void setConf() throws IOException {
		File file = new File("config.txt");
        //������� ������ FileReader ��� ������� File
        FileReader fr = new FileReader(file);
        //������� BufferedReader � ������������� FileReader ��� ����������� ����������
        BufferedReader reader = new BufferedReader(fr);
        // ������� ������� ������ ������
        String line;
        String inf;
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 2; j++) {
				line = reader.readLine();
				int end = line.indexOf(' '); // ���� ������ ������� �������
				if (end == -1) {
					inf = line.substring(0);
				} else {
					inf = line.substring(0, end);
				}
				if (inf != null) {
				btCoef[i][j] = Integer.parseInt(inf);
				}
			}
		}
		line = reader.readLine();
		for (int i = 0; i < 5; i++) {
			int end = line.indexOf(' '); // ���� ������ ������� �������
			if (end == -1) {
				inf = line.substring(0);
			} else {
				inf = line.substring(0, end);
			}
			cityCoef[i] = (float) Integer.parseInt(inf);
		}
		line = reader.readLine();
		for (int i = 0; i < 15; i++) {
			int end = line.indexOf(' '); // ���� ������ ������� �������
			if (end == -1) {
				inf = line.substring(0);
			} else {
				inf = line.substring(0, end);
			}
			cbmCoef[i] = (float) Integer.parseInt(inf);
		}
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 8; j++) {
				line = reader.readLine();
				int end = line.indexOf(' '); // ���� ������ ������� �������t
				if (end == -1) {
					inf = line.substring(0);
				} else {
					inf = line.substring(0, end);
				}
				csvsCoef[i][j] = (float) Integer.parseInt(inf);
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
			cmCoef[i] = (float) Integer.parseInt(inf);
		}
		line = reader.readLine();
		for (int i = 0; i < 12; i++) {
			int end = line.indexOf(' '); // ���� ������ ������� �������
			if (end == -1) {
				inf = line.substring(0);
			} else {
				inf = line.substring(0, end);
			}
			cprCoef[i] = (float) Integer.parseInt(inf);
		}
		line = reader.readLine();
		promoConf = (float) Integer.parseInt(line);
		line = reader.readLine();
		stafConf = (float) Integer.parseInt(line);
		fr.close();
		reader.close();
	}
}

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
        String[] words;
		for (int i = 0; i < 11; i++) {
			line = reader.readLine();
			words = line.split(" ");
			for (int j = 0; j < 2; j++) {
				btCoef[i][j] = Integer.parseInt(words[j]);
			}
		}
		line = reader.readLine();
		words = line.split(" ");
		for (int i = 0; i < 5; i++) {
			cityCoef[i] = (float) Integer.parseInt(words[i]);
		}
		line = reader.readLine();
		words = line.split(" ");
		for (int i = 0; i < 15; i++) {
			cbmCoef[i] = (float) Integer.parseInt(words[i]);
		}
		for (int i = 0; i < 7; i++) {
			line = reader.readLine();
			words = line.split(" ");
			for (int j = 0; j < 8; j++) {
				csvsCoef[i][j] = (float) Integer.parseInt(words[j]);
			}
		}
		line = reader.readLine();
		words = line.split(" ");
		for (int i = 0; i < 6; i++) {
			cmCoef[i] = (float) Integer.parseInt(words[i]);
		}
		line = reader.readLine();
		words = line.split(" ");
		for (int i = 0; i < 12; i++) {
			cprCoef[i] = (float) Integer.parseInt(words[i]);
		}
		line = reader.readLine();
		promoConf = (float) Integer.parseInt(line);
		line = reader.readLine();
		stafConf = (float) Integer.parseInt(line);
		fr.close();
		reader.close();
	}
}

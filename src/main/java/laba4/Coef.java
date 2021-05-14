package laba4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Coef implements parametrs {
	
	public int[][] btCoef;		// расчитывается от категории
	public float[] cityCoef;	// расчитывается от города
	public float[] cbmCoef;		// расчитывается от кбм
	public float[][] csvsCoef;	// расчитывается от возраста и опыта
	public float[] cmCoef;		// расчитывается от CM
	public float[] cprCoef;		// расчитывается от CPR
	public float promoConf;		// расчитывается от промокода
	public float stafConf;		// расчитывается от ставке
	
	public void setParam() throws IOException {
		btCoef = new int[12][2];
		cityCoef = new float[5];
		cbmCoef = new float[15];
		csvsCoef = new float[7][8];
		cmCoef = new float[6];
		cprCoef = new float[12];
		File file = new File("ssrc/main/webapp/conf/config.txt");
        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(file);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        // считаем сначала первую строку
        String line;
        String inf;
		for (int i = 0; i < 12; i++) {
			line = reader.readLine();
			for (int j = 0; j < 2; j++) {
				int end = line.indexOf(' '); // ищем индекс первого пробела
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
		for (int i = 0; i < 5; i++) {
			int end = line.indexOf(' '); // ищем индекс первого пробела
			if (end == -1) {
				inf = line.substring(0);
			} else {
				inf = line.substring(0, end);
			}
			line = line.substring(end+1);
			cityCoef[i] = Float.parseFloat(inf);
		}
		line = reader.readLine();
		for (int i = 0; i < 15; i++) {
			int end = line.indexOf(' '); // ищем индекс первого пробела
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
				int end = line.indexOf(' '); // ищем индекс первого пробела
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
			int end = line.indexOf(' '); // ищем индекс первого пробела
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
			int end = line.indexOf(' '); // ищем индекс первого пробела
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
		fr.close();
		reader.close();
	}
}

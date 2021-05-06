package laba4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public abstract class OSAGO {	//возможно не абстрактный
	//public int btMin = 0;
	//public int btMax = 0;
	//public float ct = 0;
	//public float cbm = 0;
	//public float csv = 0;
	//public float cm = 0;
	
	//public int category = 0;
	//public int city = 0;
	//public int сbmInd = 0;
	//public int age = 0;
	//public int experience = 0;
	//public int cmInd = 0;
	
	public int[][] btCoef;		// расчитывается от категории
	public float[] cityCoef;	// расчитывается от города
	public float[] cbmCoef;		// расчитывается от кбм
	public float[][] csvsCoef;	// расчитывается от возраста и опыта
	public float[] cmCoef;		// расчитывается от CM
	
	//public int totalMin;	// возможно будет не здесь
	//public int totalMax;	// возможно будет не здесь
	
	//abstract public void peredacha();	//??
	
	/*public void setCategory(int category) {
		this.category = category;
	}
	
	public void setCity(int city) {
		this.city = city;
	}
	
	public void setCBM(int сbmInd) {
		this.сbmInd = сbmInd;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void setCM(int cmInd) {
		this.cmInd = cmInd;
	}
	
	public int getTotalMin() {
		return totalMin;
	}

	public int getTotalMax() {
		return totalMax;
	}*/
	
	/*public void getBTmin() {
		switch (category) {
		case 0 :
			btMin = 625;
			btMax = 1548;
			break;
		case 1 :
			btMin = 2471;
			btMax = 5436;
			break;
		case 2 :
			btMin = 1646;
			btMax = 3493;
			break;
		case 3 :
			btMin = 2877;
			btMax = 9619;
			break;
		case 4 :
			btMin = 2246;
			btMax = 6064;
			break;
		case 5 :
			btMin = 3382;
			btMax = 9131;
			break;
		case 6 :
			btMin = 2134;
			btMax = 4165;
			break;
		case 7 :
			btMin = 2667;
			btMax = 5205;
			break;
		case 8 :
			btMin = 3905;
			btMax = 7399;
			break;
		case 9 :
			btMin = 2134;
			btMax = 4044;
			break;
		case 10 :
			btMin = 1331;
			btMax = 2521;
			break;
		case 11 :
			btMin = 872;
			btMax = 1952;
			break;
		}
	}*/
	
	/*public void getCT() {
		switch (city) {
		case 0 :
			ct = (float) 1.72;
			break;
		case 1 :
			ct = (float) 1.45;
			break;
		case 2 :
			ct = (float) 1.54;
			break;
		case 3 :
			ct = (float) 1.99;
			break;
		case 4 :
			ct = (float) 1.9;
			break;
		}
	}*/
	
	/*public void getCBM() {
		switch (сbmInd) {
		case 0 :
			cbm = (float) 2.45;
			break;
		case 1 :
			cbm = (float) 2.3;
			break;
		case 2 :
			cbm = (float) 1.55;
			break;
		case 3 :
			cbm = (float) 1.4;
			break;
		case 4 :
			cbm = (float) 1;
			break;
		case 5:
			cbm = (float) 0.95;
			break;
		case 6:
			cbm = (float) 0.9;
			break;
		case 7:
			cbm = (float) 0.85;
			break;
		case 8:
			cbm = (float) 0.8;
			break;
		case 9:
			cbm = (float) 0.75;
			break;
		case 10:
			cbm = (float) 0.7;
			break;
		case 11:
			cbm = (float) 0.65;
			break;
		case 12:
			cbm = (float) 0.6;
			break;
		case 13:
			cbm = (float) 0.55;
			break;
		case 14:
			cbm = (float) 0.5;
			break;
		}
	}*/
	
	/*csvs = {
			{(float) 1.93,(float) 1.90,(float) 1.87,(float) 1.66,(float) 1.64,(float) 1.64,(float) 1.64,(float) 1.64},
			{(float) 1.79,(float) 1.77,(float) 1.76,(float) 1.08,(float) 1.06,(float) 1.06,(float) 1.06,(float) 1.06},
			{(float) 1.77,(float) 1.68,(float) 1.61,(float) 1.06,(float) 1.05,(float) 1.05,(float) 1.01,(float) 1.01},
			{(float) 1.62,(float) 1.61,(float) 1.59,(float) 1.04,(float) 1.04,(float) 1.01,(float) 0.96,(float) 0.95},
			{(float) 1.61,(float) 1.59,(float) 1.58,(float) 0.99,(float) 0.96,(float) 0.95,(float) 0.95,(float) 0.94},
			{(float) 1.59,(float) 1.58,(float) 1.57,(float) 0.95,(float) 0.95,(float) 0.94,(float) 0.94,(float) 0.94},
			{(float) 1.58,(float) 1.57,(float) 1.56,(float) 0.94,(float) 0.94,(float) 0.94,(float) 0.94,(float) 0.93},
			{(float) 1.55,(float) 1.54,(float) 1.53,(float) 0.92,(float) 0.91,(float) 0.91,(float) 0.91,(float) 0.90}
			}; */
	
	/*public void getCSV() {
		csv = csvs[age][experience];
	}*/
	
	//public float[] cms = {(float) 0.6,1,(float) 1.1,(float) 1.2,(float) 1.4,(float) 1.6};
	
	/*public void getCM() {
		cm = cms[cmInd];
	}*/
	
	public void setConf() throws IOException {
		File file = new File("config.txt");
        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(file);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        // считаем сначала первую строку
        String line;
        String inf;
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 2; j++) {
				line = reader.readLine();
				int end = line.indexOf(' '); // ищем индекс первого пробела
				if (end == -1) {
					inf = line.substring(0);
				} else {
					inf = line.substring(0, end);
				}
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
			cityCoef[i] = (float) Integer.parseInt(inf);
		}
		line = reader.readLine();
		for (int i = 0; i < 15; i++) {
			int end = line.indexOf(' '); // ищем индекс первого пробела
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
				int end = line.indexOf(' '); // ищем индекс первого пробелаt
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
			int end = line.indexOf(' '); // ищем индекс первого пробела
			if (end == -1) {
				inf = line.substring(0);
			} else {
				inf = line.substring(0, end);
			}
			cmCoef[i] = (float) Integer.parseInt(inf);
		}
	}
}

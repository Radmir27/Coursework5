package laba4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Coef {
	
	public int[][] btCoef;		// расчитывается от категории
	public float[] cityCoef;	// расчитывается от города
	public float[] cbmCoef;		// расчитывается от кбм
	public float[][] csvsCoef;	// расчитывается от возраста и опыта
	public float[] cmCoef;		// расчитывается от CM
	public float[] cprCoef;		// расчитывается от CPR
	public float promoConf;		// расчитывается от промокода
	public float stafConf;		// расчитывается от ставке
	
	public void setConf() throws IOException {
		File file = new File("config.txt");
        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(file);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        // считаем сначала первую строку
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

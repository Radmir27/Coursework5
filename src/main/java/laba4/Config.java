package laba4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Config {
	public boolean l = true;
	
	public void loadNewConf() throws IOException {
		float f;
		String coef = null;
		String inf = "";
        JFileChooser fileopen = new JFileChooser();
        int ret = fileopen.showDialog(null, "Открыть файл");
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileopen.getSelectedFile();
            FileReader fr = null;
            BufferedReader br = null;
            try {
                fr = new FileReader(file);
                br = new BufferedReader(fr);
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
            String line;
            for (int i = 0; i < 11; i++) {
    			for (int j = 0; j < 2; j++) {
    				line = br.readLine();
    				coef = coef + line + "\n";
    				int end = line.indexOf(' '); // ищем индекс первого пробела
    				if (end == -1) {
    					inf = line.substring(0);
    				} else {
    					inf = line.substring(0, end);
    				}
    				f = Integer.parseInt(inf);
    				if (f < 0) {
    					l = false;
    					break;
    				}
    			}
    		}
    		line = br.readLine();
    		coef = coef + line + "\n";
    		for (int i = 0; i < 5; i++) {
    			int end = line.indexOf(' '); // ищем индекс первого пробела
    			if (end == -1) {
    				inf = line.substring(0);
    			} else {
    				inf = line.substring(0, end);
    			}
    			f = (float) Integer.parseInt(inf);
				if (f < 0) {
					l = false;
					break;
				}
    		}
    		line = br.readLine();
			coef = coef + line + "\n";
    		for (int i = 0; i < 15; i++) {
    			int end = line.indexOf(' '); // ищем индекс первого пробела
    			if (end == -1) {
    				inf = line.substring(0);
    			} else {
    				inf = line.substring(0, end);
    			}
    			f = (float) Integer.parseInt(inf);
				if (f < 0) {
					l = false;
					break;
				}
    		}
    		for (int i = 0; i < 7; i++) {
    			for (int j = 0; j < 8; j++) {
    				line = br.readLine();
    				coef = coef + line + "\n";
    				int end = line.indexOf(' '); // ищем индекс первого пробелаt
    				if (end == -1) {
    					inf = line.substring(0);
    				} else {
    					inf = line.substring(0, end);
    				}
    				f = (float) Integer.parseInt(inf);
    				if (f < 0) {
    					l = false;
    					break;
    				}
    			}
    		}
    		line = br.readLine();
			coef = coef + line + "\n";
    		for (int i = 0; i < 6; i++) {
    			int end = line.indexOf(' '); // ищем индекс первого пробела
    			if (end == -1) {
    				inf = line.substring(0);
    			} else {
    				inf = line.substring(0, end);
    			}
    			f = (float) Integer.parseInt(inf);
				if (f < 0) {
					l = false;
					break;
				}
    		}
    		line = br.readLine();
			coef = coef + line + "\n";
    		for (int i = 0; i < 12; i++) {
    			int end = line.indexOf(' '); // ищем индекс первого пробела
    			if (end == -1) {
    				inf = line.substring(0);
    			} else {
    				inf = line.substring(0, end);
    			}
    			f = (float) Integer.parseInt(inf);
				if (f < 0) {
					l = false;
					break;
				}
    		}
    		line = br.readLine();
			coef = coef + line + "\n";
			f = (float) Integer.parseInt(inf);
			if (f < 0) {
				l = false;
			}
    		line = br.readLine();
			coef = coef + line + "\n";
			f = (float) Integer.parseInt(inf);
			if (f < 0) {
				l = false;
			}
    		br.close();
    		fr.close();
        }
	}
}

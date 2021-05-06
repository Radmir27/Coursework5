package laba4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Config {
	public void loadConf() {
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
            try {
                while((line = br.readLine()) != null){
                    inf = inf + line + "\n";
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            try {
                br.close();
                fr.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            /*try(FileReader reader = new FileReader("notes3.txt"))
            {
               // читаем посимвольно
                int c;
                while((c=reader.read())!=-1){
                     
                    System.out.print((char)c);
                } 
            }
            catch(IOException ex){
                 
                System.out.println(ex.getMessage());
            }   */
        }
	}
}

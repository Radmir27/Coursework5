package laba4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Check implements parametrs {

	private List<String> adminLogins = new ArrayList<>();
    private List<String> adminPasswords = new ArrayList<>();
    
    private List<String> userLogins = new ArrayList<>();
    private List<String> userPasswords = new ArrayList<>();
    
    boolean lp;

    public boolean check1(String login, String password) throws IOException {
    	lp = false;
        setParam();
        for (int i = 0; i < adminLogins.size(); i++) {
            if (login.equals(adminLogins.get(i)) && password.equals(adminPasswords.get(i))) {
                lp = true;
                break;
            }
        }
        return lp;
    }
    
    public boolean check2(String login, String password) throws IOException {
    	lp = false;
        for (int i = 0; i < userLogins.size(); i++) {
            if (login.equals(userLogins.get(i)) && password.equals(userPasswords.get(i))) {
                lp = true;
                break;
            }
        }
        return lp;
    }

    public void setParam() throws IOException {
    	File file1 = new File("src/main/webapp/conf/AdminLogPass.txt");
        FileReader fr1 = new FileReader(file1);
        BufferedReader reader1 = new BufferedReader(fr1);
        String line;
        while((line = reader1.readLine()) != null) {
            int end = line.indexOf(' ');
            adminLogins.add(line.substring(0, end));
            line = line.substring(end+1);
            adminPasswords.add(line.substring(0));
        }
        reader1.close();
        
        File file2 = new File("src\\main\\webapp\\conf\\UserLogPass.txt");
        FileReader fr2 = new FileReader(file2);
        BufferedReader reader2 = new BufferedReader(fr2);
        while((line = reader2.readLine()) != null) {
            int end = line.indexOf(' ');
            userLogins.add(line.substring(0, end));
            line = line.substring(end+1);
            userPasswords.add(line.substring(0));
        }
        reader2.close();
    }
}
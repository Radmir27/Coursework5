package laba4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Check {

	private List<String> logins = new ArrayList<>();
    private List<String> passwords = new ArrayList<>();

    public boolean check(String login, String password) throws IOException {
    	boolean lp = false;
        setLogPass();
        for (int i = 0; i < logins.size(); i++) {
            if (login.equals(logins.get(i)) && password.equals(passwords.get(i)) && !login.equals(null) && !login.equals(null)) {
                lp = true;
                break;
            }
        }
        return lp;
    }

    private void setLogPass() throws IOException {
    	File file = new File("LogPass.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line;
        while((line = reader.readLine()) != null) {
            int end = line.indexOf(' ');
            logins.add(line.substring(0, end));
            line = line.substring(end+1);
            passwords.add(line.substring(0));
        }
        reader.close();
    }
}
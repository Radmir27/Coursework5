package laba4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Check {

    private String[] logins;
    private String[] passwords;

    public boolean check(String login, String password) throws IOException {
        boolean lp = false;
        setLogPass();
        for (int i = 0; i < logins.length; i++) {
            if (login == logins[i] && password == passwords[i] && login != null && password != null && login != "" && password != "") {
                lp = true;
                break;
            }
        }
        return lp;
    }

    private void setLogPass() throws IOException {
        logins = new String[5];
        passwords = new String[logins.length];
        File file = new File("LogPass.txt");
        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(file);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        // считаем сначала первую строку
        String line;
        for (int i = 0; i < logins.length; i++) {
            line = reader.readLine();
            int end = line.indexOf(' '); // ищем индекс первого пробела
            logins[i] = line.substring(0, end);
            line = line.substring(end+1);
            passwords[i] = line.substring(0);
        }
    }
}
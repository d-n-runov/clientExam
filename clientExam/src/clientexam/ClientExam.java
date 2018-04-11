package clientexam;

import frames.loginPage;
import frames.registrationFrame;

public class ClientExam {
    public static void main(String[] args) {
        loginPage.main();
    }
    
    public static void callFrames(String frameName) {
        switch (frameName) {
            case "registrationFrame": 
                registrationFrame.main();
                break;
            case "loginPage": 
                loginPage.main();
                break;
        }
    }   
}

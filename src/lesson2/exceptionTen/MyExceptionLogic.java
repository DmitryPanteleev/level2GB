package lesson2.exceptionTen;

import lesson2.exceptionTen.myException.*;

public class MyExceptionLogic {
    public void generatedException(int i) {
        switch (i) {
            case 1: new ExceptionNumOne("Exception 1");break;
            case 2: new ExceptionNumTwo("Exception 2");break;
            case 3: new ExceptionNumThree("Exception 1");break;
            case 4: new ExceptionNumFour("Exception 1");break;
            case 5: new ExceptionNumberFive("Exception 1");break;
            case 6: new ExceptionNumSix("Exception 1");break;
            case 7: new ExceptionNumSeven("Exception 1");break;
            case 8: new ExceptionNumOne("Exception 1");break;
            case 9: new ExceptionNumOne("Exception 1");break;
            case 10: new ExceptionNumOne("Exception 1");break;
        }
    }
}

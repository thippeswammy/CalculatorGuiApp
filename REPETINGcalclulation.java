/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author thippeswamy
 */
public class REPETINGcalclulation extends CalculatorApp {
    protected String s="";
    protected double d;
    protected long i;
    public REPETINGcalclulation(int i){
        
    }
    public String CALCULATIONC(String s){

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = i * -1.1;
            sa[i] = i * -1;
        }
        Strings arrayM[] = new Strings[100];
        int arrayMSO[] = new int[100];
        int arrayMSC[] = new int[100];
        {
            int time1 = 0;
            int time2 = 0;
            for (int i = 0; i < s.length(); i++) {
                String ch = s.substring(i, i + 1);
                if ("(".equals(ch)) {
                    time1++;
                }

            }
            for (int i = 0; i < s.length() && time1 >= 0; i++) {
                String ch = s.substring(i, i + 1);
                if ("(".equals(ch)) {
                    arrayMSO[time1] = i;
                    time1--;
                }
                if (")".equals(ch)) {
                    arrayMSC[time2] = i;
                    time2++;
                }
            }
        }
        
        String store = "";
        int time = 0;
        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1);
            if (("+").equals(ch) || ("-").equals(ch) || ("*").equals(ch) || ("/").equals(ch)) {
                try {
                    if (Double.parseDouble(store) == Integer.parseInt(store)) {
                        a[time] = Integer.parseInt(store);
                    } else {
                        a[time] = Double.parseDouble(store);
                    }
                } catch (NumberFormatException e) {
                    a[time] = Double.parseDouble(store);
                }
                if (("+").equals(ch)) {
                    sa[time] = 13;
                }
                if (("-").equals(ch)) {
                    sa[time] = 14;
                }
                if (("*").equals(ch)) {
                    sa[time] = 15;
                }
                if (("/").equals(ch)) {
                    sa[time] = 16;
                }
                time++;
                ch = "";
                store = "";
            } else {
                store += ch;
            }
        }
        if (!"".equals(store)) {
            try {
                a[time] = Double.parseDouble(store);
            } catch (NumberFormatException e) {
            }
        }
        return every(1);
    }
    public String CALCULATIONCS(String s){

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = i * -1.1;
            sa[i] = i * -1;
        }
        Strings arrayM[] = new Strings[100];
        int arrayMSO[] = new int[100];
        int arrayMSC[] = new int[100];
        {
            int time1 = 0;
            int time2 = 0;
            for (int i = 0; i < s.length(); i++) {
                String ch = s.substring(i, i + 1);
                if ("(".equals(ch)) {
                    time1++;
                }

            }
            for (int i = 0; i < s.length() && time1 >= 0; i++) {
                String ch = s.substring(i, i + 1);
                if ("(".equals(ch)) {
                    arrayMSO[time1] = i;
                    time1--;
                }
                if (")".equals(ch)) {
                    arrayMSC[time2] = i;
                    time2++;
                }
            }
        }

        String store = "";
        int time = 0;
        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1);
            if (("+").equals(ch) || ("-").equals(ch) || ("*").equals(ch) || ("/").equals(ch)) {
                try {
                    if (Double.parseDouble(store) == Integer.parseInt(store)) {
                        a[time] = Integer.parseInt(store);
                    } else {
                        a[time] = Double.parseDouble(store);
                    }
                } catch (NumberFormatException e) {
                    a[time] = Double.parseDouble(store);
                }
                if (("+").equals(ch)) {
                    sa[time] = 13;
                }
                if (("-").equals(ch)) {
                    sa[time] = 14;
                }
                if (("*").equals(ch)) {
                    sa[time] = 15;
                }
                if (("/").equals(ch)) {
                    sa[time] = 16;
                }
                time++;
                ch = "";
                store = "";
            } else {
                store += ch;
            }
        }
        if (!"".equals(store)) {
            try {
                a[time] = Double.parseDouble(store);
            } catch (NumberFormatException e) {
                
            }
        }
        return every(1);
    }
    private String every(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

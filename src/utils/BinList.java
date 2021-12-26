package utils;

public class BinList {
    public static final String BIN(String s){

        if (s.substring(0,2) == "34" || s.substring(0,2) == "37"){
            if (s.length() == 15){
                return "American Express";
            }
        }

        if (s.substring(0,2) == "62"){
            if (s.length() >= 16 && s.length() <= 19){
                return "China UnionPay";
            }
        }

        if (s.substring(0,2) == "31" && s.length() == 19){
            return "China T-Union";
        }

        if (s.substring(0,2) == "54" || s.substring(0,2) == "55"){
            if (s.length() == 16){
                return "Diners Club United States & Canada";
            }
        }

        if (s.substring(0,2) == "36"){
            if (s.length() >= 14 && s.length() <= 19){
                return "Diners Club International";
            }
        }

        if (Integer.parseInt(s.substring(0,3)) >= 300 && Integer.parseInt(s.substring(0,3)) <= 305 ||
                Integer.parseInt(s.substring(0,2)) >= 38 && Integer.parseInt(s.substring(0,2)) <= 39 ||
                s.substring(0,4) == "3095"){
            if (s.length() >= 16 && s.length() <= 19){
                return "Diners Club International";
            }
        }

        if (s.substring(0,2) == "60" || s.substring(0,4) == "6521" || s.substring(0,4) == "6222"){
            if (s.length() == 16){
                return "RuPay";
            }
        }

        if (s.substring(0,4) == "6011" || s.substring(0,2) == "64" || s.substring(0,2) == "65" ||
                Integer.parseInt(s.substring(0,6)) >= 622126  && Integer.parseInt(s.substring(0,6)) <= 622925 ||
                Integer.parseInt(s.substring(0,6)) >= 624000   && Integer.parseInt(s.substring(0,6)) <= 626999 ||
                Integer.parseInt(s.substring(0,6)) >= 628200    && Integer.parseInt(s.substring(0,6)) <= 628899) {
            if (s.length() >= 16 && s.length() <= 19){
                return "Discover Card";
            }
        }

        if (Integer.parseInt(s.substring(0,3)) >= 637  && Integer.parseInt(s.substring(0,3)) <= 639){
            if (s.length() == 16){
                return "InstaPayment";
            }
        }

        if (s.substring(0,3) == "636"){
            if (s.length() >= 16 && s.length() <= 19){
                return "InterPayment";
            }
        }

        if (s.substring(0,4) == "6759" || s.substring(0,6) == "676770" || s.substring(0,6) == "676774"){
            if (s.length() >= 12 && s.length() <= 19){
                return "Maestro UK";
            }
        }

        if (s.substring(0,2) == "50" ||  Integer.parseInt(s.substring(0,6)) >= 676770  && Integer.parseInt(s.substring(0,6)) <= 676774){
            if (s.length() >= 12 && s.length() <= 19){
                return "Maestro";
            }
        }

        if (Integer.parseInt(s.substring(0,4)) >= 3528  && Integer.parseInt(s.substring(0,4)) <= 3589){
            if (s.length() >= 16 && s.length() <= 19){
                return "JCB";
            }
        }

        if (Integer.parseInt(s.substring(0,7)) >= 6054740  && Integer.parseInt(s.substring(0,7)) <= 6054744){
            if (s.length() == 16){
                return "Troy";
            }
        }


        if (Integer.parseInt(s.substring(0,6)) >= 979200  && Integer.parseInt(s.substring(0,6)) <= 979289){
            if (s.length() == 16){
                return "NPS Pridnestrovie";
            }
        }

        if (Integer.parseInt(s.substring(0,4)) >= 2221  && Integer.parseInt(s.substring(0,4)) <= 2720){
            if (s.length() == 16){
                return "Mastercard 2017";
            }
        }

        if (Integer.parseInt(s.substring(0,2)) >= 51  && Integer.parseInt(s.substring(0,2)) <= 55){
            if (s.length() == 16){
                return "Mastercard";
            }
        }

        if(s.substring(0,1) == "1"){
            if (s.length() == 15){
                return "UATP";
            }
        }

        if(s.substring(0,1) == "4"){
            if (s.length() == 16){
                return "Visa";
            }
        }

        if (Integer.parseInt(s.substring(0,6)) >= 506099  && Integer.parseInt(s.substring(0,6)) <= 506198 ||
                Integer.parseInt(s.substring(0,6)) >= 650002  && Integer.parseInt(s.substring(0,6)) <= 650027 ){
            if (s.length() == 16 || s.length() == 19){
                return "Verve";
            }
        }
        return "Unknown bank";
    }
}

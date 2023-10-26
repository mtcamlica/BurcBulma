import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay, gun;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Aylar");
        System.out.println(" 1- Ocak\n 2- Şubat\n 3- Mart\n 4- Nisan\n 5- Mayıs\n 6- Haziran\n 7- Temmuz\n 8- Ağustos\n 9- Eylül\n 10- Ekim\n 11- Kasım\n 12- Aralık");
        System.out.print("Doğduğunuz ay : ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz gün : ");
        gun = input.nextInt();

        switch (ay){
            case 1: //Ocak
                if (gun >= 1 && gun <= 31){
                    if (gun < 22) {
                        burc = "Oğlak";
                        }else {
                        burc = "Kova";
                        }
                    }else{
                        isError = true;
                    }
            break;

            case 2: //Şubat
                if (gun >= 1 && gun <= 28){
                    if (gun < 20) {
                        burc = "Kova";
                    }else {
                        burc = "Balık";
                    }
                }else{
                    isError = true;
                }
            break;

            case 3: // Mart
                if (gun >= 1 && gun <= 31){
                    if (gun <19){
                        burc = "Balık";
                    }else {
                        burc = "Koç";
                    }
                }else {
                    isError = true;
                }
            break;

            case 4: //Nisan
                if (gun >= 1 && gun <= 30){
                    if (gun <21){
                        burc = "Koç";
                    }else {
                        burc = "Boğa";
                    }
                }else {
                    isError = true;
                }
            break;

            case 5: //Mayıs
                if (gun >= 1 && gun <= 31){
                    if (gun <22){
                        burc = "Boğa";
                    }else {
                        burc = "İkizler";
                    }
                }else {
                    isError = true;
                }
            break;

            case 6: //Haziran
                if (gun >= 1 && gun <= 30){
                    if (gun <23){
                        burc = "İkizler";
                    }else {
                        burc = "Yengeç";
                    }
                }else {
                    isError = true;
                }
            break;

            case 7: //Temmuz
                if (gun >= 1 && gun <= 31){
                    if (gun <23){
                        burc = "Yengeç";
                    }else {
                        burc = "Aslan";
                    }
                }else {
                    isError = true;
                }
            break;

            case 8: //Ağustos
                if (gun >= 1 && gun <= 31){
                    if (gun <23){
                        burc = "Aslan";
                    }else {
                        burc = "Başak";
                    }
                }else {
                    isError = true;
                }
            break;

            case 9: //Eylül
                if (gun >= 1 && gun <= 30){
                    if (gun <23){
                        burc = "Başak";
                    }else {
                        burc = "Terazi";
                    }
                }else {
                    isError = true;
                }
            break;

            case 10: //Ekim
                if (gun >= 1 && gun <= 31){
                    if (gun <23){
                        burc = "Terazi";
                    }else {
                        burc = "Akrep";
                    }
                }else {
                    isError = true;
                }
            break;

            case 11: //Kasım
                if (gun >= 1 && gun <= 30){
                    if (gun <22){
                        burc = "Akrep";
                    }else {
                        burc = "Yay";
                    }
                }else {
                    isError = true;
                }
            break;

            case 12: //Aralık
                if (gun >= 1 && gun <= 31){
                    if (gun <22){
                        burc = "Yay";
                    }else {
                        burc = "Oğlak";
                    }
                }else {
                    isError = true;
                }

            default:
                isError = true;
        } if (isError) {
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
        }else {
            System.out.println("Burcunuz " + burc);
        }
        }
    }

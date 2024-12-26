import java.util.*;
class AirlineReservation {
    public static void main(String args[]){
        System.out.println("\n================ Welcome ================");
        Process p = new Process();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter [1] to Login");
        System.out.println("New User? Enter [2] to Signup ");
        System.out.print("Enter Choice : ");
        int ch = sc.nextInt();
        switch(ch){
            case 1:{
                p.login();
                break;
            }
            case 2:{
                p.signup();
                break;
            }
            default:{
                System.out.println("Enter valid Number!!");
                break;
            }
        }
        p.payment();
        System.out.println("\nCollect Your Boarding Pass From the Airport!");
        System.out.println("\nThank You for Booking Flight With Us!");
    }
}
class Process{
    String full_name,f_name,l_name,password1,password_login,email1,email_login,in_des,fi_des,mob_num;
    int dt_index,seat,age;
    double eprice,bprice,reprice,rbprice,totalprice,discount,dis_price,food_price;
    String email = "admin@123";
    String password = "1234";
    Scanner sc = new Scanner(System.in);
    
    //Login
    void login(){
        System.out.println("\n========== Login ==========");
        System.out.print("Enter Email id : ");
        email_login = sc.next();
        System.out.print("Enter Password : ");
        password_login = sc.next();
        if(email_login.equals(email) && password_login.equals(password)){
            path();
        }
        else{
            System.out.println("\nWrong Email or Password\nTry Again");
            login();
        }
    }

    //Signup
    void signup(){
        System.out.println("\n========== Signup ==========");
        System.out.print("Enter Full Name : ");
        full_name = sc.nextLine();
        System.out.print("Enter Email id : ");
        email1 = sc.next();
        System.out.print("Enter Password : ");
        password1 = sc.next();
        email = email1;
        password = password1;
        login();
    }

    //option for oneway trip or round way trip
    void path(){
        System.out.println("\n========== Select Destination ==========");
        System.out.print("From : ");
        in_des = sc.next();
        System.out.print("To : ");
        fi_des = sc.next();
        System.out.println("\nEnter [1] for one way");
        System.out.println("Enter [2] for Round way");
        System.out.print("Enter Choice : ");
        int choose = sc.nextInt();
        if(choose == 1){
            oneWay();
        }
        else if(choose ==2){
            roundWay();
        }
        else{
            System.out.println("Enter Valid Option!!");
        }
    }
    void oneWay(){
        schedule();
        passenger();
    }
    void roundWay(){
        schedule();
        schedule1();
        passenger();
    }
    void schedule(){
        System.out.println("\n======= Dates Available =======");
        System.out.println("[1] Thurs 11-04-2023 ");
        System.out.println("[2] Sun 16-04-2023 ");
        System.out.println("[3] Tue 18-04-2023 ");
        System.out.println("[4] Tue 25-04-2023 ");
        System.out.println("[5] Wed 26-04-2023 ");
        System.out.println("[::Note :- If you select Date Once You Can't go back!]");
        
        System.out.print("\nSelect Date index : ");
        int indx = sc.nextInt();   

        if(indx == 1){
            System.out.println("\n======= Available Flights =======");
            System.out.println("15:00\tIndigo ");
            System.out.println("04:20\tAir India ");
            System.out.println("21:32\tGo First ");
            boolean b = true;
            while(b){
                System.out.print("\nChoose Flight : ");
                int cf =sc.nextInt();
                switch(cf){
                    case 1:{
                        eprice = 12000;
                        bprice = 15000;
                        b = false;
                        break;
                    }
                    case 2:{
                        eprice = 10500;
                        bprice = 13500;
                        b = false;
                        break;
                    }
                    case 3:{
                        eprice = 9500;
                        bprice = 12500;
                        b = false;
                        break;
                    }
                    default:{
                        System.out.println("Wrong Choice!!\nTry Again");
                        break;
                    }
                }
            }
        }
        else if(indx == 2){
            System.out.println("\n======= Available Flights =======");
            System.out.println("16:35\tSpiceJet ");
            System.out.println("10:25\tVistara ");
            boolean b = true;
            while(b){
                System.out.print("\nChoose Flight : ");
                int cf =sc.nextInt();
                switch(cf){
                    case 1:{
                        eprice = 9500;
                        bprice = 12500;
                        b = false;
                        break;
                    }
                    case 2:{
                        eprice = 10500;
                        bprice = 14500;
                        b = false;
                        break;
                    }
                    default:{
                        System.out.println("Wrong Choice!!\nTry Again");
                        break;
                    }
                }
            }
        }
        else if(indx == 3){
            System.out.println("\n======= Available Flights =======");
            System.out.println("01:15\tAlliance Air ");
            System.out.println("08:55\tSpiceJet ");
            System.out.println("23:05\tAir India ");
            boolean b = true;
            while(b){
                System.out.print("\nChoose Flight : ");
                int cf =sc.nextInt();
                switch(cf){
                    case 1:{
                        eprice = 8500;
                        bprice = 11500;
                        b = false;
                        break;
                    }
                    case 2:{
                        eprice = 10000;
                        bprice = 15000;
                        b = false;
                        break;
                    }
                    case 3:{
                        eprice = 9750;
                        bprice = 12000;
                        b = false;
                        break;
                    }
                    default:{
                        System.out.println("Wrong Choice!!\nTry Again");
                        break;
                    }
                }
            }
        }
        else if(indx == 4){
            System.out.println("\n======= Available Flights =======");
            System.out.println("05:35\tTruJet ");
            System.out.println("11:00\tIndigo ");
            System.out.println("00:30\tVistara ");
            boolean b = true;
            while(b){
                System.out.print("\nChoose Flight : ");
                int cf =sc.nextInt();
                switch(cf){
                    case 1:{
                        eprice = 6000;
                        bprice = 10500;
                        b = false;
                        break;
                    }
                    case 2:{
                        eprice = 6750;
                        bprice = 8550;
                        b = false;
                        break;
                    }
                    case 3:{
                        eprice = 6500;
                        bprice = 9500;
                        b = false;
                        break;
                    }
                    default:{
                        System.out.println("Wrong Choice!!\nTry Again");
                        break;
                    }
                }
            }
        }
        else if(indx == 5){
            System.out.println("\n======= Available Flights =======");
            System.out.println("12:15\tSpiceJet ");
            System.out.println("20:40\tSpiceJet ");
            boolean b = true;
            while(b){
                System.out.print("\nChoose Flight : ");
                int cf =sc.nextInt();
                switch(cf){
                    case 1:{
                        eprice = 6250;
                        bprice = 8250;
                        b = false;
                        break;
                    }
                    case 2:{
                        eprice = 6750;
                        bprice = 9550;
                        b = false;
                        break;
                    }
                    default:{
                        System.out.println("Wrong Choice!!\nTry Again");
                        break;
                    }
                }
            }
        }
        else{
            System.out.println("\nWrong Choice!!\nTry Again...");
            schedule();
        }
    }

    //For Round Trip
    void schedule1(){
        System.out.println("\n======= Dates Available for Return Trip =======");
        System.out.println("[1] Mon 17-04-2023 ");
        System.out.println("[2] Sat 22-04-2023 ");
        System.out.println("[3] Tue 25-04-2023 ");
        System.out.println("[4] Sat 29-04-2023 ");
        System.out.println("[5] Wed 03-05-2023 ");
        
        System.out.print("\nSelect Date index : ");
        int indx = sc.nextInt();   

        if(indx == 1){
            System.out.println("\n======= Available Flights =======");
            System.out.println("08:00\tIndigo ");
            System.out.println("16:20\tAir India ");
            System.out.println("22:32\tGo First ");
            boolean b = true;
            while(b){
                System.out.print("Choose Flight : ");
                int cf =sc.nextInt();
                switch(cf){
                    case 1:{
                        reprice = 6000;
                        rbprice = 9500;
                        b = false;
                        break;
                    }
                    case 2:{
                        reprice = 7000;
                        rbprice = 10500;
                        b = false;
                        break;
                    }
                    case 3:{
                        reprice = 6500;
                        rbprice = 10500;
                        b = false;
                        break;
                    }
                    default:{
                        System.out.println("Wrong Choice!!\nTry Again");
                        break;
                    }
                }
            }
        }
        else if(indx == 2){
            System.out.println("\n======= Available Flights =======");
            System.out.println("04:35\tSpiceJet ");
            System.out.println("16:25\tVistara ");
            boolean b = true;
            while(b){
                System.out.print("Choose Flight : ");
                int cf =sc.nextInt();
                switch(cf){
                    case 1:{
                        reprice = 5000;
                        rbprice = 7500;
                        b = false;
                        break;
                    }
                    case 2:{
                        reprice = 6500;
                        rbprice = 8500;
                        b = false;
                        break;
                    }
                    default:{
                        System.out.println("Wrong Choice!!\nTry Again");
                        break;
                    }
                }
            }
        }
        else if(indx == 3){
            System.out.println("\n======= Available Flights =======");
            System.out.println("05:15\tAlliance Air ");
            System.out.println("14:55\tSpiceJet ");
            System.out.println("23:05\tAir India ");
            boolean b = true;
            while(b){
                System.out.print("Choose Flight : ");
                int cf =sc.nextInt();
                switch(cf){
                    case 1:{
                        reprice = 5500;
                        rbprice = 10500;
                        b = false;
                        break;
                    }
                    case 2:{
                        reprice = 5750;
                        rbprice = 10550;
                        b = false;
                        break;
                    }
                    case 3:{
                        reprice = 5250;
                        rbprice = 10500;
                        b = false;
                        break;
                    }
                    default:{
                        System.out.println("Wrong Choice!!\nTry Again");
                        break;
                    }
                }
            }
        }
        else if(indx == 4){
            System.out.println("\n======= Available Flights =======");
            System.out.println("01:35\tTruJet ");
            System.out.println("13:00\tIndigo ");
            System.out.println("19:30\tVistara ");
            boolean b = true;
            while(b){
                System.out.print("Choose Flight : ");
                int cf =sc.nextInt();
                switch(cf){
                    case 1:{
                        reprice = 5000;
                        rbprice = 7500;
                        b = false;
                        break;
                    }
                    case 2:{
                        reprice = 6500;
                        rbprice = 8750;
                        b = false;
                        break;
                    }
                    case 3:{
                        reprice = 6750;
                        rbprice = 9500;
                        b = false;
                        break;
                    }
                    default:{
                        System.out.println("Wrong Choice!!\nTry Again");
                        break;
                    }
                }
            }
        }
        else if(indx == 5){
            System.out.println("\n======= Available Flights =======");
            System.out.println("12:15\tSpiceJet ");
            System.out.println("20:40\tSpiceJet ");
            boolean b = true;
            while(b){
                System.out.print("Choose Flight : ");
                int cf =sc.nextInt();
                switch(cf){
                    case 1:{
                        reprice = 4500;
                        rbprice = 6500;
                        b = false;
                        break;
                    }
                    case 2:{
                        reprice = 4750;
                        rbprice = 7650;
                        b = false;
                        break;
                    }
                    default:{
                        System.out.println("Wrong Choice!!\nTry Again");
                        break;
                    }
                }
            }
        }
        else{
            System.out.println("\nWrong Choice!!\nTry Again...");
            schedule1();
        }
    }

    //For Meal selection
    void food(){
        System.out.println("\nDo You Want to add Food or Beverages?");
        System.out.println("If yes then press [1]");
        System.out.println("If no then press [2]");
        System.out.print("Enter choice : ");
        int food_ch = sc.nextInt();
        switch(food_ch){
            case 1:{
                System.out.println("\n[1] for veg meal");
                System.out.println("[2] for Non-veg meal");
                System.out.print("Enter Choice : ");
                int nfood = sc.nextInt();
                switch(nfood){
                    case 1:{
                        food_price = 1500;
                        break;
                    }
                    case 2:{
                        food_price = 2000;
                        break;
                    }
                    default:{
                        break;
                    }
                }
                break;
            }
            case 2:{
                System.out.println("No meal Choosen!!");
                break;
            }
            default:{
                break;
            }
        }
    }

    //For Passenger details
    void passenger(){
        System.out.println("\n===== Enter Personal detail =====");
        System.out.print("\nEnter Your First Name : ");
        f_name = sc.next();
        System.out.print("Enter Your Last Name : ");
        l_name = sc.next();
        boolean m = true;
        while(m){
            System.out.print("Enter Your Mobile Number : ");
            mob_num = sc.next();
            if(mob_num.length()==10){
                m = false;
            }
            else{
                System.out.println("Enter Correct Mobile Number!! \nTry Again");
            }
        }
        System.out.print("Enter Your Age : ");
        age = sc.nextInt();
        System.out.print("Number Of Seats : ");
        seat = sc.nextInt();
        food();
        System.out.println("\nEnter [1] for Economy Class");
        System.out.println("Enter [2] for Business Class");
        System.out.print("Enter Choice : ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:{
                totalprice = seat*(eprice+reprice)+(seat*food_price);
                break;
            }
            case 2:{
                totalprice = seat*(bprice+rbprice)+(food_price*seat);
                break;
            }
        }
        if(age<12){
            discount = 0.15*totalprice;
            dis_price = totalprice-discount;
        }
        display();
    }

    //To display Passenger Detail
    void display(){
        System.out.println("\n========= Passenger Detail =========");
        System.out.println("Passenger Name : "+f_name + " " +l_name);
        System.out.println("Passenger Age : "+age);
        System.out.println("Passenger Mobile Number : "+mob_num);
        System.out.println("Number Of Seats : "+seat);
        System.out.println("Total Fair : "+totalprice);
        if(age<12){
            System.out.println("Discount Price : "+discount);
            System.out.println("Total Price after Discount : "+dis_price);
        }
    }

    //For Payment Option
    void payment(){
        System.out.println("\n===== Payment =====");
        System.out.println("\n[1] for Credit/Debit Card");
        System.out.println("[2] for Upi Payment");
        System.out.print("Enter Choice : ");
        int ch2 = sc.nextInt();
        switch(ch2){
            case 1:{
                boolean flag = true;
                while(flag){
                    System.out.print("\nEnter Card Number : ");
                    String card_num = sc.next();
                    if(card_num.length()==16){
                        flag = false;
                    }
                    else{
                        System.out.println("Payment failed!! Try Again");
                        flag = true;
                    }
                }
                sc.nextLine();
                System.out.print("Enter Card Holder Name : ");
                String hol_name = sc.nextLine();
                System.out.print("Enter Expiry Month and Year (MM/YY) : ");
                String exp = sc.next();
                boolean flag1 = true;
                int temp = 0;
                while(flag1){
                    System.out.print("Enter CVV : ");
                    String cvv = sc.next();
                    if(cvv.length()==3){
                        flag1 = false;
                        System.out.println("\nPayment is Successfully Done ");
                    }
                    else{
                        System.out.println("Enter correct CVV!!");
                        temp++;
                        if(temp==3){
                            System.out.println("\nPayment Failed!!");
                            System.out.println("Card Blocked for 24 hours!!");
                            flag1 = false;
                            payment();
                        }
                    }
                }
                break;
            }
            case 2:{
                System.out.print("\nEnter UPI ID : ");
                String upi = sc.next();
                System.out.print("Enter UPI Pin : ");
                String pin = sc.next();
                System.out.println("\nPayment is Successfully Done ");
                break;
            }
            default:{
                System.out.println("Choose Correct Option!!");
                payment();
                break;
            }
        }
    }
}
import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");             //Ввод текста
        String text = scanner.nextLine();
        

        
       String znak = " \\+ | \\- | \\* | \\/ ";          //Разделение строки на два значения
        String[] parts = text.split(znak);

        String par1 = parts[0];
        String par2 = parts[1];

        proverka(par1);
      

            
        boolean plus = text.contains("+");    // Определение знака операции
        boolean minus = text.contains("-");
        boolean umn = text.contains("*");
        boolean razdel = text.contains("/");   

        if (plus) {
            sum(par1,par2);
        }
        else if (minus) {
            minus(par1,par2);
            }
            else if (umn) {
                umn(par1,par2);
            }
            else {
                razdel(par1,par2);
            }

    }


        static void proverka(String x){
         
        boolean start = x.startsWith("\""); // Проверка кавычек в первом значении
            boolean end = x.endsWith("\"");    
        
            if (start && end){
                
                String y = x.replaceAll("\"","");
                int lenght = y.length(); //Определение длины строки
                    if (lenght > 10){
                    throw new ArithmeticException("ошибка");
                    }
                    else{
                        return;
                    }
                
            }
            else {
                
                throw new ArithmeticException("ошибка");
            }


    }


        static void proverka2(String x){

          boolean start = x.startsWith("\""); // Проверка кавычек в первом значении
            boolean end = x.endsWith("\"");    
        
            if (start && end){
                
                    throw new ArithmeticException("ошибка");
                    }
                    else{
                        return;
                    }
                
            }
            


         static void proverka3(int x){

            boolean y = (x >= 1) && (x <=10);
            if (y){
                return;
            }
            else{ 
                throw new ArithmeticException("ошибка");
            }

         }

        static void proverkaRezult (String x){

            int lenght = x.length(); //Определение длины строки

            if (lenght > 40){
                    
                    String rez = x.substring(0,40);
                    
                    String rezult = rez + "...";
                    System.out.println("\"" + rezult + "\"");
                    }
                    else{
                        System.out.println("\"" + x + "\"");
                    }


        }






       static void sum(String x, String y){
        proverka(y);
       String x1 = x.replaceAll("\"","");
       String y1 = y.replaceAll("\"","");  
        String z = x1 + y1;
        System.out.println("\"" + z + "\"");
        }


        static void minus(String x, String y){
            proverka(y);
            String x1 = x.replaceAll("\"","");
            String y1 = y.replaceAll("\"","");
            
            int index1 = x1.indexOf(y1); 
            
            if (index1 > 0){
            int start = 0;
            int end = index1;
            char[] dst=new char[end - start];
            x1.getChars(start, end, dst, 0);
            System.out.println(dst); }

            else{
                System.out.println(x);
            }

        }
            
        


        static void umn(String x, String y){
            proverka2(y);
            String x1 = x.replaceAll("\"","");
            int num = Integer.parseInt(y);
            proverka3(num);
            var repeated = x1.repeat(num);
            proverkaRezult(repeated);
            
             

        }
        

        static void razdel(String x, String y){
            proverka2(y);
            String x1 = x.replaceAll("\"","");
            int num = Integer.parseInt(y);
            proverka3(num);
            int lenght = x1.length();
            int d = lenght / num;

            result = x1.substring(0, d);
            
            System.out.println("\"" + result + "\"");

        }

}
    






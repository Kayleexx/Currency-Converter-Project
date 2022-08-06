package build;
import java.util.*;
import java.text.DecimalFormat;
// currency converter in java swing
class Currency
{
    public static void main(String[] args) 
        {
            double rupee,dollar,pound,code,euro,yen;
            DecimalFormat f = new DecimalFormat("##.###");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the currency code 1:Rupees\n2:Dollar\n3:Pound\n4:Euro\n5:Yen"); 
            code=sc.nextInt();
            //For Rupees Conversion
            if(code == 1)
            {
                System.out.println("Enter amount in rupees");
                rupee = sc.nextFloat();
                dollar = rupee / 66;
                System.out.println("Dollar : "+f.format(dollar));
                pound = rupee / 98;
                System.out.println("Pound : "+f.format(pound));
                euro = rupee / 72;
                System.out.println("Euro : "+f.format(euro));
                yen = rupee / 0.55;
                System.out.println("Yen : "+f.format(yen));
            }
            //For Dollar Conversion
            else if (code == 2)
            {
                System.out.println("Enter amount in dollar");
                dollar = sc.nextFloat();
                rupee = dollar * 66;
                System.out.println("Rupees : "+f.format(rupee));
                pound = dollar * 0.67;
                System.out.println("Pound : "+f.format(pound));
                euro = dollar * 0.92;
                System.out.println("Euro : "+f.format(euro));
                yen = dollar * 120.90;
                System.out.println("Yen : "+f.format(yen));
            }
            //For Pound Conversion
            else if(code == 3)
            {
                System.out.println("Enter amount in Pound");
                pound = sc.nextFloat();
                rupee = pound * 98;
                System.out.println("Rupees : "+f.format(rupee));
                dollar = pound * 1.49;
                System.out.println("Dollar : "+f.format(dollar));
                euro = pound * 1.36;
                System.out.println("Euro : "+f.format(euro));
                yen = pound * 179.89;
                System.out.println("Yen : "+f.format(yen));
            }
            //For Euro Conversion
            else if(code == 4)
            {
                System.out.println("Enter amount in Euro");
                euro = sc.nextFloat();
                rupee = euro * 72;
                System.out.println("Rupees : "+f.format(rupee));
                dollar = euro * 1.09;
                System.out.println("Dollar : "+f.format(dollar));
                pound = euro * 0.73;
                System.out.println("Pound : "+f.format(pound));
                yen = euro * 131.84;
                System.out.println("Yen : "+f.format(yen));
            }
            //For Yen Conversion
            else if(code == 5)
            {
                System.out.println("Enter amount in Yen");
                yen = sc.nextFloat();
                rupee = yen * 0.55;
                System.out.println("Rupees : "+f.format(rupee));
                dollar = yen * 0.01;
                System.out.println("Dollar : "+f.format(dollar));
                pound = yen * 0.01;
                System.out.println("Pound : "+f.format(pound));
                euro = yen * 0.01;
                System.out.println("Euro : "+f.format(euro));
            }
            else
                System.out.println("Invalid Code");
    }
}

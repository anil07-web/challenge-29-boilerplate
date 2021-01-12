import java.util.Scanner;
abstract class Transmission{
    private String model;
    private int forward_gears;
    private float first_gear_ratio;
    private float second_gear_ratio;
    private float third_gear_ratio;
    private float fourth_gear_ratio;
    public Transmission(String str){
        if(str.equals("MP4")){
            this.model="MP4";
            this.forward_gears=4;
            this.first_gear_ratio=2.540f;
            this.second_gear_ratio=1.920f;
            this.third_gear_ratio=1.510f;
            this.fourth_gear_ratio=1.000f;
        }
        else if(str.equals("MP5")){
            this.model="MP5";
            this.forward_gears=5;
            this.first_gear_ratio=3.545f;
            this.second_gear_ratio=1.904f;
            this.third_gear_ratio=1.280f;
            this.fourth_gear_ratio=0.914f;
        }
        else if(str.equals("MP6")){
            this.model="MP6";
            this.forward_gears=6;
            this.first_gear_ratio=3.010f;
            this.second_gear_ratio=2.070f;
            this.third_gear_ratio=1.430f;
            this.fourth_gear_ratio=1.000f;
            }
        else if(str.equals("MD5")){
            this.model="MD5";
            this.forward_gears=5;
            this.first_gear_ratio=3.545f;
            this.second_gear_ratio=1.904f;
            this.third_gear_ratio=1.233f;
            this.fourth_gear_ratio=0.911f;
        }
        else if(str.equals("MD6")){
            this.model="MD6";
            this.forward_gears=6;
            this.first_gear_ratio=3.640f;
            this.second_gear_ratio=2.150f;
            this.third_gear_ratio=1.360f;
            this.fourth_gear_ratio=1.000f;
        }
        else if(str.equals("AMTP4")){
            this.model="AMTP4";
            this.forward_gears=4;
            this.first_gear_ratio=2.540f;
            this.second_gear_ratio=1.920f;
            this.third_gear_ratio=1.510f;
            this.fourth_gear_ratio=1.000f;
        }
        else if(str.equals("AMTD5")){
            this.model="AMTD5";
            this.forward_gears=5;
            this.first_gear_ratio=2.950f;
            this.second_gear_ratio=1.940f;
            this.third_gear_ratio=1.340f;
            this.fourth_gear_ratio=1.000f;
        }
        else if(str.equals("CVT6")){
            this.model="CV6";
            this.forward_gears=6;
            this.first_gear_ratio=2.631f;
            this.second_gear_ratio=1.440f;
            this.third_gear_ratio=1.165f;
            this.fourth_gear_ratio=0.906f;
        }
        else if(str.equals("DCT8")){
            this.model="DCT8";
            this.forward_gears=8;
            this.first_gear_ratio=4.714f;
            this.second_gear_ratio=3.143f;
            this.third_gear_ratio=2.106f;
            this.fourth_gear_ratio=1.667f;
        }
    }
    public String getmodel() {
        return model;
    }
    public float getforgear() {
        return forward_gears;
    }
    public float getfirgear() {
        return  first_gear_ratio;
    }
    public float getsecgear() {
        return  second_gear_ratio;
    }
    public float getthirdgear() {
        return third_gear_ratio;
    }
    public float getforthgear() {
        return fourth_gear_ratio;
    }
    abstract void showSpec(String str); 
}


class Manual extends Transmission{
    private float fifth_gear_ratio;
    private float sixth_gear_ratio;
    public Manual(String str){
        super(str);
        if(str.equals("MP5")){
            this.fifth_gear_ratio=0.757F;
        }
        
        else if(str.equals("MP6")){
            this.fifth_gear_ratio=0.710f;
            this.sixth_gear_ratio=0.570f;  
        }
        else if(str.equals("MD5")){
            this.fifth_gear_ratio=0.725f;
           
        }
        else if(str.equals("MD6")){
            this.fifth_gear_ratio=0.750f;
            this.sixth_gear_ratio=0.630f;  
    }
}
    @Override
    public void showSpec(String str) {
        System.out.println("Transmission Type : Manual Transmission");
        System.out.println("Transmission Model Number : "+getmodel());
        System.out.println("\nKey Specifications : \n");
        System.out.println("1. Forward Gears : "+getforgear());
        System.out.println("2. 1st Gear Ratio : "+getfirgear());
        System.out.println("3. 2nd Gear Ratio : "+getsecgear());
        System.out.println("4. 3rd Gear Ratio : "+getthirdgear());
        System.out.println("5. 4th Gear Ratio : "+getforthgear());
        if(str.equals("MP5") || str.equals("MD5"))
        System.out.println("6. 5th Gear Ratio : "+fifth_gear_ratio);
        else if(str.equals("MP6") || str.equals("MD6")){
        System.out.println("6. 5th Gear Ratio : "+fifth_gear_ratio);
        System.out.println("7. 6th Gear Ratio : "+sixth_gear_ratio);
        }
    }  
}


class AMT extends Transmission{
    private float fifth_gear_ratio;
    public AMT(String str){
        super(str);
        if(str.equals("AMTD5")){
            this.fifth_gear_ratio=0.630f;
        }
    }
    @Override
     public void showSpec(String str) {
        System.out.println("Transmission Type : Automated Manual");
        System.out.println("Transmission Model Number : "+getmodel());
        System.out.println("\nKey Specifications : \n");
        System.out.println("1. Forward Gears : "+getforgear());
        System.out.println("2. 1st Gear Ratio : "+getfirgear());
        System.out.println("3. 2nd Gear Ratio : "+getsecgear());
        System.out.println("4. 3rd Gear Ratio : "+getthirdgear());
        System.out.println("5. 4th Gear Ratio : "+getforthgear());
        if(str.equals("AMTD5"))
        System.out.println("6. 5th Gear Ratio : "+fifth_gear_ratio);
    }
}

class Automatic extends Transmission{
    private float fifth_gear_ratio;
    private float sixth_gear_ratio;
    private float seventh_gear_ratio;
    private float eighth_gear_ratio;
    public Automatic(String str){
        super(str);
        if(str.equals("CVT6")){
            this.fifth_gear_ratio=0.680f;
            this.sixth_gear_ratio=0.499f;
        }
        else if(str.equals("DCT8")){
            this.fifth_gear_ratio=1.285f;
            this.sixth_gear_ratio=1.000f;
            this.seventh_gear_ratio=0.839f;
            this.eighth_gear_ratio=0.667f;
        }
    }
    @Override
    public void showSpec(String str) {
        System.out.println("Transmission Type : Automatic Transmission");
        System.out.println("Transmission Model Number : "+getmodel());
        System.out.println("\nKey Specifications : \n");
        System.out.println("1. Forward Gears : "+getforgear());
        System.out.println("2. 1st Gear Ratio : "+getfirgear());
        System.out.println("3. 2nd Gear Ratio : "+getsecgear());
        System.out.println("4. 3rd Gear Ratio : "+getthirdgear());
        System.out.println("5. 4th Gear Ratio : "+getforthgear());
        if(str.equals("CVT6")){
        System.out.println("6. 5th Gear Ratio : "+fifth_gear_ratio);
        System.out.println("7. 6th Gear Ratio : "+sixth_gear_ratio);
        }
        else if(str.equals("DCT8")){
        System.out.println("6. 5th Gear Ratio : "+fifth_gear_ratio);
        System.out.println("7. 6th Gear Ratio : "+sixth_gear_ratio);
        System.out.println("8. 7th Gear Ratio : "+seventh_gear_ratio);
        System.out.println("9. 8th Gear Ratio : "+eighth_gear_ratio);
        }
    }
}


class Challenge29{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Model_No :");
        String str = obj.next();
        System.out.println();
        if(str.equals("MP4")||str.equals("MP5")||str.equals("MP6")||str.equals("MD5")||str.equals("MD6")){
            Manual man = new Manual(str);
            man.showSpec(str);
        }
        else if(str.equals("AMTP4")||str.equals("AMTD5")){
            AMT amt  = new AMT(str);
            amt.showSpec(str);
        }
        else if(str.equals("CVT6")||str.equals("DCT8")){
            Automatic auto = new Automatic(str);
            auto.showSpec(str);
        }
        else 
        System.out.println("Please ! Enter Valid Model_No.\n");    
    }
}

    































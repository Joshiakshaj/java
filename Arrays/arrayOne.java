public class arrayOne{
    public static void main(String[] args) {
      //type[]arrayName = new type[size];  
        int[]marks = new int[3];
        marks[0] = 99; //phy
        marks[1] = 98; //chem
        marks[2] = 96; //math
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);

        for(int i = 0; i<3; i++){
        System.out.println(marks[i]);
        }
    }
}

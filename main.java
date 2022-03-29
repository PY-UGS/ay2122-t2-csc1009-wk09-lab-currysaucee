import gen.generate;

public class main {
    
    public static void main(String[] args) {
        System.out.println("small letter\tcap letter\tnumber\t\trandom\t\tprime number?");
        for (int index =0; index<15; index++){
            generate generate = new generate();
            char temp1 = generate.getRandomLowerCaseLetter();
            char temp2 = generate.getRandomUpperCaseLetter();
            char temp3 = generate.getRandomDigitCharacter();
            char temp4 = generate.getRandomCharacter();
            Boolean temp5 = generate.isprime(temp3);
            System.out.println(temp1+"\t\t"+temp2+"\t\t"+temp3+"\t\t"+temp4+"\t\t"+temp5);
            System.out.println("==============================================================================");
        }
    }
}

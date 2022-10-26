// DNA class
public class DNA {
    // main method
    public static void main(String[] args) {
        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ / 
        //   / \   \   / \   \  
        //  ~   `-~ `-`   `-~ `-
        // DNA strings
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        // DNA to test
        String dna = dna1;
        // print length of DNA to console
        int dnaLength = dna.length();
        System.out.println("DNA sequence: " + dna);
        System.out.println();
        System.out.println("This DNA's length is: " + dnaLength);
        System.out.println();
        // print start codon to console
        String startCodon = dna.substring(0, 3);
        System.out.println("Start Codon: " + startCodon);
        System.out.println();
        // print end codon to console
        String endCodon = dna.substring(12, 15);
        System.out.println("End Codon: " + endCodon);
        System.out.println();
        // print index of start codon of DNA to console
        int startCodonIndex = dna.indexOf("ATG");
        System.out.println("The index of start codon is: " + startCodonIndex);
        System.out.println();
        // print index of stop codon of DNA to console
        int stopCodonIndex = dna.indexOf("TGA");
        System.out.println("The index of stop codon is: " + stopCodonIndex);
        System.out.println();

        

    }
}
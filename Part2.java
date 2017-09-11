
public class Part2{

     public String findSimpleGene(String dna, String startCodon, String stopCodon)
     {
            String result = "";
            
            int i, characterCase;
            
            if(Character.isLowerCase(dna.charAt(0)))
            {
                characterCase = 1;
            }
            else
            {   
                characterCase = 2;
            }
            
            for(i=1; i<dna.length(); i++)
            {
                if(characterCase == 1 && Character.isUpperCase(dna.charAt(i)))
                {   
                    System.out.print("\nError: DNA sequence has varying character case.");
                    return result;
                }
                else if(characterCase == 2 && Character.isLowerCase(dna.charAt(i)))
                {
                    System.out.print("\nError: DNA sequence has varying character case.");
                    return result;
                }
            }
            int startIndex = dna.indexOf(startCodon);
            
            if(startIndex == -1)
            {
            return result;
            }
            
            int stopIndex = dna.indexOf(stopCodon, startIndex + 3);
            
            while(stopIndex != -1)
            {
                   if( (stopIndex - startIndex) % 3 == 0)
                   {
                       result = dna.substring(startIndex, stopIndex + 3);
                       break;
                    }
                    else
                    {
                        stopIndex = dna.indexOf(stopCodon, stopIndex + 1);
                    }
            }
            
            return result;
     }
     public void testSimpleGene()
     {
         //No start codon
         String dna = "ATTCAGTGCTAATGC";
         String gene = findSimpleGene(dna, "ATG", "TAA");
         System.out.println("\nDNA Strand: " + dna + "\nGene: " + gene);
         
         //No stop codon
         dna = "ATGCAGTGCTACTGC";
         gene = findSimpleGene(dna, "ATG", "TAA");
         System.out.println("\nDNA Strand: " + dna + "\nGene: " + gene);
         
         //Distance between start and stop codon is not divisible by 3
         dna = "ATGCAGTGCTTAATGC";
         gene = findSimpleGene(dna, "ATG", "TAA");
         System.out.println("\nDNA Strand: " + dna + "\nGene: " + gene);
         
         //Distance between start and stop codon is divisible by 3
         dna = "ATGCAGTGCTAATCG";
         gene = findSimpleGene(dna, "ATG", "TAA");
         System.out.println("\nDNA Strand: " + dna + "\nGene: " + gene);
         
         //One start codon and two stop codons
         dna = "ATGCAGTGCTAATAA";
         gene = findSimpleGene(dna, "ATG", "TAA");
         System.out.println("\nDNA Strand: " + dna + "\nGene: " + gene);
         
         //All lowercase dna sequence
         dna = "atgcagtgctaataa";
         gene = findSimpleGene(dna, "atg", "taa");
         System.out.println("\nDNA Strand: " + dna + "\nGene: " + gene);
         
         //Mixed Character Case
         dna = "atgCAGTGCTAATCG";
         gene = findSimpleGene(dna, "atg", "TAA");
         System.out.println("\nDNA Strand: " + dna + "\nGene: " + gene);
         
         //Mixed Character Case
         dna = "ATGcagTGCtaaTCG";
         gene = findSimpleGene(dna, "ATG", "taa");
         System.out.println("\nDNA Strand: " + dna + "\nGene: " + gene);
         
     }
}
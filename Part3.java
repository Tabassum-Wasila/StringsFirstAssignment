public class Part3
{
    public boolean twoOccurrences(String stringa, String stringb)
    {
        int countOccurrences = 0;
        int index = stringb.indexOf(stringa);
        
        while(index != -1)
        {    
            if(++countOccurrences == 2)
            {    
                return true;
            }
                
            index = stringb.indexOf(stringa, index + 1);
        }
        
        return false;
    }
    public void testing()
    {
        System.out.println("Stringa = by \nStringb = A story by Abby Long");
        boolean check = twoOccurrences("by", "A story by Abby Long");
        if(check)
        {
            System.out.println("twoOccurrences return value = true");
        }
        else
        {
            System.out.println("twoOccurrences return value = false");
        }
        
        System.out.println("Stringa = a \nStringb = banana");
        check = twoOccurrences("a", "banana");
        if(check)
        {
            System.out.println("twoOccurrences return value = true");
        }
        else
        {
            System.out.println("twoOccurrences return value = false");
        }
        
        System.out.println("Stringa = atg \nStringb = ctgtatgta");
        check = twoOccurrences("atg", "ctgtatgta");
        if(check)
        {
            System.out.println("twoOccurrences return value = true");
        }
        else
        {
            System.out.println("twoOccurrences return value = false");
        }
    }
}
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
    
    public String lastPart(String stringa, String stringb)
    {
        String result = "";
        int index = stringb.indexOf(stringa);
        if(index == -1)
        {
            result = stringb;
        }
        else
        {
            result = stringb.substring(index + stringa.length(), stringb.length() );
        }
        return result;
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
        
        String result = lastPart("by", "A story by Abby Long");
        System.out.println("The part of the string after by in A story by Abby Long is " + result);
        
        result = lastPart("a", "banana");
        System.out.println("The part of the string after a in banana is " + result);
        
        result = lastPart("zoo", "forest");
        System.out.println("The part of the string after zoo in forest is " + result);
    }
}
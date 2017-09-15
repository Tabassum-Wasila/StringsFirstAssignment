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
}
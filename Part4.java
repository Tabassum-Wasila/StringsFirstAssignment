import edu.duke.*;

public class Part4{
        
    public void findYoutubeURL()
    {
        URLResource data = new URLResource("https://www.dukelearntoprogram.com/course2/data/manylinks.html");
        
        for (String line : data.lines() )
        {
            line = line.toLowerCase();
            int find = line.indexOf("youtube.com");
            
            if (find != -1)
            {
                int stop = line.indexOf("\"", find + 1);
                int start = line.lastIndexOf("\"", find);
                System.out.println(line.substring(start + 1, stop));
            }
            
        }
    }
}
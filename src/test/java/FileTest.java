import java.io.*;

/**
 * Created by cujamin on 2017/7/22.
 */
public class FileTest {
    public static void main(String[]args)
    {
        System.out.println(getExecutorQueueName());
    }
    public static String getExecutorQueueName()
    {
        File file = new File("queueName");
        BufferedReader reader = null;
        int n = 0;
        String queueName="";

        try
        {
            reader = new BufferedReader(new FileReader(file));
            queueName = reader.readLine();
        }
        catch (FileNotFoundException f)
        {
            file.createNewFile();
            String str = "亲爱的小南瓜！!!!";
            byte bt[] = str.getBytes();
            try {
                FileOutputStream in = new FileOutputStream(file);
                in.write(bt, 0, bt.length);
                in.close();
            }catch (IOException i)
            {
                System.out.println("fi");
            }
            reader = new BufferedReader(new FileReader(file));
            queueName = reader.readLine();
            System.out.println("f");
        } finally {
            return queueName;
        }
    }
}

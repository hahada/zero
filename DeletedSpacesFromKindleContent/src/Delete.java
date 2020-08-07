import com.sun.org.apache.xpath.internal.objects.XString;
import netscape.security.UserTarget;

import java.io.*;
import java.util.Date;

public class Delete {
    public static void readFileByLinesAndWrite(String fileSourceName, String fileTargetName) throws IOException {
        File fileForRead = new File(fileSourceName);
        File fileForWrite = new File(fileTargetName);
        FileWriter fileWritter = new FileWriter(fileForWrite.getName(),true);
        BufferedReader  reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileForRead));
            String tempString =null;
            int line = 1;
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                String b = tempString.replace(" ","");
                System.out.println(b);
                fileWritter.write(b+"\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
                fileWritter.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        readFileByLinesAndWrite("kindle.txt", "kindleNew.txt");
    }
}


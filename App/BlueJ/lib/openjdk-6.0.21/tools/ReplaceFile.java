import java.io.*;

public class ReplaceFile
{
    public static void main(String[] args)
    {

        String invalidUsgae = "ERROR: Usage must be: java ReplaceFile \"fileNm\" \"oldStr1\" \"newStr1\" ... \"oldStrN\" \"newStrN\"";

        //  args.length must be >=3 AND an odd number /////////////////////////////
        int oddArgs = args.length % 2; 
        if ( (args.length < 3 ) || (oddArgs == 0) ) {
          System.out.println(invalidUsgae);
          System.exit(1);
        }

        String pFileName = args[0];

        // read in the file with Old Strings /////////////////////////////////////
        File file = new File(pFileName);
        StringBuffer contents = new StringBuffer();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;
            while ((text = reader.readLine()) != null) {
                contents.append(text)
                    .append(System.getProperty(
                        "line.separator"));
            }
           reader.close();
        } catch (IOException e) {
            System.out.println("ERROR: Reading File");
            System.exit(1);
        } 

        // Search and Replace using string pairs from command line parms //////
        String textFile = contents.toString();
        for (int n=1; n < args.length; n=n+2) {
           String newTextFile = textFile.replaceAll(args[n], args[n+1]);
           textFile = newTextFile;
        }

        // Write out the file with New Strings ///////////////////////////////
        try {
            File outFile = new File(pFileName);
            FileWriter out = new FileWriter(outFile);
            out.write(textFile);
            out.close();
        } catch (IOException e) {
            System.out.println("ERROR: Writing File");
            System.exit(1);
        } 

        System.exit(0);
    }
}

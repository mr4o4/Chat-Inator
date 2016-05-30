import java.io.*;
import java.net.*;


public class server
{
public static void main(String[] args)
{
try
{
ServerSocket s = new ServerSocket(80);
Socket insocket = s.accept(  );
BufferedReader in = new BufferedReader (new InputStreamReader(insocket.getInputStream()));
PrintWriter out = new PrintWriter (insocket.getOutputStream(),true);
String instring = in.readLine();
out.print("server got this : "+instring);
insocket.close();
}
catch (Exception e)
{
}
}
}
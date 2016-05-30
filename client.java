import java.io.*;
import java.net.*;
class client
{
public static void main(String args[]) throws Exception 
{
int character;
Socket socket = new Socket("127.0.0.1",80);
InputStream in = socket.getInputStream();
OutputStream out = socket.getOutputStream();
String string = "hello i am aman!\n";
byte buffer [  ]=string.getBytes();
out.write(buffer);
while((character = in.read())!=-1)
{
System.out.println((char) character);
}
socket.close();
}
}















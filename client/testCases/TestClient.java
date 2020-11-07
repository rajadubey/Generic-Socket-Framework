import com.thinking.machines.tcp.client.*;
import com.thinking.machines.tcp.common.event.*;
import com.thinking.machines.tcp.common.pojo.*;
import java.io.*;
class TestResponseListener implements ResponseListener
{
public void onResponseBytes(byte bytes[])
{
System.out.println("ResponseBytes "+bytes);
}
public void onError(String s)
{
System.out.println("onError(TestResponseListener) "+s);
}
}
class TestTCPListener implements TCPListener
{
public byte[] onData(Client client,byte bytes[]) 
{
String request=new String(client.getBytes());
try
{
String messageResponse="Indore"; //MessageProcessor.process(request);
return messageResponse.getBytes();
}catch(Exception exception)
{
System.out.println(exception)import com.thinking.machines.tcp.client.*;
import com.thinking.machines.tcp.common.event.*;
import com.thinking.machines.tcp.common.pojo.*;
import java.io.*;
class TestResponseListener implements ResponseListener
{
public void onResponseBytes(byte bytes[])
{
System.out.println("ResponseBytes "+bytes);
}
public void onError(String s)
{
System.out.println("onError(TestResponseListener) "+s);
}
}
class TestTCPListener implements TCPListener
{
public byte[] onData(Client client,byte bytes[]) 
{
String request=new String(client.getBytes());
try
{
String messageResponse="Indore"; //MessageProcessor.process(request);
return messageResponse.getBytes();
}catch(Exception exception)
{
System.out.println(exception);
}
return null;
}
public void onOpen(Client client)
{
System.out.println("onOpen TestClient");
}
public void onClose(Client client)
{
System.out.println("onClose TestClient");
}

}
public class TestClient
{
public static void main(String gg[]) throws IOException
{
TCPClient tcpClient=new TCPClient(5000,"localhost",5001,"localhost",new TestTCPListener());
String s="Himmat";
tcpClient.send(s.getBytes(),new TestResponseListener());
}

}

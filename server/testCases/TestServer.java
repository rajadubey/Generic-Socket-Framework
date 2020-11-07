//import com.thinking.machines.chat.server.*;
import com.thinking.machines.tcp.common.event.*;
import com.thinking.machines.tcp.server.*;
import com.thinking.machines.tcp.common.pojo.*;
import java.util.*;
import java.io.*;
class TestTCPHandler implements TCPListener
{
public byte[] onData(Client client,byte bytes[]) 
{
System.out.println("request received from :"+client.getIP());
String request=new String(client.getBytes());
try
{
String messageResponse="ujjain"; //MessageProcessor.process(request);
return messageResponse.getBytes();
}catch(Exception exception)
{
System.out.println(exception);
}
return null;
}
public void onOpen(Client client)
{
System.out.println("onOpen(TestTCPHandler) gets called.");
}
public void onClose(Client clie//import com.thinking.machines.chat.server.*;
import com.thinking.machines.tcp.common.event.*;
import com.thinking.machines.tcp.server.*;
import com.thinking.machines.tcp.common.pojo.*;
import java.util.*;
import java.io.*;
class TestTCPHandler implements TCPListener
{
public byte[] onData(Client client,byte bytes[]) 
{
System.out.println("request received from :"+client.getIP());
String request=new String(client.getBytes());
try
{
String messageResponse="ujjain"; //MessageProcessor.process(request);
return messageResponse.getBytes();
}catch(Exception exception)
{
System.out.println(exception);
}
return null;
}
public void onOpen(Client client)
{
System.out.println("onOpen(TestTCPHandler) gets called.");
}
public void onClose(Client client)
{
System.out.println("onClose(TestTCPHandler) gets called");
}
}
class TestServer
{
public static void main(String gg[]) throws IOException
{
System.out.println("Server is ready to be called");
TCPServer tcpServer=new TCPServer(5000,5001);
System.out.println("Control comes back to TestServer");
tcpServer.start(new TestTCPHandler());
System.out.println("Test compeleted");
}
}

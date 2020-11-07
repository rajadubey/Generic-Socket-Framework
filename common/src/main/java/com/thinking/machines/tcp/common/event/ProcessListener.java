apply plugin : 'java'

dependencies{

compile fileTree('dir':'/uecu2019/common/build/libs/','include':'*.jar')

}
package com.thinking.machines.tcp.common.event;
import com.thinking.machines.tcp.common.pojo.*;
public interface ProcessListener
{
public void onCompleted(Client client);
}

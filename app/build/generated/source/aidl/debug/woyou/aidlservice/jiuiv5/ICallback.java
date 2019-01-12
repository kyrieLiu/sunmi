/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\sunmi\\app\\src\\main\\aidl\\woyou\\aidlservice\\jiuiv5\\ICallback.aidl
 */
package woyou.aidlservice.jiuiv5;
/**
 * 打印服务执行结果的回调
 */
public interface ICallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements woyou.aidlservice.jiuiv5.ICallback
{
private static final java.lang.String DESCRIPTOR = "woyou.aidlservice.jiuiv5.ICallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an woyou.aidlservice.jiuiv5.ICallback interface,
 * generating a proxy if needed.
 */
public static woyou.aidlservice.jiuiv5.ICallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof woyou.aidlservice.jiuiv5.ICallback))) {
return ((woyou.aidlservice.jiuiv5.ICallback)iin);
}
return new woyou.aidlservice.jiuiv5.ICallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onRunResult:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
this.onRunResult(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements woyou.aidlservice.jiuiv5.ICallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
	* 返回执行结果
	* @param isSuccess:	  true执行成功，false 执行失败
	*/
@Override public void onRunResult(boolean isSuccess, int code, java.lang.String msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isSuccess)?(1):(0)));
_data.writeInt(code);
_data.writeString(msg);
mRemote.transact(Stub.TRANSACTION_onRunResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onRunResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
	* 返回执行结果
	* @param isSuccess:	  true执行成功，false 执行失败
	*/
public void onRunResult(boolean isSuccess, int code, java.lang.String msg) throws android.os.RemoteException;
}

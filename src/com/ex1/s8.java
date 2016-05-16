package com.ex1;
import java.net.*;
import java.io.*;

public class s8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			@SuppressWarnings({ "unused", "resource" })
			ServerSocket ss=new ServerSocket(9999);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}

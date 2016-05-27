package com.songyl.maven02.util;
import com.songyl.maven01.model.HelloWorld;

public class Speak{
	public String sayHi(){
		return new HelloWorld().sayHello();
	}
}
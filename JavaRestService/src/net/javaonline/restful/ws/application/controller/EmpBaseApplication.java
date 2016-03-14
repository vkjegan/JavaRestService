package net.javaonline.restful.ws.application.controller;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


//Does not require web.xml
//to define the base URI pattern
@ApplicationPath(value="/resource" )
public class EmpBaseApplication extends Application
{
	public EmpBaseApplication( ) {}
 
	@Override
	public Set<Class<?>> getClasses( )
	{
		final Set<Class<?>> rSet = new HashSet<Class<?>>( );
		rSet.add( GetEmployeeDetailsService.class );
		return rSet;
	}
}

DeployGate plugin for Tinyspring Android
=======

Automatically setups the DeployGate framework on application start.. 

#### Just add following lines to your ivy.xml/pom.xml

```xml
<dependency org="com.deploygate" name="sdk" rev="3.1" />
<dependency org="com.tinyspring" name="tinyspring-android-deploygate" rev="0.0.1" />
```

```xml
<dependency>
	<groupId>com.deploygate</groupId>
	<artifactId>sdk</artifactId>
	<version>3.1</version>
</dependency>
<dependency>
	<groupId>com.tinyspring</groupId>
	<artifactId>tinyspring-android-deploygate</artifactId>
	<version>0.0.1</version>
</dependency>
```

#### Then define a plugin in assets/tinyspring-android.xml 

```
<bean id="applicationConfiguration" class="com.tinyspring.android.ApplicationConfiguration">
    <property name="plugins">
	<util:list value-type="">
		<value>
                	<bean class="com.tinyspring.android.deploygate.Plugin" />
                </value>
        </util:list>
    </property>
</bean>
```

And that's it.

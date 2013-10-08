konakart-admin maven
==============

Konakart admin Maven style directory layout 
Konakart admin release  6.5.1.0 

### Creating Build Profile

You need to create a profiles.xml configuration file and set the following properties

#### profiles.xml

```xml
 <properties>
      
        <connection.url>... your db connection  URL settings...</connection.url>
		<connection.username>your db connection username...</connection.username>
		<connection.password>... your db connection password... </connection.password>
		<konakart.properties.file>... your konakart properties file path...</konakart.properties.file>
		<konakart.admin.properties.file>... your konakart admin properties file path...</konakart.admin.properties.file>
		<konakart.admin.app.properties.file>C:/Users/admin/workspace2/.metadata/.plugins/org.eclipse.wst.server.core/tmp4/wtpwebapps/konakart-admin-maven/WEB-INF/classes/konakartadmin_gwt.properties</konakart.admin.app.properties.file>
		<konakart.logging.properties.file>C:/Users/admin/workspace2/.metadata/.plugins/org.eclipse.wst.server.core/tmp3/wtpwebapps/konakart/WEB-INF/classes/konakart-logging.properties</konakart.logging.properties.file>
		<konakart.admin.logging.properties.file>C:/Users/admin/workspace2/.metadata/.plugins/org.eclipse.wst.server.core/tmp4/wtpwebapps/konakart-admin-maven/WEB-INF/classes/konakart-logging.properties</konakart.admin.logging.properties.file>
		<konakart.mail.properties.file>C:/Users/admin/workspace2/.metadata/.plugins/org.eclipse.wst.server.core/tmp3/wtpwebapps/konakart/WEB-INF/classes/conf/konakart_mail.properties</konakart.mail.properties.file>
		
 </properties>
```

To create WAR package with konakart-admin assembled  run the following command:

`$ mvn package -Pprod`
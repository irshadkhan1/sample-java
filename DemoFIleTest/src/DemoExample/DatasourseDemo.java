package DemoExample;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DatasourseDemo {

	private static DataSource datasource;
	private static final String JNDI_LOOKUP_SERVICE="testdata";
	static {
		try {
			Context context = new InitialContext();
			Object lookup =context.lookupLink(JNDI_LOOKUP_SERVICE);
			if(lookup!=null) {
				datasource =(DataSource)lookup;
			}
			else {
				new RuntimeException("datasource not found");
			}
		}catch(NamingException e) {
			e.printStackTrace();
		}
		
	}
	public static DataSource getDataSource() {
		return datasource;
	}
}

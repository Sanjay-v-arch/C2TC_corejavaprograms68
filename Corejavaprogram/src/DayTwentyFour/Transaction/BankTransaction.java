//Program to demonstrate JDBC Transaction Functions
package DayTwentyFour.Transaction;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DayTwentyFour.Dao.DBUtil;

public class BankTransaction {
	deposite(dAcct, amt);
	con.commit();
} catch (Exception e) {
	try {
		con.rollback();
	} catch (Exception e1) {
		System.out.println(e1.getMessage());
	}
	System.out.println("Unable to complete transaction at this moment");
}
}

}

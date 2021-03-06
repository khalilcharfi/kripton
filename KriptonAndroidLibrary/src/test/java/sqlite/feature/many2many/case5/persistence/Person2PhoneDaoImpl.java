package sqlite.feature.many2many.case5.persistence;

import com.abubusoft.kripton.android.sqlite.AbstractDao;
import com.abubusoft.kripton.android.sqlite.SQLContext;

/**
 * <p>
 * DAO implementation for entity <code>PersonPhoneNumber</code>, based on interface <code>GeneratedPerson2PhoneDao</code>
 * </p>
 *
 *  @see PersonPhoneNumber
 *  @see GeneratedPerson2PhoneDao
 *  @see PersonPhoneNumberTable
 */
public class Person2PhoneDaoImpl extends AbstractDao implements GeneratedPerson2PhoneDao {
  public Person2PhoneDaoImpl(SQLContext context) {
    super(context);
  }

  public static void clearCompiledStatements() {
  }
}

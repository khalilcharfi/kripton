package sqlite.feature.rx.persistence;

import com.abubusoft.kripton.android.ColumnType;
import com.abubusoft.kripton.android.annotation.BindColumn;
import com.abubusoft.kripton.android.annotation.BindTable;
import com.abubusoft.kripton.android.sqlite.ForeignKeyAction;
import sqlite.feature.rx.model.Person;
import sqlite.feature.rx.model.PhoneNumber;

/**
 * <p>
 * Generated entity implementation for <code>PersonPhoneNumber</code>
 * </p>
 */
@BindTable(
    name = "person_phone_number"
)
public class PersonPhoneNumber {
  /**
   * Primary key
   */
  @BindColumn(
      columnType = ColumnType.PRIMARY_KEY
  )
  public long id;

  /**
   * Foreign key to Person model class
   */
  @BindColumn(
      foreignKey = Person.class,
      onDelete = ForeignKeyAction.CASCADE
  )
  public long personId;

  /**
   * Foreign key to PhoneNumber model class
   */
  @BindColumn(
      foreignKey = PhoneNumber.class,
      onDelete = ForeignKeyAction.CASCADE
  )
  public long phoneNumberId;
}

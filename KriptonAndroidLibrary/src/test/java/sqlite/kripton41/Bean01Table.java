package sqlite.kripton41;

import java.lang.String;

/**
 * <p>
 * Entity <code>Bean01</code> is associated to table <code>bean01</code>
 * This class represents table associated to entity.
 * </p>
 *  @see Bean01
 */
public class Bean01Table {
  /**
   * Costant represents name of table bean01
   */
  public static final String TABLE_NAME = "bean01";

  /**
   * <p>
   * DDL to create table bean01
   * </p>
   *
   * <pre>CREATE TABLE bean01 (ID INTEGER PRIMARY KEY AUTOINCREMENT, TEXT TEXT, VALUE REAL);</pre>
   */
  public static final String CREATE_TABLE_SQL = "CREATE TABLE bean01 (ID INTEGER PRIMARY KEY AUTOINCREMENT, TEXT TEXT, VALUE REAL);";

  /**
   * <p>
   * DDL to drop table bean01
   * </p>
   *
   * <pre>DROP TABLE IF EXISTS bean01;</pre>
   */
  public static final String DROP_TABLE_SQL = "DROP TABLE IF EXISTS bean01;";

  /**
   * Entity's property <code>id</code> is associated to table column <code>ID</code>. This costant represents column name.
   *
   *  @see Bean01#id
   */
  public static final String COLUMN_ID = "ID";

  /**
   * Entity's property <code>text</code> is associated to table column <code>TEXT</code>. This costant represents column name.
   *
   *  @see Bean01#text
   */
  public static final String COLUMN_TEXT = "TEXT";

  /**
   * Entity's property <code>value</code> is associated to table column <code>VALUE</code>. This costant represents column name.
   *
   *  @see Bean01#value
   */
  public static final String COLUMN_VALUE = "VALUE";
}

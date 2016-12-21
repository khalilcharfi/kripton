package sqlite.kripton58.list;

import com.abubusoft.kripton.KriptonBinder;
import com.abubusoft.kripton.KriptonJsonContext;
import com.abubusoft.kripton.common.KriptonByteArrayOutputStream;
import com.abubusoft.kripton.exception.KriptonRuntimeException;
import com.abubusoft.kripton.persistence.JacksonWrapperParser;
import com.abubusoft.kripton.persistence.JacksonWrapperSerializer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.lang.Exception;
import java.lang.String;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import sqlite.kripton58.BeanInner;

/**
 * <p>
 * Entity <code>BeanBean</code> is associated to table <code>bean_bean</code>
 * This class represents table associated to entity.
 * </p>
 *  @see BeanBean
 */
public class BeanBeanTable {
  /**
   * Costant represents name of table bean_bean
   */
  public static final String TABLE_NAME = "bean_bean";

  /**
   * <p>
   * DDL to create table bean_bean
   * </p>
   *
   * <pre>CREATE TABLE bean_bean (ID INTEGER PRIMARY KEY AUTOINCREMENT, VALUE BLOB, VALUE2 BLOB);</pre>
   */
  public static final String CREATE_TABLE_SQL = "CREATE TABLE bean_bean (ID INTEGER PRIMARY KEY AUTOINCREMENT, VALUE BLOB, VALUE2 BLOB);";

  /**
   * <p>
   * DDL to drop table bean_bean
   * </p>
   *
   * <pre>DROP TABLE IF EXISTS bean_bean;</pre>
   */
  public static final String DROP_TABLE_SQL = "DROP TABLE IF EXISTS bean_bean;";

  /**
   * Entity's property <code>id</code> is associated to table column <code>ID</code>. This costant represents column name.
   *
   *  @see BeanBean#id
   */
  public static final String COLUMN_ID = "ID";

  /**
   * Entity's property <code>value</code> is associated to table column <code>VALUE</code>. This costant represents column name.
   *
   *  @see BeanBean#value
   */
  public static final String COLUMN_VALUE = "VALUE";

  /**
   * Entity's property <code>value2</code> is associated to table column <code>VALUE2</code>. This costant represents column name.
   *
   *  @see BeanBean#value2
   */
  public static final String COLUMN_VALUE2 = "VALUE2";

  /**
   * write
   */
  public static byte[] serializeValue(List<BeanInner> value) {
    if (value==null) {
      return null;
    }
    KriptonJsonContext context=KriptonBinder.jsonBind();
    try (KriptonByteArrayOutputStream stream=new KriptonByteArrayOutputStream(); JacksonWrapperSerializer wrapper=context.createSerializer(stream)) {
      JsonGenerator jacksonSerializer=wrapper.jacksonGenerator;
      jacksonSerializer.writeStartObject();
      int fieldCount=0;
      if (value!=null)  {
        fieldCount++;
        int n=value.size();
        BeanInner item;
        // write wrapper tag
        jacksonSerializer.writeFieldName("element");
        jacksonSerializer.writeStartArray();
        for (int i=0; i<n; i++) {
          item=value.get(i);
          if (item==null) {
            jacksonSerializer.writeNull();
          } else {
            context.mapperFor(BeanInner.class).serializeOnJackson(context, item, wrapper);
          }
        }
        jacksonSerializer.writeEndArray();
      }
      jacksonSerializer.writeEndObject();
      jacksonSerializer.flush();
      return stream.toByteArray();
    } catch(Exception e) {
      throw(new KriptonRuntimeException(e.getMessage()));
    }
  }

  /**
   * parse
   */
  public static List<BeanInner> parseValue(byte[] input) {
    if (input==null) {
      return null;
    }
    KriptonJsonContext context=KriptonBinder.jsonBind();
    try (JacksonWrapperParser wrapper=context.createParser(input)) {
      JsonParser jacksonParser=wrapper.jacksonParser;
      // START_OBJECT
      jacksonParser.nextToken();
      // value of "element"
      jacksonParser.nextValue();
      List<BeanInner> result=null;
      if (jacksonParser.currentToken()==JsonToken.START_ARRAY) {
        ArrayList<BeanInner> collection=new ArrayList<>();
        BeanInner item=null;
        while (jacksonParser.nextToken() != JsonToken.END_ARRAY) {
          if (jacksonParser.currentToken()==JsonToken.VALUE_NULL) {
            item=null;
          } else {
            item=context.mapperFor(BeanInner.class).parseOnJackson(context, wrapper);
          }
          collection.add(item);
        }
        result=collection;
      }
      return result;
    } catch(Exception e) {
      throw(new KriptonRuntimeException(e.getMessage()));
    }
  }

  /**
   * write
   */
  public static byte[] serializeValue2(LinkedList<BeanInner> value) {
    if (value==null) {
      return null;
    }
    KriptonJsonContext context=KriptonBinder.jsonBind();
    try (KriptonByteArrayOutputStream stream=new KriptonByteArrayOutputStream(); JacksonWrapperSerializer wrapper=context.createSerializer(stream)) {
      JsonGenerator jacksonSerializer=wrapper.jacksonGenerator;
      jacksonSerializer.writeStartObject();
      int fieldCount=0;
      if (value!=null)  {
        fieldCount++;
        int n=value.size();
        BeanInner item;
        // write wrapper tag
        jacksonSerializer.writeFieldName("element");
        jacksonSerializer.writeStartArray();
        for (int i=0; i<n; i++) {
          item=value.get(i);
          if (item==null) {
            jacksonSerializer.writeNull();
          } else {
            context.mapperFor(BeanInner.class).serializeOnJackson(context, item, wrapper);
          }
        }
        jacksonSerializer.writeEndArray();
      }
      jacksonSerializer.writeEndObject();
      jacksonSerializer.flush();
      return stream.toByteArray();
    } catch(Exception e) {
      throw(new KriptonRuntimeException(e.getMessage()));
    }
  }

  /**
   * parse
   */
  public static LinkedList<BeanInner> parseValue2(byte[] input) {
    if (input==null) {
      return null;
    }
    KriptonJsonContext context=KriptonBinder.jsonBind();
    try (JacksonWrapperParser wrapper=context.createParser(input)) {
      JsonParser jacksonParser=wrapper.jacksonParser;
      // START_OBJECT
      jacksonParser.nextToken();
      // value of "element"
      jacksonParser.nextValue();
      LinkedList<BeanInner> result=null;
      if (jacksonParser.currentToken()==JsonToken.START_ARRAY) {
        LinkedList<BeanInner> collection=new LinkedList<>();
        BeanInner item=null;
        while (jacksonParser.nextToken() != JsonToken.END_ARRAY) {
          if (jacksonParser.currentToken()==JsonToken.VALUE_NULL) {
            item=null;
          } else {
            item=context.mapperFor(BeanInner.class).parseOnJackson(context, wrapper);
          }
          collection.add(item);
        }
        result=collection;
      }
      return result;
    } catch(Exception e) {
      throw(new KriptonRuntimeException(e.getMessage()));
    }
  }
}

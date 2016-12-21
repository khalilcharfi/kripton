package sqlite.kripton64;

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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 * Entity <code>Bean64B</code> is associated to table <code>bean64_b</code>
 * This class represents table associated to entity.
 * </p>
 *  @see Bean64B
 */
public class Bean64BTable {
  /**
   * Costant represents name of table bean64_b
   */
  public static final String TABLE_NAME = "bean64_b";

  /**
   * <p>
   * DDL to create table bean64_b
   * </p>
   *
   * <pre>CREATE TABLE bean64_b (VALUE_MAP_STRING_BEAN BLOB, VALUE_SET_STRING BLOB, VALUE_STRING TEXT, ID INTEGER PRIMARY KEY AUTOINCREMENT);</pre>
   */
  public static final String CREATE_TABLE_SQL = "CREATE TABLE bean64_b (VALUE_MAP_STRING_BEAN BLOB, VALUE_SET_STRING BLOB, VALUE_STRING TEXT, ID INTEGER PRIMARY KEY AUTOINCREMENT);";

  /**
   * <p>
   * DDL to drop table bean64_b
   * </p>
   *
   * <pre>DROP TABLE IF EXISTS bean64_b;</pre>
   */
  public static final String DROP_TABLE_SQL = "DROP TABLE IF EXISTS bean64_b;";

  /**
   * Entity's property <code>valueMapStringBean</code> is associated to table column <code>VALUE_MAP_STRING_BEAN</code>. This costant represents column name.
   *
   *  @see Bean64B#valueMapStringBean
   */
  public static final String COLUMN_VALUE_MAP_STRING_BEAN = "VALUE_MAP_STRING_BEAN";

  /**
   * Entity's property <code>valueSetString</code> is associated to table column <code>VALUE_SET_STRING</code>. This costant represents column name.
   *
   *  @see Bean64B#valueSetString
   */
  public static final String COLUMN_VALUE_SET_STRING = "VALUE_SET_STRING";

  /**
   * Entity's property <code>valueString</code> is associated to table column <code>VALUE_STRING</code>. This costant represents column name.
   *
   *  @see Bean64B#valueString
   */
  public static final String COLUMN_VALUE_STRING = "VALUE_STRING";

  /**
   * Entity's property <code>id</code> is associated to table column <code>ID</code>. This costant represents column name.
   *
   *  @see Bean64B#id
   */
  public static final String COLUMN_ID = "ID";

  /**
   * write
   */
  public static byte[] serializeValueMapStringBean(Map<String, Bean64B> value) {
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
        // write wrapper tag
        if (value.size()>0) {
          jacksonSerializer.writeFieldName("element");
          jacksonSerializer.writeStartArray();
          for (Map.Entry<String, Bean64B> item: value.entrySet()) {
            jacksonSerializer.writeStartObject();
            jacksonSerializer.writeStringField("key", item.getKey());
            if (item.getValue()==null) {
              jacksonSerializer.writeNullField("value");
            } else {
              jacksonSerializer.writeFieldName("value");
              context.mapperFor(Bean64B.class).serializeOnJackson(context, item.getValue(), wrapper);
            }
            jacksonSerializer.writeEndObject();
          }
          jacksonSerializer.writeEndArray();
        } else {
          jacksonSerializer.writeNullField("element");
        }
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
  public static Map<String, Bean64B> parseValueMapStringBean(byte[] input) {
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
      Map<String, Bean64B> result=null;
      if (jacksonParser.currentToken()==JsonToken.START_ARRAY) {
        HashMap<String, Bean64B> collection=new HashMap<>();
        String key=null;
        Bean64B value=null;
        while (jacksonParser.nextToken() != JsonToken.END_ARRAY) {
          jacksonParser.nextValue();
          key=jacksonParser.getText();
          jacksonParser.nextValue();
          if (jacksonParser.currentToken()==JsonToken.START_OBJECT) {
            value=context.mapperFor(Bean64B.class).parseOnJackson(context, wrapper);
          }
          collection.put(key, value);
          key=null;
          value=null;
          jacksonParser.nextToken();
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
  public static byte[] serializeValueSetString(Set<String> value) {
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
        // write wrapper tag
        jacksonSerializer.writeFieldName("element");
        jacksonSerializer.writeStartArray();
        for (String item: value) {
          if (item==null) {
            jacksonSerializer.writeNull();
          } else {
            jacksonSerializer.writeString(item);
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
  public static Set<String> parseValueSetString(byte[] input) {
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
      Set<String> result=null;
      if (jacksonParser.currentToken()==JsonToken.START_ARRAY) {
        HashSet<String> collection=new HashSet<>();
        String item=null;
        while (jacksonParser.nextToken() != JsonToken.END_ARRAY) {
          if (jacksonParser.currentToken()==JsonToken.VALUE_NULL) {
            item=null;
          } else {
            item=jacksonParser.getText();
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

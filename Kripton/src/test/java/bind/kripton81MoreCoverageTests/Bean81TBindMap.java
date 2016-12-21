package bind.kripton81MoreCoverageTests;

import com.abubusoft.kripton.AbstractJacksonContext;
import com.abubusoft.kripton.AbstractMapper;
import com.abubusoft.kripton.KriptonXmlContext;
import com.abubusoft.kripton.annotation.BindMap;
import com.abubusoft.kripton.common.Base64Utils;
import com.abubusoft.kripton.common.PrimitiveUtils;
import com.abubusoft.kripton.escape.StringEscapeUtils;
import com.abubusoft.kripton.exception.KriptonRuntimeException;
import com.abubusoft.kripton.persistence.JacksonWrapperParser;
import com.abubusoft.kripton.persistence.JacksonWrapperSerializer;
import com.abubusoft.kripton.persistence.XmlSerializer;
import com.abubusoft.kripton.persistence.XmlWrapperParser;
import com.abubusoft.kripton.persistence.XmlWrapperSerializer;
import com.abubusoft.kripton.persistence.xml.internal.XmlPullParser;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

/**
 * This class is the shared preference binder defined for Bean81T
 *
 * @see Bean81T
 */
@BindMap(Bean81T.class)
public class Bean81TBindMap extends AbstractMapper<Bean81T> {
  /**
   * create new object instance
   */
  @Override
  public Bean81T createInstance() {
    return new Bean81T();
  }

  /**
   * reset shared preferences
   */
  @Override
  public int serializeOnJackson(AbstractJacksonContext context, Bean81T object, JacksonWrapperSerializer wrapper) {
    try {
      JsonGenerator jacksonSerializer = wrapper.jacksonGenerator;
      jacksonSerializer.writeStartObject();
      int fieldCount=0;

      // Serialized Field:

      // field id (mapped with "id")
      fieldCount++;
      jacksonSerializer.writeNumberField("id", object.id);

      // field valueByteArray (mapped with "valueByteArray")
      if (object.valueByteArray!=null)  {
        fieldCount++;
        jacksonSerializer.writeBinaryField("valueByteArray", object.valueByteArray);
      }

      // field valueInteger (mapped with "valueInteger")
      if (object.valueInteger!=null)  {
        fieldCount++;
        jacksonSerializer.writeNumberField("valueInteger", object.valueInteger);
      }

      // field valueMapStringInteger (mapped with "valueMapStringInteger")
      if (object.valueMapStringInteger!=null)  {
        fieldCount++;
        // write wrapper tag
        if (object.valueMapStringInteger.size()>0) {
          jacksonSerializer.writeFieldName("valueMapStringInteger");
          jacksonSerializer.writeStartArray();
          for (Map.Entry<String, Integer> item: object.valueMapStringInteger.entrySet()) {
            jacksonSerializer.writeStartObject();
            jacksonSerializer.writeStringField("key", item.getKey());
            if (item.getValue()==null) {
              jacksonSerializer.writeNullField("value");
            } else {
              jacksonSerializer.writeNumberField("value", item.getValue());
            }
            jacksonSerializer.writeEndObject();
          }
          jacksonSerializer.writeEndArray();
        } else {
          jacksonSerializer.writeNullField("valueMapStringInteger");
        }
      }

      jacksonSerializer.writeEndObject();
      return fieldCount;
    } catch(Exception e) {
      e.printStackTrace();
      throw (new KriptonRuntimeException(e));
    }
  }

  /**
   * reset shared preferences
   */
  @Override
  public int serializeOnJacksonAsString(AbstractJacksonContext context, Bean81T object, JacksonWrapperSerializer wrapper) {
    try {
      JsonGenerator jacksonSerializer = wrapper.jacksonGenerator;
      jacksonSerializer.writeStartObject();
      int fieldCount=0;

      // Serialized Field:

      // field id (mapped with "id")
      jacksonSerializer.writeStringField("id", PrimitiveUtils.writeLong(object.id));

      // field valueByteArray (mapped with "valueByteArray")
      if (object.valueByteArray!=null)  {
        fieldCount++;
        jacksonSerializer.writeBinaryField("valueByteArray", object.valueByteArray);
      }

      // field valueInteger (mapped with "valueInteger")
      if (object.valueInteger!=null)  {
        jacksonSerializer.writeStringField("valueInteger", PrimitiveUtils.writeInteger(object.valueInteger));
      }

      // field valueMapStringInteger (mapped with "valueMapStringInteger")
      if (object.valueMapStringInteger!=null)  {
        fieldCount++;
        // write wrapper tag
        if (object.valueMapStringInteger.size()>0) {
          jacksonSerializer.writeFieldName("valueMapStringInteger");
          jacksonSerializer.writeStartArray();
          for (Map.Entry<String, Integer> item: object.valueMapStringInteger.entrySet()) {
            jacksonSerializer.writeStartObject();
            jacksonSerializer.writeStringField("key", item.getKey());
            if (item.getValue()==null) {
              jacksonSerializer.writeStringField("value", "null");
            } else {
              jacksonSerializer.writeStringField("value", PrimitiveUtils.writeInteger(item.getValue()));
            }
            jacksonSerializer.writeEndObject();
          }
          jacksonSerializer.writeEndArray();
        } else {
          jacksonSerializer.writeStringField("valueMapStringInteger", "null");
        }
      }

      jacksonSerializer.writeEndObject();
      return fieldCount;
    } catch(Exception e) {
      e.printStackTrace();
      throw (new KriptonRuntimeException(e));
    }
  }

  /**
   * reset shared preferences
   */
  @Override
  public void serializeOnXml(KriptonXmlContext context, Bean81T object, XmlWrapperSerializer wrapper, int currentEventType) {
    try {
      XmlSerializer xmlSerializer = wrapper.xmlSerializer;
      if (currentEventType == 0) {
        xmlSerializer.writeStartElement("bean81T");
      }

      // Persisted fields:

      // field valueInteger (mapped with "valueInteger")
      if (object.valueInteger!=null)  {
        xmlSerializer.writeAttribute("valueInteger", PrimitiveUtils.writeInteger(object.valueInteger));
      }

      // field id (mapped with "id")
      xmlSerializer.writeStartElement("id");
      xmlSerializer.writeLong(object.id);
      xmlSerializer.writeEndElement();

      // field valueMapStringInteger (mapped with "valueMapStringInteger")
      if (object.valueMapStringInteger!=null)  {
        // write wrapper tag
        xmlSerializer.writeStartElement("valueMapStringInteger");
        for (Map.Entry<String, Integer> item: object.valueMapStringInteger.entrySet()) {
          xmlSerializer.writeStartElement("map");
            if (item.getKey()!=null) {
              xmlSerializer.writeAttribute("key", StringEscapeUtils.escapeXml10(item.getKey()));
            }
            if (item.getValue()==null) {
              xmlSerializer.writeEmptyElement("value");
            } else {
              if (item.getValue()!=null)  {
                xmlSerializer.writeAttribute("value", PrimitiveUtils.writeInteger(item.getValue()));
              }
            }
          xmlSerializer.writeEndElement();
        }
        xmlSerializer.writeEndElement();
      }

      // field valueByteArray (mapped with "valueByteArray")
      if (object.valueByteArray!=null) {
        xmlSerializer.writeBinary(object.valueByteArray);
      }

      if (currentEventType == 0) {
        xmlSerializer.writeEndElement();
      }
    } catch(Exception e) {
      e.printStackTrace();
      throw (new KriptonRuntimeException(e));
    }
  }

  /**
   * create new object instance
   */
  @Override
  public Bean81T parseOnJackson(AbstractJacksonContext context, JacksonWrapperParser wrapper) {
    try {
      JsonParser jacksonParser = wrapper.jacksonParser;
      Bean81T instance = createInstance();
      String fieldName;
      if (jacksonParser.currentToken() == null) {
        jacksonParser.nextToken();
      }
      if (jacksonParser.currentToken() != JsonToken.START_OBJECT) {
        jacksonParser.skipChildren();
        return instance;
      }
      while (jacksonParser.nextToken() != JsonToken.END_OBJECT) {
        fieldName = jacksonParser.getCurrentName();
        jacksonParser.nextToken();

        // Parse fields:
        switch (fieldName) {
            case "valueInteger":
              // field valueInteger (mapped with "valueInteger")
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueInteger=jacksonParser.getIntValue();
              }
            break;
            case "id":
              // field id (mapped with "id")
              instance.id=jacksonParser.getLongValue();
            break;
            case "valueMapStringInteger":
              // field valueMapStringInteger (mapped with "valueMapStringInteger")
              if (jacksonParser.currentToken()==JsonToken.START_ARRAY) {
                HashMap<String, Integer> collection=new HashMap<>();
                String key=null;
                Integer value=null;
                while (jacksonParser.nextToken() != JsonToken.END_ARRAY) {
                  jacksonParser.nextValue();
                  key=jacksonParser.getText();
                  jacksonParser.nextValue();
                  if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                    value=jacksonParser.getIntValue();
                  }
                  collection.put(key, value);
                  key=null;
                  value=null;
                  jacksonParser.nextToken();
                }
                instance.valueMapStringInteger=collection;
              }
            break;
            case "valueByteArray":
              // field valueByteArray (mapped with "valueByteArray")
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueByteArray=jacksonParser.getBinaryValue();
              }
            break;
            default:
              jacksonParser.skipChildren();
            break;}
      }
      return instance;
    } catch (Exception e) {
      e.printStackTrace();
      throw new KriptonRuntimeException(e);
    }
  }

  /**
   * create new object instance
   */
  @Override
  public Bean81T parseOnJacksonAsString(AbstractJacksonContext context, JacksonWrapperParser wrapper) {
    try {
      JsonParser jacksonParser = wrapper.jacksonParser;
      Bean81T instance = createInstance();
      String fieldName;
      if (jacksonParser.getCurrentToken() == null) {
        jacksonParser.nextToken();
      }
      if (jacksonParser.getCurrentToken() != JsonToken.START_OBJECT) {
        jacksonParser.skipChildren();
        return instance;
      }
      while (jacksonParser.nextToken() != JsonToken.END_OBJECT) {
        fieldName = jacksonParser.getCurrentName();
        jacksonParser.nextToken();

        // Parse fields:
        switch (fieldName) {
            case "valueInteger":
              // field valueInteger (mapped with "valueInteger")
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueInteger=PrimitiveUtils.readInteger(jacksonParser.getText(), null);
              }
            break;
            case "id":
              // field id (mapped with "id")
              instance.id=PrimitiveUtils.readLong(jacksonParser.getText(), 0L);
            break;
            case "valueMapStringInteger":
              // field valueMapStringInteger (mapped with "valueMapStringInteger")
              if (jacksonParser.currentToken()==JsonToken.START_ARRAY) {
                HashMap<String, Integer> collection=new HashMap<>();
                String key=null;
                Integer value=null;
                JsonToken current;
                String tempValue=null;
                while (jacksonParser.nextToken() != JsonToken.END_ARRAY) {
                  current=jacksonParser.currentToken();
                  for (int i=0; i<2 ;i++) {
                    while (current != JsonToken.FIELD_NAME) {
                      current=jacksonParser.nextToken();
                    }
                    jacksonParser.nextValue();
                    switch(jacksonParser.getCurrentName()) {
                    case "key":
                      if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                        key=jacksonParser.getText();
                      }
                    break;
                    case "value":
                      tempValue=jacksonParser.getValueAsString();
                      if (jacksonParser.currentToken()==JsonToken.VALUE_STRING && "null".equals(tempValue)) {
                        value=null;
                      } else {
                        if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                          value=PrimitiveUtils.readInteger(jacksonParser.getText(), null);
                        }
                      }
                    break;
                    }
                  }
                  collection.put(key, value);
                  key=null;
                  value=null;
                  jacksonParser.nextToken();
                }
                instance.valueMapStringInteger=collection;
              }
            break;
            case "valueByteArray":
              // field valueByteArray (mapped with "valueByteArray")
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueByteArray=Base64Utils.decode(jacksonParser.getValueAsString());
              }
            break;
            default:
              jacksonParser.skipChildren();
            break;}
      }
      return instance;
    } catch (Exception e) {
      e.printStackTrace();
      throw new KriptonRuntimeException(e);
    }
  }

  /**
   * create new object instance
   */
  @Override
  public Bean81T parseOnXml(KriptonXmlContext context, XmlWrapperParser wrapper, int currentEventType) {
    try {
      XmlPullParser xmlParser = wrapper.xmlParser;
      Bean81T instance = createInstance();
      int eventType = currentEventType;
      boolean read=true;

      if (currentEventType == 0) {
        eventType = xmlParser.next();
      } else {
        eventType = xmlParser.getEventType();
      }
      String currentTag = xmlParser.getName().toString();
      String elementName = currentTag;

      // attributes 
      String attributeName = null;
      int attributesCount = xmlParser.getAttributeCount();;
      for (int attributeIndex = 0; attributeIndex < attributesCount; attributeIndex++) {
        attributeName = xmlParser.getAttributeName(attributeIndex);
        switch(attributeName) {
            case "valueInteger":
              // field valueInteger (mapped by "valueInteger")
              instance.valueInteger=PrimitiveUtils.readInteger(xmlParser.getAttributeValue(attributeIndex), null);
            break;
            default:
            break;
        }
      }

      //sub-elements
      while (xmlParser.hasNext() && elementName!=null) {
        if (read) {
          eventType = xmlParser.next();
        } else {
          eventType = xmlParser.getEventType();
        }
        read=true;
        switch(eventType) {
            case XmlPullParser.START_TAG:
              currentTag = xmlParser.getName().toString();
              switch(currentTag) {
                  case "id":
                    // property id (mapped on "id")
                    instance.id=PrimitiveUtils.readLong(xmlParser.getElementAsLong(), 0L);
                  break;
                  case "valueMapStringInteger":
                    // property valueMapStringInteger (mapped on "valueMapStringInteger")
                     {
                      HashMap<String, Integer> collection=new HashMap<>();
                      String key;
                      Integer value;
                      int attributeIndex;
                      while (xmlParser.nextTag() != XmlPullParser.END_TAG && xmlParser.getName().toString().equals("map")) {
                        attributeIndex=xmlParser.getAttributeIndex(null, "key");
                        key=StringEscapeUtils.unescapeXml(xmlParser.getAttributeValue(attributeIndex));
                        attributeIndex=xmlParser.getAttributeIndex(null, "value");
                        value=PrimitiveUtils.readInteger(xmlParser.getAttributeValue(attributeIndex), null);
                        collection.put(key, value);
                      }
                      instance.valueMapStringInteger=collection;
                    }
                  break;
                  default:
                  break;
                }
              break;
              case XmlPullParser.END_TAG:
                if (elementName.equals(xmlParser.getName())) {
                  currentTag = elementName;
                  elementName = null;
                }
              break;
              case XmlPullParser.CDSECT:
              case XmlPullParser.TEXT:
                if (elementName!=null && xmlParser.hasText()) {
                  // property valueByteArray
                  instance.valueByteArray=Base64Utils.decode(xmlParser.getText());
                }
              break;
              default:
              break;
          }
        }
        return instance;
      } catch(Exception e) {
        e.printStackTrace();
        throw (new KriptonRuntimeException(e));
      }
    }
  }

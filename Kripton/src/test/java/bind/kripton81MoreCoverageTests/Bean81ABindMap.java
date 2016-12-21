package bind.kripton81MoreCoverageTests;

import com.abubusoft.kripton.AbstractJacksonContext;
import com.abubusoft.kripton.AbstractMapper;
import com.abubusoft.kripton.KriptonXmlContext;
import com.abubusoft.kripton.annotation.BindMap;
import com.abubusoft.kripton.common.BigDecimalUtils;
import com.abubusoft.kripton.common.BigIntegerUtils;
import com.abubusoft.kripton.common.PrimitiveUtils;
import com.abubusoft.kripton.common.StringUtils;
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
import java.lang.Override;

/**
 * This class is the shared preference binder defined for Bean81A
 *
 * @see Bean81A
 */
@BindMap(Bean81A.class)
public class Bean81ABindMap extends AbstractMapper<Bean81A> {
  /**
   * create new object instance
   */
  @Override
  public Bean81A createInstance() {
    return new Bean81A();
  }

  /**
   * reset shared preferences
   */
  @Override
  public int serializeOnJackson(AbstractJacksonContext context, Bean81A object, JacksonWrapperSerializer wrapper) {
    try {
      JsonGenerator jacksonSerializer = wrapper.jacksonGenerator;
      jacksonSerializer.writeStartObject();
      int fieldCount=0;

      // Serialized Field:

      // field id (mapped with "id")
      fieldCount++;
      jacksonSerializer.writeNumberField("id", object.id);

      // field valueBidDecimal (mapped with "valueBidDecimal")
      if (object.valueBidDecimal!=null)  {
        fieldCount++;
        jacksonSerializer.writeStringField("valueBidDecimal", BigDecimalUtils.write(object.valueBidDecimal));
      }

      // field valueBidInteger (mapped with "valueBidInteger")
      if (object.valueBidInteger!=null)  {
        fieldCount++;
        jacksonSerializer.writeStringField("valueBidInteger", BigIntegerUtils.write(object.valueBidInteger));
      }

      // field valueEnum (mapped with "valueEnum")
      if (object.valueEnum!=null)  {
        fieldCount++;
        jacksonSerializer.writeStringField("valueEnum", object.valueEnum.toString());
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
  public int serializeOnJacksonAsString(AbstractJacksonContext context, Bean81A object, JacksonWrapperSerializer wrapper) {
    try {
      JsonGenerator jacksonSerializer = wrapper.jacksonGenerator;
      jacksonSerializer.writeStartObject();
      int fieldCount=0;

      // Serialized Field:

      // field id (mapped with "id")
      jacksonSerializer.writeStringField("id", PrimitiveUtils.writeLong(object.id));

      // field valueBidDecimal (mapped with "valueBidDecimal")
      if (object.valueBidDecimal!=null)  {
        fieldCount++;
        jacksonSerializer.writeStringField("valueBidDecimal", BigDecimalUtils.write(object.valueBidDecimal));
      }

      // field valueBidInteger (mapped with "valueBidInteger")
      if (object.valueBidInteger!=null)  {
        fieldCount++;
        jacksonSerializer.writeStringField("valueBidInteger", BigIntegerUtils.write(object.valueBidInteger));
      }

      // field valueEnum (mapped with "valueEnum")
      if (object.valueEnum!=null)  {
        fieldCount++;
        jacksonSerializer.writeStringField("valueEnum", object.valueEnum.toString());
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
  public void serializeOnXml(KriptonXmlContext context, Bean81A object, XmlWrapperSerializer wrapper, int currentEventType) {
    try {
      XmlSerializer xmlSerializer = wrapper.xmlSerializer;
      if (currentEventType == 0) {
        xmlSerializer.writeStartElement("bean81A");
      }

      // Persisted fields:

      // field valueBidDecimal (mapped with "valueBidDecimal")
      if (object.valueBidDecimal!=null)  {
        xmlSerializer.writeDecimalAttribute(null, null,"valueBidDecimal", object.valueBidDecimal);
      }

      // field valueBidInteger (mapped with "valueBidInteger")
      if (object.valueBidInteger!=null)  {
        xmlSerializer.writeIntegerAttribute(null, null,"valueBidInteger", object.valueBidInteger);
      }

      // field valueEnum (mapped with "valueEnum")
      if (object.valueEnum!=null)  {
        xmlSerializer.writeAttribute("valueEnum", StringEscapeUtils.escapeXml10(object.valueEnum.toString()));
      }

      // field id (mapped with "id")
      xmlSerializer.writeStartElement("id");
      xmlSerializer.writeLong(object.id);
      xmlSerializer.writeEndElement();

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
  public Bean81A parseOnJackson(AbstractJacksonContext context, JacksonWrapperParser wrapper) {
    try {
      JsonParser jacksonParser = wrapper.jacksonParser;
      Bean81A instance = createInstance();
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
            case "valueBidDecimal":
              // field valueBidDecimal (mapped with "valueBidDecimal")
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueBidDecimal=BigDecimalUtils.read(jacksonParser.getText());
              }
            break;
            case "valueBidInteger":
              // field valueBidInteger (mapped with "valueBidInteger")
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueBidInteger=BigIntegerUtils.read(jacksonParser.getText());
              }
            break;
            case "valueEnum":
              // field valueEnum (mapped with "valueEnum")
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                String tempEnum=jacksonParser.getText();
                instance.valueEnum=StringUtils.hasText(tempEnum)?Bean81Enum.valueOf(tempEnum):null;
              }
            break;
            case "id":
              // field id (mapped with "id")
              instance.id=jacksonParser.getLongValue();
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
  public Bean81A parseOnJacksonAsString(AbstractJacksonContext context, JacksonWrapperParser wrapper) {
    try {
      JsonParser jacksonParser = wrapper.jacksonParser;
      Bean81A instance = createInstance();
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
            case "valueBidDecimal":
              // field valueBidDecimal (mapped with "valueBidDecimal")
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueBidDecimal=BigDecimalUtils.read(jacksonParser.getText());
              }
            break;
            case "valueBidInteger":
              // field valueBidInteger (mapped with "valueBidInteger")
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueBidInteger=BigIntegerUtils.read(jacksonParser.getText());
              }
            break;
            case "valueEnum":
              // field valueEnum (mapped with "valueEnum")
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                String tempEnum=jacksonParser.getText();
                instance.valueEnum=StringUtils.hasText(tempEnum)?Bean81Enum.valueOf(tempEnum):null;
              }
            break;
            case "id":
              // field id (mapped with "id")
              instance.id=PrimitiveUtils.readLong(jacksonParser.getText(), 0L);
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
  public Bean81A parseOnXml(KriptonXmlContext context, XmlWrapperParser wrapper, int currentEventType) {
    try {
      XmlPullParser xmlParser = wrapper.xmlParser;
      Bean81A instance = createInstance();
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
            case "valueBidDecimal":
              // field valueBidDecimal (mapped by "valueBidDecimal")
              instance.valueBidDecimal=xmlParser.getAttributeAsDecimal(attributeIndex);
            break;
            case "valueBidInteger":
              // field valueBidInteger (mapped by "valueBidInteger")
              instance.valueBidInteger=xmlParser.getAttributeAsInteger(attributeIndex);
            break;
            case "valueEnum":
              // field valueEnum (mapped by "valueEnum")
              instance.valueEnum=Bean81Enum.valueOf(StringEscapeUtils.unescapeXml(xmlParser.getAttributeValue(attributeIndex)));
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
                // no property is binded to VALUE o CDATA break;
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

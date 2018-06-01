package com.guo.bos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

import org.apache.commons.lang.ArrayUtils;
import org.apache.poi.ss.formula.functions.T;
import org.codehaus.jackson.JsonEncoding;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;





public class JacksonUtils

{
    private static JsonFactory jsonFactory = new JsonFactory();
    private static ObjectMapper objectMapper = new ObjectMapper();
    public static JsonGenerator createGenerator(OutputStream os) throws ServiceAccessException
    {
        try
        {

            return jsonFactory.createGenerator(os);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static JsonGenerator createGenerator(Writer writer) throws ServiceAccessException

    {

        try

        {

            return jsonFactory.createGenerator(writer);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static JsonGenerator createGenerator1(OutputStream file) throws ServiceAccessException

    {

        try

        {

            return jsonFactory.createGenerator(file);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static JsonParser createParser(byte[] data) throws ServiceAccessException

    {

        try

        {

            return jsonFactory.createParser(data);

        }

        catch (JsonParseException e)

        {

            throw new ServiceAccessException(null, e);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static JsonParser createParser(File file) throws ServiceAccessException

    {

        try

        {

            return jsonFactory.createParser(file);

        }

        catch (JsonParseException e)

        {

            throw new ServiceAccessException(null, e);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static JsonParser createParser(InputStream is) throws ServiceAccessException

    {

        try

        {

            return jsonFactory.createParser(is);

        }

        catch (JsonParseException e)

        {

            throw new ServiceAccessException(null, e);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static JsonParser createParser(Reader reader) throws ServiceAccessException

    {

        try

        {

            return jsonFactory.createParser(reader);

        }

        catch (JsonParseException e)

        {

            throw new ServiceAccessException(null, e);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static JsonParser createParser(String content) throws ServiceAccessException

    {

        try

        {

            return jsonFactory.createParser(content);

        }

        catch (JsonParseException e)

        {

            throw new ServiceAccessException(null, e);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static JsonParser createParser(URL url) throws ServiceAccessException

    {

        try

        {

            return jsonFactory.createParser(url);

        }

        catch (JsonParseException e)

        {

            throw new ServiceAccessException(null, e);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static T readValue(byte[] src, Class clazz) throws ServiceAccessException

    {

        if (ArrayUtils.isEmpty(src))

        {

            return null;

        }

      

        return readValue(src, 0, src.length, clazz);

    }

  

   

    public static T readValue(byte[] src, int offset, int len,

            Class clazz) throws ServiceAccessException

    {

        try

        {

            return objectMapper.readValue(src, offset, len, clazz);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static T readValue(File file, Class clazz) throws ServiceAccessException

    {

        try

        {

            return objectMapper.readValue(file, clazz);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static T readValue(String json, Class clazz) throws ServiceAccessException

    {

        try

        {

            return objectMapper.readValue(json, clazz);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static T readValue(InputStream is, Class clazz) throws ServiceAccessException

    {

        try

        {

            return objectMapper.readValue(is, clazz);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static T readValue(Reader reader, Class clazz) throws ServiceAccessException

    {

        try

        {

            return objectMapper.readValue(reader, clazz);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static String writeValueAsString(Object value) throws ServiceAccessException{


        try

        {

            return objectMapper.writeValueAsString(value);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static byte[] writeValueAsBytes(Object value) throws ServiceAccessException

    {

        try

        {

            return objectMapper.writeValueAsBytes(value);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static void writeValue(File file, Object value) throws ServiceAccessException

    {

        try

        {

            objectMapper.writeValue(file, value);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static void writeValue(OutputStream is, Object value) throws ServiceAccessException

    {

        try

        {

            objectMapper.writeValue(is, value);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

   

    public static void writeValue(Writer writer, Object value) throws ServiceAccessException

    {

        try

        {

            objectMapper.writeValue(writer, value);

        }

        catch (IOException e)

        {

            throw new ServiceAccessException(null, e);

        }

    }

  

}
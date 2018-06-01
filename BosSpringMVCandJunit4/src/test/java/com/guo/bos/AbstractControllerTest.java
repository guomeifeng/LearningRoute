package com.guo.bos;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.util.Objects;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.guo.bos.service.configuration.WebInitializer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebInitializer.class})
public abstract class AbstractControllerTest{
    protected MockMvc mockMvc;
    protected abstract Object[] getController();
    @Before
    public void setup()

    {
        this.mockMvc = MockMvcBuilders.standaloneSetup(this.getController()).build();
    }
    private MockHttpServletRequestBuilder commonJsonMockBuilder(MockHttpServletRequestBuilder requestBuilder,
    	Object request, Object headers, Object params) throws Exception
    {
    // Body请求体，服务于"@RequestBody"
        if (Objects.nonNull(request) && !"".equals(request))
                   {

                            requestBuilder.content(JacksonUtils.writeValueAsString(request));

                   }

 

                   // Header请求体，服务于"@RequestHeader"

                   if (Objects.nonNull(headers) && !"".equals(headers))

                   {

                            JsonParser jsonParser = JacksonUtils.createParser(JacksonUtils.writeValueAsBytes(headers));

                            jsonParser.nextToken();

                            while (jsonParser.nextToken() != JsonToken.END_OBJECT)

                            {

                                     jsonParser.nextToken();

                                     requestBuilder.header(jsonParser.getCurrentName(), jsonParser.getText());

                            }

                   }

 

                   // Parameters请求体，服务于"@RequestParam"

                   if (Objects.nonNull(params) && !"".equals(params))

                   {

                            JsonParser jsonParser = JacksonUtils.createParser(JacksonUtils.writeValueAsBytes(params));

                            jsonParser.nextToken();

                            while (jsonParser.nextToken() != JsonToken.END_OBJECT)

                            {

                                     jsonParser.nextToken();

                                     requestBuilder.param(jsonParser.getCurrentName(), jsonParser.getText());

                            }

                   }

                   return requestBuilder;

         }

        

   

         protected MockHttpServletRequestBuilder getJsonMockBuilder(String url, Object request, Object headers,

                            Object params) throws Exception

         {

                   return commonJsonMockBuilder(get(url).contentType(MediaType.APPLICATION_JSON).characterEncoding("UTF-8"),

                                     request, headers, params);

         }

        

   

         protected ResultActions getJsonMock(String url, Object request, Object headers) throws Exception

         {

                   return this.jsonRequestMock(getJsonMockBuilder(url, request, headers, null));

         }

 

   

    protected ResultActions getJsonMock(String url, Object request, Object headers, Object params) throws Exception

    {

        return this.jsonRequestMock(getJsonMockBuilder(url, request, headers, params));

    }

   

    protected ResultActions getJsonRequestMock(String url, Object request) throws Exception

    {

             return this.jsonRequestMock(getJsonMockBuilder(url, request, null, null));

    }

   

   

    protected ResultActions getJsonHeaderMock(String url, Object headers) throws Exception

    {

             return this.jsonRequestMock(getJsonMockBuilder(url, null, headers, null));

    }

   

   

    protected ResultActions getJsonParamsMock(String url, Object params) throws Exception

    {

             return this.jsonRequestMock(getJsonMockBuilder(url, null, null, params));

    }

   

   

         protected MockHttpServletRequestBuilder postJsonMockBuilder(String url, Object request, Object headers,

                            Object params) throws Exception

         {

                   return commonJsonMockBuilder(post(url).contentType(MediaType.APPLICATION_JSON).characterEncoding("UTF-8"),

                                     request, headers, params);

         }

        

   

    protected ResultActions postJsonMock(String url, Object request, Object headers) throws Exception

    {

        return this.jsonRequestMock(postJsonMockBuilder(url, request, headers, null));

    }

   

   

    protected ResultActions postJsonMock(String url, Object request, Object headers, Object params) throws Exception

    {

        return this.jsonRequestMock(postJsonMockBuilder(url, request, headers, params));

    }

   

    protected ResultActions postJsonRequestMock(String url, Object request) throws Exception

    {

             return this.jsonRequestMock(postJsonMockBuilder(url, request, null, null));

    }

   

   

    protected ResultActions postJsonHeaderMock(String url, Object headers) throws Exception

    {

             return this.jsonRequestMock(postJsonMockBuilder(url, null, headers, null));

    }

   

   

    protected ResultActions postJsonParamsMock(String url, Object params) throws Exception

    {

             return this.jsonRequestMock(postJsonMockBuilder(url, null, null, params));

    }

   

   

    private ResultActions jsonRequestMock(MockHttpServletRequestBuilder requestBuilder) throws Exception

    {

        // 打印整个请求与响应细节

        return this.mockMvc.perform(requestBuilder).andDo(print());

    }

}
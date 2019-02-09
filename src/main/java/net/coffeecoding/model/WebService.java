package net.coffeecoding.model;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author erenerdogan
 */
public class WebService
{
    private String server;

    public WebService(String server) {
        this.server = server;
    }

    private HttpPost createPostRequest(String method, Map<String, String> paramPairs){
        // Creating HTTP Post
        HttpPost httpPost = new HttpPost(server + "/" + method);
        // Building post parameters
        List<NameValuePair> nameValuePair = new ArrayList<NameValuePair>(paramPairs.size());
        for (String key : paramPairs.keySet()){
            nameValuePair.add(new BasicNameValuePair(key, paramPairs.get(key)));
            System.out.println("Key : "+ key + " - Value : "+ paramPairs.get(key) );
        }

        // Url Encoding the POST parameters
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePair,"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            // writing error to Log
            e.printStackTrace();
        }
        return httpPost;
    }

    public String callServer(String method, Map<String, String> paramPairs) throws ClientProtocolException, IOException{

        // Creating HTTP client
        HttpClient httpClient = new DefaultHttpClient();

        HttpParams httpParameters = httpClient.getParams();
        HttpConnectionParams.setConnectionTimeout(httpParameters, 10 * 1000);
        HttpConnectionParams.setSoTimeout(httpParameters, 3 * 1000);
        HttpResponse httpResponse = httpClient.execute(createPostRequest(method, paramPairs));
        HttpEntity httpEntity = httpResponse.getEntity();
        String xml = EntityUtils.toString(httpEntity);

        return xml;
    }
}
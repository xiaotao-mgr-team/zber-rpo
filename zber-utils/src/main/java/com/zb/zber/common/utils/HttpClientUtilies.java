package com.zb.zber.common.utils;


/**
 * 
 * httpClient工具类
 * 
 * @version  [版本号, 2015年6月24日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class HttpClientUtilies {

//    private static final Logger logger = LoggerFactory.getLogger(HttpClientUtilies.class);
//
//    private static PoolingClientConnectionManager clientConnectionManager;
//    /**
//     * OK: Success!
//     */
//    public static final int OK = 200;
//    /**
//     * Not Modified: There was no new data to return.
//     */
//    public static final int NOT_MODIFIED = 304;
//    /**
//     * Bad Request: The request was invalid. An accompanying error message will
//     * explain why. This is the status code will be returned during rate
//     * limiting.
//     */
//    public static final int BAD_REQUEST = 400;
//    /**
//     * Not Authorized: Authentication credentials were missing or incorrect.
//     */
//    public static final int NOT_AUTHORIZED = 401;
//    /**
//     * Forbidden: The request is understood, but it has been refused. An
//     * accompanying error message will explain why.
//     */
//    public static final int FORBIDDEN = 403;
//    /**
//     * Not Found: The URI requested is invalid or the resource requested, such
//     * as a user, does not exists.
//     */
//    public static final int NOT_FOUND = 404;
//    /**
//     * Not Acceptable: Returned by the Search API when an invalid format is
//     * specified in the request.
//     */
//    public static final int NOT_ACCEPTABLE = 406;
//    /**
//     * Internal Server Error: Something is broken. Please post to the group so
//     * the Weibo team can investigate.
//     */
//    public static final int INTERNAL_SERVER_ERROR = 500;
//    /**
//     * Bad Gateway: Weibo is down or being upgraded.
//     */
//    public static final int BAD_GATEWAY = 502;
//    /**
//     * Service Unavailable: The Weibo servers are up, but overloaded with
//     * requests. Try again later. The search and trend methods use this to
//     * indicate when you are being rate limited.
//     */
//    public static final int SERVICE_UNAVAILABLE = 503;
//
//    public static final int TIME_OUT = 10000;
//
//    // 传输超时时间，默认30秒
//    private static final int SOCKETTIMEOUT = 30000;
//    // 连接超时时间，默认10秒
//    private static final int CONNECTTIMEOUT = 10000;
//
//    public static final String SOCKET_TIMEOUT = "http.socket.timeout";
//    public static final String COLLECTION_TIMEOUT = "http.connection.timeout";
//    public static final String COLLECTION_MANAGER_TIMEOUT = "http.connection-manager.timeout";
//
//
//    static {
//        SchemeRegistry schemeRegistry = new SchemeRegistry();
//        schemeRegistry.register(new Scheme("http", 80, PlainSocketFactory.getSocketFactory()));
//        schemeRegistry.register(new Scheme("https", 443, SSLSocketFactory.getSocketFactory()));
//
//        clientConnectionManager = new PoolingClientConnectionManager(schemeRegistry);
//        clientConnectionManager.setMaxTotal(200);
//        clientConnectionManager.setDefaultMaxPerRoute(200);
//
//    }
//
//
//    @SuppressWarnings("unused")
//	private static String getCause(int statusCode) {
//        String cause = null;
//        switch (statusCode) {
//            case NOT_MODIFIED:
//                break;
//            case BAD_REQUEST:
//                cause = "The request was invalid.  An accompanying error message will explain why. This is the status code will be returned during rate limiting.";
//                break;
//            case NOT_AUTHORIZED:
//                cause = "Authentication credentials were missing or incorrect.";
//                break;
//            case FORBIDDEN:
//                cause = "The request is understood, but it has been refused.  An accompanying error message will explain why.";
//                break;
//            case NOT_FOUND:
//                cause = "The URI requested is invalid or the resource requested, such as a user, does not exists.";
//                break;
//            case NOT_ACCEPTABLE:
//                cause = "Returned by the Search API when an invalid format is specified in the request.";
//                break;
//            case INTERNAL_SERVER_ERROR:
//                cause = "Something is broken.  Please post to the group so the liushijie can investigate.";
//                break;
//            case BAD_GATEWAY:
//                cause = "image server is down or being upgraded.";
//                break;
//            case SERVICE_UNAVAILABLE:
//                cause = "Service Unavailable: img servers are up, but overloaded with requests. Try again later. The search and trend methods use this to indicate when you are being rate limited.";
//                break;
//            default:
//                cause = "";
//        }
//
//        return statusCode + ":" + cause;
//    }
//
//    /**
//     * 普通get请求获取数据
//     *
//     * @param url
//     * @return
//     */
//    public static String doGet(String url) {
//        String result = null;
//        HttpGet get = new HttpGet(url);
//        HttpClient client = null;
//        HttpResponse response = null;
//        try {
//            client = getHttpClient();
//            response = client.execute(get);
//            HttpEntity resEntity = response.getEntity();
//            int statusCode = response.getStatusLine().getStatusCode();
//            if (statusCode != OK) {
//                logger.error("+++++==>statusCode:["+statusCode+"],url:"+url+" <==+++++");
//                get.abort();
//                return null;
//            }
//            if (resEntity != null) {
//                try {
//                    result = EntityUtils.toString(resEntity);
//                } catch (Exception e) {
//                    logger.error("+++++==> respBody:" + result + " <==+++++",e);
//                }
//                resEntity = null;
//            }
//        } catch (IOException e) {
//            logger.error("++++ doGet:" + url + " ++++++", e);
//        } catch (Exception e) {
//            logger.error("++++ doGet:" + url + " ++++++", e);
//        }finally {
//            get.releaseConnection();
//            response=null;
//            client=null;
//        }
//        return result;
//    }
//     /**
//      * 普通 post请求
//      * @author wubin
//      * @param url
//      * @param paramsMap
//      * @return
//      */
//    public static String doPost(String url, Map<String, String> paramsMap) {
//        return doPost(url,paramsMap,"utf-8");
//    }
//    /**
//     * 根据URL发送post请求获取数据
//     *
//     * @param url
//     * @param paramsMap
//     * @return
//     */
//    public static String doPost(String url, Map<String, String> paramsMap,String charSet) {
//        String result = null;
//        HttpPost post = new HttpPost(url);
//        try {
//            if (paramsMap != null && paramsMap.size() > 0) {
//                List<NameValuePair> params = new ArrayList<NameValuePair>();
//                for (Map.Entry<String, String> m : paramsMap.entrySet()) {
//                    params.add(new BasicNameValuePair(m.getKey(), m.getValue()));
//                }
//                UrlEncodedFormEntity reqEntity = new UrlEncodedFormEntity(params,
//                    charSet);
//                post.setEntity(reqEntity);
//            }
//            HttpResponse response = getHttpClient().execute(post);
//
//            HttpEntity resEntity = response.getEntity();
//            int statusCode = response.getStatusLine().getStatusCode();
//            if (statusCode != OK) {
//                logger.error("+++++==>statusCode:["+statusCode+"],url:"+url+" <==+++++");
//                post.abort();
//                return null;
//            }
//            if (resEntity != null) {
//                String respBody = EntityUtils.toString(resEntity);
//                try {
//                    result = respBody;
//                } catch (Exception e) {
//                    logger.error("+++++==> respBody:" + respBody + " <==+++++",
//                            e);
//                }
//            }
//        } catch (IOException e) {
//        	e.printStackTrace();
//            logger.error("+++++==> doPost:" + url + " <==+++++", e);
//        } catch (Exception e) {
//            logger.error("+++++==> doPost:" + url + " <==+++++", e);
//        } finally {
//            post.releaseConnection();
//        }
//        return result;
//    }
//    /**
//     * 访问服务
//     * @param url 地址
//     * @param xml
//     * @return
//     * @throws Exception
//     */
//    public static String doPostXml(String url, String xml)throws Exception{
//        return doPostXml(url,"UTF-8",xml);
//    }
//
//    public static String doPostXml(String url,String charSet, String xml) throws Exception {
//        String result = null;
//        HttpPost post = new HttpPost(url);
//        // 然后把Soap请求数据添加到PostMethod中
//        byte[] b = null;
//        InputStream is = null;
//        HttpResponse response = null;
//        HttpClient httpClient = null;
//        try {
//            charSet = charSet == null ? "UTF-8" : charSet;
//            b = xml.getBytes(charSet);
//            is = new ByteArrayInputStream(b, 0, b.length);
//            HttpEntity reqEntity = new InputStreamEntity(is, b.length, ContentType.create(ContentType.TEXT_XML.getMimeType(), Charset.forName(charSet)));
//            post.setEntity(reqEntity);
//            httpClient = getHttpClient();
//            response = httpClient.execute(post);
//            HttpEntity resEntity = response.getEntity();
//            int statusCode = response.getStatusLine().getStatusCode();
//            if (statusCode != OK) {
//                logger.error("+++++==>statusCode:[" + statusCode + "],url:"+url+" <==+++++");
//                post.abort();
//                return null;
//            }
//            if (resEntity != null) {
//                try {
//                    result = EntityUtils.toString(resEntity);
//                } catch (Exception e) {
//                    logger.error("+++++==> respBody:" + result + " <==+++++", e);
//                }
//            }
//        } catch (Exception e) {
//            logger.error("+++++==> doPostXml:" + url + " <==+++++", e);
//        } finally {
//            post.releaseConnection();
//            response = null;
//            httpClient = null;
//            if (is != null) {
//                is.close();
//            }
//        }
//        return result;
//    }
//
//    /**
//     * 根据URL发送post请求获取数据
//     * Rest
//     * @param url
//     * @return
//     */
//    public static String doPostJson(String url, String json) {
//        String result = null;
//        HttpPost post = new HttpPost(url);
//        try {
//            post.addHeader("content-type", "application/json");
//            if (StringUtils.isNotEmpty(json)) {
//                StringEntity myEntity = new StringEntity(json,"UTF-8");
//                post.setEntity(myEntity);
//            }
//            HttpResponse response = getHttpClient().execute(post);
//
//            HttpEntity resEntity = response.getEntity();
//            int statusCode = response.getStatusLine().getStatusCode();
//            if (statusCode != OK) {
//                logger.error("+++++==>statusCode:[" + statusCode + "],url:"+url+" <==+++++");
//                post.abort();
//                return null;
//            }
//            if (resEntity != null) {
//                String respBody = EntityUtils.toString(resEntity);
//                try {
//                    result = respBody;
//                } catch (Exception e) {
//                    logger.error("+++++==> respBody:" + respBody + " <==+++++",e);
//                }
//            }
//        } catch (IOException e) {
//            logger.error("+++++==> doPostJson:" + url + " <==+++++", e);
//        } catch (Exception e) {
//            logger.error("+++++==> doPostJson:" + url + " <==+++++", e);
//        } finally {
//            post.releaseConnection();
//        }
//        return result;
//    }
//
//
//    /**
//     * https get请求
//     */
//    public static String doGetHttps(String requestUrl)
//    {
//        return httpsRequest(requestUrl,"GET",null);
//
//    }
//
//
//    /**
//     * https post请求
//     * paramsStr 为需要通过post body方式传输的参数字符串，格式自己定义
//     */
//    public static String doPostHttps(String requestUrl, String  paramsStr)
//    {
//        return  httpsRequest(requestUrl,"POST",paramsStr);
//    }
//
//
//
//
//    /**
//     * https请求  （暂时使用的是http原生的方式，后面切换到httpcleint）
//     *
//     * @param requestUrl
//     * @param requestMethod
//     * @param outPutStr
//     * @return
//     */
//    private static String httpsRequest(String requestUrl, String requestMethod, String outPutStr)
//    {
//        logger.info("HttpClientUtilies===httpsRequest===requestUrl:{}==outPutStr:{}",requestUrl,outPutStr);
//        String returnStr = null;
//        StringBuffer buffer = new StringBuffer();
//        try
//        {
//            TrustManager[] tm = {new MyX509TrustManager()};
//            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
//            sslContext.init(null, tm, new SecureRandom());
//            javax.net.ssl.SSLSocketFactory ssf = sslContext.getSocketFactory();
//            URL url = new URL(requestUrl);
//            HttpsURLConnection httpsURLConn = (HttpsURLConnection)url.openConnection();
//            httpsURLConn.setSSLSocketFactory(ssf);
//            httpsURLConn.setDoOutput(true);
//            httpsURLConn.setDoInput(true);
//            httpsURLConn.setUseCaches(false);
//            httpsURLConn.setRequestMethod(requestMethod);
//            if ("GET".equalsIgnoreCase(requestMethod))
//                httpsURLConn.connect();
//            if (null != outPutStr)
//            {
//                OutputStream outputStream = httpsURLConn.getOutputStream();
//                outputStream.write(outPutStr.getBytes("UTF-8"));
//                outputStream.close();
//            }
//            InputStream inputStream = httpsURLConn.getInputStream();
//            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
//            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//            String str = null;
//            while ((str = bufferedReader.readLine()) != null)
//            {
//                buffer.append(str);
//            }
//            bufferedReader.close();
//            inputStreamReader.close();
//            inputStream.close();
//            inputStream = null;
//            httpsURLConn.disconnect();
//            returnStr = buffer.toString();
//        }
//        catch (ConnectException ce)
//        {
//            logger.error("https request:remote server connection timed out.",ce);
//        }
//        catch (Exception e)
//        {
//            logger.error("https request error:{}", e);
//        }
//        return returnStr;
//    }
//
//
//    /**
//     * 图片文件
//     */
//    public static final String FILE_TYPE_IMAGE = "1";
//    /**
//     * 视频文件
//     */
//    public static final String FILE_TYPE_VEDIO = "2";
//    /**
//     * 音频文件
//     */
//    public static final String FILE_TYPE_AUDIO = "3";
//    /**
//     * 安装文件
//     */
//    public static final String FILE_TYPE_SETUP = "4";
//    /**
//     * 压缩文件
//     */
//    public static final String FILE_TYPE_COMPRESS = "5";
//
////    /**
////     * 发送文件到文件服务器
////     * @param filetype 文件类型 1图片 2音频 3视频 4安装文件 5以上自定义
////     * @param data
////     * @param typelimit 文件类型 填写允许的文件类型后缀,多个则逗号隔开
////     * @param sizelimit 文件大小 单位byte,默认无限制
////     * @return
////     */
////    public static String uploadToFileStore(String url, byte[] data, String fileName, String filetype, String typelimit, String sizelimit) {
////        String result = null;
////        if (data==null || data.length<=0){
////            return result;
////        }
////        File tmpFile = null;
////        HttpPost post = new HttpPost(url);
////        try {
////            MultipartEntity reqEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE,null,Charset.forName("UTF-8"));
////            // 1图片 2音频 3视频 4安装文件 5以上自定义
////            if (SysUtil.isNotEmpty(filetype))
////                reqEntity.addPart("filetype", new StringBody(filetype));
////            // 填写允许的文件类型后缀,多个则逗号隔开
////            if (SysUtil.isNotEmpty(typelimit))
////                reqEntity.addPart("typelimit", new StringBody(typelimit));
////            // 单位byte,默认无限制
////            if (SysUtil.isNotEmpty(sizelimit))
////                reqEntity.addPart("sizelimit", new StringBody(sizelimit));
////            if(SysUtil.isEmpty(fileName)){
////                fileName = "tmp.jpeg";
////            }
////            tmpFile = getFileFromBytes(data,"/tmp/"+fileName);
////            if (tmpFile != null && tmpFile.length()>0)
////                reqEntity.addPart("file", new FileBody(tmpFile));
////
////            post.setEntity(reqEntity);
////
////            HttpResponse response = getHttpClient().execute(post);
////
////            HttpEntity resEntity = response.getEntity();
////            if (resEntity != null) {
////                String respBody = EntityUtils.toString(resEntity);
////                try {
////                    result = respBody;
////                } catch (Exception e) {
////                    logger.error("+++++==> respBody:" + respBody + " <==+++++",e);
////                }
////            }
////        } catch (IOException e) {
////            logger.error("+++++==> uploadToFileStore:" + url + " <==+++++", e);
////        } finally {
////            post.releaseConnection();
////            if (tmpFile != null){
////                tmpFile.delete();
////            }
////        }
////        return result;
////    }
//
//    /**
//     * 流转文件
//     * @param b
//     * @param outputFile
//     * @return
//     */
//    @SuppressWarnings("unused")
//    private static File getFileFromBytes(byte[] b, String outputFile) {
//        File ret = null;
//        if(null == b || StringUtils.isEmpty(outputFile))
//            return null;
//
//        BufferedOutputStream stream = null;
//        try {
//            ret = new File(outputFile);
//            FileOutputStream fstream = new FileOutputStream(ret);
//            stream = new BufferedOutputStream(fstream);
//            stream.write(b);
//        } catch (Exception e) {
//            logger.error("~~~", e);
//        } finally {
//            if (stream != null) {
//                try {
//                    stream.close();
//                } catch (IOException e) {
//                    logger.error("~~~~", e);
//                }
//            }
//        }
//        return ret;
//    }
//
//    private static HttpClient getHttpClient() {
//
//        HttpClient httpClient = new DefaultHttpClient(clientConnectionManager);
//        httpClient.getParams().setParameter(SOCKET_TIMEOUT,SOCKETTIMEOUT);
//        httpClient.getParams().setParameter(COLLECTION_TIMEOUT,CONNECTTIMEOUT);
//        httpClient.getParams().setParameter(COLLECTION_MANAGER_TIMEOUT,10000000l);
//        httpClient.getParams().setParameter(ClientPNames.COOKIE_POLICY, CookiePolicy.IGNORE_COOKIES);
//        return httpClient;
//    }
}
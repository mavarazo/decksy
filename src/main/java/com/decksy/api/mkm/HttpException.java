package com.decksy.api.mkm;

import java.util.HashMap;
import java.util.Map;

public class HttpException extends Exception {

  public HttpException(int code) {
    super(code + ": " + parse(code));
  }

  private static String parse(Integer code) {
    Map<Integer, String> httpErrors = new HashMap<Integer, String>();
    httpErrors.put(
        307,
        "Temporary Redirect, Particular requests can deliver thousands of entities (e.g. a large stock or requesting articles for a specified product, and many more). Generally all these request allow you to paginate the results - either returning a 206 or 204 HTTP status code. Nevertheless, all these requests can also be done without specifying a pagination. If done and the resulting entities would be more than 1,000 the request will respond with a 307, specifying the paginated request. However, you should switch of the behaviour to automatically redirect to the given request URI, because a new Authorization header needs to be compiled for the redirected resource.");
    httpErrors.put(
        400,
        "Bad Request,Whenever something goes wrong with your request, e.g. your POST data and/or structure is wrong, or you want to access an article in your stock by providing an invalid ArticleID, a 400 Bad Request HTTP status is returned, describing the error within the content.");
    httpErrors.put(
        401,
        "Unauthorized HTTP status, when authentication or authorization fails during your request, e.g. your Authorization (signature) is not correct.");
    httpErrors.put(
        403,
        "Forbidden HTTP status, when you try to access valid resources, but don't have access to it, i. e. you try to access /authenticate with a dedicated or widget app, or resources specifically written for widget apps with a dedicated app.");
    httpErrors.put(404, "Page not found");
    httpErrors.put(
        405,
        "Not Allowed HTTP status, every time you want to access a valid resource with a wrong HTTP method.");
    httpErrors.put(
        412,
        "Precondition Failed, When you want to perform an invalid state change on one of your orders, e.g. confirm reception on an order, that's still not flagged as sent, you get a 412 Precondition Failed HTTP status.");
    httpErrors.put(
        417,
        "Expectation Failed HTTP status code, when your request has an XML body without the corresponding header and/or the body not sent as text, but its byte representation. Please also don't send any Expect: header with your request.");
    httpErrors.put(
        429,
        "Too Many Requests, Our API has the following request limits which reset every midnight at 12am (0:00) CET/CEST: private 5.000, commercial 50.000, widget 50.000");

    return httpErrors.get(code);
  }
}

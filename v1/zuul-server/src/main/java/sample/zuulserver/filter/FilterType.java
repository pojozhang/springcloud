package sample.zuulserver.filter;

public interface FilterType {

    String PRE = "pre";
    String ROUTING = "routing";
    String POST = "post";
    String ERROR = "error";
}

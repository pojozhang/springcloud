package v1.zuulserver.filter;

public interface FilterType {

    String PRE = "pre";
    String ROUTING = "routing";
    String POST = "post";
    String ERROR = "error";
}

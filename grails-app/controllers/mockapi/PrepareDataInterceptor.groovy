package mockapi

import grails.converters.JSON


class PrepareDataInterceptor {

    PrepareDataInterceptor() {
        matchAll()
    }

    boolean before() {
        log.info("==[controller:$controllerName,action:$actionName,request.requestURI:$request.requestURI]==")
        def mockData = MockDataConfig.getMockDataByUri(request.requestURI)
        render(mockData as JSON)
        return false
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}

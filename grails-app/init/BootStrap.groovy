import test.CommonResource

class BootStrap {

    def init = { servletContext ->
        new CommonResource(name:"小").save(flush:true)
        new CommonResource(name:"大").save(flush:true)
    }
    def destroy = {
    }
}

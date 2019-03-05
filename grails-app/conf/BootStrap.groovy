class BootStrap {

    def quoteImportService

    def init = { servletContext ->
        quoteImportService.initialize()
    }
    def destroy = {
    }
}

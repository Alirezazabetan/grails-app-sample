class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }


        "/dante/say"(controller: "quote") {
            action = [GET: "random"]
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}

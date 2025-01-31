package test.org.springdoc.api.app7

import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.parameters.RequestBody
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

data class Greeting(val greeting: String)

@RestController
interface ExampleController {
    @GetMapping("/")
    fun greet(@RequestParam name: String?): Greeting

	@GetMapping("/test")
	fun test(@RequestParam @Parameter(required = true) name: String?): Greeting

}
@RestController
class HelloGroovy {
	@RequestMapping("/")
	String home(){
		System.out.println("hello groovy");
		"hello groovy\n"
	}
}

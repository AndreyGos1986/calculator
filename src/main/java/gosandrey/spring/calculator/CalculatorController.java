package gosandrey.spring.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping("/calculator")
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @RequestMapping("/plus")
    public String plus(@RequestParam(required = true, name = "num1") double num1,
                       @RequestParam(required = true, name = "num2") double num2) {
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

    @RequestMapping("/minus")
    public String minus(@RequestParam(required = true, name = "num1") double num1,
                        @RequestParam(required = true, name = "num2") double num2) {
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @RequestMapping("/multiply")
    public String multiply(@RequestParam(required = true, name = "num1") double num1,
                           @RequestParam(required = true, name = "num2") double num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @RequestMapping("/divide")
    public String divide(@RequestParam(required = true, name = "num1") double num1,
                         @RequestParam(required = true, name = "num2") double num2) {
              return num1 + " / " + num2 + " = " + calculatorService.devide(num1, num2);
    }

}

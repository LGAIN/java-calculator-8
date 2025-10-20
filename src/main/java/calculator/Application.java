package calculator;

public class Application {
    public static void main(String[] args) {

        View view = new View();

        view.printStart();
        String input = view.inputString();

        Delimit delimit = new Delimit(input);
        String inputNumber = delimit.getInputNumber(input);

        Splitter splitter = new Splitter();
        String[] numbers = splitter.splitString(inputNumber, delimit.delimiter());

        Calculator calculator = new Calculator();
        view.printResult(calculator.calculate(numbers));
    }
}

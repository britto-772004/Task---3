
public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

function add(a,b){
	return a+b;
}
function sub(a,b){
	return a-b;
}
add(3,3);
sub(4,6);


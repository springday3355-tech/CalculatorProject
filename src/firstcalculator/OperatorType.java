package firstcalculator;

public enum OperatorType {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;
    OperatorType(char symbol){
        this.symbol = symbol;
    }
    public char getSymbol(){
        return symbol;
    }
    public static OperatorType fromSymbol(char symbol){
        for (OperatorType type : OperatorType.values()){
            if (type.getSymbol() == symbol){
                return type;
            }
        }
        throw new IllegalArgumentException("해당하는 연산자가 없습니다: " + symbol);

    }
}
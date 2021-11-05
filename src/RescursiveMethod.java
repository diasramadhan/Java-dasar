public class RescursiveMethod {
    public static void main(String[] args) {
        RescursiveMethod rescursiveMethod = new RescursiveMethod();
        Integer faktorial = rescursiveMethod.faktorial(4);
        System.out.println(faktorial);

        Integer sum = rescursiveMethod.sum(5);
        System.out.println(sum);

        Integer integer = rescursiveMethod.faktorialLoop(4);
        System.out.println(integer);

        rescursiveMethod.loop(4);
    }

    Integer faktorial(Integer value){
        if(value == 1){
            return value;
        }else{
            return value*faktorial(value-1);
        }
    }

    Integer sum(Integer value){
        if(value == 0){
            return value;
        }else {
            return value + sum(value-1);
        }
    }

    Integer faktorialLoop(Integer value){
        var result = 1;

        for (var i = 1; i <= value; i++ ){
            result *= i;
        }
        return result;
    }

    void loop(Integer value){
        if (value == 0){
            System.out.println("Selesai");
        }else {
            System.out.println("Loop ke-" + value);
            loop(value-1);
        }
    }


}

public class shatl {
    public static void main(String[] args) {
        int shatlsName = 0;
        int index = 0;
        while (true) {
            shatlsName++;
            if (String.valueOf(shatlsName).contains("4") || String.valueOf(shatlsName).contains("9")){
                continue;
            }
            index++;
            System.out.println("Шатл номер - " + shatlsName + " | index " + index);
            if (index == 100){
                break;
            }
        }
    }
}

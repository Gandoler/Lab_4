import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) throws IOException {
        OperationLogger logger = new OperationLogger();
        ArrayList<Cocktail_with_unique_items> arrayList = new ArrayList<>();
        HashMap<Integer, Cocktail_with_unique_items> hashMap = new HashMap<>();
        //////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////
        long start_total = System.nanoTime();;
        int amount = 10;
        logger.setDataType("ArrayList");
        for(int i =0;i<amount;i++){
            Instant start = Instant.now();
            arrayList.add(new Cocktail_with_unique_items());
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("add",Integer.toString(i),tmp_time);

        }
        long end_total = System.nanoTime();;
        long total_time = end_total-start_total;
        logger.totalTime_totalCount(amount,total_time,"add");
        //////////////////////////////////////////////////////////////////////////////////////////
        start_total = System.nanoTime();;
        for(int i =0;i<amount/10;i++){
            Instant start = Instant.now();
            arrayList.remove(i);
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("delete",Integer.toString(i),tmp_time);

        }

        end_total = System.nanoTime();
        total_time = end_total-start_total;
        logger.totalTime_totalCount(amount,total_time,"delete");
        //////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////
        start_total = System.nanoTime();
        amount = 100;
        logger.setDataType("ArrayList");
        for(int i =0;i<amount;i++){
            Instant start = Instant.now();
            arrayList.add(new Cocktail_with_unique_items());
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("add",Integer.toString(i),tmp_time);

        }
        end_total = System.nanoTime();
        total_time = end_total-start_total;
        logger.totalTime_totalCount(amount,total_time,"add");

        //////////////////////////////////////////////////////////////////////////////////////////

        start_total = System.nanoTime();
        for(int i =0;i<amount/10;i++){
            Instant start = Instant.now();
            arrayList.remove(i);
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("delete",Integer.toString(i),tmp_time);

        }

        end_total = System.nanoTime();
        total_time = end_total-start_total;
        logger.totalTime_totalCount(amount,total_time,"delete");
        //////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////
        start_total =System.nanoTime();
        amount = 1000;
        logger.setDataType("ArrayList");
        for(int i =0;i<amount;i++){
            Instant start = Instant.now();
            arrayList.add(new Cocktail_with_unique_items());
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("add",Integer.toString(i),tmp_time);

        }

        end_total = System.nanoTime();
        total_time = end_total-start_total;
        logger.totalTime_totalCount(amount,total_time,"add");


        start_total = System.nanoTime();
        for(int i =0;i<amount/10;i++){
            Instant start = Instant.now();
            arrayList.remove(i);
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("delete",Integer.toString(i),tmp_time);

        }

        end_total = System.nanoTime();
        total_time = end_total - start_total;
        logger.totalTime_totalCount(amount,total_time,"delete");
        //////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////
        start_total = System.nanoTime();
        amount = 10000;
        logger.setDataType("ArrayList");
        for(int i =0;i<amount;i++){
            Instant start = Instant.now();
            arrayList.add(new Cocktail_with_unique_items());
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("add",Integer.toString(i),tmp_time);

        }

        end_total = System.nanoTime();
        total_time = end_total - start_total;
        logger.totalTime_totalCount(amount,total_time,"add");
        //////////////////////////////////////////////////////////////////////////////////////////

        start_total = System.nanoTime();
        for(int i =0;i<amount/10;i++){
            Instant start = Instant.now();
            arrayList.remove(i);
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("delete",Integer.toString(i),tmp_time);

        }

        end_total = System.nanoTime();
        total_time = end_total- start_total;
        logger.totalTime_totalCount(amount,total_time,"delete");
        //////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////
        start_total = System.nanoTime();
        amount = 100000;
        logger.setDataType("ArrayList");
        for(int i =0;i<amount;i++){
            Instant start = Instant.now();
            arrayList.add(new Cocktail_with_unique_items());
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("add",Integer.toString(i),tmp_time);

        }

        end_total = System.nanoTime();
        total_time = end_total - start_total;
        logger.totalTime_totalCount(amount,total_time,"add");
        //////////////////////////////////////////////////////////////////////////////////////////
        start_total = System.nanoTime();
        for(int i =0;i<amount/10;i++){
            Instant start = Instant.now();
            arrayList.remove(i);
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("delete",Integer.toString(i),tmp_time);

        }

        end_total = System.nanoTime();
        total_time = end_total- start_total;
        logger.totalTime_totalCount(amount,total_time,"delete");
        //////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////
        start_total = System.nanoTime();
        amount = 10;
        logger.setDataType("HashMap");
        for(int i =0;i<amount;i++){
            Instant start = Instant.now();
            hashMap.put(i ,new Cocktail_with_unique_items());
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("add",Integer.toString(i),tmp_time);

        }

        end_total = System.nanoTime();
        total_time = end_total - start_total;
        logger.totalTime_totalCount(amount,total_time,"add");
        //////////////////////////////////////////////////////////////////////////////////////////
        start_total = System.nanoTime();
        for(int i =amount-amount/10;i<amount;i++){
            Instant start = Instant.now();
            hashMap.remove(i);
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("delete",Integer.toString(i),tmp_time);

        }

        end_total = System.nanoTime();
        total_time = end_total - start_total;
        logger.totalTime_totalCount(amount,total_time,"delete");
        //////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////
        start_total = System.nanoTime();
        amount = 110;
        logger.setDataType("HashMap");
        for(int i =10;i<amount;i++){
            Instant start = Instant.now();
            hashMap.put(i ,new Cocktail_with_unique_items());
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("add",Integer.toString(i),tmp_time);

        }

        amount-=10;
        end_total = System.nanoTime();
        total_time = end_total - start_total;
        logger.totalTime_totalCount(amount,total_time,"add");
        //////////////////////////////////////////////////////////////////////////////////////////
        start_total = System.nanoTime();
        for(int i =amount-amount/10;i<amount;i++){
            Instant start = Instant.now();
            hashMap.remove(i);
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("delete",Integer.toString(i),tmp_time);

        }

        end_total = System.nanoTime();
        total_time = end_total - start_total;
        logger.totalTime_totalCount(amount,total_time,"delete");


        //////////////////////////////////////////////////////////////////////////////////////////
        start_total = System.nanoTime();
        amount = 1110;
        logger.setDataType("HashMap");
        for(int i =110;i<amount;i++){
            Instant start = Instant.now();
            hashMap.put(i ,new Cocktail_with_unique_items());
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("add",Integer.toString(i),tmp_time);

        }

        amount-=110;
        end_total = System.nanoTime();
        total_time = end_total - start_total;
        logger.totalTime_totalCount(amount,total_time,"add");
        //////////////////////////////////////////////////////////////////////////////////////////
        start_total = System.nanoTime();
        for(int i =amount-amount/10;i<amount;i++){
            Instant start = Instant.now();
            hashMap.remove(i);
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("delete",Integer.toString(i),tmp_time);

        }

        end_total = System.nanoTime();
        total_time = end_total - start_total;
        logger.totalTime_totalCount(amount,total_time,"delete");

        //////////////////////////////////////////////////////////////////////////////////////////
        start_total = System.nanoTime();
        amount = 11110;
        logger.setDataType("HashMap");
        for(int i =1110;i<amount;i++){
            Instant start = Instant.now();
            hashMap.put(i ,new Cocktail_with_unique_items());
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("add",Integer.toString(i),tmp_time);

        }

        amount-=1110;
        end_total = System.nanoTime();
        total_time = end_total - start_total;
        logger.totalTime_totalCount(amount,total_time,"add");
        //////////////////////////////////////////////////////////////////////////////////////////
        start_total = System.nanoTime();
        for(int i =amount-amount/10;i<amount;i++){
            Instant start = Instant.now();
            hashMap.remove(i);
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("delete",Integer.toString(i),tmp_time);

        }

        end_total = System.nanoTime();
        total_time = end_total - start_total;
        logger.totalTime_totalCount(amount,total_time,"delete");

        //////////////////////////////////////////////////////////////////////////////////////////
        start_total = System.nanoTime();
        amount = 111110;
        logger.setDataType("HashMap");
        for(int i =11110;i<amount;i++){
            Instant start = Instant.now();
            hashMap.put(i ,new Cocktail_with_unique_items());
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("add",Integer.toString(i),tmp_time);

        }

        amount-=11110;
        end_total = System.nanoTime();
        total_time = end_total - start_total;
        logger.totalTime_totalCount(amount,total_time,"add");

        //////////////////////////////////////////////////////////////////////////////////////////
        start_total = System.nanoTime();
        for(int i =amount-amount/10;i<amount;i++){
            Instant start = Instant.now();
            hashMap.remove(i);
            Instant end = Instant.now();
            long tmp_time = end.toEpochMilli()-start.toEpochMilli();
            logger.logOperation("delete",Integer.toString(i),tmp_time);

        }

        end_total = System.nanoTime();
        total_time = end_total - start_total;
        logger.totalTime_totalCount(amount,total_time,"delete");

        //////////////////////////////////////////////////////////////////////////////////////////
        int initialCapacity = 10;
        ArrayList<Integer> arrayListWithInitialCapacity = new ArrayList<>(initialCapacity);
        ArrayList<Integer> arrayListWithoutInitialCapacity = new ArrayList<>();
        long startTime;
        long endTime;
        logger.add_personal_log("Проверка массива с начальной длинной");
        startTime = System.nanoTime();
        for (int i = 0; i < initialCapacity * 3 / 2 + 1; i++) {
            arrayListWithInitialCapacity.add(i);
        }
        endTime = System.nanoTime();
        long timeWithInitialCapacity = endTime - startTime;

        logger.totalTime_totalCount(initialCapacity * 3 / 2 + 1,timeWithInitialCapacity,"add");


        logger.add_personal_log("Проверка массива без начальной длинной");
        startTime = System.nanoTime();
        for (int i = 0; i < initialCapacity * 3 / 2 + 1; i++) {
            arrayListWithoutInitialCapacity.add(i);
        }
        endTime = System.nanoTime();
        long timeWithoutInitialCapacity = endTime - startTime;
        logger.totalTime_totalCount(initialCapacity * 3 / 2 + 1,timeWithoutInitialCapacity,"add");








        try {
            logger.writeLogToFile("logs.log");
        }catch (Exception e){
            System.out.println(e);
        }

        try {
            logger.writeImportantLogToFile("important_logs.log");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
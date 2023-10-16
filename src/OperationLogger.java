import java.lang.reflect.Type;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;


public class OperationLogger {
    private List<String> log;
    private List<String> important_log;


    public OperationLogger() {
        log = new ArrayList<>();
        log.add("start program time" + Instant.now().toString());
        important_log = new ArrayList<>();
        important_log.add("start program time" + Instant.now().toString());
    }

    public void logOperation(String operationType, String key, long executionTime) {
        log.add(String.format("%s - ключ: %s, время выполнения: %d Наносекунд", operationType, key, executionTime));

    }
    public void totalTime_totalCount(int amount, long total_time, String operation){
        long medivealTime = total_time/amount;
        log.add(String.format(operation+'\t'+"%d-Количество добавленных элементов",amount));
        log.add(String.format(operation+'\t'+"%d-Наносекунд",total_time));
        log.add(String.format(operation+'\t'+"%d-Наносекунд-среднее время выполнения",medivealTime));
        log.add("\n");
        important_log.add(String.format(operation+'\t'+"%d-Количество добавленных элементов",amount));
        important_log.add(String.format(operation+'\t'+"%d-Наносекунд",total_time));
        important_log.add(String.format(operation+'\t'+"%d-Наносекунд-среднее время выполнения",medivealTime));
        important_log.add("\n");
    }
    public void setDataType(String str){
        log.add(str);
        important_log.add(str);
    }
    public void add_personal_log(String str){
        important_log.add(str);
    }

    public void writeLogToFile(String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            for (String str : log) {
                writer.write(str + "\n");
            }
        }
    }

    public void writeImportantLogToFile(String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            for (String str : important_log) {
                writer.write(str + "\n");
            }
        }
    }
}
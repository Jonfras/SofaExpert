package net.htlgkr.krejo.sofaexpert;

import android.net.wifi.aware.IdentityChangedListener;
import android.widget.ImageView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Json {
    private ImageView img;

    private static ObjectMapper objectMapper = getDefaultObjectMapper();

    private static ObjectMapper getDefaultObjectMapper() {
        ObjectMapper defaultObjectMapper = new ObjectMapper();

        defaultObjectMapper.registerModule(new JavaTimeModule());
        defaultObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        
        return defaultObjectMapper;
    }

    public static JsonNode parse(InputStream src) throws IOException {
        Scanner scanner = new Scanner(src);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()){
            stringBuilder.append(scanner.nextLine());
        }

        return objectMapper.readTree(stringBuilder.toString());
    }

    public static <A> A fromJson(JsonNode node, Class<A> clazz) throws JsonProcessingException {
        objectMapper.
        return objectMapper.treeToValue(node, clazz);
    }

}

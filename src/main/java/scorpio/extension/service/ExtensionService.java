package scorpio.extension.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author xuanyin
 * @since 2015-10-28
 */
public final class ExtensionService<S> {
    private static final String FILE_PATH = "META-INF/extension.properties";
    private static final ConcurrentMap<String, String> FILE_DETAIL = new ConcurrentHashMap<String, String>();
    private Class<S> extension;

    /**
     *
     */
    public ExtensionService(Class<S> extension) {
        this.extension = extension;

        initProperties();
    }

    public static void getInstance(String name) {

    }

    /**
     *
     */
    private void initProperties() {
        try {
            Enumeration<URL> urls;
            ClassLoader classLoader = thisClassLoader();
            if (null != classLoader) {
                urls = classLoader.getResources(FILE_PATH);
            } else {
                urls = ClassLoader.getSystemResources(FILE_PATH);
            }
            if (null != urls) {
                URL url = urls.nextElement();
                if (null != url) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
                    String line;
                    while (null != (line = reader.readLine())) {
                        if (line.contains("=")) {
                            String[] values = "=".split(line);
                            if (2 == values.length) {
                                FILE_DETAIL.putIfAbsent(values[0], values[1]);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(FILE_DETAIL.toString());
    }

    /**
     * @return ClassLoader
     */
    private ClassLoader thisClassLoader() {
        return this.getClass().getClassLoader();
    }
}

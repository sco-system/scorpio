package scorpio.extension.test;

import org.junit.Assert;
import org.junit.Test;
import scorpio.extension.service.ExtensionService;

/**
 * @author xuanyin
 * @since 2015-10-28
 */
public class ExtensionServiceTest {
    @Test
    public void testLoadFile() throws Exception {
        boolean result = false;

        ExtensionService extensionService = new ExtensionService();
        extensionService.loadFile();

        result = true;

        Assert.assertTrue(result);
    }
}

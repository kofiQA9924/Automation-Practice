package com.AutomationPractice.Utilities;

import com.AutomationPractice.Base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by RUTHERFORD on 5/20/2021.
 */
public class Capture extends BaseClass {
    public Capture(WebDriver driver) {
    }

    public void screenshot() throws IOException {
        File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile,new File(System.getProperty("user.dir")+"/Screenshots/"+System.currentTimeMillis()+"image.png"));
    }
}

package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalendarPage_Emma {

    public WebElement calendarLink = Driver.getDriver().findElement(By.linkText("Calendar"));

   public WebElement timeBox = Driver.getDriver().findElement(By.xpath("//td[@class='fc-widget-content']//td[2]"));

   public  WebElement summaryField = Driver.getDriver().findElement(By.xpath("//input[@class='o_input']"));

  public  WebElement createButton = Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-sm btn-primary']"));

    public WebElement meetingLink = Driver.getDriver().findElement(By.xpath("//a[@class=\"fc-day-grid-event fc-h-event fc-event fc-start fc-end fc-draggable fc-resizable o_calendar_color_6\"]"));

   public  WebElement meetingDetailsWindow = Driver.getDriver().findElement(By.xpath("//div[@class='modal-body o_act_window']"));





}

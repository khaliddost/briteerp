package com.briteerp.step_definitions;

import com.briteerp.pages.CalendarPage_Emma;
import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US04_EmmaStepDefs {

    LoginPage loginPage = new LoginPage();

    CalendarPage_Emma calendarPageEmma = new CalendarPage_Emma();

    @Given("user is logged in and on the calendar page of the application")
    public void user_is_logged_in_and_on_the_calendar_page_of_the_application() {
        // Write code here that turns the phrase above into concrete actions

        Driver.getDriver().get("https://qa.briteerp.com/web/login");

        loginPage.login("posmanager36@info.com", "posmanager");

        calendarPageEmma.calendarLink.click();

    }


    @When("user clicks on timebox for {string} on {string}")
    public void userClicksOnTimeboxForOn(String arg0, String arg1) {

        calendarPageEmma.timeBox.click();

    }

    @When("user enters information in {string} section of pop-up window")
    public void user_enters_information_in_section_of_pop_up_window(String string) {
      calendarPageEmma.summaryField.sendKeys("meeting");
    }


    @When("user clicks {string}")
    public void user_clicks(String string) {
       calendarPageEmma.createButton.click();
    }


    @Then("user should see event created in that time box")
    public void user_should_see_event_created_in_that_time_box() {
        Assert.assertTrue(calendarPageEmma.meetingLink.isDisplayed());

    }


    @When("user clicks on event in timebox")
    public void user_clicks_on_event_in_timebox() {
      calendarPageEmma.meetingLink.click();
    }


    @Then("user should see pop-up window with event details")
    public void user_should_see_pop_up_window_with_event_details() {
        Assert.assertTrue(calendarPageEmma.meetingDetailsWindow.isDisplayed());

    }
}

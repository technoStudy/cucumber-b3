package StepDefinitions;

import io.cucumber.docstring.DocString;
import io.cucumber.java.en.Given;

public class DocStringSteps {
    @Given("a large amount of text")
    public void aLargeAmountOfText(DocString largeText) {
        String content = largeText.getContent();
        System.out.println(content);
    }
}

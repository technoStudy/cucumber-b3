package StepDefinitions;

import io.cucumber.docstring.DocString;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class DocStringSteps {
    @Given("a large amount of text")
    public void aLargeAmountOfText(DocString largeText) {
        String content = largeText.getContent();
        System.out.println(content);
    }

    @And("a large text with parameter {int}")
    public void aLargeTextWithParameter(int arg0, DocString text) {
        System.out.println(arg0);
        System.out.println(text.getContent());
    }
}

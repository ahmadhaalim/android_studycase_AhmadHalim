package demo.steps_definition;

import demo.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MokaStepDefinitions {

  StartPage startPage = new StartPage();
  LoginPage loginPage = new LoginPage();
  FavouritePage favouritePage = new FavouritePage();
  ShoppingCart shoppingCart = new ShoppingCart();
  CheckOutPopUp checkOutPopUp = new CheckOutPopUp();
  ReceiptPage receiptPage = new ReceiptPage();


  @Given("User is on moka start page")
  public void userIsOnMokaStartPage() {
    boolean actual = startPage.isOnPage();
    Assert.assertTrue(actual);
  }

  @When("User click sign in button on moka start page")
  public void userClickSignInButtonOnMokaStartPage() {
    startPage.clikSignInButton();
  }

  @And("User input the email/phonenumber {string}")
  public void userInputTheEmail(String emailOrPhone) {
    loginPage.inputEmailorPhone(emailOrPhone);
  }

  @And("User input the password {string}")
  public void userInputThePassword(String password) {
    loginPage.inputPassword(password);
  }

  @And("User click the sign in button")
  public void userClickTheSignInButton() {
    loginPage.clickSignIn();
  }

  @Then("User in the favourite page")
  public void userInTheFavouritePage() {
    boolean result = favouritePage.isOnFavourite();
    Assert.assertTrue(result);
  }

  @When("User click the {string} menu from the favourite page with {int} quantity")
  public void userClickTheMenuFromTheFavouritePage(String item, int quantity) {
    favouritePage.selectItem(item, quantity);
  }

  @And("User see {string} on the shopping cart with {int} quantity")
  public void userSeeOnTheShoppingCart(String cart, int quantity) {
    boolean result = shoppingCart.itemOnShoppingCart(cart, quantity);
    Assert.assertTrue(result);
  }

  @And("User click the charge button")
  public void userClickTheChargeButton() {
    shoppingCart.clickCheckOutButton();
  }

  @And("User input the amount of money {string} from checkout pop up")
  public void userInputTheAmountOfMoney(String amount) {
    checkOutPopUp.clickCashManual(amount);
  }

  @And("User click the charge button from checkout pop up")
  public void userClickTheChargeButtonFromCheckoutPopUp() {
    checkOutPopUp.clickCheckOutPopUp();
  }

  @Then("User see the receipt page with {string}")
  public void userSeeTheReceiptPage(String change) {
    String result = receiptPage.seeChange();
    Assert.assertEquals(change, result);
  }

  @Then("User see {string}")
  public void userSee(String error) {
    String result = loginPage.failedAuthentication();
    Assert.assertEquals(error,result);
  }

  @Then("User see an error saying {string}")
  public void userSeeAnErrorSaying(String input) {
    String result = loginPage.invalidEmailInput();
    Assert.assertEquals(input,result);
  }
}

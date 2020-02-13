package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class TesteSteps {

	String telefone;
	String email;
	String senha;
	String nome;
	WebDriver driver;

	@Dado("^que estou na página de dados aleatórios$")
	public void queEstouNaPáginaDeDadosAleatórios() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\drivers automation//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.4devs.com.br/gerador_de_pessoas");
	}

	@Quando("^efetuo a geração$")
	public void efetuoAGeração() throws Throwable {
		driver.findElement(By.id("bt_gerar_pessoa")).click();
	}

	@Então("^posso ver as informações obtidas$")
	public void possoVerAsInformaçõesObtidas() throws Throwable {
		telefone = driver.findElement(By.id("celular")).getText();
		nome = driver.findElement(By.id("nome")).getText();
		senha = driver.findElement(By.id("senha")).getText();
		email = driver.findElement(By.id("email")).getText();
	}

	@Dado("^que estou na página de cadastro do Gmail$")
	public void queEstouNaPáginaDeCadastroDoGmail() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		String texto = driver.findElement(By.id("headingText")).getText();
		Assert.assertEquals("Criar sua Conta do Google", texto);
	}

	@Quando("^efetuo cadastro com as informações geradas$")
	public void efetuoCadastroComAsInformaçõesGeradas() throws Throwable {
		driver.findElement(By.id("firstName")).sendKeys(nome.split(" ")[0]);
		driver.findElement(By.id("lastName")).sendKeys(nome.split(" ")[1]);
		driver.findElement(By.id("username")).sendKeys(email.split("@")[0]);
		driver.findElement(By.name("Passwd")).sendKeys(senha);
		driver.findElement(By.name("ConfirmPasswd")).sendKeys(senha);
		driver.findElement(By.id("accountDetailsNext")).click();
	}

	@Então("^acesso página para cadastrar telefone$")
	public void acessoPáginaParaCadastrarTelefone() throws Throwable {
		String texto = driver.findElement(By.id("headingText")).getText();
		Assert.assertEquals("Verifique seu número de telefone", texto);
	}

	@Dado("^que forneço telefone inválido$")
	public void queForneçoTelefoneInválido() throws Throwable {
		driver.findElement(By.id("phoneNumberId")).sendKeys("+244 netbeans");
		driver.findElement(By.id("gradsIdvPhoneNext")).click();
	}

	@Então("^sistema não permite validação do telefone$")
	public void sistemaNãoPermiteValidaçãoDoTelefone() throws Throwable {
		String texto = driver.findElement(By.xpath("//div[@class='dEOOab RxsGPe']")).getText();
		Assert.assertEquals("Este formato de número de telefone não é válido. Verifique o país e o número.", texto);
	}

	@After
	public void FecharBrowser() {
		driver.quit();
	}
}

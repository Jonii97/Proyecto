package com.crowdar.examples.steps.PhpTravels;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.PhpTravels.PhpHomePage;
import com.crowdar.examples.pages.PhpTravels.PhpTravelsHotel;
import com.crowdar.examples.pages.PhpTravels.PhpTravelsHotelsDetalle;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PhpSteps extends PageSteps {

    @Given("El usuario esta en la home Page")
    public void elUsuarioEstaEnLaHomePage() {
        Injector._page(PhpHomePage.class).go();
    }

    @When("Selecciono un Tour")
    public void seleccionoUnTour() {
        Injector._page(PhpTravelsHotel.class).selectTour();
    }

    @And("Selecciono un infante")
    public void seleccionoUnInfante() {
        Injector._page(PhpTravelsHotel.class).infantPicker();
    }

    @And("Ingresa una fecha")
    public void ingresaUnaFechaDateDate() {
        Injector._page(PhpTravelsHotel.class).datePicker();
    }

    @And("Click Book")
    public void clickBook() {
        Injector._page(PhpTravelsHotel.class).clickBook();
    }

    @When("Ingreso los datos: Name (.*), Apellido (.*), Email (.*), ConfEmail (.*), Number (.*), Address (.*)")
    public void ingresoLosDatosNameNameApellidoSurnameEmailMailConfEmailConfEmailNumberNumberAddressAddress(String name, String surname, String mail, String confEmail, String number, String address) {
        Injector._page(PhpTravelsHotelsDetalle.class).validateFormulario();
        Injector._page(PhpTravelsHotelsDetalle.class).completoFormularioNombre(name, surname);
        Injector._page(PhpTravelsHotelsDetalle.class).completoFormularioMail(mail, confEmail, number, address);
    }

    @And("Selecciono el pais")
    public void seleccionoElPais() {
        Injector._page(PhpTravelsHotelsDetalle.class).seleccionarPais();
    }

    @And("Selecciono un Extra")
    public void seleccionoUnExtra() {
        Injector._page(PhpTravelsHotelsDetalle.class).seleccionoExtra();
    }

    @Then("Confirmo Reserva")
    public void confirmoReserva() {
        Injector._page(PhpTravelsHotelsDetalle.class).confirm();
    }

}

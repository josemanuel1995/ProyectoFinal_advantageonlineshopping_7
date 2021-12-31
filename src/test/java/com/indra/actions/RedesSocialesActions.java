package com.indra.actions;

import com.indra.models.RedesSocialesModels;
import com.indra.pages.RedesSocialesPage;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;


@DefaultUrl("/#/")

public class RedesSocialesActions extends RedesSocialesPage {

    public RedesSocialesActions(WebDriver driver) {
        super(driver);
    }

    public void procesoRedesSociales(){
        getVistaDeLasRedesSociales().waitUntilPresent();
    }

    public void verificarConteoRedesSociales(RedesSocialesModels redesSocialesList){

        List<String> listRedSocial = new ArrayList<>();
        listRedSocial.add(redesSocialesList.getRed1());
        listRedSocial.add(redesSocialesList.getRed2());
        listRedSocial.add(redesSocialesList.getRed3());

    }
}

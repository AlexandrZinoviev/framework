package uiTests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import ui.enums.Teams;
import ui.page_objects.FNKPage;

@Epic("UI тестирование")
public class FootballFNKTest extends BaseUiTest{

    @Feature("Проверка Чемпионата Италии")
    @Test(description = "Проверка очков чемпионата Италии")
    public void checkPoint(){
        openMainPage("https://football.kulichki.net/");
        new FNKPage()
                .championsItaly()
                .checkPoints(Teams.MILAN.getName());
    }
}

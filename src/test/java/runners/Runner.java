package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources01/features" ,
        glue = "stepdefinitions" ,
        tags = "@wip" ,
        dryRun = false

)

public class Runner {
    /*
    Cucumber da runner clasi bos bir classtir
    Runner classini diger classlardan farkli kilan ve
    testNG deki xml dosyalari gibi calismasini saglayan
    iki adet notasyon mevcuttur.

    @RunWith notasyonu projemize cucumber JUnit dependency
    eklememizin sebebidir. Bu sayede runner classlarimiz
    cucumber ile calisir.

    @CucumberOptions notasyonu ile istedigimiz ozellikleri
    Runner classina ekleyebiliriz. Raporlama gibi ekstra
    optionslari da ileride ekleyecegiz.
    ANCAK
    oncelikli gorevi features dosyalari ile stepdefinitions da
    bulunan Java methodlarini iliskilendirmektir.

    tags : features klasoru icerisinde yazilan tag(lari) aratip
    buldugu tum feature veya senaryolari calistirir.

    dryRun  : iki deger alabilir
    True secilirse , verilen tag ile isaretli olan Feature veya
    scenario daki eksik stepdefinitionslari bulup ilgili methodlari
    olusturur. Hicbir sekilde testimizi calistirmaz. Eksik adim yoksa

    False secilirse, verilen tag ile isaretlenen feature veya scenariolari
    calistirir

     */
}

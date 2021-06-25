import java.util.Date;

public class HoroskopoInfo {

    public static void main(String[] args) {

    }

    public String getResult(String metai, String menesis, String diena) {

        String Avinas = new String("Avinas "+"Nesistenkite visko tempti vieni, jeigu užsiimate išsamiu namų, sodybos ar darbo vietos tvarkymu. Dalinkitės pareigomis su šalia esančiais, tarkitės dėl išlaidų. Nenumokite ranka į sveikatos sutrikimus.");
        String Jautis = new String("Jautis "+ "Tikriausiai šiandien patirsite ypatingų emocinių impulsų. Galite leistis į lengvabūdišką avantiūrą, ką nors vilioti, flirtuoti. Turėtų pagerėti santykiai su vaikais.");
        String Dvyniai = new String("Dvyniai "+"Trokšite geresnių sąlygų, komforto, patogumų. Galbūt kažką pertvarkinėsite. Tai gali kainuoti daugiau, nei apskaičiavote iš anksto. Pasisaugokite sukčių.");
        String Vezys = new String("Vezys "+"Savo energiją nukreipkite į darbą, mokslą ar kūrybą, o ne į tuščius ginčus, ambicijų demonstravimą. Nuo to priklausys, kaip pakryps pokalbis, turėsiantis įtakos jūsų autoritetui.");
        String Liutas = new String("Liutas "+"Aiškės finansinės perspektyvos, galėsite numatyti, kaip racionaliau panaudoti turimas lėšas. Regis, jums kils ūpas šį bei tą nusipirkti, atsinaujinti. O galbūt rūpinsitės dovana kažkam, kas jums išties rūpi.");
        String Mergele = new String("Mergele "+"Tai gali būti naujų galimybių diena, kai po ilgų pastangų ims ryškėti perspektyvos. Viskas taip trapu, kad lengva sugadinti. Saugokitės klastų, vagysčių, apsinuodijimo.");
        String Svarsykles = new String("Svarstyles "+"Gana neutrali diena – kaip pasiklosite, taip išsimiegosite. Nelabai tiktų imtis intensyvios veiklos. Pasisaugokite, kad dėl alkoholio ar netinkamų produktų, vaistų vartojimo nekiltų problemų.");
        String Skorpionas = new String("Skorpionas "+"Šiandien teigiamai veiksite aplinkinius ir jie – jus. Žadinsite draugiškumo bei solidarumo jausmus. Verta pamėginti atnaujinti jums svarbius santykius, jeigu jie neseniai patyrė krizę.");
        String Saulys = new String("Saulys "+"Jeigu būtina, šiandien tvarkykite dokumentus, kreipkitės į valdžią dėl leidimų, oficialių raštų, patvirtinimų, atsiskaitymų. Bus nelengva, tačiau naudokitės tomis progomis, kurios įmanomos.");
        String oziaragis = new String("Ozeragis "+"Šiandien ypač aktualūs gali būti su išsilavinimu, studijomis, įstatymais, kelionėmis susiję reikalai. Galbūt nustebins kolega ar pažįstamas iš užsienio.");
        String vandenis = new String("Vandenis "+"Šiandien ne viskas džiugins. Galbūt kažkas primins negrąžintą skolą, paprašys paslaugos, kurią gana keblu suteikti. Galite įsigyti brokuotą daiktą, dėl jo aiškintis ir pan.");
        String Zuvis = new String("Zuvis "+"Jūsų nuotaikos ir emocijos bus labai nepastovios. Neleiskite, kad sąmonę užvaldytų nepagrįsti įtarimai, pavydas. Tai prasti palydovai, norint išsaugoti santykius.");

        Date gimimoData = new Date(Integer.parseInt(metai), Integer.parseInt(menesis), Integer.parseInt(diena));
        System.out.println(gimimoData.getMonth());

        if (gimimoData.getMonth() == 1) {
            if (gimimoData.getDay() > 20) {
                return vandenis;
            } else {
                return oziaragis;
            }
        }
        if (gimimoData.getMonth() == 2){
            if (gimimoData.getDay()> 20){
                return Zuvis;
            }else {
                return vandenis;
            }
        }
        if (gimimoData.getMonth() == 3){
            if (gimimoData.getDay() >21){
                return Avinas;
            }else {
                return Zuvis;
            }
        }
        if (gimimoData.getMonth() == 4){
            if (gimimoData.getDay()>20){
                return Jautis;
            }else {
                return Avinas;
            }
        } if (gimimoData.getMonth() == 5) {
            if (gimimoData.getDay() > 21) {
                return Dvyniai;
            } else {
                return Jautis;
            }
        }
        if (gimimoData.getMonth() == 6){
            if (gimimoData.getDay()> 20){
                return Vezys;
            }else {
                return Dvyniai;
            }
        }
        if (gimimoData.getMonth() == 7){
            if (gimimoData.getDay() >21){
                return Liutas;
            }else {
                return Vezys;
            }
        }
        if (gimimoData.getMonth() == 8){
            if (gimimoData.getDay()>20){
                return Mergele;
            }else {
                return Liutas;
            }
        }
        if (gimimoData.getMonth() == 9){
            if (gimimoData.getDay()>20){
                return Svarsykles;
            }else {
                return Mergele;
            }
        }
        if (gimimoData.getMonth() == 10){
            if (gimimoData.getDay()>20){
                return Skorpionas;
            }else {
                return Svarsykles;
            }
        }
        if (gimimoData.getMonth() == 11){
            if (gimimoData.getDay()>20){
                return Saulys;
            }else {
                return Skorpionas;
            }
        }
        if (gimimoData.getMonth() == 00){
            if (gimimoData.getDay()>20){
                return oziaragis;
            }else {
                return Saulys;
            }
        }
        return null;
    }

}
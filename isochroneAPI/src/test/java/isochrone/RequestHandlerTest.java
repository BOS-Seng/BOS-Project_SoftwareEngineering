package isochrone;
/**
* Testen der RequestHandler Klasse auf die m�glichen Ergebnisse
* @since 07.02.2017
* @author Thomas M�ller
*/
import static org.junit.Assert.*;

import org.junit.Test;
import isochrone.RequestHandler;

public class RequestHandlerTest {
	/**
	 * Tests fuer {@link RequestHandler}
	 */
	@Test
	public void singlePolygon() throws Exception {		
		/**
		 * Beschreibung:
		 * Die Funktion RequestHandler wird ohne den HttpServer aufgerufen. Im Testfall wird ein Erreichbarkeitspolygon abgefragt.
		 * Erwartetes Ergebnis:
		 * Das Ergebnis soll ein Polygon als GeoJSON darstellen. Es soll identisch mit dem bearbeiteten GeoJSON der Graphhopper Isochrone API sein.
		 */		
		//Testdaten
		String testStr = "{'timelimit':5,'bos':[{'lat':51.289,'lng':9.42626}]}";
		String resShould = "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[9.400219205611936,51.25320247335482],[9.400702630362558,51.25047008061581],[9.400568180033877,51.24892299760544],[9.399678201128504,51.24765040958103],[9.398271162775414,51.246993305476025],[9.396724079765036,51.247127755804705],[9.395451491740626,51.248017734710075],[9.394794387635622,51.24942477306317],[9.394302726770967,51.252203717614336],[9.393963480966425,51.25217024905321],[9.392188799335432,51.25254631606327],[9.390955344142933,51.253876545207255],[9.389492050080989,51.256980643417826],[9.389237283775017,51.258694370826156],[9.389321853642722,51.25927210224308],[9.381269461028706,51.26187461350583],[9.381084861300783,51.26160366922917],[9.379727981457057,51.26092813050162],[9.37821404680389,51.26100213961371],[9.370916761739641,51.263293379462986],[9.370912167754502,51.263294825958816],[9.358539360809667,51.26720153798214],[9.357169520034304,51.26810454638738],[9.356479569938054,51.26959312181189],[9.356675873669388,51.27122203334259],[9.357699717045536,51.27250407572523],[9.359244869885805,51.27305579180256],[9.363722498907107,51.27335163352335],[9.363654146064404,51.274005025143566],[9.363663838259162,51.27471107657552],[9.36401308423245,51.27734783710771],[9.364467245589042,51.27858188864781],[9.365405541690674,51.27950316285622],[9.36664770023642,51.27993465780249],[9.370513760913234,51.280374877085364],[9.369987929490481,51.28060413164122],[9.368509548002493,51.2814959661586],[9.368478864230049,51.281514727934805],[9.364924782789814,51.28371726945394],[9.337883420852558,51.29328637787378],[9.332822566510464,51.29463682536717],[9.332743601762566,51.29468230693759],[9.332652629185272,51.29468759795235],[9.305570326903663,51.30365921477867],[9.304272815526415,51.3045124480163],[9.303575754330835,51.305900125364055],[9.30366592030135,51.30745041979727],[9.30451915353898,51.308747931174516],[9.305906830886743,51.309444992370096],[9.307457125319953,51.30935482639958],[9.334455209685578,51.300411108636794],[9.339545408732747,51.29905283074941],[9.33965112132352,51.29899194314108],[9.339772741033256,51.29898239856682],[9.367231111378901,51.28926572366416],[9.367259870093724,51.28924596772439],[9.36729683121547,51.2892416009612],[9.38516739751629,51.28244450762828],[9.387633047343005,51.28289406451257],[9.387969119097832,51.28293590878502],[9.390248438017892,51.283089763277786],[9.391336648791333,51.282962704725406],[9.393480247241744,51.28229993218597],[9.393840563341046,51.28229103768208],[9.396108930548277,51.28665873057693],[9.39701344736786,51.28770708068858],[9.398292420972982,51.28823756645738],[9.401136532200317,51.288697446147616],[9.399862025055423,51.2923265367924],[9.397941992942842,51.292565994424976],[9.396421752490056,51.29321437300996],[9.395475590910722,51.29456947599112],[9.395322108946994,51.29501688336596],[9.395181547288296,51.29635106609051],[9.39563656657182,51.29761311148351],[9.396596172995658,51.29855063835443],[9.402298087774927,51.302032872534994],[9.399792843852726,51.30284028237325],[9.399680546449327,51.302878944457944],[9.398250940828836,51.30340300921458],[9.397484816227927,51.30328015369992],[9.396033976517208,51.30383387462754],[9.396000151284044,51.30387548117807],[9.395057253707002,51.30383995367817],[9.394439916448865,51.30388053021157],[9.381799819919141,51.30603635575548],[9.381758489284563,51.306043702823054],[9.381132940501342,51.30615942304299],[9.379416163131225,51.30497352827085],[9.378088867687008,51.30446576156233],[9.376676804436366,51.304625816561334],[9.375496830994527,51.305417777989106],[9.37481372556505,51.30666393496106],[9.374780772469467,51.30808465812903],[9.375059481110956,51.30935525417582],[9.372768571958241,51.31101354904972],[9.371789170347078,51.31221866946525],[9.37154354387907,51.3137520351653],[9.372097507967961,51.31520278204884],[9.373302628383493,51.316182183660004],[9.374835994083544,51.31642781012801],[9.376286740967084,51.315873846039125],[9.381117297046279,51.312377205251465],[9.386703434964028,51.3142058620081],[9.388207368426537,51.31429997678886],[9.394512422397613,51.313078454072695],[9.396137995938597,51.312176944191634],[9.398153065180328,51.310011563586755],[9.410064029730071,51.30856602305453],[9.410070413670029,51.3087585448873],[9.410478473317037,51.310172522772774],[9.411173985031304,51.31136293931425],[9.411255377228267,51.31149435344893],[9.411586183014165,51.31199894403114],[9.411817565390264,51.31230679605209],[9.412225112158024,51.3127821431048],[9.414050007674746,51.31379513397873],[9.415563931933965,51.31402619084335],[9.41602087596693,51.314460130828884],[9.416606997336826,51.314894431296274],[9.421869528794575,51.31787838889204],[9.422575947604233,51.318167334704064],[9.428317737669591,51.319699174109026],[9.429897045777446,51.31969025846104],[9.430521843500507,51.31931712208631],[9.44048212106452,51.31974029700793],[9.44179961252354,51.31949682536081],[9.447042586206786,51.31723091748612],[9.448130224366361,51.316297338838254],[9.44939146450071,51.31589361305281],[9.450435592812438,51.31474411803301],[9.45076508694531,51.313226561988486],[9.450389270609657,51.31205251102924],[9.45366630199378,51.31083917333568],[9.454858750222561,51.31002801265219],[9.455534892926433,51.30875414237749],[9.45553847244224,51.30731195597489],[9.454868661538141,51.306034745034786],[9.45286873939671,51.303780758089324],[9.452463227853055,51.30340120259102],[9.448967229094322,51.300689936251196],[9.447260840363477,51.30006347876515],[9.446233903567958,51.30034078477066],[9.447198889031329,51.2997149407904],[9.447904729500843,51.29833170835748],[9.447893448114455,51.2981139405025],[9.451047183641808,51.298056185776275],[9.451219258430186,51.298224039893896],[9.452631897500229,51.298627557427295],[9.45406674009297,51.29831195914462],[9.454607144976862,51.29784629002304],[9.455794673667592,51.297461273810086],[9.460051004193236,51.294494452550076],[9.460069689023369,51.29448132257425],[9.460893723255808,51.293897569571435],[9.461816736063913,51.29284218996216],[9.463321945422308,51.289970149103944],[9.464225756359992,51.28967648529351],[9.464711818143913,51.289136661345324],[9.46488461186788,51.28912437098539],[9.466875965841433,51.28837279365088],[9.46826308164152,51.287302402489615],[9.470181978717148,51.284598772995075],[9.470706336538372,51.2832799858664],[9.470565846261445,51.281867748953715],[9.46979194883945,51.28067811312891],[9.466572552891561,51.277647216874335],[9.466074391908052,51.27736418342021],[9.465795634499326,51.27616157552691],[9.464735551761482,51.27502677716562],[9.463250093999747,51.274574054325484],[9.462550752716036,51.2747361575057],[9.46131839996833,51.27393569997507],[9.461166589122405,51.27384336789194],[9.454496829222958,51.27005269866402],[9.452888477095943,51.26966354277443],[9.446212011673808,51.269944243404694],[9.444510506539872,51.270562486984545],[9.443192126273779,51.27157520717482],[9.442246180401357,51.27281069572637],[9.442207188556917,51.27311183850919],[9.435678460781862,51.27010162854995],[9.439620875017415,51.26972180765512],[9.439674538694593,51.26971615003107],[9.440655221387583,51.26960383252606],[9.44070953862957,51.2695971090519],[9.442088454864365,51.2694136385006],[9.442150396253147,51.2694047385314],[9.443528567429869,51.269192024450604],[9.443685287767718,51.2691635567376],[9.447259890153505,51.268415704693474],[9.44727700129908,51.26840719755347],[9.44743434135659,51.26837372520274],[9.459571151155743,51.26506622613732],[9.460908410915547,51.264288362935396],[9.461680298998841,51.26294764536149],[9.46168155022434,51.26140060520024],[9.460911831858533,51.260058640795556],[9.459575832098222,51.259278615496896],[9.458028828138293,51.25926795838343],[9.45200867297386,51.26083017343996],[9.451907235662327,51.26058128510661],[9.45068062604578,51.25962893455115],[9.449142175679599,51.25941747958509],[9.447704111096993,51.26000357939582],[9.444033661055526,51.2627869701494],[9.42828681564459,51.26478735929378],[9.428257890082529,51.26479910181928],[9.428227316114214,51.26479552374687],[9.427447799101838,51.26491044895514],[9.427105675658124,51.26498145705123],[9.419463242440008,51.2670383761355],[9.419044934727808,51.267184866597255],[9.417797521243486,51.26772820019943],[9.417743396956414,51.26775241414626],[9.417647994489199,51.26779623156335],[9.417480266430744,51.26782934840286],[9.416590108294029,51.26820746537661],[9.416297747046961,51.26835085399104],[9.414445160140128,51.26938778856879],[9.414085730857753,51.26962433093038],[9.413031836688909,51.27043188904993],[9.406594909936812,51.267952219523764],[9.40608690448609,51.26780641254272],[9.4059220513935,51.267774484920615],[9.406486374373438,51.263989350242205],[9.406492186973557,51.263145511496916],[9.406390672810655,51.26239374789788],[9.406038832325528,51.26167450143909],[9.406317448055043,51.25948627228255],[9.406105035716513,51.25793999894193],[9.40514459462218,51.256709700949656],[9.400865167296171,51.25349142258888],[9.400219205611936,51.25320247335482]],[[9.429848262447742,51.29591592382773],[9.425100596683,51.29428236882106],[9.428170606187969,51.293707110980435],[9.433682996314271,51.295003576816775],[9.429848262447742,51.29591592382773]],[[9.444424660977878,51.3006361570239],[9.4454335937683,51.30058388961902],[9.4447512029906,51.30102276187141],[9.444396589576481,51.30132935399703],[9.443944141960293,51.30117696562671],[9.444424660977878,51.3006361570239]]]},\"properties\":{\"bucket\":0}}]}";
		
		//Test
		String resIs = RequestHandler.getPolygon(testStr);
        
        //Asserts
		assertNotNull("Ergebnis darf nicht null sein", resIs);
        assertEquals(resIs, resShould);
	}
	
	@Test
	public void polygonList() throws Exception {		
		/**
		 * Beschreibung:
		 * Die Funktion RequestHandler wird ohne den HttpServer aufgerufen. Im Testfall werden drei Erreichbarkeitspolygone abgefragt.
		 * Erwartetes Ergebnis:
		 * Das Ergebnis sollen drei Polygoen in einem GeoJSON darstellen. Die einzelnen Polygone sollen jeweils einer Abfrage vom GeoJSON der Graphhopper Isochrone API entsprechen.
		 */		
		//Testdaten
		String testStr = "{\"timelimit\":1,\"bos\":[{\"lat\":51.289,\"lng\":9.42626},{\"lat\":51.389,\"lng\":9.82626},{\"lat\":51.889,\"lng\":9.82626}]}";
		String resShould = "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[9.424162399121219,51.28444896798177],[9.423064056809787,51.284031106330765],[9.421889467133736,51.284067207374676],[9.421850910378286,51.2840761480716],[9.421389364452585,51.28422332533576],[9.419382364259429,51.285047173303674],[9.418576863463134,51.285538144354305],[9.415707644811127,51.287980817257605],[9.414854557695826,51.28918240567049],[9.414676541310278,51.2906452393954],[9.415216548483256,51.292016357403966],[9.416344283143607,51.292964928369216],[9.417943550304482,51.29373978876862],[9.418050975710845,51.29378924716095],[9.418393888690483,51.293939003834296],[9.419784300041549,51.29418373683043],[9.428430512753023,51.29363574661528],[9.429834744257464,51.29318324971079],[9.430853475051162,51.292116100641266],[9.431240328536486,51.290692385800604],[9.43090174550615,51.28925642580875],[9.429919611121123,51.288155502734064],[9.428025673491051,51.28687661054602],[9.42794207874252,51.28682216421945],[9.424162399121219,51.28444896798177]]]},\"properties\":{\"bucket\":0}},{\"type\":\"Feature\",\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[9.831644320694862,51.390080278210455],[9.831589765146852,51.3885673863018],[9.830803413187128,51.387273760068865],[9.82948550656686,51.3865288168661],[9.82797164555543,51.38652225385086],[9.822398052350806,51.387949785125144],[9.820971569218564,51.388785348147955],[9.820204299151985,51.3902496965821],[9.820329238173375,51.391898153415816],[9.820560952426213,51.39221334569225],[9.820420733893924,51.39326115758162],[9.820643012048233,51.394855237548974],[9.821657181279,51.39610502124688],[9.827628262967355,51.40034551928841],[9.828944254232471,51.4008698746736],[9.830354130545532,51.40073192409651],[9.83154352370488,51.399962427187916],[9.83224722790125,51.398732963083575],[9.832308334176988,51.39731767244102],[9.831238140986857,51.39190502244052],[9.831644320694862,51.390080278210455]]]},\"properties\":{\"bucket\":0}},{\"type\":\"Feature\",\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[9.825363703287271,51.886519702539886],[9.823923940112678,51.885937787827096],[9.82238611127165,51.88615371649028],[9.82116227676024,51.88710963061851],[9.82058036204745,51.888549393793106],[9.820796290710634,51.890087222634136],[9.821752204838871,51.89131105714554],[9.824370152654632,51.89328434346074],[9.825809915829225,51.89386625817353],[9.827347744670254,51.89365032951035],[9.828571579181663,51.89269441538212],[9.829153493894454,51.89125465220752],[9.82893756523127,51.88971682336649],[9.827981651103032,51.888492988855084],[9.825363703287271,51.886519702539886]]]},\"properties\":{\"bucket\":0}}]}";
		
		//Test
		String resIs = RequestHandler.getPolygon(testStr);
        
		//Asserts
		assertNotNull("Ergebnis darf nicht null sein", resIs);
        assertEquals(resIs, resShould);
	}
	
	@Test
	public void badInput() throws Exception {		
		/**
		 * Beschreibung:
		 * Die Funktion RequestHandler wird ohne den HttpServer aufgerufen. Im Testfall wird ein Erreichbarkeitspolygon abgefragt, die Koordinaten 
		 * sind jedoch nicht im Bereich Deutschlands oder fehlerhaft.
		 * Erwartetes Ergebnis:
		 * Das Ergebnis soll "error" sein.
		 */		
		//Testdaten
		String testStr = "{'timelimit':5,'bos':[{'lat':81.289,'lng':9.42626}]}";
		String resShould = "error";
		
		//Test
		String resIs = RequestHandler.getPolygon(testStr);
        
        //Asserts
		assertNotNull("Ergebnis darf nicht null sein", resIs);
        assertEquals(resIs, resShould);
	} 
}

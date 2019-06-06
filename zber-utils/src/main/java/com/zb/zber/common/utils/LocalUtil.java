package com.zb.zber.common.utils;

public class LocalUtil {


	private static final String LOCAL_LIST = "<Location>\n" +
			"    <State Name=\"北京\" Code=\"11\">\n" +
			"      <City Name=\"北京市\" Code=\"1\"/>\n" +
			"    </State>\n" +
			"    <State Name=\"天津\" Code=\"12\">\n" +
			"      <City Name=\"天津市\" Code=\"1\"/>\n" +
			"    </State>\n" +
			"    <State Name=\"河北\" Code=\"13\">\n" +
			"      <City Name=\"石家庄\" Code=\"1\"/>\n" +
			"      <City Name=\"唐山\" Code=\"2\"/>\n" +
			"      <City Name=\"秦皇岛\" Code=\"3\"/>\n" +
			"      <City Name=\"邯郸\" Code=\"4\"/>\n" +
			"      <City Name=\"邢台\" Code=\"5\"/>\n" +
			"      <City Name=\"保定\" Code=\"6\"/>\n" +
			"      <City Name=\"张家口\" Code=\"7\"/>\n" +
			"      <City Name=\"承德\" Code=\"8\"/>\n" +
			"      <City Name=\"沧州\" Code=\"9\"/>\n" +
			"      <City Name=\"廊坊\" Code=\"10\"/>\n" +
			"      <City Name=\"衡水\" Code=\"11\"/>\n" +
			"    </State>\n" +
			"    <State Name=\"山西\" Code=\"14\">\n" +
			"      <City Name=\"太原\" Code=\"1\">\n" +
			"      </City>\n" +
			"      <City Name=\"大同\" Code=\"2\">\n" +
			"      </City>\n" +
			"      <City Name=\"阳泉\" Code=\"3\">\n" +
			"      </City>\n" +
			"      <City Name=\"长治\" Code=\"4\">\n" +
			"      </City>\n" +
			"      <City Name=\"晋城\" Code=\"5\">\n" +
			"      </City>\n" +
			"      <City Name=\"朔州\" Code=\"6\">\n" +
			"      </City>\n" +
			"      <City Name=\"晋中\" Code=\"7\">\n" +
			"      </City>\n" +
			"      <City Name=\"运城\" Code=\"8\">\n" +
			"      </City>\n" +
			"      <City Name=\"忻州\" Code=\"9\">\n" +
			"      </City>\n" +
			"      <City Name=\"临汾\" Code=\"10\">\n" +
			"      </City>\n" +
			"      <City Name=\"吕梁\" Code=\"11\">\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"内蒙古\" Code=\"15\">\n" +
			"      <City Name=\"呼和浩特\" Code=\"1\">\n" +
			"      </City>\n" +
			"      <City Name=\"包头\" Code=\"2\">\n" +
			"      </City>\n" +
			"      <City Name=\"乌海\" Code=\"3\">\n" +
			"      </City>\n" +
			"      <City Name=\"赤峰\" Code=\"4\">\n" +
			"      </City>\n" +
			"      <City Name=\"通辽\" Code=\"5\">\n" +
			"      </City>\n" +
			"      <City Name=\"鄂尔多斯\" Code=\"6\">\n" +
			"      </City>\n" +
			"      <City Name=\"呼伦贝尔\" Code=\"7\">\n" +
			"      </City>\n" +
			"      <City Name=\"巴彦淖尔\" Code=\"8\">\n" +
			"      </City>\n" +
			"      <City Name=\"乌兰察布\" Code=\"9\">\n" +
			"      </City>\n" +
			"      <City Name=\"兴安\" Code=\"22\">\n" +
			"      </City>\n" +
			"      <City Name=\"锡林郭勒\" Code=\"25\">\n" +
			"      </City>\n" +
			"      <City Name=\"阿拉善\" Code=\"29\">\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"辽宁\" Code=\"21\">\n" +
			"      <City Name=\"沈阳\" Code=\"1\">\n" +
			"      </City>\n" +
			"      <City Name=\"大连\" Code=\"2\">\n" +
			"       \n" +
			"      </City>\n" +
			"      <City Name=\"鞍山\" Code=\"3\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"抚顺\" Code=\"4\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"本溪\" Code=\"5\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"丹东\" Code=\"6\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"锦州\" Code=\"7\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"营口\" Code=\"8\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"阜新\" Code=\"9\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"辽阳\" Code=\"10\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"盘锦\" Code=\"11\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"铁岭\" Code=\"12\">\n" +
			"      </City>\n" +
			"      <City Name=\"朝阳\" Code=\"13\">\n" +
			"      </City>\n" +
			"      <City Name=\"葫芦岛\" Code=\"14\">\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"吉林\" Code=\"22\">\n" +
			"      <City Name=\"长春\" Code=\"1\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"吉林\" Code=\"2\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"四平\" Code=\"3\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"辽源\" Code=\"4\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"通化\" Code=\"5\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"白山\" Code=\"6\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"松原\" Code=\"7\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"白城\" Code=\"8\">\n" +
			"\n" +
			"      </City>\n" +
			"      <City Name=\"延边\" Code=\"24\">\n" +
			"\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"黑龙江\" Code=\"23\">\n" +
			"      <City Name=\"哈尔滨\" Code=\"1\">\n" +
			"      </City>\n" +
			"      <City Name=\"齐齐哈尔\" Code=\"2\">\n" +
			"      </City>\n" +
			"      <City Name=\"鸡西\" Code=\"3\">\n" +
			"      </City>\n" +
			"      <City Name=\"鹤岗\" Code=\"4\">\n" +
			"      </City>\n" +
			"      <City Name=\"双鸭山\" Code=\"5\">\n" +
			"      </City>\n" +
			"      <City Name=\"大庆\" Code=\"6\">\n" +
			"      </City>\n" +
			"      <City Name=\"伊春\" Code=\"7\">\n" +
			"      </City>\n" +
			"      <City Name=\"佳木斯\" Code=\"8\">\n" +
			"      </City>\n" +
			"      <City Name=\"七台河\" Code=\"9\">\n" +
			"      </City>\n" +
			"      <City Name=\"牡丹江\" Code=\"10\">\n" +
			"      </City>\n" +
			"      <City Name=\"黑河\" Code=\"11\">\n" +
			"      </City>\n" +
			"      <City Name=\"绥化\" Code=\"12\">\n" +
			"      </City>\n" +
			"      <City Name=\"大兴安岭\" Code=\"27\">\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"上海\" Code=\"31\">\n" +
			"      <City Name=\"上海市\" Code=\"1\" />\n" +
			"    </State>\n" +
			"    <State Name=\"江苏\" Code=\"32\">\n" +
			"      <City Name=\"南京\" Code=\"1\">\n" +
			"      </City>\n" +
			"      <City Name=\"无锡\" Code=\"2\">\n" +
			"      </City>\n" +
			"      <City Name=\"徐州\" Code=\"3\">\n" +
			"      </City>\n" +
			"      <City Name=\"常州\" Code=\"4\">\n" +
			"      </City>\n" +
			"      <City Name=\"苏州\" Code=\"5\">\n" +
			"      </City>\n" +
			"      <City Name=\"南通\" Code=\"6\">\n" +
			"      </City>\n" +
			"      <City Name=\"连云港\" Code=\"7\">\n" +
			"      </City>\n" +
			"      <City Name=\"淮安\" Code=\"8\">\n" +
			"      </City>\n" +
			"      <City Name=\"盐城\" Code=\"9\">\n" +
			"      </City>\n" +
			"      <City Name=\"扬州\" Code=\"10\">\n" +
			"      </City>\n" +
			"      <City Name=\"镇江\" Code=\"11\">\n" +
			"      </City>\n" +
			"      <City Name=\"泰州\" Code=\"12\">\n" +
			"      </City>\n" +
			"      <City Name=\"宿迁\" Code=\"13\">\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"浙江\" Code=\"33\">\n" +
			"      <City Name=\"杭州\" Code=\"1\">\n" +
			"      </City>\n" +
			"      <City Name=\"宁波\" Code=\"2\">\n" +
			"      </City>\n" +
			"      <City Name=\"温州\" Code=\"3\">\n" +
			"      </City>\n" +
			"      <City Name=\"嘉兴\" Code=\"4\">\n" +
			"      </City>\n" +
			"      <City Name=\"湖州\" Code=\"5\">\n" +
			"      </City>\n" +
			"      <City Name=\"绍兴\" Code=\"6\">\n" +
			"      </City>\n" +
			"      <City Name=\"金华\" Code=\"7\">\n" +
			"        <Region Name=\"婺城区\" Code=\"2\" />\n" +
			"        <Region Name=\"金东区\" Code=\"3\" />\n" +
			"        <Region Name=\"武义县\" Code=\"23\" />\n" +
			"        <Region Name=\"浦江县\" Code=\"26\" />\n" +
			"        <Region Name=\"磐安县\" Code=\"27\" />\n" +
			"        <Region Name=\"兰溪市\" Code=\"81\" />\n" +
			"        <Region Name=\"义乌市\" Code=\"82\" />\n" +
			"        <Region Name=\"东阳市\" Code=\"83\" />\n" +
			"        <Region Name=\"永康市\" Code=\"84\" />\n" +
			"      </City>\n" +
			"      <City Name=\"衢州\" Code=\"8\">\n" +
			"        <Region Name=\"柯城区\" Code=\"2\" />\n" +
			"        <Region Name=\"衢江区\" Code=\"3\" />\n" +
			"        <Region Name=\"常山县\" Code=\"22\" />\n" +
			"        <Region Name=\"开化县\" Code=\"24\" />\n" +
			"        <Region Name=\"龙游县\" Code=\"25\" />\n" +
			"        <Region Name=\"江山市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"舟山\" Code=\"9\">\n" +
			"        <Region Name=\"定海区\" Code=\"2\" />\n" +
			"        <Region Name=\"普陀区\" Code=\"3\" />\n" +
			"        <Region Name=\"岱山县\" Code=\"21\" />\n" +
			"        <Region Name=\"嵊泗县\" Code=\"22\" />\n" +
			"      </City>\n" +
			"      <City Name=\"台州\" Code=\"10\">\n" +
			"        <Region Name=\"椒江区\" Code=\"2\" />\n" +
			"        <Region Name=\"黄岩区\" Code=\"3\" />\n" +
			"        <Region Name=\"路桥区\" Code=\"4\" />\n" +
			"        <Region Name=\"玉环县\" Code=\"21\" />\n" +
			"        <Region Name=\"三门县\" Code=\"22\" />\n" +
			"        <Region Name=\"天台县\" Code=\"23\" />\n" +
			"        <Region Name=\"仙居县\" Code=\"24\" />\n" +
			"        <Region Name=\"温岭市\" Code=\"81\" />\n" +
			"        <Region Name=\"临海市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"丽水\" Code=\"11\">\n" +
			"        <Region Name=\"莲都区\" Code=\"2\" />\n" +
			"        <Region Name=\"青田县\" Code=\"21\" />\n" +
			"        <Region Name=\"缙云县\" Code=\"22\" />\n" +
			"        <Region Name=\"遂昌县\" Code=\"23\" />\n" +
			"        <Region Name=\"松阳县\" Code=\"24\" />\n" +
			"        <Region Name=\"云和县\" Code=\"25\" />\n" +
			"        <Region Name=\"庆元县\" Code=\"26\" />\n" +
			"        <Region Name=\"景宁畲族自治县\" Code=\"27\" />\n" +
			"        <Region Name=\"龙泉市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"安徽\" Code=\"34\">\n" +
			"      <City Name=\"合肥\" Code=\"1\">\n" +
			"        <Region Name=\"瑶海区\" Code=\"2\" />\n" +
			"        <Region Name=\"庐阳区\" Code=\"3\" />\n" +
			"        <Region Name=\"蜀山区\" Code=\"4\" />\n" +
			"        <Region Name=\"包河区\" Code=\"11\" />\n" +
			"        <Region Name=\"长丰县\" Code=\"21\" />\n" +
			"        <Region Name=\"肥东县\" Code=\"22\" />\n" +
			"        <Region Name=\"肥西县\" Code=\"23\" />\n" +
			"\t\t<Region Name=\"庐江县\" Code=\"24\" />\n" +
			"\t\t<Region Name=\"巢湖市\" Code=\"25\" />\n" +
			"      </City>\n" +
			"      <City Name=\"芜湖\" Code=\"2\">\n" +
			"        <Region Name=\"镜湖区\" Code=\"2\" />\n" +
			"        <Region Name=\"弋江区\" Code=\"3\" />\n" +
			"        <Region Name=\"鸠江区\" Code=\"7\" />\n" +
			"        <Region Name=\"三山区\" Code=\"8\" />\n" +
			"        <Region Name=\"芜湖县\" Code=\"21\" />\n" +
			"        <Region Name=\"繁昌县\" Code=\"22\" />\n" +
			"        <Region Name=\"南陵县\" Code=\"23\" />\n" +
			"\t\t<Region Name=\"无为县\" Code=\"24\" />\n" +
			"      </City>\n" +
			"      <City Name=\"蚌埠\" Code=\"3\">\n" +
			"        <Region Name=\"龙子湖区\" Code=\"2\" />\n" +
			"        <Region Name=\"蚌山区\" Code=\"3\" />\n" +
			"        <Region Name=\"禹会区\" Code=\"4\" />\n" +
			"        <Region Name=\"淮上区\" Code=\"11\" />\n" +
			"        <Region Name=\"怀远县\" Code=\"21\" />\n" +
			"        <Region Name=\"五河县\" Code=\"22\" />\n" +
			"        <Region Name=\"固镇县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"淮南\" Code=\"4\">\n" +
			"        <Region Name=\"大通区\" Code=\"2\" />\n" +
			"        <Region Name=\"田家庵区\" Code=\"3\" />\n" +
			"        <Region Name=\"谢家集区\" Code=\"4\" />\n" +
			"        <Region Name=\"八公山区\" Code=\"5\" />\n" +
			"        <Region Name=\"潘集区\" Code=\"6\" />\n" +
			"        <Region Name=\"凤台县\" Code=\"21\" />\n" +
			"      </City>\n" +
			"      <City Name=\"马鞍山\" Code=\"5\">\n" +
			"        <Region Name=\"花山区\" Code=\"3\" />\n" +
			"        <Region Name=\"雨山区\" Code=\"4\" />\n" +
			"\t<Region Name=\"博望区\" Code=\"5\" />\n" +
			"        <Region Name=\"当涂县\" Code=\"21\" />\n" +
			"\t<Region Name=\"含山县\" Code=\"22\" />\n" +
			"\t<Region Name=\"和县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"淮北\" Code=\"6\">\n" +
			"        <Region Name=\"杜集区\" Code=\"2\" />\n" +
			"        <Region Name=\"相山区\" Code=\"3\" />\n" +
			"        <Region Name=\"烈山区\" Code=\"4\" />\n" +
			"        <Region Name=\"濉溪县\" Code=\"21\" />\n" +
			"      </City>\n" +
			"      <City Name=\"铜陵\" Code=\"7\">\n" +
			"        <Region Name=\"铜官山区\" Code=\"2\" />\n" +
			"        <Region Name=\"狮子山区\" Code=\"3\" />\n" +
			"        <Region Name=\"郊　区\" Code=\"11\" />\n" +
			"        <Region Name=\"铜陵县\" Code=\"21\" />\n" +
			"      </City>\n" +
			"      <City Name=\"安庆\" Code=\"8\">\n" +
			"        <Region Name=\"迎江区\" Code=\"2\" />\n" +
			"        <Region Name=\"大观区\" Code=\"3\" />\n" +
			"        <Region Name=\"宜秀区\" Code=\"11\" />\n" +
			"        <Region Name=\"怀宁县\" Code=\"22\" />\n" +
			"        <Region Name=\"枞阳县\" Code=\"23\" />\n" +
			"        <Region Name=\"潜山县\" Code=\"24\" />\n" +
			"        <Region Name=\"太湖县\" Code=\"25\" />\n" +
			"        <Region Name=\"宿松县\" Code=\"26\" />\n" +
			"        <Region Name=\"望江县\" Code=\"27\" />\n" +
			"        <Region Name=\"岳西县\" Code=\"28\" />\n" +
			"        <Region Name=\"桐城市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"黄山\" Code=\"10\">\n" +
			"        <Region Name=\"屯溪区\" Code=\"2\" />\n" +
			"        <Region Name=\"黄山区\" Code=\"3\" />\n" +
			"        <Region Name=\"徽州区\" Code=\"4\" />\n" +
			"        <Region Name=\"歙　县\" Code=\"21\" />\n" +
			"        <Region Name=\"休宁县\" Code=\"22\" />\n" +
			"        <Region Name=\"黟　县\" Code=\"23\" />\n" +
			"        <Region Name=\"祁门县\" Code=\"24\" />\n" +
			"      </City>\n" +
			"      <City Name=\"滁州\" Code=\"11\">\n" +
			"        <Region Name=\"琅琊区\" Code=\"2\" />\n" +
			"        <Region Name=\"南谯区\" Code=\"3\" />\n" +
			"        <Region Name=\"来安县\" Code=\"22\" />\n" +
			"        <Region Name=\"全椒县\" Code=\"24\" />\n" +
			"        <Region Name=\"定远县\" Code=\"25\" />\n" +
			"        <Region Name=\"凤阳县\" Code=\"26\" />\n" +
			"        <Region Name=\"天长市\" Code=\"81\" />\n" +
			"        <Region Name=\"明光市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"阜阳\" Code=\"12\">\n" +
			"        <Region Name=\"颍州区\" Code=\"2\" />\n" +
			"        <Region Name=\"颍东区\" Code=\"3\" />\n" +
			"        <Region Name=\"颍泉区\" Code=\"4\" />\n" +
			"        <Region Name=\"临泉县\" Code=\"21\" />\n" +
			"        <Region Name=\"太和县\" Code=\"22\" />\n" +
			"        <Region Name=\"阜南县\" Code=\"25\" />\n" +
			"        <Region Name=\"颍上县\" Code=\"26\" />\n" +
			"        <Region Name=\"界首市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"宿州\" Code=\"13\">\n" +
			"        <Region Name=\"埇桥区\" Code=\"2\" />\n" +
			"        <Region Name=\"砀山县\" Code=\"21\" />\n" +
			"        <Region Name=\"萧　县\" Code=\"22\" />\n" +
			"        <Region Name=\"灵璧县\" Code=\"23\" />\n" +
			"        <Region Name=\"泗　县\" Code=\"24\" />\n" +
			"      </City>\n" +
			"      <City Name=\"六安\" Code=\"15\">\n" +
			"        <Region Name=\"金安区\" Code=\"2\" />\n" +
			"        <Region Name=\"裕安区\" Code=\"3\" />\n" +
			"        <Region Name=\"寿　县\" Code=\"21\" />\n" +
			"        <Region Name=\"霍邱县\" Code=\"22\" />\n" +
			"        <Region Name=\"舒城县\" Code=\"23\" />\n" +
			"        <Region Name=\"金寨县\" Code=\"24\" />\n" +
			"        <Region Name=\"霍山县\" Code=\"25\" />\n" +
			"      </City>\n" +
			"      <City Name=\"亳州\" Code=\"16\">\n" +
			"        <Region Name=\"谯城区\" Code=\"2\" />\n" +
			"        <Region Name=\"涡阳县\" Code=\"21\" />\n" +
			"        <Region Name=\"蒙城县\" Code=\"22\" />\n" +
			"        <Region Name=\"利辛县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"池州\" Code=\"17\">\n" +
			"        <Region Name=\"贵池区\" Code=\"2\" />\n" +
			"        <Region Name=\"东至县\" Code=\"21\" />\n" +
			"        <Region Name=\"石台县\" Code=\"22\" />\n" +
			"        <Region Name=\"青阳县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"宣城\" Code=\"18\">\n" +
			"        <Region Name=\"宣州区\" Code=\"2\" />\n" +
			"        <Region Name=\"郎溪县\" Code=\"21\" />\n" +
			"        <Region Name=\"广德县\" Code=\"22\" />\n" +
			"        <Region Name=\"泾　县\" Code=\"23\" />\n" +
			"        <Region Name=\"绩溪县\" Code=\"24\" />\n" +
			"        <Region Name=\"旌德县\" Code=\"25\" />\n" +
			"        <Region Name=\"宁国市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"福建\" Code=\"35\">\n" +
			"      <City Name=\"福州\" Code=\"1\">\n" +
			"        <Region Name=\"鼓楼区\" Code=\"2\" />\n" +
			"        <Region Name=\"台江区\" Code=\"3\" />\n" +
			"        <Region Name=\"仓山区\" Code=\"4\" />\n" +
			"        <Region Name=\"马尾区\" Code=\"5\" />\n" +
			"        <Region Name=\"晋安区\" Code=\"11\" />\n" +
			"        <Region Name=\"闽侯县\" Code=\"21\" />\n" +
			"        <Region Name=\"连江县\" Code=\"22\" />\n" +
			"        <Region Name=\"罗源县\" Code=\"23\" />\n" +
			"        <Region Name=\"闽清县\" Code=\"24\" />\n" +
			"        <Region Name=\"永泰县\" Code=\"25\" />\n" +
			"        <Region Name=\"平潭县\" Code=\"28\" />\n" +
			"        <Region Name=\"福清市\" Code=\"81\" />\n" +
			"        <Region Name=\"长乐市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"厦门\" Code=\"2\">\n" +
			"        <Region Name=\"思明区\" Code=\"3\" />\n" +
			"        <Region Name=\"海沧区\" Code=\"5\" />\n" +
			"        <Region Name=\"湖里区\" Code=\"6\" />\n" +
			"        <Region Name=\"集美区\" Code=\"11\" />\n" +
			"        <Region Name=\"同安区\" Code=\"12\" />\n" +
			"        <Region Name=\"翔安区\" Code=\"13\" />\n" +
			"      </City>\n" +
			"      <City Name=\"莆田\" Code=\"3\">\n" +
			"        <Region Name=\"城厢区\" Code=\"2\" />\n" +
			"        <Region Name=\"涵江区\" Code=\"3\" />\n" +
			"        <Region Name=\"荔城区\" Code=\"4\" />\n" +
			"        <Region Name=\"秀屿区\" Code=\"5\" />\n" +
			"        <Region Name=\"仙游县\" Code=\"22\" />\n" +
			"      </City>\n" +
			"      <City Name=\"三明\" Code=\"4\">\n" +
			"        <Region Name=\"梅列区\" Code=\"2\" />\n" +
			"        <Region Name=\"三元区\" Code=\"3\" />\n" +
			"        <Region Name=\"明溪县\" Code=\"21\" />\n" +
			"        <Region Name=\"清流县\" Code=\"23\" />\n" +
			"        <Region Name=\"宁化县\" Code=\"24\" />\n" +
			"        <Region Name=\"大田县\" Code=\"25\" />\n" +
			"        <Region Name=\"尤溪县\" Code=\"26\" />\n" +
			"        <Region Name=\"沙　县\" Code=\"27\" />\n" +
			"        <Region Name=\"将乐县\" Code=\"28\" />\n" +
			"        <Region Name=\"泰宁县\" Code=\"29\" />\n" +
			"        <Region Name=\"建宁县\" Code=\"30\" />\n" +
			"        <Region Name=\"永安市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"泉州\" Code=\"5\">\n" +
			"        <Region Name=\"鲤城区\" Code=\"2\" />\n" +
			"        <Region Name=\"丰泽区\" Code=\"3\" />\n" +
			"        <Region Name=\"洛江区\" Code=\"4\" />\n" +
			"        <Region Name=\"泉港区\" Code=\"5\" />\n" +
			"        <Region Name=\"惠安县\" Code=\"21\" />\n" +
			"        <Region Name=\"安溪县\" Code=\"24\" />\n" +
			"        <Region Name=\"永春县\" Code=\"25\" />\n" +
			"        <Region Name=\"德化县\" Code=\"26\" />\n" +
			"        <Region Name=\"金门县\" Code=\"27\" />\n" +
			"        <Region Name=\"石狮市\" Code=\"81\" />\n" +
			"        <Region Name=\"晋江市\" Code=\"82\" />\n" +
			"        <Region Name=\"南安市\" Code=\"83\" />\n" +
			"      </City>\n" +
			"      <City Name=\"漳州\" Code=\"6\">\n" +
			"        <Region Name=\"芗城区\" Code=\"2\" />\n" +
			"        <Region Name=\"龙文区\" Code=\"3\" />\n" +
			"        <Region Name=\"云霄县\" Code=\"22\" />\n" +
			"        <Region Name=\"漳浦县\" Code=\"23\" />\n" +
			"        <Region Name=\"诏安县\" Code=\"24\" />\n" +
			"        <Region Name=\"长泰县\" Code=\"25\" />\n" +
			"        <Region Name=\"东山县\" Code=\"26\" />\n" +
			"        <Region Name=\"南靖县\" Code=\"27\" />\n" +
			"        <Region Name=\"平和县\" Code=\"28\" />\n" +
			"        <Region Name=\"华安县\" Code=\"29\" />\n" +
			"        <Region Name=\"龙海市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"南平\" Code=\"7\">\n" +
			"        <Region Name=\"延平区\" Code=\"2\" />\n" +
			"        <Region Name=\"顺昌县\" Code=\"21\" />\n" +
			"        <Region Name=\"浦城县\" Code=\"22\" />\n" +
			"        <Region Name=\"光泽县\" Code=\"23\" />\n" +
			"        <Region Name=\"松溪县\" Code=\"24\" />\n" +
			"        <Region Name=\"政和县\" Code=\"25\" />\n" +
			"        <Region Name=\"邵武市\" Code=\"81\" />\n" +
			"        <Region Name=\"武夷山市\" Code=\"82\" />\n" +
			"        <Region Name=\"建瓯市\" Code=\"83\" />\n" +
			"        <Region Name=\"建阳市\" Code=\"84\" />\n" +
			"      </City>\n" +
			"      <City Name=\"龙岩\" Code=\"8\">\n" +
			"        <Region Name=\"新罗区\" Code=\"2\" />\n" +
			"        <Region Name=\"长汀县\" Code=\"21\" />\n" +
			"        <Region Name=\"永定县\" Code=\"22\" />\n" +
			"        <Region Name=\"上杭县\" Code=\"23\" />\n" +
			"        <Region Name=\"武平县\" Code=\"24\" />\n" +
			"        <Region Name=\"连城县\" Code=\"25\" />\n" +
			"        <Region Name=\"漳平市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"宁德\" Code=\"9\">\n" +
			"        <Region Name=\"蕉城区\" Code=\"2\" />\n" +
			"        <Region Name=\"霞浦县\" Code=\"21\" />\n" +
			"        <Region Name=\"古田县\" Code=\"22\" />\n" +
			"        <Region Name=\"屏南县\" Code=\"23\" />\n" +
			"        <Region Name=\"寿宁县\" Code=\"24\" />\n" +
			"        <Region Name=\"周宁县\" Code=\"25\" />\n" +
			"        <Region Name=\"柘荣县\" Code=\"26\" />\n" +
			"        <Region Name=\"福安市\" Code=\"81\" />\n" +
			"        <Region Name=\"福鼎市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"江西\" Code=\"36\">\n" +
			"      <City Name=\"南昌\" Code=\"1\">\n" +
			"        <Region Name=\"东湖区\" Code=\"2\" />\n" +
			"        <Region Name=\"西湖区\" Code=\"3\" />\n" +
			"        <Region Name=\"青云谱区\" Code=\"4\" />\n" +
			"        <Region Name=\"湾里区\" Code=\"5\" />\n" +
			"        <Region Name=\"青山湖区\" Code=\"11\" />\n" +
			"        <Region Name=\"南昌县\" Code=\"21\" />\n" +
			"        <Region Name=\"新建县\" Code=\"22\" />\n" +
			"        <Region Name=\"安义县\" Code=\"23\" />\n" +
			"        <Region Name=\"进贤县\" Code=\"24\" />\n" +
			"      </City>\n" +
			"      <City Name=\"景德镇\" Code=\"2\">\n" +
			"        <Region Name=\"昌江区\" Code=\"2\" />\n" +
			"        <Region Name=\"珠山区\" Code=\"3\" />\n" +
			"        <Region Name=\"浮梁县\" Code=\"22\" />\n" +
			"        <Region Name=\"乐平市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"萍乡\" Code=\"3\">\n" +
			"        <Region Name=\"安源区\" Code=\"2\" />\n" +
			"        <Region Name=\"湘东区\" Code=\"13\" />\n" +
			"        <Region Name=\"莲花县\" Code=\"21\" />\n" +
			"        <Region Name=\"上栗县\" Code=\"22\" />\n" +
			"        <Region Name=\"芦溪县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"九江\" Code=\"4\">\n" +
			"        <Region Name=\"庐山区\" Code=\"2\" />\n" +
			"        <Region Name=\"浔阳区\" Code=\"3\" />\n" +
			"        <Region Name=\"九江县\" Code=\"21\" />\n" +
			"        <Region Name=\"武宁县\" Code=\"23\" />\n" +
			"        <Region Name=\"修水县\" Code=\"24\" />\n" +
			"        <Region Name=\"永修县\" Code=\"25\" />\n" +
			"        <Region Name=\"德安县\" Code=\"26\" />\n" +
			"        <Region Name=\"星子县\" Code=\"27\" />\n" +
			"        <Region Name=\"都昌县\" Code=\"28\" />\n" +
			"        <Region Name=\"湖口县\" Code=\"29\" />\n" +
			"        <Region Name=\"彭泽县\" Code=\"30\" />\n" +
			"        <Region Name=\"瑞昌市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"新余\" Code=\"5\">\n" +
			"        <Region Name=\"渝水区\" Code=\"2\" />\n" +
			"        <Region Name=\"分宜县\" Code=\"21\" />\n" +
			"      </City>\n" +
			"      <City Name=\"鹰潭\" Code=\"6\">\n" +
			"        <Region Name=\"月湖区\" Code=\"2\" />\n" +
			"        <Region Name=\"余江县\" Code=\"22\" />\n" +
			"        <Region Name=\"贵溪市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"赣州\" Code=\"7\">\n" +
			"        <Region Name=\"章贡区\" Code=\"2\" />\n" +
			"        <Region Name=\"赣　县\" Code=\"21\" />\n" +
			"        <Region Name=\"信丰县\" Code=\"22\" />\n" +
			"        <Region Name=\"大余县\" Code=\"23\" />\n" +
			"        <Region Name=\"上犹县\" Code=\"24\" />\n" +
			"        <Region Name=\"崇义县\" Code=\"25\" />\n" +
			"        <Region Name=\"安远县\" Code=\"26\" />\n" +
			"        <Region Name=\"龙南县\" Code=\"27\" />\n" +
			"        <Region Name=\"定南县\" Code=\"28\" />\n" +
			"        <Region Name=\"全南县\" Code=\"29\" />\n" +
			"        <Region Name=\"宁都县\" Code=\"30\" />\n" +
			"        <Region Name=\"于都县\" Code=\"31\" />\n" +
			"        <Region Name=\"兴国县\" Code=\"32\" />\n" +
			"        <Region Name=\"会昌县\" Code=\"33\" />\n" +
			"        <Region Name=\"寻乌县\" Code=\"34\" />\n" +
			"        <Region Name=\"石城县\" Code=\"35\" />\n" +
			"        <Region Name=\"瑞金市\" Code=\"81\" />\n" +
			"        <Region Name=\"南康市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"吉安\" Code=\"8\">\n" +
			"        <Region Name=\"吉州区\" Code=\"2\" />\n" +
			"        <Region Name=\"青原区\" Code=\"3\" />\n" +
			"        <Region Name=\"吉安县\" Code=\"21\" />\n" +
			"        <Region Name=\"吉水县\" Code=\"22\" />\n" +
			"        <Region Name=\"峡江县\" Code=\"23\" />\n" +
			"        <Region Name=\"新干县\" Code=\"24\" />\n" +
			"        <Region Name=\"永丰县\" Code=\"25\" />\n" +
			"        <Region Name=\"泰和县\" Code=\"26\" />\n" +
			"        <Region Name=\"遂川县\" Code=\"27\" />\n" +
			"        <Region Name=\"万安县\" Code=\"28\" />\n" +
			"        <Region Name=\"安福县\" Code=\"29\" />\n" +
			"        <Region Name=\"永新县\" Code=\"30\" />\n" +
			"        <Region Name=\"井冈山市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"宜春\" Code=\"9\">\n" +
			"        <Region Name=\"袁州区\" Code=\"2\" />\n" +
			"        <Region Name=\"奉新县\" Code=\"21\" />\n" +
			"        <Region Name=\"万载县\" Code=\"22\" />\n" +
			"        <Region Name=\"上高县\" Code=\"23\" />\n" +
			"        <Region Name=\"宜丰县\" Code=\"24\" />\n" +
			"        <Region Name=\"靖安县\" Code=\"25\" />\n" +
			"        <Region Name=\"铜鼓县\" Code=\"26\" />\n" +
			"        <Region Name=\"丰城市\" Code=\"81\" />\n" +
			"        <Region Name=\"樟树市\" Code=\"82\" />\n" +
			"        <Region Name=\"高安市\" Code=\"83\" />\n" +
			"      </City>\n" +
			"      <City Name=\"抚州\" Code=\"10\">\n" +
			"        <Region Name=\"临川区\" Code=\"2\" />\n" +
			"        <Region Name=\"南城县\" Code=\"21\" />\n" +
			"        <Region Name=\"黎川县\" Code=\"22\" />\n" +
			"        <Region Name=\"南丰县\" Code=\"23\" />\n" +
			"        <Region Name=\"崇仁县\" Code=\"24\" />\n" +
			"        <Region Name=\"乐安县\" Code=\"25\" />\n" +
			"        <Region Name=\"宜黄县\" Code=\"26\" />\n" +
			"        <Region Name=\"金溪县\" Code=\"27\" />\n" +
			"        <Region Name=\"资溪县\" Code=\"28\" />\n" +
			"        <Region Name=\"东乡县\" Code=\"29\" />\n" +
			"        <Region Name=\"广昌县\" Code=\"30\" />\n" +
			"      </City>\n" +
			"      <City Name=\"上饶\" Code=\"11\">\n" +
			"        <Region Name=\"信州区\" Code=\"2\" />\n" +
			"        <Region Name=\"上饶县\" Code=\"21\" />\n" +
			"        <Region Name=\"广丰县\" Code=\"22\" />\n" +
			"        <Region Name=\"玉山县\" Code=\"23\" />\n" +
			"        <Region Name=\"铅山县\" Code=\"24\" />\n" +
			"        <Region Name=\"横峰县\" Code=\"25\" />\n" +
			"        <Region Name=\"弋阳县\" Code=\"26\" />\n" +
			"        <Region Name=\"余干县\" Code=\"27\" />\n" +
			"        <Region Name=\"鄱阳县\" Code=\"28\" />\n" +
			"        <Region Name=\"万年县\" Code=\"29\" />\n" +
			"        <Region Name=\"婺源县\" Code=\"30\" />\n" +
			"        <Region Name=\"德兴市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"山东\" Code=\"37\">\n" +
			"      <City Name=\"济南\" Code=\"1\">\n" +
			"        <Region Name=\"历下区\" Code=\"2\" />\n" +
			"        <Region Name=\"市中区\" Code=\"3\" />\n" +
			"        <Region Name=\"槐荫区\" Code=\"4\" />\n" +
			"        <Region Name=\"天桥区\" Code=\"5\" />\n" +
			"        <Region Name=\"历城区\" Code=\"12\" />\n" +
			"        <Region Name=\"长清区\" Code=\"13\" />\n" +
			"        <Region Name=\"平阴县\" Code=\"24\" />\n" +
			"        <Region Name=\"济阳县\" Code=\"25\" />\n" +
			"        <Region Name=\"商河县\" Code=\"26\" />\n" +
			"        <Region Name=\"章丘市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"青岛\" Code=\"2\">\n" +
			"        <Region Name=\"市南区\" Code=\"2\" />\n" +
			"        <Region Name=\"市北区\" Code=\"3\" />\n" +
			"        <Region Name=\"四方区\" Code=\"5\" />\n" +
			"        <Region Name=\"黄岛区\" Code=\"11\" />\n" +
			"        <Region Name=\"崂山区\" Code=\"12\" />\n" +
			"        <Region Name=\"李沧区\" Code=\"13\" />\n" +
			"        <Region Name=\"城阳区\" Code=\"14\" />\n" +
			"        <Region Name=\"胶州市\" Code=\"81\" />\n" +
			"        <Region Name=\"即墨市\" Code=\"82\" />\n" +
			"        <Region Name=\"平度市\" Code=\"83\" />\n" +
			"        <Region Name=\"胶南市\" Code=\"84\" />\n" +
			"        <Region Name=\"莱西市\" Code=\"85\" />\n" +
			"      </City>\n" +
			"      <City Name=\"淄博\" Code=\"3\">\n" +
			"        <Region Name=\"淄川区\" Code=\"2\" />\n" +
			"        <Region Name=\"张店区\" Code=\"3\" />\n" +
			"        <Region Name=\"博山区\" Code=\"4\" />\n" +
			"        <Region Name=\"临淄区\" Code=\"5\" />\n" +
			"        <Region Name=\"周村区\" Code=\"6\" />\n" +
			"        <Region Name=\"桓台县\" Code=\"21\" />\n" +
			"        <Region Name=\"高青县\" Code=\"22\" />\n" +
			"        <Region Name=\"沂源县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"枣庄\" Code=\"4\">\n" +
			"        <Region Name=\"市中区\" Code=\"2\" />\n" +
			"        <Region Name=\"薛城区\" Code=\"3\" />\n" +
			"        <Region Name=\"峄城区\" Code=\"4\" />\n" +
			"        <Region Name=\"台儿庄区\" Code=\"5\" />\n" +
			"        <Region Name=\"山亭区\" Code=\"6\" />\n" +
			"        <Region Name=\"滕州市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"东营\" Code=\"5\">\n" +
			"        <Region Name=\"东营区\" Code=\"2\" />\n" +
			"        <Region Name=\"河口区\" Code=\"3\" />\n" +
			"        <Region Name=\"垦利县\" Code=\"21\" />\n" +
			"        <Region Name=\"利津县\" Code=\"22\" />\n" +
			"        <Region Name=\"广饶县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"烟台\" Code=\"6\">\n" +
			"        <Region Name=\"芝罘区\" Code=\"2\" />\n" +
			"        <Region Name=\"福山区\" Code=\"11\" />\n" +
			"        <Region Name=\"牟平区\" Code=\"12\" />\n" +
			"        <Region Name=\"莱山区\" Code=\"13\" />\n" +
			"        <Region Name=\"长岛县\" Code=\"34\" />\n" +
			"        <Region Name=\"龙口市\" Code=\"81\" />\n" +
			"        <Region Name=\"莱阳市\" Code=\"82\" />\n" +
			"        <Region Name=\"莱州市\" Code=\"83\" />\n" +
			"        <Region Name=\"蓬莱市\" Code=\"84\" />\n" +
			"        <Region Name=\"招远市\" Code=\"85\" />\n" +
			"        <Region Name=\"栖霞市\" Code=\"86\" />\n" +
			"        <Region Name=\"海阳市\" Code=\"87\" />\n" +
			"      </City>\n" +
			"      <City Name=\"潍坊\" Code=\"7\">\n" +
			"        <Region Name=\"潍城区\" Code=\"2\" />\n" +
			"        <Region Name=\"寒亭区\" Code=\"3\" />\n" +
			"        <Region Name=\"坊子区\" Code=\"4\" />\n" +
			"        <Region Name=\"奎文区\" Code=\"5\" />\n" +
			"        <Region Name=\"临朐县\" Code=\"24\" />\n" +
			"        <Region Name=\"昌乐县\" Code=\"25\" />\n" +
			"        <Region Name=\"青州市\" Code=\"81\" />\n" +
			"        <Region Name=\"诸城市\" Code=\"82\" />\n" +
			"        <Region Name=\"寿光市\" Code=\"83\" />\n" +
			"        <Region Name=\"安丘市\" Code=\"84\" />\n" +
			"        <Region Name=\"高密市\" Code=\"85\" />\n" +
			"        <Region Name=\"昌邑市\" Code=\"86\" />\n" +
			"      </City>\n" +
			"      <City Name=\"济宁\" Code=\"8\">\n" +
			"        <Region Name=\"市中区\" Code=\"2\" />\n" +
			"        <Region Name=\"任城区\" Code=\"11\" />\n" +
			"        <Region Name=\"微山县\" Code=\"26\" />\n" +
			"        <Region Name=\"鱼台县\" Code=\"27\" />\n" +
			"        <Region Name=\"金乡县\" Code=\"28\" />\n" +
			"        <Region Name=\"嘉祥县\" Code=\"29\" />\n" +
			"        <Region Name=\"汶上县\" Code=\"30\" />\n" +
			"        <Region Name=\"泗水县\" Code=\"31\" />\n" +
			"        <Region Name=\"梁山县\" Code=\"32\" />\n" +
			"        <Region Name=\"曲阜市\" Code=\"81\" />\n" +
			"        <Region Name=\"兖州市\" Code=\"82\" />\n" +
			"        <Region Name=\"邹城市\" Code=\"83\" />\n" +
			"      </City>\n" +
			"      <City Name=\"泰安\" Code=\"9\">\n" +
			"        <Region Name=\"泰山区\" Code=\"2\" />\n" +
			"        <Region Name=\"岱岳区\" Code=\"11\" />\n" +
			"        <Region Name=\"宁阳县\" Code=\"21\" />\n" +
			"        <Region Name=\"东平县\" Code=\"23\" />\n" +
			"        <Region Name=\"新泰市\" Code=\"82\" />\n" +
			"        <Region Name=\"肥城市\" Code=\"83\" />\n" +
			"      </City>\n" +
			"      <City Name=\"威海\" Code=\"10\">\n" +
			"        <Region Name=\"环翠区\" Code=\"2\" />\n" +
			"        <Region Name=\"文登市\" Code=\"81\" />\n" +
			"        <Region Name=\"荣成市\" Code=\"82\" />\n" +
			"        <Region Name=\"乳山市\" Code=\"83\" />\n" +
			"      </City>\n" +
			"      <City Name=\"日照\" Code=\"11\">\n" +
			"        <Region Name=\"东港区\" Code=\"2\" />\n" +
			"        <Region Name=\"岚山区\" Code=\"3\" />\n" +
			"        <Region Name=\"五莲县\" Code=\"21\" />\n" +
			"        <Region Name=\"莒　县\" Code=\"22\" />\n" +
			"      </City>\n" +
			"      <City Name=\"莱芜\" Code=\"12\">\n" +
			"        <Region Name=\"莱城区\" Code=\"2\" />\n" +
			"        <Region Name=\"钢城区\" Code=\"3\" />\n" +
			"      </City>\n" +
			"      <City Name=\"临沂\" Code=\"13\">\n" +
			"        <Region Name=\"兰山区\" Code=\"2\" />\n" +
			"        <Region Name=\"罗庄区\" Code=\"11\" />\n" +
			"        <Region Name=\"河东区\" Code=\"12\" />\n" +
			"        <Region Name=\"沂南县\" Code=\"21\" />\n" +
			"        <Region Name=\"郯城县\" Code=\"22\" />\n" +
			"        <Region Name=\"沂水县\" Code=\"23\" />\n" +
			"        <Region Name=\"苍山县\" Code=\"24\" />\n" +
			"        <Region Name=\"费　县\" Code=\"25\" />\n" +
			"        <Region Name=\"平邑县\" Code=\"26\" />\n" +
			"        <Region Name=\"莒南县\" Code=\"27\" />\n" +
			"        <Region Name=\"蒙阴县\" Code=\"28\" />\n" +
			"        <Region Name=\"临沭县\" Code=\"29\" />\n" +
			"      </City>\n" +
			"      <City Name=\"德州\" Code=\"14\">\n" +
			"        <Region Name=\"德城区\" Code=\"2\" />\n" +
			"        <Region Name=\"陵　县\" Code=\"21\" />\n" +
			"        <Region Name=\"宁津县\" Code=\"22\" />\n" +
			"        <Region Name=\"庆云县\" Code=\"23\" />\n" +
			"        <Region Name=\"临邑县\" Code=\"24\" />\n" +
			"        <Region Name=\"齐河县\" Code=\"25\" />\n" +
			"        <Region Name=\"平原县\" Code=\"26\" />\n" +
			"        <Region Name=\"夏津县\" Code=\"27\" />\n" +
			"        <Region Name=\"武城县\" Code=\"28\" />\n" +
			"        <Region Name=\"乐陵市\" Code=\"81\" />\n" +
			"        <Region Name=\"禹城市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"聊城\" Code=\"15\">\n" +
			"        <Region Name=\"东昌府区\" Code=\"2\" />\n" +
			"        <Region Name=\"阳谷县\" Code=\"21\" />\n" +
			"        <Region Name=\"莘　县\" Code=\"22\" />\n" +
			"        <Region Name=\"茌平县\" Code=\"23\" />\n" +
			"        <Region Name=\"东阿县\" Code=\"24\" />\n" +
			"        <Region Name=\"冠　县\" Code=\"25\" />\n" +
			"        <Region Name=\"高唐县\" Code=\"26\" />\n" +
			"        <Region Name=\"临清市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"滨州\" Code=\"16\">\n" +
			"        <Region Name=\"滨城区\" Code=\"2\" />\n" +
			"        <Region Name=\"惠民县\" Code=\"21\" />\n" +
			"        <Region Name=\"阳信县\" Code=\"22\" />\n" +
			"        <Region Name=\"无棣县\" Code=\"23\" />\n" +
			"        <Region Name=\"沾化县\" Code=\"24\" />\n" +
			"        <Region Name=\"博兴县\" Code=\"25\" />\n" +
			"        <Region Name=\"邹平县\" Code=\"26\" />\n" +
			"      </City>\n" +
			"      <City Name=\"菏泽\" Code=\"17\">\n" +
			"        <Region Name=\"牡丹区\" Code=\"2\" />\n" +
			"        <Region Name=\"曹　县\" Code=\"21\" />\n" +
			"        <Region Name=\"单　县\" Code=\"22\" />\n" +
			"        <Region Name=\"成武县\" Code=\"23\" />\n" +
			"        <Region Name=\"巨野县\" Code=\"24\" />\n" +
			"        <Region Name=\"郓城县\" Code=\"25\" />\n" +
			"        <Region Name=\"鄄城县\" Code=\"26\" />\n" +
			"        <Region Name=\"定陶县\" Code=\"27\" />\n" +
			"        <Region Name=\"东明县\" Code=\"28\" />\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"河南\" Code=\"41\">\n" +
			"      <City Name=\"郑州\" Code=\"1\">\n" +
			"        <Region Name=\"中原区\" Code=\"2\" />\n" +
			"        <Region Name=\"二七区\" Code=\"3\" />\n" +
			"        <Region Name=\"管城回族区\" Code=\"4\" />\n" +
			"        <Region Name=\"金水区\" Code=\"5\" />\n" +
			"        <Region Name=\"上街区\" Code=\"6\" />\n" +
			"        <Region Name=\"惠济区\" Code=\"8\" />\n" +
			"        <Region Name=\"中牟县\" Code=\"22\" />\n" +
			"        <Region Name=\"巩义市\" Code=\"81\" />\n" +
			"        <Region Name=\"荥阳市\" Code=\"82\" />\n" +
			"        <Region Name=\"新密市\" Code=\"83\" />\n" +
			"        <Region Name=\"新郑市\" Code=\"84\" />\n" +
			"        <Region Name=\"登封市\" Code=\"85\" />\n" +
			"      </City>\n" +
			"      <City Name=\"开封\" Code=\"2\">\n" +
			"        <Region Name=\"龙亭区\" Code=\"2\" />\n" +
			"        <Region Name=\"顺河回族区\" Code=\"3\" />\n" +
			"        <Region Name=\"鼓楼区\" Code=\"4\" />\n" +
			"        <Region Name=\"禹王台区\" Code=\"5\" />\n" +
			"        <Region Name=\"金明区\" Code=\"11\" />\n" +
			"        <Region Name=\"杞　县\" Code=\"21\" />\n" +
			"        <Region Name=\"通许县\" Code=\"22\" />\n" +
			"        <Region Name=\"尉氏县\" Code=\"23\" />\n" +
			"        <Region Name=\"开封县\" Code=\"24\" />\n" +
			"        <Region Name=\"兰考县\" Code=\"25\" />\n" +
			"      </City>\n" +
			"      <City Name=\"洛阳\" Code=\"3\">\n" +
			"        <Region Name=\"老城区\" Code=\"2\" />\n" +
			"        <Region Name=\"西工区\" Code=\"3\" />\n" +
			"        <Region Name=\"瀍河回族区\" Code=\"4\" />\n" +
			"        <Region Name=\"涧西区\" Code=\"5\" />\n" +
			"        <Region Name=\"吉利区\" Code=\"6\" />\n" +
			"        <Region Name=\"洛龙区\" Code=\"11\" />\n" +
			"        <Region Name=\"孟津县\" Code=\"22\" />\n" +
			"        <Region Name=\"新安县\" Code=\"23\" />\n" +
			"        <Region Name=\"栾川县\" Code=\"24\" />\n" +
			"        <Region Name=\"嵩　县\" Code=\"25\" />\n" +
			"        <Region Name=\"汝阳县\" Code=\"26\" />\n" +
			"        <Region Name=\"宜阳县\" Code=\"27\" />\n" +
			"        <Region Name=\"洛宁县\" Code=\"28\" />\n" +
			"        <Region Name=\"伊川县\" Code=\"29\" />\n" +
			"        <Region Name=\"偃师市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"平顶山\" Code=\"4\">\n" +
			"        <Region Name=\"新华区\" Code=\"2\" />\n" +
			"        <Region Name=\"卫东区\" Code=\"3\" />\n" +
			"        <Region Name=\"石龙区\" Code=\"4\" />\n" +
			"        <Region Name=\"湛河区\" Code=\"11\" />\n" +
			"        <Region Name=\"宝丰县\" Code=\"21\" />\n" +
			"        <Region Name=\"叶　县\" Code=\"22\" />\n" +
			"        <Region Name=\"鲁山县\" Code=\"23\" />\n" +
			"        <Region Name=\"郏　县\" Code=\"25\" />\n" +
			"        <Region Name=\"舞钢市\" Code=\"81\" />\n" +
			"        <Region Name=\"汝州市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"安阳\" Code=\"5\">\n" +
			"        <Region Name=\"文峰区\" Code=\"2\" />\n" +
			"        <Region Name=\"北关区\" Code=\"3\" />\n" +
			"        <Region Name=\"殷都区\" Code=\"5\" />\n" +
			"        <Region Name=\"龙安区\" Code=\"6\" />\n" +
			"        <Region Name=\"安阳县\" Code=\"22\" />\n" +
			"        <Region Name=\"汤阴县\" Code=\"23\" />\n" +
			"        <Region Name=\"滑　县\" Code=\"26\" />\n" +
			"        <Region Name=\"内黄县\" Code=\"27\" />\n" +
			"        <Region Name=\"林州市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"鹤壁\" Code=\"6\">\n" +
			"        <Region Name=\"鹤山区\" Code=\"2\" />\n" +
			"        <Region Name=\"山城区\" Code=\"3\" />\n" +
			"        <Region Name=\"淇滨区\" Code=\"11\" />\n" +
			"        <Region Name=\"浚　县\" Code=\"21\" />\n" +
			"        <Region Name=\"淇　县\" Code=\"22\" />\n" +
			"      </City>\n" +
			"      <City Name=\"新乡\" Code=\"7\">\n" +
			"        <Region Name=\"红旗区\" Code=\"2\" />\n" +
			"        <Region Name=\"卫滨区\" Code=\"3\" />\n" +
			"        <Region Name=\"凤泉区\" Code=\"4\" />\n" +
			"        <Region Name=\"牧野区\" Code=\"11\" />\n" +
			"        <Region Name=\"新乡县\" Code=\"21\" />\n" +
			"        <Region Name=\"获嘉县\" Code=\"24\" />\n" +
			"        <Region Name=\"原阳县\" Code=\"25\" />\n" +
			"        <Region Name=\"延津县\" Code=\"26\" />\n" +
			"        <Region Name=\"封丘县\" Code=\"27\" />\n" +
			"        <Region Name=\"长垣县\" Code=\"28\" />\n" +
			"        <Region Name=\"卫辉市\" Code=\"81\" />\n" +
			"        <Region Name=\"辉县市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"焦作\" Code=\"8\">\n" +
			"        <Region Name=\"解放区\" Code=\"2\" />\n" +
			"        <Region Name=\"中站区\" Code=\"3\" />\n" +
			"        <Region Name=\"马村区\" Code=\"4\" />\n" +
			"        <Region Name=\"山阳区\" Code=\"11\" />\n" +
			"        <Region Name=\"修武县\" Code=\"21\" />\n" +
			"        <Region Name=\"博爱县\" Code=\"22\" />\n" +
			"        <Region Name=\"武陟县\" Code=\"23\" />\n" +
			"        <Region Name=\"温　县\" Code=\"25\" />\n" +
			"        <Region Name=\"沁阳市\" Code=\"82\" />\n" +
			"        <Region Name=\"孟州市\" Code=\"83\" />\n" +
			"      </City>\n" +
			"      <City Name=\"濮阳\" Code=\"9\">\n" +
			"        <Region Name=\"华龙区\" Code=\"2\" />\n" +
			"        <Region Name=\"清丰县\" Code=\"22\" />\n" +
			"        <Region Name=\"南乐县\" Code=\"23\" />\n" +
			"        <Region Name=\"范　县\" Code=\"26\" />\n" +
			"        <Region Name=\"台前县\" Code=\"27\" />\n" +
			"        <Region Name=\"濮阳县\" Code=\"28\" />\n" +
			"      </City>\n" +
			"      <City Name=\"许昌\" Code=\"10\">\n" +
			"        <Region Name=\"魏都区\" Code=\"2\" />\n" +
			"        <Region Name=\"许昌县\" Code=\"23\" />\n" +
			"        <Region Name=\"鄢陵县\" Code=\"24\" />\n" +
			"        <Region Name=\"襄城县\" Code=\"25\" />\n" +
			"        <Region Name=\"禹州市\" Code=\"81\" />\n" +
			"        <Region Name=\"长葛市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"漯河\" Code=\"11\">\n" +
			"        <Region Name=\"源汇区\" Code=\"2\" />\n" +
			"        <Region Name=\"郾城区\" Code=\"3\" />\n" +
			"        <Region Name=\"召陵区\" Code=\"4\" />\n" +
			"        <Region Name=\"舞阳县\" Code=\"21\" />\n" +
			"        <Region Name=\"临颍县\" Code=\"22\" />\n" +
			"      </City>\n" +
			"      <City Name=\"三门峡\" Code=\"12\">\n" +
			"        <Region Name=\"湖滨区\" Code=\"2\" />\n" +
			"        <Region Name=\"渑池县\" Code=\"21\" />\n" +
			"        <Region Name=\"陕　县\" Code=\"22\" />\n" +
			"        <Region Name=\"卢氏县\" Code=\"24\" />\n" +
			"        <Region Name=\"义马市\" Code=\"81\" />\n" +
			"        <Region Name=\"灵宝市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"南阳\" Code=\"13\">\n" +
			"        <Region Name=\"宛城区\" Code=\"2\" />\n" +
			"        <Region Name=\"卧龙区\" Code=\"3\" />\n" +
			"        <Region Name=\"南召县\" Code=\"21\" />\n" +
			"        <Region Name=\"方城县\" Code=\"22\" />\n" +
			"        <Region Name=\"西峡县\" Code=\"23\" />\n" +
			"        <Region Name=\"镇平县\" Code=\"24\" />\n" +
			"        <Region Name=\"内乡县\" Code=\"25\" />\n" +
			"        <Region Name=\"淅川县\" Code=\"26\" />\n" +
			"        <Region Name=\"社旗县\" Code=\"27\" />\n" +
			"        <Region Name=\"唐河县\" Code=\"28\" />\n" +
			"        <Region Name=\"新野县\" Code=\"29\" />\n" +
			"        <Region Name=\"桐柏县\" Code=\"30\" />\n" +
			"        <Region Name=\"邓州市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"商丘\" Code=\"14\">\n" +
			"        <Region Name=\"梁园区\" Code=\"2\" />\n" +
			"        <Region Name=\"睢阳区\" Code=\"3\" />\n" +
			"        <Region Name=\"民权县\" Code=\"21\" />\n" +
			"        <Region Name=\"睢　县\" Code=\"22\" />\n" +
			"        <Region Name=\"宁陵县\" Code=\"23\" />\n" +
			"        <Region Name=\"柘城县\" Code=\"24\" />\n" +
			"        <Region Name=\"虞城县\" Code=\"25\" />\n" +
			"        <Region Name=\"夏邑县\" Code=\"26\" />\n" +
			"        <Region Name=\"永城市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"信阳\" Code=\"15\">\n" +
			"        <Region Name=\"浉河区\" Code=\"2\" />\n" +
			"        <Region Name=\"平桥区\" Code=\"3\" />\n" +
			"        <Region Name=\"罗山县\" Code=\"21\" />\n" +
			"        <Region Name=\"光山县\" Code=\"22\" />\n" +
			"        <Region Name=\"新　县\" Code=\"23\" />\n" +
			"        <Region Name=\"商城县\" Code=\"24\" />\n" +
			"        <Region Name=\"固始县\" Code=\"25\" />\n" +
			"        <Region Name=\"潢川县\" Code=\"26\" />\n" +
			"        <Region Name=\"淮滨县\" Code=\"27\" />\n" +
			"        <Region Name=\"息　县\" Code=\"28\" />\n" +
			"      </City>\n" +
			"      <City Name=\"周口\" Code=\"16\">\n" +
			"        <Region Name=\"川汇区\" Code=\"2\" />\n" +
			"        <Region Name=\"扶沟县\" Code=\"21\" />\n" +
			"        <Region Name=\"西华县\" Code=\"22\" />\n" +
			"        <Region Name=\"商水县\" Code=\"23\" />\n" +
			"        <Region Name=\"沈丘县\" Code=\"24\" />\n" +
			"        <Region Name=\"郸城县\" Code=\"25\" />\n" +
			"        <Region Name=\"淮阳县\" Code=\"26\" />\n" +
			"        <Region Name=\"太康县\" Code=\"27\" />\n" +
			"        <Region Name=\"鹿邑县\" Code=\"28\" />\n" +
			"        <Region Name=\"项城市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"驻马店\" Code=\"17\">\n" +
			"        <Region Name=\"驿城区\" Code=\"2\" />\n" +
			"        <Region Name=\"西平县\" Code=\"21\" />\n" +
			"        <Region Name=\"上蔡县\" Code=\"22\" />\n" +
			"        <Region Name=\"平舆县\" Code=\"23\" />\n" +
			"        <Region Name=\"正阳县\" Code=\"24\" />\n" +
			"        <Region Name=\"确山县\" Code=\"25\" />\n" +
			"        <Region Name=\"泌阳县\" Code=\"26\" />\n" +
			"        <Region Name=\"汝南县\" Code=\"27\" />\n" +
			"        <Region Name=\"遂平县\" Code=\"28\" />\n" +
			"        <Region Name=\"新蔡县\" Code=\"29\" />\n" +
			"      </City>\n" +
			"      <City Name=\"济源\" Code=\"18\" />\n" +
			"    </State>\n" +
			"    <State Name=\"湖北\" Code=\"42\">\n" +
			"      <City Name=\"武汉\" Code=\"1\">\n" +
			"        <Region Name=\"江岸区\" Code=\"2\" />\n" +
			"        <Region Name=\"江汉区\" Code=\"3\" />\n" +
			"        <Region Name=\"硚口区\" Code=\"4\" />\n" +
			"        <Region Name=\"汉阳区\" Code=\"5\" />\n" +
			"        <Region Name=\"武昌区\" Code=\"6\" />\n" +
			"        <Region Name=\"青山区\" Code=\"7\" />\n" +
			"        <Region Name=\"洪山区\" Code=\"11\" />\n" +
			"        <Region Name=\"东西湖区\" Code=\"12\" />\n" +
			"        <Region Name=\"汉南区\" Code=\"13\" />\n" +
			"        <Region Name=\"蔡甸区\" Code=\"14\" />\n" +
			"        <Region Name=\"江夏区\" Code=\"15\" />\n" +
			"        <Region Name=\"黄陂区\" Code=\"16\" />\n" +
			"        <Region Name=\"新洲区\" Code=\"17\" />\n" +
			"      </City>\n" +
			"      <City Name=\"黄石\" Code=\"2\">\n" +
			"        <Region Name=\"黄石港区\" Code=\"2\" />\n" +
			"        <Region Name=\"西塞山区\" Code=\"3\" />\n" +
			"        <Region Name=\"下陆区\" Code=\"4\" />\n" +
			"        <Region Name=\"铁山区\" Code=\"5\" />\n" +
			"        <Region Name=\"阳新县\" Code=\"22\" />\n" +
			"        <Region Name=\"大冶市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"十堰\" Code=\"3\">\n" +
			"        <Region Name=\"茅箭区\" Code=\"2\" />\n" +
			"        <Region Name=\"张湾区\" Code=\"3\" />\n" +
			"        <Region Name=\"郧　县\" Code=\"21\" />\n" +
			"        <Region Name=\"郧西县\" Code=\"22\" />\n" +
			"        <Region Name=\"竹山县\" Code=\"23\" />\n" +
			"        <Region Name=\"竹溪县\" Code=\"24\" />\n" +
			"        <Region Name=\"房　县\" Code=\"25\" />\n" +
			"        <Region Name=\"丹江口市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"宜昌\" Code=\"5\">\n" +
			"        <Region Name=\"西陵区\" Code=\"2\" />\n" +
			"        <Region Name=\"伍家岗区\" Code=\"3\" />\n" +
			"        <Region Name=\"点军区\" Code=\"4\" />\n" +
			"        <Region Name=\"猇亭区\" Code=\"5\" />\n" +
			"        <Region Name=\"夷陵区\" Code=\"6\" />\n" +
			"        <Region Name=\"远安县\" Code=\"25\" />\n" +
			"        <Region Name=\"兴山县\" Code=\"26\" />\n" +
			"        <Region Name=\"秭归县\" Code=\"27\" />\n" +
			"        <Region Name=\"长阳土家族自治县\" Code=\"28\" />\n" +
			"        <Region Name=\"五峰土家族自治县\" Code=\"29\" />\n" +
			"        <Region Name=\"宜都市\" Code=\"81\" />\n" +
			"        <Region Name=\"当阳市\" Code=\"82\" />\n" +
			"        <Region Name=\"枝江市\" Code=\"83\" />\n" +
			"      </City>\n" +
			"      <City Name=\"襄阳\" Code=\"6\">\n" +
			"        <Region Name=\"襄城区\" Code=\"2\" />\n" +
			"        <Region Name=\"樊城区\" Code=\"6\" />\n" +
			"        <Region Name=\"襄州区\" Code=\"7\" />\n" +
			"        <Region Name=\"南漳县\" Code=\"24\" />\n" +
			"        <Region Name=\"谷城县\" Code=\"25\" />\n" +
			"        <Region Name=\"保康县\" Code=\"26\" />\n" +
			"        <Region Name=\"老河口市\" Code=\"82\" />\n" +
			"        <Region Name=\"枣阳市\" Code=\"83\" />\n" +
			"        <Region Name=\"宜城市\" Code=\"84\" />\n" +
			"      </City>\n" +
			"      <City Name=\"鄂州\" Code=\"7\">\n" +
			"        <Region Name=\"梁子湖区\" Code=\"2\" />\n" +
			"        <Region Name=\"华容区\" Code=\"3\" />\n" +
			"        <Region Name=\"鄂城区\" Code=\"4\" />\n" +
			"      </City>\n" +
			"      <City Name=\"荆门\" Code=\"8\">\n" +
			"        <Region Name=\"东宝区\" Code=\"2\" />\n" +
			"        <Region Name=\"掇刀区\" Code=\"4\" />\n" +
			"        <Region Name=\"京山县\" Code=\"21\" />\n" +
			"        <Region Name=\"沙洋县\" Code=\"22\" />\n" +
			"        <Region Name=\"钟祥市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"孝感\" Code=\"9\">\n" +
			"        <Region Name=\"孝南区\" Code=\"2\" />\n" +
			"        <Region Name=\"孝昌县\" Code=\"21\" />\n" +
			"        <Region Name=\"大悟县\" Code=\"22\" />\n" +
			"        <Region Name=\"云梦县\" Code=\"23\" />\n" +
			"        <Region Name=\"应城市\" Code=\"81\" />\n" +
			"        <Region Name=\"安陆市\" Code=\"82\" />\n" +
			"        <Region Name=\"汉川市\" Code=\"84\" />\n" +
			"      </City>\n" +
			"      <City Name=\"荆州\" Code=\"10\">\n" +
			"        <Region Name=\"沙市区\" Code=\"2\" />\n" +
			"        <Region Name=\"荆州区\" Code=\"3\" />\n" +
			"        <Region Name=\"公安县\" Code=\"22\" />\n" +
			"        <Region Name=\"监利县\" Code=\"23\" />\n" +
			"        <Region Name=\"江陵县\" Code=\"24\" />\n" +
			"        <Region Name=\"石首市\" Code=\"81\" />\n" +
			"        <Region Name=\"洪湖市\" Code=\"83\" />\n" +
			"        <Region Name=\"松滋市\" Code=\"87\" />\n" +
			"      </City>\n" +
			"      <City Name=\"黄冈\" Code=\"11\">\n" +
			"        <Region Name=\"黄州区\" Code=\"2\" />\n" +
			"        <Region Name=\"团风县\" Code=\"21\" />\n" +
			"        <Region Name=\"红安县\" Code=\"22\" />\n" +
			"        <Region Name=\"罗田县\" Code=\"23\" />\n" +
			"        <Region Name=\"英山县\" Code=\"24\" />\n" +
			"        <Region Name=\"浠水县\" Code=\"25\" />\n" +
			"        <Region Name=\"蕲春县\" Code=\"26\" />\n" +
			"        <Region Name=\"黄梅县\" Code=\"27\" />\n" +
			"        <Region Name=\"麻城市\" Code=\"81\" />\n" +
			"        <Region Name=\"武穴市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"咸宁\" Code=\"12\">\n" +
			"        <Region Name=\"咸安区\" Code=\"2\" />\n" +
			"        <Region Name=\"嘉鱼县\" Code=\"21\" />\n" +
			"        <Region Name=\"通城县\" Code=\"22\" />\n" +
			"        <Region Name=\"崇阳县\" Code=\"23\" />\n" +
			"        <Region Name=\"通山县\" Code=\"24\" />\n" +
			"        <Region Name=\"赤壁市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"随州\" Code=\"13\">\n" +
			"        <Region Name=\"曾都区\" Code=\"2\" />\n" +
			"        <Region Name=\"随县\" Code=\"21\" />\n" +
			"        <Region Name=\"广水市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"恩施\" Code=\"28\">\n" +
			"        <Region Name=\"恩施市\" Code=\"1\" />\n" +
			"        <Region Name=\"利川市\" Code=\"2\" />\n" +
			"        <Region Name=\"建始县\" Code=\"22\" />\n" +
			"        <Region Name=\"巴东县\" Code=\"23\" />\n" +
			"        <Region Name=\"宣恩县\" Code=\"25\" />\n" +
			"        <Region Name=\"咸丰县\" Code=\"26\" />\n" +
			"        <Region Name=\"来凤县\" Code=\"27\" />\n" +
			"        <Region Name=\"鹤峰县\" Code=\"28\" />\n" +
			"      </City>\n" +
			"      <City Name=\"仙桃\" Code=\"94\" />\n" +
			"      <City Name=\"潜江\" Code=\"95\" />\n" +
			"      <City Name=\"天门\" Code=\"96\" />\n" +
			"      <City Name=\"神农架\" Code=\"A21\" />\n" +
			"    </State>\n" +
			"    <State Name=\"湖南\" Code=\"43\">\n" +
			"      <City Name=\"长沙\" Code=\"1\">\n" +
			"        <Region Name=\"芙蓉区\" Code=\"2\" />\n" +
			"        <Region Name=\"天心区\" Code=\"3\" />\n" +
			"        <Region Name=\"岳麓区\" Code=\"4\" />\n" +
			"        <Region Name=\"开福区\" Code=\"5\" />\n" +
			"        <Region Name=\"雨花区\" Code=\"11\" />\n" +
			"        <Region Name=\"长沙县\" Code=\"21\" />\n" +
			"        <Region Name=\"望城区\" Code=\"22\" />\n" +
			"        <Region Name=\"宁乡县\" Code=\"24\" />\n" +
			"        <Region Name=\"浏阳市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"株洲\" Code=\"2\">\n" +
			"        <Region Name=\"荷塘区\" Code=\"2\" />\n" +
			"        <Region Name=\"芦淞区\" Code=\"3\" />\n" +
			"        <Region Name=\"石峰区\" Code=\"4\" />\n" +
			"        <Region Name=\"天元区\" Code=\"11\" />\n" +
			"        <Region Name=\"株洲县\" Code=\"21\" />\n" +
			"        <Region Name=\"攸　县\" Code=\"23\" />\n" +
			"        <Region Name=\"茶陵县\" Code=\"24\" />\n" +
			"        <Region Name=\"炎陵县\" Code=\"25\" />\n" +
			"        <Region Name=\"醴陵市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"湘潭\" Code=\"3\">\n" +
			"        <Region Name=\"雨湖区\" Code=\"2\" />\n" +
			"        <Region Name=\"岳塘区\" Code=\"4\" />\n" +
			"        <Region Name=\"湘潭县\" Code=\"21\" />\n" +
			"        <Region Name=\"湘乡市\" Code=\"81\" />\n" +
			"        <Region Name=\"韶山市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"衡阳\" Code=\"4\">\n" +
			"        <Region Name=\"珠晖区\" Code=\"5\" />\n" +
			"        <Region Name=\"雁峰区\" Code=\"6\" />\n" +
			"        <Region Name=\"石鼓区\" Code=\"7\" />\n" +
			"        <Region Name=\"蒸湘区\" Code=\"8\" />\n" +
			"        <Region Name=\"南岳区\" Code=\"12\" />\n" +
			"        <Region Name=\"衡阳县\" Code=\"21\" />\n" +
			"        <Region Name=\"衡南县\" Code=\"22\" />\n" +
			"        <Region Name=\"衡山县\" Code=\"23\" />\n" +
			"        <Region Name=\"衡东县\" Code=\"24\" />\n" +
			"        <Region Name=\"祁东县\" Code=\"26\" />\n" +
			"        <Region Name=\"耒阳市\" Code=\"81\" />\n" +
			"        <Region Name=\"常宁市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"邵阳\" Code=\"5\">\n" +
			"        <Region Name=\"双清区\" Code=\"2\" />\n" +
			"        <Region Name=\"大祥区\" Code=\"3\" />\n" +
			"        <Region Name=\"北塔区\" Code=\"11\" />\n" +
			"        <Region Name=\"邵东县\" Code=\"21\" />\n" +
			"        <Region Name=\"新邵县\" Code=\"22\" />\n" +
			"        <Region Name=\"邵阳县\" Code=\"23\" />\n" +
			"        <Region Name=\"隆回县\" Code=\"24\" />\n" +
			"        <Region Name=\"洞口县\" Code=\"25\" />\n" +
			"        <Region Name=\"绥宁县\" Code=\"27\" />\n" +
			"        <Region Name=\"新宁县\" Code=\"28\" />\n" +
			"        <Region Name=\"城步苗族自治县\" Code=\"29\" />\n" +
			"        <Region Name=\"武冈市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"岳阳\" Code=\"6\">\n" +
			"        <Region Name=\"岳阳楼区\" Code=\"2\" />\n" +
			"        <Region Name=\"云溪区\" Code=\"3\" />\n" +
			"        <Region Name=\"君山区\" Code=\"11\" />\n" +
			"        <Region Name=\"岳阳县\" Code=\"21\" />\n" +
			"        <Region Name=\"华容县\" Code=\"23\" />\n" +
			"        <Region Name=\"湘阴县\" Code=\"24\" />\n" +
			"        <Region Name=\"平江县\" Code=\"26\" />\n" +
			"        <Region Name=\"汨罗市\" Code=\"81\" />\n" +
			"        <Region Name=\"临湘市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"常德\" Code=\"7\">\n" +
			"        <Region Name=\"武陵区\" Code=\"2\" />\n" +
			"        <Region Name=\"鼎城区\" Code=\"3\" />\n" +
			"        <Region Name=\"安乡县\" Code=\"21\" />\n" +
			"        <Region Name=\"汉寿县\" Code=\"22\" />\n" +
			"        <Region Name=\"澧　县\" Code=\"23\" />\n" +
			"        <Region Name=\"临澧县\" Code=\"24\" />\n" +
			"        <Region Name=\"桃源县\" Code=\"25\" />\n" +
			"        <Region Name=\"石门县\" Code=\"26\" />\n" +
			"        <Region Name=\"津市市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"张家界\" Code=\"8\">\n" +
			"        <Region Name=\"永定区\" Code=\"2\" />\n" +
			"        <Region Name=\"武陵源区\" Code=\"11\" />\n" +
			"        <Region Name=\"慈利县\" Code=\"21\" />\n" +
			"        <Region Name=\"桑植县\" Code=\"22\" />\n" +
			"      </City>\n" +
			"      <City Name=\"益阳\" Code=\"9\">\n" +
			"        <Region Name=\"资阳区\" Code=\"2\" />\n" +
			"        <Region Name=\"赫山区\" Code=\"3\" />\n" +
			"        <Region Name=\"南　县\" Code=\"21\" />\n" +
			"        <Region Name=\"桃江县\" Code=\"22\" />\n" +
			"        <Region Name=\"安化县\" Code=\"23\" />\n" +
			"        <Region Name=\"沅江市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"郴州\" Code=\"10\">\n" +
			"        <Region Name=\"北湖区\" Code=\"2\" />\n" +
			"        <Region Name=\"苏仙区\" Code=\"3\" />\n" +
			"        <Region Name=\"桂阳县\" Code=\"21\" />\n" +
			"        <Region Name=\"宜章县\" Code=\"22\" />\n" +
			"        <Region Name=\"永兴县\" Code=\"23\" />\n" +
			"        <Region Name=\"嘉禾县\" Code=\"24\" />\n" +
			"        <Region Name=\"临武县\" Code=\"25\" />\n" +
			"        <Region Name=\"汝城县\" Code=\"26\" />\n" +
			"        <Region Name=\"桂东县\" Code=\"27\" />\n" +
			"        <Region Name=\"安仁县\" Code=\"28\" />\n" +
			"        <Region Name=\"资兴市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"永州\" Code=\"11\">\n" +
			"        <Region Name=\"零陵区\" Code=\"2\" />\n" +
			"        <Region Name=\"冷水滩区\" Code=\"3\" />\n" +
			"        <Region Name=\"祁阳县\" Code=\"21\" />\n" +
			"        <Region Name=\"东安县\" Code=\"22\" />\n" +
			"        <Region Name=\"双牌县\" Code=\"23\" />\n" +
			"        <Region Name=\"道　县\" Code=\"24\" />\n" +
			"        <Region Name=\"江永县\" Code=\"25\" />\n" +
			"        <Region Name=\"宁远县\" Code=\"26\" />\n" +
			"        <Region Name=\"蓝山县\" Code=\"27\" />\n" +
			"        <Region Name=\"新田县\" Code=\"28\" />\n" +
			"        <Region Name=\"江华瑶族自治县\" Code=\"29\" />\n" +
			"      </City>\n" +
			"      <City Name=\"怀化\" Code=\"12\">\n" +
			"        <Region Name=\"鹤城区\" Code=\"2\" />\n" +
			"        <Region Name=\"中方县\" Code=\"21\" />\n" +
			"        <Region Name=\"沅陵县\" Code=\"22\" />\n" +
			"        <Region Name=\"辰溪县\" Code=\"23\" />\n" +
			"        <Region Name=\"溆浦县\" Code=\"24\" />\n" +
			"        <Region Name=\"会同县\" Code=\"25\" />\n" +
			"        <Region Name=\"麻阳苗族自治县\" Code=\"26\" />\n" +
			"        <Region Name=\"新晃侗族自治县\" Code=\"27\" />\n" +
			"        <Region Name=\"芷江侗族自治县\" Code=\"28\" />\n" +
			"        <Region Name=\"靖州苗族侗族自治县\" Code=\"29\" />\n" +
			"        <Region Name=\"通道侗族自治县\" Code=\"30\" />\n" +
			"        <Region Name=\"洪江市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"娄底\" Code=\"13\">\n" +
			"        <Region Name=\"娄星区\" Code=\"2\" />\n" +
			"        <Region Name=\"双峰县\" Code=\"21\" />\n" +
			"        <Region Name=\"新化县\" Code=\"22\" />\n" +
			"        <Region Name=\"冷水江市\" Code=\"81\" />\n" +
			"        <Region Name=\"涟源市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"湘西\" Code=\"31\">\n" +
			"        <Region Name=\"吉首市\" Code=\"1\" />\n" +
			"        <Region Name=\"泸溪县\" Code=\"22\" />\n" +
			"        <Region Name=\"凤凰县\" Code=\"23\" />\n" +
			"        <Region Name=\"花垣县\" Code=\"24\" />\n" +
			"        <Region Name=\"保靖县\" Code=\"25\" />\n" +
			"        <Region Name=\"古丈县\" Code=\"26\" />\n" +
			"        <Region Name=\"永顺县\" Code=\"27\" />\n" +
			"        <Region Name=\"龙山县\" Code=\"30\" />\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"广东\" Code=\"44\">\n" +
			"      <City Name=\"广州\" Code=\"1\">\n" +
			"        <Region Name=\"荔湾区\" Code=\"3\" />\n" +
			"        <Region Name=\"越秀区\" Code=\"4\" />\n" +
			"        <Region Name=\"海珠区\" Code=\"5\" />\n" +
			"        <Region Name=\"天河区\" Code=\"6\" />\n" +
			"        <Region Name=\"白云区\" Code=\"11\" />\n" +
			"        <Region Name=\"黄埔区\" Code=\"12\" />\n" +
			"        <Region Name=\"番禺区\" Code=\"13\" />\n" +
			"        <Region Name=\"花都区\" Code=\"14\" />\n" +
			"        <Region Name=\"南沙区\" Code=\"15\" />\n" +
			"        <Region Name=\"萝岗区\" Code=\"16\" />\n" +
			"        <Region Name=\"增城市\" Code=\"83\" />\n" +
			"        <Region Name=\"从化市\" Code=\"84\" />\n" +
			"      </City>\n" +
			"      <City Name=\"韶关\" Code=\"2\">\n" +
			"        <Region Name=\"武江区\" Code=\"3\" />\n" +
			"        <Region Name=\"浈江区\" Code=\"4\" />\n" +
			"        <Region Name=\"曲江区\" Code=\"5\" />\n" +
			"        <Region Name=\"始兴县\" Code=\"22\" />\n" +
			"        <Region Name=\"仁化县\" Code=\"24\" />\n" +
			"        <Region Name=\"翁源县\" Code=\"29\" />\n" +
			"        <Region Name=\"乳源瑶族自治县\" Code=\"32\" />\n" +
			"        <Region Name=\"新丰县\" Code=\"33\" />\n" +
			"        <Region Name=\"乐昌市\" Code=\"81\" />\n" +
			"        <Region Name=\"南雄市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"深圳\" Code=\"3\">\n" +
			"        <Region Name=\"罗湖区\" Code=\"3\" />\n" +
			"        <Region Name=\"福田区\" Code=\"4\" />\n" +
			"        <Region Name=\"南山区\" Code=\"5\" />\n" +
			"        <Region Name=\"宝安区\" Code=\"6\" />\n" +
			"        <Region Name=\"龙岗区\" Code=\"7\" />\n" +
			"        <Region Name=\"盐田区\" Code=\"8\" />\n" +
			"      </City>\n" +
			"      <City Name=\"珠海\" Code=\"4\">\n" +
			"        <Region Name=\"香洲区\" Code=\"2\" />\n" +
			"        <Region Name=\"斗门区\" Code=\"3\" />\n" +
			"        <Region Name=\"金湾区\" Code=\"4\" />\n" +
			"      </City>\n" +
			"      <City Name=\"汕头\" Code=\"5\">\n" +
			"        <Region Name=\"龙湖区\" Code=\"7\" />\n" +
			"        <Region Name=\"金平区\" Code=\"11\" />\n" +
			"        <Region Name=\"濠江区\" Code=\"12\" />\n" +
			"        <Region Name=\"潮阳区\" Code=\"13\" />\n" +
			"        <Region Name=\"潮南区\" Code=\"14\" />\n" +
			"        <Region Name=\"澄海区\" Code=\"15\" />\n" +
			"        <Region Name=\"南澳县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"佛山\" Code=\"6\">\n" +
			"        <Region Name=\"禅城区\" Code=\"4\" />\n" +
			"        <Region Name=\"南海区\" Code=\"5\" />\n" +
			"        <Region Name=\"顺德区\" Code=\"6\" />\n" +
			"        <Region Name=\"三水区\" Code=\"7\" />\n" +
			"        <Region Name=\"高明区\" Code=\"8\" />\n" +
			"      </City>\n" +
			"      <City Name=\"江门\" Code=\"7\">\n" +
			"        <Region Name=\"蓬江区\" Code=\"3\" />\n" +
			"        <Region Name=\"江海区\" Code=\"4\" />\n" +
			"        <Region Name=\"新会区\" Code=\"5\" />\n" +
			"        <Region Name=\"台山市\" Code=\"81\" />\n" +
			"        <Region Name=\"开平市\" Code=\"83\" />\n" +
			"        <Region Name=\"鹤山市\" Code=\"84\" />\n" +
			"        <Region Name=\"恩平市\" Code=\"85\" />\n" +
			"      </City>\n" +
			"      <City Name=\"湛江\" Code=\"8\">\n" +
			"        <Region Name=\"赤坎区\" Code=\"2\" />\n" +
			"        <Region Name=\"霞山区\" Code=\"3\" />\n" +
			"        <Region Name=\"坡头区\" Code=\"4\" />\n" +
			"        <Region Name=\"麻章区\" Code=\"11\" />\n" +
			"        <Region Name=\"遂溪县\" Code=\"23\" />\n" +
			"        <Region Name=\"徐闻县\" Code=\"25\" />\n" +
			"        <Region Name=\"廉江市\" Code=\"81\" />\n" +
			"        <Region Name=\"雷州市\" Code=\"82\" />\n" +
			"        <Region Name=\"吴川市\" Code=\"83\" />\n" +
			"      </City>\n" +
			"      <City Name=\"茂名\" Code=\"9\">\n" +
			"        <Region Name=\"茂南区\" Code=\"2\" />\n" +
			"        <Region Name=\"茂港区\" Code=\"3\" />\n" +
			"        <Region Name=\"电白县\" Code=\"23\" />\n" +
			"        <Region Name=\"高州市\" Code=\"81\" />\n" +
			"        <Region Name=\"化州市\" Code=\"82\" />\n" +
			"        <Region Name=\"信宜市\" Code=\"83\" />\n" +
			"      </City>\n" +
			"      <City Name=\"肇庆\" Code=\"12\">\n" +
			"        <Region Name=\"端州区\" Code=\"2\" />\n" +
			"        <Region Name=\"鼎湖区\" Code=\"3\" />\n" +
			"        <Region Name=\"广宁县\" Code=\"23\" />\n" +
			"        <Region Name=\"怀集县\" Code=\"24\" />\n" +
			"        <Region Name=\"封开县\" Code=\"25\" />\n" +
			"        <Region Name=\"德庆县\" Code=\"26\" />\n" +
			"        <Region Name=\"高要市\" Code=\"83\" />\n" +
			"        <Region Name=\"四会市\" Code=\"84\" />\n" +
			"      </City>\n" +
			"      <City Name=\"惠州\" Code=\"13\">\n" +
			"        <Region Name=\"惠城区\" Code=\"2\" />\n" +
			"        <Region Name=\"惠阳区\" Code=\"3\" />\n" +
			"        <Region Name=\"博罗县\" Code=\"22\" />\n" +
			"        <Region Name=\"惠东县\" Code=\"23\" />\n" +
			"        <Region Name=\"龙门县\" Code=\"24\" />\n" +
			"      </City>\n" +
			"      <City Name=\"梅州\" Code=\"14\">\n" +
			"        <Region Name=\"梅江区\" Code=\"2\" />\n" +
			"        <Region Name=\"梅　县\" Code=\"21\" />\n" +
			"        <Region Name=\"大埔县\" Code=\"22\" />\n" +
			"        <Region Name=\"丰顺县\" Code=\"23\" />\n" +
			"        <Region Name=\"五华县\" Code=\"24\" />\n" +
			"        <Region Name=\"平远县\" Code=\"26\" />\n" +
			"        <Region Name=\"蕉岭县\" Code=\"27\" />\n" +
			"        <Region Name=\"兴宁市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"汕尾\" Code=\"15\">\n" +
			"        <Region Name=\"城　区\" Code=\"2\" />\n" +
			"        <Region Name=\"海丰县\" Code=\"21\" />\n" +
			"        <Region Name=\"陆河县\" Code=\"23\" />\n" +
			"        <Region Name=\"陆丰市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"河源\" Code=\"16\">\n" +
			"        <Region Name=\"源城区\" Code=\"2\" />\n" +
			"        <Region Name=\"紫金县\" Code=\"21\" />\n" +
			"        <Region Name=\"龙川县\" Code=\"22\" />\n" +
			"        <Region Name=\"连平县\" Code=\"23\" />\n" +
			"        <Region Name=\"和平县\" Code=\"24\" />\n" +
			"        <Region Name=\"东源县\" Code=\"25\" />\n" +
			"      </City>\n" +
			"      <City Name=\"阳江\" Code=\"17\">\n" +
			"        <Region Name=\"江城区\" Code=\"2\" />\n" +
			"        <Region Name=\"阳西县\" Code=\"21\" />\n" +
			"        <Region Name=\"阳东县\" Code=\"23\" />\n" +
			"        <Region Name=\"阳春市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"清远\" Code=\"18\">\n" +
			"        <Region Name=\"清城区\" Code=\"2\" />\n" +
			"        <Region Name=\"佛冈县\" Code=\"21\" />\n" +
			"        <Region Name=\"阳山县\" Code=\"23\" />\n" +
			"        <Region Name=\"连山壮族瑶族自治县\" Code=\"25\" />\n" +
			"        <Region Name=\"连南瑶族自治县\" Code=\"26\" />\n" +
			"        <Region Name=\"清新县\" Code=\"27\" />\n" +
			"        <Region Name=\"英德市\" Code=\"81\" />\n" +
			"        <Region Name=\"连州市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"东莞\" Code=\"19\">\n" +
			"        <Region Name=\"东莞市\" Code=\"0\" />\n" +
			"      </City>\n" +
			"      <City Name=\"中山\" Code=\"20\">\n" +
			"        <Region Name=\"中山市\" Code=\"0\" />\n" +
			"      </City>\n" +
			"      <City Name=\"潮州\" Code=\"51\">\n" +
			"        <Region Name=\"湘桥区\" Code=\"2\" />\n" +
			"        <Region Name=\"潮安县\" Code=\"21\" />\n" +
			"        <Region Name=\"饶平县\" Code=\"22\" />\n" +
			"      </City>\n" +
			"      <City Name=\"揭阳\" Code=\"52\">\n" +
			"        <Region Name=\"榕城区\" Code=\"2\" />\n" +
			"        <Region Name=\"揭东县\" Code=\"21\" />\n" +
			"        <Region Name=\"揭西县\" Code=\"22\" />\n" +
			"        <Region Name=\"惠来县\" Code=\"24\" />\n" +
			"        <Region Name=\"普宁市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"云浮\" Code=\"53\">\n" +
			"        <Region Name=\"云城区\" Code=\"2\" />\n" +
			"        <Region Name=\"新兴县\" Code=\"21\" />\n" +
			"        <Region Name=\"郁南县\" Code=\"22\" />\n" +
			"        <Region Name=\"云安县\" Code=\"23\" />\n" +
			"        <Region Name=\"罗定市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"广西\" Code=\"45\">\n" +
			"      <City Name=\"南宁\" Code=\"1\">\n" +
			"        <Region Name=\"兴宁区\" Code=\"2\" />\n" +
			"        <Region Name=\"青秀区\" Code=\"3\" />\n" +
			"        <Region Name=\"江南区\" Code=\"5\" />\n" +
			"        <Region Name=\"西乡塘区\" Code=\"7\" />\n" +
			"        <Region Name=\"良庆区\" Code=\"8\" />\n" +
			"        <Region Name=\"邕宁区\" Code=\"9\" />\n" +
			"        <Region Name=\"武鸣县\" Code=\"22\" />\n" +
			"        <Region Name=\"隆安县\" Code=\"23\" />\n" +
			"        <Region Name=\"马山县\" Code=\"24\" />\n" +
			"        <Region Name=\"上林县\" Code=\"25\" />\n" +
			"        <Region Name=\"宾阳县\" Code=\"26\" />\n" +
			"        <Region Name=\"横　县\" Code=\"27\" />\n" +
			"      </City>\n" +
			"      <City Name=\"柳州\" Code=\"2\">\n" +
			"        <Region Name=\"城中区\" Code=\"2\" />\n" +
			"        <Region Name=\"鱼峰区\" Code=\"3\" />\n" +
			"        <Region Name=\"柳南区\" Code=\"4\" />\n" +
			"        <Region Name=\"柳北区\" Code=\"5\" />\n" +
			"        <Region Name=\"柳江县\" Code=\"21\" />\n" +
			"        <Region Name=\"柳城县\" Code=\"22\" />\n" +
			"        <Region Name=\"鹿寨县\" Code=\"23\" />\n" +
			"        <Region Name=\"融安县\" Code=\"24\" />\n" +
			"        <Region Name=\"融水苗族自治县\" Code=\"25\" />\n" +
			"        <Region Name=\"三江侗族自治县\" Code=\"26\" />\n" +
			"      </City>\n" +
			"      <City Name=\"桂林\" Code=\"3\">\n" +
			"        <Region Name=\"秀峰区\" Code=\"2\" />\n" +
			"        <Region Name=\"叠彩区\" Code=\"3\" />\n" +
			"        <Region Name=\"象山区\" Code=\"4\" />\n" +
			"        <Region Name=\"七星区\" Code=\"5\" />\n" +
			"        <Region Name=\"雁山区\" Code=\"11\" />\n" +
			"        <Region Name=\"阳朔县\" Code=\"21\" />\n" +
			"        <Region Name=\"临桂县\" Code=\"22\" />\n" +
			"        <Region Name=\"灵川县\" Code=\"23\" />\n" +
			"        <Region Name=\"全州县\" Code=\"24\" />\n" +
			"        <Region Name=\"兴安县\" Code=\"25\" />\n" +
			"        <Region Name=\"永福县\" Code=\"26\" />\n" +
			"        <Region Name=\"灌阳县\" Code=\"27\" />\n" +
			"        <Region Name=\"龙胜各族自治县\" Code=\"28\" />\n" +
			"        <Region Name=\"资源县\" Code=\"29\" />\n" +
			"        <Region Name=\"平乐县\" Code=\"30\" />\n" +
			"        <Region Name=\"荔浦县\" Code=\"31\" />\n" +
			"        <Region Name=\"恭城瑶族自治县\" Code=\"32\" />\n" +
			"      </City>\n" +
			"      <City Name=\"梧州\" Code=\"4\">\n" +
			"        <Region Name=\"万秀区\" Code=\"3\" />\n" +
			"        <Region Name=\"蝶山区\" Code=\"4\" />\n" +
			"        <Region Name=\"长洲区\" Code=\"5\" />\n" +
			"        <Region Name=\"苍梧县\" Code=\"21\" />\n" +
			"        <Region Name=\"藤　县\" Code=\"22\" />\n" +
			"        <Region Name=\"蒙山县\" Code=\"23\" />\n" +
			"        <Region Name=\"岑溪市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"北海\" Code=\"5\">\n" +
			"        <Region Name=\"海城区\" Code=\"2\" />\n" +
			"        <Region Name=\"银海区\" Code=\"3\" />\n" +
			"        <Region Name=\"铁山港区\" Code=\"12\" />\n" +
			"        <Region Name=\"合浦县\" Code=\"21\" />\n" +
			"      </City>\n" +
			"      <City Name=\"防城港\" Code=\"6\">\n" +
			"        <Region Name=\"港口区\" Code=\"2\" />\n" +
			"        <Region Name=\"防城区\" Code=\"3\" />\n" +
			"        <Region Name=\"上思县\" Code=\"21\" />\n" +
			"        <Region Name=\"东兴市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"钦州\" Code=\"7\">\n" +
			"        <Region Name=\"钦南区\" Code=\"2\" />\n" +
			"        <Region Name=\"钦北区\" Code=\"3\" />\n" +
			"        <Region Name=\"灵山县\" Code=\"21\" />\n" +
			"        <Region Name=\"浦北县\" Code=\"22\" />\n" +
			"      </City>\n" +
			"      <City Name=\"贵港\" Code=\"8\">\n" +
			"        <Region Name=\"港北区\" Code=\"2\" />\n" +
			"        <Region Name=\"港南区\" Code=\"3\" />\n" +
			"        <Region Name=\"覃塘区\" Code=\"4\" />\n" +
			"        <Region Name=\"平南县\" Code=\"21\" />\n" +
			"        <Region Name=\"桂平市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"玉林\" Code=\"9\">\n" +
			"        <Region Name=\"玉州区\" Code=\"2\" />\n" +
			"        <Region Name=\"容　县\" Code=\"21\" />\n" +
			"        <Region Name=\"陆川县\" Code=\"22\" />\n" +
			"        <Region Name=\"博白县\" Code=\"23\" />\n" +
			"        <Region Name=\"兴业县\" Code=\"24\" />\n" +
			"        <Region Name=\"北流市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"百色\" Code=\"10\">\n" +
			"        <Region Name=\"右江区\" Code=\"2\" />\n" +
			"        <Region Name=\"田阳县\" Code=\"21\" />\n" +
			"        <Region Name=\"田东县\" Code=\"22\" />\n" +
			"        <Region Name=\"平果县\" Code=\"23\" />\n" +
			"        <Region Name=\"德保县\" Code=\"24\" />\n" +
			"        <Region Name=\"靖西县\" Code=\"25\" />\n" +
			"        <Region Name=\"那坡县\" Code=\"26\" />\n" +
			"        <Region Name=\"凌云县\" Code=\"27\" />\n" +
			"        <Region Name=\"乐业县\" Code=\"28\" />\n" +
			"        <Region Name=\"田林县\" Code=\"29\" />\n" +
			"        <Region Name=\"西林县\" Code=\"30\" />\n" +
			"        <Region Name=\"隆林各族自治县\" Code=\"31\" />\n" +
			"      </City>\n" +
			"      <City Name=\"贺州\" Code=\"11\">\n" +
			"        <Region Name=\"八步区\" Code=\"2\" />\n" +
			"        <Region Name=\"昭平县\" Code=\"21\" />\n" +
			"        <Region Name=\"钟山县\" Code=\"22\" />\n" +
			"        <Region Name=\"富川瑶族自治县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"河池\" Code=\"12\">\n" +
			"        <Region Name=\"金城江区\" Code=\"2\" />\n" +
			"        <Region Name=\"南丹县\" Code=\"21\" />\n" +
			"        <Region Name=\"天峨县\" Code=\"22\" />\n" +
			"        <Region Name=\"凤山县\" Code=\"23\" />\n" +
			"        <Region Name=\"东兰县\" Code=\"24\" />\n" +
			"        <Region Name=\"罗城仫佬族自治县\" Code=\"25\" />\n" +
			"        <Region Name=\"环江毛南族自治县\" Code=\"26\" />\n" +
			"        <Region Name=\"巴马瑶族自治县\" Code=\"27\" />\n" +
			"        <Region Name=\"都安瑶族自治县\" Code=\"28\" />\n" +
			"        <Region Name=\"大化瑶族自治县\" Code=\"29\" />\n" +
			"        <Region Name=\"宜州市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"来宾\" Code=\"13\">\n" +
			"        <Region Name=\"兴宾区\" Code=\"2\" />\n" +
			"        <Region Name=\"忻城县\" Code=\"21\" />\n" +
			"        <Region Name=\"象州县\" Code=\"22\" />\n" +
			"        <Region Name=\"武宣县\" Code=\"23\" />\n" +
			"        <Region Name=\"金秀瑶族自治县\" Code=\"24\" />\n" +
			"        <Region Name=\"合山市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"崇左\" Code=\"14\">\n" +
			"        <Region Name=\"江洲区\" Code=\"2\" />\n" +
			"        <Region Name=\"扶绥县\" Code=\"21\" />\n" +
			"        <Region Name=\"宁明县\" Code=\"22\" />\n" +
			"        <Region Name=\"龙州县\" Code=\"23\" />\n" +
			"        <Region Name=\"大新县\" Code=\"24\" />\n" +
			"        <Region Name=\"天等县\" Code=\"25\" />\n" +
			"        <Region Name=\"凭祥市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"海南\" Code=\"46\">\n" +
			"      <City Name=\"海口\" Code=\"1\">\n" +
			"        <Region Name=\"秀英区\" Code=\"5\" />\n" +
			"        <Region Name=\"龙华区\" Code=\"6\" />\n" +
			"        <Region Name=\"琼山区\" Code=\"7\" />\n" +
			"        <Region Name=\"美兰区\" Code=\"8\" />\n" +
			"      </City>\n" +
			"      <City Name=\"三亚\" Code=\"2\" />\n" +
			"\t  <City Name=\"三沙\" Code=\"3\" />\n" +
			"      <City Name=\"五指山\" Code=\"91\" />\n" +
			"      <City Name=\"琼海\" Code=\"92\" />\n" +
			"      <City Name=\"儋州\" Code=\"93\" />\n" +
			"      <City Name=\"文昌\" Code=\"95\" />\n" +
			"      <City Name=\"万宁\" Code=\"96\" />\n" +
			"      <City Name=\"东方\" Code=\"97\" />\n" +
			"      <City Name=\"定安\" Code=\"A25\" />\n" +
			"      <City Name=\"屯昌\" Code=\"A26\" />\n" +
			"      <City Name=\"澄迈\" Code=\"A27\" />\n" +
			"      <City Name=\"临高\" Code=\"A28\" />\n" +
			"      <City Name=\"白沙\" Code=\"A30\" />\n" +
			"      <City Name=\"昌江\" Code=\"A31\" />\n" +
			"      <City Name=\"乐东\" Code=\"A33\" />\n" +
			"      <City Name=\"陵水\" Code=\"A34\" />\n" +
			"      <City Name=\"保亭\" Code=\"A35\" />\n" +
			"      <City Name=\"琼中\" Code=\"A36\" />\n" +
			"      \n" +
			"    </State>\n" +
			"    <State Name=\"重庆\" Code=\"50\">\n" +
			"      <City Name=\"万州\" Code=\"1\" />\n" +
			"      <City Name=\"涪陵\" Code=\"2\" />\n" +
			"      <City Name=\"渝中\" Code=\"3\" />\n" +
			"      <City Name=\"大渡口\" Code=\"4\" />\n" +
			"      <City Name=\"江北\" Code=\"5\" />\n" +
			"      <City Name=\"沙坪坝\" Code=\"6\" />\n" +
			"      <City Name=\"九龙坡\" Code=\"7\" />\n" +
			"      <City Name=\"南岸\" Code=\"8\" />\n" +
			"      <City Name=\"北碚\" Code=\"9\" />\n" +
			"      <City Name=\"两江新区\" Code=\"85\" />\n" +
			"      <City Name=\"万盛\" Code=\"10\" />\n" +
			"      <City Name=\"双桥\" Code=\"11\" />\n" +
			"      <City Name=\"渝北\" Code=\"12\" />\n" +
			"      <City Name=\"巴南\" Code=\"13\" />\n" +
			"      <City Name=\"长寿\" Code=\"21\" />\n" +
			"      <City Name=\"綦江\" Code=\"22\" />\n" +
			"      <City Name=\"潼南\" Code=\"23\" />\n" +
			"      <City Name=\"铜梁\" Code=\"24\" />\n" +
			"      <City Name=\"大足\" Code=\"25\" />\n" +
			"      <City Name=\"荣昌\" Code=\"26\" />\n" +
			"      <City Name=\"璧山\" Code=\"27\" />\n" +
			"      <City Name=\"梁平\" Code=\"28\" />\n" +
			"      <City Name=\"城口\" Code=\"29\" />\n" +
			"      <City Name=\"丰都\" Code=\"30\" />\n" +
			"      <City Name=\"垫江\" Code=\"31\" />\n" +
			"      <City Name=\"武隆\" Code=\"32\" />\n" +
			"      <City Name=\"忠县\" Code=\"33\" />\n" +
			"      <City Name=\"开县\" Code=\"34\" />\n" +
			"      <City Name=\"云阳\" Code=\"35\" />\n" +
			"      <City Name=\"奉节\" Code=\"36\" />\n" +
			"      <City Name=\"巫山\" Code=\"37\" />\n" +
			"      <City Name=\"巫溪\" Code=\"38\" />\n" +
			"      <City Name=\"黔江\" Code=\"39\" />\n" +
			"      <City Name=\"石柱\" Code=\"40\" />\n" +
			"      <City Name=\"秀山\" Code=\"41\" />\n" +
			"      <City Name=\"酉阳\" Code=\"42\" />\n" +
			"      <City Name=\"彭水\" Code=\"43\" />\n" +
			"      <City Name=\"江津\" Code=\"81\" />\n" +
			"      <City Name=\"合川\" Code=\"82\" />\n" +
			"      <City Name=\"永川\" Code=\"83\" />\n" +
			"      <City Name=\"南川\" Code=\"84\" />\n" +
			"    </State>\n" +
			"    <State Name=\"四川\" Code=\"51\">\n" +
			"      <City Name=\"成都\" Code=\"1\">\n" +
			"        <Region Name=\"锦江区\" Code=\"4\" />\n" +
			"        <Region Name=\"青羊区\" Code=\"5\" />\n" +
			"        <Region Name=\"金牛区\" Code=\"6\" />\n" +
			"        <Region Name=\"武侯区\" Code=\"7\" />\n" +
			"        <Region Name=\"成华区\" Code=\"8\" />\n" +
			"        <Region Name=\"龙泉驿区\" Code=\"12\" />\n" +
			"        <Region Name=\"青白江区\" Code=\"13\" />\n" +
			"        <Region Name=\"新都区\" Code=\"14\" />\n" +
			"        <Region Name=\"温江区\" Code=\"15\" />\n" +
			"        <Region Name=\"金堂县\" Code=\"21\" />\n" +
			"        <Region Name=\"双流县\" Code=\"22\" />\n" +
			"        <Region Name=\"郫　县\" Code=\"24\" />\n" +
			"        <Region Name=\"大邑县\" Code=\"29\" />\n" +
			"        <Region Name=\"蒲江县\" Code=\"31\" />\n" +
			"        <Region Name=\"新津县\" Code=\"32\" />\n" +
			"        <Region Name=\"都江堰市\" Code=\"81\" />\n" +
			"        <Region Name=\"彭州市\" Code=\"82\" />\n" +
			"        <Region Name=\"邛崃市\" Code=\"83\" />\n" +
			"        <Region Name=\"崇州市\" Code=\"84\" />\n" +
			"      </City>\n" +
			"      <City Name=\"自贡\" Code=\"3\">\n" +
			"        <Region Name=\"自流井区\" Code=\"2\" />\n" +
			"        <Region Name=\"贡井区\" Code=\"3\" />\n" +
			"        <Region Name=\"大安区\" Code=\"4\" />\n" +
			"        <Region Name=\"沿滩区\" Code=\"11\" />\n" +
			"        <Region Name=\"荣　县\" Code=\"21\" />\n" +
			"        <Region Name=\"富顺县\" Code=\"22\" />\n" +
			"      </City>\n" +
			"      <City Name=\"攀枝花\" Code=\"4\">\n" +
			"        <Region Name=\"东　区\" Code=\"2\" />\n" +
			"        <Region Name=\"西　区\" Code=\"3\" />\n" +
			"        <Region Name=\"仁和区\" Code=\"11\" />\n" +
			"        <Region Name=\"米易县\" Code=\"21\" />\n" +
			"        <Region Name=\"盐边县\" Code=\"22\" />\n" +
			"      </City>\n" +
			"      <City Name=\"泸州\" Code=\"5\">\n" +
			"        <Region Name=\"江阳区\" Code=\"2\" />\n" +
			"        <Region Name=\"纳溪区\" Code=\"3\" />\n" +
			"        <Region Name=\"龙马潭区\" Code=\"4\" />\n" +
			"        <Region Name=\"泸　县\" Code=\"21\" />\n" +
			"        <Region Name=\"合江县\" Code=\"22\" />\n" +
			"        <Region Name=\"叙永县\" Code=\"24\" />\n" +
			"        <Region Name=\"古蔺县\" Code=\"25\" />\n" +
			"      </City>\n" +
			"      <City Name=\"德阳\" Code=\"6\">\n" +
			"        <Region Name=\"旌阳区\" Code=\"3\" />\n" +
			"        <Region Name=\"中江县\" Code=\"23\" />\n" +
			"        <Region Name=\"罗江县\" Code=\"26\" />\n" +
			"        <Region Name=\"广汉市\" Code=\"81\" />\n" +
			"        <Region Name=\"什邡市\" Code=\"82\" />\n" +
			"        <Region Name=\"绵竹市\" Code=\"83\" />\n" +
			"      </City>\n" +
			"      <City Name=\"绵阳\" Code=\"7\">\n" +
			"        <Region Name=\"涪城区\" Code=\"3\" />\n" +
			"        <Region Name=\"游仙区\" Code=\"4\" />\n" +
			"        <Region Name=\"三台县\" Code=\"22\" />\n" +
			"        <Region Name=\"盐亭县\" Code=\"23\" />\n" +
			"        <Region Name=\"安　县\" Code=\"24\" />\n" +
			"        <Region Name=\"梓潼县\" Code=\"25\" />\n" +
			"        <Region Name=\"北川羌族自治县\" Code=\"26\" />\n" +
			"        <Region Name=\"平武县\" Code=\"27\" />\n" +
			"        <Region Name=\"江油市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"广元\" Code=\"8\">\n" +
			"        <Region Name=\"市中区\" Code=\"2\" />\n" +
			"        <Region Name=\"元坝区\" Code=\"11\" />\n" +
			"        <Region Name=\"朝天区\" Code=\"12\" />\n" +
			"        <Region Name=\"旺苍县\" Code=\"21\" />\n" +
			"        <Region Name=\"青川县\" Code=\"22\" />\n" +
			"        <Region Name=\"剑阁县\" Code=\"23\" />\n" +
			"        <Region Name=\"苍溪县\" Code=\"24\" />\n" +
			"      </City>\n" +
			"      <City Name=\"遂宁\" Code=\"9\">\n" +
			"        <Region Name=\"船山区\" Code=\"3\" />\n" +
			"        <Region Name=\"安居区\" Code=\"4\" />\n" +
			"        <Region Name=\"蓬溪县\" Code=\"21\" />\n" +
			"        <Region Name=\"射洪县\" Code=\"22\" />\n" +
			"        <Region Name=\"大英县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"内江\" Code=\"10\">\n" +
			"        <Region Name=\"市中区\" Code=\"2\" />\n" +
			"        <Region Name=\"东兴区\" Code=\"11\" />\n" +
			"        <Region Name=\"威远县\" Code=\"24\" />\n" +
			"        <Region Name=\"资中县\" Code=\"25\" />\n" +
			"        <Region Name=\"隆昌县\" Code=\"28\" />\n" +
			"      </City>\n" +
			"      <City Name=\"乐山\" Code=\"11\">\n" +
			"        <Region Name=\"市中区\" Code=\"2\" />\n" +
			"        <Region Name=\"沙湾区\" Code=\"11\" />\n" +
			"        <Region Name=\"五通桥区\" Code=\"12\" />\n" +
			"        <Region Name=\"金口河区\" Code=\"13\" />\n" +
			"        <Region Name=\"犍为县\" Code=\"23\" />\n" +
			"        <Region Name=\"井研县\" Code=\"24\" />\n" +
			"        <Region Name=\"夹江县\" Code=\"26\" />\n" +
			"        <Region Name=\"沐川县\" Code=\"29\" />\n" +
			"        <Region Name=\"峨边彝族自治县\" Code=\"32\" />\n" +
			"        <Region Name=\"马边彝族自治县\" Code=\"33\" />\n" +
			"        <Region Name=\"峨眉山市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"南充\" Code=\"13\">\n" +
			"        <Region Name=\"顺庆区\" Code=\"2\" />\n" +
			"        <Region Name=\"高坪区\" Code=\"3\" />\n" +
			"        <Region Name=\"嘉陵区\" Code=\"4\" />\n" +
			"        <Region Name=\"南部县\" Code=\"21\" />\n" +
			"        <Region Name=\"营山县\" Code=\"22\" />\n" +
			"        <Region Name=\"蓬安县\" Code=\"23\" />\n" +
			"        <Region Name=\"仪陇县\" Code=\"24\" />\n" +
			"        <Region Name=\"西充县\" Code=\"25\" />\n" +
			"        <Region Name=\"阆中市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"眉山\" Code=\"14\">\n" +
			"        <Region Name=\"东坡区\" Code=\"2\" />\n" +
			"        <Region Name=\"仁寿县\" Code=\"21\" />\n" +
			"        <Region Name=\"彭山县\" Code=\"22\" />\n" +
			"        <Region Name=\"洪雅县\" Code=\"23\" />\n" +
			"        <Region Name=\"丹棱县\" Code=\"24\" />\n" +
			"        <Region Name=\"青神县\" Code=\"25\" />\n" +
			"      </City>\n" +
			"      <City Name=\"宜宾\" Code=\"15\">\n" +
			"        <Region Name=\"翠屏区\" Code=\"2\" />\n" +
			"        <Region Name=\"宜宾县\" Code=\"21\" />\n" +
			"        <Region Name=\"南溪县\" Code=\"22\" />\n" +
			"        <Region Name=\"江安县\" Code=\"23\" />\n" +
			"        <Region Name=\"长宁县\" Code=\"24\" />\n" +
			"        <Region Name=\"高　县\" Code=\"25\" />\n" +
			"        <Region Name=\"珙　县\" Code=\"26\" />\n" +
			"        <Region Name=\"筠连县\" Code=\"27\" />\n" +
			"        <Region Name=\"兴文县\" Code=\"28\" />\n" +
			"        <Region Name=\"屏山县\" Code=\"29\" />\n" +
			"      </City>\n" +
			"      <City Name=\"广安\" Code=\"16\">\n" +
			"        <Region Name=\"广安区\" Code=\"2\" />\n" +
			"        <Region Name=\"岳池县\" Code=\"21\" />\n" +
			"        <Region Name=\"武胜县\" Code=\"22\" />\n" +
			"        <Region Name=\"邻水县\" Code=\"23\" />\n" +
			"        <Region Name=\"华蓥市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"达州\" Code=\"17\">\n" +
			"        <Region Name=\"通川区\" Code=\"2\" />\n" +
			"        <Region Name=\"达　县\" Code=\"21\" />\n" +
			"        <Region Name=\"宣汉县\" Code=\"22\" />\n" +
			"        <Region Name=\"开江县\" Code=\"23\" />\n" +
			"        <Region Name=\"大竹县\" Code=\"24\" />\n" +
			"        <Region Name=\"渠　县\" Code=\"25\" />\n" +
			"        <Region Name=\"万源市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"雅安\" Code=\"18\">\n" +
			"        <Region Name=\"雨城区\" Code=\"2\" />\n" +
			"        <Region Name=\"名山县\" Code=\"21\" />\n" +
			"        <Region Name=\"荥经县\" Code=\"22\" />\n" +
			"        <Region Name=\"汉源县\" Code=\"23\" />\n" +
			"        <Region Name=\"石棉县\" Code=\"24\" />\n" +
			"        <Region Name=\"天全县\" Code=\"25\" />\n" +
			"        <Region Name=\"芦山县\" Code=\"26\" />\n" +
			"        <Region Name=\"宝兴县\" Code=\"27\" />\n" +
			"      </City>\n" +
			"      <City Name=\"巴中\" Code=\"19\">\n" +
			"        <Region Name=\"巴州区\" Code=\"2\" />\n" +
			"        <Region Name=\"通江县\" Code=\"21\" />\n" +
			"        <Region Name=\"南江县\" Code=\"22\" />\n" +
			"        <Region Name=\"平昌县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"资阳\" Code=\"20\">\n" +
			"        <Region Name=\"雁江区\" Code=\"2\" />\n" +
			"        <Region Name=\"安岳县\" Code=\"21\" />\n" +
			"        <Region Name=\"乐至县\" Code=\"22\" />\n" +
			"        <Region Name=\"简阳市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"阿坝\" Code=\"32\">\n" +
			"        <Region Name=\"汶川县\" Code=\"21\" />\n" +
			"        <Region Name=\"理　县\" Code=\"22\" />\n" +
			"        <Region Name=\"茂　县\" Code=\"23\" />\n" +
			"        <Region Name=\"松潘县\" Code=\"24\" />\n" +
			"        <Region Name=\"九寨沟县\" Code=\"25\" />\n" +
			"        <Region Name=\"金川县\" Code=\"26\" />\n" +
			"        <Region Name=\"小金县\" Code=\"27\" />\n" +
			"        <Region Name=\"黑水县\" Code=\"28\" />\n" +
			"        <Region Name=\"马尔康县\" Code=\"29\" />\n" +
			"        <Region Name=\"壤塘县\" Code=\"30\" />\n" +
			"        <Region Name=\"阿坝县\" Code=\"31\" />\n" +
			"        <Region Name=\"若尔盖县\" Code=\"32\" />\n" +
			"        <Region Name=\"红原县\" Code=\"33\" />\n" +
			"      </City>\n" +
			"      <City Name=\"甘孜\" Code=\"33\">\n" +
			"        <Region Name=\"康定县\" Code=\"21\" />\n" +
			"        <Region Name=\"泸定县\" Code=\"22\" />\n" +
			"        <Region Name=\"丹巴县\" Code=\"23\" />\n" +
			"        <Region Name=\"九龙县\" Code=\"24\" />\n" +
			"        <Region Name=\"雅江县\" Code=\"25\" />\n" +
			"        <Region Name=\"道孚县\" Code=\"26\" />\n" +
			"        <Region Name=\"炉霍县\" Code=\"27\" />\n" +
			"        <Region Name=\"甘孜县\" Code=\"28\" />\n" +
			"        <Region Name=\"新龙县\" Code=\"29\" />\n" +
			"        <Region Name=\"德格县\" Code=\"30\" />\n" +
			"        <Region Name=\"白玉县\" Code=\"31\" />\n" +
			"        <Region Name=\"石渠县\" Code=\"32\" />\n" +
			"        <Region Name=\"色达县\" Code=\"33\" />\n" +
			"        <Region Name=\"理塘县\" Code=\"34\" />\n" +
			"        <Region Name=\"巴塘县\" Code=\"35\" />\n" +
			"        <Region Name=\"乡城县\" Code=\"36\" />\n" +
			"        <Region Name=\"稻城县\" Code=\"37\" />\n" +
			"        <Region Name=\"得荣县\" Code=\"38\" />\n" +
			"      </City>\n" +
			"      <City Name=\"凉山\" Code=\"34\">\n" +
			"        <Region Name=\"西昌市\" Code=\"1\" />\n" +
			"        <Region Name=\"木里藏族自治县\" Code=\"22\" />\n" +
			"        <Region Name=\"盐源县\" Code=\"23\" />\n" +
			"        <Region Name=\"德昌县\" Code=\"24\" />\n" +
			"        <Region Name=\"会理县\" Code=\"25\" />\n" +
			"        <Region Name=\"会东县\" Code=\"26\" />\n" +
			"        <Region Name=\"宁南县\" Code=\"27\" />\n" +
			"        <Region Name=\"普格县\" Code=\"28\" />\n" +
			"        <Region Name=\"布拖县\" Code=\"29\" />\n" +
			"        <Region Name=\"金阳县\" Code=\"30\" />\n" +
			"        <Region Name=\"昭觉县\" Code=\"31\" />\n" +
			"        <Region Name=\"喜德县\" Code=\"32\" />\n" +
			"        <Region Name=\"冕宁县\" Code=\"33\" />\n" +
			"        <Region Name=\"越西县\" Code=\"34\" />\n" +
			"        <Region Name=\"甘洛县\" Code=\"35\" />\n" +
			"        <Region Name=\"美姑县\" Code=\"36\" />\n" +
			"        <Region Name=\"雷波县\" Code=\"37\" />\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"贵州\" Code=\"52\">\n" +
			"      <City Name=\"贵阳\" Code=\"1\">\n" +
			"        <Region Name=\"南明区\" Code=\"2\" />\n" +
			"        <Region Name=\"云岩区\" Code=\"3\" />\n" +
			"        <Region Name=\"花溪区\" Code=\"11\" />\n" +
			"        <Region Name=\"乌当区\" Code=\"12\" />\n" +
			"        <Region Name=\"白云区\" Code=\"13\" />\n" +
			"        <Region Name=\"小河区\" Code=\"14\" />\n" +
			"        <Region Name=\"开阳县\" Code=\"21\" />\n" +
			"        <Region Name=\"息烽县\" Code=\"22\" />\n" +
			"        <Region Name=\"修文县\" Code=\"23\" />\n" +
			"        <Region Name=\"清镇市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"六盘水\" Code=\"2\">\n" +
			"        <Region Name=\"钟山区\" Code=\"1\" />\n" +
			"        <Region Name=\"六枝特区\" Code=\"3\" />\n" +
			"        <Region Name=\"水城县\" Code=\"21\" />\n" +
			"        <Region Name=\"盘　县\" Code=\"22\" />\n" +
			"      </City>\n" +
			"      <City Name=\"遵义\" Code=\"3\">\n" +
			"        <Region Name=\"红花岗区\" Code=\"2\" />\n" +
			"        <Region Name=\"汇川区\" Code=\"3\" />\n" +
			"        <Region Name=\"遵义县\" Code=\"21\" />\n" +
			"        <Region Name=\"桐梓县\" Code=\"22\" />\n" +
			"        <Region Name=\"绥阳县\" Code=\"23\" />\n" +
			"        <Region Name=\"正安县\" Code=\"24\" />\n" +
			"        <Region Name=\"道真仡佬族苗族自治县\" Code=\"25\" />\n" +
			"        <Region Name=\"务川仡佬族苗族自治县\" Code=\"26\" />\n" +
			"        <Region Name=\"凤冈县\" Code=\"27\" />\n" +
			"        <Region Name=\"湄潭县\" Code=\"28\" />\n" +
			"        <Region Name=\"余庆县\" Code=\"29\" />\n" +
			"        <Region Name=\"习水县\" Code=\"30\" />\n" +
			"        <Region Name=\"赤水市\" Code=\"81\" />\n" +
			"        <Region Name=\"仁怀市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"安顺\" Code=\"4\">\n" +
			"        <Region Name=\"西秀区\" Code=\"2\" />\n" +
			"        <Region Name=\"平坝县\" Code=\"21\" />\n" +
			"        <Region Name=\"普定县\" Code=\"22\" />\n" +
			"        <Region Name=\"镇宁布依族苗族自治县\" Code=\"23\" />\n" +
			"        <Region Name=\"关岭布依族苗族自治县\" Code=\"24\" />\n" +
			"        <Region Name=\"紫云苗族布依族自治县\" Code=\"25\" />\n" +
			"      </City>\n" +
			"      <City Name=\"铜仁\" Code=\"22\">\n" +
			"        <Region Name=\"铜仁市\" Code=\"1\" />\n" +
			"        <Region Name=\"江口县\" Code=\"22\" />\n" +
			"        <Region Name=\"玉屏侗族自治县\" Code=\"23\" />\n" +
			"        <Region Name=\"石阡县\" Code=\"24\" />\n" +
			"        <Region Name=\"思南县\" Code=\"25\" />\n" +
			"        <Region Name=\"印江土家族苗族自治县\" Code=\"26\" />\n" +
			"        <Region Name=\"德江县\" Code=\"27\" />\n" +
			"        <Region Name=\"沿河土家族自治县\" Code=\"28\" />\n" +
			"        <Region Name=\"松桃苗族自治县\" Code=\"29\" />\n" +
			"        <Region Name=\"万山特区\" Code=\"30\" />\n" +
			"      </City>\n" +
			"      <City Name=\"黔西南\" Code=\"23\">\n" +
			"        <Region Name=\"兴义市\" Code=\"1\" />\n" +
			"        <Region Name=\"兴仁县\" Code=\"22\" />\n" +
			"        <Region Name=\"普安县\" Code=\"23\" />\n" +
			"        <Region Name=\"晴隆县\" Code=\"24\" />\n" +
			"        <Region Name=\"贞丰县\" Code=\"25\" />\n" +
			"        <Region Name=\"望谟县\" Code=\"26\" />\n" +
			"        <Region Name=\"册亨县\" Code=\"27\" />\n" +
			"        <Region Name=\"安龙县\" Code=\"28\" />\n" +
			"      </City>\n" +
			"      <City Name=\"毕节\" Code=\"24\">\n" +
			"        <Region Name=\"毕节市\" Code=\"1\" />\n" +
			"        <Region Name=\"大方县\" Code=\"22\" />\n" +
			"        <Region Name=\"黔西县\" Code=\"23\" />\n" +
			"        <Region Name=\"金沙县\" Code=\"24\" />\n" +
			"        <Region Name=\"织金县\" Code=\"25\" />\n" +
			"        <Region Name=\"纳雍县\" Code=\"26\" />\n" +
			"        <Region Name=\"威宁彝族回族苗族自治县\" Code=\"27\" />\n" +
			"        <Region Name=\"赫章县\" Code=\"28\" />\n" +
			"      </City>\n" +
			"      <City Name=\"黔东南\" Code=\"26\">\n" +
			"        <Region Name=\"凯里市\" Code=\"1\" />\n" +
			"        <Region Name=\"黄平县\" Code=\"22\" />\n" +
			"        <Region Name=\"施秉县\" Code=\"23\" />\n" +
			"        <Region Name=\"三穗县\" Code=\"24\" />\n" +
			"        <Region Name=\"镇远县\" Code=\"25\" />\n" +
			"        <Region Name=\"岑巩县\" Code=\"26\" />\n" +
			"        <Region Name=\"天柱县\" Code=\"27\" />\n" +
			"        <Region Name=\"锦屏县\" Code=\"28\" />\n" +
			"        <Region Name=\"剑河县\" Code=\"29\" />\n" +
			"        <Region Name=\"台江县\" Code=\"30\" />\n" +
			"        <Region Name=\"黎平县\" Code=\"31\" />\n" +
			"        <Region Name=\"榕江县\" Code=\"32\" />\n" +
			"        <Region Name=\"从江县\" Code=\"33\" />\n" +
			"        <Region Name=\"雷山县\" Code=\"34\" />\n" +
			"        <Region Name=\"麻江县\" Code=\"35\" />\n" +
			"        <Region Name=\"丹寨县\" Code=\"36\" />\n" +
			"      </City>\n" +
			"      <City Name=\"黔南\" Code=\"27\">\n" +
			"        <Region Name=\"都匀市\" Code=\"1\" />\n" +
			"        <Region Name=\"福泉市\" Code=\"2\" />\n" +
			"        <Region Name=\"荔波县\" Code=\"22\" />\n" +
			"        <Region Name=\"贵定县\" Code=\"23\" />\n" +
			"        <Region Name=\"瓮安县\" Code=\"25\" />\n" +
			"        <Region Name=\"独山县\" Code=\"26\" />\n" +
			"        <Region Name=\"平塘县\" Code=\"27\" />\n" +
			"        <Region Name=\"罗甸县\" Code=\"28\" />\n" +
			"        <Region Name=\"长顺县\" Code=\"29\" />\n" +
			"        <Region Name=\"龙里县\" Code=\"30\" />\n" +
			"        <Region Name=\"惠水县\" Code=\"31\" />\n" +
			"        <Region Name=\"三都水族自治县\" Code=\"32\" />\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"云南\" Code=\"53\">\n" +
			"      <City Name=\"昆明\" Code=\"1\">\n" +
			"        <Region Name=\"五华区\" Code=\"2\" />\n" +
			"        <Region Name=\"盘龙区\" Code=\"3\" />\n" +
			"        <Region Name=\"官渡区\" Code=\"11\" />\n" +
			"        <Region Name=\"西山区\" Code=\"12\" />\n" +
			"        <Region Name=\"东川区\" Code=\"13\" />\n" +
			"        <Region Name=\"呈贡县\" Code=\"21\" />\n" +
			"        <Region Name=\"晋宁县\" Code=\"22\" />\n" +
			"        <Region Name=\"富民县\" Code=\"24\" />\n" +
			"        <Region Name=\"宜良县\" Code=\"25\" />\n" +
			"        <Region Name=\"石林彝族自治县\" Code=\"26\" />\n" +
			"        <Region Name=\"嵩明县\" Code=\"27\" />\n" +
			"        <Region Name=\"禄劝彝族苗族自治县\" Code=\"28\" />\n" +
			"        <Region Name=\"寻甸回族彝族自治县\" Code=\"29\" />\n" +
			"        <Region Name=\"安宁市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"曲靖\" Code=\"3\">\n" +
			"        <Region Name=\"麒麟区\" Code=\"2\" />\n" +
			"        <Region Name=\"马龙县\" Code=\"21\" />\n" +
			"        <Region Name=\"陆良县\" Code=\"22\" />\n" +
			"        <Region Name=\"师宗县\" Code=\"23\" />\n" +
			"        <Region Name=\"罗平县\" Code=\"24\" />\n" +
			"        <Region Name=\"富源县\" Code=\"25\" />\n" +
			"        <Region Name=\"会泽县\" Code=\"26\" />\n" +
			"        <Region Name=\"沾益县\" Code=\"28\" />\n" +
			"        <Region Name=\"宣威市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"玉溪\" Code=\"4\">\n" +
			"        <Region Name=\"红塔区\" Code=\"2\" />\n" +
			"        <Region Name=\"江川县\" Code=\"21\" />\n" +
			"        <Region Name=\"澄江县\" Code=\"22\" />\n" +
			"        <Region Name=\"通海县\" Code=\"23\" />\n" +
			"        <Region Name=\"华宁县\" Code=\"24\" />\n" +
			"        <Region Name=\"易门县\" Code=\"25\" />\n" +
			"        <Region Name=\"峨山彝族自治县\" Code=\"26\" />\n" +
			"        <Region Name=\"新平彝族傣族自治县\" Code=\"27\" />\n" +
			"        <Region Name=\"元江哈尼族彝族傣族自治县\" Code=\"28\" />\n" +
			"      </City>\n" +
			"      <City Name=\"保山\" Code=\"5\">\n" +
			"        <Region Name=\"隆阳区\" Code=\"2\" />\n" +
			"        <Region Name=\"施甸县\" Code=\"21\" />\n" +
			"        <Region Name=\"腾冲县\" Code=\"22\" />\n" +
			"        <Region Name=\"龙陵县\" Code=\"23\" />\n" +
			"        <Region Name=\"昌宁县\" Code=\"24\" />\n" +
			"      </City>\n" +
			"      <City Name=\"昭通\" Code=\"6\">\n" +
			"        <Region Name=\"昭阳区\" Code=\"2\" />\n" +
			"        <Region Name=\"鲁甸县\" Code=\"21\" />\n" +
			"        <Region Name=\"巧家县\" Code=\"22\" />\n" +
			"        <Region Name=\"盐津县\" Code=\"23\" />\n" +
			"        <Region Name=\"大关县\" Code=\"24\" />\n" +
			"        <Region Name=\"永善县\" Code=\"25\" />\n" +
			"        <Region Name=\"绥江县\" Code=\"26\" />\n" +
			"        <Region Name=\"镇雄县\" Code=\"27\" />\n" +
			"        <Region Name=\"彝良县\" Code=\"28\" />\n" +
			"        <Region Name=\"威信县\" Code=\"29\" />\n" +
			"        <Region Name=\"水富县\" Code=\"30\" />\n" +
			"      </City>\n" +
			"      <City Name=\"丽江\" Code=\"7\">\n" +
			"        <Region Name=\"古城区\" Code=\"2\" />\n" +
			"        <Region Name=\"玉龙纳西族自治县\" Code=\"21\" />\n" +
			"        <Region Name=\"永胜县\" Code=\"22\" />\n" +
			"        <Region Name=\"华坪县\" Code=\"23\" />\n" +
			"        <Region Name=\"宁蒗彝族自治县\" Code=\"24\" />\n" +
			"      </City>\n" +
			"      <City Name=\"普洱\" Code=\"8\">\n" +
			"        <Region Name=\"思茅区\" Code=\"2\" />\n" +
			"        <Region Name=\"宁洱哈尼族彝族自治县\" Code=\"21\" />\n" +
			"        <Region Name=\"墨江哈尼族自治县\" Code=\"22\" />\n" +
			"        <Region Name=\"景东彝族自治县\" Code=\"23\" />\n" +
			"        <Region Name=\"景谷傣族彝族自治县\" Code=\"24\" />\n" +
			"        <Region Name=\"镇沅彝族哈尼族拉祜族自治县\" Code=\"25\" />\n" +
			"        <Region Name=\"江城哈尼族彝族自治县\" Code=\"26\" />\n" +
			"        <Region Name=\"孟连傣族拉祜族佤族自治县\" Code=\"27\" />\n" +
			"        <Region Name=\"澜沧拉祜族自治县\" Code=\"28\" />\n" +
			"        <Region Name=\"西盟佤族自治县\" Code=\"29\" />\n" +
			"      </City>\n" +
			"      <City Name=\"临沧\" Code=\"9\">\n" +
			"        <Region Name=\"临翔区\" Code=\"2\" />\n" +
			"        <Region Name=\"凤庆县\" Code=\"21\" />\n" +
			"        <Region Name=\"云　县\" Code=\"22\" />\n" +
			"        <Region Name=\"永德县\" Code=\"23\" />\n" +
			"        <Region Name=\"镇康县\" Code=\"24\" />\n" +
			"        <Region Name=\"双江拉祜族佤族布朗族傣族自治县\" Code=\"25\" />\n" +
			"        <Region Name=\"耿马傣族佤族自治县\" Code=\"26\" />\n" +
			"        <Region Name=\"沧源佤族自治县\" Code=\"27\" />\n" +
			"      </City>\n" +
			"      <City Name=\"楚雄\" Code=\"23\">\n" +
			"        <Region Name=\"楚雄市\" Code=\"1\" />\n" +
			"        <Region Name=\"双柏县\" Code=\"22\" />\n" +
			"        <Region Name=\"牟定县\" Code=\"23\" />\n" +
			"        <Region Name=\"南华县\" Code=\"24\" />\n" +
			"        <Region Name=\"姚安县\" Code=\"25\" />\n" +
			"        <Region Name=\"大姚县\" Code=\"26\" />\n" +
			"        <Region Name=\"永仁县\" Code=\"27\" />\n" +
			"        <Region Name=\"元谋县\" Code=\"28\" />\n" +
			"        <Region Name=\"武定县\" Code=\"29\" />\n" +
			"        <Region Name=\"禄丰县\" Code=\"31\" />\n" +
			"      </City>\n" +
			"      <City Name=\"红河\" Code=\"25\">\n" +
			"        <Region Name=\"个旧市\" Code=\"1\" />\n" +
			"        <Region Name=\"开远市\" Code=\"2\" />\n" +
			"        <Region Name=\"蒙自县\" Code=\"22\" />\n" +
			"        <Region Name=\"屏边苗族自治县\" Code=\"23\" />\n" +
			"        <Region Name=\"建水县\" Code=\"24\" />\n" +
			"        <Region Name=\"石屏县\" Code=\"25\" />\n" +
			"        <Region Name=\"弥勒县\" Code=\"26\" />\n" +
			"        <Region Name=\"泸西县\" Code=\"27\" />\n" +
			"        <Region Name=\"元阳县\" Code=\"28\" />\n" +
			"        <Region Name=\"红河县\" Code=\"29\" />\n" +
			"        <Region Name=\"金平苗族瑶族傣族自治县\" Code=\"30\" />\n" +
			"        <Region Name=\"绿春县\" Code=\"31\" />\n" +
			"        <Region Name=\"河口瑶族自治县\" Code=\"32\" />\n" +
			"      </City>\n" +
			"      <City Name=\"文山\" Code=\"26\">\n" +
			"        <Region Name=\"文山县\" Code=\"21\" />\n" +
			"        <Region Name=\"砚山县\" Code=\"22\" />\n" +
			"        <Region Name=\"西畴县\" Code=\"23\" />\n" +
			"        <Region Name=\"麻栗坡县\" Code=\"24\" />\n" +
			"        <Region Name=\"马关县\" Code=\"25\" />\n" +
			"        <Region Name=\"丘北县\" Code=\"26\" />\n" +
			"        <Region Name=\"广南县\" Code=\"27\" />\n" +
			"        <Region Name=\"富宁县\" Code=\"28\" />\n" +
			"      </City>\n" +
			"      <City Name=\"西双版纳\" Code=\"28\">\n" +
			"        <Region Name=\"景洪市\" Code=\"1\" />\n" +
			"        <Region Name=\"勐海县\" Code=\"22\" />\n" +
			"        <Region Name=\"勐腊县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"大理\" Code=\"29\">\n" +
			"        <Region Name=\"大理市\" Code=\"1\" />\n" +
			"        <Region Name=\"漾濞彝族自治县\" Code=\"22\" />\n" +
			"        <Region Name=\"祥云县\" Code=\"23\" />\n" +
			"        <Region Name=\"宾川县\" Code=\"24\" />\n" +
			"        <Region Name=\"弥渡县\" Code=\"25\" />\n" +
			"        <Region Name=\"南涧彝族自治县\" Code=\"26\" />\n" +
			"        <Region Name=\"巍山彝族回族自治县\" Code=\"27\" />\n" +
			"        <Region Name=\"永平县\" Code=\"28\" />\n" +
			"        <Region Name=\"云龙县\" Code=\"29\" />\n" +
			"        <Region Name=\"洱源县\" Code=\"30\" />\n" +
			"        <Region Name=\"剑川县\" Code=\"31\" />\n" +
			"        <Region Name=\"鹤庆县\" Code=\"32\" />\n" +
			"      </City>\n" +
			"      <City Name=\"德宏\" Code=\"31\">\n" +
			"        <Region Name=\"瑞丽市\" Code=\"2\" />\n" +
			"        <Region Name=\"潞西市\" Code=\"3\" />\n" +
			"        <Region Name=\"梁河县\" Code=\"22\" />\n" +
			"        <Region Name=\"盈江县\" Code=\"23\" />\n" +
			"        <Region Name=\"陇川县\" Code=\"24\" />\n" +
			"      </City>\n" +
			"      <City Name=\"怒江\" Code=\"33\">\n" +
			"        <Region Name=\"泸水县\" Code=\"21\" />\n" +
			"        <Region Name=\"福贡县\" Code=\"23\" />\n" +
			"        <Region Name=\"贡山独龙族怒族自治县\" Code=\"24\" />\n" +
			"        <Region Name=\"兰坪白族普米族自治县\" Code=\"25\" />\n" +
			"      </City>\n" +
			"      <City Name=\"迪庆\" Code=\"34\">\n" +
			"        <Region Name=\"香格里拉县\" Code=\"21\" />\n" +
			"        <Region Name=\"德钦县\" Code=\"22\" />\n" +
			"        <Region Name=\"维西傈僳族自治县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"西藏\" Code=\"54\">\n" +
			"      <City Name=\"拉萨\" Code=\"1\">\n" +
			"        <Region Name=\"城关区\" Code=\"2\" />\n" +
			"        <Region Name=\"林周县\" Code=\"21\" />\n" +
			"        <Region Name=\"当雄县\" Code=\"22\" />\n" +
			"        <Region Name=\"尼木县\" Code=\"23\" />\n" +
			"        <Region Name=\"曲水县\" Code=\"24\" />\n" +
			"        <Region Name=\"堆龙德庆县\" Code=\"25\" />\n" +
			"        <Region Name=\"达孜县\" Code=\"26\" />\n" +
			"        <Region Name=\"墨竹工卡县\" Code=\"27\" />\n" +
			"      </City>\n" +
			"      <City Name=\"昌都\" Code=\"21\">\n" +
			"        <Region Name=\"昌都县\" Code=\"21\" />\n" +
			"        <Region Name=\"江达县\" Code=\"22\" />\n" +
			"        <Region Name=\"贡觉县\" Code=\"23\" />\n" +
			"        <Region Name=\"类乌齐县\" Code=\"24\" />\n" +
			"        <Region Name=\"丁青县\" Code=\"25\" />\n" +
			"        <Region Name=\"察雅县\" Code=\"26\" />\n" +
			"        <Region Name=\"八宿县\" Code=\"27\" />\n" +
			"        <Region Name=\"左贡县\" Code=\"28\" />\n" +
			"        <Region Name=\"芒康县\" Code=\"29\" />\n" +
			"        <Region Name=\"洛隆县\" Code=\"32\" />\n" +
			"        <Region Name=\"边坝县\" Code=\"33\" />\n" +
			"      </City>\n" +
			"      <City Name=\"山南\" Code=\"22\">\n" +
			"        <Region Name=\"乃东县\" Code=\"21\" />\n" +
			"        <Region Name=\"扎囊县\" Code=\"22\" />\n" +
			"        <Region Name=\"贡嘎县\" Code=\"23\" />\n" +
			"        <Region Name=\"桑日县\" Code=\"24\" />\n" +
			"        <Region Name=\"琼结县\" Code=\"25\" />\n" +
			"        <Region Name=\"曲松县\" Code=\"26\" />\n" +
			"        <Region Name=\"措美县\" Code=\"27\" />\n" +
			"        <Region Name=\"洛扎县\" Code=\"28\" />\n" +
			"        <Region Name=\"加查县\" Code=\"29\" />\n" +
			"        <Region Name=\"隆子县\" Code=\"31\" />\n" +
			"        <Region Name=\"错那县\" Code=\"32\" />\n" +
			"        <Region Name=\"浪卡子县\" Code=\"33\" />\n" +
			"      </City>\n" +
			"      <City Name=\"日喀则\" Code=\"23\">\n" +
			"        <Region Name=\"日喀则市\" Code=\"1\" />\n" +
			"        <Region Name=\"南木林县\" Code=\"22\" />\n" +
			"        <Region Name=\"江孜县\" Code=\"23\" />\n" +
			"        <Region Name=\"定日县\" Code=\"24\" />\n" +
			"        <Region Name=\"萨迦县\" Code=\"25\" />\n" +
			"        <Region Name=\"拉孜县\" Code=\"26\" />\n" +
			"        <Region Name=\"昂仁县\" Code=\"27\" />\n" +
			"        <Region Name=\"谢通门县\" Code=\"28\" />\n" +
			"        <Region Name=\"白朗县\" Code=\"29\" />\n" +
			"        <Region Name=\"仁布县\" Code=\"30\" />\n" +
			"        <Region Name=\"康马县\" Code=\"31\" />\n" +
			"        <Region Name=\"定结县\" Code=\"32\" />\n" +
			"        <Region Name=\"仲巴县\" Code=\"33\" />\n" +
			"        <Region Name=\"亚东县\" Code=\"34\" />\n" +
			"        <Region Name=\"吉隆县\" Code=\"35\" />\n" +
			"        <Region Name=\"聂拉木县\" Code=\"36\" />\n" +
			"        <Region Name=\"萨嘎县\" Code=\"37\" />\n" +
			"        <Region Name=\"岗巴县\" Code=\"38\" />\n" +
			"      </City>\n" +
			"      <City Name=\"那曲\" Code=\"24\">\n" +
			"        <Region Name=\"那曲县\" Code=\"21\" />\n" +
			"        <Region Name=\"嘉黎县\" Code=\"22\" />\n" +
			"        <Region Name=\"比如县\" Code=\"23\" />\n" +
			"        <Region Name=\"聂荣县\" Code=\"24\" />\n" +
			"        <Region Name=\"安多县\" Code=\"25\" />\n" +
			"        <Region Name=\"申扎县\" Code=\"26\" />\n" +
			"        <Region Name=\"索　县\" Code=\"27\" />\n" +
			"        <Region Name=\"班戈县\" Code=\"28\" />\n" +
			"        <Region Name=\"巴青县\" Code=\"29\" />\n" +
			"        <Region Name=\"尼玛县\" Code=\"30\" />\n" +
			"      </City>\n" +
			"      <City Name=\"阿里\" Code=\"25\">\n" +
			"        <Region Name=\"普兰县\" Code=\"21\" />\n" +
			"        <Region Name=\"札达县\" Code=\"22\" />\n" +
			"        <Region Name=\"噶尔县\" Code=\"23\" />\n" +
			"        <Region Name=\"日土县\" Code=\"24\" />\n" +
			"        <Region Name=\"革吉县\" Code=\"25\" />\n" +
			"        <Region Name=\"改则县\" Code=\"26\" />\n" +
			"        <Region Name=\"措勤县\" Code=\"27\" />\n" +
			"      </City>\n" +
			"      <City Name=\"林芝\" Code=\"26\">\n" +
			"        <Region Name=\"林芝县\" Code=\"21\" />\n" +
			"        <Region Name=\"工布江达县\" Code=\"22\" />\n" +
			"        <Region Name=\"米林县\" Code=\"23\" />\n" +
			"        <Region Name=\"墨脱县\" Code=\"24\" />\n" +
			"        <Region Name=\"波密县\" Code=\"25\" />\n" +
			"        <Region Name=\"察隅县\" Code=\"26\" />\n" +
			"        <Region Name=\"朗　县\" Code=\"27\" />\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"陕西\" Code=\"61\">\n" +
			"      <City Name=\"西安\" Code=\"1\">\n" +
			"        <Region Name=\"新城区\" Code=\"2\" />\n" +
			"        <Region Name=\"碑林区\" Code=\"3\" />\n" +
			"        <Region Name=\"莲湖区\" Code=\"4\" />\n" +
			"        <Region Name=\"灞桥区\" Code=\"11\" />\n" +
			"        <Region Name=\"未央区\" Code=\"12\" />\n" +
			"        <Region Name=\"雁塔区\" Code=\"13\" />\n" +
			"        <Region Name=\"阎良区\" Code=\"14\" />\n" +
			"        <Region Name=\"临潼区\" Code=\"15\" />\n" +
			"        <Region Name=\"长安区\" Code=\"16\" />\n" +
			"        <Region Name=\"蓝田县\" Code=\"22\" />\n" +
			"        <Region Name=\"周至县\" Code=\"24\" />\n" +
			"        <Region Name=\"户　县\" Code=\"25\" />\n" +
			"        <Region Name=\"高陵县\" Code=\"26\" />\n" +
			"      </City>\n" +
			"      <City Name=\"铜川\" Code=\"2\">\n" +
			"        <Region Name=\"王益区\" Code=\"2\" />\n" +
			"        <Region Name=\"印台区\" Code=\"3\" />\n" +
			"        <Region Name=\"耀州区\" Code=\"4\" />\n" +
			"        <Region Name=\"宜君县\" Code=\"22\" />\n" +
			"      </City>\n" +
			"      <City Name=\"宝鸡\" Code=\"3\">\n" +
			"        <Region Name=\"渭滨区\" Code=\"2\" />\n" +
			"        <Region Name=\"金台区\" Code=\"3\" />\n" +
			"        <Region Name=\"陈仓区\" Code=\"4\" />\n" +
			"        <Region Name=\"凤翔县\" Code=\"22\" />\n" +
			"        <Region Name=\"岐山县\" Code=\"23\" />\n" +
			"        <Region Name=\"扶风县\" Code=\"24\" />\n" +
			"        <Region Name=\"眉　县\" Code=\"26\" />\n" +
			"        <Region Name=\"陇　县\" Code=\"27\" />\n" +
			"        <Region Name=\"千阳县\" Code=\"28\" />\n" +
			"        <Region Name=\"麟游县\" Code=\"29\" />\n" +
			"        <Region Name=\"凤　县\" Code=\"30\" />\n" +
			"        <Region Name=\"太白县\" Code=\"31\" />\n" +
			"      </City>\n" +
			"      <City Name=\"咸阳\" Code=\"4\">\n" +
			"        <Region Name=\"秦都区\" Code=\"2\" />\n" +
			"        <Region Name=\"杨凌区\" Code=\"3\" />\n" +
			"        <Region Name=\"渭城区\" Code=\"4\" />\n" +
			"        <Region Name=\"三原县\" Code=\"22\" />\n" +
			"        <Region Name=\"泾阳县\" Code=\"23\" />\n" +
			"        <Region Name=\"乾　县\" Code=\"24\" />\n" +
			"        <Region Name=\"礼泉县\" Code=\"25\" />\n" +
			"        <Region Name=\"永寿县\" Code=\"26\" />\n" +
			"        <Region Name=\"彬　县\" Code=\"27\" />\n" +
			"        <Region Name=\"长武县\" Code=\"28\" />\n" +
			"        <Region Name=\"旬邑县\" Code=\"29\" />\n" +
			"        <Region Name=\"淳化县\" Code=\"30\" />\n" +
			"        <Region Name=\"武功县\" Code=\"31\" />\n" +
			"        <Region Name=\"兴平市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"渭南\" Code=\"5\">\n" +
			"        <Region Name=\"临渭区\" Code=\"2\" />\n" +
			"        <Region Name=\"华　县\" Code=\"21\" />\n" +
			"        <Region Name=\"潼关县\" Code=\"22\" />\n" +
			"        <Region Name=\"大荔县\" Code=\"23\" />\n" +
			"        <Region Name=\"合阳县\" Code=\"24\" />\n" +
			"        <Region Name=\"澄城县\" Code=\"25\" />\n" +
			"        <Region Name=\"蒲城县\" Code=\"26\" />\n" +
			"        <Region Name=\"白水县\" Code=\"27\" />\n" +
			"        <Region Name=\"富平县\" Code=\"28\" />\n" +
			"        <Region Name=\"韩城市\" Code=\"81\" />\n" +
			"        <Region Name=\"华阴市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"延安\" Code=\"6\">\n" +
			"        <Region Name=\"宝塔区\" Code=\"2\" />\n" +
			"        <Region Name=\"延长县\" Code=\"21\" />\n" +
			"        <Region Name=\"延川县\" Code=\"22\" />\n" +
			"        <Region Name=\"子长县\" Code=\"23\" />\n" +
			"        <Region Name=\"安塞县\" Code=\"24\" />\n" +
			"        <Region Name=\"志丹县\" Code=\"25\" />\n" +
			"        <Region Name=\"吴起县\" Code=\"26\" />\n" +
			"        <Region Name=\"甘泉县\" Code=\"27\" />\n" +
			"        <Region Name=\"富　县\" Code=\"28\" />\n" +
			"        <Region Name=\"洛川县\" Code=\"29\" />\n" +
			"        <Region Name=\"宜川县\" Code=\"30\" />\n" +
			"        <Region Name=\"黄龙县\" Code=\"31\" />\n" +
			"        <Region Name=\"黄陵县\" Code=\"32\" />\n" +
			"      </City>\n" +
			"      <City Name=\"汉中\" Code=\"7\">\n" +
			"        <Region Name=\"汉台区\" Code=\"2\" />\n" +
			"        <Region Name=\"南郑县\" Code=\"21\" />\n" +
			"        <Region Name=\"城固县\" Code=\"22\" />\n" +
			"        <Region Name=\"洋　县\" Code=\"23\" />\n" +
			"        <Region Name=\"西乡县\" Code=\"24\" />\n" +
			"        <Region Name=\"勉　县\" Code=\"25\" />\n" +
			"        <Region Name=\"宁强县\" Code=\"26\" />\n" +
			"        <Region Name=\"略阳县\" Code=\"27\" />\n" +
			"        <Region Name=\"镇巴县\" Code=\"28\" />\n" +
			"        <Region Name=\"留坝县\" Code=\"29\" />\n" +
			"        <Region Name=\"佛坪县\" Code=\"30\" />\n" +
			"      </City>\n" +
			"      <City Name=\"榆林\" Code=\"8\">\n" +
			"        <Region Name=\"榆阳区\" Code=\"2\" />\n" +
			"        <Region Name=\"神木县\" Code=\"21\" />\n" +
			"        <Region Name=\"府谷县\" Code=\"22\" />\n" +
			"        <Region Name=\"横山县\" Code=\"23\" />\n" +
			"        <Region Name=\"靖边县\" Code=\"24\" />\n" +
			"        <Region Name=\"定边县\" Code=\"25\" />\n" +
			"        <Region Name=\"绥德县\" Code=\"26\" />\n" +
			"        <Region Name=\"米脂县\" Code=\"27\" />\n" +
			"        <Region Name=\"佳　县\" Code=\"28\" />\n" +
			"        <Region Name=\"吴堡县\" Code=\"29\" />\n" +
			"        <Region Name=\"清涧县\" Code=\"30\" />\n" +
			"        <Region Name=\"子洲县\" Code=\"31\" />\n" +
			"      </City>\n" +
			"      <City Name=\"安康\" Code=\"9\">\n" +
			"        <Region Name=\"汉滨区\" Code=\"2\" />\n" +
			"        <Region Name=\"汉阴县\" Code=\"21\" />\n" +
			"        <Region Name=\"石泉县\" Code=\"22\" />\n" +
			"        <Region Name=\"宁陕县\" Code=\"23\" />\n" +
			"        <Region Name=\"紫阳县\" Code=\"24\" />\n" +
			"        <Region Name=\"岚皋县\" Code=\"25\" />\n" +
			"        <Region Name=\"平利县\" Code=\"26\" />\n" +
			"        <Region Name=\"镇坪县\" Code=\"27\" />\n" +
			"        <Region Name=\"旬阳县\" Code=\"28\" />\n" +
			"        <Region Name=\"白河县\" Code=\"29\" />\n" +
			"      </City>\n" +
			"      <City Name=\"商洛\" Code=\"10\">\n" +
			"        <Region Name=\"商州区\" Code=\"2\" />\n" +
			"        <Region Name=\"洛南县\" Code=\"21\" />\n" +
			"        <Region Name=\"丹凤县\" Code=\"22\" />\n" +
			"        <Region Name=\"商南县\" Code=\"23\" />\n" +
			"        <Region Name=\"山阳县\" Code=\"24\" />\n" +
			"        <Region Name=\"镇安县\" Code=\"25\" />\n" +
			"        <Region Name=\"柞水县\" Code=\"26\" />\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"甘肃\" Code=\"62\">\n" +
			"      <City Name=\"兰州市\" Code=\"1\">\n" +
			"        <Region Name=\"城关区\" Code=\"2\" />\n" +
			"        <Region Name=\"七里河区\" Code=\"3\" />\n" +
			"        <Region Name=\"西固区\" Code=\"4\" />\n" +
			"        <Region Name=\"安宁区\" Code=\"5\" />\n" +
			"        <Region Name=\"红古区\" Code=\"11\" />\n" +
			"        <Region Name=\"永登县\" Code=\"21\" />\n" +
			"        <Region Name=\"皋兰县\" Code=\"22\" />\n" +
			"        <Region Name=\"榆中县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"嘉峪关\" Code=\"2\">\n" +
			"        <Region Name=\"嘉峪关市\" Code=\"0\" />\n" +
			"      </City>\n" +
			"      <City Name=\"金昌\" Code=\"3\">\n" +
			"        <Region Name=\"金川区\" Code=\"2\" />\n" +
			"        <Region Name=\"永昌县\" Code=\"21\" />\n" +
			"      </City>\n" +
			"      <City Name=\"白银\" Code=\"4\">\n" +
			"        <Region Name=\"白银区\" Code=\"2\" />\n" +
			"        <Region Name=\"平川区\" Code=\"3\" />\n" +
			"        <Region Name=\"靖远县\" Code=\"21\" />\n" +
			"        <Region Name=\"会宁县\" Code=\"22\" />\n" +
			"        <Region Name=\"景泰县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"天水\" Code=\"5\">\n" +
			"        <Region Name=\"秦州区\" Code=\"2\" />\n" +
			"        <Region Name=\"麦积区\" Code=\"3\" />\n" +
			"        <Region Name=\"清水县\" Code=\"21\" />\n" +
			"        <Region Name=\"秦安县\" Code=\"22\" />\n" +
			"        <Region Name=\"甘谷县\" Code=\"23\" />\n" +
			"        <Region Name=\"武山县\" Code=\"24\" />\n" +
			"        <Region Name=\"张家川回族自治县\" Code=\"25\" />\n" +
			"      </City>\n" +
			"      <City Name=\"武威\" Code=\"6\">\n" +
			"        <Region Name=\"凉州区\" Code=\"2\" />\n" +
			"        <Region Name=\"民勤县\" Code=\"21\" />\n" +
			"        <Region Name=\"古浪县\" Code=\"22\" />\n" +
			"        <Region Name=\"天祝藏族自治县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"张掖\" Code=\"7\">\n" +
			"        <Region Name=\"甘州区\" Code=\"2\" />\n" +
			"        <Region Name=\"肃南裕固族自治县\" Code=\"21\" />\n" +
			"        <Region Name=\"民乐县\" Code=\"22\" />\n" +
			"        <Region Name=\"临泽县\" Code=\"23\" />\n" +
			"        <Region Name=\"高台县\" Code=\"24\" />\n" +
			"        <Region Name=\"山丹县\" Code=\"25\" />\n" +
			"      </City>\n" +
			"      <City Name=\"平凉\" Code=\"8\">\n" +
			"        <Region Name=\"崆峒区\" Code=\"2\" />\n" +
			"        <Region Name=\"泾川县\" Code=\"21\" />\n" +
			"        <Region Name=\"灵台县\" Code=\"22\" />\n" +
			"        <Region Name=\"崇信县\" Code=\"23\" />\n" +
			"        <Region Name=\"华亭县\" Code=\"24\" />\n" +
			"        <Region Name=\"庄浪县\" Code=\"25\" />\n" +
			"        <Region Name=\"静宁县\" Code=\"26\" />\n" +
			"      </City>\n" +
			"      <City Name=\"酒泉\" Code=\"9\">\n" +
			"        <Region Name=\"肃州区\" Code=\"2\" />\n" +
			"        <Region Name=\"金塔县\" Code=\"21\" />\n" +
			"        <Region Name=\"瓜州县\" Code=\"22\" />\n" +
			"        <Region Name=\"肃北蒙古族自治县\" Code=\"23\" />\n" +
			"        <Region Name=\"阿克塞哈萨克族自治县\" Code=\"24\" />\n" +
			"        <Region Name=\"玉门市\" Code=\"81\" />\n" +
			"        <Region Name=\"敦煌市\" Code=\"82\" />\n" +
			"      </City>\n" +
			"      <City Name=\"庆阳\" Code=\"10\">\n" +
			"        <Region Name=\"西峰区\" Code=\"2\" />\n" +
			"        <Region Name=\"庆城县\" Code=\"21\" />\n" +
			"        <Region Name=\"环　县\" Code=\"22\" />\n" +
			"        <Region Name=\"华池县\" Code=\"23\" />\n" +
			"        <Region Name=\"合水县\" Code=\"24\" />\n" +
			"        <Region Name=\"正宁县\" Code=\"25\" />\n" +
			"        <Region Name=\"宁　县\" Code=\"26\" />\n" +
			"        <Region Name=\"镇原县\" Code=\"27\" />\n" +
			"      </City>\n" +
			"      <City Name=\"定西\" Code=\"11\">\n" +
			"        <Region Name=\"安定区\" Code=\"2\" />\n" +
			"        <Region Name=\"通渭县\" Code=\"21\" />\n" +
			"        <Region Name=\"陇西县\" Code=\"22\" />\n" +
			"        <Region Name=\"渭源县\" Code=\"23\" />\n" +
			"        <Region Name=\"临洮县\" Code=\"24\" />\n" +
			"        <Region Name=\"漳　县\" Code=\"25\" />\n" +
			"        <Region Name=\"岷　县\" Code=\"26\" />\n" +
			"      </City>\n" +
			"      <City Name=\"陇南\" Code=\"12\">\n" +
			"        <Region Name=\"武都区\" Code=\"2\" />\n" +
			"        <Region Name=\"成　县\" Code=\"21\" />\n" +
			"        <Region Name=\"文　县\" Code=\"22\" />\n" +
			"        <Region Name=\"宕昌县\" Code=\"23\" />\n" +
			"        <Region Name=\"康　县\" Code=\"24\" />\n" +
			"        <Region Name=\"西和县\" Code=\"25\" />\n" +
			"        <Region Name=\"礼　县\" Code=\"26\" />\n" +
			"        <Region Name=\"徽　县\" Code=\"27\" />\n" +
			"        <Region Name=\"两当县\" Code=\"28\" />\n" +
			"      </City>\n" +
			"      <City Name=\"临夏\" Code=\"29\">\n" +
			"        <Region Name=\"临夏市\" Code=\"1\" />\n" +
			"        <Region Name=\"临夏县\" Code=\"21\" />\n" +
			"        <Region Name=\"康乐县\" Code=\"22\" />\n" +
			"        <Region Name=\"永靖县\" Code=\"23\" />\n" +
			"        <Region Name=\"广河县\" Code=\"24\" />\n" +
			"        <Region Name=\"和政县\" Code=\"25\" />\n" +
			"        <Region Name=\"东乡族自治县\" Code=\"26\" />\n" +
			"        <Region Name=\"积石山保安族东乡族撒拉族自治县\" Code=\"27\" />\n" +
			"      </City>\n" +
			"      <City Name=\"甘南\" Code=\"30\">\n" +
			"        <Region Name=\"合作市\" Code=\"1\" />\n" +
			"        <Region Name=\"临潭县\" Code=\"21\" />\n" +
			"        <Region Name=\"卓尼县\" Code=\"22\" />\n" +
			"        <Region Name=\"舟曲县\" Code=\"23\" />\n" +
			"        <Region Name=\"迭部县\" Code=\"24\" />\n" +
			"        <Region Name=\"玛曲县\" Code=\"25\" />\n" +
			"        <Region Name=\"碌曲县\" Code=\"26\" />\n" +
			"        <Region Name=\"夏河县\" Code=\"27\" />\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"青海\" Code=\"63\">\n" +
			"      <City Name=\"西宁\" Code=\"1\">\n" +
			"        <Region Name=\"城东区\" Code=\"2\" />\n" +
			"        <Region Name=\"城中区\" Code=\"3\" />\n" +
			"        <Region Name=\"城西区\" Code=\"4\" />\n" +
			"        <Region Name=\"城北区\" Code=\"5\" />\n" +
			"        <Region Name=\"大通回族土族自治县\" Code=\"21\" />\n" +
			"        <Region Name=\"湟中县\" Code=\"22\" />\n" +
			"        <Region Name=\"湟源县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"海东\" Code=\"21\">\n" +
			"        <Region Name=\"平安县\" Code=\"21\" />\n" +
			"        <Region Name=\"民和回族土族自治县\" Code=\"22\" />\n" +
			"        <Region Name=\"乐都县\" Code=\"23\" />\n" +
			"        <Region Name=\"互助土族自治县\" Code=\"26\" />\n" +
			"        <Region Name=\"化隆回族自治县\" Code=\"27\" />\n" +
			"        <Region Name=\"循化撒拉族自治县\" Code=\"28\" />\n" +
			"      </City>\n" +
			"      <City Name=\"海北\" Code=\"22\">\n" +
			"        <Region Name=\"门源回族自治县\" Code=\"21\" />\n" +
			"        <Region Name=\"祁连县\" Code=\"22\" />\n" +
			"        <Region Name=\"海晏县\" Code=\"23\" />\n" +
			"        <Region Name=\"刚察县\" Code=\"24\" />\n" +
			"      </City>\n" +
			"      <City Name=\"黄南\" Code=\"23\">\n" +
			"        <Region Name=\"同仁县\" Code=\"21\" />\n" +
			"        <Region Name=\"尖扎县\" Code=\"22\" />\n" +
			"        <Region Name=\"泽库县\" Code=\"23\" />\n" +
			"        <Region Name=\"河南蒙古族自治县\" Code=\"24\" />\n" +
			"      </City>\n" +
			"      <City Name=\"海南\" Code=\"25\">\n" +
			"        <Region Name=\"共和县\" Code=\"21\" />\n" +
			"        <Region Name=\"同德县\" Code=\"22\" />\n" +
			"        <Region Name=\"贵德县\" Code=\"23\" />\n" +
			"        <Region Name=\"兴海县\" Code=\"24\" />\n" +
			"        <Region Name=\"贵南县\" Code=\"25\" />\n" +
			"      </City>\n" +
			"      <City Name=\"果洛\" Code=\"26\">\n" +
			"        <Region Name=\"玛沁县\" Code=\"21\" />\n" +
			"        <Region Name=\"班玛县\" Code=\"22\" />\n" +
			"        <Region Name=\"甘德县\" Code=\"23\" />\n" +
			"        <Region Name=\"达日县\" Code=\"24\" />\n" +
			"        <Region Name=\"久治县\" Code=\"25\" />\n" +
			"        <Region Name=\"玛多县\" Code=\"26\" />\n" +
			"      </City>\n" +
			"      <City Name=\"玉树\" Code=\"27\">\n" +
			"        <Region Name=\"玉树县\" Code=\"21\" />\n" +
			"        <Region Name=\"杂多县\" Code=\"22\" />\n" +
			"        <Region Name=\"称多县\" Code=\"23\" />\n" +
			"        <Region Name=\"治多县\" Code=\"24\" />\n" +
			"        <Region Name=\"囊谦县\" Code=\"25\" />\n" +
			"        <Region Name=\"曲麻莱县\" Code=\"26\" />\n" +
			"      </City>\n" +
			"      <City Name=\"海西\" Code=\"28\">\n" +
			"        <Region Name=\"格尔木市\" Code=\"1\" />\n" +
			"        <Region Name=\"德令哈市\" Code=\"2\" />\n" +
			"        <Region Name=\"乌兰县\" Code=\"21\" />\n" +
			"        <Region Name=\"都兰县\" Code=\"22\" />\n" +
			"        <Region Name=\"天峻县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"宁夏\" Code=\"64\">\n" +
			"      <City Name=\"银川\" Code=\"1\">\n" +
			"        <Region Name=\"兴庆区\" Code=\"4\" />\n" +
			"        <Region Name=\"西夏区\" Code=\"5\" />\n" +
			"        <Region Name=\"金凤区\" Code=\"6\" />\n" +
			"        <Region Name=\"永宁县\" Code=\"21\" />\n" +
			"        <Region Name=\"贺兰县\" Code=\"22\" />\n" +
			"        <Region Name=\"灵武市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"石嘴山\" Code=\"2\">\n" +
			"        <Region Name=\"大武口区\" Code=\"2\" />\n" +
			"        <Region Name=\"惠农区\" Code=\"5\" />\n" +
			"        <Region Name=\"平罗县\" Code=\"21\" />\n" +
			"      </City>\n" +
			"      <City Name=\"吴忠\" Code=\"3\">\n" +
			"        <Region Name=\"利通区\" Code=\"2\" />\n" +
			"        <Region Name=\"红寺堡区\" Code=\"3\" />\n" +
			"        <Region Name=\"盐池县\" Code=\"23\" />\n" +
			"        <Region Name=\"同心县\" Code=\"24\" />\n" +
			"        <Region Name=\"青铜峡市\" Code=\"81\" />\n" +
			"      </City>\n" +
			"      <City Name=\"固原\" Code=\"4\">\n" +
			"        <Region Name=\"原州区\" Code=\"2\" />\n" +
			"        <Region Name=\"西吉县\" Code=\"22\" />\n" +
			"        <Region Name=\"隆德县\" Code=\"23\" />\n" +
			"        <Region Name=\"泾源县\" Code=\"24\" />\n" +
			"        <Region Name=\"彭阳县\" Code=\"25\" />\n" +
			"      </City>\n" +
			"      <City Name=\"中卫\" Code=\"5\">\n" +
			"        <Region Name=\"沙坡头区\" Code=\"2\" />\n" +
			"        <Region Name=\"中宁县\" Code=\"21\" />\n" +
			"        <Region Name=\"海原县\" Code=\"22\" />\n" +
			"      </City>\n" +
			"    </State>\n" +
			"    <State Name=\"新疆\" Code=\"65\">\n" +
			"      <City Name=\"乌鲁木齐\" Code=\"1\">\n" +
			"        <Region Name=\"天山区\" Code=\"2\" />\n" +
			"        <Region Name=\"沙依巴克区\" Code=\"3\" />\n" +
			"        <Region Name=\"新市区\" Code=\"4\" />\n" +
			"        <Region Name=\"水磨沟区\" Code=\"5\" />\n" +
			"        <Region Name=\"头屯河区\" Code=\"6\" />\n" +
			"        <Region Name=\"达坂城区\" Code=\"7\" />\n" +
			"        <Region Name=\"米东区\" Code=\"9\" />\n" +
			"        <Region Name=\"乌鲁木齐县\" Code=\"21\" />\n" +
			"      </City>\n" +
			"      <City Name=\"克拉玛依\" Code=\"2\">\n" +
			"        <Region Name=\"独山子区\" Code=\"2\" />\n" +
			"        <Region Name=\"克拉玛依区\" Code=\"3\" />\n" +
			"        <Region Name=\"白碱滩区\" Code=\"4\" />\n" +
			"        <Region Name=\"乌尔禾区\" Code=\"5\" />\n" +
			"      </City>\n" +
			"      <City Name=\"吐鲁番\" Code=\"21\">\n" +
			"        <Region Name=\"吐鲁番市\" Code=\"1\" />\n" +
			"        <Region Name=\"鄯善县\" Code=\"22\" />\n" +
			"        <Region Name=\"托克逊县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"哈密\" Code=\"22\">\n" +
			"        <Region Name=\"哈密市\" Code=\"1\" />\n" +
			"        <Region Name=\"巴里坤哈萨克自治县\" Code=\"22\" />\n" +
			"        <Region Name=\"伊吾县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"昌吉\" Code=\"23\">\n" +
			"        <Region Name=\"昌吉市\" Code=\"1\" />\n" +
			"        <Region Name=\"阜康市\" Code=\"2\" />\n" +
			"        <Region Name=\"呼图壁县\" Code=\"23\" />\n" +
			"        <Region Name=\"玛纳斯县\" Code=\"24\" />\n" +
			"        <Region Name=\"奇台县\" Code=\"25\" />\n" +
			"        <Region Name=\"吉木萨尔县\" Code=\"27\" />\n" +
			"        <Region Name=\"木垒哈萨克自治县\" Code=\"28\" />\n" +
			"      </City>\n" +
			"      <City Name=\"博尔塔拉\" Code=\"27\">\n" +
			"        <Region Name=\"博乐市\" Code=\"1\" />\n" +
			"        <Region Name=\"精河县\" Code=\"22\" />\n" +
			"        <Region Name=\"温泉县\" Code=\"23\" />\n" +
			"      </City>\n" +
			"      <City Name=\"巴音郭楞\" Code=\"28\">\n" +
			"        <Region Name=\"库尔勒市\" Code=\"1\" />\n" +
			"        <Region Name=\"轮台县\" Code=\"22\" />\n" +
			"        <Region Name=\"尉犁县\" Code=\"23\" />\n" +
			"        <Region Name=\"若羌县\" Code=\"24\" />\n" +
			"        <Region Name=\"且末县\" Code=\"25\" />\n" +
			"        <Region Name=\"焉耆回族自治县\" Code=\"26\" />\n" +
			"        <Region Name=\"和静县\" Code=\"27\" />\n" +
			"        <Region Name=\"和硕县\" Code=\"28\" />\n" +
			"        <Region Name=\"博湖县\" Code=\"29\" />\n" +
			"      </City>\n" +
			"      <City Name=\"阿克苏\" Code=\"29\">\n" +
			"        <Region Name=\"阿克苏市\" Code=\"1\" />\n" +
			"        <Region Name=\"温宿县\" Code=\"22\" />\n" +
			"        <Region Name=\"库车县\" Code=\"23\" />\n" +
			"        <Region Name=\"沙雅县\" Code=\"24\" />\n" +
			"        <Region Name=\"新和县\" Code=\"25\" />\n" +
			"        <Region Name=\"拜城县\" Code=\"26\" />\n" +
			"        <Region Name=\"乌什县\" Code=\"27\" />\n" +
			"        <Region Name=\"阿瓦提县\" Code=\"28\" />\n" +
			"        <Region Name=\"柯坪县\" Code=\"29\" />\n" +
			"      </City>\n" +
			"      <City Name=\"克孜勒苏\" Code=\"30\">\n" +
			"        <Region Name=\"阿图什市\" Code=\"1\" />\n" +
			"        <Region Name=\"阿克陶县\" Code=\"22\" />\n" +
			"        <Region Name=\"阿合奇县\" Code=\"23\" />\n" +
			"        <Region Name=\"乌恰县\" Code=\"24\" />\n" +
			"      </City>\n" +
			"      <City Name=\"喀什\" Code=\"31\">\n" +
			"        <Region Name=\"喀什市\" Code=\"1\" />\n" +
			"        <Region Name=\"疏附县\" Code=\"21\" />\n" +
			"        <Region Name=\"疏勒县\" Code=\"22\" />\n" +
			"        <Region Name=\"英吉沙县\" Code=\"23\" />\n" +
			"        <Region Name=\"泽普县\" Code=\"24\" />\n" +
			"        <Region Name=\"莎车县\" Code=\"25\" />\n" +
			"        <Region Name=\"叶城县\" Code=\"26\" />\n" +
			"        <Region Name=\"麦盖提县\" Code=\"27\" />\n" +
			"        <Region Name=\"岳普湖县\" Code=\"28\" />\n" +
			"        <Region Name=\"伽师县\" Code=\"29\" />\n" +
			"        <Region Name=\"巴楚县\" Code=\"30\" />\n" +
			"        <Region Name=\"塔什库尔干塔吉克自治县\" Code=\"31\" />\n" +
			"      </City>\n" +
			"      <City Name=\"和田\" Code=\"32\">\n" +
			"        <Region Name=\"和田市\" Code=\"1\" />\n" +
			"        <Region Name=\"和田县\" Code=\"21\" />\n" +
			"        <Region Name=\"墨玉县\" Code=\"22\" />\n" +
			"        <Region Name=\"皮山县\" Code=\"23\" />\n" +
			"        <Region Name=\"洛浦县\" Code=\"24\" />\n" +
			"        <Region Name=\"策勒县\" Code=\"25\" />\n" +
			"        <Region Name=\"于田县\" Code=\"26\" />\n" +
			"        <Region Name=\"民丰县\" Code=\"27\" />\n" +
			"      </City>\n" +
			"      <City Name=\"伊犁\" Code=\"40\">\n" +
			"        <Region Name=\"伊宁市\" Code=\"2\" />\n" +
			"        <Region Name=\"奎屯市\" Code=\"3\" />\n" +
			"        <Region Name=\"伊宁县\" Code=\"21\" />\n" +
			"        <Region Name=\"察布查尔锡伯自治县\" Code=\"22\" />\n" +
			"        <Region Name=\"霍城县\" Code=\"23\" />\n" +
			"        <Region Name=\"巩留县\" Code=\"24\" />\n" +
			"        <Region Name=\"新源县\" Code=\"25\" />\n" +
			"        <Region Name=\"昭苏县\" Code=\"26\" />\n" +
			"        <Region Name=\"特克斯县\" Code=\"27\" />\n" +
			"        <Region Name=\"尼勒克县\" Code=\"28\" />\n" +
			"      </City>\n" +
			"      <City Name=\"塔城\" Code=\"42\">\n" +
			"        <Region Name=\"塔城市\" Code=\"1\" />\n" +
			"        <Region Name=\"乌苏市\" Code=\"2\" />\n" +
			"        <Region Name=\"额敏县\" Code=\"21\" />\n" +
			"        <Region Name=\"沙湾县\" Code=\"23\" />\n" +
			"        <Region Name=\"托里县\" Code=\"24\" />\n" +
			"        <Region Name=\"裕民县\" Code=\"25\" />\n" +
			"        <Region Name=\"和布克赛尔蒙古自治县\" Code=\"26\" />\n" +
			"      </City>\n" +
			"      <City Name=\"阿勒泰\" Code=\"43\">\n" +
			"        <Region Name=\"阿勒泰市\" Code=\"1\" />\n" +
			"        <Region Name=\"布尔津县\" Code=\"21\" />\n" +
			"        <Region Name=\"富蕴县\" Code=\"22\" />\n" +
			"        <Region Name=\"福海县\" Code=\"23\" />\n" +
			"        <Region Name=\"哈巴河县\" Code=\"24\" />\n" +
			"        <Region Name=\"青河县\" Code=\"25\" />\n" +
			"        <Region Name=\"吉木乃县\" Code=\"26\" />\n" +
			"      </City>\n" +
			"      <City Name=\"石河子\" Code=\"91\" />\n" +
			"      <City Name=\"阿拉尔\" Code=\"92\" />\n" +
			"      <City Name=\"图木舒克\" Code=\"93\" />\n" +
			"      <City Name=\"五家渠\" Code=\"94\" />\n" +
			"      <City Name=\"北屯\" Code=\"95\" />\n" +
			"    </State>\n" +
			"    <State Name=\"台湾\" Code=\"71\">\n" +
			"      <City Name=\"台北市\" Code=\"1\" />\n" +
			"      <City Name=\"高雄市\" Code=\"2\" />\n" +
			"      <City Name=\"基隆市\" Code=\"3\" />\n" +
			"      <City Name=\"台中市\" Code=\"4\" />\n" +
			"      <City Name=\"台南市\" Code=\"5\" />\n" +
			"      <City Name=\"新竹市\" Code=\"6\" />\n" +
			"      <City Name=\"嘉义市\" Code=\"7\" />\n" +
			"      <City Name=\"台北县\" Code=\"8\" />\n" +
			"      <City Name=\"宜兰县\" Code=\"9\" />\n" +
			"      <City Name=\"桃园县\" Code=\"10\" />\n" +
			"      <City Name=\"新竹县\" Code=\"11\" />\n" +
			"      <City Name=\"苗栗县\" Code=\"12\" />\n" +
			"      <City Name=\"台中县\" Code=\"13\" />\n" +
			"      <City Name=\"彰化县\" Code=\"14\" />\n" +
			"      <City Name=\"南投县\" Code=\"15\" />\n" +
			"      <City Name=\"云林县\" Code=\"16\" />\n" +
			"      <City Name=\"嘉义县\" Code=\"17\" />\n" +
			"      <City Name=\"台南县\" Code=\"18\" />\n" +
			"      <City Name=\"高雄县\" Code=\"19\" />\n" +
			"      <City Name=\"屏东县\" Code=\"20\" />\n" +
			"      <City Name=\"台东县\" Code=\"22\" />\n" +
			"      <City Name=\"花莲县\" Code=\"23\" />\n" +
			"      <City Name=\"澎湖县\" Code=\"21\" />\n" +
			"    </State>\n" +
			"    <State Name=\"香港\" Code=\"81\">\n" +
			"      <City Name=\"中西区\" Code=\"HCW\" />\n" +
			"      <City Name=\"东区\" Code=\"HEA\" />\n" +
			"      <City Name=\"九龙城区\" Code=\"KKC\" />\n" +
			"      <City Name=\"观塘区\" Code=\"KKT\" />\n" +
			"      <City Name=\"南区\" Code=\"HSO\" />\n" +
			"      <City Name=\"深水埗区\" Code=\"KSS\" />\n" +
			"      <City Name=\"黄大仙区\" Code=\"KWT\" />\n" +
			"      <City Name=\"湾仔区\" Code=\"HWC\" />\n" +
			"      <City Name=\"油尖旺区\" Code=\"KYT\" />\n" +
			"      <City Name=\"离岛区\" Code=\"NIS\" />\n" +
			"      <City Name=\"葵青区\" Code=\"NKT\" />\n" +
			"      <City Name=\"北区\" Code=\"NNO\" />\n" +
			"      <City Name=\"西贡区\" Code=\"NSK\" />\n" +
			"      <City Name=\"沙田区\" Code=\"NST\" />\n" +
			"      <City Name=\"屯门区\" Code=\"NTM\" />\n" +
			"      <City Name=\"大埔区\" Code=\"NTP\" />\n" +
			"      <City Name=\"荃湾区\" Code=\"NTW\" />\n" +
			"      <City Name=\"元朗区\" Code=\"NYL\" />\n" +
			"    </State>\n" +
			"    <State Name=\"澳门\" Code=\"82\">\n" +
			"      <City Name=\"花地玛堂区\" Code=\"OLF\" />\n" +
			"      <City Name=\"圣安多尼堂区\" Code=\"ANT\" />\n" +
			"      <City Name=\"大堂区\" Code=\"CAT\" />\n" +
			"      <City Name=\"望德堂区\" Code=\"LAW\" />\n" +
			"      <City Name=\"风顺堂区\" Code=\"LAZ\" />\n" +
			"      <City Name=\"氹仔\" Code=\"TPA\" />\n" +
			"      <City Name=\"路环\" Code=\"CLN\" />\n" +
			"    </State>\n" +
			"</Location>";

}

# [Bronze II] Õhne vanaraamatupood - 7131

[문제 링크](https://www.acmicpc.net/problem/7131)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1023 MB

### 통계

제출: 144, 정답: 57, 맞힌 사람: 44, 정답 비율: 36.975%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>&Otilde;hne vanaraamatupood on globaalse haardega idufirma, mis tegeleb eriti haruldaste ja vanade raamatute m&uuml;&uuml;giga interneti teel. Suurem osa portaalis tegutsevatest m&uuml;&uuml;jatest on robotid, mis p&uuml;&uuml;avad &uuml;ksteiselt raamatuid odavalt osta ja neid siis teistele kasutajatele kallimalt edasi m&uuml;&uuml;a. Kuna raamatud on v&auml;ga haruldased, siis pakutakse m&uuml;&uuml;giks ka raamatuid, mida m&uuml;&uuml;jal tegelikult pole.</p>

<p>Vaatleme eriti lihtsat m&uuml;&uuml;girobotit, mis k&auml;itub j&auml;rgmise algoritmi alusel.</p>

<ul>
	<li>Kui antud raamatut veel m&uuml;&uuml;gil pole, siis m&otilde;tleb esimene robot ise v&auml;lja suvalise hinna. Loeme seda p&auml;evaks 0 ja selle roboti number on 1.</li>
	<li>Iga robot aktiveerub kindla intervalliga (iga $I$ p&auml;eva j&auml;rel), arvutab k&otilde;igi portaalis olevate pakkumiste (sealhulgas tema enda pakkumine) keskmise, lisab sellele oma marginaali (juurdehindluse) ning arvutab nii oma uue pakkumise. Arvutuste aluseks on m&uuml;&uuml;jate hinnad eelmise p&auml;eva l&otilde;pu seisuga.</li>
</ul>

<p>K&otilde;ik hinnad avaldatakse portaalis &uuml;he sendi t&auml;psusega, arvuste k&auml;igus tekkinud sentide murdosad alates $0{,}5$ sendist &uuml;mardatakse &uuml;les.</p>

<p>V&otilde;ib eeldada, et &uuml;kski hind ei &uuml;leta kunagi v&auml;&auml;rtust $1\,000\,000.00$.</p>

<p>Kirjutada programm, mis leiab kirjeldatud robotite poolt &uuml;he raamatu eest k&uuml;sitavad hinnad antud p&auml;eva alguses. (Sellel p&auml;eval toimuvaid hinnamuutusi mitte arvestada.)</p>

### 입력

<p>Tekstifaili esimesel real on kolm arvu: robotide arv $N$ ($1 \le N \le 100$), esimese roboti poolt raamatu eest k&uuml;situd hind $P_0$ ($0.01 \le P_0 \le 9999.99$) ja meid huvitava p&auml;eva number $T$ ($1 \le T \le 10\,000$).</p>

<p>J&auml;rgmisel $N$ real on robotide parameetrid: esimese m&uuml;&uuml;gipakkumise tegemise p&auml;ev $S_i$ ($S_1 = 0$, muidu $1 \le S_i &lt; T$), pakkumise uuendamise intervall $I_i$ ($1 \le I_i \le T$) ja marginaal $M_i$ ($0 &lt; M_i &lt; 1$, t&auml;psusega kuni 5 kohta p&auml;rast koma).</p>

### 출력

<p>Tekstifaili v&auml;ljastada p&auml;eva $T$ hommikul iga roboti poolt selle raamatu eest k&uuml;sitav hind. Hindades v&auml;ljastada t&auml;pselt kaks kohta p&auml;rast koma.</p>
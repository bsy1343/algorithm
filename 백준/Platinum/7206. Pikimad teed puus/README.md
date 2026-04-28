# [Platinum III] Pikimad teed puus - 7206

[문제 링크](https://www.acmicpc.net/problem/7206)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 47, 정답: 10, 맞힌 사람: 10, 정답 비율: 21.277%

### 분류

그래프 이론, 자료 구조, 트리, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리, 오일러 경로 테크닉

### 문제 설명

<p>Jaak ja Jaagup osalesid &uuml;hel programmeerimisv&otilde;istlusel tiimina, teenisid suure koguse ˇsokolaadi ja tahavad selle omavahel &auml;ra jagada. M&otilde;lemad on k&uuml;llalt &uuml;lbed ja kumbki arvab, et tema panus tiimi edukusse oli suurem kui teise oma.</p>

<p>Nad m&otilde;tlesid ˇsokolaadi jagamiseks v&auml;lja susteemi, mis tundus m &uml; &otilde;lemale &otilde;iglane. Nimelt esitavad nad &uuml;ksteisele kordam&ouml;&ouml;da informaatika&uuml;lesandeid. Teine peab esitatud &uuml;lesande v&otilde;imalikult kiiresti ja elegantselt &auml;ra lahendama ja siis v&otilde;rreldakse lahendamise aega ja elegantsust &uuml;lesande esitaja omadega. &Scaron;okolaad jagatakse vastavalt sellele, kumb on teise &uuml;lesannete lahendamisel edukam.</p>

<p>Jaagup esitas Jaagule j&auml;rgmise &uuml;lesande:</p>

<blockquote>
<p>On antud puu, mille N tippu on t&auml;histatud 1, 2, . . . , N. Lisaks on puu igal serval e kaal w(e). Puu kohta esitatakse Q p&auml;ringut kujul:</p>

<ol>
	<li>Sea tipust i selle &uuml;lemusse minema serva uueks kaaluks w&#39;</li>
	<li>Leia tipu i alampuus tipust i v&auml;ljuvate lihtsate teede kaalude maksimum. Tee kaaluks nimetame k&otilde;igi teele j&auml;&auml;vate servade kaalude summat. Lihtsaks nimetame teed, mis ei l&auml;bi uhtki tippu korduvalt.</li>
</ol>
</blockquote>

<p>Jaak j&auml;i selle &uuml;lesandega h&auml;tta ja otsustas abi k&uuml;sida. Lahendada Jaagule antud &uuml;lesanne &auml;ra.</p>

### 입력

<p>Tekstifaili esimesel real on t&auml;isarv N (1 &le; N &le; 10<sup>5</sup>). Teisel real on N t&auml;isarvu x<sub>1</sub>, x<sub>2</sub>, . . . , x<sub>N</sub>, kus x<sub>i</sub> t&auml;histab tipu i &uuml;lemust (kui i on puu juur, siis x<sub>i</sub> = 0). Kolmandal real on N t&auml;isarvu w<sub>1</sub>, w<sub>2</sub>, . . . , w<sub>N</sub>, kus w<sub>i</sub> on tipu i ja selle &uuml;lemuse vahel oleva serva esialgne kaal (&minus;10<sup>9</sup> &le; w<sub>i</sub> &le; 10<sup>9</sup>, i &isin; 1 . . . N).</p>

<p>Neljandal real on t&auml;isarv Q (1 &le; Q &le; 10<sup>5</sup>). J&auml;rgmisel Q real on iga&uuml;hel esimesena t&auml;isarv T (1 &le; T &le; 2), mis t&auml;histab operatsiooni t&uuml;&uuml;pi, ja vastavalt sellele kas t&auml;isarvud i (1 &le; i &le; N) ja w&#39; (&minus;10<sup>9</sup> &le; w&#39; &le; 10<sup>9</sup>) v&otilde;i lihtsalt t&auml;isarv i.</p>

### 출력

<p>Tekstifaili v&auml;ljastada 2. t&uuml;&uuml;pi p&auml;ringute vastused, iga&uuml;ks eraldi reale, p&auml;ringute sisendis esinemise j&auml;rjekorras.</p>
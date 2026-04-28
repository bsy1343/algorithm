# [Silver III] IP-aadressid - 7185

[문제 링크](https://www.acmicpc.net/problem/7185)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 65, 정답: 19, 맞힌 사람: 13, 정답 비율: 30.233%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 정규 표현식, 문자열, 집합과 맵

### 문제 설명

<p>Matil on veebileht ning ta tahab t&auml;pselt teada, kes tema lehte k&uuml;lastavad. K&uuml;lastajate j&auml;lgimiseks koostas Mati skripti, mis t&ouml;&ouml;tab j&auml;rgmiselt:</p>

<ul>
	<li>k&otilde;igi seni n&auml;htud k&uuml;lastajate IP-aadresse hoitakse tekstifailis;</li>
	<li>iga uue p&auml;ringu (k&uuml;lastaja) saabumisel kontrollitakse programmi <code>grep</code> abil IP-aadressi esinemist tekstifailis (<code>grep</code> <em>uusIP</em> <em>fail</em>);</li>
	<li>kui vastavusi ei leitud, lisatakse uus aadress faili l&otilde;ppu ja saadetakse Matile teavitus;</li>
	<li>muudel juhtudel ei tehta midagi.</li>
</ul>

<p>IP-aadress on s&otilde;ne, mis koosneb neljast t&auml;isarvust vahemikus $0 \ldots 255$ ning punktidest nende vahel.</p>

<p>Programm <code>grep</code> on levinud t&ouml;&ouml;vahend regulaaravaldistega kirjeldatud mustrite otsimiseks teksti\-failidest. Antud juhul kasutab Mati programmi <code>grep</code> valesti, sest:</p>

<ul>
	<li><code>grep</code> otsib alams&otilde;nesid: otsitav muster ei pea algama tingimata rea alguses ega l&otilde;ppema rea l&otilde;pus;</li>
	<li>otsitavat mustrit t&otilde;lgendatakse regulaaravaldisena ning seet&otilde;ttu v&otilde;ib otsitava IP-aadressi punktile vastata tekstifailis suvaline s&uuml;mbol (kuid mitte vastupidi).</li>
</ul>

<p>On antud k&otilde;igi Mati skripti poolt t&ouml;&ouml;deldud IP-aadresside loetelu (t&ouml;&ouml;tlemise j&auml;rjekorras). Tuvastada, millised aadressid j&auml;ttis Mati skript ekslikult faili lisamata.</p>

### 입력

<p>Tekstifaili esimesel real on &uuml;ks t&auml;isarv: IP-aadresside arv $N$  ($1 \le N \le 1\,000\,000$). J&auml;rgmisel $N$ real on iga&uuml;hel &uuml;ks IP-aadress. Sisendis v&otilde;ib esineda korduvaid aadresse, erinevate aadresside koguarv &uuml;heski testis ei ole suurem kui $2\,000$.</p>

### 출력

<p>Tekstifaili esimesele reale v&auml;ljastada lisamata j&auml;&auml;nud aadresside arv $V$ ning j&auml;rgmisele $V$ reale lisamata j&auml;&auml;nud aadressid nende esimist korda sisendfailis esinemise j&auml;rjekorras.</p>
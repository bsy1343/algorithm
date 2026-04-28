# [Bronze I] Vanaisa lotomängud - 7123

[문제 링크](https://www.acmicpc.net/problem/7123)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 59, 정답: 35, 맞힌 사람: 31, 정답 비율: 56.364%

### 분류

수학, 구현

### 문제 설명

<p>Juku vanaisa on innukas ja enda arvates ka edukas lotom&auml;ngija. Jukul on selle viimase v&auml;ite osas kahtlusi, sellep&auml;rast on ta juba m&otilde;nda aega kirjutanud &uuml;les, kui palju vanaisa lotopiletitele kulutab ja kui palju ta lotoga v&otilde;idab.</p>

<p>Kirjutada programm, mis teeb vanaisa lotom&auml;ngude kohta kolme liiki statistikat:</p>

<ul>
	<li>leiab, kas ta on kokku v&otilde;itnud rohkem v&otilde;i v&auml;hem kui piletitele kulutanud;</li>
	<li>leiab, millisel p&auml;eval ta &uuml;he p&auml;evaga k&otilde;ige rohkem kaotas;</li>
	<li>leiab, millal ta mingite j&auml;rjestikuste p&auml;evade jooksul k&otilde;ige rohkem kaotas.</li>
</ul>

### 입력

<p>Tekstifaili esimesel real on Juku p&auml;eviku kannete arv $N$ ($1 \le N \le 100$). J&auml;rgmisel $N$ real on iga&uuml;hel kaks t&uuml;hikutega eraldatud t&auml;isarvu: p&auml;eval $i$ ($1 \le i \le N$) piletitele kulutatud summa $P_i$ ($0 \le P_i \le 100$) ja v&otilde;idetud summa $V_i$ ($0 \le V_i \le 1\,000\,000$).</p>

### 출력

<p>Tekstifaili v&auml;ljastada t&auml;pselt kolm rida, igale reale &uuml;ks vastus.</p>

<p>Faili esimesele reale v&auml;ljastada s&otilde;na <code>PLUSSIS</code>, <code>MIINUSES</code> v&otilde;i <code>NULLIS</code> vastavalt sellele, kas vanaisa v&otilde;itude kogusumma on piletikulude kogusummast suurem, v&auml;iksem v&otilde;i sellega v&otilde;rdne. Kui programm seda leida ei oska, v&auml;ljastada faili esimesele reale <code>EI TEA</code>.</p>

<p>Faili teisele reale v&auml;ljastada kaks t&uuml;hikuga eraldatud t&auml;isarvu $P$ ja $S$, kus $P$ on selle p&auml;eva number, kui vanaisa &uuml;he p&auml;evaga k&otilde;ige rohkem raha kaotas, ja $S$ selle p&auml;eva kaotussumma (piletikulu ja v&otilde;itude vahe). V&otilde;ib eeldada, et vanaisa on v&auml;hemalt &uuml;hel p&auml;eval raha kaotanud. Kui maksimaalse kaotussummaga p&auml;evi on mitu, v&auml;ljastada &uuml;ksk&otilde;ik milline neist. Kui programm seda infot leida ei oska, v&auml;ljastada faili teisele reale <code>0 0</code>.</p>

<p>Faili kolmandale reale v&auml;ljastada kolm t&uuml;hikutega eraldatud t&auml;isarvu $P_1$, $P_2$ ja $S$, mis n&auml;itavad, et vanaisa k&otilde;ige kulukam periood kestis p&auml;evast $P_1$ p&auml;evani $P_2$, mille jooksul tema kulutused piletitele &uuml;letasid v&otilde;ite kokku $S$ v&otilde;rra. Kui maksimaalse kaotussummaga ajaperioode on mitu, v&auml;ljastada &uuml;ksk&otilde;ik milline neist. Kui programm seda infot leida ei oska, v&auml;ljastada faili kolmandale reale <code>0 0 0</code>.</p>
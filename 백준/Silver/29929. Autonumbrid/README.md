# [Silver II] Autonumbrid - 29929

[문제 링크](https://www.acmicpc.net/problem/29929)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 14, 맞힌 사람: 10, 정답 비율: 90.909%

### 분류

구현, 해 구성하기

### 문제 설명

<p>Marslased juurutavad uut autonumbrite s&uuml;steemi. Selles s&uuml;steemis on iga numbrim&auml;rk $N$ arvu permutatsioon, see t&auml;hendab jada, milles arvud $1 \ldots N$ esinevad iga&uuml;ks t&auml;pselt &uuml;he korra.</p>

<p>Administratiivselt jaguneb Marss l&otilde;una- ja p&otilde;hjapoolkeraks. Kuna on soovitav, et auto numbri j&auml;rgi saaks tuvastada, kummalt poolkeralt see p&auml;rineb, otsustati, et l&otilde;unapoolkera saab $N!/2$ leksikograafiliselt v&auml;iksemat ja p&otilde;hjapoolkera $N!/2$ leksikograafiliselt suuremat numbrit.</p>

<p>Poolkerade kubernerid tahtsid endale erilisi numbreid. L&otilde;unapoolkera kuberner otsustas v&otilde;tta endale oma poolkera numbritest leksikograafiliselt suurima ja p&otilde;hjapoolkera kuberner oma poolkera numbritest leksikograafiliselt v&auml;hima.</p>

<p>Kirjuta programm, mis leiab, millised numbrid kubernerid endale saavad.</p>

<p>Meenutame, et $N!$ t&auml;histab korrutist $1 \cdot 2 \cdot \ldots \cdot N$ ning arvujada $a = (a_1, a_2, \ldots, a_n)$ on arvujadast $b = (b_1, b_2, \ldots, b_n)$ leksikograafiliselt v&auml;iksem, kui mingi indeksi $t$ korral $a_1 = b_1$, $a_2 = b_2$, \ldots, $a_t = b_t$, aga $a_{t+1} &lt; b_{t+1}$.</p>

### 입력

<p>Tekstifaili ainsal real on t&auml;isarv $N$ ($2 \le N \le 5 \cdot 10^5$) --- Marsi autonumbrite pikkus.</p>

### 출력

<p>Tekstifaili v&auml;ljastada t&auml;pselt kaks rida, kummalegi reale $N$ t&uuml;hikutega eraldatud t&auml;isarvu. Esimesele reale v&auml;ljastada l&otilde;unapoolkera ja teisele p&otilde;hjapoolkera kuberneri auto number.</p>
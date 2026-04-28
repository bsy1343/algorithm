# [Silver I] Halma - 29897

[문제 링크](https://www.acmicpc.net/problem/29897)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>Halma on traditsiooniliselt kahe v&otilde;i nelja m&auml;ngija lauam&auml;ng, mida m&auml;ngitakse $8 \times 8$ v&otilde;i $10 \times 10$ ruudust koosneval laual. Detsembris, kui J&otilde;uluvanal on kiired p&auml;evad, m&auml;ngib J&otilde;ulumemm &uuml;he m&auml;ngija varianti. Vahelduse suurendamiseks kasutab ta erinevaid ristk&uuml;likulisi m&auml;ngulaudu.</p>

<p>M&auml;ngu alguses on m&auml;ngija nupud laua &uuml;hes nurgas oleval stardialal ja eesm&auml;rk on viia need diagonaalis vastasnurka fini&scaron;ialale. Selleks v&otilde;ib teha kahesuguseid k&auml;ike:</p>

<ul>
	<li>Sammuks nimetame nupu liigutamist t&uuml;hjale naaberruudule samas reas v&otilde;i samas veerus, nagu n&auml;idatud alloleval joonisel vasakul. Sammuk&auml;igul v&otilde;ib teha ainult &uuml;he sammu.</li>
	<li>H&uuml;ppeks nimetame nupu liigutamist &uuml;le naaberruudul oleva nupu vahetult selle taga olevale t&uuml;hjale ruudule samas reas v&otilde;i samas veerus. H&uuml;pata v&otilde;ib ainult &uuml;le &uuml;he nupu, nagu n&auml;idatud alloleval joonisel keskel (rohelise noole suunas saab h&uuml;pata, punase suunas ei saa). Erinevalt kabest &uuml;le teise nupu h&uuml;ppamine teist nuppu kuidagi ei m&otilde;juta. H&uuml;ppek&auml;ik v&otilde;ib koosneda &uuml;hest v&otilde;i mitmest j&auml;rjestikusest h&uuml;ppest sama nupuga, nagu n&auml;idatud alloleval joonisel paremal. H&uuml;pete jada ei pea olema maksimaalse pikkusega: m&auml;ngija v&otilde;ib k&auml;igu oma soovi kohaselt igal hetkel l&otilde;petada, isegi kui tal oleks v&otilde;imalik veel edasi h&uuml;pata.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/29897.%E2%80%85Halma/4c70f073.png" data-original-src="https://upload.acmicpc.net/296898da-7b8d-47fb-b284-26cc600a49fb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 600px; height: 200px;" /></p>

<p>Kirjutada programm, mis saab m&auml;nguseisu ja leiab sellel k&otilde;ik ruudud, millele antud nupp &uuml;he k&auml;iguga j&otilde;uda v&otilde;ib.</p>

### 입력

<p>Sisendi esimesel real on m&auml;ngulaua ridade arv $N$ ja veergude arv $M$ ($3 \le N, M \le 100$).</p>

<p>J&auml;rgmisel $N$ real on iga&uuml;hel t&auml;pselt $M$ m&auml;rki, kus punkt &#39;<code>.</code>&#39; t&auml;histab t&uuml;hja ruutu, trellim&auml;rk &#39;<code>#</code>&#39; uuritavat nuppu ja t&auml;rn &#39;<code>*</code>&#39; muud nuppu.</p>

### 출력

<p>V&auml;ljastada t&auml;pselt $N$ rida, igale reale t&auml;pselt $M$ m&auml;rki: sisendis antud m&auml;ngulaud, kus plussidega &#39;<code>+</code>&#39; on m&auml;rgitud need ruudud, kuhu uuritav nupp &uuml;he k&auml;iguga j&otilde;uda v&otilde;ib.</p>
# [Gold I] Võistkondadeks jagamine - 29925

[문제 링크](https://www.acmicpc.net/problem/29925)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 11, 맞힌 사람: 8, 정답 비율: 29.630%

### 분류

수학, 이분 탐색

### 문제 설명

<p>M&auml;ngus <em>Encounter Incredible: Online</em> on kolm v&otilde;istkonda: maagid, vibulaskjad ja r&uuml;&uuml;tlid. V&otilde;itluses on:</p>

<ul>
	<li>maagidel eelis r&uuml;&uuml;tlite ees;</li>
	<li>vibulaskjatel eelis maagide ees;</li>
	<li>r&uuml;&uuml;tlitel eelis vibulaskjate ees.</li>
</ul>

<p>Et k&otilde;ikidel m&auml;ngijatel on oskused t&auml;pselt samal tasemel, siis s&otilde;ltub m&auml;ngu tulemus ainult sellest, mitu inimest igas v&otilde;istkonnas on. Kui m&auml;ngus on $a$ maagi, $b$ vibulaskjat ja $c$ r&uuml;&uuml;tlit, siis saavad:</p>

<ul>
	<li>maagid $c - b + 0{,}1$ punkti;</li>
	<li>vibulaskjad $a - c + 0{,}2$ punkti;</li>
	<li>r&uuml;&uuml;tlid $b - a + 0{,}3$ punkti.</li>
</ul>

<p>V&otilde;idab see, kellel on k&otilde;ige rohkem punkte.</p>

<p>$N$ j&otilde;mpsikat liituvad m&auml;nguga &uuml;kshaaval. Liitumisel peab iga&uuml;ks otsustama, missuguses v&otilde;istkonnas ta olla tahab. Kui keegi m&auml;nguga liitub, siis ta n&auml;eb, mitu inimest igas v&otilde;istkonnas juba on. Seega ta saab arvutada, missugune v&otilde;istkond v&otilde;idaks, kui m&auml;ng ilma temata pihta hakkaks. Selle v&otilde;istkonnaga ta liitubki.</p>

<p>Sinu eesm&auml;rk on arvutada, milline v&otilde;istkond v&otilde;idab p&auml;rast seda, kui k&otilde;ik $N$ last on m&auml;nguga liitunud.</p>

### 입력

<p>Failis on &uuml;ksainus t&auml;isarv $N$ ($1 \le N \le 10^{18}$) --- m&auml;ngijate arv.</p>

### 출력

<p>Faili kirjutada v&otilde;itva v&otilde;istkonna nimi --- &#39;<code>maagid</code>&#39;, &#39;<code>vibulaskjad</code>&#39; v&otilde;i &#39;<code>ryytlid</code>&#39; (ilma jutum&auml;rkideta).</p>
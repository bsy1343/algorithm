# [Bronze I] Imeline masin - 29875

[문제 링크](https://www.acmicpc.net/problem/29875)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 86, 정답: 67, 맞힌 사람: 40, 정답 비율: 67.797%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Jukul on imeline masin, millel on neli tulukest: punane, roheline, sinine ja kollane. Korraga p&otilde;leb t&auml;pselt &uuml;ks tuluke. Kui masin t&ouml;&ouml;le panna, siis p&otilde;leb sellel alguses punane tuluke.</p>

<p>Masinal on lisaks kaks nuppu: $0$ ja $1$. Nuppe vajutades saab muuta, missugune tuluke p&otilde;leb:</p>

<ul>
	<li>Kui p&otilde;leb punane tuluke ja vajutada &uuml;ksk&otilde;ik kumba nuppu, siis hakkab p&otilde;lema roheline tuluke.</li>
	<li>Kui p&otilde;leb roheline tuluke ja vajutada nuppu $0$, siis hakkab p&otilde;lema punane tuluke. Kui aga vajutada nuppu $1$, siis hakkab p&otilde;lema sinine tuluke.</li>
	<li>Kui p&otilde;leb sinine tuluke ja vajutada nuppu $0$, siis hakkab p&otilde;lema kollane tuluke. Kui aga vajutada nuppu $1$, siis j&auml;&auml;b p&otilde;lema sinine tuluke.</li>
	<li>Kui p&otilde;leb kollane tuluke ja vajutada nuppu $0$, siis j&auml;&auml;b p&otilde;lema kollane tuluke. Kui aga vajutada nuppu $1$, siis hakkab p&otilde;lema punane tuluke.</li>
</ul>

<p>Juku kirjutas &uuml;les &uuml;he nupuvajutuste jada. Tema &otilde;de Juta pillas selle paberi poriloiku ja n&uuml;&uuml;d on m&otilde;ned s&uuml;mbolid paberil arusaamatud. Aita Jutal leida k&otilde;ik v&otilde;imalused, mis tuluke v&otilde;iks vajutustejada l&otilde;puks p&otilde;leda.</p>

### 입력

<p>Sisendi esimesel real on nupuvajutuste arv $N$ ($1 \le N \le 10^6$).</p>

<p>Teisel real on $N$ t&uuml;hikutega eraldatud t&auml;isarvu, mis on iga&uuml;ks $0$, $1$ v&otilde;i $-1$: nupuvajutuste jada. Arv $0$ t&auml;hendab, et vajutati nuppu $0$. Arv $1$ t&auml;hendab, et vajutati nuppu $1$. Arv $-1$ t&auml;hendab, et paber on selle koha pealt m&auml;rjaks saanud ja Juta ei tea, mis nuppu vajutati: see v&otilde;is olla $0$ v&otilde;i $1$.</p>

### 출력

<p>V&auml;ljastada neli rida: &uuml;ks iga tulukese kohta.</p>

<p>Esimesele reale v&auml;ljastada &#39;<code>JAH</code>&#39;, kui vajutustejada l&otilde;puks v&otilde;ib p&otilde;leda punane tuluke, ja &#39;<code>EI</code>&#39;, kui see pole v&otilde;imalik.</p>

<p>Teisele, kolmandale ja neljandale reale v&auml;ljastada, kas vajutustejada l&otilde;puks v&otilde;ib p&otilde;leda roheline, sinine v&otilde;i kollane tuluke.</p>
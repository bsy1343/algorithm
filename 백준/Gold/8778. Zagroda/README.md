# [Gold II] Zagroda - 8778

[문제 링크](https://www.acmicpc.net/problem/8778)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 7, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

애드 혹, 기하학

### 문제 설명

<p>Pan J&oacute;zef, znany (między innymi z zadania&nbsp;<a href="/problem/8811">Inwestycje</a>) rolnik i hodowca, nieustannie szuka dr&oacute;g rozwoju swojego gospodarstwa. Tym razem postanowił założyć hodowlę kangur&oacute;w.</p>

<p>W tym celu pan J&oacute;zef przygotował łąkę podzieloną regularną siatką na&nbsp;<strong>W</strong>*<strong>K</strong>&nbsp;p&oacute;l o wymiarach 1 na 1 ułożonych w&nbsp;<strong>W</strong>&nbsp;wierszach po&nbsp;<strong>K</strong>&nbsp;p&oacute;l każdy.&nbsp;</p>

<p>Pan J&oacute;zef sprowadził na łąkę&nbsp;<strong>N</strong>&nbsp;kangur&oacute;w, z kt&oacute;rych każdy szybko wybrał sobie ulubione pole (każdy kangur inne). Teraz pan J&oacute;zef chce postawić na łące możliwie małą zagrodę, kt&oacute;ra jednak będzie zawierać ulubione pola wszystkich kangur&oacute;w.</p>

<p>Zagroda musi spełniać następujące warunki:</p>

<ul>
	<li>Musi mieć postać wielokąta wypukłego, kt&oacute;rego obrys złożony jest z odcink&oacute;w łączących&nbsp;<strong>środki</strong>&nbsp;<strong>kolejno sąsiadujących ze sobą p&oacute;l</strong>. Pola uznajemy za sąsiadujące, jeśli mają wsp&oacute;lny r&oacute;g lub bok.</li>
	<li>Musi zawierać ulubione pola wszystkich kangur&oacute;w (za zawarte wewnątrz zagrody rozumiemy wszystkie pola, przez kt&oacute;rych środki przechodzi zagroda, oraz wszystkie pola, kt&oacute;rych środki leżą wewnątrz zagrody).</li>
</ul>

<p>i musi być najmniejszą w sensie liczby zawartych p&oacute;l zagrodą spełniającą te warunki.</p>

<p>Czy potrafisz napisać program, kt&oacute;ry obliczy liczbę p&oacute;l zawartych w optymalnej zagrodzie?</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) opisująca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>Pierwsza linia opisu zestawu testowego zawiera trzy oddzielone spacjami liczby naturalne&nbsp;<strong>W, K, N</strong>&nbsp;( 1 &lt;=&nbsp;<strong>W</strong>,&nbsp;<strong>K</strong>&nbsp;&lt;= 1000000, 3 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 1000000), oznaczające wymiary łąki oraz liczbę kangur&oacute;w pana J&oacute;zefa.</p>

<p>W kolejnych&nbsp;<strong>N</strong>&nbsp;wierszach znajdują się wsp&oacute;łrzędne ulubionych p&oacute;l kolejnych kangur&oacute;w, przy czym wsp&oacute;łrzędne opisane są poprzez parę oddzielonych spacją liczb naturalnych&nbsp;<strong>w<sub>i</sub></strong>,&nbsp;<strong>k<sub>i</sub></strong>&nbsp;( 1 &lt;=&nbsp;<strong>w<sub>i</sub></strong>&nbsp;&lt;=&nbsp;<strong>W</strong>, 1 &lt;=&nbsp;<strong>k<sub>i</sub></strong>&nbsp;&lt;=&nbsp;<strong>K</strong>), gdzie&nbsp;<strong>w<sub>i</sub>&nbsp;</strong>oznacza numer wiersza ulubionego pola&nbsp;<strong>i</strong>-tego kangura, a&nbsp;<strong>k<sub>i</sub></strong>&nbsp;- numer kolumny.</p>

<p>Wszystkie zestawy testowe będą opisywać przypadki, dla kt&oacute;rych rozwiązanie jest niezdegenerowane, tj. w kt&oacute;rych wielokąt opisujący optymalną zagrodę ma niezerowe pole.</p>

### 출력

<p>Dla każdego testu należy w osobnej linii wypisać liczbę p&oacute;l zawartych w optymalnej zagrodzie.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8778.%E2%80%85Zagroda/3b38be12.png" data-original-src="https://upload.acmicpc.net/0d92bafe-4c6c-4a67-afd9-23c32fa65743/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8778.%E2%80%85Zagroda/d790137a.png" data-original-src="https://upload.acmicpc.net/24f3a452-fc3a-4cb5-9819-0dedcb10c713/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8778.%E2%80%85Zagroda/3f111668.png" data-original-src="https://upload.acmicpc.net/c50ead6e-0ed8-49fa-9bf1-3096ab487fea/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>
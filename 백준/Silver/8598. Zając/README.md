# [Silver I] Zając - 8598

[문제 링크](https://www.acmicpc.net/problem/8598)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 103, 정답: 57, 맞힌 사람: 47, 정답 비율: 52.809%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Zając Bajtek mieszka na polanie w kształcie prostokąta o wymiarach $n \times $m&nbsp;metr&oacute;w. Polana ta jest podzielona na $n \cdot m$&nbsp;p&oacute;l - kwadrat&oacute;w o boku długości $1$&nbsp;metra. Na niekt&oacute;rych polach znajdują się kopce kreta, kt&oacute;re Bajtek zawsze omija.</p>

<p>Każdy skok Bajtka ma długość dokładnie $\sqrt{5}$, a ponieważ Bajtek jest strasznym pedantem - zawsze chce skoczyć dokładnie na środek pola. Tak więc z pola o wsp&oacute;łrzędnych $(x, y)$ Bajtek może skoczyć tylko na pola o wsp&oacute;łrzędnych:&nbsp;$(x+1, y+2)$, $(x+1, y-2)$, $(x-1, y+2)$, $(x-1, y-2)$, $(x+2, y+1)$, $(x+2, y-1)$, $(x-2, y+1)$ lub&nbsp;$(x-2, y-1)$, o ile nie wiąże się to z wyskoczeniem poza polanę.</p>

<p>Bajtek chciałby jak najszybciej dotrzeć do swojej nory, nie skacząc na pola, na kt&oacute;rych znajdują się kopce kreta. Mając dane pole, na kt&oacute;rym stoi Bajtek, oraz pole, na kt&oacute;rym znajduje się jego nora, pom&oacute;ż mu obliczyć minimalną liczbę skok&oacute;w, jakie musi wykonać, aby dotrzeć do nory.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się dwie liczby całkowite $n$&nbsp;oraz $m$&nbsp;oddzielone pojedynczym odstępem ($1 &le; n, m &le; 1\,000$, $n \cdot m &ge; 2$), oznaczające rozmiary polany. Kolejne $n$&nbsp;wierszy zawiera po $m$&nbsp;znak&oacute;w oznaczających poszczeg&oacute;lne pola polany:</p>

<ul>
	<li>&quot;<code>.</code>&quot; oznacza wolne pole, czyli takie, na kt&oacute;re Bajtek może wskoczyć,</li>
	<li>&quot;<code>x</code>&quot; oznacza pole, na kt&oacute;rym znajduje się kopiec kreta,</li>
	<li>&quot;<code>z</code>&quot; oznacza pole, na kt&oacute;rym obecnie stoi zając Bajtek,</li>
	<li>&quot;<code>n</code>&quot; oznacza, że na tym polu jest nora Bajtka.</li>
</ul>

<p>Możesz założyć, że dokładnie jedno pole polany jest oznaczone jako &quot;<code>z</code>&quot; oraz dokładnie jedno pole jest oznaczone jako &quot;<code>n</code>&quot;.</p>

### 출력

<p>W pierwszym i jedynym wierszu standardowego wyjścia powinna znaleźć się jedna dodatnia liczba całkowita r&oacute;wna minimalnej liczbie skok&oacute;w, jakie Bajtek musi wykonać, aby dotrzeć do swojej nory, lub słowo &quot;<code>NIE</code>&quot;, jeśli dotarcie Bajtka do nory przy użyciu poprawnych skok&oacute;w nie jest możliwe.</p>
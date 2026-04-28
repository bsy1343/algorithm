# [Gold II] Magazyny - 8621

[문제 링크](https://www.acmicpc.net/problem/8621)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 7, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>Sieć drogowa Bajtocji składa się z dwukierunkowych dr&oacute;g, łączących ze sobą pewne pary miast. Została ona tak zaprojektowana, że z każdego miasta da się dojechać do każdego innego na dokładnie jeden spos&oacute;b, nie odwiedzając po drodze żadnego miasta więcej niż raz. W każdym z miast znajduje się magazyn. Kr&oacute;l Bajtocji, Bajtazar, zam&oacute;wił $T$&nbsp;ton pewnego towaru. Towar miał zostać r&oacute;wnomiernie rozmieszczony we wszystkich magazynach, lecz ze względu na niekompetencję dostawcy w pewnych magazynach mogło się znaleźć za dużo, a w pewnych za mało towaru. Pom&oacute;ż Bajtazarowi przewidzieć, jaki co najmniej koszt trzeba ponieść, żeby porozwozić dostarczony towar między magazynami tak, aby w każdym magazynie znalazło się go tyle samo. Koszt transportu jednej tony towaru między parą miast połączonych drogą jest r&oacute;wny 1 bajtalarowi.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia opis sieci drogowej Bajtocji oraz aktualnego rozmieszczenia towaru w magazynach,</li>
	<li>wyznaczy minimalny koszt rozwiezienia towaru między magazynami, prowadzącego do wyr&oacute;wnania jego zawartości we wszystkich magazynach,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą $n$&nbsp;($1 &le; n &le; 500\,000$), oznaczającą liczbę miast w Bajtocji. Dla uproszczenia zakładamy, że miasta są ponumerowane liczbami od $1$&nbsp;do $n$. Drugi wiersz wejścia zawiera $n$&nbsp;liczb całkowitych $t_i$&nbsp;($0 &le; t_i &le; 100\,000\,000$&nbsp;dla $1 &le; i &le; n$), pooddzielanych pojedynczymi odstępami i oznaczających aktualne zawartości towaru (w tonach) w magazynach, znajdujących się odpowiednio w miastach $1, \dots ,n$. Możesz założyć, że łączna masa towaru $T = t_1 + \dots + t_n$&nbsp;jest podzielna przez $n$.</p>

<p>Kolejnych $n-1$&nbsp;wierszy zawiera opis połączeń między miastami. $j$-ty z tych wierszy zawiera dwie liczby całkowite $a_j$&nbsp;i $b_j$&nbsp;($1 &le; a_j &lt; b_j &le; n$), oddzielone pojedynczym odstępem i oznaczające drogę łączącą miasta o numerach $a_j$&nbsp;oraz b_j$.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną minimalnemu kosztowi rozwiezienia towaru między magazynami, po kt&oacute;rym w każdym magazynie znajdzie się ostatecznie $T/n$&nbsp;ton towaru.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/a4a9975b-7d1f-4456-a2fc-aa8cb940d862/-/preview/" /></p>

<p>Na powyższym rysunku liczby w kwadratach oznaczają masy towaru znajdującego się w poszczeg&oacute;lnych magazynach, a pozostałe liczby odpowiadają numerom miast, w kt&oacute;rych te magazyny się znajdują. W tym przypadku dążeniem Bajtazara jest, aby w każdym magazynie znalazły się $12/6=2$&nbsp;tony towaru. Jednym ze sposob&oacute;w zrealizowania tego zadania o optymalnym koszcie $10$&nbsp;jest:</p>

<ul>
	<li>przewieźć $1$&nbsp;tonę towaru z miasta 1 do 4 (koszt $2$),</li>
	<li>przewieźć $2$&nbsp;tony towaru z miasta 1 do 3 (koszt $4$),</li>
	<li>przewieźć $2$&nbsp;tony towaru z miasta 5 do 6 (koszt $4$).</li>
</ul>
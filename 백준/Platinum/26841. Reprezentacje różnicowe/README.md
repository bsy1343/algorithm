# [Platinum IV] Reprezentacje różnicowe - 26841

[문제 링크](https://www.acmicpc.net/problem/26841)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 5, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

애드 혹, 이분 탐색, 자료 구조, 수학, 런타임 전의 전처리, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Zdefiniujmy nieskończony ciąg liczb całkowitych $a_1, a_2, a_3, \dots$ w następujący spos&oacute;b: $$a_n = \begin{cases} n &amp; \text{dla }n &le; 2 \\ 2 &middot; a_{n-1} &amp; \text{dla }n &gt; 2\text{ nieparzystego} \\ a_{n-1} + r_{n-1} &amp; \text{dla }n &gt; 2\text{ parzystego}\end{cases}$$ przy czym $r_{n-1}$ jest najmniejszą dodatnią liczbą całkowitą niebędącą r&oacute;żnicą dw&oacute;ch r&oacute;żnych element&oacute;w ze zbioru $\{a_1, a_2,  \dots  , a_{n-1}\}$.</p>

<p>Tak więc początkowe wyrazy ciągu to: $$ 1, 2, 4, 8, 16, 21, 42, 51, 102, 112, 224, 235, 470, 486, 972, 990, 1980, \dots $$</p>

<p>Przykładowo, aby obliczyć $a_6$, stwierdzamy, że każda z liczb $1, 2, 3, 4$ jest r&oacute;żnicą pewnych dw&oacute;ch element&oacute;w początkowego fragmentu ciągu $1, 2, 4, 8, 16$, natomiast liczba $5$ nie jest r&oacute;żnicą dw&oacute;ch takich element&oacute;w. Tak więc $a_6 = a_5 + 5 = 21$.</p>

<p>Wiadomo, że dla każdej dodatniej liczby całkowitej $x$ istnieje dokładnie jedna para indeks&oacute;w $(p, q)$ taka, że $x = a_p - a_q$. Parę taką oznaczymy jako $repr(x)$. Na przykład $repr(17) = (6, 3)$ i $repr(18) = (16, 15)$. Twoim zadaniem jest wyznaczyć $repr(x)$ dla danego $x$.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się jedna liczba całkowita $n$ oznaczająca liczbę przypadk&oacute;w testowych. W każdym z kolejnych $n$ wierszy znajduje się jedna dodatnia liczba całkowita $x$. Możesz założyć, że liczby występujące na wejściu nie powtarzają się.</p>

### 출력

<p>Na standardowe wyjście należy wypisać $n$ wierszy. Wiersz odpowiadający liczbie $x$ z wejścia powinien zawierać $repr(x) = (p, q)$ w postaci dw&oacute;ch liczb całkowitych $p$, $q$ oddzielonych pojedynczym odstępem.</p>

### 제한

<ul>
	<li>$n &le; 100\,000$</li>
	<li>$x &le; 10^9$</li>
</ul>
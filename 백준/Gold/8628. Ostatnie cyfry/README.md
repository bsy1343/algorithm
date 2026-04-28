# [Gold V] Ostatnie cyfry - 8628

[문제 링크](https://www.acmicpc.net/problem/8628)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 16, 맞힌 사람: 15, 정답 비율: 83.333%

### 분류

수학, 정수론, 런타임 전의 전처리

### 문제 설명

<p>Niech $k$&nbsp;będzie liczbą całkowitą dodatnią. Poszukujemy wszystkich liczb całkowitych $x$&nbsp;z przedziału $[0,10^k-1]$, dla kt&oacute;rych $x^a$&nbsp;ma dokładnie takie same $k$&nbsp;ostatnich cyfr dziesiętnych jak $x$. Brak kt&oacute;rejś cyfry w kt&oacute;rejkolwiek z liczb traktujemy dokładnie tak samo, jak gdyby tą cyfrą było $0$.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia liczby&nbsp;$k$&nbsp;oraz $a$,</li>
	<li>wyznaczy wszystkie takie liczby $x$&nbsp;z przedziału&nbsp;$[0,10^k-1]$, dla kt&oacute;rych $k$&nbsp;ostatnich cyfr $x^a$&nbsp;jest takich samych jak $x$,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>Pierwszy i jedyny wiersz wejścia zawiera dwie liczby całkowite $k$&nbsp;oraz $a$&nbsp;($1 &le; k &le; 9$, $a \in \{2,3\}$), oddzielone pojedynczym odstępem.</p>

### 출력

<p>Wyjście powinno zawierać wszystkie liczby całkowite nieujemne nie większe niż $10^k$, dla kt&oacute;rych ostatnie $k$&nbsp;cyfr $x^a$&nbsp;jest takich samych jak $x$, pooddzielane pojedynczymi odstępami.</p>
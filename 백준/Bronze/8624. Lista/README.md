# [Bronze I] Lista - 8624

[문제 링크](https://www.acmicpc.net/problem/8624)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 138, 정답: 61, 맞힌 사람: 52, 정답 비율: 41.935%

### 분류

수학, 많은 조건 분기

### 문제 설명

<p>Mamy daną listę $L$&nbsp;wszystkich liczb naturalnych od $1$&nbsp;do $n$. Możemy $k$&nbsp;ostatnich liczb z tej listy przenieść na jej początek, otrzymując w ten spos&oacute;b listę $L_1$. Dla przykładu, jeżeli przenieść z listy 1, 2, 3, 4, 5, 6, 7 trzy ostatnie liczby na początek, to otrzymamy listę 5, 6, 7, 1, 2, 3, 4. Dla danych liczb $i$&nbsp;oraz $j$&nbsp;z przedziału $[1,n]$&nbsp;zastanawiamy się, jaka jest suma element&oacute;w listy $L_1$&nbsp;od $i$-tego do $j$-tego włącznie. Dla powyższej listy oraz liczb $i=2$&nbsp;i $j=6$&nbsp;poszukiwana suma jest r&oacute;wna $6+7+1+2+3=19$.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia liczby: $n$, $k$, $i$&nbsp;oraz $j$,</li>
	<li>wyznaczy sumę element&oacute;w listy $L_1$&nbsp;od $i$-tego do $j$-tego włącznie,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>Pierwszy i jedyny wiersz wejścia zawiera cztery liczby całkowite $n$, $k$, $i$&nbsp;oraz $j$&nbsp;($2 &le; n &le; 1\,000\,000\,000$, $1 &le; k &le; n$, $1 &le; i &le; j &le; n$), pooddzielane pojedynczymi odstępami.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną sumie element&oacute;w listy $L_1$&nbsp;od $i$-tego do $j$-tego włącznie.</p>
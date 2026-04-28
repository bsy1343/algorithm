# [Bronze II] Zliczacz liter - 8635

[문제 링크](https://www.acmicpc.net/problem/8635)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 155, 정답: 135, 맞힌 사람: 123, 정답 비율: 86.620%

### 분류

구현, 문자열, 집합과 맵

### 문제 설명

<p>Koło Młodych Miłośnik&oacute;w Łamania Szyfr&oacute;w pracuje nad oprogramowaniem służącym do odszyfrowania pewnego starożytnego manuskryptu. Jądrem systemu zostanie samouczący się analizator tekstu, a jego pierwszym modułem &quot;zliczacz liter&quot;, kt&oacute;rego opracowanie powierzono Tobie.</p>

<p>Opracuj program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia tekst do analizy,</li>
	<li>dla każdej litery obliczy liczbę jej wystąpień w tekście,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu wejścia znajduje się liczba $N$, oznaczająca liczbę wierszy tekstu do analizy ($N &le; 150$). W każdym z następujących $N$&nbsp;znajduje się ciąg złożony z maksymalnie $200$&nbsp;znak&oacute;w spośr&oacute;d małych i wielkich liter alfabetu łacińskiego (&#39;a&#39;..&#39;z&#39;, &#39;A&#39;..&#39;Z&#39;) oraz spacji.</p>

### 출력

<p>W kolejnych wierszach należy wypisywać litery od &#39;a&#39; do &#39;z&#39; i od &#39;A&#39; do &#39;Z&#39; (w tej kolejności), pojedyncza˛ spację oraz liczbę oznaczającą ilość wystąpień tej litery w analizowanym tekście. Litery nie występujące w tekście należy pominąć.</p>
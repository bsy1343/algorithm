# [Silver V] Sortowanie biżuterii - 8633

[문제 링크](https://www.acmicpc.net/problem/8633)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 125, 정답: 109, 맞힌 사람: 93, 정답 비율: 93.939%

### 분류

문자열, 정렬

### 문제 설명

<p>Małgosia odziedziczyła po wujku kolekcję drogocennej biżuterii. Zastała w skarbcu artystyczny nieład i postanowiła go uporządkować. Wskład biżuterii wchodzą kolie składające się z cennych i rzadkich kamieni szlachetnych. Żadne dwa z nich nie są jednakowe. Pom&oacute;ż Małgosi uporządkować drogocenny zbi&oacute;r.</p>

<p>Opracuj program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia opisy biżuterii,</li>
	<li>uporządkuje je według rosnącej długości, a te, kt&oacute;re są r&oacute;wnej długości uporządkuje leksykograficznie,</li>
	<li>posortowane łańcuchy wypisze na standardowe wyjście.</li>
</ul>

<p>Łańcuchy o r&oacute;wnej długości powinny być uporządkowane leksykograficznie-spośr&oacute;d dw&oacute;ch r&oacute;żnych łańcuch&oacute;w r&oacute;wnej długości mniejszy jest ten, kt&oacute;ry ma mniejszy znak na pierwszej r&oacute;żniącej się pozycji.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się liczba łańcuch&oacute;w do analizy $N$&nbsp;($N \le 150$), a w kolejnych $N$&nbsp;wierszach znajdują się opisy poszczeg&oacute;lnych element&oacute;w biżuterii. Opis każdego z nich składa się z niepustego łańcucha małych liter alfabetu łacińskiego (&#39;a&#39;..&#39;z&#39;) odpowiadających użytym kamieniom, o długości nie przekraczającej $200$&nbsp;znak&oacute;w.</p>

### 출력

<p>W kolejnych wierszach wypisz kolejno uporządkowane rosnąco łańcuchy, po jednym w każdym wierszu.</p>
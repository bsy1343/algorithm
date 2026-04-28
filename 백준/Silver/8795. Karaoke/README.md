# [Silver III] Karaoke - 8795

[문제 링크](https://www.acmicpc.net/problem/8795)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 71, 정답: 49, 맞힌 사람: 37, 정답 비율: 64.912%

### 분류

슬라이딩 윈도우, 문자열

### 문제 설명

<p>Jedną z atrakcji imprezy sylwestrowej zorganizowanej przez Jarka było karaoke. Jarek zauważył, że najlepiej śpiewa mu się fragmenty piosenek zawierające same samogłoski.</p>

<p>Znając treść piosenki w postaci ciągu małych liter alfabetu angielskiego, oblicz w ilu miejscach Jarek może rozpocząć śpiewanie tak, aby kolejne&nbsp;<strong>K</strong>&nbsp;liter piosenki było samogłoskami (pomiędzy wybranym miejscem a końcem piosenki musi być co najmniej&nbsp;<strong>K</strong>&nbsp;liter i wszystkie muszą być samogłoskami).</p>

<p>Za samogłoski uznajemy litery &#39;a&#39;, &#39;e&#39;, &#39;i&#39;, &#39;o&#39;, &#39;u&#39; oraz &#39;y&#39;.</p>

### 입력

<p>W pierwszej linii znajduje się jedna liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) oznaczająca liczbę zestaw&oacute;w testowych. W kolejnych liniach opisywane są kolejne zestawy.</p>

<p>Pojedynczy zestaw testowy składa się z liczby&nbsp;<strong>K</strong>&nbsp;( 1 &lt;=&nbsp;<strong>K</strong>&nbsp;&lt;= 10<sup>6</sup>&nbsp;) i tekstu piosenki w postaci ciągu małych liter alfabetu angielskiego o dodatniej długości mniejszej lub r&oacute;wnej 10<sup>6</sup>.</p>

### 출력

<p>Dla każdego zestawu testowego należy w osobnej linii wypisać liczbę pozycji, na kt&oacute;rych w tekście piosenki występują fragmenty zawierające same samogłoski.</p>
# [Silver I] Konkotenacja - 8797

[문제 링크](https://www.acmicpc.net/problem/8797)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 59, 정답: 25, 맞힌 사람: 20, 정답 비율: 54.054%

### 분류

다이나믹 프로그래밍, 문자열

### 문제 설명

<p>Konkotenacją sł&oacute;w&nbsp;<strong>A</strong>&nbsp;i&nbsp;<strong>B</strong>&nbsp;nazwiemy słowo&nbsp;<strong>A</strong>kot<strong>B</strong>. Przykładowo konkotenacją sł&oacute;w &quot;mas&quot; oraz &quot;ka&quot; jest słowo &quot;maskotka&quot;. Operację tę można zdefiniować dla całych ciąg&oacute;w sł&oacute;w - konkotenujemy wtedy ze sobą wszystkie słowa zgodnie z kolejnością, z jaką w danym ciągu występują. I tak po skonkotenowaniu ciągu sł&oacute;w ( &quot;aa&quot;, &quot;b&quot;, &quot;cc&quot;, &quot;d&quot; ) otrzymujemy słowo &quot;aakotbkotcckotd&quot;.</p>

<p>Ile r&oacute;żnych ciąg&oacute;w złożonych z niepustych sł&oacute;w daje po skonkotenowaniu dane słowo&nbsp;<strong>W</strong>?</p>

### 입력

<p>W pierwszej linii znajduje się jedna liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) oznaczająca liczbę zestaw&oacute;w testowych. W kolejnych liniach opisywane są kolejne zestawy.</p>

<p>Pojedynczy zestaw składa się z jednego niepustego słowa&nbsp;<strong>W</strong>&nbsp;złożonego z małych liter alfabetu angielskiego. Długość słowa&nbsp;<strong>W</strong>&nbsp;nie przekracza 1 000 000.</p>

### 출력

<p>Dla każdego słowa podanego na wejściu należy wypisać w osobnej linii jedną nieujemną liczbę całkowitą - resztę z dzielenia liczby r&oacute;żnych ciąg&oacute;w dających po skonkotenowaniu dane słowo przez 1 000 000 007.</p>

### 제한

<p>Słowo &quot;maskotka&quot; można otrzymać z dw&oacute;ch ciąg&oacute;w sł&oacute;w: ( &quot;mas&quot;, &quot;ka&quot; ) oraz ( &quot;maskotka&quot; ).</p>

<p>Słowo &quot;akotkot&quot; r&oacute;wnież można otrzymać z dokładnie dw&oacute;ch ciąg&oacute;w sł&oacute;w: ( &quot;a&quot;, &quot;kot&quot; ) oraz ( &quot;akotkot&quot; ).</p>
# [Silver II] Studnia - 8810

[문제 링크](https://www.acmicpc.net/problem/8810)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 15, 맞힌 사람: 13, 정답 비율: 61.905%

### 분류

수학

### 문제 설명

<p>Pan Michał chce wykopać nową studnię. Dysponuje planem terenu swojej działki, na kt&oacute;rym przedstawione są dwa zarysy: powierzchni gruntu oraz początku warstwy wodonośnej, kt&oacute;re mają kształt linii łamanych. Pan Michał wynajął już specjalne wiertło, kt&oacute;re może wiercić jedynie w pionie. Koszty wiercenia są całkiem spore, nic dziwnego więc, że zastanawia się, na jaką głębokość co najmniej musi wykonać odwiert, by dotrzeć z powierzchni do warstwy wodonośnej.</p>

### 입력

<p>W pierwszej linii znajduje się jedna liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 5 ) oznaczająca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej linii znajduje się jedna liczba naturalna&nbsp;<strong>n&nbsp;</strong>( 2 &lt;=&nbsp;<strong>n</strong>&nbsp;&lt;= 100 000 ), oznaczająca liczbę punkt&oacute;w łamanej opisującej powierzchnię gruntu na działce pana Michała. W drugim wierszu występuje&nbsp;<strong>n</strong>&nbsp;par liczb naturalnych&nbsp;<strong>x<sub>i</sub></strong>,&nbsp;<strong>y<sub>i</sub></strong>&nbsp;( 1 &lt;=&nbsp;<strong>x<sub>i</sub></strong>,&nbsp;<strong>y<sub>i</sub></strong>&nbsp;&lt;= 10<sup>9</sup>&nbsp;), pooddzielanych pojedynczymi odstępami. Dla każdego 1 &lt;=&nbsp;<strong>i&nbsp;</strong>&lt;&nbsp;<strong>n&nbsp;</strong>zachodzi:&nbsp;<strong>x</strong><sub><strong>i</strong>&nbsp;</sub>&lt;&nbsp;<strong>x<sub>i+1</sub></strong>.</p>

<p>W kolejnych dw&oacute;ch liniach znajduje się analogiczny opis łamanej opisującej początek warstwy wodonośnej pod działką pana Michała. W pierwszej z nich znajduje się liczba naturalna&nbsp;<strong>m&nbsp;</strong>( 2 &lt;=&nbsp;<strong>m&nbsp;</strong>&lt;<strong>&nbsp;n+m</strong>&nbsp;&lt;= 100 000 ), oznaczająca liczbę punkt&oacute;w, a w drugiej z linii jest&nbsp;<strong>m</strong>&nbsp;par liczb naturalnych&nbsp;<strong>u<sub>i</sub></strong>,&nbsp;<strong>v<sub>i</sub></strong>&nbsp;( 1 &lt;=&nbsp;<strong>u<sub>i</sub></strong>,&nbsp;<strong>v<sub>i</sub></strong>&nbsp;&lt;= 10<sup>9</sup>&nbsp;), pooddzielanych pojedynczymi odstępami. Dla każdego 1 &lt;=&nbsp;<strong>i&nbsp;</strong>&lt;&nbsp;<strong>m&nbsp;</strong>zachodzi:&nbsp;<strong>u</strong><sub><strong>i</strong>&nbsp;</sub>&lt;&nbsp;<strong>u<sub>i+1</sub></strong>.</p>

<p>Warstwa wodonośna znajduje się w całości pod powierzchnią gruntu ( te dwie łamane nie mają punkt&oacute;w wsp&oacute;lnych ). Ponadto zachodzą r&oacute;wności:&nbsp;<strong>x<sub>1</sub></strong>&nbsp;=&nbsp;<strong>u<sub>1</sub></strong>&nbsp;oraz&nbsp;<strong>x<sub>n</sub></strong>&nbsp;=&nbsp;<strong>u<sub>m</sub></strong>.</p>

### 출력

<p>Dla każdego zestawu testowego w osobnej linii należy wypisać jedną liczbę rzeczywistą dodatnią - minimalną głębokość dzielącą powierzchnię od warstwy wodonośnej. Wartość tę należy zaokrąglić do dokładnie dw&oacute;ch miejsc po przecinku.</p>

### 힌트

<p>W pierwszym teście na całej długości działki szukana r&oacute;żnica głębokości wynosi 1.</p>

<p>W drugim teście r&oacute;żnica jest najmniejsza w punkcie&nbsp;<strong>x</strong>&nbsp;= 5, i jest tam r&oacute;wna dokładnie 2.</p>

<p>W trzecim teście r&oacute;żnica jest najmniejsza w punkcie&nbsp;<strong>x</strong>&nbsp;= 10.</p>
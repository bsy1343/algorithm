# [Platinum II] Manewry - 8833

[문제 링크](https://www.acmicpc.net/problem/8833)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Kapitan Pitt wraz ze swoją jednostką bierze udział w wojskowych manewrach. Najbliższe zadanie, kt&oacute;re stoi przed jego zespołem, to pokonanie dwuczęściowego toru przeszk&oacute;d.</p>

<p>Pierwsza przeszkoda to rwąca rzeka. Każdego żołnierza opisuje liczba&nbsp;<strong>A</strong><sub><strong>i</strong></sub>&nbsp;oznaczająca czas, jaki zajmie mu pokonanie rzeki.&nbsp;Druga przeszkoda to zasieki z drutu kolczastego. Analogicznie każdego żołnierza opisuje liczba&nbsp;<strong>B</strong><sub><strong>i</strong></sub>&nbsp;oznaczająca czas, jaki zajmie mu pokonanie zasiek.</p>

<p>Na początku wszyscy żołnierze znajdują się w punkcie startowym. Każdy z nich musi kolejno pokonać najpierw rzekę, a p&oacute;źniej zasieki. Ze względ&oacute;w bezpieczeństwa każdą przeszkodę może w danej chwili pokonywać tylko jeden żołnierz.</p>

<p>Kapitan Pitt doskonale zna swoich ludzi ( w szczeg&oacute;lności zna liczby&nbsp;<strong>A</strong><sub><strong>i</strong></sub>&nbsp;,&nbsp;<strong>B</strong><sub><strong>i</strong></sub>&nbsp;) i chce zaplanować kolejność w jakiej będą przechodzić tor, aby czas jego pokonywania był jak najkr&oacute;tszy. Czas pokonywania toru mierzony jest od momentu w kt&oacute;rym pierwszy żołnierz rozpocznie przeprawę przez rzekę do momentu w kt&oacute;rym ostatni żołnierz skończy przedzierać się przez zasieki.</p>

<p>Możliwe oczywiście, że wielu żołnierzy jednocześnie będzie już za pierwszą przeszkodą, czekając na swoją kolej przejścia przez drugą przeszkodę.</p>

### 입력

<p>W pierwsze linii znajduje się liczba zestaw&oacute;w testowych&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10). Następnie podawane są opisy kolejnych zestaw&oacute;w.</p>

<p>W pierwszej linii zestawu znajduje się liczba naturalna&nbsp;<strong>N</strong>&nbsp;( 1 &lt;= 100000 ) oznaczająca liczbę żołnierzy w zespole Kapitana Pitta. W N kolejnych liniach znajdują się pary liczb&nbsp;<strong>A</strong><sub><strong>i</strong></sub>,<strong>&nbsp;B</strong><sub><strong>i</strong>&nbsp;</sub>&nbsp;( 1 &lt;= (<strong>A</strong><sub><strong>i</strong></sub>,&nbsp;<strong>B</strong><sub><strong>i</strong></sub>) &lt;= 1000000 ) opisujących czasy przechodzenia przez przeszkody danego żołnierza. &nbsp;</p>

### 출력

<p>Dla każdego zestawu należy wypisać minimalny czas przejścia wszystkich żołnierzy przez tor.</p>
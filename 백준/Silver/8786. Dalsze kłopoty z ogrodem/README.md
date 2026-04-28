# [Silver II] Dalsze kłopoty z ogrodem - 8786

[문제 링크](https://www.acmicpc.net/problem/8786)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 36, 정답: 22, 맞힌 사람: 18, 정답 비율: 64.286%

### 분류

그리디 알고리즘, 구현, 시뮬레이션

### 문제 설명

<p>W zadaniu&nbsp;<a href="/problem/8847">Kłopoty z ogrodem</a>&nbsp;(FallSpot 2009) mieliśmy okazję poznać pana Wincentego - właściciela ogrodu i wielkiego antymiłośnika grabienia opadłych liści.</p>

<p>Od czasu ostatnich kłopot&oacute;w minęło już trochę czasu, zmniejszony (por. oryginalne zadanie) ogr&oacute;d nie wymaga już tyle uwagi jesienią. Niestety, wraz z nadejściem tegorocznej wiosny pojawiły się nowe problemy - w ogrodzie zaczęły plenić się chwasty, doprowadzając pana Wincentego do szaleństwa (świadkowie twierdzą, że widzieli pana Wincentego nucącego słowa&nbsp;<em>Chwasty chwaściki chwaściory chwaścięta - cała to roślinność wiecznie nie przycięta!&nbsp;</em>na melodię jednej z symfonii Beethovena). Pewnego dnia pan Wincenty po długich godzinach spędzonych w warsztacie stanął w ogrodzie z przenośnym miotaczem płomieni w rękach.</p>

<p>Ogr&oacute;d pana Wincentego składa się z&nbsp;<strong>N</strong>&nbsp;p&oacute;l ponumerowanych od 1 do&nbsp;<strong>N</strong>. W każdym polu znajduje się liczba chwast&oacute;w wyrażona liczbą całkowitą&nbsp;<strong>c</strong><sub>i</sub>. Jednokrotne użycie miotacza płomieni na polu&nbsp;<strong>i</strong>&nbsp;powoduje zmniejszenie o połowę liczby chwast&oacute;w w polu&nbsp;<strong>i&nbsp;</strong>oraz w sąsiednich polach&nbsp;<strong>i</strong>-1 oraz&nbsp;<strong>i</strong>+1.&nbsp;</p>

<p>Przez zmniejszenie o połowę rozumiemy dzielenie całkowite przez 2, tj. z 8 chwast&oacute;w zostają 4, z 5 zostają 2. Jako cel miotacza płomieni można wybrać także nieistniejące pola 0 i&nbsp;<strong>N</strong>+1, wtedy jedyne redukowane pola to - odpowiednio - 1 i&nbsp;<strong>N</strong>.</p>

<p>Oblicz ile minimalnie razy pan Wincenty musi skorzystać z miotacza ognia, aby usunąć wszystkie chwasty.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) opisująca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>Pierwsza linia opisu zestawu testowego zawiera jedną liczbę naturalną&nbsp;<strong>N</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 1000000) oznaczającą liczbę p&oacute;l w ogrodzie pana Wincentego.&nbsp;</p>

<p>W drugiej linii opisu zestawu znajduje się N oddzielonych spacjami liczb naturalnych&nbsp;<strong>c<sub>i</sub></strong>&nbsp;oznaczających liczbę chwast&oacute;w w poszczeg&oacute;lnych polach ogrodu ( 0 &lt;=&nbsp;<strong>c<sub>i</sub></strong>&nbsp;&lt;= 1000000 ).</p>

### 출력

<p>Dla każdego testu należy w osobnej linii wypisać ile minimalnie razy pan Wincenty będzie musiał użyć miotacza płomieni.</p>
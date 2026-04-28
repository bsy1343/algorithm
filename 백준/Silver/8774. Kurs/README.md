# [Silver II] Kurs - 8774

[문제 링크](https://www.acmicpc.net/problem/8774)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 28, 맞힌 사람: 20, 정답 비율: 68.966%

### 분류

자료 구조, 스택

### 문제 설명

<p>Hektor zainteresował się niedawno grą na giełdzie - świat akcji, obligacji, kurs&oacute;w i dywidend jest skomplikowany i pełen liczb, co czyni z niego idealnego kandydata na nowe hobby naszego bohatera.</p>

<p>Hektor dysponuje historią notowań pewnej sp&oacute;łki w postaci listy liczb naturalnych opisujących wartość kursu sp&oacute;łki na kolejnych notowaniach. Dla każdego notowania na liście Hektor chciałby obliczyć, kiedy (licząc od momentu rozważanego notowania) kurs sp&oacute;łki po raz pierwszy przekroczył kurs z tego dnia (tj. formalnie: dla każdej pozycji&nbsp;<strong>x</strong>&nbsp;na liście Hektor chciałby znać najmniejsze&nbsp;<strong>y</strong>, kt&oacute;re jest większe od&nbsp;<strong>x</strong>&nbsp;i jednocześnie takie, że kurs na pozycji&nbsp;<strong>y</strong>&nbsp;był większy od kursu na pozycji&nbsp;<strong>x</strong>).</p>

<p>Czy potrafisz przygotować program, kt&oacute;ry będzie realizował takie obliczenia?</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) opisująca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>Pierwsza linia opisu zestawu testowego zawiera liczbę naturalną&nbsp;<strong>N</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 1000000), oznaczającą długość listy Hektora.</p>

<p>W drugiej linii opisu zestawu znajduje się&nbsp;<strong>N</strong>&nbsp;oddzielonych spacjami liczb naturalnych&nbsp;<strong>k</strong><strong><sub>i</sub></strong>&nbsp;( 1 &lt;=&nbsp;<strong>k</strong><strong><sub>i</sub>&nbsp;</strong>&lt;= 1000000000)&nbsp;oznaczających wysokość kursu sp&oacute;łki na kolejnych notowaniach.</p>

### 출력

<p>Dla każdego testu należy w osobnej linii wypisać&nbsp;<strong>N</strong>&nbsp;oddzielonych spacjami liczb całkowitych odpowiadających wpisom na liście Hektora. Dla pozycji, dla kt&oacute;rych istnieje dalsze notowanie o wyższym kursie, należy wypisać numer pierwszego takiego notowania; przy czym kolejne notowania na liście numerujemy od 0. Dla pozostałych pozycji należy wypisać liczbę -1.</p>
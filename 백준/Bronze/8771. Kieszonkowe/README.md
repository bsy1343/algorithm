# [Bronze I] Kieszonkowe - 8771

[문제 링크](https://www.acmicpc.net/problem/8771)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 140, 정답: 59, 맞힌 사람: 50, 정답 비율: 39.683%

### 분류

수학, 사칙연산

### 문제 설명

<p>Wujek Hektora zaproponował mu niedawno drobne kieszonkowe w związku ze zbliżającymi się wakacjami, przy okazji wystawiając na pr&oacute;bę jego zdolności rachunkowe.</p>

<p>Wujek zapisał na kartce kilka liczb naturalnych i poprosił Hektora o podjęcie decyzji - czy chciałby otrzymać kieszonkowe w wysokości sumy, czy iloczynu zapisanych liczb?</p>

<p>Napisz program, kt&oacute;ry dla zadanego ciągu liczb naturalnych sprawdzi, jaka decyzja będzie najbardziej opłacalna dla Hektora.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) opisująca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>Pierwsza linia opisu zestawu testowego zawiera liczbę naturalną&nbsp;<strong>N</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 1000000 ), oznaczającą ilość liczb zapisanych przez wujka Hektora.</p>

<p>W drugiej linii opisu zestawu znajduje się&nbsp;<strong>N</strong>&nbsp;oddzielonych spacjami liczb naturalnych&nbsp;<strong>k</strong><strong><sub>i</sub></strong>&nbsp;( 1 &lt;=&nbsp;<strong>k</strong><strong><sub>i</sub>&nbsp;</strong>&lt;= 1000)&nbsp;oznaczających kolejne liczby zapisane na kartce.</p>

<p>W przypadku, w kt&oacute;rym na kartce znajduje się tylko jedna liczba, należy przyjąć że zar&oacute;wno suma jak i iloczyn takiego ciągu jest r&oacute;wna jedynej liczbie zapisanej na kartce.</p>

### 출력

<p>Dla każdego testu należy w osobnej linii wypisać słowo &quot;SUMA&quot;, jeśli suma zapisanych liczb jest większa od ich iloczynu, &quot;ILOCZYN&quot;, jeśli iloczyn zapisanych liczb jest większy od sumy i &quot;=&quot; (znak r&oacute;wności) jeżeli suma zapisanych liczb jest r&oacute;wna ich iloczynowi.&nbsp;</p>

### 힌트

<p>W pierwszym zestawie suma liczb jest r&oacute;wna 4 (2+2), podobnie jak iloczyn (2*2).</p>

<p>W drugim zestawie suma liczb wynosi&nbsp;7 (2+2+3), natomiast iloczyn jest r&oacute;wny&nbsp;12 (2*2*3).</p>

<p>W trzecim zesawie suma liczb wynosi 2 (1+1), natomiast iloczyn jest r&oacute;wny 1 (1*1).</p>
# [Platinum V] Paweł i Gaweł - 8787

[문제 링크](https://www.acmicpc.net/problem/8787)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

다이나믹 프로그래밍, 게임 이론, 홀짝성

### 문제 설명

<p>Paweł i Gaweł w jednym spali domu, Paweł na g&oacute;rze, a Gaweł na dole, jak powszechnie wiadomo. Nie każdy jednak wie, jak to się stało, że to Paweł, a nie Gaweł, zajął g&oacute;rne piętro. Kiedy panowie wprowadzali się do nowego domu, okazało się, że obaj chcą mieszkać na g&oacute;rze. Aby rozstrzygnąć sp&oacute;r postanowili zagrać w grę.</p>

<p>Gra toczy się na planszy o wymiarach&nbsp;<strong>N</strong>&nbsp;wierszy na&nbsp;<strong>M</strong>&nbsp;kolumn podzielonej na pola o wymiarach 1 na 1. W rogu o wsp&oacute;łrzędnych (1,1) znajduje się pionek, kt&oacute;ry gracze na zmianę przesuwają o jedno pole do następnej kolumny albo do następnego wiersza, aż do momentu, kiedy pionek znajdzie się w polu o wsp&oacute;łrzędnych (N, M).&nbsp;<strong>K</strong>&nbsp;spośr&oacute;d p&oacute;l na planszy jest zaznaczonych krzyżykiem. Za każdym razem, kiedy pionek wejdzie na pole z krzyżykiem, Paweł i Gaweł zamieniają się piętrami, kt&oacute;re zajmują.&nbsp;</p>

<p>Znając opis planszy, wiedząc, że grę zaczyna Paweł, i że on na początku zajmuje g&oacute;rne piętro, oblicz, kt&oacute;ry z graczy będzie szczęśliwym lokatorem g&oacute;rnego piętra, jeśli obaj nie będą popełniać błęd&oacute;w.</p>

<p>Lewy dolny r&oacute;g to pole w pierwszej kolumnie pierwszego rzędu, i przyjmujemy że to pole nie jest zaznaczone krzyżykiem. Ruchy poza planszę są zabronione.</p>

### 입력

<p>W pierwszej linii znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) opisująca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej linii opisu zestawu znajdują się trzy oddzielone spacjami, opisane w treści liczby naturalne&nbsp;<strong>N</strong>,&nbsp;<strong>M</strong>&nbsp;i&nbsp;<strong>K&nbsp;</strong>( 1 &lt;=&nbsp;<strong>N</strong>,&nbsp;<strong>M</strong>&nbsp;&lt;= 1000; 1 &lt;= K &lt;=&nbsp;<strong>N</strong>*<strong>M</strong>&nbsp;- 1 ).</p>

<p>W kolejnych&nbsp;<strong>K</strong>&nbsp;liniach znajdują się wsp&oacute;łrzędne p&oacute;l zaznaczonych krzyżykiem, podane w postaci pary oddzielonych spacjami liczb naturalnych&nbsp;<strong>wi</strong>,&nbsp;<strong>ci</strong>&nbsp;( 1 &lt;=&nbsp;<strong>w<sub>i</sub></strong>&nbsp;&lt;=&nbsp;<strong>N</strong>, 1 &lt;=&nbsp;<strong>c<sub>i</sub></strong>&nbsp;&lt;=&nbsp;<strong>M</strong>&nbsp;) oznaczających, odpowiednio, numer wiersza i numer kolumny danego pola.</p>

<p>Pole 1,1 nie będzie zaznaczone, zaznaczone pola będą parami r&oacute;żne.</p>

### 출력

<p>Dla każdego zestawu w osobnej linii należy wypisać &quot;Pawel&quot;, jeśli grając na danej planszy Paweł jest w stanie wygrać niezależnie od ruch&oacute;w przeciwnika i &quot;Gawel&quot;, jeśli na danej planszy to Gaweł jest w stanie wygrać niezależnie od ruch&oacute;w przeciwnika.</p>
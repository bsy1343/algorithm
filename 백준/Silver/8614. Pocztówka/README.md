# [Silver III] Pocztówka - 8614

[문제 링크](https://www.acmicpc.net/problem/8614)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 32, 맞힌 사람: 25, 정답 비율: 75.758%

### 분류

수학, 그리디 알고리즘, 조합론

### 문제 설명

<p>W czasie ferii zimowych w g&oacute;rach Wojtek kupił ogromną poczt&oacute;wkę z panoramą g&oacute;r. Po powrocie do domu oprawił ją w ramkę i powiesił na ścianie, aby m&oacute;c ją codziennie podziwiać. Jednak po kilku tygodniach znudził się widokiem z poczt&oacute;wki.</p>

<p>Pamiątka z g&oacute;r już miała powędrować na strych, kiedy Wojtek wpadł na genialny pomysł, aby odciąć kilka g&oacute;r z lewej strony i kilka z prawej i otrzymać nową, ciekawszą panoramę. Jednak gdyby odciął za dużo, nowy widok m&oacute;głby być mało efektowny. Aby temu zapobiec, Wojtek chciałby zostawić na poczt&oacute;wce co najmniej jedną g&oacute;rę o wysokości nie mniejszej niż $m$.</p>

<p>Teraz Wojtek musi wybrać najładniejszą z możliwych kompozycji. Jednak nie wie jeszcze, jak trudne jest to zadanie - aby go o tym przekonać, policz, na ile sposob&oacute;w może otrzymać nową, ciekawszą panoramę. W szczeg&oacute;lności powinieneś uwzględnić, że Wojtek może się rozmyślić i pozostawić poczt&oacute;wkę w stanie niezmienionym, o ile tylko zawiera ona g&oacute;rę wysokości co najmniej $m$.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się dwie liczby całkowite $n$&nbsp;i $m$&nbsp;($1 &le; n &le; 1\,000\,000$, $1 &le; m &le; 1\,000\,000\,000$), oddzielone pojedynczym odstępem i oznaczające odpowiednio liczbę g&oacute;r na poczt&oacute;wce i minimalną wysokość g&oacute;ry, kt&oacute;ra czyni panoramę efektowną. Drugi wiersz zawiera $n$&nbsp;liczb całkowitych $h_i$&nbsp;($1 &le; h_i &le; 1\,000\,000\,000$, $h_i \ne h_j$&nbsp;dla $i \ne j$), pooddzielanych pojedynczymi odstępami. Są to wysokości g&oacute;r w kolejności od lewej do prawej.</p>

### 출력

<p>Na standardowe wyjście Tw&oacute;j program powinien wypisać dokładnie jedną liczbę całkowitą - liczbę wszystkich kompozycji, kt&oacute;re spełniają podane warunki.</p>

### 힌트

<p>Następujące jedenaście kompozycji spełnia warunki zadania:</p>

<pre>
80 102 90 98 100
102 90 98 100
90 98 100
98 100
100
80 102 90 98
80 102 90
80 102
102 90 98
102 90
102</pre>
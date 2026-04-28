# [Bronze I] Supermarket - 7946

[문제 링크](https://www.acmicpc.net/problem/7946)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 161, 정답: 136, 맞힌 사람: 115, 정답 비율: 87.121%

### 분류

정렬

### 문제 설명

<p>&bdquo;Promocja tu promocja tam, promocję zaraz dam tu Wam. Tarampampam.&rdquo; &mdash; taka oto wesoła piosenka płynie ostatnio z megafon&oacute;w supermarketu Stonka. A zasady promocji są następujące. Każdy klient zostawia w sklepie pewną kwotę pieniędzy. Na koniec dnia, dyrekcja sklepu losuje pewien numerek k. Następnie znajduje klienta, kt&oacute;ry wydał w sklepie k-tą co do wartości kwotę pieniędzy i wysyła mu darmową czekoladę z orzechami (oczywiście &bdquo;Wyprodukowano dla dyskontu spożywczego Stonka&rdquo;). Chciałbyś pewnie zapytać, a jak wybrać szczęśliwca, w przypadku, gdy kwoty wydawane przez klient&oacute;w nie są unikalne? My tu jesteśmy od zadawania pytań, a Twoim zadaniem jest jedynie znaleźć wartość k-tej co do wielkości (licząc od najmniejszej do największej) kwoty wydanej danego dnia.</p>

### 입력

<p>W pierwszej linii znajduje się liczba naturalna d (1 &le; d &le; 100), określająca liczbę test&oacute;w.</p>

<p>Pierwsza linia testu zawiera liczbę klient&oacute;w n, kt&oacute;rzy odwiedzili Stonkę danego dnia oraz numerek k (1 &le; n &le; 1000000; 1 &le; k &le; n). W drugiej linii testu znajduje się n liczb całkowitych oznaczających kwoty zostawione w sklepie przez kolejnych klient&oacute;w. Kwoty są liczbami całkowitymi z przedziału [1; 100000].</p>

### 출력

<p>Dla każdego testu wypisz wartość k-tej co do wielkości kwoty zostawionej w Stonce.</p>
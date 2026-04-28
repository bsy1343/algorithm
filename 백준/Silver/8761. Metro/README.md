# [Silver IV] Metro - 8761

[문제 링크](https://www.acmicpc.net/problem/8761)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 57, 정답: 47, 맞힌 사람: 27, 정답 비율: 79.412%

### 분류

그리디 알고리즘

### 문제 설명

<p>W malowniczym szwajcarskim mieście Lozanna działa nowoczesne metro. Jednym z przykład&oacute;w ciekawego rozwiązania inżynieryjnego jest jednotorowa, a jednak dwukierunkowa&nbsp;<a href="http://en.wikipedia.org/wiki/Lausanne_Metro#Line_M1" target="_blank">linia M1</a>. Pociągi poruszają się w obu kierunkach po pojedynczym torze, mijając się na dwuperonowych stacjach, w kt&oacute;rych tor rozwidla się na kr&oacute;tką chwilę.</p>

<p>W zadaniu rozważamy linię metra podobną do lozańskiego M1. Rozważana linia składa się z&nbsp;<strong>N</strong>&nbsp;stacji połączonych pojedynczym torem: pierwsza stacja połączona jest z drugą, druga z pierwszą i trzecią, trzecia z drugą i czwartą, itd. Zakładamy, że odległości pomiędzy stacjami są r&oacute;wne i przejazd pociągu pomiędzy sąsiednimi stacjami zawsze trwa dokładnie jedną minutę.</p>

<p>Niekt&oacute;re spośr&oacute;d stacji są dwuperonowe - na takiej stacji mogą bezkolizyjnie spotkać się dwa pociągi jadące w przeciwne strony. Pozostałe stacje są jednoperonowe i ew. spotkanie pociąg&oacute;w na takiej stacji byłoby zdarzeniem wyjątkowo niefortunnym (szczeg&oacute;lnie dla maszynist&oacute;w i pasażer&oacute;w tych pociąg&oacute;w).</p>

<p>Z dw&oacute;ch końc&oacute;w linii w przeciwnych kierunkach jednocześnie odjeżdżają dwa pociągi. Twoim zadaniem jest wyznaczenie pociągom dodatkowych postoj&oacute;w (dowolnej długości wyrażonej w całkowitej nieujemnej liczbie minut) na dowolnej liczbie stacji tak, aby ich spotkanie wypadło na stacji dwuperonowej (pociągi mogą jednocześnie z dw&oacute;ch stron wjechać na taką stację, możliwe jest także, że jeden z pociąg&oacute;w będzie oczekiwał na drugi na takiej stacji).</p>

<p>Jaki jest minimalny czas jazdy pociąg&oacute;w przy kt&oacute;rym nie dochodzi do kolizji? Przez minimalny czas jazdy rozumiemy minimalny czas po kt&oacute;rym oba pociągi, całe, niezderzone i niewykolejone zakończą jazdę na przeciwległych końcach toru. W przypadku, w kt&oacute;rym jeden z pociąg&oacute;w kończy jazdę wcześniej, wynikiem jest czas jazdy drugiego pociągu.</p>

### 입력

<p>W pierwszej linii znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) oznaczająca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>Opis pojedynczego zestawu testowego składa się z dw&oacute;ch linii. W pierwszej linii znajduje się pojedyncza dodatnia liczba całkowita&nbsp;<strong>N</strong>&nbsp;oznaczająca liczbę stacji metra na linii (2 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 1000000). W drugiej linii znajduje się&nbsp;<strong>N</strong>&nbsp;dodatnich liczb całkowitych&nbsp;<strong>s<sub>i</sub></strong>&nbsp;oddzielonych pojedynczymi spacjami, kt&oacute;re odpowiadają kolejnym stacjom. Każda z nich jest r&oacute;wna 1 lub 2 i oznacza liczbę peron&oacute;w na&nbsp;<strong>i</strong>-tej stacji metra. Co najmniej jedna stacja będzie miała dwa perony.</p>

### 출력

<p>Dla każdego zestawu testowego należy w osobnej linii wypisać minimalny czas bezkolizyjnego przejazdu pociąg&oacute;w. Kolejność wypisywanych odpowiedzi musi odpowiadać kolejności zestaw&oacute;w na wejściu.</p>
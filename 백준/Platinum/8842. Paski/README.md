# [Platinum IV] Paski - 8842

[문제 링크](https://www.acmicpc.net/problem/8842)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 4, 맞힌 사람: 4, 정답 비율: 40.000%

### 분류

조합론, 분할 정복, 수학

### 문제 설명

<p>Hektor posiada długi prostokątny pasek papieru, podzielony na 1073741824 r&oacute;wnych prostokątnych sektor&oacute;w, ułożonych jeden po drugim. Sektory te są ponumerowane kolejnymi liczbami naturalnymi, poczynając od 1. Hektor zamierza pociąć sw&oacute;j pasek na drobniejsze kawałki. Jego cięcia zawsze są perfekcyjne - przechodzą dokładnie przez środek ciętego paska. Ponadto nigdy nie połowi on pask&oacute;w długości nie większej niż jeden sektor.</p>

<p>Po skończonych cięciach Hektor zauważył, że powstałe paski pozwalają na dokładne odtworzenie (poprzez położenie obok siebie kilku z nich) paska liczb z przedziału [<strong>a</strong>,<strong>b</strong>]. Zastanawia się teraz, ile r&oacute;żnych odtworzeń tego przedziału m&oacute;głby uzyskać, gdyby wykonywał inne cięcia. Pom&oacute;ż mu rozwiązać ten problem.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba zestaw&oacute;w testowych&nbsp;<strong>Z</strong>&nbsp;(1&nbsp;<strong>&lt;= Z</strong>&nbsp;<strong>&lt;=</strong>&nbsp;10).</p>

<p>W każdej z kolejnych&nbsp;<strong>Z</strong>&nbsp;linii znajdują się trzy liczby całkowite:&nbsp;<strong>a</strong>,<strong>&nbsp;b</strong>,<strong>&nbsp;m</strong>&nbsp;(1 &lt;=&nbsp;<strong>a&nbsp;</strong>&lt;=&nbsp;<strong>b&nbsp;</strong>&lt;= 1073741824, 1 &lt;=&nbsp;<strong>m</strong>&nbsp;&lt;= 1000000).</p>

### 출력

<p>Dla każdego zestawu testowego należy wypisać jedną liczbę całkowitą - resztę z dzielenia przez&nbsp;<strong>m</strong>&nbsp;ilości r&oacute;żnych możliwych pocięć przedziału [<strong>a</strong>,<strong>b</strong>], możliwych do uzyskania przez Hektora.</p>

### 힌트

<p>Jest tylko jeden spos&oacute;b, żeby odtworzyć dokładnie liczby z przedziału [2,2] - trzeba posiadać pasek symbolizujący pojedynczy sektor 2.</p>

<p>W drugim teście mamy odtworzyć liczby z przedziału [3,4], co możemy zrobić na dwa sposoby - albo za pomocą jednego paska pokrywającego cały przedział [3,4], albo za pomocą dw&oacute;ch pask&oacute;w: [3,3] oraz [4,4].</p>

<p>W trzecim teście przedział [1,3] można odtworzyć r&oacute;wnież na dwa sposoby: albo przedziałami [1,1], [2,2], [3,3], albo tylko dwoma przedziałami: [1,2], [3,3].</p>
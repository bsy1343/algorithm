# [Platinum V] Dziwna planeta - 8756

[문제 링크](https://www.acmicpc.net/problem/8756)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 13, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

수학, 정수론, 조합론, 모듈로 곱셈 역원, 홀짝성

### 문제 설명

<p>Pewnego razu gdzieś tam sobie istniała <em>n</em>-wymiarowa przestrzeń. Znajdowała się tam r&oacute;wnież pewna dziwna planeta. Jedną z jej przedziwnych cech był jej kształt -&nbsp;<em>n</em>-wymiarowy hipersześcian o jednostkowej długości boku. W każdym wierzchołku planety znajdowało się pewne dziwne miasto.</p>

<p>Terytorium tej planety zostało podzielone między trzy wrogie kr&oacute;lestwa. Jednak kilka miast ogłosiło swoją niezależność - nazwijmy je neutralnymi: <em>i</em>-te miasto jest niezależne, jeśli <em>d</em><sub>1</sub>(<em>i</em>) = <em>d</em><sub>2</sub>(<em>i</em>) = <em>d</em><sub>3</sub>(<em>i</em>), gdzie <em>d<sub>j</sub></em>(<em>i</em>)&nbsp;oznacza odległość między <em>i</em>-tym miastem oraz stolicą <em>j</em>-tego kr&oacute;lestwa. Wszystkie odległości liczone są przy pomocy metryki miejskiej.</p>

<p>Twoim zadaniem jest obliczenie liczby neutralnych miast. Ze względu na to że wynik może być duży, wystarczy wypisać go modulo 10<sup>9</sup> + 7.</p>

### 입력

<p>Wejście zawiera trzy linie. W każdej linii znajdują się wsp&oacute;łrzędne stolicy kolejnego kr&oacute;lestwa w postaci liczby binarnej długosci&nbsp;<em>n</em>&nbsp;(1 &le; <em>n</em> &le; 10<sup>5</sup>).</p>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia powinna się znaleźć jedna liczba całkowita r&oacute;wna liczbie neutralnych miast modulo 10<sup>9</sup> + 7.</p>
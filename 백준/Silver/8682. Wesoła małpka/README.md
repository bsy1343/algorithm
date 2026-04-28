# [Silver IV] Wesoła małpka - 8682

[문제 링크](https://www.acmicpc.net/problem/8682)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 126, 정답: 71, 맞힌 사람: 49, 정답 비율: 50.000%

### 분류

수학, 정수론, 유클리드 호제법

### 문제 설명

<p>Wesoła małpka znalazła sobie nową zabawę. Ustawiła <em>n</em>&nbsp;klatek ze zwierzątkami (w jednej klatce jest dokładnie jedno zwierzątko) w k&oacute;łeczko i skacze po nich. Małpka zawsze skacze o <em>d</em>&nbsp;kolejnych klatek i zawsze otwiera tę, na kt&oacute;rej stoi. Małpka zatrzyma się, gdy skoczy na wcześniej otwartą klatkę. Twoim zadaniem jest stwierdzić, ile zwierzątek ucieknie. Wiadomo, że wszystkie klatki są początkowo zamknięte oraz każde zwierzątko (poza wesołą małpką) korzysta z okazji i ucieka jeśli może.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą <em>z</em>&nbsp;(1 &le; <em>z</em> &le; 10<sup>6</sup>), oznaczającą liczbę zestaw&oacute;w danych. W następnych&nbsp;<em>z</em>&nbsp;wierszach opisywane są kolejne zestawy danych.</p>

<p>Każdy wiersz zawiera po dwie liczby całkowite <em>n</em>&nbsp;i <em>d</em>&nbsp;(1 &le; <em>n</em>, <em>d</em> &le; 10<sup>9</sup>), oznaczające odpowiednio liczbę klatek oraz długość skoku małpki (<em>d</em> = 1, oznacza, że małpka przeskoczy na następną w kolejności klatkę).</p>

### 출력

<p>Dla każdego zestawu danych powinna się znaleźć w nowym wierszu jedna liczba całkowita, r&oacute;wna liczbie zwierzątek, kt&oacute;re uciekną.</p>
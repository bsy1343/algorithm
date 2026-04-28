# [Gold II] Popisowa samoobrona - 7955

[문제 링크](https://www.acmicpc.net/problem/7955)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

그래프 이론, 그래프 탐색, 게임 이론

### 문제 설명

<p>Przewidywanie ruch&oacute;w przeciwnika to bezcenna umiejętność w rywalizacji każdego rodzaju. Kluczowym elementem jest możliwość odpowiedniej reakcji na ruch przeciwnika. Każdy ruch stawia nas jednak w innej sytuacji i zmienia możliwości dalszych ruch&oacute;w.</p>

<p>Przyjmijmy, że analizujemy rywalizację, w kt&oacute;rej można znaleźć się w jednej z n sytuacji. Zał&oacute;żmy ponadto, że w każdej z nich rozważamy dostępność dw&oacute;ch typ&oacute;w ruch&oacute;w oznaczonych jako A i B. Atakujący pierwszy wchodzi do rozgrywki i wybiera swoją sytuację początkową, w kt&oacute;rej się znajduje. Następnie Broniący r&oacute;wnież wybiera sytuację początkową r&oacute;żną od sytuacji początkowej Atakującego. Potem następuje faza rywalizacji. Atakujący musi wykonać ruch typu A lub B, o ile jest on dostępny w sytuacji w kt&oacute;rej się znajduje. Gdy nie może wykonać ruchu to przegrywa. Broniący musi odpowiedzieć ruchem tego samego typu ze swojej sytuacji. Jeśli nie jest to możliwe &mdash; przegrywa.</p>

<p>Twoim zadaniem jest napisanie programu, kt&oacute;ry analizuje sytuacje i ruchy w nich dostępne i powie, czy Broniący może zawsze odpowiadać na ruchy przeciwnika.</p>

### 입력

<p>Pierwsza linia wejścia zawiera małą liczbę całkowitą z &ndash; liczbę zestaw&oacute;w danych występujących kolejno po sobie. Opis jednego zestawu jest następujący:</p>

<p>W pierwszej linii występuje liczba całkowita n określająca liczbę sytuacji (2 &le; n &le; 2000). W kolejnych n liniach znajdują się opisy ruch&oacute;w możliwych do wykonania w każdej sytuacji. Każda linia zawiera dwie liczby całkowite a, b (0 &le; a, b &le; n) opisujące odpowiednio sytuacje do kt&oacute;rych przejdziemy wybierając ruch typu A lub B. Liczba 0 oznacza brak możliwości wykonania ruchu danego typu.</p>

### 출력

<p>Dla każdego zestawu danych wypisz słowo TAK jeśli Broniący może zawsze odpowiadać na ruchy Atakującego. Gdy nie jest to możliwe wypisz NIE.</p>
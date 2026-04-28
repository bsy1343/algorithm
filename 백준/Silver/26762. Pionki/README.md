# [Silver III] Pionki - 26762

[문제 링크](https://www.acmicpc.net/problem/26762)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 40, 정답: 30, 맞힌 사람: 22, 정답 비율: 75.862%

### 분류

애드 혹

### 문제 설명

<p>Bajtek gra w Pionki, prostą grę planszową dla jednego gracza. Na niekt&oacute;rych polach szachownicy o wymiarach N &times; M stoją pionki, na każdym polu co najwyżej jeden. W jednym ruchu można przesunąć pionek o dowolną liczbę p&oacute;l w pionie lub poziomie, być może przeskakując inne pionki lub wskakując na pole, na kt&oacute;rym stoją już jakieś pionki. Celem gry jest sprawić, aby wszystkie pionki stanęły na tym samym polu, wykonując przy tym jak najmniejszą liczbę ruch&oacute;w.</p>

<p>Bajtek zastanawia się, czy gra w tę grę optymalnie. Pom&oacute;ż mu i napisz program, kt&oacute;ry wczyta sytuację początkową na planszy i wyznaczy minimalną liczbę ruch&oacute;w prowadzących do osiągnięcia celu.</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie dodatnie liczby całkowite N i M (1 &le; N &middot; M &le; 1 000 000) oddzielone pojedynczym odstępem i określające kolejno: wysokość i szerokość szachownicy. W kolejnych N wierszach znajduje się opis sytuacji początkowej na szachownicy. Każdy z tych wierszy zawiera po M znak&oacute;w. Znak . (kropka) oznacza, że dane pole jest puste, zaś # (hasz) oznacza, że na tym polu stoi pionek.</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia należy wypisać jedną liczbę całkowitą &ndash; minimalną liczbę ruch&oacute;w potrzebną do sprowadzenia wszystkich pionk&oacute;w na to samo pole.</p>
# [Silver III] Kulki - 26761

[문제 링크](https://www.acmicpc.net/problem/26761)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 16, 맞힌 사람: 12, 정답 비율: 80.000%

### 분류

그리디 알고리즘

### 문제 설명

<p>Bajtazar bawi się w Kulki. Gra ta toczy się na planszy o wymiarach 2 &times; N (dwa rzędy po N kolumn). Na każdym polu znajduje się dokładnie jedna kulka. Łącznie na planszy znajduje się dokładnie N kulek białych oraz N kulek czarnych. W jednym ruchu Bajtazar może zamienić miejscami dwie sąsiednie kulki (w pionie lub w poziomie). Celem gry jest uporządkowanie kulek w taki spos&oacute;b, aby w każdym rzędzie występowały tylko kulki jednego koloru. Bajtazar chciałby osiągnąć cel w jak najmniejszej liczbie ruch&oacute;w. Pom&oacute;ż mu!</p>

<p>Napisz program, kt&oacute;ry wczyta początkowe ułożenie kulek na planszy oraz wyznaczy minimalną liczbę ruch&oacute;w prowadzącą do celu.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 100 000), określająca liczbę kolumn. W drugim i trzecim wierszu wejścia znajduje się ciąg N znak&oacute;w B lub C opisujący kolory kulek w kolejnych kolumnach pierwszego i drugiego rzędu planszy, gdzie B oznacza białą kulkę, a C &ndash; czarną kulkę.</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia należy wypisać jedną nieujemną liczbę całkowitą &ndash; minimalną liczbę ruch&oacute;w prowadzących do osiągnięcia celu gry.</p>
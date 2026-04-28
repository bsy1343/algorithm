# [Silver V] Oczko - 26743

[문제 링크](https://www.acmicpc.net/problem/26743)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 63, 정답: 48, 맞힌 사람: 36, 정답 비율: 80.000%

### 분류

구현, 문자열

### 문제 설명

<p>Bajtazar organizuje turniej gry w oczko. Jest to gra w karty, w kt&oacute;rej celem jest dobierać karty, aby zbierać punkty. Wynik punktowy każdego gracza to suma wartości kart przez niego posiadanych: dw&oacute;jka (oznaczana na wejściu znakiem 2) liczy się za 2 punkty, tr&oacute;jka (3) za 3, czw&oacute;rka (4) za 4, ..., dziewiątka (9) za 9, zaś dziesiątka, walet, dama, kr&oacute;l (odpowiednio: T, J, Q, K) są za 10 punkt&oacute;w. As (A) jest wart 1 lub 11 punkt&oacute;w &ndash; dla gracza wybierany jest korzystniejszy wariant. Gracze, kt&oacute;rzy zgromadzili więcej niż 21 (tzw. fura) przegrywają. Wygrywa ten, kto zgromadzi najwięcej punkt&oacute;w (ale nie więcej niż 21). Jeżeli więcej niż jeden gracz zgromadzi największą liczbę punkt&oacute;w to wszyscy ci zawodnicy wygrywają.</p>

<p>Karty zostały porozdawane, wszyscy już pokazali co mają, ale nie ma zgody w sprawie tego kto wygrał. Może pomożesz rozstrzygnąć konflikt?</p>

<p>Napisz program, kt&oacute;ry wyznaczy zbi&oacute;r graczy, kt&oacute;rzy wygrali rozgrywkę.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 20) określająca liczbę graczy. W kolejnych N wierszach znajdują się niepuste ciągi znak&oacute;w 23456789TJQKA określające figury kart posiadanych przez kolejnych graczy.</p>

<p>Gracze numerowani są kolejnymi liczbami naturalnymi od 1 do N włącznie, zgodnie z kolejnością występowania ich ciąg&oacute;w na wejściu. Długość każdego ciągu nie przekracza 10 znak&oacute;w. Bajtazar ma specjalną talię - każdy znak może się powt&oacute;rzyć dowolną liczbę razy.</p>

### 출력

<p>W pierwszym wierszu wyjścia powinna się znaleźć jedna liczba naturalna R &ndash; liczba graczy, kt&oacute;rzy wygrali rozgrywkę. W drugim (ostatnim) wierszu wyjścia powinien się znaleźć rosnący ciąg R liczb naturalnych pooddzielanych pojedynczymi odstępami &ndash; numery zawodnik&oacute;w, kt&oacute;rzy wygrali.</p>
# [Gold V] Przyciski - 8576

[문제 링크](https://www.acmicpc.net/problem/8576)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 35, 맞힌 사람: 23, 정답 비율: 76.667%

### 분류

구현, 자료 구조, 집합과 맵

### 문제 설명

<p>Bajtek znalazł ciekawą zabawkę. Zabawka ta ma $n+1$&nbsp;przycisk&oacute;w. Nad każdym z $n$&nbsp;pierwszych przycisk&oacute;w znajduje się mały licznik, początkowo wskazujący zero. Naciśnięcie przycisku pod licznikiem zwiększa wskazywaną przezeń liczbę o $1$.</p>

<p>Zabawka szybko by się Bajtkowi znudziła, gdyby nie kuriozalne działanie przycisku o numerze $n+1$. Po jego użyciu wszystkie $n$&nbsp;licznik&oacute;w zaczyna wskazywać największą z widocznych dotąd na zabawce wartości. Na przykład, jeżeli $n = 5$&nbsp;i kolejne liczniki wskazują liczby $0$, $0$, $1$, $2$, $0$, to po naciśnięciu przycisku o numerze $6$&nbsp;wszystkie liczniki będą wskazywać $2$.</p>

<p>Wiedząc, kt&oacute;re przyciski wybierał kolejno Bajtek, chcemy poznać wartości wszystkich licznik&oacute;w po zakończeniu zabawy.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera dwie liczby całkowite $n$, $m$&nbsp;($1 &le; n, m &le; 10^6$), oznaczające kolejno liczbę licznik&oacute;w na zabawce i liczbę operacji wykonanych przez Bajtka. Drugi wiersz wejścia zawiera $m$&nbsp;liczb całkowitych $p_1, p_2, \dots , p_m$&nbsp;($1 &le; p_i &le; n+1$), oznaczających numery kolejnych przycisk&oacute;w wciskanych przez Bajtka.</p>

### 출력

<p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać $n$&nbsp;liczb całkowitych, oddzielonych pojedynczymi odstępami, oznaczających wartości znajdujące się na kolejnych licznikach po zakończeniu zabawy.</p>
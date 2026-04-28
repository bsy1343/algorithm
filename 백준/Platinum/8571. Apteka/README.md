# [Platinum II] Apteka - 8571

[문제 링크](https://www.acmicpc.net/problem/8571)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 18, 맞힌 사람: 15, 정답 비율: 71.429%

### 분류

다이나믹 프로그래밍, 볼록 껍질을 이용한 최적화

### 문제 설명

<p>Jaś stoi ostatni w kolejce do apteki. Ponieważ Jasiowi bardzo się śpieszy, to postanowił, że spr&oacute;buje się pozamieniać miejscami z niekt&oacute;rymi osobami, nawet jeśli musiałby za to zapłacić.</p>

<p>Każda osoba jest chętna do zamiany, ale $i$-tej osobie za przesunięcie o każde jedno miejsce dalej w kolejce trzeba zapłacić $c_i$. Dokładniej, jeśli Jaś jest $k$&nbsp;miejsc ($k &gt; 0$) dalej od kasy niż pewna osoba i jeśli chce się z nią zamienić miejscami, to musi jej zapłacić kwotę $k \cdot c_i$.</p>

<p>Jaś chciałby być pierwszy w kolejce i zastanawia się, jak dokonywać zamian, aby wydać jak najmniej.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą $n$&nbsp;($1 &le; n &le; 10^6$), oznaczającą liczbę os&oacute;b, kt&oacute;re stoją przed Jasiem w kolejce do apteki.</p>

<p>Następny wiersz wejścia zawiera $n$&nbsp;liczb całkowitych $c_1, c_2, \dots , c_n$&nbsp;($1 &le; c_i &le; 10^9$), gdzie $c_i$&nbsp;oznacza kwotę, jaką Jaś musi zapłacić $i$-tej osobie za przesunięcie o każde miejsce dalej w kolejce. Kolejność os&oacute;b liczona jest od osoby, za kt&oacute;rą bezpośrednio stoi Jaś, a więc od końca kolejki do jej początku.</p>

### 출력

<p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną minimalnej kwocie, jaką Jaś musi zapłacić, aby być pierwszym w kolejce.</p>

### 힌트

<p><b>Wyjaśnienie do przykładu:</b>&nbsp;Jaś zamieni się najpierw z $3$&nbsp;osobą w kolejce za kwotę $2 \cdot 2$, a następnie z pierwszą osobą w kolejce za kwotę $3 \cdot 2$.</p>
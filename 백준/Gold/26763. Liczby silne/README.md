# [Gold II] Liczby silne - 26763

[문제 링크](https://www.acmicpc.net/problem/26763)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 14, 맞힌 사람: 11, 정답 비율: 64.706%

### 분류

이분 탐색, 비트마스킹, 브루트포스 알고리즘, 누적 합

### 문제 설명

<p>Silnia liczby N (oznaczana N!) to wartość iloczynu kolejnych liczb naturalnych dodatnich od 1 do N włącznie, tzn. 1 &middot; 2 &middot; . . . &middot; N. Mamy zatem 1! = 1, 2! = 1 &middot; 2, 3! = 1 &middot; 2 &middot; 3 = 6 oraz 4! = 1 &middot; 2 &middot; 3 &middot; 4 = 24, itd.</p>

<p>Liczbę nazwiemy silną, jeśli jest sumą jednej lub wielu parami r&oacute;żnych silni. Na przykład liczba 25 = 24 + 1 = 4! + 1! jest liczbą silną, tak samo liczba 6 = 3! natomiast liczba 5, ani liczba 4 nie jest. Zwr&oacute;ć uwagę że w przypadku liczby 4, 4 = 2! + 2!, ale te dwie silnie nie są r&oacute;żne, zatem 4 nie jest liczbą silną.</p>

<p>Dla zadanych przedział&oacute;w [A, B], oblicz ile wynosi suma liczb silnych mieszczących się w tych przedziałach (wliczając A oraz B).</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna Q (1 &le; Q &le; 100 000) określająca liczbę zapytań. W kolejnych Q wierszach znajdują się kolejne zapytania: pary liczb całkowitych A i B (1 &le; A &le; B &le; 10<sup>13</sup>).</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście Q wierszy. W i-tym powinna się znaleźć odpowiedź dla i-tego zapytania w kolejności w jakiej występują na wejściu: suma liczb silnych w przedziale [A, B].</p>
# [Gold V] Pokoje - 8752

[문제 링크](https://www.acmicpc.net/problem/8752)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 13, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>W bajtockim hotelu ukrył się tajny szpieg Pituś. Obawiając się, że ktoś zna numer pokoju, w kt&oacute;rym się znajduje, poprzekręcał on w nocy niekt&oacute;re 9 na 6, a niekt&oacute;re 6 na 9.</p>

<p>W poszukiwaniu szpiega do hotelu przybył agent Dejf. Udało mu się już dowiedzieć, w kt&oacute;rym pokoju zakwaterował się Pituś oraz poznać fakt poprzekręcania 6 i 9. Niestety Dejf zna tylko numer pokoju Pitusia przed przekręceniem. Agent zastanawia się teraz, ile pokoi musi sprawdzić, aby mieć pewność, że znajdzie szpiega.</p>

<p>Wiedząc, ile pokoi znajduje się w hotelu oblicz, ile pokoi musi sprawdzić Dejf. Wystarczy, że podasz resztę z dzielenia pokoi przez 10<sup>7</sup> &minus; 3.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita <em>h</em> (1 &le; <em>h</em> &le; 10<sup>1000000</sup>), oznaczająca liczbę pokoi w hotelu. W drugim wierszu wejścia znajduje się jedna liczba całkowita <em>n</em> (1 &le; <em>n</em> &le; <em>h</em>), oznaczająca numer pokoju, w kt&oacute;rym zakwaterował się Pituś.</p>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia powinna znaleźć się jedna liczba całkowita, r&oacute;wna reszcie z dzielenia przez 10<sup>7</sup> &minus; 3 pokoi, kt&oacute;re musi sprawdzić Dejf.</p>
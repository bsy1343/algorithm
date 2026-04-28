# [Silver V] Samochody - 8659

[문제 링크](https://www.acmicpc.net/problem/8659)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 206, 정답: 122, 맞힌 사람: 92, 정답 비율: 56.442%

### 분류

구현, 누적 합

### 문제 설명

<p>Przemek obserwuje ruch samochod&oacute;w na drodze. Droga jest dwukierunkowa i łączy wschodnią część miasta z zachodnią. Ponieważ Przemek stoi na wzg&oacute;rzu, to widzi dokładane położenie wszystkich samochod&oacute;w.</p>

<p>Zastanawia się teraz, ile par samochod&oacute;w minie się między sobą. Dwa samochody miną się, jeśli jadą w przeciwnych kierunkach, gdy pierwszy z nich (patrząc od lewej) jedzie na wsch&oacute;d, a drugi na zach&oacute;d. Zakładamy, że samochody nie zawracają, nie wyprzedzają oraz wszystkie jadą prosto przed siebie.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 10<sup>6</sup>), oznaczająca liczbę wszystkich samochod&oacute;w, kt&oacute;re widzi Przemek.</p>

<p>W drugim wierszu wejścia znajduje się&nbsp;<em>n</em>&nbsp;liczb całkowitych <em>s</em><sub>1</sub>, <em>s</em><sub>2</sub>, ..., <em>s<sub>n</sub></em>&nbsp;(0 &le; <em>s<sub>i</sub></em> &le; 1), oznaczających kolejne samochody, podawane w kolejności od najbardziej położonych na zach&oacute;d (samoch&oacute;d&nbsp;<em>s<sub>i</sub></em>&nbsp;jest położony bardziej na zach&oacute;d niż samoch&oacute;d&nbsp;<em>s<sub>i</sub></em><sub>+1</sub>). Liczba&nbsp;<em>s<sub>i</sub></em>, oznacza kierunek jazdy <em>i</em>-tego samochodu: 0&nbsp;- samoch&oacute;d jedzie na wsch&oacute;d, 1&nbsp;- samoch&oacute;d jedzie na zach&oacute;d.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną liczbie par samochod&oacute;w, kt&oacute;re będą się mijały.</p>

### 힌트

<p>Pary mijających się samochod&oacute;w: (1, 2), (1, 4), (1, 5), (3, 4), (3, 5).</p>
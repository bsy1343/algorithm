# [Silver V] Skarbonka - 26628

[문제 링크](https://www.acmicpc.net/problem/26628)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 68, 정답: 50, 맞힌 사람: 24, 정답 비율: 72.727%

### 분류

수학, 그리디 알고리즘

### 문제 설명

<p>W Bajtocji, jak na zinformatyzowane państwo przystało, w obiegu znajdują się tylko monety o nominałach będących potęgami dw&oacute;jki bajtozłotych. Tak więc, dla przykładu, istnieją monety o nominałach 1, 16 czy 128 bajtozłotych; natomiast nie są produkowane monety o nominałach takich jak 3 lub 12 bajtozłotych.</p>

<p>Bajtek, młody mieszkaniec Bajtocji, posiada w domu wielką skarbonkę. Codziennie, gdy tylko przyjdzie do domu ze szkoły, otrzymuje kieszonkowe w postaci pojedynczej bajtockiej monety, kt&oacute;rą natychmiast wrzuca do skarbonki.</p>

<p>Minęło już sporo dni, od czasu, gdy Bajtek zaczął zbieranie monet, i skarbonka jest już wypełniona po brzegi. Bajtek postanowił zatem ją rozbić i wyjąć z niej wszystkie monety. P&oacute;jdzie teraz do banku, by wymienić część z nich na inne monety. Chciałby zrobić to w taki spos&oacute;b, aby najbardziej wartościowa z monet, kt&oacute;re uzyska, miała możliwie jak największy nominał. Jaki będzie ten nominał?</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą n (1 &le; n &le; 1 000 000) oznaczającą liczbę monet włożonych przez Bajtka do skarbonki. Następny wiersz zawiera opis wszystkich tych monet. Zawiera on ciąg n liczb naturalnych a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> (0 &le; a<sub>i</sub> &le; 201 718), kt&oacute;ry oznacza, że wartości monet w skarbonce są r&oacute;wne kolejno 2<sup>a<sub>1</sub></sup>, 2<sup>a<sub>2</sub></sup>, . . . , 2<sup>a<sub>n</sub></sup> bajtozłotych.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę naturalną b oznaczającą, że najbardziej wartościowa z monet, jaką jest w stanie uzyskać Bajtek, ma nominał 2<sup>b</sup> bajtozłotych.</p>

### 힌트

<p>Wyjaśnienie do przykładu: Monety w skarbonce mają nominały 8, 16, 2, 8 i 8 bajtozłotych. Łącznie są więc warte 42 bajtozłote. Aby uzyskać większy nominał, Bajtek może wymienić w banku monety o nominałach 8, 16, 8 i 8 (łącznie warte 40 bajtozłotych) na monety o nominałach 32, 4 i 4 (r&oacute;wnież łącznie warte 40 bajtozłotych). Najbardziej wartościowa moneta, kt&oacute;rą uzyska, będzie miała nominał 2<sup>5</sup> bajtozłotych.</p>
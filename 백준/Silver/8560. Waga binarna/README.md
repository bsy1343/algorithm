# [Silver V] Waga binarna - 8560

[문제 링크](https://www.acmicpc.net/problem/8560)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 75, 정답: 71, 맞힌 사람: 62, 정답 비율: 93.939%

### 분류

수학, 정렬

### 문제 설명

<p>Waga binarna to specyficzne urządzenie, kt&oacute;re może dokonywać pomiar&oacute;w dowolnych wielkości z przedziału (0, 1)&nbsp;z ustaloną dokładnością. Dokładność wagi ustala się pokrętłem, kt&oacute;re można ustawić na pozycji 1&nbsp;lub 2, lub 3, lub ..., lub 10. Gdy dokładność jest ustawiona na <em>m</em>, to waga dokonuje pomiar&oacute;w z dokładnością do 1 / 2<em><sup>m</sup></em>. Wyniki pomiar&oacute;w wagi są zapisywane w postaci par (<em>ℓ</em>, <em>m</em>). Taka para oznacza, że dokładność wagi jest ustawiona na <em>m</em>&nbsp;i wskazanie wagi wynosi <em>ℓ</em>, czyli ciężar ważonego przedmiotu wynosi <em>ℓ</em>/2<em><sup>m</sup></em>&nbsp;(<em>ℓ</em>&nbsp;jest liczbą naturalną i oczywiście 0 &lt; <em>ℓ</em> &lt; 2<em><sup>m</sup></em>, gdyż wspominaliśmy, że waga wskazuje wielkości z przedziału (0, 1)).</p>

<p>Twoim zadaniem jest napisanie programu, kt&oacute;ry uporządkuje wyniki pomiar&oacute;w od najmniejszych do największych. Wyniki pomiar&oacute;w zadane są w postaci par (<em>ℓ</em>, <em>m</em>). R&oacute;żne pary oznaczające takie same wyniki (np. (1, 2)&nbsp;i (2, 3)) należy uporządkować rosnąco według wskazań, czyli pierwszych element&oacute;w w parach.</p>

### 입력

<p>Program powinien czytać dane z wejścia standardowego. W pierwszym wierszu danych podana jest liczba <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 20 000), oznaczająca liczbę par. W kolejnych <em>n</em>&nbsp;wierszach podane są pary liczb&nbsp;<em>ℓ<sub>i</sub></em>&nbsp;i <em>m<sub>i</sub></em>, po jednej parze w wierszu; <em>ℓ<sub>i</sub></em>&nbsp;i <em>m<sub>i</sub></em>&nbsp;są oddzielone pojedynczym odstępem. Dla każdej pary spełnione są warunki:&nbsp;1 &le; <em>m<sub>i</sub></em> &le; 10&nbsp;oraz&nbsp;1 &le;&nbsp;<em>ℓ<sub>i</sub></em> &le; 2<em><sup>m<sub>i</sub></sup></em>.</p>

### 출력

<p>Program powinien pisać wynik na wyjście standardowe. Wynikiem powinno być <em>n</em>&nbsp;par liczb podanych na wejściu, ale w takiej kolejności, by pary odpowiadające mniejszym wartościom pomiar&oacute;w występowały przed parami odpowiadającymi większym wartościom. Takie same pomiary należy zapisać niemalejąco według wskazań. Każdą parę należy zapisać w takiej samej postaci, w jakiej była podana na wejściu.</p>
# [Gold II] Wczasy - 8448

[문제 링크](https://www.acmicpc.net/problem/8448)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 36, 정답: 13, 맞힌 사람: 12, 정답 비율: 41.379%

### 분류

기하학, 3차원 기하학, 수학

### 문제 설명

<p>W ostatnich latach ruch w Bajtockiej Przestrzeni Międzyplanetarnej zwiększył się znacząco. Sterowanie ruchem statk&oacute;w poruszających się we wszystkich możliwych kierunkach stało się na tyle skomplikowane, że senat Bajtocji postanowił nakazać wszystkim pojazdom poruszanie się r&oacute;wnolegle do osi (tr&oacute;jwymiarowego) układu wsp&oacute;łrzędnych.</p>

<p>Wywołało to oburzenie licznych środowisk, w tym branży turystycznej. Tegorocznym hitem sezonu miały być&nbsp;<i>Wczasy na końcu świata</i>, czyli wczasy na najbardziej odległej planecie z galaktyki. Jednak zmiana organizacji ruchu międzygwiezdnego spowodowała, że od teraz odległości międzyplanetarne trzeba obliczać według innego wzoru.</p>

<p>Zostałeś zatrudniony w jednym z biur podr&oacute;ży i otrzymałeś od nich wsp&oacute;łrzędne wszystkich planet w galaktyce. Twoim zadaniem jest obliczenie, dla każdej planety, w jakiej odległości od niej znajduje się najdalsza planeta. Odległość pomiędzy planetami o wsp&oacute;łrzędnych (<em>x</em><sub>1</sub>, <em>y</em><sub>1</sub>, <em>z</em><sub>1</sub>)&nbsp;i&nbsp;(<em>x</em><sub>2</sub>, <em>y</em><sub>2</sub>, <em>z</em><sub>2</sub>)&nbsp;wyraża się wzorem |<em>x</em><sub>1</sub> - <em>x</em><sub>2</sub>| + |<em>y</em><sub>1</sub> - <em>y</em><sub>2</sub>| + |<em>z</em><sub>1</sub> - <em>z</em><sub>2</sub>|</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 500 000) oznaczająca liczbę planet w galaktyce. Każdy z kolejnych <em>n</em>&nbsp;wierszy zawiera wsp&oacute;łrzędne jednej planety w postaci trzech liczb całkowitych <em>x<sub>i</sub></em>, <em>y<sub>i</sub></em>, <em>z<sub>i</sub></em>&nbsp;(-10<sup>9</sup> &le; <em>x<sub>i</sub></em>, <em>y<sub>i</sub></em>, <em>z<sub>i</sub></em> &le; 10<sup>9</sup>). Wsp&oacute;łrzędne jednej planety mogą pojawić się na wejściu wielokrotnie.</p>

### 출력

<p>Należy wypisać <em>n</em>&nbsp;wierszy. W <em>i</em>-tym spośr&oacute;d nich powinna znaleźć się jedna liczba całkowita oznaczająca odległość planety opisanej w&nbsp;<img src="./Wczasy_files/wcz-tex.13.png" />-tym wierszu wejścia od najdalszej od niej planety w galaktyce.</p>
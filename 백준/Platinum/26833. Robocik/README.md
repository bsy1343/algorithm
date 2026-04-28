# [Platinum II] Robocik - 26833

[문제 링크](https://www.acmicpc.net/problem/26833)

### 성능 요약

시간 제한: 6 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 9, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

수학, 구현, 많은 조건 분기

### 문제 설명

<p>Rozważmy płaszczyznę z prostokątnym układem wsp&oacute;łrzędnych. W punkcie (0, 0) tej płaszczyzny znajduje się skierowany na p&oacute;łnoc (tj. w stronę rosnącej drugiej wsp&oacute;łrzędnej) programowalny robocik. Robocika programuje się, podając mu ciąg komend d<sub>1</sub>, d<sub>2</sub>, . . . , d<sub>n</sub>. Po włączeniu robocik wykonuje kolejne ruchy; i-ty ruch (dla i &ge; 1) polega na przejechaniu do przodu d<sub>((i&minus;1) mod n)+1</sub> jednostek (gdzie &bdquo;mod n&rdquo; oznacza operację brania reszty z dzielenia przez n), a następnie obr&oacute;t o 90<sup>◦</sup> w prawo.</p>

<p>Robocik ma baterię, kt&oacute;ra starczy mu na t sekund działania. Zar&oacute;wno przejechanie jednej jednostki odległości, jak i jeden obr&oacute;t o 90<sup>◦</sup> trwa jedną sekundę.</p>

<p>Napisz program, kt&oacute;ry wyznaczy, ile razy robocik znajdzie się w ustalonym punkcie (x, y) na płaszczyźnie, zanim skończy mu się bateria.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się dwie liczby całkowite n i t (1 &le; n &le; 100 000, 1 &le; t &le; 10<sup>18</sup>) oznaczające długość programu robocika i czas działania baterii. W drugim wierszu znajduje się ciąg n liczb całkowitych d<sub>1</sub>, . . . , d<sub>n</sub> (1 &le; d<sub>i</sub> &le; 10<sup>9</sup>), oznaczających kolejne komendy programu. Trzeci wiersz zawiera dwie liczby całkowite x i y (&minus;10<sup>9</sup> &le; x, y &le; 10<sup>9</sup>) oznaczające wsp&oacute;łrzędne punktu, o kt&oacute;ry pytamy.</p>

### 출력

<p>Na standardowe wyjście należy wypisać jedną liczbę całkowitą oznaczającą liczbę moment&oacute;w, w kt&oacute;rych robocik znajdzie się w punkcie (x, y). Jeśli znajdzie się tam w czasie 0 lub t, to r&oacute;wnież należy to uwzględnić.</p>

### 힌트

<p>Wyjaśnienie przykładu: Robocik znajdzie się w punkcie (3, 2) po 6 i 22 sekundach od włączenia. Poniższy rysunek przedstawia trasę robocika:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26833.%E2%80%85Robocik/b707b099.png" data-original-src="https://upload.acmicpc.net/437b0efe-aa39-4311-b923-9c97a1723a2f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 256px; height: 258px;" /></p>
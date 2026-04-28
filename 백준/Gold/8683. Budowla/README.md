# [Gold II] Budowla - 8683

[문제 링크](https://www.acmicpc.net/problem/8683)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 5, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

수학, 자료 구조, 트리, 이분 탐색, 누적 합, 우선순위 큐

### 문제 설명

<p>W Bajtocji ruszyła rekonstrukcja dawnej budowli. Mimo że budowa potrwa jeszcze wiele miesięcy, to bilety, na pierwszą wizytę wykupiło już wielu mieszkańc&oacute;w. Nie wiadomo jeszcze, ile os&oacute;b będzie w stanie przebywać w budowli w jednym czasie ze względu na ograniczenia wytrzymałościowe. Będzie to pewna liczba pierwszych w kolejności os&oacute;b, kt&oacute;re wykupiły bilety.</p>

<p>Budowla została zbudowana w specyficzny spos&oacute;b. W pierwszej kolejności ułożono pewną parzystą liczbę słup&oacute;w. Następnie na kolejne pary słup&oacute;w położono płytę. P&oacute;źniej na każdej płycie stawiano jeden słup. Następnie ponowiono proces układania płyt - na kolejnych dw&oacute;ch słupach leżących na płytach najwyższego piętra układano płyty z pojedynczym słupem i tak powstawały kolejne piętra. Projekt był tak zaplanowany, aby na każdym piętrze była parzysta liczba słup&oacute;w, więc zawsze dawało się zbudować kolejne piętra. Każdy słup ma określoną wytrzymałość, czyli maksymalne obciążenie, jakie może utrzymać.</p>

<p>Uroczyste otwarcie odbędzie się na szczycie budowli, na kt&oacute;rej zgromadzi się pewna liczba mieszkańc&oacute;w Bajtocji. Łącznie stworzą dość duże obciążenie, r&oacute;wne ich łącznej wadze. Wiadomo, że obciążenie rozkłada się zawsze r&oacute;wnomiernie na dwa słupy, podtrzymujące płytę, oraz że płyty mogą wytrzymać dowolne obciążenie.</p>

<p>Rekonstruktor postanowił wymienić pewną liczbę słup&oacute;w. Po każdej wymianie jednego słupa chciałby wiedzieć, ile maksymalnie os&oacute;b z kolejki będzie mogło wziąć udział w uroczystym otwarciu. Zakładamy, że waga płyt i słup&oacute;w jest pomijalnie mała.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera trzy liczby całkowite <em>n</em>, <em>m</em>, <em>k</em>&nbsp;(1 &le; <em>n</em> &le; 19, 1 &le; <em>m</em>, <em>k</em> &le; 10<sup>6</sup>), oznaczające odpowiednio liczbę pięter budowli, liczbę mieszkańc&oacute;w Bajtocji, kt&oacute;rzy wykupili już bilety oraz liczbę słup&oacute;w do wymiany.</p>

<p>Kolejne <em>n</em>&nbsp;wierszy zawiera opisy poszczeg&oacute;lnych pięter od najwyższego do najniższego. Kolejne wiersze zawierają 2, 4, 8, ..., 2<em><sup>n</sup></em>&nbsp;liczb całkowitych. W każdym wierszu znajduje się więc 2<em><sup>i</sup></em>&nbsp;liczb całkowitych <em>s</em><sub>1</sub>, <em>s</em><sub>2</sub>, ..., <em>s</em><sub>2<em><sup>i</sup></em></sub>&nbsp;(1 &le; <em>s<sub>k</sub></em> &le; 10<sup>9</sup>), gdzie&nbsp;<em>s<sub>k</sub></em>&nbsp;jest wytrzymałością <em>k</em>-tego w kolejności (od lewej) słupa na <em>i</em>-tym piętrze (od g&oacute;ry).</p>

<p>W następnym wierszu znajduje się <em>m</em>&nbsp;liczb całkowitych <em>w</em><sub>1</sub>, <em>w</em><sub>2</sub>, ..., <em>w<sub>m</sub></em>&nbsp;(1 &le; <em>w<sub>i</sub></em> &le; 10<sup>9</sup>), gdzie&nbsp;<em>w<sub>i</sub></em>&nbsp;oznacza wagę osoby, kt&oacute;ra jako <em>i</em>-ta kupiła bilet.</p>

<p>Kolejne <em>k</em>&nbsp;wierszy opisuje wymieniane słupy. Każdy wiersz zawiera trzy liczby całkowite <em>x<sub>i</sub></em>, <em>y<sub>i</sub></em>, <em>p<sub>i</sub></em>&nbsp;(1 &le; <em>x<sub>i</sub></em> &le; <em>n</em>, 1 &le; <em>y<sub>i</sub></em> &le; 2<em><sup>x<sub>i</sub></sup></em>, 1 &le; <em>p<sub>i</sub></em> &le; 10<sup>9</sup>), oznaczające, że wytrzymałość słupa&nbsp;<em>y<sub>i</sub></em>&nbsp;(od lewej) na piętrze&nbsp;<em>x<sub>i</sub></em>&nbsp;(od g&oacute;ry) zostaje zamieniona na wytrzymałość&nbsp;<em>p<sub>i</sub></em>.</p>

### 출력

<p>Standardowe wyjście powinno zawierać <em>s</em> + 1&nbsp;wierszy. W kolejnych wierszach powinna znaleźć się jedna liczba całkowita, r&oacute;wna maksymalnej liczbie os&oacute;b z kolejki, kt&oacute;ra może wziąć udział w uroczystym otwarciu po wymianie 0, 1, 2, ...,&nbsp;<em>s</em>&nbsp;słup&oacute;w.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8683.%E2%80%85Budowla/bc8a6af4.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8683.%E2%80%85Budowla/bc8a6af4.png" data-original-src="https://upload.acmicpc.net/ed7d5149-8cb0-4d2f-b27d-17c55d66feea/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>
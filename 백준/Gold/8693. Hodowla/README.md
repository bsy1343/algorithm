# [Gold IV] Hodowla - 8693

[문제 링크](https://www.acmicpc.net/problem/8693)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 76, 정답: 48, 맞힌 사람: 34, 정답 비율: 57.627%

### 분류

누적 합, 차분 배열 트릭

### 문제 설명

<p>Bajtocki ogr&oacute;d działkowy (BOD) od wielu lat hoduje warzywa - wyłącznie marchewki i pietruszki. BOD ma kształt kwadratu o boku długości <em>n</em>&nbsp;i jest podzielony na <em>n</em>&nbsp;&middot; <em>n</em>&nbsp;jednostkowych p&oacute;l. Na każdym z nich rośnie dokładnie jedna marchewka lub jedna pietruszka.</p>

<p>Specjalna hodowla decyduje o wyjątkowości i smaku warzyw. Polega ona na corocznym wybieraniu pewnego obszaru, dla kt&oacute;rego dokonujemy zamiany hodowli. Zamiana hodowli polega na posadzeniu marchewek wszędzie tam, gdzie rosły dotąd pietruszki, a pietruszek wszędzie tam, gdzie rosły marchewki. Na pozostałym obszarze marchewki i pietruszki rosną dokładnie tam, gdzie rok temu.</p>

<p>Właściciel ogrodu rozpisał plan hodowli na wiele lat. Zastanawia się teraz, jak będzie wyglądał jego ogr&oacute;d działkowy po tych wszystkich latach.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 1 000), oznaczającą rozmiar ogrodu działkowego. W&nbsp;<em>n</em>&nbsp;kolejnych wierszach znajduje się opis działki.</p>

<p>Każdy wiersz opisuje jeden pas ogrodu i zawiera <em>n</em>&nbsp;liczb całkowitych <em>w</em><sub>1</sub>, <em>w</em><sub>2</sub>, ..., <em>w<sub>n</sub></em>, (0 &le; <em>w<sub>i</sub></em> &le; 1), gdzie&nbsp;<em>w<sub>i</sub></em>&nbsp;opisuje <em>i</em>-te pole w rozpatrywanym pasie działki. Jeśli&nbsp;<em>w<sub>i</sub></em>&nbsp;jest r&oacute;wne 0, to na polu tym rośnie marchewka, jeśli natomiast&nbsp;<em>w<sub>i</sub></em>&nbsp;jest r&oacute;wne 1, to rośnie tam pietruszka.</p>

<p>Kolejny wiersz wejścia zawiera jedną liczbę całkowitą <em>m</em>&nbsp;(1 &le; <em>m</em> &le; 10<sup>6</sup>), oznaczającą liczbę lat, dla kt&oacute;rych właściciel rozpisał plan hodowli. W&nbsp;<em>m</em>&nbsp;następnych wierszach znajduje się opis zamian hodowli w kolejnych latach.</p>

<p>Każdy wiersz zawiera cztery liczby całkowite <em>x</em><sub>1</sub>, <em>y</em><sub>1</sub>, <em>x</em><sub>2</sub>, <em>y</em><sub>2</sub>&nbsp;(1 &le; <em>x</em><sub>1</sub> &le; <em>x</em><sub>2</sub> &le; <em>n</em>, <em>y</em><sub>1</sub> &le; <em>y</em><sub>2</sub> &le; <em>n</em>), oznaczające, że w danym roku właściciel planuje dokonać zamiany hodowli na polach wyznaczonych przez prostokąt, ktorego lewy g&oacute;rny r&oacute;g posiada wsp&oacute;łrzędne <em>x</em><sub>1</sub>, <em>y</em><sub>1</sub> a prawy dolny r&oacute;g&nbsp;<em>x</em><sub>2</sub>, <em>y</em><sub>2</sub>.</p>

### 출력

<p>Standardowe wyjście powinno zawierać <em>n</em>&nbsp;wierszy. Każdy wiersz powinien opisywać kolejny pas działki po <em>m</em>&nbsp;latach i powinien zawierać <em>n</em>&nbsp;liczb całkowitych <em>w</em><sub>1</sub>, <em>w</em><sub>2</sub>, ..., <em>w<sub>n</sub></em>, gdzie <em>w<sub>i</sub></em>&nbsp;powinno być r&oacute;wne 1 - jeśli na <em>i</em>&nbsp;tym polu rosnąć będzie marchewka lub 0 - jeśli pietruszka.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8693.%E2%80%85Hodowla/6e7daf0a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8693.%E2%80%85Hodowla/6e7daf0a.png" data-original-src="https://upload.acmicpc.net/6b6fab57-c5a8-45de-a32c-ff95c0271299/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>
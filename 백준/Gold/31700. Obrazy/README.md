# [Gold V] Obrazy - 31700

[문제 링크](https://www.acmicpc.net/problem/31700)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 29, 정답: 23, 맞힌 사람: 18, 정답 비율: 75.000%

### 분류

애드 혹, 기하학, 그리디 알고리즘, 수학

### 문제 설명

<p>Bajtazar właśnie wprowadził się do nowego mieszkania. Udekorowawszy już p&oacute;łki swoimi trofeami z przer&oacute;żnych konkurs&oacute;w recytatorskich oraz mistrzostw Bajtocji w jodłowaniu na czas, spostrzegł, że jedna ściana jest całkiem pusta. Nie spodobało mu się to, więc chciałby zapełnić ją obrazami.</p>

<p>Ściana Bajtazara ma kształt prostokąta o wymiarach h &times; w metr&oacute;w. Pobliski marszand, kt&oacute;ry jest bliskim znajomym Bajtazara, oferuje n rodzaj&oacute;w obraz&oacute;w, przy czym dysponuje on nieograniczoną liczba obraz&oacute;w każdego rodzaju. Wszystkie obrazy tego samego rodzaju mają dokładnie te same wymiary &ndash; obrazy i-tego rodzaju są zawsze kwadratami o boku długości d<sub>i</sub> metr&oacute;w. Co ciekawe, dla każdych dw&oacute;ch r&oacute;żnych wartości d<sub>i</sub>, jedna jest podzielna bez reszty przez drugą.</p>

<p>Dla Bajtazara cena obraz&oacute;w nie gra roli (wszak na mistrzostwach w jodłowaniu na czas nagrody są dość pokaźne), chciałby jednak upewnić się, że na ścianie nie zostanie żadne puste miejsce. W tym celu postanowił zakupić pewną liczbę obraz&oacute;w i powiesić je na ścianie tak, aby pokryć ją całą. Oczywiście obrazy nie mogą się nawzajem pokrywać, mogą jednak stykać się bokami. Bajtazar nie chce jednak zbyt wiele razy maszerować do marszanda tam i z powrotem &ndash; chciałby więc kupić możliwie jak najmniej obraz&oacute;w. Pom&oacute;ż mu i napisz program, kt&oacute;ry obliczy dla niego, ile obraz&oacute;w musi kupić, lub stwierdzi, że pokrycie ściany nie jest możliwe!</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite h oraz w (1 &le; h, w &le; 10<sup>9</sup>) &ndash; wymiary ściany Bajtazara.</p>

<p>W drugim wierszu wejścia znajduje się jedna liczba całkowita n (1 &le; n &le; 30) &ndash; liczba rodzaj&oacute;w obraz&oacute;w.</p>

<p>W trzecim wierszu wejścia znajduje się ciąg n r&oacute;żnych liczb całkowitych d<sub>1</sub>, d<sub>2</sub>, . . . , d<sub>n</sub> (1 &le; d<sub>i</sub> &le; 10<sup>9</sup>; d<sub>i</sub> &lt; d<sub>i+1</sub>; d<sub>i+1</sub> jest podzielne bez reszty przez d<sub>i</sub>) &ndash; wymiary obraz&oacute;w kolejnych rodzaj&oacute;w.</p>

### 출력

<p>Jeśli pokrycie ściany jest możliwe, w jednym wierszu wyjścia powinna znaleźć się jedna liczba całkowita, oznaczająca minimalną możliwą liczbę obraz&oacute;w potrzebnych do pokrycia ściany. W przeciwnym wypadku w wierszu tym powinna znaleźć się liczba &minus;1.</p>

### 힌트

<p>Wyjaśnienie przykładu: W pierwszym teście przykładowym Bajtazar może pokryć ścianę dziewięcioma obrazami (sześcioma rozmiaru 1&times;1, dwoma rozmiaru 3&times;3 i jednym rozmiaru 6&times;6) na przykład w następujący spos&oacute;b:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/2cb65c01-4f56-4423-91bf-1da5832ab4f1/-/preview/" style="height: 300px; width: 492px;" /></p>

<p>W drugim teście przykładowym nie jest możliwe dokładne pokrycie ściany.</p>
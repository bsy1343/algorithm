# [Silver IV] Szuflady - 8662

[문제 링크](https://www.acmicpc.net/problem/8662)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 104, 정답: 52, 맞힌 사람: 47, 정답 비율: 48.958%

### 분류

그리디 알고리즘

### 문제 설명

<p>Michał ma w sypialni szafkę z <em>n</em>&nbsp;szufladami. Każda z nich jest wysunięta na pewną długość. Chłopiec chciałby mieć bezpośredni dostęp do każdej szuflady, tak aby nie musiał ich wysuwać za każdym razem.</p>

<p>Bezpośredni dostęp do danej szuflady jest wtedy, gdy każda szuflada powyżej niej jest mniej wysunięta. Michał postanowił, że będzie tylko wsuwał szuflady (czyli zmniejszał długość ich wysunięcia). Zastanawia się, ile minimalnie szuflad musi wsunąć, aby mieć bezpośredni dostęp do wszystkich z nich.</p>

<p>Zakładamy, że do szuflady, kt&oacute;rej wysunięcie jest r&oacute;wne 0, nie ma dostępu, oraz że wysunięcie szuflady musi być zawsze wartością całkowitą.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 10<sup>6</sup>), oznaczającą liczbę szuflad. Kolejny wiersz wejścia zawiera <em>n</em>&nbsp;liczb całkowitych <em>a</em><sub>1</sub>, <em>a</em><sub>2</sub>, ..., <em>a<sub>n</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em> &le; 10<sup>9</sup>), gdzie&nbsp;<em>a<sub>i</sub></em>&nbsp;oznacza długość wysunięcia <em>i</em>-tej (licząc od g&oacute;ry szafki) szuflady.</p>

### 출력

<p>Pierwszy wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną minimalnej liczbie szuflad, jakie musi wsunąć Michał, aby był bezpośredni dostęp do wszystkich z nich. Jeśli nie jest to możliwe, wynikiem powinna być liczba -1.</p>

### 힌트

<p>Michał wsunie szufladę pierwszą i trzecią. Wysunięcia szuflad mogą być następujące: (1, 4, 5, 6, 8).</p>
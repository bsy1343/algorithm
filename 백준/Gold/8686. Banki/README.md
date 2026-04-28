# [Gold III] Banki - 8686

[문제 링크](https://www.acmicpc.net/problem/8686)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 7, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

수학, 정수론

### 문제 설명

<p>Do bajtockich bank&oacute;w często przybywają kupcy, chcący wypłacić pieniądze ze swoich kont. W każdym banku dostępne są tylko dwa nominały, ale każdego z nich jest nieograniczona liczba. Nie każdą kwotę da się wypłacić, więc banki wywieszają listy, informujące klient&oacute;w o niedostępnych sumach. Czasami listy te są tak długie, że banki wywieszają tylko początkową część niewypłacalnych kwot.</p>

<p>Kupiec Kozik chce wypłacić dużą kwotę pieniędzy. Zanim wyruszy do banku, to chciałby znać najwyższe kwoty, kt&oacute;rych banki nie są w stanie wypłacać. Kozik nie ma dostępu do list wywieszonych przez banki. Ma jedynie informację o dostępnych nominałach.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 10<sup>6</sup>), oznaczającą liczbę bajtockich bank&oacute;w. W następnych <em>n</em>&nbsp;wierszach znajdują się opisy bank&oacute;w. Każdy wiersz zawiera dwie liczby całkowite <em>x</em>, <em>y</em>&nbsp;(1 &le; <em>x</em>, <em>y</em> &le; 10<sup>9</sup>), oznaczające wartości dostępnych nominał&oacute;w.</p>

### 출력

<p>Standardowe wyjście powinno zawierać <em>n</em>&nbsp;wierszy, będące odpowiedziami dla kolejnych bank&oacute;w. W każdym wierszu powinna znaleźć się jedna liczba całkowita, r&oacute;wna najwyższej kwocie, kt&oacute;rej bank nie może wypłacić, lub wartość -1, jeśli takiej kwoty nie można ustalić.</p>
# [Platinum I] Żarówki - 31707

[문제 링크](https://www.acmicpc.net/problem/31707)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 5, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

이분 그래프, 조합론, 그래프 이론, 수학

### 문제 설명

<p>Bajtazar posiada n żar&oacute;wek ponumerowanych kolejnymi liczbami od 1 do n oraz m przełącznik&oacute;w. Każda z żar&oacute;wek początkowo jest zapalona lub też nie. Każdy z przełącznik&oacute;w wpływa na pewną parę żar&oacute;wek. Użycie go zmieni stan ich obu na przeciwny, ale tylko pod warunkiem, że obie były w takim samym stanie &ndash; obie włączone lub obie wyłączone. W przeciwnym wypadku wciśnięcie przełącznika nie będzie miało żadnego efektu.</p>

<p>Bajtazar zastanawia się, ile r&oacute;żnych konfiguracji zapalonych i zgaszonych żar&oacute;wek jest w stanie osiągnąć, używając przełącznik&oacute;w dowolnie wiele razy w dowolnej kolejności, potencjalnie używając niekt&oacute;rych przełącznik&oacute;w wielokrotnie. Dwie konfiguracje uznajemy za r&oacute;żne, jeżeli kt&oacute;raś żar&oacute;wka jest zapalona w jednej konfiguracji, a w drugiej jest zgaszona. Ponieważ wynik może być duży, wystarczy, że podasz jego resztę z dzielenia przez 10<sup>9</sup> + 7.</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite n oraz m (1 &le; n &le; 200 000; 0 &le; m &le; 400 000), oznaczające odpowiednio liczbę żar&oacute;wek oraz liczbę przełącznik&oacute;w.</p>

<p>W drugim wierszu wejścia znajduje się n liczb c<sub>i</sub> (c<sub>i</sub> &isin; {0, 1}) oddzielonych pojedynczymi odstępami. Jeśli c<sub>i</sub> = 1, to i-ta żar&oacute;wka początkowo jest zapalona. W przeciwnym wypadku (gdy c<sub>i</sub> = 0), to i-ta żar&oacute;wka początkowo jest zgaszona.</p>

<p>W kolejnych m wierszach znajdują opisy przełącznik&oacute;w; i-ty z tych wierszy zawiera dwie liczby całkowite a<sub>i</sub> oraz b<sub>i</sub> (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; n; a<sub>i</sub> &ne; b<sub>i</sub>) &ndash; numery żar&oacute;wek, na kt&oacute;re wpływa i-ty przełącznik.</p>

<p>Możesz założyć, że przełączniki wpływają na r&oacute;żne nieuporządkowane pary żar&oacute;wek. Formalniej, dla każdej pary r&oacute;żnych indeks&oacute;w i, j pomiędzy 1 i m włącznie zachodzi (a<sub>i</sub>, b<sub>i</sub>) &ne; (a<sub>j</sub>, b<sub>j</sub>) oraz (a<sub>i</sub>, b<sub>i</sub>) &ne; (b<sub>j</sub>, a<sub>j</sub>).</p>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia powinna znaleźć się reszta z dzielenia przez 10<sup>9</sup> + 7 liczby osiągalnych konfiguracji zapalonych i zgaszonych żar&oacute;wek.</p>

### 힌트

<p>Wyjaśnienie przykładu: Osiągalne końcowe stany żar&oacute;wek to <code>10110</code>, <code>00010</code>, <code>00111</code> i <code>10011</code>.</p>
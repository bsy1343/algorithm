# [Platinum I] Gra w dzielniki - 8461

[문제 링크](https://www.acmicpc.net/problem/8461)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 2, 맞힌 사람: 2, 정답 비율: 20.000%

### 분류

다이나믹 프로그래밍, 수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>Jak zapewne wszyscy pamiętają, Bajtuś i Bituś to dwaj chłopcy, kt&oacute;rzy lubią grać w rozmaite gry. Ostatnio Bituś poni&oacute;sł porażkę, zjadając oznaczony kawałek czekolady i chce się zrewanżować Bajtusiowi. Zaproponował mu nową grę, jej zasady są następujące.</p>

<p>Początkowo na tablicy napisana jest pewna liczba całkowita <em>N</em>&nbsp;większa od 1. Gracze na przemian zastępują liczbę aktualnie napisaną na tablicy jej wybranym dzielnikiem (r&oacute;żnym od niej samej). Gdy kt&oacute;ryś z graczy napisze liczbę 1, gra się kończy. Dla każdego dzielnika <em>d</em>&nbsp;liczby <em>N</em>, z wyjątkiem&nbsp;<em>N</em>, określone są dwie liczby <em>a</em>(<em>d</em>)&nbsp;i&nbsp;<em>b</em>(<em>d</em>). Gdy Bajtuś w trakcie gry napisze na tablicy liczbę <em>d</em>, dostaje <i>a</i>(<i>d</i>)&nbsp;punkt&oacute;w. Z kolei Bituś, za napisanie <em>d</em>&nbsp;otrzymuje <em>b</em>(<em>d</em>)&nbsp;punkt&oacute;w. Celem gry jest zmaksymalizowanie przewagi nad przeciwnikiem, czyli r&oacute;żnicy między zdobytymi punktami a punktami przeciwnika.</p>

<p>Bituś wybrał już liczbę <em>N</em>&nbsp;oraz punktację dla jej dzielnik&oacute;w. Za to Bajtuś może wybrać, kt&oacute;ry z chłopc&oacute;w wykona pierwszy ruch. Chciałby on wobec tego wiedzieć, ile w obydwu przypadkach wyniesie przewaga rozpoczynającego grę, przy założeniu, że obaj chłopcy grają optymalnie.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera dodatnią liczbę całkowitą <em>t</em>&nbsp;oznaczającą liczbę przypadk&oacute;w testowych, kt&oacute;re są kolejno opisane w dalszej części wejścia. Opis jednego przypadku testowego rozpoczyna się wierszem z czterema liczbami całkowitymi <em>n</em><sub>1</sub>,<em>n</em><sub>2</sub> ,<em>n</em><sub>3</sub>&nbsp;i <em>D</em>&nbsp;(1 &le; <em>n<sub>i</sub></em> &le; 5 &middot; 10<sup>6</sup>, 1 &lt; <em>n</em><sub>1</sub><em>n</em><sub>2</sub><em>n</em><sub>3</sub> &le; 8 &middot; 10<sup>18</sup>). Iloczyn <em>n</em><sub>1</sub> &middot; <em>n</em><sub>2</sub> &middot; <em>n</em><sub>3</sub>&nbsp;jest r&oacute;wny liczbie <em>N</em>, kt&oacute;ra początkowo znajduje się na tablicy, zaś <em>D</em>&nbsp;oznacza liczbę dodatnich dzielnik&oacute;w liczby <em>N</em>.</p>

<p>W dalszych <em>D</em> - 1&nbsp;wierszach znajduje się punktacja dla kolejnych (r&oacute;żnych od <em>N</em>) dzielnik&oacute;w&nbsp;<em>N</em>, w kolejności rosnącej. W <em>i</em>-tym z tych wierszy znajdują się dwie liczby całkowite <em>a</em>(<em>d</em>)&nbsp;oraz&nbsp;<em>b</em>(<em>d</em>)&nbsp;(-10<sup>9</sup> &le; <em>a</em>(<em>d</em>), <em>b</em>(<em>d</em>) &le; 10<sup>9</sup>), kt&oacute;re oznaczają liczbę punkt&oacute;w przyznawanych odpowiednio Bajtusiowi i Bitusiowi za napisanie na tablicy liczby <em>d</em>, czyli <em>i</em>-tego dzielnika <em>N</em>.</p>

<p>Suma liczb <em>D</em>&nbsp;po wszystkich przypadkach testowych w jednym pliku nie przekracza 10<sup>6</sup>.</p>

### 출력

<p>Wypisz <em>t</em>&nbsp;wierszy z odpowiedziami dla poszczeg&oacute;lnych przypadk&oacute;w testowych. Odpowiedź dla jednego przypadku składa się z dw&oacute;ch liczb całkowitych <em>A</em>&nbsp;i <em>B</em>, kt&oacute;re oznaczają przewagę rozpoczynającego grę, jeśli jest nim, odpowiednio, Bajtuś i Bituś.</p>

### 힌트

<p><b>Wyjaśnienie:</b>&nbsp;W pierwszym przypadku testowym rozpoczynający grę może napisać jedynie 1, co od razu kończy grę. W drugim zaś opłaca się napisać 2&nbsp;i pozwolić przeciwnikowi napisać 1.</p>
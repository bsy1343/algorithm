# [Gold III] Chochlik - 8602

[문제 링크](https://www.acmicpc.net/problem/8602)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 19, 맞힌 사람: 8, 정답 비율: 61.538%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>W pewnej dziewiętnastowiecznej fabryce energia była przekazywana za pomocą pas&oacute;w transmisyjnych. Fabryka działała bardzo prężnie, aż kiedyś złośliwy chochlik wdarł się do fabryki i pozamieniał ułożenie niekt&oacute;rych pas&oacute;w. Właściciel fabryki zastanawia się, czy przy aktualnym ułożeniu pas&oacute;w fabryka będzie mogła funkcjonować poprawnie.</p>

<p>Istnieją dwa rodzaje połączeń między dwoma r&oacute;żnymi kołami. Jeśli koło kręci się w pewną stronę, to koło połączone z nim sposobem A kręci się w tę samą stronę, zaś połączone sposobem B - w przeciwną.</p>

<p align="center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8602.%E2%80%85Chochlik/d31799cf.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8602.%E2%80%85Chochlik/d31799cf.png" data-original-src="https://upload.acmicpc.net/a155ef0e-b6ef-4c80-a2f0-f2e025a5d061/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p align="center">Dwa sposoby połączeń k&oacute;ł pasami transmisyjnymi.</p>

<p>Dany wydział fabryki może funkcjonować poprawnie, jeśli rozpędzenie w nim dowolnego koła nie będzie wprawiać w ruch żadnego innego koła w dwie przeciwne strony naraz.</p>

<p>Twoim zadaniem jest napisanie programu, kt&oacute;ry dla każdego wydziału fabryki stwierdzi, czy może on poprawnie działać przy aktualnym rozmieszczeniu pas&oacute;w transmisyjnych.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się jedna liczba całkowita $d$&nbsp;($1 &le; d &le; 10$), oznaczająca liczbę wydział&oacute;w fabryki.</p>

<p>W następnych wierszach znajdują się opisy kolejnych wydział&oacute;w. W pierwszym wierszu każdego takiego opisu znajdują się dwie liczby całkowite $k$&nbsp;oraz $p$&nbsp;($1 &le; k &le; 100\,000$, $0 &le; p &le;100\,000$), oznaczające odpowiednio liczbę k&oacute;ł w wydziale i liczbę połączeń między nimi. W każdym z następnych $p$&nbsp;wierszy opisu wydziału znajdują się dwie liczby całkowite $a_i$, $b_i$&nbsp;oraz jedna litera $c_i$, pooddzielane pojedynczymi odstępami ($1 &le; a_i, b_i &le; k$, $c_i \in \{A, B\}$, $a_i \ne b_i$) oznaczające odpowiednio numery połączonych k&oacute;ł oraz rodzaj połączenia między nimi.</p>

<p>Może się zdarzyć, że dwa koła będą połączone więcej niż jednym pasem transmisyjnym.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście dokładnie $d$&nbsp;wierszy. W $i$-tym wierszu powinno znaleźć się jedno słowo:</p>

<ul>
	<li>&quot;<code>TAK</code>&quot;, jeśli $i$-ty wydział fabryki może poprawnie funkcjonować,</li>
	<li>&quot;<code>NIE</code>&quot; w przeciwnym przypadku.</li>
</ul>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8602.%E2%80%85Chochlik/0497e0e8.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8602.%E2%80%85Chochlik/0497e0e8.png" data-original-src="https://upload.acmicpc.net/6de94c0c-e843-4f75-9378-afa811eb3b00/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p><b>Wyjaśnienie do przykładu:</b>&nbsp;Pierwszy wydział nie może działać poprawnie, ponieważ wprawienie w ruch koła numer $1$&nbsp;w prawą stronę spowodowałoby wprawienie w ruch koła numer $2$&nbsp;w prawą i lewą stronę r&oacute;wnocześnie, a taki ruch jest niepoprawny. W drugim wydziale nie ma żadnych pas&oacute;w i jest to poprawna konfiguracja.</p>
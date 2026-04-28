# [Silver III] Wieża - 8733

[문제 링크](https://www.acmicpc.net/problem/8733)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 65, 정답: 42, 맞힌 사람: 32, 정답 비율: 76.190%

### 분류

이분 탐색, 오프라인 쿼리

### 문제 설명

<p>W Bajtocji wybudowano wysoką wieżę. Wejście na wieżę składa się z <em>n</em>&nbsp;schodk&oacute;w, a każdy schodek ma pewną wysokość.</p>

<p>Bajtocką wieżę chce odwiedzić <em>m</em>&nbsp;mieszkańc&oacute;w. Każda z os&oacute;b posiada pewien wzrost, kt&oacute;ry pomaga w pokonywaniu kolejnych schodk&oacute;w. Aby mieszkaniec Bajtocji m&oacute;gł wejść na pewien schodek, to musi być wyższy od wysokości schodka. Jeśli pewien schodek jest nie do przejścia przez mieszkańca, to zatrzymuje się on w danym miejscu na wieży - wyżej nie będzie m&oacute;gł wejść.</p>

<p>Znając wysokości kolejnych schodk&oacute;w i os&oacute;b zwiedzających wieżę chcielibyśmy wiedzieć, w kt&oacute;rym miejscu zatrzyma się każdy mieszkaniec Bajtocji.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera dwie liczby całkowite <em>n</em>, <em>m</em>&nbsp;(1 &le; <em>n</em>, <em>m</em>&nbsp;&le; 500 000), oznaczające odpowiednio liczbę schodk&oacute;w prowadzących na wieżę oraz liczbę mieszkańc&oacute;w chcących odwiedzić wieżę. Kolejny wiersz zawiera <em>n</em>&nbsp;liczb całkowitych <em>a</em><sub>1</sub>, <em>a</em><sub>2</sub>, ..., <em>a<sub>n</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em> &le; 10<sup>9</sup>), gdzie&nbsp;<em>a<sub>i</sub></em>&nbsp;oznacza wysokość <em>i</em>-tego schodka. Pierwszy schodek znajduje się na samym dole wieży, a każdy kolejny wyżej od poprzednich. Następny wiersz wejścia zawiera <em>m</em>&nbsp;liczb całkowitych&nbsp;<em>b</em><sub>1</sub>, <em>b</em><sub>2</sub>, ..., <em>b<sub>m</sub></em>&nbsp;(1 &le; <em>b<sub>i</sub></em> &le; 10<sup>9</sup>), gdzie&nbsp;<em>b<sub>i</sub></em>&nbsp;oznacza wzrost <em>i</em>-tego mieszkańca.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać <em>m</em>&nbsp;liczb całkowitych&nbsp;<em>w</em><sub>1</sub>, <em>w</em><sub>2</sub>, ..., <em>w<sub>m</sub></em>, gdzie <em>w<sub>i</sub></em>&nbsp;oznacza maksymalny numer schodka, na kt&oacute;ry może wejść <em>i</em>-ty mieszkaniec Bajocji.</p>
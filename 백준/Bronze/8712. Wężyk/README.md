# [Bronze II] Wężyk - 8712

[문제 링크](https://www.acmicpc.net/problem/8712)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 197, 정답: 167, 맞힌 사람: 147, 정답 비율: 86.982%

### 분류

구현

### 문제 설명

<p>Ulubioną zabawą Stasia jest gra w &quot;wężyka&quot;. Polega ona na tym, że najpierw wybiera sobie jedną liczbę całkowitą <em>n</em>, a następnie zaczyna na kartce zapisywać kolejne liczby naturalne. Chłopiec zapisuje łącznie&nbsp;<em>n</em>&nbsp;wierszy, w każdym z nich po&nbsp;<em>n</em>&nbsp;liczb.</p>

<p>W pierwszym wierszu Staś wypisuje liczby od 1 do <em>n</em>&nbsp;od lewej do prawej. Drugi wiersz wypełnia jednak od prawej do lewej liczbami od <em>n</em> + 1&nbsp;do 2<em>n</em>. I tak dalej: wiersze o numerach nieparzystych wypełnia od lewej do prawej, a te o numerach parzystych - od prawej do lewej.</p>

<p>Twoim zadaniem jest napisanie programu, kt&oacute;ry będzie automatycznie grał w &quot;wężyka&quot;.</p>

### 입력

<p>W pierwszym i jedynym wierszu wejścia znajduje się jedna liczba naturalna&nbsp;<em>n</em>&nbsp;(1 &le; <em>n</em> &le; 100).</p>

### 출력

<p>Na wyjście należy wypisać <em>n</em>&nbsp;wierszy, w każdym z nich po&nbsp;<em>n</em>&nbsp;liczb naturalnych. Razem ma zostać wypisanych <em>n</em><sup>2</sup>&nbsp;liczb: wszystkie liczby naturalne od 1&nbsp;do&nbsp;<em>n</em><sup>2</sup>. W każdym wierszu wypisane liczby powinny być pooddzielane pojedynczymi odstępami.</p>
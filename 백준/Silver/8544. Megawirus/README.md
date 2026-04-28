# [Silver IV] Megawirus - 8544

[문제 링크](https://www.acmicpc.net/problem/8544)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 82, 정답: 33, 맞힌 사람: 23, 정답 비율: 35.385%

### 분류

임의 정밀도 / 큰 수 연산, 비트마스킹, 수학

### 문제 설명

<p>Haker Limak napisał megawirusa. Każda z kopii wirusa ma sw&oacute;j numer (pierwsza kopia otrzymała numer 0). Co minutę tworzy się nowe pokolenie wirus&oacute;w. Z wirusa o numerze <em>i</em>&nbsp;w pokoleniu <em>k</em>&nbsp;powstają wirusy (dzieci) o numerach 2 * <em>i</em>&nbsp;i 2 * <em>i</em> + 1&nbsp;w pokoleniu <em>k</em> + 1. Nowo powstałe wirusy (2 * <em>i</em>, 2 * <em>i</em> + 1) nazwiemy dziećmi wirusa <em>i</em>&nbsp;z pokolenia <em>k</em>. Wirus <em>v</em>, jego dzieci, dzieci jego dzieci, itd. nazywamy potomkami wirusa&nbsp;<em>v</em>, a&nbsp;<em>v</em>&nbsp;jest nazywany ich przodkiem. Pierwsze pokolenie ma numer 0. Czyli w kolejnych pokoleniach żyją wirusy o następujących numerach:</p>

<ul>
	<li>pokolenie 0: wirus: 0,</li>
	<li>pokolenie 1: wirusy: 0, 1,</li>
	<li>pokolenie 2: wirusy: 0, 1, 2, 3,</li>
	<li>pokolenie 3: wirusy: 0, 1, 2, 3, 4, 5, 6, 7,</li>
	<li>...</li>
</ul>

<p>Napisz program kt&oacute;ry:</p>

<ul>
	<li>wczyta numer pokolenia i numery pewnej liczby wirus&oacute;w z tego pokolenia,</li>
	<li>policzy największy numer pokolenia zawierającego wsp&oacute;lnego przodka wczytanych wirus&oacute;w,</li>
	<li>wypisze obliczoną wartość.</li>
</ul>

### 입력

<p>W pierwszym wierszu podane są dwie liczby całkowite <em>k</em>, <em>n</em>&nbsp;oddzielone spacją. Pierwsza z liczb <em>k</em>, 1 &le; <em>k</em> &le; 512, jest numerem pokolenia. Druga z liczb <em>n</em>, 1 &le; <em>n</em> &le; 150&nbsp;jest liczbą wirus&oacute;w do wczytania. W następnych&nbsp;<em>n</em>&nbsp;wierszach podane są numery wirus&oacute;w (po jednym w wierszu).</p>

### 출력

<p>Program powinien wypisać jedną liczbę będącą największym numerem pokolenia zawierającego wsp&oacute;lnego przodka wszystkich wirus&oacute;w.</p>
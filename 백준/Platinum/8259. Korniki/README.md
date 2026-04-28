# [Platinum II] Korniki - 8259

[문제 링크](https://www.acmicpc.net/problem/8259)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

게임 이론, 홀짝성

### 문제 설명

<p>Dwa korniki postanowiły zjeść stary, drewniany płot. Płot &oacute;w składa się z <em>n</em>&nbsp;sztachet, kt&oacute;rych wysokości niekoniecznie są jednakowe. Korniki słyszały od znajomych termit&oacute;w, że nic tak nie umila posiłku, jak trochę zdrowej rywalizacji. Postanowiły zatem zagrać w grę i jeść sztachety na przemian. Kornik w przypadającej na niego kolejce może zjeść jedną z krańcowych sztachet płotu lub obie na raz. Wiedząc, że każdy z kornik&oacute;w tak wybiera sztachety, by w ciągu całej gry suma wysokości zjedzonych przez niego sztachet była jak największa, oblicz, ile drewna przypadnie każdemu z nich w udziale.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się liczba całkowita <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 1 000 000), określająca liczbę sztachet w płocie. Drugi wiersz zawiera ciąg&nbsp;<em>n</em>&nbsp;liczb całkowitych <em>h<sub>i</sub></em>&nbsp;(1 &le; <em>h<sub>i</sub></em> &le; 1 000 000 000), opisujących wysokości kolejnych sztachet.</p>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia należy wypisać dwie liczby całkowite. Pierwsza z nich określa sumę wysokości sztachet, kt&oacute;rymi pożywi się kornik rozpoczynający rozgrywkę, zaś druga, ile drewna przypadnie w udziale jego przeciwnikowi.</p>

### 힌트

<p>Pierwszy kornik w pierwszym ruchu może wybrać sztachetę o wysokości 5, o wysokości 3 lub obie na raz. Optymalnym ruchem jest zjedzenie sztachety o wysokości 5. Przeciwnik zjada wtedy sztachety o wysokościach 2 i 3.</p>
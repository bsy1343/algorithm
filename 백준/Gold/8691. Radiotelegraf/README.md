# [Gold II] Radiotelegraf - 8691

[문제 링크](https://www.acmicpc.net/problem/8691)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 9, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

두 포인터

### 문제 설명

<p>W Bajtockiej wojnie informacje są przekazywane przez radiotelegraf. Generał oddziału wysyła do Bitoasi tajne wiadomości w postaci liczb całkowitych. Wiadomo, że im więcej tych samych liczb wysłanych pod rząd, tym dana wiadomość jest ważniejsza.</p>

<p>Może się jednak zdarzyć, że informacje będą przechwytywane przez wroga i całkowicie zmieniane. W związku z tym, Bitoasia ustaliła pewną liczbę <em>w</em>, kt&oacute;ra oznacza maksymalną liczbę wiadomości, kt&oacute;re może przechwycić wr&oacute;g. Znając wszystkie dotychczasowe wiadomości, kt&oacute;re odebrała Bitoasia, znajdź wiadomość, kt&oacute;ra mogła być najważniejsza. Przechywty wroga należy dobrać tak, aby zmaksymalizować długość wiadomości.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera dwie liczby całkowite <em>n</em>, <em>w</em>&nbsp;(0 &le; <em>w</em> &le; <em>n</em> &le; 10<sup>6</sup>), oznaczające odpowiednio liczbę przesłanych wiadomości oraz ustaloną przez Bitoasię liczbę przechwyt&oacute;w. Następny wiersz zawiera <em>n</em>&nbsp;liczb całkowitych <em>x</em><sub>1</sub>, <em>x</em><sub>2</sub>, ..., <em>x<sub>n</sub></em>&nbsp;(-10<sup>9</sup> &le; <em>x<sub>k</sub></em> &le; 10<sup>9</sup>), gdzie&nbsp;<em>x<sub>k</sub></em>&nbsp;oznacza <em>k</em>-tą wiadomość.</p>

### 출력

<p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną maksymalnej długości wiadomości, kt&oacute;ra mogła być najważniejsza.</p>
# [Gold I] Chińczyk - 8696

[문제 링크](https://www.acmicpc.net/problem/8696)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

그래프 이론, 그래프 탐색, 트리, 너비 우선 탐색

### 문제 설명

<p>W stolicy jest <em>n</em>&nbsp;skrzyżowań oraz <em>n</em> - 1&nbsp;dr&oacute;g je łączących. Sieć dr&oacute;g jest taka, że z każdego skrzyżowania da się dojechać do każdego innego w dokładnie jeden spos&oacute;b. Przy niekt&oacute;rych skrzyżowaniach znajdują się chińskie bary, zwane&nbsp;<i>chińczykami</i>.</p>

<p>Kozik chce zamieszkać w stolicy. W tym celu chce wybrać mieszkanie znajdujące się przy pewnym skrzyżowaniu. Położenie mieszkania musi być takie, aby odległość najdalszego&nbsp;<i>chińczyka</i>&nbsp;była jak najmniejsza, ponieważ Kozik lubi jeść, ale nie lubi dużo chodzić, a chciałby obejrzeć wszystkie&nbsp;<i>chińczyki</i>&nbsp;w mieście.</p>

<p>Kozik nie lubi też dużo myśleć, dlatego pom&oacute;ż mu wybrać odpowiednie mieszkanie. Zakładamy, że odległość między dwoma sąsiednimi skrzyżowaniami wynosi jeden.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(2 &le; <em>n</em> &le; 10<sup>6</sup>), oznaczającą liczbę skrzyżowań. Drugi wiersz zawiera&nbsp;<em>n</em>&nbsp;liczb całkowitych <em>s</em><sub>1</sub>, <em>s</em><sub>2</sub>, ..., <em>s<sub>n</sub></em>&nbsp;(0 &le; <em>s<sub>i</sub></em> &le; 1). Jeśli&nbsp;<em>s<sub>i</sub></em>&nbsp;jest r&oacute;wne 1, to oznacza, że przy <em>i</em>-tym skrzyżowaniu znajduje się&nbsp;<i>chińczyk</i>, w przeciwnym wypadku&nbsp;<i>chińczyka</i>&nbsp;nie ma.</p>

<p>Kolejnych <em>n</em> - 1&nbsp;wierszy opisuje połączenia między skrzyżowaniami. Każdy wiersz zawiera dwie liczby całkowite <em>a</em>&nbsp;i <em>b</em>&nbsp;(1 &le; <em>a</em>, <em>b</em> &le; <em>n</em>), oznaczające, że skrzyżowania <em>a</em>&nbsp;i <em>b</em>&nbsp;są połączone bezpośrednią drogą.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną odległości najdalszego&nbsp;<i>chińczyka</i>&nbsp;dla mieszkania, kt&oacute;re powinien wybrać Kozik. Jeżeli w mieście nie ma&nbsp;<i>chińczyka</i>, wypisz -1.</p>
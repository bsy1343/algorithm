# [Bronze I] Taśma - 8717

[문제 링크](https://www.acmicpc.net/problem/8717)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 274, 정답: 129, 맞힌 사람: 113, 정답 비율: 46.502%

### 분류

구현, 누적 합

### 문제 설명

<p>Jaś znalazł w domu długą taśmę. Bez chwili namysłu napisał na taśmie pewien ciąg liczb całkowitych. Teraz chciałby przeciąć taśmę w pewnym miejscu tak, aby r&oacute;żnica pomiędzy sumą liczb na jednym kawałku a sumą liczb na drugim kawałku była jak najbliższa zeru (na jednym kawałku musi się znajdować co najmnniej jedna liczba). Chcielibyśmy znać wartość bezwzględną z owej r&oacute;żnicy.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(2 &le; <em>n</em> &le; 10<sup>6</sup>), oznaczającą ilość liczb wypisanych na taśmie. Drugi wiersz zawiera&nbsp;<em>n</em>&nbsp;liczb całkowitych <em>a<sub>i</sub></em>&nbsp;(-10<sup>3</sup> &le; <i>a<sub>i</sub></i>&nbsp;&le; 10<sup>3</sup>), oznaczających kolejne liczby wypisane na taśmie.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą r&oacute;wną minimalnej wartości bezwględnej r&oacute;żnicy pomiędzy dwoma kawałkami.</p>

### 힌트

<p>&nbsp;</p>

<p>Jaś może przeciąć taśmę po czwartej liczbie 1, 2, 3, 4|5, 6, czyli wartość bezwględna z r&oacute;żnicy pomiędzy dwoma kawałkami wynosi |(1 + 2 + 3 + 4) - (5 + 6)| = 1.</p>
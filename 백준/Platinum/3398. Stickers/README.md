# [Platinum II] Stickers - 3398

[문제 링크](https://www.acmicpc.net/problem/3398)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 2, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

임의 정밀도 / 큰 수 연산, 브루트포스 알고리즘, 수학

### 문제 설명

<p>Charles is an auto races fan and he has decided to make his own model&rsquo;s collection. In the shop it is possible to buy models in closed and covered boxes. In each box there are parts for one model and a set of stickers with images of digits. In every box the set of stickers is the same. Charles decided to label models by consecutive integers starting from 1. For example, to label the 2070-th model four stickers are necessary: one sticker with &rdquo;2&rdquo;, two with &rdquo;0&rdquo; and one with &rdquo;7&rdquo;.</p>

<p>Charles completes every model in the following way: he opens a new box, builds the model and labels it using sticker(s). He can use stickers from current and previously opened boxes, but it is not allowed to open an additional new box to get at missing stickers.</p>

<p>Write a program which for a given set of stickers counts how many models Charles can label in the described way.</p>

### 입력

<p>In the only line of input ten one-digit integers</p>

<p style="text-align: center;">i<sub>0</sub>, i<sub>1</sub>, i<sub>2</sub>, i<sub>3</sub>, i<sub>4</sub>, i<sub>5</sub>, i<sub>6</sub>, i<sub>7</sub>, i<sub>8</sub>, i<sub>9</sub></p>

<p>are given, where i<sub>j</sub> is the number of stickers with digit j,(0 &le; j &le; 9) in the sticker set of every box. Each two neighbour digits are separated by one space symbol.</p>

### 출력

<p>The only line of output should contain one integer &ndash; number of labeled models.</p>
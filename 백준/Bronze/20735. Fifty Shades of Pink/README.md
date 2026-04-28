# [Bronze II] Fifty Shades of Pink - 20735

[문제 링크](https://www.acmicpc.net/problem/20735)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 191, 정답: 154, 맞힌 사람: 143, 정답 비율: 80.337%

### 분류

구현, 문자열

### 문제 설명

<p>Thore is a fashionable man. Every time he meets up with his programming team, he wears his hot pink team hoodie over a salmon colored shirt with shirt buttons in a dashing rose or pink shade. Of course, he can&#39;t show up to two training sessions with the same buttons on his shirt, that would cause unbearable ridicule. If he can&#39;t find buttons for this perfect color combination, he will come up with some poor excuse for not showing up. He has a box full of different colored buttons in labeled packages. Unfortunately, Thore is color blind, so his helpful daughter has labeled each package with the color of the buttons. Her writing is terrible though, she mixes uppercase and lowercase arbitrarily and has no spacing between words, so Thore needs your help to decipher the names on the labels and select buttons with either &quot;<code>pink</code>&quot; or &quot;<code>rose</code>&quot; somewhere in the name, ignoring case.&nbsp;</p>

### 입력

<p>Input starts with an integer $1 \leq N \leq 1\,000$, the number of button packages in the box. The following $N$ lines each has a color name, one for each package. The names consist of up to 30 characters of letters A - Z, a - z.</p>

### 출력

<p>Print one integer, the number of training sessions Thore can attend. If he can&#39;t attend any session because there are no pink buttons, output his standard excuse &quot;<code>I must watch Star Wars with my daughter</code>&quot;.</p>
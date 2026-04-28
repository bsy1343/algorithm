# [Platinum II] Dazzling Stars - 18032

[문제 링크](https://www.acmicpc.net/problem/18032)

### 성능 요약

시간 제한: 0.2 초, 메모리 제한: 512 MB

### 통계

제출: 156, 정답: 59, 맞힌 사람: 45, 정답 비율: 43.689%

### 분류

정렬, 기하학, 스위핑

### 문제 설명

<p>Little Bernie loves to look at the stars in the sky. His favorite constellation is the Ball of Paper Constellation, because of its distinct and unmistakable shape of. . . a ball of crumpled paper. Bernie downloaded a picture of the constellation from the internet, and now he wants to print it and stick it to his wall. Bernie also likes to watch the paper sheets gradually coming out of the printer, and for this occasion, he made a decision: he wants the stars to be printed in non-increasing order of brightness.</p>

<p>The constellation has N stars. For each one, Bernie knows its brightness level B as well as its X and Y coordinates in the picture, where the X direction points rightwards and the Y direction points upwards. He knows that the pictures are printed from top to bottom (that is, in decreasing order of the Y coordinate), and that everything in a horizontal line is printed simultaneously.</p>

<p>Bernie&rsquo;s plan can be described like this: for any two stars S and T, if S is brighter than T, then S must be printed before or at the same time as T. Before printing the picture, Bernie can rotate it at any angle around any given point, but he cannot scale, reflect or distort it. Now Bernie needs your help to find out if there is any rotation that allows the stars to be printed in the order he wants.</p>

### 입력

<p>The first line contains an integer N (3 &le; N &le; 1000) indicating the number of stars in the constellation. Each of the next N lines describes a star with three integers X, Y (&minus;10<sup>4</sup> &le; X, Y &le; 10<sup>4</sup>) and B (1 &le; B &le; 1000), where X and Y are the coordinates of the star in the picture, and B is its brightness level. No two stars have the same location.</p>

### 출력

<p>Output a single line with the uppercase letter &ldquo;Y&rdquo; if there is any rotation that allows the stars to be printed in non-increasing order of brightness, and the uppercase letter &ldquo;N&rdquo; otherwise.</p>
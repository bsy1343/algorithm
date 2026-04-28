# [Gold III] Key to Success - 3581

[문제 링크](https://www.acmicpc.net/problem/3581)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 19, 정답: 9, 맞힌 사람: 8, 정답 비율: 61.538%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>The organizers of the TV Show &ldquo;Key to Success&rdquo; are preparing a set of prizes for the winner of the game. If the score of the winner is X, she must choose prizes with a total value of exactly X dollars.</p>

<p>The organizers have a couple of spare prizes from the previous competitions that have values a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> dollars, respectively. Unfortunately they don&rsquo;t know what the score of the winner will be. So the organizers decided to buy m more prizes in order to maximize the minimal integer score that the winner of the show wouldn&rsquo;t be able to collect prizes for.</p>

<p>For example, if they already have prizes for 2, 3 and 9 dollars, and they want to buy 2 prizes, they should buy prizes for 1 and 7 dollars. Then the winner of the show would be able to collect prizes for any score from 1 to 22.</p>

### 입력

<p>The first line of the input file contains two integer numbers: n and m &mdash; the number of prizes the organizers have and the number of prizes they are ready to buy (0 &le; n &le; 30, 1 &le; m &le; 30). The second line contains n integer numbers ranging from 1 to 10<sup>9</sup> &mdash; the values of the prizes organizers have.</p>

### 출력

<p>Output m integer numbers &mdash; the values of the prizes the show organizers should buy. Output numbers in non-decreasing order. If there are several optimal solutions, output any one.</p>
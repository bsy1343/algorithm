# [Gold III] Square Pool - 24572

[문제 링크](https://www.acmicpc.net/problem/24572)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 93, 정답: 35, 맞힌 사람: 30, 정답 비율: 42.254%

### 분류

브루트포스 알고리즘, 누적 합, 두 포인터

### 문제 설명

<p>Ron wants to build a square pool in his square N-by-N yard, but his yard contains T trees. Your job is to determine the side length of the largest square pool he can build.</p>

### 입력

<p>The first line of input will be an integer N with N &ge; 2. The second line will be the positive integer T where T &lt; N<sup>2</sup>. The remaining input will be T lines, each representing the location of a single tree. The location is given by two positive integers, R and then C, separated by a single space. Each tree is located at row R and column C where rows are numbered from top to bottom from 1 to N and columns are numbered from left to right from 1 to N. No two trees are at the same location.</p>

### 출력

<p>Output one line containing M which is the largest positive integer such that some M-by-M square contained entirely in Ron&rsquo;s yard does not contain any of the T trees.</p>
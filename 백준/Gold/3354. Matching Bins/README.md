# [Gold II] Matching Bins - 3354

[문제 링크](https://www.acmicpc.net/problem/3354)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 21, 맞힌 사람: 20, 정답 비율: 45.455%

### 분류

그리디 알고리즘, 브루트포스 알고리즘, 정렬, 애드 혹

### 문제 설명

<p>There is a large number of empty bins in a factory depot. The bins are arranged in a single row. The manager of the depot wants to put some bins into other bins to make some free space in the left end of the depot. Bins can be moved by a robot, which can take a bin, carry it to the right, and put it into a larger bin. This three-operation sequence is the only allowed way to move bins.</p>

<p>Because of safety regulations, any bin can contain at most one other bin, which must be empty. The manager also wants to keep the double bins in the left end of the resulting row, to make it easier to keep track of them.</p>

<p>You are to write a program that computes the largest possible K such that the K leftmost bins can be put into the immediately following K bins in some order.</p>

### 입력

<p>The first line of the text file bins.in contains two integers, separated by a space: M (1 &le; M &le; 1000), the size of the largest bin, and N (1 &le; N &le; 20,000), the number of bins. The second line contains N integers A<sub>i</sub> (1 &le; A<sub>i</sub> &le; M), separated by spaces: the sizes of the bins, listed from left to right.</p>

### 출력

<p>The first and only line of the text file bins.out should contain a single integer, the largest number K such that the robot can put the K leftmost bins into the next K bins.</p>
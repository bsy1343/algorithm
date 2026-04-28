# [Platinum II] Beautiful Now - 18558

[문제 링크](https://www.acmicpc.net/problem/18558)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 61, 정답: 21, 맞힌 사람: 17, 정답 비율: 34.000%

### 분류

수학, 자료 구조, 그리디 알고리즘, 브루트포스 알고리즘, 분리 집합, 백트래킹, 순열 사이클 분할

### 문제 설명

<p>Anton has a positive integer \(n\), however, it quite looks like a mess, so he wants to make it beautiful after \(k\) swaps of digits.</p>

<p>Let the decimal representation of \(n\) as \((x_1x_2 \dots x_m)_{10}\) satisfying that&nbsp;\(1 \le x_1 \le 9, 0 \le x_i \le 9 (2 \le i \le&nbsp;m)\), which means \(n = \sum_{i=1}^{m}{x_i10^{m&minus;i}}\). In each swap, Anton can select two digits \(x_i\) and \(x_j\) (\(1 \le i \le j \le m\)) and then swap them if the integer after this swap has no leading zero.</p>

<p>Could you please tell him the minimum integer and the maximum integer he can obtain after \(k\) swaps?</p>

### 입력

<p>The first line contains one integer \(T\), indicating the number of test cases.</p>

<p>Each of the following \(T\) lines describes a test case and contains two space-separated integers \(n\) and \(k\). \(1 \le T \le 100, 1 \le n, k \le 10^9\).</p>

### 출력

<p>For each test case, print in one line the minimum integer and the maximum integer which are separated by one space.</p>
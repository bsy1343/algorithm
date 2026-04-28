# [Silver IV] Steve's perfectionism - 23432

[문제 링크](https://www.acmicpc.net/problem/23432)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 76, 정답: 51, 맞힌 사람: 45, 정답 비율: 77.586%

### 분류

수학, 해 구성하기

### 문제 설명

<p>Steve is a hopeless perfectionist. He&#39;s been stumbling upon arrays of positive integers, but he doesn&#39;t always enjoy what he&#39;s seeing. Steve likes an array if and only if it is strictly ascending. Arrays that Steve doesn&#39;t like must be changed asap, otherwise Steve will be disappointed. The new array will satisfy Steve only if its initial length is retained, and its elements are divisible by the corresponding elements of the old array. Note that an array can be satisfactory from the start. In this case, it can be left alone (or not, if you want change).</p>

<p>Make Steve happy! Write a program that can instantly produce new, likeable arrays.</p>

### 입력

<p>The first line of the input file contains a single integer $n$ --- the number of elements in the array that Steve has laid his eyes on ($2 \le n \le 1000$). The second line of the input file contains $n$ space-separated positive integers $a_i$ ($1 \le a_i \le 10^6$).</p>

### 출력

<p>In the output file, print $n$ positive integers $a_i$ ($1 \leq a_i \leq 10^9$) --- the new array, which Steve will like.</p>

<p>There can be several solutions: print any of them.</p>
# [Platinum IV] Cubes - 13863

[문제 링크](https://www.acmicpc.net/problem/13863)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 256 MB

### 통계

제출: 65, 정답: 20, 맞힌 사람: 16, 정답 비율: 55.172%

### 분류

구현, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵, 백트래킹, 두 포인터

### 문제 설명

<p>Write a program that takes a natural number N and decomposes it as a sum of the minimum number of exact natural cubes. The program should find m<sub>1</sub>, m<sub>2</sub>, &hellip;, m<sub>k</sub>, such that each m<sub>i</sub> is a natural number, m<sub>1</sub><sup>3</sup> +m<sub>2</sub><sup>3</sup> +&hellip; +m<sub>k</sub><sup>3</sup> = N, and k is minimal.</p>

### 입력

<p>The only line of the input file contains the number N (1 &le; N &le; 44,777,444).</p>

### 출력

<p>Your program should write exactly two lines. The first line contains the number k - the minimum number of natural cubes. The second line contains k space-separated natural numbers - that raised to the power of 3 sum to N.</p>
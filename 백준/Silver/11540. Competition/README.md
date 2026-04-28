# [Silver III] Competition - 11540

[문제 링크](https://www.acmicpc.net/problem/11540)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 282, 정답: 93, 맞힌 사람: 82, 정답 비율: 40.196%

### 분류

구현, 정렬, 집합과 맵

### 문제 설명

<p>Bob and Alice are participating in a programming contest as a team.</p>

<p>The contest has N problems which must be solved in order. Naturally there are some problems that they cannot solve, in that case they can skip it. There may be also problems that only Bob or Alice alone can solve.</p>

<p>They want to solve all the problems possible switching as few times as possible who is at the computer programming the solution.</p>

<p>Given the number of problems and the problems that Bob and Alice can solve, calculate the minimum number of switches between the usage of the computer. Anyone can start using it.</p>

### 입력

<p>The first line contains three integers N (1 &le; N &le; 10<sup>9</sup>), A (1 &le; A &le; min(N, 5 &lowast; 10<sup>4</sup>)) and B (1 &le; B &le; min(N, 5 &lowast; 10<sup>4</sup>)). The next line contains A unique integers denoting the problems Alice can solve. The following line contains B unique integers denoting the problems Bob can solve. The first problem is denoted by the number 1, the second by number 2, the N-th by N, and so on.</p>

### 출력

<p>Print the minimum number of switches between the usage of the computer.</p>
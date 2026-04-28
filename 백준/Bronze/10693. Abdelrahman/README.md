# [Bronze III] Abdelrahman - 10693

[문제 링크](https://www.acmicpc.net/problem/10693)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 427, 정답: 350, 맞힌 사람: 329, 정답 비율: 82.250%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>In an ICPC national contest after the operations team had arrived to the site, they discovered that a mistake had been made in connecting the network of computers that the contestants will use, and many unneeded cables has been installed between the computers. So Abdelrahman Mostafa (the regional director of operations in the ACPC) wants to remove as much as he can of the cables to minimize the possibility of a runner tripping on a cable, and all the computers should be able to reach each other after removing these cables (they are all initially reachable from each other), can you help him?</p>

<p>A computer is reachable from another computer if there is a direct cable between them, or if both are reachable from another third computer.</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T, the number of test cases (1 &le; T &le; 100). Followed by T lines, each line is a test case which consists of two integers separated by a single space N and M (1 &le; N &le; 10<sup>4</sup>) and (N &minus; 1 &le; M &le; 10<sup>5</sup>) denoting the number of computers and the number of cables in the contest hall, respectively.</p>

### 출력

<p>For each test case print a single line containing &ldquo;Case n:&rdquo; (without the quotes) where n is the test case number (starting from 1) followed by a space then R which is the maximum number of cables that can be removed.</p>
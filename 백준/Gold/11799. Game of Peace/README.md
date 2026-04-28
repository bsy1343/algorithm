# [Gold III] Game of Peace - 11799

[문제 링크](https://www.acmicpc.net/problem/11799)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 237, 정답: 60, 맞힌 사람: 55, 정답 비율: 32.353%

### 분류

브루트포스 알고리즘, 유클리드 호제법, 구현, 수학, 정수론, 시뮬레이션

### 문제 설명

<p>Bob has learned a new magic trick that needs a very special preparation. Once he masters the trick he will be able to bring peace to the world, but if he fails, the world will be destroyed.</p>

<p>The preparation is performed as follows: There are two containers, initially one is empty and the other one has X marbles. Bob has a Marble Cloning Machine, it clones the marbles in the container with the larger number of marbles, then pours the new clones into the other container (e.g. if the two containers have 7 and 4 marbles, after the cloning step they will have 7 and 11 marbles). The machine does this cloning operation exactly M times. However, there is a bug in the machine, after it performs N cloning operations (N &le; M), it will add Y extra marbles to the container with the larger number of marbles. Then the machine will continue normally with the cloning operation exactly M &minus; N times.</p>

<p>During the cloning operations, if both containers have the same number of marbles, any of them can be considered the one with the larger number of marbles.</p>

<p>Now, the bug in Bob&rsquo;s machine is threatening to destroy the world. But his nerdy friend Alice told him that she knows how to fix it. All he has to do is to calculate the greatest common divisor of the sizes of the two containers after the cloning machine is done. Can you help Bob save the world?</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T (1 &le; T &le; 1,000) representing the number of test cases. Followed by T test cases. Each test case will consist of a single line, containing 4 integers separated by a single space X , N , Y and M (1 &le; X , Y &le; 1,000) (0 &le; N &le; 70) (N &le; M &le; 100,000) which are the numbers as described above.</p>

### 출력

<p>For each test case print a single line containing &ldquo;Case n:&rdquo; (without quotes) where n is the test case number (starting from 1) followed by a space then the greatest common divisor of the sizes of the two containers after the machine is done.</p>

### 힌트

<p>In the first sample test case, the number of marbles in each container will be the following after each step: (4, 0), (4, 4), (4, 8), (12, 8), (18, 8), (18, 26), (44, 26). The greatest common divisor of 44 and 26 is 2.</p>
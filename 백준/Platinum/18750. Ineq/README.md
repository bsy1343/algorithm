# [Platinum II] Ineq - 18750

[문제 링크](https://www.acmicpc.net/problem/18750)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 42, 정답: 16, 맞힌 사람: 14, 정답 비율: 38.889%

### 분류

기하학, 볼록 껍질, 픽의 정리

### 문제 설명

<p>Given a set of integer pairs S = {(x<sub>1</sub>, y<sub>1</sub>), . . . ,(x<sub>n</sub>, y<sub>n</sub>)}, determine if a set of integer triples T = {(a<sub>1</sub>, b<sub>1</sub>, c<sub>1</sub>), . . . ,(a<sub>m</sub>, b<sub>m</sub>, c<sub>m</sub>)} exists such that aixj + biyj &lt; ci for all i and j, and there doesn&rsquo;t exist an integer pair (x&#39;, y&#39;) not belonging to S such that a<sub>i</sub>x&#39; + b<sub>i</sub>y&#39; &lt; c<sub>i</sub> for all i.</p>

### 입력

<p>The first line contains a single integer t (1 &le; t &le; 10<sup>5</sup>), denoting the number of test cases.</p>

<p>Each test case is described with an integer n (1 &le; n &le; 10<sup>5</sup>), followed by n lines containing two integers x<sub>i</sub> and y<sub>i</sub> each (&minus;10<sup>9</sup> &le; x<sub>i</sub>, y<sub>i</sub> &le; 10<sup>9</sup>). All pairs (x<sub>i</sub>, y<sub>i</sub>) within one test case are distinct.</p>

<p>The sum of n over all test cases does not exceed 10<sup>5</sup>.</p>

### 출력

<p>For each test case, display a separate line with 1 if the answer is positive, and 0 otherwise.</p>

### 힌트

<p>In the first test case, one possible set of triples is {(1, 0, 1),(0, 1, 1),(&minus;1, 0, 1),(0, &minus;1, 1)}.</p>
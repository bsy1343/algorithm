# [Platinum IV] Reliable Nets - 4077

[문제 링크](https://www.acmicpc.net/problem/4077)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 56, 정답: 20, 맞힌 사람: 19, 정답 비율: 42.222%

### 분류

다이나믹 프로그래밍, 그래프 이론, 브루트포스 알고리즘, 단절점과 단절선

### 문제 설명

<p>You&rsquo;re in charge of designing a campus network between buildings and are very worried about its reliability and its cost. So, you&rsquo;ve decided to build some redundancy into your network while keeping it as inexpensive as possible. Specifically, you want to build the cheapest network so that if any one line is broken, all buildings can still communicate. We&rsquo;ll call this a minimal reliable net.</p>

### 입력

<p>There will be multiple test cases for this problem. Each test case will start with a pair of integers n (&le; 15) and m (&le; 20) on a line indicating the number of buildings (numbered 1 through n) and the number of potential inter-building connections, respectively. (Values of n = m = 0 indicate the end of the problem.) The following m lines are of the form b<sub>1</sub> b<sub>2</sub> c (all positive integers) indicating that it costs c to connect building b<sub>1</sub> and b<sub>2</sub>. All connections are bidirectional.</p>

### 출력

<p>For each test case you should print one line giving the cost of a minimal reliable net. If there is a minimal reliable net, the output line should be of the form:</p>

<pre>
The minimal cost for test case p is c.</pre>

<p>where p is the number of the test case (starting at 1) and c is the cost. If there is no reliable net possible, output a line of the form:</p>

<pre>
There is no reliable net possible for test case p.</pre>
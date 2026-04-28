# [Platinum II] Juggler - 4791

[문제 링크](https://www.acmicpc.net/problem/4791)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 57, 정답: 11, 맞힌 사람: 10, 정답 비율: 22.222%

### 분류

자료 구조, 세그먼트 트리, 스위핑

### 문제 설명

<p>As part of my magical juggling act, I am currently juggling a number of objects in a circular path with one hand. However, as my rather elaborate act ends, I wish to drop all of the objects in a specific order, in a minimal amount of time. On each move, I can either rotate all of the objects counterclockwise by one, clockwise by one, or drop the object currently in my hand. If I drop the object currently in my hand, the next object (clockwise) will fall into my hand. What&rsquo;s the minimum number of moves it takes to drop all of the balls I&rsquo;m juggling?</p>

### 입력

<p>There will be several test cases in the input. Each test case begins with an integer n, (1&le;n&le;100,000) on its own line, indicating the total number of balls begin juggled. Each of the next n lines consists of a single integer, ki (1&le;ki&le;n), which describes a single ball: i is the position of the ball starting clockwise from the juggler&rsquo;s hand, and ki is the order in which the ball should be dropped. The set of numbers {k1, k2, &hellip;, kn} is guaranteed to be a permutation of the numbers 1..n. The input will terminate with a line containing a single 0.</p>

### 출력

<p>For each test case, output a single integer on its own line, indicating the minimum number of moves I need to drop all of the balls in the desired order. Output no extra spaces, and do not separate answers with blank lines. All possible inputs yield answers which will fit in a signed 64-bit integer.</p>

### 힌트

<p>Explanation of the sample input: The first ball is in the juggler&rsquo;s hand and should be dropped third; the second ball is immediately clockwise from the first ball and should be dropped second; the third ball is immediately clockwise from the second ball and should be dropped last.</p>
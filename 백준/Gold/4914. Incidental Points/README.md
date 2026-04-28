# [Gold III] Incidental Points - 4914

[문제 링크](https://www.acmicpc.net/problem/4914)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 11, 맞힌 사람: 7, 정답 비율: 53.846%

### 분류

수학, 자료 구조, 브루트포스 알고리즘, 기하학, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Unlike a straight line, a straight segment between two points P<sub>1</sub>, P<sub>2</sub> (normally written as P<sub>1</sub>P<sub>2</sub>) is a line that links the two points but doesn&rsquo;t extend beyond them. A third point P<sub>3</sub> is said to be incident to P<sub>1</sub>P<sub>2</sub> if P<sub>3</sub> lies on the straight line and between the points P<sub>1</sub> and P<sub>2</sub>. P<sub>1</sub>P<sub>2</sub> is said to include P<sub>3</sub>. By definition, P<sub>1</sub> and P<sub>2</sub> are included in P<sub>1</sub>P<sub>2</sub>. Write a program to find the segment that includes the most number of given points.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4914.%E2%80%85Incidental%E2%80%85Points/990ef0c1.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/4914/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-10%20%EC%98%A4%ED%9B%84%204.25.36.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:199px; width:202px" /></p>

### 입력

<p>Your program will be tested on one or more test cases. Each test case includes a set of two or more unique points, where the Cartesian coordinates of each point is specified on a separate line using two integers X and Y where 0 &le; |X| , |Y| &lt; 1, 000, 000. No test case has more than 1000 points. An input line made of two or more &rsquo;-&rsquo; (minus signs) signals the end of a test case. An extra input line of two or more &rsquo;-&rsquo; (minus signs) follow the last test case.</p>

### 출력

<p>For each test case, output the result on a single line using the following format:</p>

<p>k.␣n</p>

<p>Where k is the test case number (starting at 1,) ␣ is a single space, and n is the number of points on the segment.</p>
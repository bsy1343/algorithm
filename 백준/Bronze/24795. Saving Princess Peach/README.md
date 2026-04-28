# [Bronze III] Saving Princess Peach - 24795

[문제 링크](https://www.acmicpc.net/problem/24795)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 342, 정답: 181, 맞힌 사람: 150, 정답 비율: 49.342%

### 분류

구현

### 문제 설명

<p>Mario is trying to save his beloved Princess Peach! However, in order to do that, Mario must jump over many obstacles in order to save Princess Peach. Thus, he makes a grand plan to infiltrate Bowser&#39;s castle.&nbsp;</p>

<p>But first, he needs to practice. His brother Luigi makes a practice course for Mario to train on. On this course, Mario practices looking for all the possible obstacles that could take away his life. &nbsp;But Mario is sloppy and misses some obstacles, counts some obstacles more than once, and generally screws up the order of the obstacles he does find when he lists them!</p>

<p>Write a program so that Luigi can tell his brother which obstacles he&#39;s missed!</p>

### 입력

<p>The first line contains $2$ values. The first value $N$ ($0 &lt; N \le 100$) is the total number of obstacles. &nbsp; Obstacles are numbered $0 \ldots N-1$.</p>

<p>The second value $Y$ ($0 \le Y \le 200$) represents how many obstacles Mario said he&#39;s found on his practice run. The next $Y$ lines each list a single integer $k$ ($0 \le k &lt; N$) which is the number of an obstacle Mario says he&#39;s found.</p>

### 출력

<p>First, output the obstacles that Mario missed in increasing order, each on a separate line. On the last line, print <code>Mario got X of the dangerous obstacles.</code> where $X$ is the number of distinct obstacles Mario found.</p>
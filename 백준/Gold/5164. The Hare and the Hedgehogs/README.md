# [Gold IV] The Hare and the Hedgehogs - 5164

[문제 링크](https://www.acmicpc.net/problem/5164)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 6, 맞힌 사람: 5, 정답 비율: 41.667%

### 분류

백트래킹

### 문제 설명

<p>There is a famous German fable about the hare and the hedgehog. The hare keeps boasting about how fast he is, so the hare and hedgehog agree to a race across a field. As soon as the race starts, the hare takes off racing, but when he gets to the end, the hedgehog is already there. So he races back even faster, but the hedgehog is already there. He keeps racing back and forth at increasing speeds, and meets the hedgehog at the other end every time. Finally, he collapses and dies. Of course, the hedgehog won because the one at the other end of the field was actually his wife. When the story is told to children, the implication usually seems to be either that if you boast, you deserve to be shown up, or how effective teamwork can be. Unfortunately, the real message the story conveys is that it&rsquo;s easy to win if you cheat.</p>

<p>Here, we will look at a more complicated race between a hare and a number of hedgehogs. The course will consist of several &ldquo;legs&rdquo;, each a straight line. This will be given by a sequence of points in the plane (x1, y1), . . . ,(xn, yn). The starting point of the race is the origin (0, 0). The hare will run at a constant speed u along the straight line to (x1, y1), then along a straight line to (x2, y2), and so forth. The hedgehogs can move at a (different) given speed v, and can walk around any way they like. Points are scored as follows: If, at the moment that the hare reaches (xi, yi) (1 &le; i &le; n), there is a hedgehog at (xi, yi), then the hedgehogs win a point. Otherwise, the hare earns a point. If they arrive at exactly the same time, the hare also wins the point. Your goal is to compute the best score that the hedgehogs as a team can accomplish.</p>

### 입력

<p>The first line contains the number K of data sets. This is followed by K data sets, each of the following form:</p>

<p>The first line of each data set contains two integer numbers n, h, and two floating point numbers u, v. 1 &le; n &le; 10 is the number of legs to be run, 1 &le; h &le; 5 is the number of hedgehogs on the field, u is the hare&rsquo;s speed, and v the hedgehogs&rsquo; speed, both in m/s.</p>

<p>This is followed by n lines, each giving the coordinates for a point (xi, yi) as two floating point numbers. This is followed by h &minus; 1 lines, each giving the initial coordinates (x&prime;i, y&prime;i) of hedgehog i = 2, . . . , h. Hedgehog 1 always starts at the origin. All coordinates will be in m.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output the maximum number of legs the hedgehogs together can win. Each data set should be followed by one empty line.</p>
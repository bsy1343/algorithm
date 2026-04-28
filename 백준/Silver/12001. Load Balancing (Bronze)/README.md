# [Silver IV] Load Balancing (Bronze) - 12001

[문제 링크](https://www.acmicpc.net/problem/12001)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1320, 정답: 490, 맞힌 사람: 415, 정답 비율: 38.355%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Farmer John&#39;s \(N\) cows are each standing at distinct locations \((x_1, y_1) \ldots (x_n, y_n)\) on his two-dimensional farm (\(1 \leq N \leq 100\), and the \(x_i\)&#39;s and \(y_i\)&#39;s are positive odd integers of size at most \(B\)). FJ wants to partition his field by building a long (effectively infinite-length) north-south fence with equation \(x=a\) (\(a\) will be an even integer, thus ensuring that he does not build the fence through the position of any cow). He also wants to build a long (effectively infinite-length) east-west fence with equation \(y=b\), where \(b\) is an even integer. These two fences cross at the point \((a,b)\), and together they partition his field into four regions.</p>

<p>FJ wants to choose \(a\) and \(b\) so that the cows appearing in the four resulting regions are reasonably &quot;balanced&quot;, with no region containing too many cows. Letting \(M\) be the maximum number of cows appearing in one of the four regions, FJ wants to make \(M\) as small as possible. Please help him determine this smallest possible value for \(M\).</p>

<p>For the first five test cases, \(B\) is guaranteed to be at most 100. In all test cases, \(B\) is guaranteed to be at most 1,000,000.</p>

### 입력

<p>The first line of the input contains two integers, \(N\) and \(B\). The next \(n\) lines each contain the location of a single cow, specifying its \(x\) and \(y\) coordinates.</p>

### 출력

<p>You should output the smallest possible value of \(M\) that FJ can achieve by positioning his fences optimally.</p>
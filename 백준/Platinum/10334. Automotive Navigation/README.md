# [Platinum II] Automotive Navigation - 10334

[문제 링크](https://www.acmicpc.net/problem/10334)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 79, 정답: 24, 맞힌 사람: 24, 정답 비율: 32.877%

### 분류

구현

### 문제 설명

<p>The International Commission for Perfect Cars (ICPC) has constructed a city scale test course for advanced driver assistance systems. Your company, namely the Automotive Control Machines (ACM), is appointed by ICPC to make test runs on the course.</p>

<p>The test course consists of streets, each running straight either east-west or north-south. No streets of the test course have dead ends, that is, at each end of a street, it meets another one. There are no grade separated streets either, and so if a pair of orthogonal streets run through the same geographical location, they always meet at a crossing or a junction, where a car can turn from one to the other. No U-turns are allowed on the test course and a car never moves outside of the streets.</p>

<p>Oops! You have just received an error report telling that the GPS (Global Positioning System) unit of a car running on the test course was broken and the driver got lost. Fortunately, however, the odometer and the electronic compass of the car are still alive.</p>

<p>You are requested to write a program to estimate the current location of the car from available information. You have the car&rsquo;s location just before its GPS unit was broken. Also, you can remotely measure the running distance and the direction of the car once every time unit. The measured direction of the car is one of north, east, south, and west. If you measure the direction of the car while it is making a turn, the measurement result can be the direction either before or after the turn. You can assume that the width of each street is zero.</p>

<p>The car&rsquo;s direction when the GPS unit was broken is not known. You should consider every possible direction consistent with the street on which the car was running at that time.</p>

### 입력

<p>The input consists of a single test case. The first line contains four integers n, x<sub>0</sub>, y<sub>0</sub>, t, which are the number of streets (4 &le; n &le; 50), x- and y-coordinates of the car at time zero, when the GPS unit was broken, and the current time (1 &le; t &le; 100), respectively. (x<sub>0</sub>, y<sub>0</sub>) is of course on some street. This is followed by n lines, each containing four integers x<sub>s</sub>, y<sub>s</sub>, x<sub>e</sub>, y<sub>e</sub> describing a street from (x<sub>s</sub>, y<sub>s</sub>) to (x<sub>e</sub>, y<sub>e</sub>) where (x<sub>s</sub>, y<sub>s</sub>) &ne; (x<sub>e</sub>, y<sub>e</sub>). Since each street runs either east-west or north-south, x<sub>s</sub> = x<sub>e</sub> or y<sub>s</sub> = y<sub>e</sub> is also satisfied. You can assume that no two parallel streets overlap or meet. In this coordinate system, the x- and y-axes point east and north, respectively. Each input coordinate is non-negative and at most 50. Each of the remaining t lines contains an integer d<sub>i</sub> (1 &le; d<sub>i</sub> &le; 10), specifying the measured running distance from time i &minus; 1 to i, and a letter c<sub>i</sub>, denoting the measured direction of the car at time i and being either N for north, E for east, W for west, or S for south.</p>

### 출력

<p>Output all the possible current locations of the car that are consistent with the measurements. If they are (x<sub>1</sub>, y<sub>1</sub>),(x<sub>2</sub>, y<sub>2</sub>), ... ,(x<sub>p</sub>, y<sub>p</sub>) in the lexicographic order, that is, x<sub>i</sub> &lt; x<sub>j</sub> or x<sub>i</sub> = x<sub>j</sub> and y<sub>i</sub> &lt; y<sub>j</sub> if 1 &le; i &lt; j &le; p, output the following:</p>

<pre>
x<sub>1</sub> y<sub>1</sub>
x<sub>2</sub> y<sub>2</sub>
.
.
.
x<sub>p</sub> y<sub>p</sub></pre>

<p>Each output line should consist of two integers separated by a space.</p>

<p>You can assume that at least one location on a street is consistent with the measurements.</p>
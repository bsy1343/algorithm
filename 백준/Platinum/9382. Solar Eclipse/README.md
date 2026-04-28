# [Platinum V] Solar Eclipse - 9382

[문제 링크](https://www.acmicpc.net/problem/9382)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 12, 맞힌 사람: 8, 정답 비율: 44.444%

### 분류

애드 혹, 기하학, 그리디 알고리즘, 수학

### 문제 설명

<p>A new Solar Eclipse is going to happen in Mars. Scientists from different parts of the world are travelling to Mars to watch and study this phenomenon. You just managed to calculate exactly the best point of Mars lands for your study of the eclipse, and want to land your flying saucer on that place. But, you notice that there are already other spacecrafts landed on near that area.</p>

<p>In the bird&rsquo;s eye view, all the spacecrafts (including yours) are circles with constant radius R. Logically, you hate to land your spacecraft on the others (no intersection of areas is allowed, but touching the other crafts is acceptable), though, the other saucers did not obey this rule on their own landings (i.e. their circles might have positive-area&nbsp;intersections with each other). In order to land your own craft on Mars, you want to find the place which minimizes the distance between the center of your flying saucer and your already calculated best point (and obeys the no-intersection rule). That&rsquo;s what you should do in this problem.</p>

### 입력

<p>The input has multiple test cases. Each test case starts with a line containing an integer n (number of already landed spacecrafts), and a real number R. The land is small enough for us to be modeled by a two-dimensional plane, and (0,0) is conventionally the best point for us to land. Each of the next n lines specifies the location of a landed flying saucer by&nbsp;giving two real numbers x and y as the coordinates of its center.&nbsp;</p>

<p>The input ends with a case of n = R = 0 which must not be processed. Assume n &le; 100, R &gt; 0, and their absolute value does not exceed 1000.</p>

### 출력

<p>Write the result of the i<sup>th</sup> test case on the i<sup>th</sup> line of the output. You should just write the minimum possible distance between the center of your landed craft and the origin of the plane, rounded to exactly 6 digits after the decimal point.&nbsp;</p>
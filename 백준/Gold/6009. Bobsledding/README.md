# [Gold I] Bobsledding - 6009

[문제 링크](https://www.acmicpc.net/problem/6009)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 154, 정답: 41, 맞힌 사람: 36, 정답 비율: 25.175%

### 분류

수학, 정렬, 누적 합, 스위핑

### 문제 설명

<p>Bessie has entered a bobsled competition because she hopes her hefty weight will give her an advantage over the L meter course (2 &lt;= L &lt;= 1,000,000,000).</p>

<p>Bessie will push off the starting line at 1 meter per second, but her speed can change while she rides along the course. Near the middle of every meter Bessie travels, she can change her speed either by using gravity to accelerate by one meter per second or by braking to stay at the same speed or decrease her speed by one meter per second.</p>

<p>Naturally, Bessie must negotiate N (1 &lt;= N &lt;= 100,000) turns on the way down the hill. Turn i is located T_i meters from the course start (1 &lt;= T_i &lt;= L-1), and she must be enter the corner meter at a speed of at most S_i meters per second (1 &lt;= S_i &lt;= 1,000,000,000). Bessie can cross the finish line at any speed she likes.</p>

<p>Help Bessie learn the fastest speed she can attain without exceeding the speed limits on the turns.</p>

<p>Consider this course with the meter markers as integers and the turn speed limits in brackets (e.g., &#39;[3]&#39;):</p>

<pre>
|   1   2   3   4   5   6   7[3]
|---+---+---+---+---+---+---+
|                            \
Start                         + 8    
                               \
                                + 9    
                                 \
                                  + 10       +++ 14 (finish)
                                   \         /
                              11[1] +---+---+
                                        12  13[8]</pre>

<p>Below is a chart of Bessie&#39;s speeds at the beginning of each meter length of the course:</p>

<pre>
Max:                              3               1       8
Mtrs: 0   1   2   3   4   5   6   7   8   9  10  11  12  13  14 
Spd:  1   2   3   4   5   5   4   3   4   3   2   1   2   3   4</pre>

<p>Her maximum speed was 5 near the beginning of meter 4.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: L and N</li>
	<li>Lines 2..N+1: Line i+1 describes turn i with two space-separated integers: T_i and S_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer, representing the maximum speed which Bessie can attain between the start and the finish line, inclusive.</li>
</ul>

<p>&nbsp;</p>
# [Gold V] Cows on a Leash - 14785

[문제 링크](https://www.acmicpc.net/problem/14785)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 108, 정답: 63, 맞힌 사람: 53, 정답 비율: 58.242%

### 분류

그리디 알고리즘, 정렬, 스위핑

### 문제 설명

<p>Farmer John has forced indignity onto the N (1 &lt;= N &lt;= 32,000) cows: he has purchased a number of leashes and has leashed the cows to stakes (conveniently located at integer locations) next to a long, linear fence that is no longer than 5,300,000 meters and runs east-west. Every single cow is straining her leash as much as she can to the east (though never beyond the end of the fence).</p>

<p>Happily, the cows have acquired an ally: FJ&#39;s wife thinks that leashes are barbaric and has come to the fence with her dull butcher knife. She can perform only a few cuts with it and wants to do the best job she can. She can locate herself halfway between two integer points along the fence and cut all the leashes that cross in front of her at that place.</p>

<p>Given the length of each leash and the location of its stake in the ground, what is the minimal number of cuts she must perform to free the cows?</p>

### 입력

<ul>
	<li>Line 1: A single integer, N</li>
	<li>Lines 2..N+1: Each line contains two space-separated positive integers that describe a leash. The first is the location of the leash&#39;s stake; the second is the length of the leash.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the minimum number of cuts so that each leash is cut at least once.</li>
</ul>

### 힌트

<p>Here is a simple graphical representation of the locations of the leashes:</p>

<pre>
                  1 1 1 1
1 2 3 4 5 6 7 8 9 0 1 2 3
-------------------------
. 111111111 . . . . . . .
. . . 222222222222222 . .
. . 3333333 . . . . . . .
. . . . 4444444 . . . . .
. . . . . . . . 555555555
66666666666 . . . . . . .
. . . . . . 7777777 . . .
</pre>

<p>Cutting at 5.5 cuts leashes 1, 2, 3, 4, and 6. A second cut at 9.5 cuts leashes 5 and 7. Other locations are surely possible, but no single cut can penetrate leashes 5 and 6, so at least two cuts are necessary.</p>
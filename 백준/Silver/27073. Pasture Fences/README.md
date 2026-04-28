# [Silver IV] Pasture Fences - 27073

[문제 링크](https://www.acmicpc.net/problem/27073)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 95, 정답: 50, 맞힌 사람: 39, 정답 비율: 47.561%

### 분류

브루트포스 알고리즘, 누적 합

### 문제 설명

<p>Farmer John has a long fence made of fence poles and rails.  Each of the N (1 &le; N &le; 3000) fence poles carries a sign with a single number from -1000 through +1000.  Some poles might have the same number on their sign as other poles. While chewing their cud, the cows made up a game.  The cow who can find the &quot;best fence sum&quot; gets ice cream for dessert.</p>

<p>To win the game, the winning cow must find the longest contiguous set of poles whose sum has the smallest absolute value.  Help them determine the winning sum.</p>

### 입력

<ul>
	<li>Line 1: One line with a single integer: N</li>
	<li>Lines 2..N+1: Each line contains a pole&#39;s label.  Line 2 contains the value for pole with sequence number 1, etc.</li>
</ul>

### 출력

<p>A single line with three numbers:</p>

<ul>
	<li>the sequence number of the pole that is first to be summed,</li>
	<li>the sequence number of the pole that is last to be summed, and</li>
	<li>the absolute value of the sum of the labels of those poles.</li>
</ul>

<p>If more than one  sequence has the same &quot;best fence sum&quot; and same maximum length, report the sequence with the lowest first sequence number.</p>
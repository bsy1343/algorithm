# [Gold III] Photoshoot - 24980

[문제 링크](https://www.acmicpc.net/problem/24980)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 401, 정답: 174, 맞힌 사람: 152, 정답 비율: 44.186%

### 분류

애드 혹

### 문제 설명

<p>Farmer John, desperate to win the award for best cow photographer at the county fair, is trying to take the perfect photograph of his $N$ cows ($2 \leq N \leq 2\cdot 10^5$, $N$ even).</p>

<p>Farmer John owns cows of two potential breeds: Guernseys and Holsteins. To make his photo as aesthetic as possible, he wants to line up his cows so that as many Guernseys are in even-numbered positions in the line as possible (the first position in the line is an odd position, the next is an even position, and so on). Due to his lack of strong communication with his cows, the only way he can achieve his goal is by asking even length &quot;prefixes&quot; of his cows to reverse themselves (a prefix consists of the range of cows from the first cow up to the $j$th cow for some position $j$).</p>

<p>Please count the minimum number of reversals required for Farmer John to achieve his goal.</p>

### 입력

<p>The first line of input contains the value of $N$.</p>

<p>The second line contains a string of length $N,$ specifying the initial ordering of the cows from left to right. Each &#39;H&#39; represents a Holstein, while each &#39;G&#39; represents a Guernsey.</p>

### 출력

<p>Output the minimum number of reversals needed on a single line.</p>

### 힌트

<p>In this example, it suffices to reverse the prefix consisting of the first six cows.</p>

<pre>
   GGGHGHHGHHHGHG (Before)
-&gt; HGHGGGHGHHHGHG (After)
</pre>

<p>Before the reversal, four Guernseys were at even positions. After the reversal, six Guernseys are at even positions. It is impossible for there to be more than six Guernseys at even positions.</p>
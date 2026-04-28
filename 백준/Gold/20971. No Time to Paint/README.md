# [Gold II] No Time to Paint - 20971

[문제 링크](https://www.acmicpc.net/problem/20971)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 428, 정답: 202, 맞힌 사람: 169, 정답 비율: 46.685%

### 분류

자료 구조, 누적 합, 스택

### 문제 설명

<p>Bessie has recently received a painting set, and she wants to paint the long fence at one end of her pasture. The fence consists of $N$ consecutive 1-meter segments ($1\le N\le 10^5$). Bessie has 26 different colors available, which she labels with the letters &#39;A&#39; through &#39;Z&#39; in increasing order of darkness (&#39;A&#39; is a very light color, and &#39;Z&#39; is very dark). She can therefore describe the desired color she wants to paint each fence segment as a length-$N$ string where each character is a letter.</p>

<p>Initially, all fence segments are uncolored. Bessie can color any contiguous range of segments with a single color in a single brush stroke as long as she never paints a lighter color over a darker color (she can only paint darker colors over lighter colors).</p>

<p>For example, an initially uncolored segment of length four can be colored as follows:</p>

<pre>
.... -&gt; BBB. -&gt; BBLL -&gt; BQQL
</pre>

<p>Running short on time, Bessie thinks she may need to leave some consecutive range of fence segments unpainted! Currently, she is considering $Q$ candidate ranges ($1\le Q\le 10^5$), each described by by two integers $(a,b)$ with $1 \leq a \leq b \leq N$ giving the indices of endpoints of the range $a \ldots b$ of segments to be left unpainted.</p>

<p>For each candidate range, what is the minimum number of strokes needed to paint every fence segment outside those in the range with its desired color while leaving all fence segments inside the range uncolored? Note that Bessie does not actually do any painting during this process, so the answers for each candidate range are independent.</p>

### 입력

<p>The first line contains $N$ and $Q$.</p>

<p>The next line contains a string of length $N$ characters representing the desired color for each fence segment.</p>

<p>The next $Q$ lines each contain two space-separated integers $a$ and $b$ representing a candidate range to possibly leave unpainted.</p>

### 출력

<p>For each of the $Q$ candidates, output the answer on a new line.</p>
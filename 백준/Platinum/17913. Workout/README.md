# [Platinum V] Workout - 17913

[문제 링크](https://www.acmicpc.net/problem/17913)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 9, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

수학

### 문제 설명

<p>Anton is so strong! All the programmers are in awe of his great biceps, wishing they could be just like him. The secret, he says, is to do a workout every single day, doing only bench press. However, you can not just go to the gym and hope for the best. No, to get biceps the size of watermelons (just like Anton) you need to know what particular weight you should work out with during each day.</p>

<p>Anton claims to use the following schedule. On his first day of training, Anton attempted to bench press $X$ micrograms. On each subsequent day, he used the following scheme. Assume that he on a particular day is due to lift $Y$ micrograms. If he succeeds, he will attempt to lift $Y + 25$ micrograms the next day. If he fails, he will instead reduce his attempted weight by $10\%$. The resulting weight will be rounded down to the nearest multiple of $25$ micrograms (the gym only provides weights that are multiples of $25$ micrograms). Note that it is possible for this new weight to be $0$.</p>

<p>You are a bit unsure if this is the scheme he is actually using. Maybe it is just a scam meant to waste the time of his lesser muscled ``friends&#39;&#39;. As it happens, you know that Anton claims to have started bench pressing $K$ days ago, first attempting the weight $X$ micrograms. Today, he claims his schedule tells him to attempt lifting $Z$ micrograms. Your task is to determine if this could really be the case.</p>

### 입력

<p>The first and only line of input consists of three integers, separated by spaces:</p>

<ul>
	<li>the weight Anton claimed to have started with, $X$ ($25 \le X$) micrograms,</li>
	<li>the weight Anton claims he should lift today, $Z$ ($25 \le Z$) micrograms, and</li>
	<li>the number of days Anton has already worked out, $K$ ($1 \le K$).</li>
</ul>

<p>Both $X$ and $Z$ are divisble by $25$.</p>

### 출력

<p>Output a single word: either <code>liar</code> if Anton could not possibly attempt the given weight today if he has followed his schedule, or <code>biceps</code>&nbsp;if his claims are consistent.</p>

### 제한

<ul>
	<li>$X, Z \le 10^{18}$</li>
	<li>$K \le 10^{18}$</li>
</ul>
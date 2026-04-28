# [Platinum V] Troublesome Tools - 11150

[문제 링크](https://www.acmicpc.net/problem/11150)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 13, 정답: 6, 맞힌 사람: 4, 정답 비율: 36.364%

### 분류

비트마스킹, 조합론, 수학

### 문제 설명

<p>The gentleman Inco Gnito is attempting to infiltrate the Entership Starprise, and has been tasked with assisting the chief engineer Forgie with repairs. Forgie has brought with him some tools, and will repeatedly ask Inco for a subset of these. Only when Inco has placed exactly the correct tools in front of Forgie will he take them, utilise them and return them to Inco. This process will repeat itself until the repairs are complete. This sounds simple enough, but the problem is that Inco has no idea what any of the tools are called! Luckily Inco is a quick study, and he is thus able to use all the information of his previous errors and successes when trying to find a new subset of tools. On the other hand, if he is very unlucky, he could be stuck with Forgie for a very very long time, and possibly be revealed as a spy.</p>

<p>Calculate how many different subsets of tools Inco will have to offer Forgie in total, assuming he has the least possible amount of luck during this assignment.</p>

### 입력

<p>The first line of the input consists of a single integer T, the number of test cases. Each test case begins with a line containing two integers N, the number of tools, and K, the number of different subsets Forgie will ask for. The next line contains N space-separated tool names consisting of up to 25 lowercase letters &rsquo;a&rsquo;-&rsquo;z&rsquo; and &rsquo;-&rsquo;. Then follow K lines containing an integer M and then the names of M different tools as above. Tool names are unique within a test case, and the tools for different test cases are not related.</p>

<ul>
	<li>0 &lt; T &le; 100</li>
	<li>0 &lt; N &le; 1000</li>
	<li>0 &lt; K &le; 100</li>
	<li>0 &lt; M &le; N</li>
</ul>

### 출력

<p>For each test case, output the maximal number of subsets Inco might have to offer Forgie, assuming he learns all he can during the assignment. The answer can be a very large number, so output the result modulo 2<sup>31</sup> &minus; 1.</p>
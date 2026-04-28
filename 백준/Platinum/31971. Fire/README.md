# [Platinum I] Fire - 31971

[문제 링크](https://www.acmicpc.net/problem/31971)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 30, 맞힌 사람: 23, 정답 비율: 46.000%

### 분류

자료 구조, 그리디 알고리즘, 값 / 좌표 압축, 희소 배열

### 문제 설명

<p>In the old Baltic religion, it is important to have a holy fire burning. A priest called <em>krivis</em> is responsible for protecting it from extinguishing. He has many trustworthy helpers called <em>vaidilutė</em>s, and wants to create a schedule for them to stoke and protect the fire. He has to ensure that the fire is always maintained by some <em>vaidilutė</em>.</p>

<p><em>Krivis</em> has his own time measurement system, where each day has $M$ minutes. There are $N$ <em>vaidilutė</em>s in his village. The $i$-th <em>vaidilutė</em>&#39;s possible work time are described by two integers $s_i$ and $e_i$. The number $s_i$ is her own earliest time in the day when she may start working, and the number $e_i$ is the latest time of the day when she needs to finish working. Time is counted in minutes from the start of the day. Note that when $s_i &gt; e_i$, the <em>vaidilutė</em> is willing to work overnight.</p>

<p><em>Krivis</em> asked you to choose some <em>vaidilutė</em>s and arrange shifts for them. A chosen <em>vaidilutė</em> must start her shift not earlier than time $s_i$, and end her shift not later than $e_i$. A single shift is always shorter than the whole day. The chosen <em>vaidilutė</em>s will repeat their shifts everyday.</p>

<p>Handing things over from one <em>vaidilutė</em> to the next increases the risk of the fire extinguishing. Because of this, you want to minimize the number of times this happens during the day and will arrange a schedule where the smallest possible number of <em>vaidilutė</em>s is needed.</p>

<p>Calculate the minimum number of <em>vaidilutė</em>s that you need to choose, such that the holy fire is maintained at all times.</p>

### 입력

<p>The first line contains two integers $N$ and $M$ &ndash; the number of <em>vaidilutė</em>s available and the length of the day in minutes.</p>

<p>Then $N$ lines follow. The $i$-th of them contains two integers $s_i$ and $e_i$ &ndash; the earliest starting time and the latest finishing time of the $i$-th <em>vaidilutė</em>.</p>

### 출력

<p>Output one integer &ndash; the minimum number of <em>vaidilutė</em>s you need to choose. If it is impossible to choose the <em>vaidilutė</em>s according to the requirements, output $-1$.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 2 \cdot 10^5$</li>
	<li>$2 &le; M &le; 10^9$</li>
	<li>$0 &le; s_i , e_i &lt; M$ (for all $1 &le; i &le; N$)</li>
	<li>$s_i \ne e_i$ (for all $1 &le; i &le; N$)</li>
</ul>
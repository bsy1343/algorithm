# [Silver III] Pyramids - 32262

[문제 링크](https://www.acmicpc.net/problem/32262)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 78, 정답: 31, 맞힌 사람: 24, 정답 비율: 47.059%

### 분류

누적 합

### 문제 설명

<p>Everyone knows that Pharaoh Khufu was a great ruler, but many are unaware that he was also a fashion enthusiast. Back in the day, he had $N$ pyramids numbered from $0$ to $N - 1$, with pyramid $i$ ($0 &le; i &lt; N$) consisting of $A[i]$ stones. He also had the latest catalogue of the most fashionable pyramids of the year. The catalogue consists of $N$ pyramids numbered from $0$ to $N - 1$, with pyramid $i$ ($0 &le; i &lt; N$) consisting of $B[i]$ stones.</p>

<p>For any $x$ and $y$, such that $0 &le; x &le; y &lt; N$, we define a <strong>range of pyramids</strong> $A[x..y]$ to be a sequence $A[x], A[x + 1], \dots , A[y]$. We also define a range of pyramids $B[x..y]$ analogously.</p>

<p>Every day, Khufu would browse the catalogue and choose two ranges of pyramids $A[L..R]$ and $B[X..Y ]$ where $R - L = Y - X$ (the values of $L$, $R$, $X$ and $Y$ may be different every day). After that, he would like to know whether it&#39;s possible to <strong>transform</strong> his range $A[L..R]$ to become equal to the catalogue&#39;s range $B[X..Y ]$. Transforming a range consists of performing the following step an arbitrary number of times: take one stone from a pyramid within the range and move it to an adjacent pyramid within the range.</p>

<p>Your task is to answer multiple questions of the following form. Given four integers $L$, $R$, $X$, and $Y$, determine whether it is possible to transform $A[L..R]$ into $B[X..Y ]$. Note that the number of stones in each pyramid never actually changes, Khufu only wonders if one range could be transformed into the other one.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$1 &le; N &le; 100\, 000$</li>
	<li>$1 &le; Q &le; 100\, 000$</li>
	<li>$1 &le; A[i] &le; 10^9$</li>
	<li>$1 &le; B[i] &le; 10^9$</li>
</ul>

<p>In each call to <code>can_transform</code>:</p>

<ul>
	<li>$0 &le; L &le; R &lt; N$</li>
	<li>$0 &le; X &le; Y &lt; N$</li>
	<li>$R - L = Y - X$</li>
</ul>
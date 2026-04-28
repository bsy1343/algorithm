# [Gold III] Euclidean TSP - 10522

[문제 링크](https://www.acmicpc.net/problem/10522)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 98, 정답: 78, 맞힌 사람: 71, 정답 비율: 78.889%

### 분류

삼분 탐색

### 문제 설명

<p>The famous Arora-Mitchell approximation algorithm for the Euclidean Travelling Salesman Problem (Euclidean TSP) was discovered independently by Sanjeev Arora and Joseph S. B. Mitchell in 1998. It can approximate the value of an optimal TSP tour in \(d\) dimensions within a factor of \(1 + 1/c\) in running time</p>

<p>\[n\left( \log { n } &nbsp;\right) ^{ O\left( \left( c \sqrt{d} \right)^{d-1} &nbsp;\right) &nbsp;}\]</p>

<p>where \(n\) is the number of nodes in the tour.</p>

<p>Miroslava works for a computer security company and it is time to renew a shared cryptographic key in many data centres across Europe. To do this, Miroslava is going to rent a private jet and deliver the key to employees waiting at all major European airports. She wants to be back as soon as possible.</p>

<p>Miroslava&rsquo;s company has a computer that is able to execute \(p\) billions of operations per second. Since we can approximate Europe by a two-dimensional plane, we assume that the Arora-Mitchell algorithm runs for exactly</p>

<p>\[\frac{n\left( \log_{2}{n} \right)^{c \sqrt{2}} }{ p \cdot 10^9}\]</p>

<p>seconds on this computer to produce the exact \((1 + 1/c)\)-approximation of the optimal tour.</p>

<p>Miroslava noticed that \(c\) is a parameter of the algorithm that can be used to her advantage, but one also needs to be very careful when choosing the right value. If she sets \(c\) too low, the algorithm will finish very fast but the time she spends flying around Europe will be too long. On the other hand, setting it too high will force her to wait for an answer from the computer, while she could be flying instead.</p>

<p>Miroslava used to work in a different company and from there she knows that the optimal tour of all major European airports is \(s\) meters long, but she wasn&rsquo;t ranked high enough in the company to know the actual tour. Given the speed \(v\) of the private jet in meters per second, Miroslava needs \(s(1 + 1/c)/v\) seconds to complete the tour produced by the algorithm run with parameter \(c\). For the sake of simplicity, we assume that Miroslava can land, leave a copy of the private key and take off from each airport in an instant.</p>

<p>How long does it take Miroslava to first run the algorithm and then distribute all the keys, assuming that she chooses the optimal parameter \(c\)?</p>

### 입력

<p>The input consists of one line with four numbers:</p>

<ul>
	<li>an integer \(n\) (4 &le; \(n\) &le; 1 000 000), the number of airports;</li>
	<li>a real number \(p\) (0.001 &le; \(p\) &le; 5 000), the number of billions of operations the computer can execute per second;</li>
	<li>a real number \(s\) (10<sup>6</sup> &le; \(s\) &le; 10<sup>9</sup>), the length of the optimal tour of all European airports in meters;</li>
	<li>a real number \(v\) (50 &le; \(v\) &le; 900), the speed of the private jet in meters per second.</li>
</ul>

<p>All real numbers will have at most 10 digits after the decimal point.</p>

### 출력

<p>Output one line with the shortest possible time t in seconds to distribute the keys and the value of the parameter c Miroslava should use to achieve time t. Your answer should have an absolute or relative error of at most 10<sup>&minus;6</sup>.</p>
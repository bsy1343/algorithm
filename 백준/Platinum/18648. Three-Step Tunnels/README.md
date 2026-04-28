# [Platinum I] Three-Step Tunnels - 18648

[문제 링크](https://www.acmicpc.net/problem/18648)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 38, 정답: 13, 맞힌 사람: 12, 정답 비율: 35.294%

### 분류

해 구성하기, 분할 정복, 제곱근 분할법

### 문제 설명

<p>A far away city has n buildings located along a straight line going from left to right. Given the straight line shape of the city, the traffic is always a nightmare.</p>

<p>A company has decided to connect the buildings with bidirectional underground tunnels in order to provide an alternative form of transportation. Each tunnel will connect two buildings. In order to make the navigation easy, the company has decided that for any two different buildings a and b, it must be possible to get from a to b using only the tunnels:</p>

<ul>
	<li>always going in the same direction (in other words, always going from left to right if b is to the right of a, and always going from right to left if b is to the left of a); and</li>
	<li>using at most 3 tunnels.</li>
</ul>

<p>You need to design a set of tunnels that will satisfy the above requirements, and which has at most 5 &middot; n tunnels. Note that you don&rsquo;t need to find the smallest possible set of tunnels.</p>

### 입력

<p>The only line of the input contains a single integer n, 2 &le; n &le; 500.</p>

### 출력

<p>On the first line of output, print the number m of the tunnels you propose to build. On each of the next m lines print two distinct integers &mdash; the numbers of the buildings connected by the corresponding tunnels. The buildings are numbered from 1 to n from left to right.</p>

<p>m must be less than or equal to 5 &middot; n. You can print the tunnels in any order. All tunnels must be distinct (for example, it&rsquo;s not allowed to include both &ldquo;1 2&rdquo; and &ldquo;2 1&rdquo;).</p>
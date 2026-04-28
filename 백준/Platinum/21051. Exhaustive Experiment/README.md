# [Platinum II] Exhaustive Experiment - 21051

[문제 링크](https://www.acmicpc.net/problem/21051)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 40, 정답: 17, 맞힌 사람: 16, 정답 비율: 61.538%

### 분류

자료 구조, 그리디 알고리즘, 집합과 맵, 스위핑, 트리를 사용한 집합과 맵

### 문제 설명

<p>You have been assigned to a new top-secret program involving a strange vacuum system. The physicists working on the system have been trying to find out where it is leaking but now they are confused by all the measurement results and want your help to figure out what is going on.</p>

<p>The vacuum system contains a wall with possibly leaking components. The physicists have performed vacuum leak tests on some of these components by flushing them with helium gas and then noting down whether their mass spectrometer detected any spike in helium in the vacuum system directly following this release of gas. If the component has even the tiniest leak they will detect it this way but there are some complications as well. The helium will rise up and spread out from where they released it and if it passes by any other leaking component, that will also trigger a positive reading. For each unit distance the helium has risen it will also have expanded by one unit. Thus the leak test will produce a positive result if the tested component is leaking or if there is a leaking component above it for which the $x$ coordinates differs by at most half of the difference in the $y$ coordinate. &nbsp;See Figure 1&nbsp;for an example.</p>

<p>You start out with a positive mindset thinking that there are probably just a few leaking components responsible for all the positive measurements. To determine if this is indeed possible you set out to determine the minimum number of leaking components that could give rise to the observed leak test results.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/692eab2b-fe2c-4e89-bcbb-785519423169/-/preview/" style="width: 295px; height: 295px;" /></p>

<p style="text-align: center;">Figure 1:&nbsp;Illustration of Sample Input 1. Circles indicate components and the blue triangle indicates where helium will spread when the first component is tested. This test being positive means that at least one of the the three components covered by the triangle is leaking. The correct answer in this case is 1 since the measurement results can all be explained with only the rightmost component leaking.</p>

### 입력

<p>The first line of input contains an integer $n$ ($1 \le n \le 2 \cdot 10^5$), the number of components involved. The following $n$ lines each contain two integers $x$ and $y$ and a character $c$ ($-10^8 \le x,y \le 10^8$, $c \in \{<code>-, P, N</code>\}$), where $(x, y)$ are the coordinates of a component and $c$ describes a possible leak test result, with the following meanings:</p>

<ul>
	<li>&#39;<code>-</code>&#39; -- No leak test has been performed on this component</li>
	<li>&#39;<code>N</code>&#39; -- Leak test gave negative response on this component</li>
	<li>&#39;<code>P</code>&#39; -- Leak test gave positive response on this component</li>
</ul>

<p>No two components have the same position.</p>

### 출력

<p>Output a single integer, the minimum number of leaking components that could give rise to the observed leak test results. If no set of leaking components could give rise to the observed results, instead output the single word <code>impossible</code>.</p>
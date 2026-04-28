# [Platinum I] Natural Navigation - 25258

[문제 링크](https://www.acmicpc.net/problem/25258)

### 성능 요약

시간 제한: 6 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 48, 정답: 24, 맞힌 사람: 23, 정답 비율: 54.762%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>You want to build an app to help people navigate through a large botanic garden. This is difficult, because there are many winding footpaths and intersections offering many choices, making traditional directions such as &quot;turn right&quot; or &quot;move further north&quot; unsuitable. Instead, the app should rely on the garden&#39;s greatest resource: the numerous exotic plants and their diverse colours. Whenever a user is at an intersection, the app will know where they are and will display one particular colour accordingly. The user will then follow a footpath where this colour is visible. If the colour can be spotted along multiple footpaths originating from the intersection, the user is free to choose any of these footpaths.</p>

<p>You have been given a perfect model of the botanic garden, consisting of $n$ intersections (numbered from $1$ to $n$) and $m$ footpaths going between those. To keep order, each footpath can only be used in the given direction. Currently, the plants are exhibiting $k$ different colours (numbered from $1$ to $k$) and for each footpath, you are given a list of all the colours that are visible along it when viewed from the intersection where it starts. A user is currently at intersection $1$ and wants to navigate to intersection $n$. You can assume that the user will follow the app&#39;s directions perfectly, but whenever faced with multiple options (because the given colour is visible along multiple footpaths), you have to assume they will make the worst possible choice. How long will it take to reach the target when your app gives the best possible instructions?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line containing the number of intersections $n$ ($1 \leq n \leq 5 \cdot 10^5$), the number of footpaths $m$ ($1 \leq m \leq 5 \cdot 10^5$) and the number of distinct colours $k$ ($1 \leq k \leq 1\,000$).</li>
	<li>$m$ pairs of lines describing the directed footpaths, each formatted as follows:
	<ul>
		<li>One line with three integers $u$, $v$ and $t$ ($1 \le u,v \le n, 1 \le t \le 10^6$), meaning that the footpath leads from intersection $u$ to intersection $v$ and it takes $t$ seconds to walk along this footpath.</li>
		<li>One line with an integer $\ell$ ($1 \leq \ell \leq k$), followed by $\ell$ distinct integers $c_1,\dots,c_\ell$ ($1 \le c_i \le k$ for each $i$), listing the colours that appear along this footpath.</li>
	</ul>
	</li>
</ul>

<p>The sum of $\ell$ over all footpaths does not exceed $5 \cdot 10^5$. Note that, as you would imagine in a botanic garden, a footpath can lead back to the intersection it started from and multiple footpaths can exist between a pair of intersections. Moreover, it is not guaranteed that each intersection can be reached via the footpaths.</p>

### 출력

<p>If it is impossible to lead the user to intersection $n$, output <code>impossible</code>. Otherwise output a single integer, the time it will take to reach the target in seconds. We are only considering the time spent walking along the footpaths.</p>
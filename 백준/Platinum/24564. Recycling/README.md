# [Platinum V] Recycling - 24564

[문제 링크](https://www.acmicpc.net/problem/24564)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 170, 정답: 58, 맞힌 사람: 50, 정답 비율: 31.847%

### 분류

자료 구조, 스택

### 문제 설명

<p>Heck S. Quincy (or Hex as his friends call him) is in charge of recycling efforts in the Quad Cities within the greater Tri-state area as well as the Twin Cities in the Lone Star State. &nbsp;One of the programs he oversees is the placement of large recycling bins at various locations in the cities. &nbsp;Transporting these bins is very expensive so he tries to keep them at any given location for as long as possible, emptying them once a week. He&#39;s willing to keep a bin at a given location as long as it is full at the end of each week.</p>

<p>Hex has very reliable estimates of the amount of recyclable materials (in cubic meters) that he can expect each week at each location. &nbsp;Given this information he would like to know when to install the recycling bin of an appropriate size to maximize the amount of material recycled. He will keep the bin at that location up to (but not including) the week when they don&#39;t expect it to be filled to capacity.</p>

<p>For example, suppose Hex has the following estimates for the next seven weeks: $2\ 5\ 7\ 3\ 5\ 10\ 2$. Hex has several options for placing bins, including:</p>

<ul>
	<li>A capacity-$2$ bin from week $1$ until week $7$, recycling $14\textrm{m}^3$</li>
	<li>A capacity-$5$ bin from week $2$ until week $3$, recycling $10\textrm{m}^3$</li>
	<li>A capacity-$3$ bin from week $2$ until week $6$, recycling $15\textrm{m}^3$ (this is the maximum possible)</li>
</ul>

<p>Hex would not place a capacity-$5$ bin from week $2$ until week $6$, since it would not be filled in week $4$.</p>

### 입력

<p>Input starts with a line containing a single positive integer $n$ ($n \leq 100\,000$) indicating the number of weeks which Hex has estimates for. Weeks are numbered $1$ to $n$. &nbsp;Following this are $n$ non-negative integers listing, in order, the amount of recycling expected for each of the $n$ weeks. These values may be over multiple lines.</p>

### 출력

<p>Output three integers $s$ $e$ $r$ where $s$ and $e$ are the start and end weeks for when to place the bin to maximize the total recycling and $r$ is that maximum amount. If there are two or more time periods that lead to the same maximum amount, output the one with the smallest $s$ value.</p>

### 힌트

<p><strong>Ambiguous Test Case</strong></p>

<p>The one ambiguous test case is here. It is not included in the zip file. The two possible answers are:</p>

<ul>
	<li>1 50000 2500050000</li>
	<li>1 50001 2500050000</li>
</ul>

<ul>
	<li><a href="https://upload.acmicpc.net/d94c40e0-e513-4ab9-b6d3-24f071e6686d/">Input</a></li>
	<li><a href="https://upload.acmicpc.net/4f861584-afe5-4118-b9fb-956830031b9c/">Judges&#39; answer</a></li>
</ul>
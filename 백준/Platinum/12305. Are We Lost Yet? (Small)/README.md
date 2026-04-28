# [Platinum III] Are We Lost Yet? (Small) - 12305

[문제 링크](https://www.acmicpc.net/problem/12305)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

(분류 없음)

### 문제 설명

<p>It is time for the Google Code Jam Finals, and we all want to be there! Unfortunately, a few of us accidentally ended up going to Mountain View instead of the correct location: London, England. But don&#39;t worry - we can take the free Google shuttle service from Mountain View to London!</p>

<p>The shuttle service consists of&nbsp;<strong>M</strong>&nbsp;one-way routes connecting pairs of cities. For every route, you know from which city and to which city it&#39;s going, but unfortunately you do not know exactly how long these routes are. Instead, for every route, you only know that its length can be any integer value from&nbsp;<strong>a</strong><strong><sub>i</sub></strong>&nbsp;to&nbsp;<strong>b</strong><strong><sub>i</sub></strong>, inclusive.</p>

<p>I have taken Google shuttles many times before, so I have suggested a path of routes from Mountain View to London. But you worry that my path-finding skills are not as good as yours, and you want to check my work.</p>

<p>Given the path I am suggesting, could it possibly be a shortest path from Mountain View to London? If not, what is the ID of the first shuttle route on my path that is definitely not part of a shortest path (assuming that all previous shuttle routes have been taken according to the path I suggested)?</p>

<p>For example, suppose we have the following list of shuttle routes:</p>

<p>ID&nbsp;&nbsp;| Start City &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;|&nbsp; Destination City &nbsp; &nbsp; &nbsp; |&nbsp; Shuttle Length</p>

<p>---+----------------+--------------------+----------------</p>

<p>1 &nbsp; &nbsp; | Mountain View&nbsp; |&nbsp; London &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;|&nbsp; [100, 1000]</p>

<p>2 &nbsp; &nbsp;| Mountain View&nbsp; |&nbsp; Paris &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|&nbsp; [500, 5000]</p>

<p>3 &nbsp; &nbsp;| Paris &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; |&nbsp; London &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; |&nbsp; [400, 600]</p>

<p>4 &nbsp;&nbsp;&nbsp;| Paris &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; |&nbsp; Moscow &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;|&nbsp; [500, 5000]</p>

<p>5 &nbsp;&nbsp;&nbsp;| Moscow &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; &nbsp;|&nbsp; London &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; |&nbsp; [1, 10000]</p>

<p>I suggest the path Mountain View -&gt; Paris -&gt; Moscow -&gt; London. The true shortest path might either be the direct route from Mountain View to London, or the path Mountain View -&gt; Paris -&gt; London. This means that the second route on my path (Paris -&gt; Moscow) was the first one that is definitely not part of a shortest path.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test begins with a line containing three positive integers <strong>N</strong>, <strong>M</strong>, and <strong>P</strong>. <strong>N</strong> represents the total number of cities (cities are numbered from 1 to <strong>N</strong>), <strong>M</strong> represents the total number of shuttle routes, and <strong>P</strong> represents the number of shuttle routes on my path from Mountain View (city #1) to London (city #2).</p>

<p>This is followed by <strong>M</strong> lines, each consisting of four integers, <strong>u</strong><strong><sub>i</sub></strong>, <strong>v</strong><strong><sub>i</sub></strong>, <strong>a</strong><strong><sub>i</sub></strong>, <strong>b</strong><strong><sub>i</sub></strong>. Each line represents the fact that there is a one-way shuttle route from city <strong>u</strong><strong><sub>i</sub></strong> to city <strong>v</strong><strong><sub>i</sub></strong>, and you know that its length can be any integer value from <strong>a</strong><strong><sub>i</sub></strong> to <strong>b</strong><strong><sub>i</sub></strong>, inclusive. The routes are given IDs from 1 to <strong>M</strong> in the same order of the input.</p>

<p>This is followed by a line consisting of <strong>P</strong> unique integers in the range from 1 to <strong>M</strong>. These represent, in order, the shuttle routes I am taking you on. Each one is an ID of a route from the previous list.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 10.</li>
	<li>1 &le; <strong>u</strong><strong><sub>i</sub></strong>, <strong>v</strong><strong><sub>i</sub></strong> &le; N.</li>
	<li>1 &le; <strong>a</strong><strong><sub>i</sub></strong> &le; <strong>b</strong><strong><sub>i</sub></strong> &le; 1000000.</li>
	<li>My path is guaranteed to be a valid path from Mountain View (city #1) to London (city #2).</li>
	<li>There might be more than one shuttle route between the same two cities, and there might be a shuttle route going from a city to itself. Also the suggested path might visit the same city more than once, but it will not use the same shuttle route more than once.</li>
	<li>2 &le; <strong>N</strong> &le; 20.</li>
	<li>1 &le; <strong>M</strong> &le; 20.</li>
	<li>1 &le; <strong>P</strong> &le; 10</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: n&quot;, where x is the case number (starting from 1) and n is the ID of the first shuttle route in my path that could not possibly be part of the shortest path from Mountain View to London. If there is no such route, print &quot;Looks Good To Me&quot; instead.</p>
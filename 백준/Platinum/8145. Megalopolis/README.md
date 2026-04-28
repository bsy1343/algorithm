# [Platinum II] Megalopolis - 8145

[문제 링크](https://www.acmicpc.net/problem/8145)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 357, 정답: 151, 맞힌 사람: 115, 정답 비율: 39.792%

### 분류

자료 구조, 트리, 세그먼트 트리, 오일러 경로 테크닉, Heavy-light 분할

### 문제 설명

<p>Byteotia has been eventually touched by globalisation, and so has Byteasar the Postman, who once roamed the country lanes amidst sleepy hamlets and who now dashes down the motorways. But it is those strolls in the days of yore that he reminisces about with a touch of tenderness.</p>

<p>In the olden days n Byteotian villages (numbered from 1 to n) were connected by bidirectional dirt roads in such a way, that one could reach the village number 1 (called Bitburg) from any other village in exactly one way. This unique route passed only through villages with number less or equal to that of the starting village. Furthermore, each road connected exactly two distinct villages without passing through any other village. The roads did not intersect outside the villages, but tunnels and viaducts were not unheard of.</p>

<p>Time passing by, successive roads were being transformed into motorways. Byteasar remembers distinctly, when each of the country roads so disappeared. Nowadays, there is not a single country lane left in Byteotia - all of them have been replaced with motorways, which connect the villages into Byteotian Megalopolis.</p>

<p>Byteasar recalls his trips with post to those villages. Each time he was beginning his journey with letters to some distinct village in Bitburg. He asks you to calculate, for each such journey (which took place in a specific moment of time and led from Bitburg to a specified village), how many country roads it led through.</p>

<p>
Write a programme which:</p>

<ul>
	<li>reads from the standard input:
	<ul>
		<li>descriptions of roads that once connected Byteotian villages,</li>
		<li>sequence of events: Byteasar&#39;s trips and the moments when respective roads were transformed into motorways,</li>
	</ul>
	</li>
	<li>for each trip, calculates how many country roads Byteasar has had to walk,</li>
	<li>writes the outcome to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is a single integer n (1 &le; n &le; 250,000), denoting the number of villages in Byteotia. The following n-1 lines contain descriptions of the roads, in the form of two integers a, b (1 &le; a &lt; b &le; n) separated by a single space, denoting the numbers of villages connected with a road. In the next line there is a single integer m (1 &le; m &le; 250,000), denoting the number of trips Byteasar has made. The following n+m-1 lines contain descriptions of the events, in chronological order:</p>

<ul>
	<li>A description of the form &quot;A a b&rdquo; (for a &lt; b) denotes a country road between villages a and b being transformed into a motorway in that particular moment.</li>
	<li>A description of the from &quot;W a&rdquo; denotes Byteasar&#39;s trip from Bitburg to village a.</li>
</ul>

### 출력

<p>Your programme should write out exactly m integers to the standard output, one a line, denoting the number of country roads Byteasar has travelled during his successive trips.</p>

<p>&nbsp;</p>

### 힌트

<p>For the sample input</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8145.%E2%80%85Megalopolis/c1cfd96c.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8145.%E2%80%85Megalopolis/c1cfd96c.gif" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/8145/1%5B.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:163px; width:112px" /></p>
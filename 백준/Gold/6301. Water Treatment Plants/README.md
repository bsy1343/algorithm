# [Gold V] Water Treatment Plants - 6301

[문제 링크](https://www.acmicpc.net/problem/6301)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 14, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>River polution control is a major challenge that authorities face in order to ensure future clean water supply. Sewage treatment plants are used to clean-up the dirty water comming from cities before being discharged into the river.</p>

<p>As part of a coordinated plan, a pipeline is setup in order to connect cities to the sewage treatment plants distributed along the river. It is more efficient to have treatment plants running at maximum capacity and less-used ones switched off for a period. So, each city has its own treatment plant by the river and also a pipe to its neighbouring city upstream and a pipe to the next city downstream along the riverside. At each city&#39;s treatment plant there are three choices:</p>

<ul>
	<li><strong>either</strong> process any water it may receive from one neighbouring city, together with its own dirty water, discharging the cleaned-up water into the river;</li>
	<li><strong>or</strong> send its own dirty water, plus any from its downstream neighbour, along to the upstream neighbouring city&#39;s treatment plant (provided that city is not already using the pipe to send it&#39;s dirty water downstream);</li>
	<li><strong>or</strong> send its own dirty water, plus any from the upstream neighbour, to the downstream neighbouring city&#39;s plant, if the pipe is not being used.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6301.%E2%80%85Water%E2%80%85Treatment%E2%80%85Plants/ccb334f7.jpg" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6301/cities.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:128px; width:241px" /></p>

<p>The choices above ensure that:</p>

<ul>
	<li>every city must have its water treated somewhere and</li>
	<li>at least one city must discharge the cleaned water into the river.</li>
</ul>

<p>Let&#39;s represent a city discharging water into the river as &quot;V&quot; (a downwards flow), passing water onto its neighbours as &quot;&gt;&quot; (to the next city on its right) or else &quot;&lt;&quot; (to the left). When we have several cities along the river bank, we assign a symbol to each (V, &lt; or &gt;) and list the cities symbols in order. For example, two cities, A and B, can</p>

<ul>
	<li>each treat their own sewage and each discharges clean water into the river. So A&#39;s action is denoted V as is B&#39;s and we write &quot;VV&quot; ;</li>
	<li>or else city A can send its sewage along the pipe (to the right) to B for treatment and discharge, denoted &quot;&gt;V&quot;;</li>
	<li>or else city B can send its sewage to (the left to) A, which treats it with its own dirty water and discharges (V) the cleaned water into the river. So A discharges (V) and B passes water to the left (&lt;), and we denote this situation as &quot;V&lt;&quot;.</li>
</ul>

<p>We could not have &quot;&gt;&lt;&quot; since this means A sends its water to B and B sends its own to A, so both are using the same pipe and this is not allowed. Similarly &quot;&laquo;&quot; is not possible since A&#39;s &quot;&lt;&quot; means it sends its water to a non-existent city on its left.</p>

<p>So we have just 3 possible set-ups that fit the conditions:</p>

<pre>
         A    B       A &gt; B       A &lt; B 
         V    V           V       V             
  RIVER~ ~ ~ ~ ~     ~ ~ ~ ~ ~   ~ ~ ~ ~ ~RIVER
          &quot;VV&quot;        &quot;&gt;V&quot;         &quot;V&lt;&quot;
</pre>

<p>If we now consider <strong>three</strong> cities, we can determine <strong>8</strong> possible set-ups.</p>

<p>Your task is to produce a program that given the number of cities NC (or treatment plants) in the river bank, determines the number of possible set-ups, NS, that can be made according to the rules define above.</p>

<p>You need to be careful with your design as the number of cities can be as large as 100.</p>

### 입력

<p>The input consists of a sequence of values, one per line, where each value represents the number of cities.</p>

### 출력

<p>Your output should be a sequence of values, one per line, where each value represents the number of possible set-ups for the corresponding number of cities read in the same input line.</p>
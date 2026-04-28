# [Gold V] Relative Relatives - 4556

[문제 링크](https://www.acmicpc.net/problem/4556)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 54, 정답: 42, 맞힌 사람: 25, 정답 비율: 67.568%

### 분류

너비 우선 탐색, 자료 구조, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 해시를 사용한 집합과 맵, 정렬, 집합과 맵

### 문제 설명

<p>Today is Ted&#39;s 100th birthday. A few weeks ago, you were selected by the family to contact all of Ted&#39;s descendants and organize a surprise party. To make this task easier, you created an age-prioritized list of everyone descended from Ted. Descendants of the same age are listed in dictionary order.</p>

<p>The only materials you had to aid you were birth certificates. Oddly enough, these birth certificates were not dated. They simply listed the father&#39;s name, the child&#39;s name, and the father&#39;s exact age when the baby was born.</p>

### 입력

<p>Input to this problem will begin with line containing a single integer&nbsp;<i>n</i>&nbsp;indicating the number of data sets. Each data set will be formatted according to the following description.</p>

<p>A single data set has 2 components:</p>

<ol>
	<li><i>Descendant Count</i>&nbsp;- A line containing a single integer&nbsp;<i>X</i>&nbsp;(where 0 &lt;&nbsp;<i>X</i>&nbsp;&lt; 100) indicating the number of Ted&#39;s descendants.</li>
	<li><i>Birth Certificate List</i>&nbsp;- Data for&nbsp;<i>X</i>&nbsp;birth certificates, with one certificate&#39;s data per line. Each certificate&#39;s data will be of the format &quot;<tt>FNAME CNAME FAGE</tt>&quot; where:
	<ul>
		<li><i>FNAME</i>&nbsp;is the father&#39;s name.</li>
		<li><i>CNAME</i>&nbsp;is the child&#39;s name.</li>
		<li><i>FAGE</i>&nbsp;is the integer age of the father on the date of&nbsp;<i>CNAME</i>s birth.</li>
	</ul>
	</li>
</ol>

<p>Note:</p>

<ul>
	<li>Names are unique identifiers of individuals and contain no embedded white space.</li>
	<li>All of Ted&#39;s descendants share Ted&#39;s birthday. Therefore, the age difference between any two is an integer number of years. (For those of you that are really picky, assume they were all born at the exact same hour, minute, second, etc... of their birth year.)</li>
	<li>You have a birth certificate for all of Ted&#39;s descendants (a complete collection).</li>
</ul>

### 출력

<p>For each data set, there will be&nbsp;<i>X</i>+1 lines of output. The first will read, &quot;<i><tt>DATASET Y</tt></i>&quot;, where&nbsp;<i>Y</i>&nbsp;is 1 for the first data set, 2 for the second, etc. The subsequent&nbsp;<i>X</i>&nbsp;lines constitute your age-prioritized list of Ted&#39;s descendants along with their ages using the format &quot;<i><tt>NAME AGE</tt></i>&quot;. Descendants of the same age will be listed in dictionary order.</p>
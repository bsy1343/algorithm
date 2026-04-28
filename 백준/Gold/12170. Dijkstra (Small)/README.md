# [Gold III] Dijkstra (Small) - 12170

[문제 링크](https://www.acmicpc.net/problem/12170)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 89, 정답: 51, 맞힌 사람: 44, 정답 비율: 73.333%

### 분류

수학, 그리디 알고리즘

### 문제 설명

<p>The Dutch computer scientist Edsger Dijkstra made many important contributions to the field, including the shortest path finding algorithm that bears his name. This problem is not about that algorithm.<br />
<br />
You were marked down one point on an algorithms exam for misspelling &quot;Dijkstra&quot; -- between&nbsp;<code>D</code>&nbsp;and&nbsp;<code>stra</code>, you wrote some number of characters, each of which was either&nbsp;<code>i</code>,&nbsp;<code>j</code>, or&nbsp;<code>k</code>. You are prepared to argue to get your point back using&nbsp;<em>quaternions</em>, an actual number system (extended from complex numbers) with the following multiplicative structure:<br />
<br />
<img src="%EB%B0%B1%EC%A4%80/Gold/12170.%E2%80%85Dijkstra%E2%80%85(Small)/733d3476.jpeg" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12170/images-3.jpeg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="border:0px; height:174px; vertical-align:middle; width:175px" /><br />
<br />
To multiply one quaternion by another, look at the row for the first quaternion and the column for the second quaternion. For example, to multiply&nbsp;<em>i</em>&nbsp;by&nbsp;<em>j</em>, look in the row for&nbsp;<em>i</em>&nbsp;and the column for&nbsp;<em>j</em>&nbsp;to find that the answer is&nbsp;<em>k</em>. To multiply&nbsp;<em>j</em>&nbsp;by&nbsp;<em>i</em>, look in the row for&nbsp;<em>j</em>&nbsp;and the column for&nbsp;<em>i</em>&nbsp;to find that the answer is&nbsp;<em>-k</em>.<br />
<br />
As you can see from the above examples, the quaternions are not commutative -- that is, there are some&nbsp;<strong>a</strong>&nbsp;and&nbsp;<strong>b</strong>&nbsp;for which&nbsp;<strong>a</strong>&nbsp;*&nbsp;<strong>b</strong>&nbsp;!=&nbsp;<strong>b</strong>&nbsp;*&nbsp;<strong>a</strong>. However they are associative -- for any&nbsp;<strong>a</strong>,&nbsp;<strong>b</strong>, and&nbsp;<strong>c</strong>, it&#39;s true that&nbsp;<strong>a</strong>&nbsp;* (<strong>b</strong>&nbsp;*&nbsp;<strong>c</strong>) = (<strong>a</strong>&nbsp;*&nbsp;<strong>b</strong>) *&nbsp;<strong>c</strong>.<br />
<br />
Negative signs before quaternions work as they normally do -- for any quaternions&nbsp;<strong>a</strong>&nbsp;and&nbsp;<strong>b</strong>, it&#39;s true that&nbsp;<strong>-a</strong>&nbsp;*&nbsp;<strong>-b</strong>&nbsp;=&nbsp;<strong>a</strong>&nbsp;*&nbsp;<strong>b</strong>, and&nbsp;<strong>-a</strong>&nbsp;*&nbsp;<strong>b</strong>&nbsp;=&nbsp;<strong>a</strong>&nbsp;*&nbsp;<strong>-b</strong>&nbsp;=&nbsp;<strong>-(a * b)</strong>.<br />
<br />
You want to argue that your misspelling was equivalent to the correct spelling&nbsp;<code>ijk</code>&nbsp;by showing that you can split your string of&nbsp;<code>i</code>s,&nbsp;<code>j</code>s, and&nbsp;<code>k</code>s in two places, forming three substrings, such that the leftmost substring reduces (under quaternion multiplication) to&nbsp;<em>i</em>, the middle substring reduces to&nbsp;<em>j</em>, and the right substring reduces to&nbsp;<em>k</em>. (For example,&nbsp;<code>jij</code>would be interpreted as&nbsp;<em>j</em>&nbsp;*&nbsp;<em>i</em>&nbsp;*&nbsp;<em>j</em>;&nbsp;<em>j</em>&nbsp;*&nbsp;<em>i</em>&nbsp;is -<em>k</em>, and -<em>k</em>&nbsp;*&nbsp;<em>j</em>&nbsp;is&nbsp;<em>i</em>, so&nbsp;<code>jij</code>&nbsp;reduces to&nbsp;<em>i</em>.) If this is possible, you will get your point back. Can you find a way to do it?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each consists of one line with two space-separated integers&nbsp;<strong>L</strong>&nbsp;and&nbsp;<strong>X</strong>, followed by another line with&nbsp;<strong>L</strong>&nbsp;characters, all of which are&nbsp;<code>i</code>,&nbsp;<code>j</code>, or&nbsp;<code>k</code>. Note that the string never contains negative signs,&nbsp;<code>1</code>s, or any other characters. The string that you are to evaluate is the given string of&nbsp;<strong>L</strong>&nbsp;characters repeated&nbsp;<strong>X</strong>&nbsp;times. For instance, for&nbsp;<strong>L</strong>&nbsp;= 4,&nbsp;<strong>X</strong>&nbsp;= 3, and the given string&nbsp;<code>kiij</code>, your input string would be&nbsp;<code>kiijkiijkiij</code>.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>L</strong>&nbsp;&le; 10000.</li>
	<li>1 &le;&nbsp;<strong>X</strong>&nbsp;&le; 10000.</li>
	<li>1 &le;&nbsp;<strong>L * X</strong>&nbsp;&le; 10000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is either&nbsp;<code>YES</code>&nbsp;or&nbsp;<code>NO</code>, depending on whether the string can be broken into three parts that reduce to&nbsp;<em>i</em>,&nbsp;<em>j</em>, and&nbsp;<em>k</em>, in that order, as described above.</p>

### 힌트

<p>In Case #1, the string is too short to be split into three substrings.<br />
<br />
In Case #2, just split the string into&nbsp;<code>i</code>,&nbsp;<code>j</code>, and&nbsp;<code>k</code>.<br />
<br />
In Case #3, the only way to split the string into three parts is&nbsp;<code>k</code>,&nbsp;<code>j</code>,&nbsp;<code>i</code>, and this does not satisfy the conditions.<br />
<br />
In Case #4, the string is&nbsp;<code>jijijijijiji</code>. It can be split into&nbsp;<code>jij</code>&nbsp;(which reduces to&nbsp;<em>i</em>),&nbsp;<code>iji</code>(which reduces to&nbsp;<em>j</em>), and&nbsp;<code>jijiji</code>&nbsp;(which reduces to&nbsp;<em>k</em>).<br />
<br />
In Case #5, no matter how you choose your substrings, none of them can ever reduce to a&nbsp;<em>j</em>&nbsp;or a&nbsp;<em>k</em>.</p>
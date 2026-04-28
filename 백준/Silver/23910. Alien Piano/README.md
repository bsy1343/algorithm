# [Silver III] Alien Piano - 23910

[문제 링크](https://www.acmicpc.net/problem/23910)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 25, 맞힌 사람: 24, 정답 비율: 72.727%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>An alien has just landed on Earth, and really likes our music. Lucky for us.</p>

<p>The alien would like to bring home its favorite human songs, but it only has a very strange instrument to do it with: a piano with just 4 keys of different pitches.</p>

<p>The alien converts a song by writing it down as a series of keys on the alien piano. Obviously, this piano will not be able to convert our songs completely, as our songs tend to have many more than 4 pitches.</p>

<p>The alien will settle for converting our songs with the following rules instead:</p>

<ul>
	<li>The first note in our song can be converted to any key on the alien piano.</li>
	<li>For every note after,
	<ul>
		<li>if its pitch is higher than the previous note, it should be converted into a higher-pitched key than the previous note&#39;s conversion;</li>
		<li>if lower, it should be converted into a lower-pitched key than the previous note&#39;s conversion;</li>
		<li>if exactly identical, it should be converted into the same key as the previous note&#39;s conversion.</li>
	</ul>
	</li>
</ul>

<p>Note: two notes with the same pitch do not need to be converted into the same key if they are not adjacent.</p>

<p>What the alien wants to know is: how often will it have to break its rules when converting a particular song?</p>

<p>To elaborate, let us describe one of our songs as having&nbsp;<b>K&nbsp;</b>notes. The first note we describe as &quot;note 1&quot;, the second note &quot;note 2&quot;, and the last note &quot;note&nbsp;<b>K</b>.&quot;</p>

<p>So note 2 comes immediately after note 1.</p>

<p>Now if note 2 is lower than note 1 in our version of the song, yet converted to an equally-pitched or lower-pitched key (relative to note 2&#39;s conversion) in the alien&#39;s version of the song, then we consider that a single rule break.</p>

<p>For each test case, return the minimum amount of times the alien must necessarily break one of its rules in converting that song.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow.</p>

<p>Each test case consists of two lines.</p>

<p>The first line consists of a single integer,&nbsp;<b>K</b>.</p>

<p>The second line consists of&nbsp;<b>K</b>&nbsp;space-separated integers,&nbsp;<b>A<sub>1</sub></b>,&nbsp;<b>A<sub>2</sub></b>&nbsp;...&nbsp;<b>A<sub>K</sub></b>, where&nbsp;<b>A<sub>i</sub></b>&nbsp;refers to the pitch of the i-th note for this test case.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the minimum number of times that particular test case will require the alien to break its own rules during the conversion process.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>A<sub>i</sub></b>&nbsp;&le; 10<sup>6</sup>.</li>
</ul>

### 힌트

<p>We will use the notation A, B, C, D for the alien piano keys where A is the lowest note, and D is the highest. In sample case #1, the alien can simply map our song into the following sequence:&nbsp;<code>A B C D C</code>&nbsp;and this correctly reflects all the following:</p>

<ul>
	<li>our first note with pitch 1 maps to A,</li>
	<li>our second note with pitch 5 maps to its key B. 5 &gt; 1, and B is a higher key than A,</li>
	<li>our third note with pitch 100 maps to its key C. 100 &gt; 5, and C is a higher key than B,</li>
	<li>our fourth note with pitch 500 maps to its key D. 500 &gt; 100, and D is a higher key than C,</li>
	<li>our fifth note with pitch 1 maps to its key C. 1 &lt; 500, and C is a lower key than D.</li>
</ul>

<p>So none of the rules are broken. Note:&nbsp;<code>A B C D C</code>&nbsp;is not the only way of conversion.&nbsp;<code>A B C D A</code>&nbsp;or&nbsp;<code>A B C D B</code>&nbsp;are also eligible conversions.</p>

<p>In sample case #2, the only conversion sequence that provides the minimal result of 1 rule broken is:&nbsp;<code>A B C D A B C D</code>. Notably, the rule break comes from the fact that our 4th note with pitch 4 is lower than our 5th note with pitch 5, but A is a lower key than D.</p>
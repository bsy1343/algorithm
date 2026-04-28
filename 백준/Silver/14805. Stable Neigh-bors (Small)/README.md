# [Silver I] Stable Neigh-bors (Small) - 14805

[문제 링크](https://www.acmicpc.net/problem/14805)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 117, 정답: 50, 맞힌 사람: 40, 정답 비율: 45.977%

### 분류

문자열, 해 구성하기

### 문제 설명

<p>You are lucky enough to own&nbsp;<strong>N</strong>&nbsp;pet unicorns. Each of your unicorns has either one or two of the following kinds of hairs in its mane: red hairs, yellow hairs, and blue hairs. The color of a mane depends on exactly which sorts of colored hairs it contains:</p>

<ul>
	<li>A mane with only one color of hair appears to be that color. For example, a mane with only blue hairs is blue.</li>
	<li>A mane with red and yellow hairs appears orange.</li>
	<li>A mane with yellow and blue hairs appears green.</li>
	<li>A mane with red and blue hairs appears violet.</li>
</ul>

<p>You have&nbsp;<strong>R</strong>,&nbsp;<strong>O</strong>,&nbsp;<strong>Y</strong>,&nbsp;<strong>G</strong>,&nbsp;<strong>B</strong>, and&nbsp;<strong>V</strong>&nbsp;unicorns with red, orange, yellow, green, blue, and violet manes, respectively.</p>

<p>You have just built a circular stable with&nbsp;<strong>N</strong>&nbsp;stalls, arranged in a ring such that each stall borders two other stalls. You would like to put exactly one of your unicorns in each of these stalls. However, unicorns need to feel rare and special, so no unicorn can be next to another unicorn that shares at least one of the hair colors in its mane. For example, a unicorn with an orange mane cannot be next to a unicorn with a violet mane, since both of those manes have red hairs. Similarly, a unicorn with a green mane cannot be next to a unicorn with a yellow mane, since both of those have yellow hairs.</p>

<p>Is it possible to place all of your unicorns? If so, provide any one arrangement.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each consists of one line with seven integers:&nbsp;<strong>N</strong>,&nbsp;<strong>R</strong>,&nbsp;<strong>O</strong>,&nbsp;<strong>Y</strong>,&nbsp;<strong>G</strong>,&nbsp;<strong>B</strong>, and&nbsp;<strong>V</strong>.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>3 &le;&nbsp;<strong>N</strong>&nbsp;&le; 1000.</li>
	<li><strong>R</strong>&nbsp;+&nbsp;<strong>O</strong>&nbsp;+&nbsp;<strong>Y</strong>&nbsp;+&nbsp;<strong>G</strong>&nbsp;+&nbsp;<strong>B</strong>&nbsp;+&nbsp;<strong>V</strong>&nbsp;=&nbsp;<strong>N</strong>.</li>
	<li>0 &le; Z for each Z in {<strong>R</strong>,&nbsp;<strong>O</strong>,&nbsp;<strong>Y</strong>,&nbsp;<strong>G</strong>,&nbsp;<strong>B</strong>,&nbsp;<strong>V</strong>}.</li>
	<li><strong>O</strong>&nbsp;=&nbsp;<strong>G</strong>&nbsp;=&nbsp;<strong>V</strong>&nbsp;= 0. (Each unicorn has only one hair color in its mane.)</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is&nbsp;<code>IMPOSSIBLE</code>&nbsp;if it is not possible to place all the unicorns, or a string of&nbsp;<strong>N</strong>&nbsp;characters representing the placements of unicorns in stalls, starting at a point of your choice and reading clockwise around the circle. Use&nbsp;<code>R</code>&nbsp;to represent each unicorn with a red mane,&nbsp;<code>O</code>&nbsp;to represent each unicorn with an orange mane, and so on with&nbsp;<code>Y</code>,&nbsp;<code>G</code>,&nbsp;<code>B</code>, and&nbsp;<code>V</code>. This arrangement must obey the rules described in the statement above.</p>

<p>If multiple arrangements are possible, you may print any of them.</p>

### 힌트

<p>Note that the last two sample cases would not appear in the Small dataset.</p>

<p>For sample case #1, there are many possible answers; for example, another is&nbsp;<code>BYBRYR</code>. Note that&nbsp;<code>BYRYRB</code>&nbsp;would&nbsp;<em>not</em>&nbsp;be a valid answer; remember that the stalls form a ring, and the first touches the last!</p>

<p>In sample case #2, there are only three stalls, and each stall is a neighbor of the other two, so the two unicorns with yellow manes would have to be neighbors, which is not allowed.</p>

<p>For sample case #3, note that arranging the unicorns in the same color pattern as the Google logo (<code>BRYBGR</code>) would not be valid, since a unicorn with a blue mane would be a neighbor of a unicorn with a green mane, and both of those manes share blue hairs.</p>

<p>In sample case #4, no two unicorns with yellow manes can be neighbors, and no two unicorns with violet manes can be neighbors.</p>
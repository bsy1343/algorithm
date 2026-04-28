# [Gold II] Mural - 23987

[문제 링크](https://www.acmicpc.net/problem/23987)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 18, 맞힌 사람: 17, 정답 비율: 94.444%

### 분류

애드 혹

### 문제 설명

<p>Thanh wants to paint a wonderful mural on a wall that is&nbsp;<b>N</b>&nbsp;sections long. Each section of the wall has a&nbsp;<i>beauty score</i>, which indicates how beautiful it will look if it is painted. Unfortunately, the wall is starting to crumble due to a recent flood, so he will need to work fast!</p>

<p>At the beginning of each day, Thanh will paint one of the sections of the wall. On the first day, he is free to paint any section he likes. On each subsequent day, he must paint a new section that is next to a section he has already painted, since he does not want to split up the mural.</p>

<p>At the end of each day, one section of the wall will be destroyed. It is always a section of wall that is adjacent to only one other section and is unpainted (Thanh is using a waterproof paint, so painted sections can&#39;t be destroyed).</p>

<p>The&nbsp;<i>total beauty</i>&nbsp;of Thanh&#39;s mural will be equal to the sum of the beauty scores of the sections he has painted. Thanh would like to guarantee that, no matter how the wall is destroyed, he can still achieve a total beauty of at least B. What&#39;s the maximum value of B for which he can make this guarantee?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case starts with a line containing an integer&nbsp;<b>N</b>. Then, another line follows containing a string of&nbsp;<b>N</b>&nbsp;digits from 0 to 9. The i-th digit represents the beauty score of the i-th section of the wall.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximum beauty score that Thanh can guarantee that he can achieve, as described above.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
</ul>

### 힌트

<p>In the first sample case, Thanh can get a total beauty of 6, no matter how the wall is destroyed. On the first day, he can paint either section of wall with beauty score 3. At the end of the day, either the 1st section or the 4th section will be destroyed, but it does not matter which one. On the second day, he can paint the other section with beauty score 3.</p>

<p>In the second sample case, Thanh can get a total beauty of 14, by painting the leftmost section of wall (with beauty score 9). The only section of wall that can be destroyed is the rightmost one, since the leftmost one is painted. On the second day, he can paint the second leftmost section with beauty score 5. Then the last unpainted section of wall on the right is destroyed. Note that on the second day, Thanh cannot choose to paint the third section of wall (with beauty score 8), since it is not adjacent to any other painted sections.</p>

<p>In the third sample case, Thanh can get a total beauty of 7. He begins by painting the section in the middle (with beauty score 1). Whichever section is destroyed at the end of the day, he can paint the remaining wall at the start of the second day.</p>
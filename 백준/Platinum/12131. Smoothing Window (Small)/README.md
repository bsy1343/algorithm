# [Platinum V] Smoothing Window (Small) - 12131

[문제 링크](https://www.acmicpc.net/problem/12131)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 32, 정답: 11, 맞힌 사람: 10, 정답 비율: 47.619%

### 분류

그리디 알고리즘, 슬라이딩 윈도우

### 문제 설명

<p>Adamma is a climate scientist interested in temperature. Every minute, she records the current temperature as an integer, creating a long list of integers:&nbsp;x<sub>1</sub>, x<sub>2</sub>, ..., x<sub><strong>N</strong></sub>. (Adamma uses her own special temperature scale rather than a familiar one like Celsius or Kelvin, so it&#39;s possible for the values to be large and negative!) She often plots these temperatures on her computer screen.</p>

<p>This morning, she decided to compute a sliding average of this list in order to get a smoother plot. She used a smoothing window of size&nbsp;<strong>K</strong>, which means that she converted the sequence of&nbsp;<strong>N</strong>&nbsp;temperatures into a sequence of&nbsp;(<strong>N</strong>&nbsp;-&nbsp;<strong>K</strong>&nbsp;+ 1)&nbsp;average temperatures:&nbsp;s<sub>1</sub>, s<sub>2</sub>, ..., s<sub><strong>N</strong>-<strong>K</strong>+1</sub>.&nbsp;Each s<sub>i</sub>&nbsp;is the average of the values&nbsp;x<sub>i</sub>, x<sub>i+1</sub>, ..., x<sub>i+<strong>K</strong>-1</sub>.&nbsp;The original x<sub>i</sub>values were all integers, but some of the s<sub>i</sub>&nbsp;may be fractional.</p>

<p>Unfortunately, Adamma forgot to save the original sequence of temperatures! And now she wants to answer a different question -- what was the difference between the largest temperature and the smallest temperature? In other words, she needs to compute&nbsp;max{x<sub>1</sub>, ..., x<sub><strong>N</strong></sub>} - min{x<sub>1</sub>, ..., x<sub><strong>N</strong></sub>}.&nbsp;But she only has&nbsp;<strong>N</strong>,&nbsp;<strong>K</strong>, and the smoothed sequence.</p>

<p>After some thinking, Adamma has realized that this might be impossible because there may be several valid answers. In that case, she wants to know the smallest possible answer among all of the possible original sequences that could have produced her smoothed sequence with the given values of&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>K</strong>.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow; each test case consists of two lines. The first line contains integers&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>K</strong>&nbsp;separated by a space character. The second line contains integer values&nbsp;sum<sub>1</sub>, sum<sub>2</sub>, ..., sum<sub><strong>N</strong>-<strong>K</strong>+1</sub>,&nbsp;separated by space characters. s<sub>i</sub>&nbsp;is given by&nbsp;sum<sub>i</sub>&nbsp;/&nbsp;<strong>K</strong>.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>2 &le;&nbsp;<strong>K</strong>&nbsp;&le;&nbsp;<strong>N</strong>.</li>
	<li>The sum<sub>i</sub>&nbsp;will be integers between -10000 and 10000, inclusive.</li>
	<li>2 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the smallest possible difference between the largest and smallest temperature.</p>

### 힌트

<p>In Case #1, the smoothed sequence is:<br />
<br />
0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5<br />
<br />
The integer sequence that gives the smallest difference is:<br />
<br />
0, 1, 1, 2, 2, 3, 3, 4, 4, 5<br />
<br />
Note that the sequence:<br />
<br />
0.5, 0.5, 1.5, 1.5, 2.5, 2.5, 3.5, 3.5, 4.5, 4.5<br />
<br />
Would give the same smoothed sequence with a maximum difference of 4, but this is not a valid answer because the original temperatures are known to have been integers.<br />
<br />
In Case #2, all we know is that the sum of the 100 original values was -100. It&#39;s possible that all of the original values were exactly -1, in which case the difference between the largest and smallest temperatures would be 0, which is as small as differences get!<br />
<br />
In Case #3, the original sequence could have been:<br />
<br />
-4, 8, -4, 8, -4, 8, -4</p>
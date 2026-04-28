# [Gold V] Dreary Design (Large2) - 12177

[문제 링크](https://www.acmicpc.net/problem/12177)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 110, 정답: 67, 맞힌 사람: 58, 정답 비율: 61.053%

### 분류

수학, 조합론, 포함 배제의 원리

### 문제 설명

<p>One way to represent a color is as a triple of component values (each of which can range from 0 to&nbsp;<strong>K</strong>, inclusive) representing levels of red, green, and blue. For example, in the color system where&nbsp;<strong>K</strong>&nbsp;= 3, (0, 2, 3) and (0, 3, 2) would be two of the possible distinct colors.<br />
<br />
We will consider a color to be&nbsp;<em>bland</em>&nbsp;if and only if all pairs of its component values differ by no more than&nbsp;<strong>V</strong>. For example, in a system with&nbsp;<strong>K</strong>&nbsp;= 2 and&nbsp;<strong>V</strong>&nbsp;= 1, the color (2, 1, 1) is bland, because its red and green components differ by 1, its red and blue components differ by 1, and its green and blue components differ by 0, and none of these differences exceeds 1. But (2, 1, 0) is not bland, because the red and blue components differ by more than 1.<br />
<br />
Mr. Turner loves to create gloomy landscape images and wants to design a color system in which there are many bland colors available. Given values for&nbsp;<strong>K</strong>&nbsp;and&nbsp;<strong>V</strong>, can you tell him how many distinct bland colors are there?</p>

<h3>Solving this problem</h3>

<p>Usually, Google Code Jam problems have 1 Small input and 1 Large input. This problem has 1 Small input and 2 Large inputs. Once you have solved the Small input, you will be able to download any of the two Large inputs. As usual, you will be able to retry the Small input (with a time penalty), while you will get only one chance at each of the Large inputs.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;lines follow. Each contains two space-separated integers&nbsp;<strong>K</strong>&nbsp;and&nbsp;<strong>V</strong>.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li><strong>V</strong>&nbsp;&le;&nbsp;<strong>K</strong>.</li>
	<li>0 &le;&nbsp;<strong>K</strong>&nbsp;&le; 2,000,000,000.</li>
	<li>0 &le;&nbsp;<strong>V</strong>&nbsp;&le; 1,000.</li>
	<li>All answers are guaranteed to fit in a 64-bit signed integer.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the number of distinct bland colors.</p>

### 힌트

<p>In Case #1, there are eight possible colors -- (0, 0, 0), (0, 0, 1), (0, 1, 0), (0, 1, 1), (1, 0, 0), (1, 0, 1), (1, 1, 0), and (1, 1, 1) -- and all of them meet the definition of bland for&nbsp;<strong>V</strong>&nbsp;= 1.<br />
<br />
In Case #2, the same eight colors are possible, but only two of them -- (0, 0, 0) and (1, 1, 1) -- meet the definition of bland for&nbsp;<strong>V</strong>&nbsp;= 0.</p>
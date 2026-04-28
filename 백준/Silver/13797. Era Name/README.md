# [Silver V] Era Name - 13797

[문제 링크](https://www.acmicpc.net/problem/13797)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 62, 정답: 50, 맞힌 사람: 41, 정답 비율: 83.673%

### 분류

수학, 구현

### 문제 설명

<p>As many of you know, we have two major calendar systems used in Japan today. One of them is Gregorian calendar which is widely used across the world. It is also known as &ldquo;Western calendar&rdquo; in Japan.</p>

<p>The other calendar system is era-based calendar, or so-called &ldquo;Japanese calendar.&rdquo; This system comes from ancient Chinese systems. Recently in Japan it has been a common way to associate dates with the Emperors. In the era-based system, we represent a year with an era name given at the time a new Emperor assumes the throne. If the era name is &ldquo;A&rdquo;, the first regnal year will be &ldquo;A 1&rdquo;, the second year will be &ldquo;A 2&rdquo;, and so forth.</p>

<p>Since we have two different calendar systems, it is often needed to convert the date in one calendar system to the other. In this problem, you are asked to write a program that converts western year to era-based year, given a database that contains association between several western years and era-based years.</p>

<p>For the simplicity, you can assume the following:</p>

<ol>
	<li>A new era always begins on January 1st of the corresponding Gregorian year.</li>
	<li>The first year of an era is described as 1.</li>
	<li>There is no year in which more than one era switch takes place.</li>
</ol>

<p>Please note that, however, the database you will see may be incomplete. In other words, some era that existed in the history may be missing from your data. So you will also have to detect the cases where you cannot determine exactly which era the given year belongs to.</p>

### 입력

<p>The input contains multiple test cases. Each test case has the following format:</p>

<pre>
<code>N Q 
EraName<sub>1</sub> EraBasedYear<sub>1</sub> WesternYear<sub>1</sub> 
. 
. 
. 
EraName<sub>N</sub> EraBasedYear<sub>N</sub> WesternYear<sub>N</sub> 
Query<sub>1</sub> 
. 
. 
. 
Query<sub>Q </sub></code></pre>

<p>The first line of the input contains two positive integers N and Q (1 &le; N &le; 1000, 1 &le; Q &le; 1000). N is the number of database entries, and Q is the number of queries.</p>

<p>Each of the following N lines has three components: era name, era-based year number and the corresponding western year (1 &le; EraBasedYear<sub>i </sub>&le; W esternYear<sub>i</sub> &le; 10<sup>9</sup> ). Each of era names consist of at most 16 Roman alphabet characters. Then the last Q lines of the input specifies queries (1 &le; Query<sub>i</sub> &le; 10<sup>9</sup> ), each of which is a western year to compute era-based representation.</p>

<p>The end of input is indicated by a line containing two zeros. This line is not part of any dataset and hence should not be processed.</p>

<p>You can assume that all the western year in the input is positive integers, and that there is no two entries that share the same era name.</p>

### 출력

<p>For each query, output in a line the era name and the era-based year number corresponding to the western year given, separated with a single whitespace. In case you cannot determine the era, output &ldquo;Unknown&rdquo; without quotes.</p>
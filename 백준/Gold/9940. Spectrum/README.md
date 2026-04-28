# [Gold II] Spectrum - 9940

[문제 링크](https://www.acmicpc.net/problem/9940)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 11, 맞힌 사람: 9, 정답 비율: 30.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>Swamp County Consulting has just been awarded a contract from a mysterious government agency to build a database to investigate connections between what they call &ldquo;targets.&rdquo; Your team has been sub-contracted to implement a system that stores target information and processes the commands listed below.</p>

<p>A target is represented by a string of up to 32 printing characters with no embedded spaces. A connection is a bi-directional relationship between two targets.</p>

<p>The hop count between a given target (called &ldquo;target1&rdquo;) and other targets is determined by the following rules:</p>

<ol>
	<li>Targets directly connected to target1 are 0 hops away.</li>
	<li>Targets directly connected to the 0 hop targets, and not already counted as a 0 hop target or the original target, are 1 hop targets.&nbsp;</li>
	<li>Similarly, targets directly connected to n hop targets, and not already counted in 0..n hop targets are n+1 hop targets.</li>
</ol>

<p>There will be no more than 100,000 targets and no more than 500,000 connections.</p>

<p><strong>Commands</strong></p>

<p>The data base system has only three commands: add, associated, and connections. Targets and connections are never deleted because the Agency never forgets or makes mistakes. Commands start in the first column of a line. Commands and their parameters are separated by whitespace. No input line will exceed 80 columns. No leading or trailing whitespace is to appear on an output line.</p>

<p>add takes one or two parameters:</p>

<p><strong>add target1</strong> //single parameter<br />
Function: Adds the target to the database, with no connections.&nbsp;<br />
Note: If target is already in the database, do nothing (not an error)</p>

<p><strong>add target1 target2</strong> //two parameters<br />
Function: Creates a bidirectional connection between the targets.&nbsp;</p>

<ul>
	<li>If either target is not yet in the database, add it/them, and create the connection.</li>
	<li>If there is already a connection between the targets, do nothing (not an error)&nbsp;</li>
	<li>If target1 and target2 are the same, treat this as if the command were &ldquo;add target1&rdquo; (not an error) There can be at most one direct connection between targets.</li>
</ul>

<p><strong>connections target1</strong><br />
Function: Returns the number of hops to direct and indirect connections from a target.</p>

<ul>
	<li>Print the hop count, a colon, a single space, and the number of targets with that hop count with no leading zeroes on a separate line for each hop count. Start with hop count 0 and end with the hop count for the last nonzero number of targets. Do not print trailing spaces.</li>
	<li>If the target has no connections, print a line containing only the string &ldquo;no connections&rdquo;.</li>
	<li>If the target is not in the database, print a line containing only the string &ldquo;target does not exist&rdquo; (no period).</li>
</ul>

<p><strong>associated target1 target2</strong><br />
Function: Returns information about the existence of a connection between the two targets</p>

<ul>
	<li>If there is a path between the targets, print &ldquo;yes: n&rdquo; on a separate line, where n is the hop count of target2 with respect to target1. There is one space after the colon and no leading zeroes and no trailing spaces.</li>
	<li>If there is no connection between the targets, print &ldquo;no&rdquo; on a separate line.&nbsp;</li>
	<li>If either target1 or target2 is not in the database, print a line containing only the string &ldquo;target does not exist&rdquo;.</li>
</ul>

### 입력

<p>To allow for multiple test cases on the input file, we add a command &ldquo;reset&rdquo; that is not a database command and occurs between the database commands for the different cases on the input file. Be sure to reset all of your data structures when you read this command. Process until end of file; there is no end-of-data flag and no &ldquo;reset&rdquo; command at the end of the file.</p>

### 출력

<p>Start each case with a line consisting of &ldquo;Case&rdquo;, one space, the case number, and a colon. End each case with a line of ten minus signs.</p>
# [Silver II] Music Collection (Small2) - 12520

[문제 링크](https://www.acmicpc.net/problem/12520)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 78, 정답: 56, 맞힌 사람: 41, 정답 비율: 67.213%

### 분류

브루트포스 알고리즘, 구현, 문자열

### 문제 설명

<p>Audio Phil has a huge music collection, and he is very particular about the songs he listens to. Each song has a name that is a string of characters. His music player has a search feature that lets Phil type a substring into the search box, and the player then lists all songs whose names contain the substring. If there is exactly one song that matches the search, then Phil can hit the Enter key to play that song.</p>

<p>Phil hates using the mouse, and he doesn&#39;t like typing too much, so he insists on always typing the shortest possible substring that will match exactly the one song that he wants to play at this moment. Could you help him find his optimal search query?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each one starts with a line containing a single number&nbsp;<strong>N</strong>. The next&nbsp;<strong>N</strong>&nbsp;lines each contain one song name -- these are all of the songs in Phil&#39;s collection.</p>

<p>Each song name will consist of only letters, spaces and the hyphen character (-). All songs in Phil&#39;s collection will be unique and at most 100 characters in length. Song names are case insensitive, so &quot;dZihan&quot; is the same is &quot;Dzihan&quot;. The search algorithm is also case insensitive.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>:&quot;, where&nbsp;<strong>x</strong>&nbsp;is the case number (starting from 1). After that, print&nbsp;<strong>N</strong>&nbsp;lines, one for each song in Phil&#39;s collection, in the order that the songs were given in the input. For each song, print the shortest string of characters that will uniquely find that song. If there are several correct answers, print the lexicographically smallest one. Put double quotes around each string. If there is no correct answer, print &quot;:(&quot; without the double quotes.</p>

<p>Note that upper case letters come lexicographically before lower case letters, hyphen comes before all letters, and space comes before hyphen.</p>
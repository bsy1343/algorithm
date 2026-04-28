# [Gold IV] Door Man - 9974

[문제 링크](https://www.acmicpc.net/problem/9974)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

많은 조건 분기, 오일러 경로, 그래프 이론, 파싱, 문자열

### 문제 설명

<p>You are a butler in a large mansion. This mansion has so many rooms that they are merely referred to by number (room 0, 1, 2, 3, etc...). Your master is a particularly absent-minded lout and continually leaves doors open throughout a particular floor of the house. Over the years, you have mastered the art of traveling in a single path through the sloppy rooms and closing the doors behind you. Your biggest problem is determining whether it is possible to find a path through the sloppy rooms where you:</p>

<ol>
	<li>Always shut open doors behind you immediately after passing through</li>
	<li>Never open a closed door</li>
	<li>End up in your chambers (room 0) with all doors closed</li>
</ol>

<p>In this problem, you are given a list of rooms and open doors between them (along with a starting room). It is not needed to determine a route, only if one is possible.</p>

### 입력

<p>Input to this problem will consist of a (non-empty) series of up to 100 data sets. Each data set will be formatted according to the following description, and there will be no blank lines separating data sets.</p>

<p>A single data set has 3 components:</p>

<ol>
	<li>Start line &ndash; A single line, &ldquo;START M N&rdquo;, where M indicates the butler&rsquo;s starting room, and N indicates the number of rooms in the house (1 &lt;= N &lt;= 20).</li>
	<li>Room list &ndash; A series of N lines. Each line lists, for a single room, every open door that leads to a room of higher number. For example, if room 3 had open doors to rooms 1, 5, and 7, the line for room 3 would read &ldquo;5 7&rdquo;. The first line in the list represents room 0. The second line represents room 1, and so on until the last line, which represents room (N &ndash; 1). It is possible for lines to be empty (in particular, the last line will always be empty since it is the highest numbered room). On each line, the adjacent rooms are always listed in ascending order. It is possible for rooms to be connected by multiple doors!</li>
	<li>End line &ndash; A single line, &ldquo;END&rdquo;</li>
</ol>

<p>Following the final data set will be a single line, &ldquo;ENDOFINPUT&rdquo;.</p>

<p>Note that there will be no more than 100 doors in any single data set.</p>

### 출력

<p>For each data set, there will be exactly one line of output. If it is possible for the butler (by following the rules in the introduction) to walk into his chambers and close the final open door behind him, print a line &ldquo;YES X&rdquo;, where X is the number of doors he closed. Otherwise, print &ldquo;NO&rdquo;.</p>
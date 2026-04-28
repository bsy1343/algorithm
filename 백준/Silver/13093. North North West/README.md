# [Silver III] North North West - 13093

[문제 링크](https://www.acmicpc.net/problem/13093)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 32, 맞힌 사람: 31, 정답 비율: 68.889%

### 분류

구현, 수학

### 문제 설명

<p>We can describe detailed direction by repeating the directional names: north, south, east and west. For example, northwest is the direction halfway between north and west, and northnorthwest is between north and northwest.</p>

<p>In this problem, we describe more detailed direction between north and west as follows.</p>

<ul>
	<li>&quot;north&quot; means 0 degrees.</li>
	<li>&quot;west&quot; means 90 degrees.</li>
	<li>If the direction dir means a degrees and the sum of the occurrences of &quot;north&quot; and &quot;west&quot; in dir is n (&ge; 1), &quot;north&quot;dir (the concatenation of &quot;north&quot; and dir) means a&minus;(90/2<sup>n</sup>) degrees and &quot;west&quot;dir means a+(90/2<sup>n</sup>) degrees.</li>
</ul>

<p>Your task is to calculate the angle in degrees described by the given direction.</p>

### 입력

<p>The input contains several datasets. The number of datasets does not exceed 100.</p>

<p>Each dataset is described by a single line that contains a string denoting a direction. You may assume the given string can be obtained by concatenating some &quot;north&quot; and &quot;west&quot;, the sum of the occurrences of &quot;north&quot; and &quot;west&quot; in the given string is between 1 and 20, inclusive, and the angle denoted by the given direction is between 0 and 90, inclusive. The final dataset is followed by a single line containing only a single &quot;#&quot;.</p>

### 출력

<p>For each dataset, print an integer if the angle described by the given direction can be represented as an integer, otherwise print it as an irreducible fraction. Follow the format of the sample output.</p>

<p>&nbsp;</p>
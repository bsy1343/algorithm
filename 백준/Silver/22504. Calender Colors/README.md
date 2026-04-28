# [Silver II] Calender Colors - 22504

[문제 링크](https://www.acmicpc.net/problem/22504)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 23, 맞힌 사람: 19, 정답 비율: 95.000%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Taro is a member of a programming contest circle. In this circle, the members manage their schedules in the system called&nbsp;<i>Great Web Calender</i>.</p>

<p>Taro has just added some of his friends to his calendar so that he can browse their schedule on his calendar. Then he noticed that the system currently displays all the schedules in only one color, mixing the schedules for all his friends. This is difficult to manage because it&#39;s hard to tell whose schedule each entry is.</p>

<p>But actually this calender system has the feature to change the color of schedule entries, based on the person who has the entries. So Taro wants to use that feature to distinguish their plans by color.</p>

<p>Given the colors Taro can use and the number of members, your task is to calculate the subset of colors to color all schedule entries. The colors are given by &quot;Lab color space&quot;.</p>

<p>In Lab color space, the distance between two colors is defined by the square sum of the difference of each element. Taro has to pick up the subset of colors that maximizes the sum of distances of all color pairs in the set.</p>

### 입력

<p>The input is like the following style.</p>

<pre>
<var><i>N</i></var> <var><i>M</i></var>
<var><i>L</i><sub>0</sub></var> <var><i>a</i><sub>0</sub></var> <var><i>b</i><sub>0</sub></var>
<var><i>L</i><sub>1</sub></var> <var><i>a</i><sub>1</sub></var> <var><i>b</i><sub>1</sub></var>
<var>&hellip;</var>
<var><i>L</i><sub><i>N</i>&minus;1</sub></var> <var><i>a</i><sub><i>N</i>&minus;1</sub></var> <var><i>b</i><sub><i>N</i>&minus;1</sub></var></pre>

<p>The first line contains two integers&nbsp;<var><i>N</i></var>&nbsp;and&nbsp;<var><i>M</i></var>&nbsp;(<var>0&le;<i>M</i>&le;<i>N</i>&le;20</var>), where&nbsp;<var><i>N</i></var>&nbsp;is the number of colors in the input, and&nbsp;<var><i>M</i></var>&nbsp;is the number of friends Taro wants to select the colors for. Each of the following&nbsp;<var><i>N</i></var>&nbsp;lines contains three decimal integers&nbsp;<var><i>L</i></var>(<var>0.0&le;<i>L</i>&le;100.0</var>),&nbsp;<var><i>a</i></var>(<var>&minus;134.0&le;<i>a</i>&le;220.0</var>) and&nbsp;<var><i>b</i></var>(<var>&minus;140.0&le;<i>b</i>&le;122.0</var>) which represents a single color in Lab color space.</p>

### 출력

<p>Output the maximal of the total distance. The output should not contain an error greater than&nbsp;<var>10<sup>&minus;5</sup></var>.</p>
# [Platinum IV] Private Teacher - 22703

[문제 링크](https://www.acmicpc.net/problem/22703)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 14, 맞힌 사람: 14, 정답 비율: 43.750%

### 분류

그래프 이론, 최대 유량

### 문제 설명

<p>You are working as a private teacher. Since you are giving lessons to many pupils, you are very busy, especially during examination seasons. This season is no exception in that regard.</p>

<p>You know days of the week convenient for each pupil, and also know how many lessons you have to give to him or her. You can give just one lesson only to one pupil on each day. Now, there are only a limited number of weeks left until the end of the examination. Can you finish all needed lessons?</p>

### 입력

<p>The input consists of multiple data sets. Each data set is given in the following format:</p>

<pre>
<i>N W</i>
<i>t</i><sub>1</sub> <i>c</i><sub>1</sub>
<i>list-of-days-of-the-week</i>
<i>t</i><sub>2</sub> <i>c</i><sub>2</sub>
<i>list-of-days-of-the-week</i>
...
<i>t<sub>N</sub></i> <i>c<sub>N</sub></i>
<i>list-of-days-of-the-week</i>
</pre>

<p>A data set begins with a line containing two integers&nbsp;<i>N</i>&nbsp;(0 &lt;&nbsp;<i>N</i>&nbsp;&le; 100) and&nbsp;<i>W</i>&nbsp;(0 &lt;&nbsp;<i>W</i>&nbsp;&le; 10<sup>10</sup>&nbsp;).&nbsp;<i>N</i>&nbsp;is the number of pupils.&nbsp;<i>W</i>&nbsp;is the number of remaining weeks. The following 2<i>N</i>&nbsp;lines describe information about the pupils. The information for each pupil is given in two lines. The first line contains two integers&nbsp;<i>t<sub>i</sub></i>&nbsp;and&nbsp;<i>c<sub>i</sub></i>.&nbsp;<i>t<sub>i</sub></i>&nbsp;(0 &lt;&nbsp;<i>t<sub>i</sub></i>&nbsp;&le; 10<sup>10</sup>&nbsp;) is the number of lessons that the&nbsp;<i>i</i>-th pupil needs.&nbsp;<i>c<sub>i</sub></i>&nbsp;(0 &lt;&nbsp;<i>c<sub>i</sub></i>&nbsp;&le; 7) is the number of days of the week convenient for the&nbsp;<i>i</i>-th pupil. The second line is the list of&nbsp;<i>c<sub>i</sub></i>&nbsp;convenient days of the week (Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday).</p>

<p>The end of input is indicated by a line that contains two zeros. This line should not be processed.</p>

### 출력

<p>For each data set, print &ldquo;Yes&rdquo; if you can finish all lessons, or &ldquo;No&rdquo; otherwise.</p>
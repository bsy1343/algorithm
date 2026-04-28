# [Gold II] Advanced Causal Measurements (ACM) - 4317

[문제 링크](https://www.acmicpc.net/problem/4317)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 8, 맞힌 사람: 8, 정답 비율: 57.143%

### 분류

이분 탐색, 그리디 알고리즘, 매개 변수 탐색, 정렬

### 문제 설명

<p>Causality is a very important concept in theoretical physics. The basic elements in a discussion of causality are&nbsp;<em>events</em>. An event&nbsp;<em>e</em>&nbsp;is described by its time of occurrence&nbsp;<em>t</em>, and its location,&nbsp;<b><em>x</em></b>, and we write&nbsp;<em>e</em>&nbsp;= (<em>t</em>,<b><em>x</em></b>). For our concerns, all events happen in the one dimensional geometric space and thus locations are given by a single real number&nbsp;<em>x</em>&nbsp;as a coordinate on&nbsp;<em>x</em>-axis. Usually, theoretical physicists like to define the speed of light to be 1, so that time and space have the same units (actual physical units frighten and confuse theorists).</p>

<p>One event&nbsp;<em>e<sub>1</sub></em>&nbsp;= (<em>t<sub>1</sub></em>,<em>x<sub>1</sub></em>) is a&nbsp;<em>possible cause</em>&nbsp;for a second event&nbsp;<em>e<sub>2</sub></em>&nbsp;= (<em>t<sub>2</sub></em>,<em>x<sub>2</sub></em>) if a signal emitted at&nbsp;<em>e<sub>1</sub></em>&nbsp;could arrive at&nbsp;<em>e<sub>2</sub></em>. Signals can&#39;t travel faster than the speed of light, so this condition can be stated as:</p>

<p style="text-align: center;"><em>e<sub>1</sub></em>&nbsp;is a&nbsp;<em>possible cause</em>&nbsp;for&nbsp;<em>e<sub>2</sub></em>&nbsp;<b>iff</b>&nbsp;<em>t<sub>2</sub></em>&nbsp;&gt;=&nbsp;<em>t<sub>1</sub></em>+|<em>x<sub>2</sub></em>-<em>x<sub>1</sub></em>|</p>

<p>Thus an event at (-1,1) could cause events at (0,0), (1,2), and (1,3), for example, but could not have caused events at (1,4) or (-2,1). Note that one event can cause several others.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4317.%E2%80%85Advanced%E2%80%85Causal%E2%80%85Measurements%E2%80%85(ACM)/1918abdd.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4317.%E2%80%85Advanced%E2%80%85Causal%E2%80%85Measurements%E2%80%85(ACM)/1918abdd.png" data-original-src="https://upload.acmicpc.net/2621383b-4a36-435e-ab18-d4895ef640bd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float: right;" />Recently, scientists have observed several unusual events in the geometrically one dimensional universe, and using current theories, they know how many causes were responsible for these observations, but they know nothing about the time and space coordinates of the causes. You asked to write a program to determine the latest time at which the earliest cause could have occurred (i.e. the time such that at least one cause must have occurred on or before this time). Somewhat surprisingly, all the observed events have both space and time coordinates expressed by integer numbers in the range -1000000&nbsp;&le;&nbsp;<em>t</em>,&nbsp;<em>x</em>&nbsp;&le;&nbsp;1000000.</p>

<p>The figure on the right illustrates the first case from input: the earliest single event as a possible cause of all four events.</p>

### 입력

<p>The first line of input is the number of cases which follow. Each case begins with a line containing the number&nbsp;<em>n</em>&nbsp;of events and the number&nbsp;<em>m</em>&nbsp;of causes, 1&nbsp;&le;&nbsp;<em>n,&nbsp;m</em>&nbsp;&le;&nbsp;100000. Next follows&nbsp;<em>n</em>&nbsp;lines containing the&nbsp;<em>t</em>&nbsp;and&nbsp;<em>x</em>&nbsp;coordinates for each event.</p>

### 출력

<p>Output consists of a single line for each case in the format as in the sample output, giving the latest time at which the earliest cause could have occurred, this will be an integer as our time units are not divisible.</p>
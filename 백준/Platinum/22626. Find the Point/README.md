# [Platinum I] Find the Point - 22626

[문제 링크](https://www.acmicpc.net/problem/22626)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 8, 정답: 7, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

브루트포스 알고리즘, 많은 조건 분기, 기하학, 수학

### 문제 설명

<p>We understand that reading English is a great pain to many of you. So we&rsquo;ll keep this problem statememt simple. Write a program that reports the point equally distant from a set of lines given as the input. In case of no solutions or multiple solutions, your program should report as such.</p>

### 입력

<p>The input is given in the following format:</p>

<pre>
<i>n</i>
<i>x</i><sub>1,1</sub> <i>y</i><sub>1,1</sub> <i>x</i><sub>1,2</sub> <i>y</i><sub>1,2</sub>
<i>x</i><sub>2,1</sub> <i>y</i><sub>2,1</sub> <i>x</i><sub>2,2</sub> <i>y</i><sub>2,2</sub>
...
<i>x</i><sub><i>n</i>,1</sub> <i>y</i><sub><i>n</i>,1</sub> <i>x</i><sub><i>n</i>,2</sub> <i>y</i><sub><i>n</i>,2</sub></pre>

<p><i>n</i>&nbsp;is the number of lines (1 &le;&nbsp;<i>n</i>&nbsp;&le; 100); (<i>x</i><sub><i>i</i>,1</sub>,&nbsp;<i>y</i><sub><i>i</i>,1</sub>) and (<i>x</i><sub><i>i</i>,2</sub>,&nbsp;<i>y</i><sub><i>i</i>,2</sub>) denote the different points the&nbsp;<i>i</i>-th line passes through. The lines do not coincide each other. The coordinates are all integers between -10000 and 10000.</p>

### 출력

<p>Print a line as follows. If there is exactly one point equally distant from all the given lines, print the&nbsp;<i>x</i>- and&nbsp;<i>y</i>-coordinates in this order with a single space between them. If there is more than one such point, just print &quot;Many&quot; (without quotes). If there is none, just print &quot;None&quot; (without quotes).</p>

<p>The coordinates may be printed with any number of digits after the decimal point, but should be accurate to 10<sup>-4</sup>.</p>
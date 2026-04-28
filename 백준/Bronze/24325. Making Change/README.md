# [Bronze I] Making Change - 24325

[문제 링크](https://www.acmicpc.net/problem/24325)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 121, 정답: 99, 맞힌 사람: 94, 정답 비율: 86.239%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Anakin Skywalker is leaving Tatoonie, but before he can go he must program a droid to do his old job of making change for customers at Watto&rsquo;s junk business. Given the price of an item and the payment determine the correct change using \$50, \$20, \$10, \$5, and \$1 bills. You don&rsquo;t have to worry about change, because Watto always keeps the change.</p>

### 입력

<p>A positive integer, n, on the first line indicating the number of data sets to follow. Each data set will consist of two positive numbers. The first is the cost to the customer and the second is the payment made by the customer. The payment will always be greater than the cost.</p>

### 출력

<p>For each data set print the correct change on one line using the format</p>

<pre>
v-$50, w-$20, x-$10, y-$5, z-$1</pre>

<p>where v, w, x, y, z are the number of bills needed to make the correct change. Of course, the correct change will always use larger bills when possible (i.e., 1-\$5 not 5-\$1)</p>
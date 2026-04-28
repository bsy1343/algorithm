# [Gold V] Shredding Company - 15545

[문제 링크](https://www.acmicpc.net/problem/15545)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 24, 맞힌 사람: 24, 정답 비율: 100.000%

### 분류

브루트포스 알고리즘, 구현

### 문제 설명

<p>You have just been put in charge of developing a new shredder for the Shredding Company. Although a &quot;normal&quot; shredder would just shred sheets of paper into little pieces so that the contents would become unreadable, this new shredder needs to have the following unusual basic characteristics.</p>

<ul>
	<li>The shredder takes as input a&nbsp;<em>target number</em>&nbsp;and a sheet of paper with a number written on it.</li>
	<li>It shreds (or cuts) the sheet into pieces each of which has one or more digits on it.</li>
	<li>The sum of the numbers written on each piece is the closest possible number to the target number, without going over it.</li>
</ul>

<p>For example, suppose that the target number is&nbsp;<em>50</em>, and the sheet of paper has the number&nbsp;<em>12346</em>. The shredder would cut the sheet into four pieces, where one piece has&nbsp;<em>1</em>, another has&nbsp;<em>2</em>, the third has&nbsp;<em>34</em>, and the fourth has&nbsp;<em>6</em>. This is because their sum 43 (= 1 + 2 + 34 + 6) is closest to the target number&nbsp;<em>50</em>&nbsp;of all possible combinations without going over 50. For example, a combination where the pieces are&nbsp;<em>1</em>,&nbsp;<em>23</em>,&nbsp;<em>4</em>, and&nbsp;<em>6</em>&nbsp;is not valid, because the sum of this combination 34 (= 1 + 23 + 4 + 6) is less than the above combination&#39;s 43. The combination of&nbsp;<em>12</em>,&nbsp;<em>34</em>, and&nbsp;<em>6</em>&nbsp;is not valid either, because the sum 52 (= 12+34+6) is greater than the target number of 50.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15545.%E2%80%85Shredding%E2%80%85Company/e5e2d442.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/15545.%E2%80%85Shredding%E2%80%85Company/e5e2d442.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15545/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:242px; width:305px" /></p>

<p style="text-align:center">Figure 1. Shredding a sheet of paper having the number&nbsp;<em>12346</em>&nbsp;when the target number is&nbsp;<em>50</em></p>

<p>There are also three special rules:</p>

<ul>
	<li>If the target number is the same as the number on the sheet of paper, then the paper is not cut. For example, if the target number is&nbsp;<em>100</em>&nbsp;and the number on the sheet of paper is also&nbsp;<em>100</em>, then the paper is not cut.</li>
	<li>If it is not possible to make any combination whose sum is less than or equal to the target number, then error is printed on a display. For example, if the target number is&nbsp;<em>1</em>&nbsp;and the number on the sheet of paper is&nbsp;<em>123</em>, it is not possible to make any valid combination, as the combination with the smallest possible sum is&nbsp;<em>1</em>,&nbsp;<em>2</em>,&nbsp;<em>3</em>. The sum for this combination is 6, which is greater than the target number, and thus error is printed.</li>
	<li>If there is more than one possible combination where the sum is closest to the target number without going over it, then&nbsp;<em>rejected</em>&nbsp;is printed on a display. For example, if the target number is&nbsp;<em>15</em>, and the number on the sheet of paper is&nbsp;<em>111</em>, then there are two possible combinations with the highest possible sum of 12: (a)&nbsp;<em>1</em>&nbsp;and&nbsp;<em>11</em>&nbsp;and (b)&nbsp;<em>11</em>&nbsp;and&nbsp;<em>1</em>; thus rejected is printed.</li>
</ul>

<p>In order to develop such a shredder, you have decided to first make a simple program that would simulate the above characteristics and rules. Given two numbers, where the first is the target number and the second is the number on the sheet of paper to be shredded, you need to figure out how the shredder should &quot;cut up&quot; the second number.</p>

### 입력

<p>The input consists of several test cases, each on one line, as foIows:</p>

<pre>
<em>t</em><sub>1</sub> <em>num</em><sub>1</sub>
<em>t</em><sub>2</sub> <em>num</em><sub>2</sub>
...
<em>t</em><sub><em>n</em></sub> <em>num</em><sub><em>n</em></sub>
0 0
</pre>

<p>Each test case consists of the following two positive integers, which are separated by one space: (1) the first integer (<em>t<sub>i</sub></em>&nbsp;above) is the target number; (2) the second integer (<em>num<sub>i</sub></em>&nbsp;above) is the number that is on the paper to be shredded.</p>

<p>Neither integers may have a 0 as the first digit, e.g., 123 is aIowed but 0123 is not. You may assume that both integers are at most 6 digits in length. A line consisting of two zeros signals the end of the input.</p>

### 출력

<p>For each test case in the input, the corresponding output takes one of the following three types:</p>

<ul>
	<li><em>sum</em>&nbsp;<em>part</em><sub>1</sub>&nbsp;<em>part</em><sub>2</sub>&nbsp;...</li>
	<li>rejected</li>
	<li>error</li>
</ul>

<p>In the first type,&nbsp;<em>part<sub>j</sub></em>&nbsp;and&nbsp;<em>sum</em>&nbsp;have the following meaning:</p>

<ul>
	<li>Each&nbsp;<em>part<sub>j</sub></em>&nbsp;is a number on one piece of shredded paper. The order of&nbsp;<em>part<sub>j</sub></em>&nbsp;corresponds to the order of the original digits on the sheet of paper.</li>
	<li><em>sum</em>&nbsp;is the sum ofthe numbers after being shredded, i.e.,&nbsp;<em>sum</em>&nbsp;=&nbsp;<em>part</em><sub>1</sub>&nbsp;+&nbsp;<em>part</em><sub>2</sub>&nbsp;+ ... .</li>
</ul>

<p>Each number should be separated by one space.</p>

<p>The message `error&#39; is printed if it is not possible to make any combination, and `rejected&#39; if there is more than one possible combination.</p>

<p>No extra characters including spaces are allowed at the beginning of each line, nor at the end of each line.</p>
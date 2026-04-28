# [Platinum III] Physical Education - 31390

[문제 링크](https://www.acmicpc.net/problem/31390)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 7, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

이분 탐색, 다이나믹 프로그래밍, 자릿수를 이용한 다이나믹 프로그래밍, 수학, 매개 변수 탐색

### 문제 설명

<p>Once a week android Vasya attends his PE classes. His trainer believes that an ability to think has to be trained as well as physical skills. That is why the trainer often gives his group some tasks which are not quite easy to complete.</p>

<p>Today&#39;s task was the following one. Initially $n$ androids stood in one line. The trainer distributed among them different numbers in a decimal notation. All numbers were from $1$ to $n$ according to the order in which the androids stood, from left to right. On the trainer&#39;s command students should re-form the line in a new order. Any two neighboring androids in the new line should meet one of the following conditions:</p>

<ul>
	<li>the sum of digits in the left android&#39;s number is less than the sum of digits in the right android&#39;s number;</li>
	<li>the sums of digits in their numbers are equal and the left android&#39;s number is less than the right one&#39;s.</li>
</ul>

<p>The group was completing the task very slowly. But Vasya found it very boring as he was the first in the line and didn&#39;t have to change his place.</p>

<p>While the androids were re-forming, Vasya decided to determine how many of them didn&#39;t need to change their places. Help him to count this.</p>

### 입력

<p>The only line contains an integer $n$ that is the number of androids in the group ($2 \leq n \leq 10^9$).</p>

### 출력

<p>Output the number of androids who didn&#39;t have to change their places.</p>

### 힌트

<p>New order is 1, 10, 2, 11, 3, 12, 4, 13, 5, 14, 6, 15, 7, 16, 8, 17, 9, 18, 19. Androids 18 and 19 along with Vasya didn&#39;t have to change their places.</p>
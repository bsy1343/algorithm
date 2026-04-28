# [Gold I] Love for Pizza - 30127

[문제 링크](https://www.acmicpc.net/problem/30127)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 60, 정답: 9, 맞힌 사람: 9, 정답 비율: 32.143%

### 분류

다이나믹 프로그래밍, 자료 구조, 정렬, 기하학, 누적 합, 각도 정렬, 최대 부분 배열 문제

### 문제 설명

<p>My brother and I love pizza. My brother ordered a pizza today with a number of toppings. Some of those toppings I love, like mushrooms, while there are some others that I hate, like olives. Even among the toppings I like (or the ones that I don&#39;t like), I like some more than the other, depending on the amount.</p>

<p>Now my brother will let me take a wedge of any size from the pizza. This means I am allowed to make two cuts from the center of the pizza to its circumference, and can keep one of the two resulting pieces. If either cut goes through a topping, the entire topping belongs to that piece which contains the centre of the topping. I am not allowed to cut exactly through the centre of a topping. Each topping will thus remain entirely on one of the pieces. I would like to cut and choose the best piece possible for myself.</p>

### 입력

<p>Input contains multiple test-cases. The first line of the input contains <b>T</b>, the number of test cases, followed by <b>T</b> testcases. The first line of each test case contains one integer <b>N</b>, the number of toppings. It is followed by <b>N</b> lines containing three space-separated integers each. Each line described a single topping. The first integer denotes my <b>preference</b> for the topping. The next two integers denote respectively the <b>x</b> and <b>y</b> co-ordinates of the centre of the topping.</p>

### 출력

<p>Output a single line per test-case, indicating the sum of the preferences of all the toppings on the best piece. The best piece is the one that has the maximum sum possible.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 25</li>
	<li>1 &le; <b>N</b> &le; 10<sup>5</sup></li>
	<li>-10<sup>5</sup> &le; <b>preference</b> &le; 10<sup>5</sup></li>
	<li>The point (<b>x</b>,<b>y</b>) will lie within the pizza, which is assumed to be a circle centered at (0, 0) with a radius of 10<sup>9</sup>. The point will not be the centre itself.</li>
	<li>Multiple toppings may be centred at the same point.</li>
	<li>A set of test cases will not exceed 4MB in file size.</li>
</ul>
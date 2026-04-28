# [Silver III] Prize Coupon - 21021

[문제 링크](https://www.acmicpc.net/problem/21021)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 73, 정답: 37, 맞힌 사람: 35, 정답 비율: 55.556%

### 분류

그리디 알고리즘

### 문제 설명

<p>There are N students studying at BINUS University numbered from 1 to N. Each student has their own unique identifier (ID).</p>

<p>As a result of recent achievements, BINUS University wants to distribute coupons to their students. The i<sup>th</sup> student received Ci coupons from the university. For each of the received coupon, the student must write a student&rsquo;s ID on the back of the coupon. The written ID might belong to the student themselves or another student. However, the university enforces that the i<sup>th</sup> student cannot write the j<sup>th</sup> student&rsquo;s ID if the difference between i and j is more than one, i.e. |i &minus; j|&gt; 1.</p>

<p>After all the students have written a student&rsquo;s ID on the back of each coupon, all coupons are then collected by the university. The university then grants a prize to each student whose ID is written on at least one coupon.</p>

<p>For example, let N = 4 and C<sub>1...4</sub> = {3, 0, 1, 0}.</p>

<ul>
	<li>The first student can write the second student&rsquo;s ID on two of their coupons, and write the first student&rsquo;s ID on the remaining coupon.</li>
	<li>The third student can write the fourth student&rsquo;s ID on their coupon.</li>
	<li>Therefore, the first, second, and fourth students get at least one prize.</li>
</ul>

<p>The students want to write the student&rsquo;s ID such that the number of distinct students who get a prize is maximized. The students studying at BINUS University are known to be selfless, so they might not write their own ID and write other&rsquo;s ID instead if it can increase the number of students who will get a prize.</p>

<p>Your task is to determine the maximum number of students who will get a prize.</p>

### 입력

<p>Input begins with a line containing an integer: N (1 &le; N &le; 100 000) representing the number of students. The next line contains N integers: C<sub>i</sub> (0 &le; C<sub>i</sub> &le; 3) representing the number of received coupons.</p>

### 출력

<p>Output in a line an integer representing the maximum number of students who will get a prize.</p>
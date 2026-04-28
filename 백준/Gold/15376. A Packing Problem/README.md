# [Gold III] A Packing Problem - 15376

[문제 링크](https://www.acmicpc.net/problem/15376)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 8, 맞힌 사람: 8, 정답 비율: 42.105%

### 분류

기하학

### 문제 설명

<p>During his childhood, Miguel always found inspiration as he watched his mother pack her sheets. As he grew older, Miguel took a job which is quite similar &mdash; packing cans.</p>

<p>Miguel&rsquo;s job involves packing cans in a box with a rectangular base. Miguel wonders if he can pack together two cans with different radiuses in a box. We can assume that the cans are right circular cylinders of differing heights. Miguel feels he&rsquo;s packing nice if both cans are standing upright (i.e. you should see the circular bases if you look at the box from the top) and he feels he&rsquo;s packing well if no can is on top of the other. It is okay for Miguel to pack cans such that they touch each other on the sides. The cans can even touch the sides of the box. In fact, having them touch is usually a good idea since it means that the packing is more compact. Moreover, you may assume that the height of the box is greater than the height of any of the two cans to be packed. Miguel feels he&rsquo;s packing good whenever he simultaneously feels he&rsquo;s packing nice and packing well. Otherwise, he feels he&rsquo;s packing bad.</p>

<p>Given the radiuses of their bases, can he arrange the cans in the box such that he feels he&rsquo;s packing good?</p>

### 입력

<p>The first line of input contains T, the number of test cases.</p>

<p>The next T lines each contain four positive integers L, W, R1, R2, separated by single spaces. L and W are the dimensions of the base of the box, and R1 and R2 are the radiuses of the two cans to be packed.</p>

<p>Constraints</p>

<ul>
	<li>1 &le; T &le; 10<sup>5</sup></li>
	<li>1 &le; L &le; 10<sup>4</sup></li>
	<li>1 &le; W &le; 10<sup>4</sup></li>
	<li>1 &le; R1 &le; 10<sup>4</sup></li>
	<li>1 &le; R2 &le; 10<sup>4</sup></li>
</ul>

### 출력

<p>For each test case, output a single line containing <code>PACKING GOOD</code> if Miguel feels he&rsquo;s packing good. Otherwise, output a single line containing <code>PACKING BAD</code>.</p>

### 힌트

<p>For the first test case, the packing can be done as follows:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15376.%E2%80%85A%E2%80%85Packing%E2%80%85Problem/d047e48f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15376/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:242px; width:314px" /></p>
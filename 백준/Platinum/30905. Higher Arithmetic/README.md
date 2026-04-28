# [Platinum III] Higher Arithmetic - 30905

[문제 링크](https://www.acmicpc.net/problem/30905)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 270, 정답: 84, 맞힌 사람: 73, 정답 비율: 38.421%

### 분류

수학, 구현, 애드 혹, 해 구성하기, 많은 조건 분기

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30905.%E2%80%85Higher%E2%80%85Arithmetic/c289d87c.png" data-original-src="https://upload.acmicpc.net/e70f41ad-24ff-40e3-91f9-ce8643e6615a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 247px; height: 358px; float: right; margin-left:10px;" />Captchas are getting more and more elaborate. It started with doing simple calculations like $7 + 2$, and now, it has evolved into having to distinguish chihuahuas from double chocolate chip muffins.</p>

<p>To combat the rise of smarter bots, the Internet Captcha Production Company (ICPC) has outdone itself this time: given a distorted image containing many integers, find the maximum value that can be expressed using each of the given integers exactly once, using addition, multiplication, and arbitrary parentheses.</p>

<p>After unsuccessfully trying to solve such a captcha for an hour straight, Katrijn is terribly frustrated. She decides to write a program that outputs a valid arithmetic expression with maximal value.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1 \le n \le 10^5$), the number of integers in the captcha.</li>
	<li>One line with $n$ integers $a$ ($1 \le a \le 10^6$), the integers in the captcha.</li>
</ul>

### 출력

<p>Output a valid arithmetic expression with maximal value, where each integer from the input list is used exactly once. The usual order of operations applies. The output expression may use at most $10^6$ characters and must not contain any spaces. Such an expression exists for any possible input.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>
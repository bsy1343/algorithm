# [Silver IV] How Much Coffee is Left? - 25818

[문제 링크](https://www.acmicpc.net/problem/25818)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 49, 정답: 47, 맞힌 사람: 43, 정답 비율: 95.556%

### 분류

수학, 기하학, 3차원 기하학

### 문제 설명

<p>As a budding computer scientist, you&rsquo;ve realized that it&rsquo;s very important to have your morning coffee. Furthermore, it&rsquo;s good to know when the coffee will run out so you can properly plan when to refill.</p>

<p>Your coffee mug is the shape of a cross section of a cone. Here is a horizontal view:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/25818.%E2%80%85How%E2%80%85Much%E2%80%85Coffee%E2%80%85is%E2%80%85Left%3F/a222ca53.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/25818.%E2%80%85How%E2%80%85Much%E2%80%85Coffee%E2%80%85is%E2%80%85Left%3F/a222ca53.png" data-original-src="https://upload.acmicpc.net/8cced1c5-892a-4a23-ad6c-2e66ef09baf3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 240px; height: 223px;" /></p>

<p>You start the morning with a full cup. After some amount of time, you note the depth of the coffee remaining &ndash; this is the distance from the bottom of the cup to the surface of the coffee (note that the surface of the coffee is a plane parallel to the bottom of the cup). Given this information, calculate how much more time it will take before the coffee is finished, assuming that you drink coffee at the same constant rate the whole time.</p>

<p>Given the information about the cup and elapsed drinking time, determine how many minutes it will take to finish the coffee.</p>

### 입력

<p>There is only one input line; it contains five space separated integers:</p>

<ul>
	<li>r (1 &le; r &le; 100), the radius of the bottom of the cup in inches,</li>
	<li>s (r &lt; s &le; 1000), the radius of the top of the cup in inches,</li>
	<li>h (2 &le; h &le; 1000), the height of the cup in inches,</li>
	<li>m (1 &le; m &le; 1000), the number of minutes that coffee has been drank,</li>
	<li>d (1 &le; d &lt; h), the depth of the remaining coffee in inches.</li>
</ul>

### 출력

<p>Print a single floating point number on a line by itself: the number of minutes it will take to finish the cup of coffee. Any answer within an absolute or relative tolerance of 10<sup>-6</sup> will be accepted.</p>
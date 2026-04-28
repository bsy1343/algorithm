# [Silver IV] Polar Explorer - 9973

[문제 링크](https://www.acmicpc.net/problem/9973)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 98, 정답: 43, 맞힌 사람: 36, 정답 비율: 42.857%

### 분류

수학, 기하학

### 문제 설명

<p>You are a intrepid 2-dimensional explorer located at the northern polar reaches of a distant 2-dimensional planet. Unfortunately, you have been assigned to explore the most boring planet in the known universe (due primarily to your lack of social skills and aggressive body odor). Having a perfectly circular surface, your planet holds no surprises for a would-be explorer.</p>

<p>However, you have recently received a distress call from an alien ship which has crash-landed somewhere on the surface of your planet. Unfortunately, you designed your own equipment, and the only information it will give you is an angle (measured from the center of the planet) separating you from the crash site.</p>

<p>Using this information along with how much gasoline is available for your planet-rover (which gets a measley 5 miles per gallon), you have to determine if you can possibly get to the crash site and back without running out of fuel.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/9973.%E2%80%85Polar%E2%80%85Explorer/18b614af.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/9973.%E2%80%85Polar%E2%80%85Explorer/18b614af.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9973/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:180px; width:200px" /></p>

### 입력

<p>Input to this problem will consist of a (non-empty) series of up to 100 data sets. Each data set will be formatted according to the following description, and there will be no blank lines separating data sets.</p>

<p>A single data set has 3 components:</p>

<ol>
	<li>Start line &ndash; A single line, &ldquo;START&rdquo;.</li>
	<li>Input line &ndash; A single line, &ldquo;X Y Z&rdquo;, where:
	<ul>
		<li>X : (1 &lt;= X &lt;= 100) is the radius of your planet in integer miles</li>
		<li>Y : (0 &lt;= Y &lt;= 100) is the amount of gasoline in your planet-rover in integer gallons</li>
		<li>Z : (0 &lt;= Z &lt;= 360) is an angle separating you from the crash site in integer degrees</li>
	</ul>
	</li>
	<li>End line &ndash; A single line, &ldquo;END&rdquo;.</li>
</ol>

<p>Following the final data set will be a single line, &ldquo;ENDOFINPUT&rdquo;.</p>

<p>Take note of the following:</p>

<ul>
	<li>The circumference of a circle in terms of its radius, r, is known to be 2&pi;r</li>
	<li>Assume that &pi; = 3.14159</li>
</ul>

### 출력

<p>For each data set, there will be exactly one line of output. If you have enough fuel to get to the crash site and back, the line will read, &ldquo;YES X&rdquo;, where X is the amount of fuel you will have left expressed as an integer number of gallons (truncate any fractional gallons). If you do not have sufficient fuel, the line will read, &ldquo;NO Y&rdquo;, where Y is the distance you can travel expressed as an integer number of miles.</p>
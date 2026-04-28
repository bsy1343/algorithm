# [Bronze II] Tire Dimensions - 4855

[문제 링크](https://www.acmicpc.net/problem/4855)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 143, 정답: 81, 맞힌 사람: 59, 정답 비율: 54.630%

### 분류

수학, 구현, 문자열, 사칙연산, 파싱

### 문제 설명

<p>Given the tire descriptor typically found on the sidewall of a passenger or light truck tire, you will calculate the tire&#39;s overall circumference. Each line of the sample input contains an example of a tire descriptor. The following diagram illustrates some of the terminology:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/4855.%E2%80%85Tire%E2%80%85Dimensions/ba2b7822.gif" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/4855.%E2%80%85Tire%E2%80%85Dimensions/ba2b7822.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4855/definitions.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:358px; width:367px" /></p>

<p>The tire descriptor contains the following items of information:</p>

<ol>
	<li>One or two upper case letters to specify the type of tire. For our purposes, the tire types are &quot;P&quot; (passenger), &quot;LT&quot; (light truck), and &quot;T&quot; (temporary spare tire).</li>
	<li>The&nbsp;<em>section width</em>&nbsp;(of an inflated tire) in millimeters. This number is followed by a slash.</li>
	<li>The ratio of the section height to the section width, expressed as a percentage. For example, the ratio 75 means that the section height of an inflated tire is 75% of its section width.</li>
	<li>Information about the&nbsp;<em>construction</em>&nbsp;of the tire (one upper-case letter), optionally preceded by the&nbsp;<em>speed symbol</em>&nbsp;(also one upper-case letter). In the first, second, and fourth lines of the sample output, the tire construction is specified by &quot;R&quot;, which means &quot;radial&quot;. In the third line, it is &quot;D&quot;, which means &quot;diagonal&quot;. In the second line, &quot;R&quot; is preceded by the optional speed symbol &quot;H&quot;.</li>
	<li>The nominal rim diameter in inches. It is called &quot;nominal&quot; because it does not include the rim&#39;s flanges.</li>
</ol>

<p>The&nbsp;<em>overall circumference</em>&nbsp;(the goal of your calculations) is based on the&nbsp;<em>overall diameter</em>, which is the diameter of an inflated tire at the outermost surface of the tread.</p>

### 입력

<p>The input will consist of one or more lines, terminated by end-of-file. Each line of the input will contain one tire descriptor, as discussed in the preceding paragraphs. All numerical quantities will be positive integers. Exactly one blank space will separate consecutive items (including the slash) on the input line.</p>

### 출력

<p>For each line of input, the program will produce exactly one line of output, consisting of: the input line, followed by a colon, one blank space, and the overall circumference, expressed in centimeters, rounded to the nearest integer. Note that 1 centimeter equals 10 millimeters, and 1 inch equals 2.54 centimeters.</p>
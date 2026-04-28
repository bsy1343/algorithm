# [Gold IV] Rounding - 17558

[문제 링크](https://www.acmicpc.net/problem/17558)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 80, 정답: 48, 맞힌 사람: 47, 정답 비율: 64.384%

### 분류

수학

### 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/5abaa502-572c-4bf9-8f46-14edf7ca0d27/-/preview/" style="width: 346px; height: 298px;" /></p>

<p>You decided to stay an extra day in Paris visiting favorite places of Parisians around T&eacute;l&eacute;com ParisTech. You want to collect information about these favorite places, but asking people to fill in surveys is less fun than coding. For this reason, you asked the Parisian Agency for Really Imprecise Surveys to do it for you. You sent them a list of the P places you were interested in.</p>

<p>After surveying exactly 10 000 persons and asking them their favorite place (among these P places), the agency has just sent you the results. All persons surveyed answered the question. Unfortunately, the agency rounded the percentage results to the nearest integer, using the following formula: result = original_value + 1/2. In particular, decimal values of .50 are rounded up.</p>

<p>But since 10 000 persons were surveyed, you should have been able to get percentage values precise to the second decimal. What a loss of precision! You want to know the range in which each original result could be.</p>

### 입력

<p>The input comprises several lines:</p>

<ul>
	<li>The first line consists of an integer P.</li>
	<li>Each of the following P lines consists of the name of a place followed by an integer i, separated with a single space.</li>
</ul>

### 출력

<p>If the results given by the agency are not consistent, print a single line with the word IMPOSSIBLE. Otherwise the output should consist of P lines, each of them should consist of the name of a place followed by a single space and two numbers, the smallest and the largest percentage values that place could have had in the original results, as floating-point numbers with two decimals separated with a&nbsp;single space (each number must have at least one digit before the decimal point, even if it is 0, and exactly 2 decimals, even if the trailing ones are 0). The places must be in the same order as in the input.</p>

### 제한

<ul>
	<li>1 &le; P &le; 10 000;</li>
	<li>the name of a place is a string of between 1 and 20 characters among Latin alphabet letters (&lsquo;A&rsquo; to &lsquo;Z&rsquo; and &lsquo;a&rsquo; to &lsquo;z&rsquo;) and the underscore character (&lsquo;_&rsquo;);</li>
	<li>no two names are the same;</li>
	<li>0 &le; i &le; 100.</li>
</ul>
# [Silver III] “Ancient” Calculator - 4492

[문제 링크](https://www.acmicpc.net/problem/4492)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 49, 정답: 20, 맞힌 사람: 17, 정답 비율: 40.476%

### 분류

수학, 구현, 브루트포스 알고리즘

### 문제 설명

<p>While travelling through the wilderness on Earth (and discussing the concept of a &lsquo;Zeroeth&rsquo; Robotic Law), R. Daneel Olivaw and R. Giskard Reventlov happened upon a small device protruding from the ground. After some initial analysis, the two robots determine it is an ancient calculating device. More specifically, it appears to be a four function calculator. Unfortunately the display is covered with centuries of debris which appears difficult to remove. Amazingly, the calculator still functions, but of course you can&rsquo;t see the results. This calculator has a display constructed from seven-segment LEDs, as shown here:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/4492.%E2%80%85%E2%80%9CAncient%E2%80%9D%E2%80%85Calculator/0b261151.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4492/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:262px; width:648px" /></p>

<p>This particular calculator only displays three digits of accuracy. There are three seven segment digits, and there are no decimal points since all math is performed using integers (with truncation where appropriate).</p>

<p>If the number on the display happens to be negative, there is a minus sign in front of the number. For a number such as -6, this is done buy making the right-most digit a &ldquo;6&rdquo; and using the middle segment of the next digit over as the minus sign. For a number such as -123, there is one additional segment to the left of the display. Thus, the number -112 lights up 10 segments, made up of 9 for the number, and one more for the minus sign. The display thus ranges from &ldquo;-999&rdquo; to &ldquo;999&rdquo;. There is no &ldquo;plus sign&rdquo; for positive numbers.</p>

<p>In order to prove that the calculator still operates, and justify scraping off the paint, the back cover is removed and an ammeter is attached to the display. An ammeter measures the current consumed by the device, and each segment of a digit consumes 5 milliamps per segment. Thus, to display a number such as &ldquo;798&rdquo; the current consumption can be predicted as follows:</p>

<ul>
	<li>Digit 7 &ndash; 3 segments lit = 15 milliamps</li>
	<li>Digit 9 &ndash; 6 segments lit = 30 milliamps</li>
	<li>Digit 8 &ndash; 7 segments lit = 35 milliamps</li>
	<li>Total = 80 milliamps</li>
</ul>

<p>Of course, it&rsquo;s apparent that the number &ldquo;897&rdquo; also consumes the same amount of current, as does &ldquo;789&rdquo; or, for that matter, &ldquo;-891&rdquo;.</p>

<p>The calculator allows you to enter numbers with an optional minus sign and up to three digits, and to either add, subtract, multiply, or divide the numbers. Daneel wishes to prove that the functionality of the calculator is intact, so he enters &ldquo;949&rdquo; and measures 80 milliamps. Then he pushes the subtract key. Next he enters &ldquo;51&rdquo; and measures 35 milliamps. After pressing the &ldquo;=&rdquo; key the result should be &ldquo;898&rdquo;, measuring 100 milliamps. As a second example, he enters &ldquo;-5&rdquo;, then pushes the addition key. He then enters &ldquo;-4&rdquo; and presses equal. The answer is &ldquo;-9&rdquo;; the measurements were 30 milliamps, 25 milliamps, and 35 milliamps respectively.</p>

<p>Giskard is unsure of this result, so he presents Daneel with the following problem: given the current consumption (milliamps) of operand X, operand Y, and result Z, and given unknown operation Op, determine all possible values for X Op Y = Z, assuming that possible solutions exist. If no such solutions exist, report it as shown in the <strong><u>Sample Output</u></strong> section.</p>

<p>The calculator has only three digits on the display, and neither Giskard nor Daneel are sure what it will do if the result of an expression is outside the range of -999 to 999. Thus, they will not consider such expressions as possible solutions.</p>

### 입력

<p>There will be multiple cases. Each input line except the last contains three integer values between 0 and 999, inclusive, each separated by a space, which are the X, Y, and Z values for a single case. Each number is in milliamps according to the above description. The last line will contain the single value 0, indicating the end of the problem set.</p>

### 출력

<p>Note that no leading zeros should be considered &ndash; the number &ldquo;12&rdquo; for example, is never entered on the calculator as &ldquo;012&rdquo; even though the result of the calculation may be the same. Thus, no expression should contain numbers with leading zeros, either as input or as result. For each case, find all possible expressions and report how many there are in a grammatically correct form, as shown below, as well as echoing back the input.</p>

### 힌트

<p>An example is as shown above; for inputs 80, 35, 100 one result is &ldquo;925 &ndash; 117 = 808&rdquo;. Some input combinations have no result. For the inputs 35, 10, 10 there is no expression that matches those readings. For any given input set, the program should determine all of the valid expressions and print the number of expressions found.</p>
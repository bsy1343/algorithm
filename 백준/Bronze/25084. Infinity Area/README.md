# [Bronze III] Infinity Area - 25084

[문제 링크](https://www.acmicpc.net/problem/25084)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 590, 정답: 323, 맞힌 사람: 261, 정답 비율: 56.863%

### 분류

수학, 구현, 기하학, 시뮬레이션

### 문제 설명

<p>Let us assume for the simplicity of this problem that the Infinity symbol is made of circles which touch externally at point $S$ as shown below, and let us call it the center of the infinity.</p>

<p>You are given three integers $R$, $A$, $B$. You are currently at the center of the infinity. You will first start drawing the right circle with radius $R$ and reach again the center of infinity. After that, you start drawing the left circle with the radius equal to the radius of last circle multiplied by $A$. After reaching the center of the infinity you again start drawing the right circle with radius equal to the radius of last circle divided by $B$ (<a href="https://mathworld.wolfram.com/IntegerDivision.html" target="_blank">integer divison</a>). After reaching the center of infinity you again draw the left circle with the radius equal to the radius of last circle multiplied by $A$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/25084.%E2%80%85Infinity%E2%80%85Area/10eba945.png" data-original-src="https://upload.acmicpc.net/d63c5c71-2fa2-4e3b-88e3-cf4b5d306282/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 288px;" /></p>

<p>You continue to draw the left and right circles as described above until the radius of the circle to be drawn becomes zero. Calculate the sum of areas of all the circles drawn. It is guaranteed that the process will terminate after finite number of steps.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$. $T$ lines follow.</p>

<p>Each line represents a test case and contains three integers $R$, $A$, $B$, where $R$ denotes the radius of the first circle, and $A$ and $B$ are the parameters used to calculate the radii of the subsequent circles.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the sum of areas of all the circles drawn until radius of the circle to be drawn becomes zero.</p>

<p>$y$ will be considered correct if it is within an absolute or relative error of $10^{-6}$ of the correct answer.</p>

### 힌트

<p>In Sample Case #1, you start with drawing the right circle with radius $1$ unit. After reaching the center of infinity you draw the left circle with radius $1&times;3=3$ units. Again after reaching the center of infinity you stop drawing the right circle since the radius becomes $&lfloor;3/6&rfloor;=0$ units. Therefore the sum of areas of the circles drawn is $&pi;&times;1&times;1+&pi;&times;3&times;3&asymp;31.415927$.</p>

<p>In Sample Case #2, you start with drawing the right circle with radius $5$ units. After reaching the center of infinity you draw the left circle with radius $5&times;2=10$ units. After reaching the center of infinity you draw the right circle with radius $&lfloor;10/5&rfloor;=2$ units. After reaching the center of infinity you draw the left circle with radius $2&times;2=4$ units. After reaching the center of infinity, you stop drawing since the radius of next circle becomes $&lfloor;4/5&rfloor;=0$ units. Therefore the sum of areas of the circles drawn is $&pi;&times;5&times;5+&pi;&times;10&times;10+&pi;&times;2&times;2+&pi;&times;4&times;4&asymp;455.530935$.</p>
# [Gold II] Lucky Dip - 23954

[문제 링크](https://www.acmicpc.net/problem/23954)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 10, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

수학, 이분 탐색, 확률론

### 문제 설명

<p>You are participating in the Grand Kickstart Lucky Dip with many fantastic and amazing prizes (and some not so good ones)!</p>

<p>In this Lucky Dip, there is a bag with&nbsp;<b>N</b>&nbsp;items. The i-th item in the bag has value&nbsp;<b>V<sub>i</sub></b>. You will put your hand into the bag and draw one item at random; all items in the bag have an equal probability of being chosen. The organizers want contestants to feel that they have some element of choice, so after you draw an item, you can either keep it, or &quot;redip&quot; by returning it to the bag and drawing again. (Note that the returned item is now just as likely to be chosen as any of the other items in the bag.) You may only redip a maximum of&nbsp;<b>K</b>&nbsp;times. If you use&nbsp;<b>K</b>&nbsp;redips, you must keep the item that you draw on your (<b>K</b>&nbsp;+ 1)-th draw.</p>

<p>If you play optimally to maximize the value of the item you will end the game with, what is the&nbsp;<a href="https://en.wikipedia.org/wiki/Expected_value">expected value</a>&nbsp;of that item?</p>

### 입력

<p>The input starts with one line containing one integer&nbsp;<b>T</b>: the number of test cases.&nbsp;<b>T</b>&nbsp;test cases follow.</p>

<p>Each test case consists of two lines. The first line consists of two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>K</b>: the number of items in the bag, and the maximum number of times you may redip. The second line consists of&nbsp;<b>N</b>&nbsp;integers&nbsp;<b>V<sub>i</sub></b>, each representing the value of the i-th item.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the expected value described above. Your answer will be considered correct if it is within an absolute or relative error of 10<sup>-6</sup>&nbsp;of the correct answer.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>V<sub>i</sub></b>&nbsp;&le; 10<sup>9</sup>.</li>
	<li>1 &le;&nbsp;<b>N</b>&nbsp;&le; 2 * 10<sup>4</sup>.</li>
</ul>

### 힌트

<p>In Sample Case #1, you cannot redip, so the expected value is just the mean of the items in the bag which is (1 + 2 + 3 + 4) / 4 = 2.5.</p>

<p>In Sample Case #2, the best strategy is to keep the item of value 10 if you get it, and redip otherwise. The chance of getting that item (on either the first or second draw) is 1 - (2/3)<sup>2</sup>&nbsp;= 5/9, hence the expected value is (5/9 * 10) + (4/9 * 1) = 6.</p>

<p>In Sample Case #3, since all the items have the same value, it does not matter how many times you redip and hence the expected value is 80000.</p>

<p>Note that cases #3 and #5 would not appear in the Small dataset.</p>
# [Platinum IV] Broken Clock - 22893

[문제 링크](https://www.acmicpc.net/problem/22893)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 42, 정답: 19, 맞힌 사람: 18, 정답 비율: 46.154%

### 분류

수학, 구현, 브루트포스 알고리즘, 정수론, 확장 유클리드 호제법

### 문제 설명

<p>Emmett found an old clock in his attic. The clock is a circle with 3 hands that attach to the center and rotate clockwise at constant speeds. They are called the&nbsp;<i>hours hand</i>, the&nbsp;<i>minutes hand</i>&nbsp;and the&nbsp;<i>seconds hand</i>. At midnight, all hands point up. The hours hand completes a full revolution in&nbsp;12&nbsp;hours, the minutes hand completes a full revolution in&nbsp;1&nbsp;hour, and the seconds hand completes a full revolution in&nbsp;1&nbsp;minute.&nbsp;1&nbsp;hour is equal to&nbsp;60&nbsp;minutes, 1&nbsp;minute is equal to&nbsp;60&nbsp;seconds, and&nbsp;1 second is equal to&nbsp;10<sup>9</sup>&nbsp;nanoseconds.</p>

<p>For example, the clock depicted below is showing that the time is exactly 6 hours and 30 minutes after midnight. The hours hand (short black) is halfway between 6 and 7 (completed 6.5/12 of a revolution), the minutes hand (long black) is pointing straight down because it has completed exactly 6 and a half full revolutions and the seconds hand (red) is pointing straight up because it has completed an integer number of full revolutions.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22893.%E2%80%85Broken%E2%80%85Clock/e3ce5e13.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22893.%E2%80%85Broken%E2%80%85Clock/e3ce5e13.png" data-original-src="https://upload.acmicpc.net/65a83c0c-29f9-4a79-8b47-9792190b5a4a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 200px;" /></p>

<p>Unfortunately, the hands are broken, so they all look identical and there is no way to know which hand is which. The clock in the picture above, with its hands broken, would look like this.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22893.%E2%80%85Broken%E2%80%85Clock/a626bc82.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22893.%E2%80%85Broken%E2%80%85Clock/a626bc82.png" data-original-src="https://upload.acmicpc.net/4e5f7753-41c2-41a4-819d-9f5947e2cbb2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 200px;" /></p>

<p>In addition, no markings remain that allow Emmett to know which way is up, so any rotation of the clock could be the correct one (the clock can only be rotated, not reflected). To continue with our example, the fully broken clock could look like this.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22893.%E2%80%85Broken%E2%80%85Clock/7f7d9119.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22893.%E2%80%85Broken%E2%80%85Clock/7f7d9119.png" data-original-src="https://upload.acmicpc.net/d257466c-30a0-406a-b653-a5caa9f13b9d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 200px;" /></p>

<p>Emmett does know that the time was strictly before noon, that is, strictly less than 12 hours after midnight. Emmett has taken a picture of the clock. Given that picture (represented by the angles of the hands relative to a single arbitrary axis), figure out what time it could correspond to.</p>

<p>Notice that Emmett has already figured out a viable orientation of the clock in some cases (Test Set 1) and has managed to narrow down the possible times to a whole integer number of seconds (Test Sets 1 and 2) or nanoseconds (Test Set 3). Please see the limits sections for more details.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T. T&nbsp;lines follow. Each line describes a test case and contains three integers&nbsp;A,&nbsp;B, and&nbsp;C: the angles of each hand, relative to an arbitrary axis and given in ticks in the clockwise direction.&nbsp;1&nbsp;<i>tick</i>&nbsp;is equal to&nbsp;1/12&times;10<sup>&minus;10</sup> degrees. This means that the hours hand rotates exactly&nbsp;1&nbsp;tick each nanosecond, the minutes hand rotates exactly&nbsp;12&nbsp;ticks each nanosecond and the seconds hand rotates exactly&nbsp;720&nbsp;ticks each nanosecond.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;h m&nbsp;s n</code>, where x&nbsp;is the test case number (starting from 1) and&nbsp;h, m, s, and n&nbsp;are integers: h&nbsp;is the number of full hours since midnight (between&nbsp;0&nbsp;and&nbsp;11, inclusive),&nbsp;m&nbsp;is the number of full minutes since the last full hour (between&nbsp;0&nbsp;and&nbsp;59, inclusive),&nbsp;s&nbsp;is the number of full seconds since the last full minute (between&nbsp;0&nbsp;and&nbsp;59, inclusive) and&nbsp;n&nbsp;is the number of full nanoseconds since the last full second (between&nbsp;0&nbsp;and 10<sup>9</sup>&minus;1, inclusive).</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>0 &le; A &le; B &le; C &lt; 360&times;12&times;10<sup>10</sup>.</li>
</ul>
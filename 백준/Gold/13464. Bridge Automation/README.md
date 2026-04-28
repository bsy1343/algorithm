# [Gold I] Bridge Automation - 13464

[문제 링크](https://www.acmicpc.net/problem/13464)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 92, 정답: 57, 맞힌 사람: 51, 정답 비율: 62.195%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>In Delft there are a number of bridges that are still being operated&nbsp;by a human, known as the bridge operator. One such bridge<br />
operator will soon retire, hence there is the need for a replacement.&nbsp;The Bridge And Poker Committee has decided to use a computer<br />
program to automatically open and close the bridge, eliminating&nbsp;the need for human interaction.</p>

<p>However, the computer program still needs to be written. The requirements for this project&nbsp;are as follows:</p>

<ol>
	<li>No boat may be forced to wait for more than 30 minutes.</li>
	<li>The amount of time during which the bridge is unavailable to road traffic must be as&nbsp;small as possible while still satisfying requirement 1.</li>
</ol>

<p>It takes 60 seconds to raise or lower the bridge. During this time the bridge is not available&nbsp;to either road traffic or water traffic.</p>

<p>Boats arrive at the bridge at predictable times. It takes 20 seconds for a boat to sail through&nbsp;the bridge, assuming the bridge is already fully raised.</p>

<p>If the bridge is not fully raised when a boat arrives, the boat must wait. If there are boats&nbsp;waiting when the bridge becomes fully raised, these boats pass through the bridge one-by-one,&nbsp;which takes 20 seconds per boat. The bridge must remain fully raised as long as there are<br />
still boats sailing through! As soon as all boats have passed, the bridge may be lowered. But&nbsp;it might be more efficient to keep the bridge raised for a little while longer if the next boat is&nbsp;soon to arrive.</p>

<p>Given the arrival times of all boats, operate the bridge such that all boats can pass through&nbsp;without any boat waiting longer than 30 minutes. What is the total amount of time during&nbsp;which the bridge is unavailable to road traffic?</p>

### 입력

<p>The first line contains an integer N, the number of boats that must pass the bridge&nbsp;(1 &le; N &le; 4 000).</p>

<p>Then follow N lines, each containing an integer T<sub>i</sub>, the time at which boat i will arrive at the&nbsp;bridge in seconds (60 &le; T<sub>i</sub> &le; 10<sup>5</sup>).</p>

<p>Boats are sorted by increasing time of arrival, and never arrive within 20 seconds of each&nbsp;other (i &lt; j implies T<sub>i</sub> + 20 &le; T<sub>j</sub> ).</p>

### 출력

<p>Write one line with an integer, the total number of seconds during which the bridge must be&nbsp;unavailable for road traffic in order for all boats to pass the bridge.</p>
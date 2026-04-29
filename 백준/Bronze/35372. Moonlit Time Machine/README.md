# [Bronze I] Moonlit Time Machine - 35372

[문제 링크](https://www.acmicpc.net/problem/35372)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 50, 정답: 33, 맞힌 사람: 24, 정답 비율: 60.000%

### 분류

구현, 브루트포스 알고리즘, 사칙연산, 수학

### 문제 설명

<p>After decades of research in alchemy and magic, you have finally created your magnum opus – a room that, when bathed in the glow of the moon, sends you several days into the future. You have given this room a very classy name: the <i>Moonlit Time Machine</i>.</p>

<p>Whenever you use the time machine, you are projected forward some number of days. You don’t know the number, but you know that it is between $1$ and $28$ (inclusive), and that the number is always the same every time you use the machine. As an alchemist, you wish to find out this number! While there is no technology to tell you the date, you can look at the moon’s cycle. You know that every $28$ days, the moon cycles through a list of phases, as defined below:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/35372.%E2%80%85Moonlit%E2%80%85Time%E2%80%85Machine/fa3221cd.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35372-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 97px;"></p>

<table class="table table-bordered td-center th-center table-center-20">
<tbody>
<tr>
<td>Day(s)</td>
<td>Phase</td>
</tr>
<tr>
<td>0</td>
<td>New</td>
</tr>
<tr>
<td>1 to 4</td>
<td>Crescent</td>
</tr>
<tr>
<td>5 to 8</td>
<td>Quarter</td>
</tr>
<tr>
<td>9 to 13</td>
<td>Gibbous</td>
</tr>
<tr>
<td>14</td>
<td>Full</td>
</tr>
<tr>
<td>15 to 19</td>
<td>Gibbous</td>
</tr>
<tr>
<td>20 to 22</td>
<td>Quarter</td>
</tr>
<tr>
<td>23 to 27</td>
<td>Crescent</td>
</tr>
</tbody>
</table>

<p>To figure out this number of days, you wait until you see a new moon, then use the time machine several times, recording the moon’s phase after each use. Given your observations, can you determine a possible number of days that the Moonlit Time Machine sends you forward each time?</p>

### 입력

<p>The first line of input contains a single integer $n$ ($3 \le n \le 100$), the number of observations you have made.</p>

<p>Each of the next $n$ lines contains a single string describing an observed phase of the moon. Each string is one of <code>New</code>, <code>Crescent</code>, <code>Quarter</code>, <code>Gibbous</code>, or <code>Full</code>, with its first letter capitalized and the remaining letters lowercase. It is guaranteed that these are valid observed phases of the moon after using your time machine.</p>

### 출력

<p>Output a single integer, the number of days the Moonlit Time Machine sends you into the future with each use. If there are multiple answers, output the smallest one. It is guaranteed that at least one valid answer exists.</p>
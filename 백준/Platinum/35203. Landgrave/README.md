# [Platinum II] Landgrave - 35203

[문제 링크](https://www.acmicpc.net/problem/35203)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 1, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

그리디 알고리즘, 기하학, 볼록 껍질

### 문제 설명

<p>Congratulations on your new title of Landgrave, along with the generous stretch of land that accompanies it. Your predecessor was certainly industrious -- he scattered towers across the region like seeds in a field -- yet somehow never managed to assemble even one proper castle.</p>

<p>You will immediately remedy this oversight, for your fiefdom needs a castle to which the population can retreat in times of strife. To make a castle, you construct a cycle from some of the existing towers, connecting them with straight walls to enclose a region.</p>

<p>What makes the task difficult are the mysterious rules of the Builders' Guild, in particular, the arcane Bylaws of Acuteness Prevention in Castles. These rules decree that wherever two walls meet, they must form an <strong>interior</strong> angle of at least $90$ degrees. Also, the walls must enclose a single connected region.</p>

<p>Given the locations of the towers, decide where the walls should go. It does not matter how many of the existing towers you use, how large the resulting castle is, or how many bricks you use. All you need is a single polygonal castle from which to defend your lands.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35203.%E2%80%85Landgrave/69f65e86.svg" data-original-src="https://boja.mercury.kr/assets/problem/35203-1.svg" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p style="text-align: center;">Figure L.1: Illustration of the third sample input, with one of the multiple possible ways to construct a castle.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($3\leq n\leq 3000$), the number of towers.</li>
<li>$n$ lines, each with two integers $x$ and $y$ ($|x|, |y| \leq 10^{9}$), the coordinates of the towers.</li>
</ul>

<p>No two towers have the same coordinates.</p>

### 출력

<p>If it is possible to build a castle, output the number of towers used, followed by a list of (1-based) indices of the towers in either clockwise or counter-clockwise order. Otherwise, output "<code>impossible</code>".</p>

<p>If a tower $t$ is located on a wall between two other towers, including $t$ in the output is optional.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>
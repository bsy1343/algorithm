# [Gold V] Ample Syrup (Large) - 14810

[문제 링크](https://www.acmicpc.net/problem/14810)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 183, 정답: 83, 맞힌 사람: 76, 정답 비율: 58.462%

### 분류

그리디 알고리즘, 정렬, 기하학

### 문제 설명

<p>The kitchen at the Infinite House of Pancakes has just received an order for a stack of&nbsp;<strong>K</strong>pancakes! The chef currently has&nbsp;<strong>N</strong>&nbsp;pancakes available, where&nbsp;<strong>N</strong>&nbsp;&ge;&nbsp;<strong>K</strong>. Each pancake is a cylinder, and different pancakes may have different radii and heights.</p>

<p>As the sous-chef, you must choose&nbsp;<strong>K</strong>&nbsp;out of the&nbsp;<strong>N</strong>&nbsp;available pancakes, discard the others, and arrange those&nbsp;<strong>K</strong>&nbsp;pancakes in a stack on a plate as follows. First, take the pancake that has the largest radius, and lay it on the plate on one of its circular faces. (If multiple pancakes have the same radius, you can use any of them.) Then, take the remaining pancake with the next largest radius and lay it on top of that pancake, and so on, until all&nbsp;<strong>K</strong>&nbsp;pancakes are in the stack and the centers of the circular faces are aligned in a line perpendicular to the plate, as illustrated by this example:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14810.%E2%80%85Ample%E2%80%85Syrup%E2%80%85(Large)/35b34840.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14809/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:136px; width:320px" /></p>

<p>You know that there is only one thing your diners love as much as they love pancakes: syrup! It is best to maximize the total amount of exposed pancake surface area in the stack, since more exposed pancake surface area means more places to pour on delicious syrup. Any part of a pancake that is not touching part of another pancake or the plate is considered to be exposed.</p>

<p>If you choose the&nbsp;<strong>K</strong>&nbsp;pancakes optimally, what is the largest total exposed pancake surface area you can achieve?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each begins with one line with two integers&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>K</strong>: the total number of available pancakes, and the size of the stack that the diner has ordered. Then,&nbsp;<strong>N</strong>&nbsp;more lines follow. Each contains two integers&nbsp;<strong>R<sub>i</sub></strong>&nbsp;and&nbsp;<strong>H<sub>i</sub></strong>: the radius and height of the i-th pancake, in millimeters.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>K</strong>&nbsp;&le;&nbsp;<strong>N</strong>.</li>
	<li>1 &le;&nbsp;<strong>R<sub>i</sub></strong>&nbsp;&le; 10<sup>6</sup>, for all i.</li>
	<li>1 &le;&nbsp;<strong>H<sub>i</sub></strong>&nbsp;&le; 10<sup>6</sup>, for all i.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 1000.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximum possible total exposed pancake surface area, in millimeters squared.&nbsp;<code>y</code>&nbsp;will be considered correct if it is within an absolute or relative error of 10<sup>-6</sup>&nbsp;of the correct answer.</p>

### 힌트

<p>In Sample Case #1, the &quot;stack&quot; consists only of one pancake. A stack of just the first pancake would have an exposed area of &pi; &times;&nbsp;<strong>R<sub>0</sub></strong><sup>2</sup>&nbsp;+ 2 &times; &pi; *&nbsp;<strong>R<sub>0</sub></strong>&nbsp;&times;&nbsp;<strong>H<sub>0</sub></strong>&nbsp;= 14000&pi; mm<sup>2</sup>. A stack of just the second pancake would have an exposed area of 44000&pi; mm<sup>2</sup>. So it is better to use the second pancake.</p>

<p>In Sample Case #2, we can use both of the same pancakes from case #1. The first pancake contributes its top area and its side, for a total of 14000&pi; mm<sup>2</sup>. The second pancake contributes some of its top area (the part not covered by the first pancake) and its side, for a total of 34000&pi; mm<sup>2</sup>. The combined exposed surface area is 48000&pi; mm<sup>2</sup>.</p>

<p>In Sample Case #3, all of the pancakes have radius 100 and height 10. If we stack two of these together, we effectively have a single new cylinder of radius 100 and height 20. The exposed surface area is 14000&pi; mm<sup>2</sup>.</p>

<p>In Sample Case #4, the optimal stack uses the pancakes with radii of 8 and 9.</p>
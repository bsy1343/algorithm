# [Platinum V] Strange Dream - 5266

[문제 링크](https://www.acmicpc.net/problem/5266)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 5, 맞힌 사람: 5, 정답 비율: 45.455%

### 분류

수학, 다이나믹 프로그래밍, 정수론

### 문제 설명

<p>Dumitru had a very strange dream: he dreamed that he was in a room having its door locked. There he found n boxes each containing exactly m small plates, on each plate being written an integer number greater or equal to 1. He also found a small note containing 2 integer numbers k and l, and specifying the following task:</p>

<ul>
	<li>Step 1: Pick one plate from the first box, write its number in your notebook, change the number on the plate to 1, and put the plate back into the box. Subsequently, in the same way, pick a single plate from the second box, then one from the third box, and so on till the n-th (last) box, inclusive, each time picking a plate from the respective box, writing its number in your notebook, changing the number on that plate to 1 and then placing the plate back into that box.</li>
	<li>Step 2: After this, in the same manner, pick a single plate from the box n &ndash; 1, then one from box n &ndash; 2, then one from box n &ndash; 3, and so on till the second box, inclusive, each time picking a plate from the respective box.</li>
</ul>

<p>To unlock the door of the room and to get out, Dumitru needed to find the number T of different ways of picking plates according to the above scenario, such that the product of the numbers that were written in your notebook is divisible by k. Because T could be extremely large, he needed to return the remainder of T when divided by l.</p>

<p>Dumitru is very confused about this dream and so he tries to find the answer to the above task.</p>

<p>Write a program which will help Dumitru to solve the task.</p>

### 입력

<p>Input contains 2 integer numbers on the first line: n and m, separated by a single space. Second line contains 2 integer numbers k and l separated by a single space. Then n lines follow, each containing m integer numbers separated by single spaces. The first of these lines contains the m numbers written on the plates found in the first box, the second of these lines contains the numbers written on the plates found in the second box, and so on.</p>

### 출력

<p>Output will contain one integer number that is the remainder of T when divided by l.</p>

### 제한

<ul>
	<li>3 &le; n &le; 200</li>
	<li>3 &le; m &le; 10 000</li>
	<li>2 &le; k &le; 200 000</li>
	<li>2 &le; l &le; 30 000</li>
	<li>Numbers on the plates in boxes have integer values between 1 and 1 000 000 inclusive.&nbsp;</li>
</ul>

### 힌트

<p>According to the steps described in the task, there are 12 different ways of picking the plates such that the product of numbers written in your notebook is divisible by 12. All 12 ways are shown below, where the numbers of the plates picked in Step 1 are underlined with a single straight line, the numbers of plates picked in Step 2 are underlined with two straight lines, and the numbers of plates picked in both steps are underlined with a curved line.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5266.%E2%80%85Strange%E2%80%85Dream/c41066f5.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5266.%E2%80%85Strange%E2%80%85Dream/c41066f5.png" data-original-src="https://upload.acmicpc.net/fa0920a4-6bfc-4b40-a079-f38dcbc6df89/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 200px; width: 483px;" /></p>

<p>As can be seen, Pic. 1 and Pic. 2 show 2 different ways of picking plates, even if in both cases the same set of plates are picked. In Pic.3 the first plate from the second row is picked in both Step 1 and Step 2, and the product of numbers written in the notebook in this case is thus equal to &nbsp;, because number 2 on the plate picked in both steps is rewritten with 1 after the plate is picked in Step 1, and thus when it&rsquo;s selected again in Step 2 the number written on it is 1.</p>
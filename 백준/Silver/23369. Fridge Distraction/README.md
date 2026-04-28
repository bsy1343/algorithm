# [Silver III] Fridge Distraction - 23369

[문제 링크](https://www.acmicpc.net/problem/23369)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 126, 정답: 78, 맞힌 사람: 72, 정답 비율: 67.925%

### 분류

자료 구조, 그리디 알고리즘, 덱

### 문제 설명

<p>Kevin has an excellent organisation system for his refrigerator: everything is arranged on one long shelf. At the moment, every item is organised in alphabetical order from &quot;a&quot; at the front to &quot;z&quot; at the back.</p>

<p>When Kevin wants to get some item from the refrigerator, he simply pulls out everything in front of it, takes the item out, places all the other items back in their original order, and finally places the used item at the front when he is done. This takes a number of seconds equal to the total number of items taken out of the fridge.</p>

<p>You are planning a surprise birthday party for Kevin in which you and his other friends bought him a normal fridge. You will need to keep him busy for exactly the right amount of time -- and you will do this by repeatedly asking him to take items out of the fridge.</p>

<p>Given the amount of time you need to waste, in seconds, suggest an order of as little items as possible to be taken out, such that Kevin will take exactly this long.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing $n$ ($1 \leq n \leq 26$), the number of items in the refrigerator, and $t$ ($1 \leq t \leq 10000$), the number of seconds you need to waste.</li>
</ul>

### 출력

<p>Output the smallest possible number of items you should ask Kevin to take out of the fridge.</p>

<p>Next output one line containing, in order, the letters of all the items you will ask Kevin to take out of the fridge.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>
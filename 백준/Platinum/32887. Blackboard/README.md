# [Platinum I] Blackboard - 32887

[문제 링크](https://www.acmicpc.net/problem/32887)

### 성능 요약

시간 제한: 6 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 7, 맞힌 사람: 7, 정답 비율: 35.000%

### 분류

그리디 알고리즘, 수학, 스위핑, 자료 구조, 정수론, 트리를 사용한 집합과 맵

### 문제 설명

<p>You find yourself in a room with a blackboard that has $n$ positive integers written on it. You like it when things are organized, but this blackboard is one big mess: the numbers are all over the place, with a mix of very small and very large numbers.</p>

<p>To organize things, you will split the numbers into smaller numbers, one at a time, such that the total sum remains the same. Thus, in one operation, you can choose any value $x$ from the blackboard, erase it, and replace it with two positive <em>real</em> numbers $y$ and $z$ such that $x = y + z$. Your goal is to ensure that the largest value on the blackboard is at most $k$ percent larger than the smallest value.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32887.%E2%80%85Blackboard/32da97d7.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32887-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 268px; height: 100px;"> <img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32887.%E2%80%85Blackboard/59575a39.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32887-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 268px; height: 100px;"> <img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32887.%E2%80%85Blackboard/69350392.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32887-3.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 268px; height: 100px;"> <img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32887.%E2%80%85Blackboard/a673ce0b.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32887-4.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 268px; height: 100px;"></p>

<p style="text-align: center;">Figure B.1: Illustration of Sample Input 1. The $7$ can be replaced by $2.4$ and $4.6$. The $4.6$ can in turn be replaced by $2.6$ and $2$. Finally, the $5$ can be replaced by $2.3$ and $2.7$. After that, the largest value ($3$) is $50\%$ larger than the smallest value ($2$).</p>

<p>Determine the minimum number of operations required to achieve this goal.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $k$ ($1\leq n\leq 10\,000$, $0\leq k\leq 100$), the initial number of integers on the blackboard and the required percentage of maximal difference.</li>
	<li>One line with $n$ integers $a$ ($1\leq a\leq 10^9$), the initial integers on the blackboard.</li>
</ul>

### 출력

<p>Output the minimum number of operations required to ensure that the largest value on the blackboard is at most $k$ percent larger than the smallest value.</p>